/**
 * 
 */
package ws;

import java.util.HashMap;
import java.util.Map;
//This item represents item object
public class Airport {

	private Reservation newitem1,newitem2,newitem3,newitem4,newitem5,newitem6,newitem7,newitem8,newitem9,newitem10,newitem11,newitem12,newitem13,
	newitem14,newitem15,newitem16,newitem17,newitem18,newitem19,newitem20,newitem21,newitem22,newitem23;
	private Reservation newitem100,newitem101,newitem102,newitem103;
	private Reservation newitem200,newitem201,newitem202;
	//maps to hold 3 types of items in store
    private static Map<String,Reservation> AirBus319List;
    private static Map<String,Reservation> Boeing737List;
    private static Map<String,Reservation> Embraer170List;
 
	public Airport() {

		AirBus319List  = new HashMap<String,Reservation>();
		Boeing737List  = new HashMap<String,Reservation>();
		Embraer170List  = new HashMap<String,Reservation>();
	}
	
	//This method marks a Reservation in the respective airplane, 
	//if item is not in Airplane returns "Reservation done by someone else" if item sucessfully removed returns "Reservation made in the Airplane" 
	private String makeReservation(String flightNumber,String seatNumber){
		String response="";
		if(flightNumber.equals("Boeing737"))
		{
				if(Boeing737List.containsKey(seatNumber))
				{
					Boeing737List.remove(seatNumber);
						response="Reservation made in the Airplane Boeing - 737";
				}
				else
				{
					response="Reservation done by someone else!";
				}
		}
		else if(flightNumber.equals("Airbus319"))
		{
			if(AirBus319List.containsKey(seatNumber))
			{
					AirBus319List.remove(seatNumber);
					response="eservation made in the Airbus 319";	
			}
			else {
					response="Reservation done by someone else!";
				 }
		}
		else if(flightNumber.equals("Embraer170"))
		{
				if(Embraer170List.containsKey(seatNumber))
				{
						Embraer170List.remove(seatNumber);
						response="Reservation made in flight Embraer 170";
				}
				else
				{
					response="Reservation done by someone else!";
				}
		}
		return response;
	}
	
