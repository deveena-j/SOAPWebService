package ws;

import javax.jws.WebService;

//This class is the combined implementation for Restful & SOAP class which provide web services to REST and SOAP type of connections
//for SOAP
@WebService(endpointInterface = "ws.SOAPserverInterface")

public class Services implements SOAPServerInterface{
	private static Airport airportHandle;
	private static Customer customerHandle;
	private static Reservation reservationHandle;
	public Services(){
		//Get handle of airport from Singleton 
		airportHandle=Singleton.getAirportHandle();
	}
    //this method will add a item to user cart and after finishing return number of items in cart and a message
	// returned xml format:<result><messagetouser>XXXX</messagetouser><totalitem>XX</totalitem></result>

    public String additemtocart(String flightNumber,String seatNumber,String seatType,String userID) {
 
    	int itembefore=0,itemafter=0;
    	String messageToUser="";

    	customerHandle=Singleton.getCustomerhandle(userID);										//get customer handle
    	reservationHandle = Singleton.getReservationHandle(flightNumber,seatNumber);			//get reservation handle in airport
    	if(reservationHandle==null){													//if item not found in airport return message
    		messageToUser="The requested reservation not found in airport while customer trying to reserve seat in the cart";
    	}
    	else{																//else take count of items beforeadding, add item to cart
    		itembefore = customerHandle.getshoppingCart().gettotalItem();				
    		itemafter  = customerHandle.addReservationToMyCart(reservationHandle);

    		if(itembefore==itemafter){								//if item not added because all items of same type is already in user cart
        		messageToUser="Already this item is added in cart, there are no more item of same type in airport";
        	}
        	else{													//else item added sucessfully
        		messageToUser="One item added to cart";
        	}
    	}
    	
    	return messageToUser;
    }
    
    public String removefromcart(String flightNumber,String seatNumber,String seatType,String userID) {

    	String messageToUser="Reservation removed from cart";
    
    	customerHandle=Singleton.getCustomerhandle(userID);								//get customer handle
    	return messageToUser;
    }

    //This method will return list of available seats in Boeing737 
   
    public String BoeingList() {
		
        return airportHandle.showItemList("Boeing737");
    }
  
  //This method will return list of available seats in Airbus319
    public String AirbusList() {
		
        return airportHandle.showItemList("Airbus319");
    }
   
    public String EmbraerList() {
	
        return airportHandle.showItemList("Embraer170");
    }
    
   
    public String viewcart (String userID) {
    
    	customerHandle=Singleton.getCustomerhandle(userID);
        return   customerHandle.viewMyCart() ;

    }
    //this method will remove all items from user cart and delete the flight and seat number combination from airport  
    //and return success or not success(if item bought by another user and no more same type of item available in airport) 
    //message for each item and make total item in cart as 0 by returning 0
   
    @SuppressWarnings("unused")
	public String buyitems(String userID) {
    	
    	String messageToUser="";
    	String sellResponse="";
    	int totalitems=0;
    	//get the list of items from customer cart and call sellReservation to remove item from airport
    	//if item is already sold to another customer send message accordingly
    	//call buyReservations to remove all items from customer cart
    	customerHandle=Singleton.getCustomerhandle(userID);
    	Reservation abc = customerHandle.getshoppingCart().getitemsInCart();
    	String flightNumber = abc.getFlightNumber();
    	String seatNumber = abc.getSeatNumber();
    	if(!(abc==null))
    	{		//if cart is not empty take items from customer cart and sell
    		sellResponse = airportHandle.sellReservation(flightNumber,seatNumber);

    			if(sellResponse.equals("Reservation not in Airport!"))
 				messageToUser="This combination of flight Number and seat is already sold out!"+abc.getFlightNumber()+" "+abc.getSeatNumber();
		
			else{
				messageToUser="<messagetouser>Thanks! Reservation ready for dispatch from airport: "+abc.getFlightNumber()+" "+abc.getSeatNumber();
				}
    			totalitems=customerHandle.buyReservations();				//remove all item from customer cart
    	}
    	else
    	{																	//else send empty cart message
    		messageToUser="<messagetouser>"+"Cart is empty, please add items in cart"+"</messagetouser>";
    	}
    	return  messageToUser;
    	}

}
