
package com.thalesgroup.rtti._2016_02_16.ldb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2015_11_27.ldb.types.BaseStationBoard;


/**
 * A structure containing details of a "WithDetails" next/fastest departures board for a specific location.
 * 
 * <p>Java class for DeparturesBoardWithDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="DeparturesBoardWithDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2015-11-27/ldb/types}BaseStationBoard">
 *       &lt;sequence>
 *         &lt;element name="departures" type="{http://thalesgroup.com/RTTI/2016-02-16/ldb/types}ArrayOfDepartureItemsWithCallingPoints"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeparturesBoardWithDetails", propOrder = {
    "departures"
})
public class DeparturesBoardWithDetails
    extends BaseStationBoard
{

    @XmlElement(required = true)
    protected ArrayOfDepartureItemsWithCallingPoints departures;

    /**
     * Gets the value of the departures property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfDepartureItemsWithCallingPoints }
     *     
     */
    public ArrayOfDepartureItemsWithCallingPoints getDepartures() {
        return departures;
    }

    /**
     * Sets the value of the departures property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfDepartureItemsWithCallingPoints }
     *     
     */
    public void setDepartures(ArrayOfDepartureItemsWithCallingPoints value) {
        this.departures = value;
    }

}