	//This method checks if item is in store, if yes remove from store and mark it sold
	//if item can be sold returns "Reservation made in the flight XXXX" else returns "Reservation done by someone else!"
	public synchronized String sellReservation(String flightNumber, String seatNumber)
		{
		String sellResponse="Reservation not in Airport";
		if(flightNumber.equals("Airbus319"))
		{					//search smartphone list if list not empty and call removeReservation to remove from store
			if(!AirBus319List.isEmpty())
			{
				for(Map.Entry<String, Reservation> entry : AirBus319List.entrySet())
				{
						if((entry.getValue().getFlightNumber().equals(flightNumber)) &&
					   (entry.getValue().getSeatNumber().equals(seatNumber)))
						{
						sellResponse = makeReservation("Airbus319",entry.getKey());
						break;
						}
				}
			}
		}
		
		else if(flightNumber.equals("Boeing737"))
		{					//search the list of seats in Boeing and if list not empty and call removeReservation to remove from store
			if(!Boeing737List.isEmpty())
			{
				for(Map.Entry<String, Reservation> entry : Boeing737List.entrySet())
				{
						if((entry.getValue().getFlightNumber().equals(flightNumber)) &&
					   (entry.getValue().getSeatNumber().equals(seatNumber)))
						{
						sellResponse = makeReservation("Boeing737",entry.getKey());
						break;
						}
				}
			}
		} 
		
		else if(flightNumber.equals("Embraer170"))
		{					//search the list of seats in Embraer and if list not empty and call removeReservation to remove from store
				if(!Embraer170List.isEmpty())
				{
					for(Map.Entry<String, Reservation> entry : Embraer170List.entrySet())
					{
							if((entry.getValue().getFlightNumber().equals(flightNumber)) &&
						   (entry.getValue().getSeatNumber().equals(seatNumber)))
							{
							sellResponse = makeReservation("Embraer170",entry.getKey());
							break;
							}
					}
				}
			} 
								
		return sellResponse;
	}
	//This method finds a tuple (item type,item make,item model) in store and returns set of items along with item ID
		//it searches corresponding item list and adds matching item in set which will be returned  else returns empty set
		public static Reservation findReservationinStore(String flightNumber,String seatNumber){
			
			Reservation returnItems = new Reservation();

			if(flightNumber.equals("Airbus319")){
				if(!AirBus319List.isEmpty()){
					for(Map.Entry<String, Reservation> entry : AirBus319List.entrySet()){

						if((entry.getValue().getFlightNumber().equals(flightNumber)) &&
						   (entry.getValue().getSeatNumber().equals(seatNumber)))	{
								returnItems=entry.getValue();
						}
					}
				}
			}
			else if(flightNumber.equals("Boeing737")){
				if(!Boeing737List.isEmpty()){
					for(Map.Entry<String, Reservation> entry : Boeing737List.entrySet()){

						if((entry.getValue().getFlightNumber().equals(flightNumber)) &&
						   (entry.getValue().getSeatNumber().equals(seatNumber)))	{
								returnItems=entry.getValue();
						}
					}
				}
			} 
				
			else  if(flightNumber.equals("Boeing737")){
				if(!Boeing737List.isEmpty()){
					for(Map.Entry<String, Reservation> entry : Boeing737List.entrySet()){

						if((entry.getValue().getFlightNumber().equals(flightNumber)) &&
						   (entry.getValue().getSeatNumber().equals(seatNumber)))	{
								returnItems=entry.getValue();
						}
					}
				}
			} 

			return returnItems;
		}
		
		
		//This method returns list of items in store for specific type in XML format
		//if there is no item in list then returns "No Items in List"
		public String showItemList(String flightNumber){
			String Value="";
			String seatNumber="";
			String seatType="";
			String seatPrice="";
			
			
			if(flightNumber.equals("Boeing737")){
				if(!Boeing737List.isEmpty()){
					for(Map.Entry<String, Reservation> entry : Boeing737List.entrySet()){

						seatNumber =" Seat Number: "+entry.getValue().getSeatNumber();
						seatPrice =" Seat Price: "+entry.getValue().getSeatPrice();
						seatType =" Seat Type "+entry.getValue().getSeatType();					
						Value= Value +  seatNumber + seatPrice + seatType;
					}
				}
				else{
						Value= "No Items in List";
				}
			}
			else if (flightNumber.equals("Airbus319")){
				if(!AirBus319List.isEmpty()){
					for(Map.Entry<String, Reservation> entry : AirBus319List.entrySet()){

						seatNumber =" Seat Number: "+entry.getValue().getSeatNumber();
						seatPrice =" Seat Price: "+entry.getValue().getSeatPrice();
						seatType =" Seat Type "+entry.getValue().getSeatType();					
						Value= Value +  seatNumber + seatPrice + seatType;
					}
				}
				else{
						Value= "No Items in List";
				}
			}
			else if (flightNumber.equals("Embraer170")){
				if(!Embraer170List.isEmpty()){
					for(Map.Entry<String, Reservation> entry : Embraer170List.entrySet()){

						seatNumber =" Seat Number: "+entry.getValue().getSeatNumber();
						seatPrice =" Seat Price: "+entry.getValue().getSeatPrice();
						seatType =" Seat Type "+entry.getValue().getSeatType();					
						Value= Value +  seatNumber + seatPrice + seatType;
					}
				}
				else{
						Value= "No Items in List";
				}
			}

			return Value;
		}
		
		
	//This method creates items
	public void createReservation(){
		newitem1 = new Reservation("A01","United-FIrst",50000,"Boeing737");
		newitem2 = new Reservation("B01","United-FIrst",50000,"Boeing737");
		newitem3 = new Reservation("E01","United-FIrst",50000,"Boeing737");
		newitem4 = new Reservation("F01","United-FIrst",50000,"Boeing737");
		newitem5 = new Reservation("A02","United-FIrst",50000,"Boeing737");
		newitem6 = new Reservation("B02","United-FIrst",50000,"Boeing737");
		newitem7 = new Reservation("E02","United-FIrst",50000,"Boeing737");
		newitem8 = new Reservation("F02","United-FIrst",50000,"Boeing737");
		newitem9 = new Reservation("A03","United-FIrst",50000,"Boeing737");
		newitem10 = new Reservation("B03","United-FIrst",50000,"Boeing737");
		newitem11 = new Reservation("E03","United-FIrst",50000,"Boeing737");
		newitem12 = new Reservation("F03","United-FIrst",50000,"Boeing737");
		newitem13 = new Reservation("A04","United-FIrst",50000,"Boeing737");
		newitem14 = new Reservation("B04","United-FIrst",50000,"Boeing737");
		newitem15 = new Reservation("E04","United-FIrst",50000,"Boeing737");
		newitem16 = new Reservation("F04","United-FIrst",50000,"Boeing737");
		newitem17 = new Reservation("A05","United-FIrst",50000,"Boeing737");
		newitem18 = new Reservation("B05","United-FIrst",50000,"Boeing737");
		newitem19 = new Reservation("E05","United-FIrst",50000,"Boeing737");
		newitem20 = new Reservation("F05","United-FIrst",50000,"Boeing737");
		newitem21 = new Reservation("F07","Economy Plus",30000,"Boeing737");
		newitem22 = new Reservation("E07","Economy Plus",30000,"Boeing737");
		newitem23 = new Reservation("D07","Economy Plus",30000,"Boeing737");
		
		newitem100 = new Reservation("A01","United-FIrst",55000,"Airbus319");
		newitem101 = new Reservation("B01","United-FIrst",55000,"Airbus319");
		newitem102= new Reservation("E01","United-FIrst",55000,"Airbus319");
		newitem103 = new Reservation("F01","United-FIrst",55000,"Airbus319");
		
		newitem200 = new Reservation("A01","United-FIrst",55000,"Embraer170");
		newitem201 = new Reservation("C01","United-FIrst",55000,"Embraer170");
		newitem202= new Reservation("D01","United-FIrst",55000,"Embraer170");
		
	}
		
