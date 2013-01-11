
package ph.belltel.ebm.updatesubscriptionstatusresponse;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ph.belltel.ebm.updatesubscriptionstatusresponse package. 
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

    private final static QName _UpdateSubscriptionStatusResponse_QNAME = new QName("http://www.belltel.ph/ebm/UpdateSubscriptionStatusResponse", "UpdateSubscriptionStatusResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ph.belltel.ebm.updatesubscriptionstatusresponse
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateSubscriptionStatusResponse }
     * 
     */
    public UpdateSubscriptionStatusResponse createUpdateSubscriptionStatusResponse() {
        return new UpdateSubscriptionStatusResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSubscriptionStatusResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.belltel.ph/ebm/UpdateSubscriptionStatusResponse", name = "UpdateSubscriptionStatusResponse")
    public JAXBElement<UpdateSubscriptionStatusResponse> createUpdateSubscriptionStatusResponse(UpdateSubscriptionStatusResponse value) {
        return new JAXBElement<UpdateSubscriptionStatusResponse>(_UpdateSubscriptionStatusResponse_QNAME, UpdateSubscriptionStatusResponse.class, null, value);
    }

}
