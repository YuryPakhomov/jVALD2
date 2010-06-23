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
 * <p>Java class for HundCaseAType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HundCaseAType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalAngularMomentumJ" type="{}ComplexMolecularQuantumNumberType"/>
 *         &lt;element name="TotalMolecularProjectionJ" type="{}MolecularQuantumNumberType"/>
 *         &lt;element name="TotalMagneticQuantumNumberJ" type="{}MagneticQuantumNumberType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HundCaseAType", propOrder = {
    "totalAngularMomentumJ",
    "totalMolecularProjectionJ",
    "totalMagneticQuantumNumberJ"
})
public class HundCaseAType {

    @XmlElement(name = "TotalAngularMomentumJ", required = true)
    protected ComplexMolecularQuantumNumberType totalAngularMomentumJ;
    @XmlElement(name = "TotalMolecularProjectionJ", required = true)
    protected MolecularQuantumNumberType totalMolecularProjectionJ;
    @XmlElement(name = "TotalMagneticQuantumNumberJ")
    protected MagneticQuantumNumberType totalMagneticQuantumNumberJ;

    /**
     * Gets the value of the totalAngularMomentumJ property.
     * 
     * @return
     *     possible object is
     *     {@link ComplexMolecularQuantumNumberType }
     *     
     */
    public ComplexMolecularQuantumNumberType getTotalAngularMomentumJ() {
        return totalAngularMomentumJ;
    }

    /**
     * Sets the value of the totalAngularMomentumJ property.
     * 
     * @param value
     *     allowed object is
     *     {@link ComplexMolecularQuantumNumberType }
     *     
     */
    public void setTotalAngularMomentumJ(ComplexMolecularQuantumNumberType value) {
        this.totalAngularMomentumJ = value;
    }

    /**
     * Gets the value of the totalMolecularProjectionJ property.
     * 
     * @return
     *     possible object is
     *     {@link MolecularQuantumNumberType }
     *     
     */
    public MolecularQuantumNumberType getTotalMolecularProjectionJ() {
        return totalMolecularProjectionJ;
    }

    /**
     * Sets the value of the totalMolecularProjectionJ property.
     * 
     * @param value
     *     allowed object is
     *     {@link MolecularQuantumNumberType }
     *     
     */
    public void setTotalMolecularProjectionJ(MolecularQuantumNumberType value) {
        this.totalMolecularProjectionJ = value;
    }

    /**
     * Gets the value of the totalMagneticQuantumNumberJ property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticQuantumNumberType }
     *     
     */
    public MagneticQuantumNumberType getTotalMagneticQuantumNumberJ() {
        return totalMagneticQuantumNumberJ;
    }

    /**
     * Sets the value of the totalMagneticQuantumNumberJ property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticQuantumNumberType }
     *     
     */
    public void setTotalMagneticQuantumNumberJ(MagneticQuantumNumberType value) {
        this.totalMagneticQuantumNumberJ = value;
    }

}