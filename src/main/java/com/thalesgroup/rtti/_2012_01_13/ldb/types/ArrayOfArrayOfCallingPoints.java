
package com.thalesgroup.rtti._2012_01_13.ldb.types;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A list of calling point lists representing multiple journey segments. Refer to the documentation for how these lists should be handled.
 * 
 * <p>Java class for ArrayOfArrayOfCallingPoints complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfArrayOfCallingPoints">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="callingPointList" type="{http://thalesgroup.com/RTTI/2012-01-13/ldb/types}ArrayOfCallingPoints" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfArrayOfCallingPoints", propOrder = {
    "callingPointList"
})
public class ArrayOfArrayOfCallingPoints {

    @XmlElement(nillable = true)
    protected List<ArrayOfCallingPoints> callingPointList;

    /**
     * Gets the value of the callingPointList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the callingPointList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCallingPointList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfCallingPoints }
     * 
     * 
     */
    public List<ArrayOfCallingPoints> getCallingPointList() {
        if (callingPointList == null) {
            callingPointList = new ArrayList<ArrayOfCallingPoints>();
        }
        return this.callingPointList;
    }

}
