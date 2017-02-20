
package com.thalesgroup.rtti._2016_02_16.ldb.types;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;
import com.thalesgroup.rtti._2015_11_27.ldb.types.BaseStationBoard;


/**
 * A structure containing details of a "WithDetails" departure board for a specific location.
 * 
 * <p>Java class for StationBoardWithDetails complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="StationBoardWithDetails">
 *   &lt;complexContent>
 *     &lt;extension base="{http://thalesgroup.com/RTTI/2015-11-27/ldb/types}BaseStationBoard">
 *       &lt;sequence>
 *         &lt;element name="trainServices" type="{http://thalesgroup.com/RTTI/2016-02-16/ldb/types}ArrayOfServiceItemsWithCallingPoints" minOccurs="0"/>
 *         &lt;element name="busServices" type="{http://thalesgroup.com/RTTI/2016-02-16/ldb/types}ArrayOfServiceItemsWithCallingPoints" minOccurs="0"/>
 *         &lt;element name="ferryServices" type="{http://thalesgroup.com/RTTI/2016-02-16/ldb/types}ArrayOfServiceItemsWithCallingPoints" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationBoardWithDetails", propOrder = {
    "trainServices",
    "busServices",
    "ferryServices"
})
public class StationBoardWithDetails
    extends BaseStationBoard
{

    protected ArrayOfServiceItemsWithCallingPoints trainServices;
    protected ArrayOfServiceItemsWithCallingPoints busServices;
    protected ArrayOfServiceItemsWithCallingPoints ferryServices;

    /**
     * Gets the value of the trainServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceItemsWithCallingPoints }
     *     
     */
    public ArrayOfServiceItemsWithCallingPoints getTrainServices() {
        return trainServices;
    }

    /**
     * Sets the value of the trainServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceItemsWithCallingPoints }
     *     
     */
    public void setTrainServices(ArrayOfServiceItemsWithCallingPoints value) {
        this.trainServices = value;
    }

    /**
     * Gets the value of the busServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceItemsWithCallingPoints }
     *     
     */
    public ArrayOfServiceItemsWithCallingPoints getBusServices() {
        return busServices;
    }

    /**
     * Sets the value of the busServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceItemsWithCallingPoints }
     *     
     */
    public void setBusServices(ArrayOfServiceItemsWithCallingPoints value) {
        this.busServices = value;
    }

    /**
     * Gets the value of the ferryServices property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfServiceItemsWithCallingPoints }
     *     
     */
    public ArrayOfServiceItemsWithCallingPoints getFerryServices() {
        return ferryServices;
    }

    /**
     * Sets the value of the ferryServices property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfServiceItemsWithCallingPoints }
     *     
     */
    public void setFerryServices(ArrayOfServiceItemsWithCallingPoints value) {
        this.ferryServices = value;
    }

}
