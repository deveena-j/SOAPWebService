
package client;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ViewcartResponse_QNAME = new QName("http://ws/", "viewcartResponse");
    private final static QName _AdditemtocartResponse_QNAME = new QName("http://ws/", "additemtocartResponse");
    private final static QName _BuyitemsResponse_QNAME = new QName("http://ws/", "buyitemsResponse");
    private final static QName _BoeingListResponse_QNAME = new QName("http://ws/", "BoeingListResponse");
    private final static QName _Viewcart_QNAME = new QName("http://ws/", "viewcart");
    private final static QName _AirbusListResponse_QNAME = new QName("http://ws/", "AirbusListResponse");
    private final static QName _AirbusList_QNAME = new QName("http://ws/", "AirbusList");
    private final static QName _EmbraerListResponse_QNAME = new QName("http://ws/", "EmbraerListResponse");
    private final static QName _BoeingList_QNAME = new QName("http://ws/", "BoeingList");
    private final static QName _Additemtocart_QNAME = new QName("http://ws/", "additemtocart");
    private final static QName _RemovefromcartResponse_QNAME = new QName("http://ws/", "removefromcartResponse");
    private final static QName _EmbraerList_QNAME = new QName("http://ws/", "EmbraerList");
    private final static QName _Removefromcart_QNAME = new QName("http://ws/", "removefromcart");
    private final static QName _Buyitems_QNAME = new QName("http://ws/", "buyitems");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ViewcartResponse }
     * 
     */
    public ViewcartResponse createViewcartResponse() {
        return new ViewcartResponse();
    }

    /**
     * Create an instance of {@link AdditemtocartResponse }
     * 
     */
    public AdditemtocartResponse createAdditemtocartResponse() {
        return new AdditemtocartResponse();
    }

    /**
     * Create an instance of {@link BuyitemsResponse }
     * 
     */
    public BuyitemsResponse createBuyitemsResponse() {
        return new BuyitemsResponse();
    }

    /**
     * Create an instance of {@link BoeingListResponse }
     * 
     */
    public BoeingListResponse createBoeingListResponse() {
        return new BoeingListResponse();
    }

    /**
     * Create an instance of {@link Viewcart }
     * 
     */
    public Viewcart createViewcart() {
        return new Viewcart();
    }

    /**
     * Create an instance of {@link AirbusListResponse }
     * 
     */
    public AirbusListResponse createAirbusListResponse() {
        return new AirbusListResponse();
    }

    /**
     * Create an instance of {@link AirbusList }
     * 
     */
    public AirbusList createAirbusList() {
        return new AirbusList();
    }

    /**
     * Create an instance of {@link EmbraerListResponse }
     * 
     */
    public EmbraerListResponse createEmbraerListResponse() {
        return new EmbraerListResponse();
    }

    /**
     * Create an instance of {@link BoeingList }
     * 
     */
    public BoeingList createBoeingList() {
        return new BoeingList();
    }

    /**
     * Create an instance of {@link Additemtocart }
     * 
     */
    public Additemtocart createAdditemtocart() {
        return new Additemtocart();
    }

    /**
     * Create an instance of {@link RemovefromcartResponse }
     * 
     */
    public RemovefromcartResponse createRemovefromcartResponse() {
        return new RemovefromcartResponse();
    }

    /**
     * Create an instance of {@link EmbraerList }
     * 
     */
    public EmbraerList createEmbraerList() {
        return new EmbraerList();
    }

    /**
     * Create an instance of {@link Removefromcart }
     * 
     */
    public Removefromcart createRemovefromcart() {
        return new Removefromcart();
    }

    /**
     * Create an instance of {@link Buyitems }
     * 
     */
    public Buyitems createBuyitems() {
        return new Buyitems();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ViewcartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "viewcartResponse")
    public JAXBElement<ViewcartResponse> createViewcartResponse(ViewcartResponse value) {
        return new JAXBElement<ViewcartResponse>(_ViewcartResponse_QNAME, ViewcartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AdditemtocartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "additemtocartResponse")
    public JAXBElement<AdditemtocartResponse> createAdditemtocartResponse(AdditemtocartResponse value) {
        return new JAXBElement<AdditemtocartResponse>(_AdditemtocartResponse_QNAME, AdditemtocartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BuyitemsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buyitemsResponse")
    public JAXBElement<BuyitemsResponse> createBuyitemsResponse(BuyitemsResponse value) {
        return new JAXBElement<BuyitemsResponse>(_BuyitemsResponse_QNAME, BuyitemsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoeingListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "BoeingListResponse")
    public JAXBElement<BoeingListResponse> createBoeingListResponse(BoeingListResponse value) {
        return new JAXBElement<BoeingListResponse>(_BoeingListResponse_QNAME, BoeingListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Viewcart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "viewcart")
    public JAXBElement<Viewcart> createViewcart(Viewcart value) {
        return new JAXBElement<Viewcart>(_Viewcart_QNAME, Viewcart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirbusListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "AirbusListResponse")
    public JAXBElement<AirbusListResponse> createAirbusListResponse(AirbusListResponse value) {
        return new JAXBElement<AirbusListResponse>(_AirbusListResponse_QNAME, AirbusListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AirbusList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "AirbusList")
    public JAXBElement<AirbusList> createAirbusList(AirbusList value) {
        return new JAXBElement<AirbusList>(_AirbusList_QNAME, AirbusList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmbraerListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "EmbraerListResponse")
    public JAXBElement<EmbraerListResponse> createEmbraerListResponse(EmbraerListResponse value) {
        return new JAXBElement<EmbraerListResponse>(_EmbraerListResponse_QNAME, EmbraerListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BoeingList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "BoeingList")
    public JAXBElement<BoeingList> createBoeingList(BoeingList value) {
        return new JAXBElement<BoeingList>(_BoeingList_QNAME, BoeingList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Additemtocart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "additemtocart")
    public JAXBElement<Additemtocart> createAdditemtocart(Additemtocart value) {
        return new JAXBElement<Additemtocart>(_Additemtocart_QNAME, Additemtocart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RemovefromcartResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "removefromcartResponse")
    public JAXBElement<RemovefromcartResponse> createRemovefromcartResponse(RemovefromcartResponse value) {
        return new JAXBElement<RemovefromcartResponse>(_RemovefromcartResponse_QNAME, RemovefromcartResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EmbraerList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "EmbraerList")
    public JAXBElement<EmbraerList> createEmbraerList(EmbraerList value) {
        return new JAXBElement<EmbraerList>(_EmbraerList_QNAME, EmbraerList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Removefromcart }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "removefromcart")
    public JAXBElement<Removefromcart> createRemovefromcart(Removefromcart value) {
        return new JAXBElement<Removefromcart>(_Removefromcart_QNAME, Removefromcart.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Buyitems }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws/", name = "buyitems")
    public JAXBElement<Buyitems> createBuyitems(Buyitems value) {
        return new JAXBElement<Buyitems>(_Buyitems_QNAME, Buyitems.class, null, value);
    }

}
