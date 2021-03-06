//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.19 at 05:44:29 PM MSD 
//


package org.vamdc.xsams;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for FitDataType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FitDataType">
 *   &lt;complexContent>
 *     &lt;extension base="{}PrimaryType">
 *       &lt;sequence>
 *         &lt;element name="FunctionRef" type="{http://www.w3.org/2001/XMLSchema}IDREF"/>
 *         &lt;element name="FitValidityLimits" type="{}FitValidityLimitsType" maxOccurs="unbounded"/>
 *         &lt;element name="FitParameters" type="{}FitParametersType"/>
 *         &lt;element name="FitAccuracy" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="PhysicalUncertainty" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProductionDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FitDataType", propOrder = {
    "functionRef",
    "fitValidityLimits",
    "fitParameters",
    "fitAccuracy",
    "physicalUncertainty",
    "productionDate"
})
public class FitDataType
    extends PrimaryType
{

    @XmlElement(name = "FunctionRef", required = true)
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object functionRef;
    @XmlElement(name = "FitValidityLimits", required = true)
    protected List<FitValidityLimitsType> fitValidityLimits;
    @XmlElement(name = "FitParameters", required = true)
    protected FitParametersType fitParameters;
    @XmlElement(name = "FitAccuracy")
    protected String fitAccuracy;
    @XmlElement(name = "PhysicalUncertainty")
    protected String physicalUncertainty;
    @XmlElement(name = "ProductionDate")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar productionDate;

    /**
     * Gets the value of the functionRef property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getFunctionRef() {
        return functionRef;
    }

    /**
     * Sets the value of the functionRef property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setFunctionRef(Object value) {
        this.functionRef = value;
    }

    /**
     * Gets the value of the fitValidityLimits property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fitValidityLimits property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFitValidityLimits().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FitValidityLimitsType }
     * 
     * 
     */
    public List<FitValidityLimitsType> getFitValidityLimits() {
        if (fitValidityLimits == null) {
            fitValidityLimits = new ArrayList<FitValidityLimitsType>();
        }
        return this.fitValidityLimits;
    }

    /**
     * Gets the value of the fitParameters property.
     * 
     * @return
     *     possible object is
     *     {@link FitParametersType }
     *     
     */
    public FitParametersType getFitParameters() {
        return fitParameters;
    }

    /**
     * Sets the value of the fitParameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link FitParametersType }
     *     
     */
    public void setFitParameters(FitParametersType value) {
        this.fitParameters = value;
    }

    /**
     * Gets the value of the fitAccuracy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFitAccuracy() {
        return fitAccuracy;
    }

    /**
     * Sets the value of the fitAccuracy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFitAccuracy(String value) {
        this.fitAccuracy = value;
    }

    /**
     * Gets the value of the physicalUncertainty property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPhysicalUncertainty() {
        return physicalUncertainty;
    }

    /**
     * Sets the value of the physicalUncertainty property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPhysicalUncertainty(String value) {
        this.physicalUncertainty = value;
    }

    /**
     * Gets the value of the productionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProductionDate() {
        return productionDate;
    }

    /**
     * Sets the value of the productionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProductionDate(XMLGregorianCalendar value) {
        this.productionDate = value;
    }

}
