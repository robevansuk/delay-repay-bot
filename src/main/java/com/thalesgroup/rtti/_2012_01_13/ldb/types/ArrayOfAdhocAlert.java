
package com.thalesgroup.rtti._2012_01_13.ldb.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A list of Adhoc Alers related to this locationa for this service.
 * 
 * <p>Java class for ArrayOfAdhocAlert complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAdhocAlert">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="adhocAlertText" type="{http://thalesgroup.com/RTTI/2012-01-13/ldb/types}AdhocAlertTextType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAdhocAlert", propOrder = {
    "adhocAlertText"
})
public class ArrayOfAdhocAlert {

    @XmlElement(nillable = true)
    protected List<String> adhocAlertText;

    /**
     * Gets the value of the adhocAlertText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adhocAlertText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdhocAlertText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getAdhocAlertText() {
        if (adhocAlertText == null) {
            adhocAlertText = new ArrayList<String>();
        }
        return this.adhocAlertText;
    }

}
