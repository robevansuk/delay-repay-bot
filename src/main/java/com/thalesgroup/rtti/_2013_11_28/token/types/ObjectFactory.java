
package com.thalesgroup.rtti._2013_11_28.token.types;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.thalesgroup.rtti._2013_11_28.token.types package. 
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

    private final static QName _AccessToken_QNAME = new QName("http://thalesgroup.com/RTTI/2013-11-28/Token/types", "AccessToken");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.thalesgroup.rtti._2013_11_28.token.types
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccessToken }
     * 
     */
    public AccessToken createAccessToken() {
        return new AccessToken();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccessToken }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://thalesgroup.com/RTTI/2013-11-28/Token/types", name = "AccessToken")
    public JAXBElement<AccessToken> createAccessToken(AccessToken value) {
        return new JAXBElement<AccessToken>(_AccessToken_QNAME, AccessToken.class, null, value);
    }

}
