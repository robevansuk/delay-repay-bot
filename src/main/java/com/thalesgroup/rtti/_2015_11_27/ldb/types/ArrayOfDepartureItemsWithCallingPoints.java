
package com.thalesgroup.rtti._2015_11_27.ldb.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * A list of next/fastest services with calling points on a departures board.
 * 
 * <p>Java class for ArrayOfDepartureItemsWithCallingPoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfDepartureItemsWithCallingPoints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="destination" type="{http://thalesgroup.com/RTTI/2015-11-27/ldb/types}DepartureItemWithCallingPoints" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDepartureItemsWithCallingPoints", propOrder = {
    "destination"
})
public class ArrayOfDepartureItemsWithCallingPoints {

    protected List<DepartureItemWithCallingPoints> destination;

    /**
     * Gets the value of the destination property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the destination property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDestination().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DepartureItemWithCallingPoints }
     * 
     * 
     */
    public List<DepartureItemWithCallingPoints> getDestination() {
        if (destination == null) {
            destination = new ArrayList<DepartureItemWithCallingPoints>();
        }
        return this.destination;
    }

}
