//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.04.19 at 05:44:29 PM MSD 
//


package org.vamdc.xsams;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for MixingCoefficientType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="MixingCoefficientType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>double">
 *       &lt;attribute name="mixingClass" use="required" type="{}MixingClassType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MixingCoefficientType", propOrder = {
    "value"
})
public class MixingCoefficientType {

    @XmlValue
    protected double value;
    @XmlAttribute(name = "mixingClass", required = true)
    protected MixingClassType mixingClass;

    /**
     * Gets the value of the value property.
     * 
     */
    public double getValue() {
        return value;
    }

    /**
     * Sets the value of the value property.
     * 
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * Gets the value of the mixingClass property.
     * 
     * @return
     *     possible object is
     *     {@link MixingClassType }
     *     
     */
    public MixingClassType getMixingClass() {
        return mixingClass;
    }

    /**
     * Sets the value of the mixingClass property.
     * 
     * @param value
     *     allowed object is
     *     {@link MixingClassType }
     *     
     */
    public void setMixingClass(MixingClassType value) {
        this.mixingClass = value;
    }

}
