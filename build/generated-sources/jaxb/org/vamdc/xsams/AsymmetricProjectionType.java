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
 * <p>Java class for AsymmetricProjectionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AsymmetricProjectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AsymmetricTau" type="{}MagneticQuantumNumberType" minOccurs="0"/>
 *         &lt;element name="AsymmetricKa" type="{}MolecularQuantumNumberType"/>
 *         &lt;element name="AsymmetricKc" type="{}MolecularQuantumNumberType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AsymmetricProjectionType", propOrder = {
    "asymmetricTau",
    "asymmetricKa",
    "asymmetricKc"
})
public class AsymmetricProjectionType {

    @XmlElement(name = "AsymmetricTau")
    protected MagneticQuantumNumberType asymmetricTau;
    @XmlElement(name = "AsymmetricKa", required = true)
    protected MolecularQuantumNumberType asymmetricKa;
    @XmlElement(name = "AsymmetricKc", required = true)
    protected MolecularQuantumNumberType asymmetricKc;

    /**
     * Gets the value of the asymmetricTau property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticQuantumNumberType }
     *     
     */
    public MagneticQuantumNumberType getAsymmetricTau() {
        return asymmetricTau;
    }

    /**
     * Sets the value of the asymmetricTau property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticQuantumNumberType }
     *     
     */
    public void setAsymmetricTau(MagneticQuantumNumberType value) {
        this.asymmetricTau = value;
    }

    /**
     * Gets the value of the asymmetricKa property.
     * 
     * @return
     *     possible object is
     *     {@link MolecularQuantumNumberType }
     *     
     */
    public MolecularQuantumNumberType getAsymmetricKa() {
        return asymmetricKa;
    }

    /**
     * Sets the value of the asymmetricKa property.
     * 
     * @param value
     *     allowed object is
     *     {@link MolecularQuantumNumberType }
     *     
     */
    public void setAsymmetricKa(MolecularQuantumNumberType value) {
        this.asymmetricKa = value;
    }

    /**
     * Gets the value of the asymmetricKc property.
     * 
     * @return
     *     possible object is
     *     {@link MolecularQuantumNumberType }
     *     
     */
    public MolecularQuantumNumberType getAsymmetricKc() {
        return asymmetricKc;
    }

    /**
     * Sets the value of the asymmetricKc property.
     * 
     * @param value
     *     allowed object is
     *     {@link MolecularQuantumNumberType }
     *     
     */
    public void setAsymmetricKc(MolecularQuantumNumberType value) {
        this.asymmetricKc = value;
    }

}