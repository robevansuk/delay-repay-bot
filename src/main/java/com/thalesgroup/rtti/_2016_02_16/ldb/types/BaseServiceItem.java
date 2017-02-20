
package com.thalesgroup.rtti._2016_02_16.ldb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * An individual service's summary details for display on a basic departure board.
 * 
 * <p>Java class for BaseServiceItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BaseServiceItem">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2015-11-27/ldb/types}BaseServiceItem">
 *       &lt;sequence>
 *         &lt;element name="rsid" type="{http://thalesgroup.com/RTTI/2016-02-16/ldb/commontypes}RSIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseServiceItem", propOrder = {
    "rsid"
})
@XmlSeeAlso({
    ServiceItem.class
})
public class BaseServiceItem
    extends com.thalesgroup.rtti._2015_11_27.ldb.types.BaseServiceItem
{

    protected String rsid;

    /**
     * Gets the value of the rsid property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRsid() {
        return rsid;
    }

    /**
     * Sets the value of the rsid property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRsid(String value) {
        this.rsid = value;
    }

}
