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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonLinearNoElecNoHyperFType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonLinearNoElecNoHyperFType">
 *   &lt;complexContent>
 *     &lt;extension base="{}NonLinearNoElecType">
 *       &lt;sequence>
 *         &lt;element name="TotalMagneticQuantumNumberN" type="{}MagneticQuantumNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonLinearNoElecNoHyperFType", propOrder = {
    "totalMagneticQuantumNumberN"
})
public class NonLinearNoElecNoHyperFType
    extends NonLinearNoElecType
{

    @XmlElement(name = "TotalMagneticQuantumNumberN")
    protected MagneticQuantumNumberType totalMagneticQuantumNumberN;

    /**
     * Gets the value of the totalMagneticQuantumNumberN property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticQuantumNumberType }
     *     
     */
    public MagneticQuantumNumberType getTotalMagneticQuantumNumberN() {
        return totalMagneticQuantumNumberN;
    }

    /**
     * Sets the value of the totalMagneticQuantumNumberN property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticQuantumNumberType }
     *     
     */
    public void setTotalMagneticQuantumNumberN(MagneticQuantumNumberType value) {
        this.totalMagneticQuantumNumberN = value;
    }

}