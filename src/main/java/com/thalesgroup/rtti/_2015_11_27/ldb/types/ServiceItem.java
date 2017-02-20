
package com.thalesgroup.rtti._2015_11_27.ldb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An individual service's summary details for display on a basic departure board.
 * 
 * <p>Java class for ServiceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ServiceItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2015-11-27/ldb/types}BaseServiceItem">
 *       &lt;sequence>
 *         &lt;element name="origin" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/types}ArrayOfServiceLocations" minOccurs="0"/>
 *         &lt;element name="destination" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/types}ArrayOfServiceLocations" minOccurs="0"/>
 *         &lt;element name="currentOrigins" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/types}ArrayOfServiceLocations" minOccurs="0"/>
 *         &lt;element name="currentDestinations" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/types}ArrayOfServiceLocations" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceItem", propOrder = {
    "origin",
    "destination",
    "currentOrigins",
    "currentDestinations"
})
@XmlSeeAlso({
    ServiceItemWithCallingPoints.class
})
public class ServiceItem
    extends BaseServiceItem
{

    protected ArrayOfServiceLocations origin;
    protected ArrayOfServiceLocations destination;
    protected ArrayOfServiceLocations currentOrigins;
    protected ArrayOfServiceLocations currentDestinations;

    /**
     * Gets the value of the origin property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceLocations }
     *     
     */
    public ArrayOfServiceLocations getOrigin() {
        return origin;
    }

    /**
     * Sets the value of the origin property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceLocations }
     *     
     */
    public void setOrigin(ArrayOfServiceLocations value) {
        this.origin = value;
    }

    /**
     * Gets the value of the destination property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceLocations }
     *     
     */
    public ArrayOfServiceLocations getDestination() {
        return destination;
    }

    /**
     * Sets the value of the destination property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceLocations }
     *     
     */
    public void setDestination(ArrayOfServiceLocations value) {
        this.destination = value;
    }

    /**
     * Gets the value of the currentOrigins property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceLocations }
     *     
     */
    public ArrayOfServiceLocations getCurrentOrigins() {
        return currentOrigins;
    }

    /**
     * Sets the value of the currentOrigins property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceLocations }
     *     
     */
    public void setCurrentOrigins(ArrayOfServiceLocations value) {
        this.currentOrigins = value;
    }

    /**
     * Gets the value of the currentDestinations property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceLocations }
     *     
     */
    public ArrayOfServiceLocations getCurrentDestinations() {
        return currentDestinations;
    }

    /**
     * Sets the value of the currentDestinations property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceLocations }
     *     
     */
    public void setCurrentDestinations(ArrayOfServiceLocations value) {
        this.currentDestinations = value;
    }

}