	//This method add items to store
	public void addReservationToList(){
		Boeing737List.put(newitem1.getSeatNumber(), newitem1);
		Boeing737List.put(newitem2.getSeatNumber(), newitem2);
		Boeing737List.put(newitem3.getSeatNumber(), newitem3);
		Boeing737List.put(newitem4.getSeatNumber(), newitem4);
		Boeing737List.put(newitem5.getSeatNumber(), newitem5);
		Boeing737List.put(newitem6.getSeatNumber(), newitem6);
		Boeing737List.put(newitem7.getSeatNumber(), newitem7);
		Boeing737List.put(newitem8.getSeatNumber(), newitem8);
		Boeing737List.put(newitem9.getSeatNumber(), newitem9);
		Boeing737List.put(newitem10.getSeatNumber(), newitem10);
		Boeing737List.put(newitem11.getSeatNumber(), newitem11);
		Boeing737List.put(newitem12.getSeatNumber(), newitem12);
		Boeing737List.put(newitem13.getSeatNumber(), newitem13);
		Boeing737List.put(newitem14.getSeatNumber(), newitem14);
		Boeing737List.put(newitem15.getSeatNumber(), newitem15);
		Boeing737List.put(newitem16.getSeatNumber(), newitem16);
		Boeing737List.put(newitem17.getSeatNumber(), newitem17);
		Boeing737List.put(newitem18.getSeatNumber(), newitem18);
		Boeing737List.put(newitem19.getSeatNumber(), newitem19);
		Boeing737List.put(newitem20.getSeatNumber(), newitem20);
 		Boeing737List.put(newitem21.getSeatNumber(), newitem21);
 		Boeing737List.put(newitem22.getSeatNumber(), newitem22);
 		Boeing737List.put(newitem23.getSeatNumber(), newitem23);
 		AirBus319List.put(newitem100.getSeatNumber(), newitem100);
 		AirBus319List.put(newitem101.getSeatNumber(), newitem101);
 		AirBus319List.put(newitem102.getSeatNumber(), newitem102);
 		AirBus319List.put(newitem103.getSeatNumber(), newitem103);
 		Embraer170List.put(newitem200.getSeatNumber(), newitem200);
		Embraer170List.put(newitem201.getSeatNumber(), newitem201);
		Embraer170List.put(newitem202.getSeatNumber(), newitem202);
		
	}

}
