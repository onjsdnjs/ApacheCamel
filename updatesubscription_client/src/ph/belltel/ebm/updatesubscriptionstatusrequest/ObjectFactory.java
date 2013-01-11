
package ph.belltel.ebm.updatesubscriptionstatusrequest;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ph.belltel.ebm.updatesubscriptionstatusrequest package. 
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

    private final static QName _UpdateSubscriptionStatusRequest_QNAME = new QName("http://www.belltel.ph/ebm/UpdateSubscriptionStatusRequest", "UpdateSubscriptionStatusRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ph.belltel.ebm.updatesubscriptionstatusrequest
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UpdateSubscriptionStatusRequest }
     * 
     */
    public UpdateSubscriptionStatusRequest createUpdateSubscriptionStatusRequest() {
        return new UpdateSubscriptionStatusRequest();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateSubscriptionStatusRequest }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.belltel.ph/ebm/UpdateSubscriptionStatusRequest", name = "UpdateSubscriptionStatusRequest")
    public JAXBElement<UpdateSubscriptionStatusRequest> createUpdateSubscriptionStatusRequest(UpdateSubscriptionStatusRequest value) {
        return new JAXBElement<UpdateSubscriptionStatusRequest>(_UpdateSubscriptionStatusRequest_QNAME, UpdateSubscriptionStatusRequest.class, null, value);
    }

}
