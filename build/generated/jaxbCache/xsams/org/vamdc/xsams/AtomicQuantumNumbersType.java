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
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for AtomicQuantumNumbersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AtomicQuantumNumbersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="Parity" type="{}ParityType" minOccurs="0"/>
 *         &lt;element name="TotalAngularMomentum" type="{}AngularMomentumType" minOccurs="0"/>
 *         &lt;element name="Kappa" type="{}AngularMomentumType" minOccurs="0"/>
 *         &lt;element name="HyperfineMomentum" type="{}AngularMomentumType" minOccurs="0"/>
 *         &lt;element name="MagneticQuantumNumber" type="{}AngularMomentumProjectionType" minOccurs="0"/>
 *       &lt;/all>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AtomicQuantumNumbersType", propOrder = {

})
public class AtomicQuantumNumbersType {

    @XmlElement(name = "Parity")
    protected ParityType parity;
    @XmlElement(name = "TotalAngularMomentum", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double totalAngularMomentum;
    @XmlElement(name = "Kappa", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double kappa;
    @XmlElement(name = "HyperfineMomentum", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double hyperfineMomentum;
    @XmlElement(name = "MagneticQuantumNumber", type = String.class)
    @XmlJavaTypeAdapter(Adapter2 .class)
    protected Double magneticQuantumNumber;

    /**
     * Gets the value of the parity property.
     * 
     * @return
     *     possible object is
     *     {@link ParityType }
     *     
     */
    public ParityType getParity() {
        return parity;
    }

    /**
     * Sets the value of the parity property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParityType }
     *     
     */
    public void setParity(ParityType value) {
        this.parity = value;
    }

    /**
     * Gets the value of the totalAngularMomentum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getTotalAngularMomentum() {
        return totalAngularMomentum;
    }

    /**
     * Sets the value of the totalAngularMomentum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTotalAngularMomentum(Double value) {
        this.totalAngularMomentum = value;
    }

    /**
     * Gets the value of the kappa property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getKappa() {
        return kappa;
    }

    /**
     * Sets the value of the kappa property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKappa(Double value) {
        this.kappa = value;
    }

    /**
     * Gets the value of the hyperfineMomentum property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getHyperfineMomentum() {
        return hyperfineMomentum;
    }

    /**
     * Sets the value of the hyperfineMomentum property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHyperfineMomentum(Double value) {
        this.hyperfineMomentum = value;
    }

    /**
     * Gets the value of the magneticQuantumNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public Double getMagneticQuantumNumber() {
        return magneticQuantumNumber;
    }

    /**
     * Sets the value of the magneticQuantumNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMagneticQuantumNumber(Double value) {
        this.magneticQuantumNumber = value;
    }

}
