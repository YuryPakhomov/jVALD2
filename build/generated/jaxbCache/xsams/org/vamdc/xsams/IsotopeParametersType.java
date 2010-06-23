//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.19 at 05:44:29 PM MSD 
//


package org.vamdc.xsams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for IsotopeParametersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IsotopeParametersType">
 *   &lt;complexContent>
 *     &lt;extension base="{}PrimaryType">
 *       &lt;sequence>
 *         &lt;element name="MassNumber" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="Mass" type="{}DataType" minOccurs="0"/>
 *         &lt;element name="NuclearSpin" type="{}AngularMomentumType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IsotopeParametersType", propOrder = {
    "massNumber",
    "mass",
    "nuclearSpin"
})
public class IsotopeParametersType
    extends PrimaryType
{

    @XmlElement(name = "MassNumber", required = true, type = String.class)
    @XmlJavaTypeAdapter(Adapter1 .class)
    @XmlSchemaType(name = "integer")
    protected Integer massNumber;
    @XmlElement(name = "Mass")
    protected DataType mass;
    @XmlElement(name = "NuclearSpin", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double nuclearSpin;

    /**
     * Gets the value of the massNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Integer getMassNumber() {
        return massNumber;
    }

    /**
     * Sets the value of the massNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMassNumber(Integer value) {
        this.massNumber = value;
    }

    /**
     * Gets the value of the mass property.
     * 
     * @return
     *     possible object is
     *     {@link DataType }
     *     
     */
    public DataType getMass() {
        return mass;
    }

    /**
     * Sets the value of the mass property.
     * 
     * @param value
     *     allowed object is
     *     {@link DataType }
     *     
     */
    public void setMass(DataType value) {
        this.mass = value;
    }

    /**
     * Gets the value of the nuclearSpin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getNuclearSpin() {
        return nuclearSpin;
    }

    /**
     * Sets the value of the nuclearSpin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNuclearSpin(Double value) {
        this.nuclearSpin = value;
    }

}
