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
 * <p>Java class for HyperfineCouplingBType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HyperfineCouplingBType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CouplingType" type="{}CouplingListType"/>
 *         &lt;element name="TotalAngularMomentumN" type="{}MolecularQuantumNumberType"/>
 *         &lt;element name="TotalAngularMomentumJ" type="{}ComplexMolecularQuantumNumberType" minOccurs="0"/>
 *         &lt;element name="HyperfineQuantumNumbers" type="{}HyperfineQuantumNumbersType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HyperfineCouplingBType", propOrder = {
    "couplingType",
    "totalAngularMomentumN",
    "totalAngularMomentumJ",
    "hyperfineQuantumNumbers"
})
public class HyperfineCouplingBType {

    @XmlElement(name = "CouplingType", required = true)
    protected CouplingListType couplingType;
    @XmlElement(name = "TotalAngularMomentumN", required = true)
    protected MolecularQuantumNumberType totalAngularMomentumN;
    @XmlElement(name = "TotalAngularMomentumJ")
    protected ComplexMolecularQuantumNumberType totalAngularMomentumJ;
    @XmlElement(name = "HyperfineQuantumNumbers", required = true)
    protected HyperfineQuantumNumbersType hyperfineQuantumNumbers;

    /**
     * Gets the value of the couplingType property.
     * 
     * @return
     *     possible object is
     *     {@link CouplingListType }
     *     
     */
    public CouplingListType getCouplingType() {
        return couplingType;
    }

    /**
     * Sets the value of the couplingType property.
     * 
     * @param value
     *     allowed object is
     *     {@link CouplingListType }
     *     
     */
    public void setCouplingType(CouplingListType value) {
        this.couplingType = value;
    }

    /**
     * Gets the value of the totalAngularMomentumN property.
     * 
     * @return
     *     possible object is
     *     {@link MolecularQuantumNumberType }
     *     
     */
    public MolecularQuantumNumberType getTotalAngularMomentumN() {
        return totalAngularMomentumN;
    }

    /**
     * Sets the value of the totalAngularMomentumN property.
     * 
     * @param value
     *     allowed object is
     *     {@link MolecularQuantumNumberType }
     *     
     */
    public void setTotalAngularMomentumN(MolecularQuantumNumberType value) {
        this.totalAngularMomentumN = value;
    }

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
     * Gets the value of the hyperfineQuantumNumbers property.
     * 
     * @return
     *     possible object is
     *     {@link HyperfineQuantumNumbersType }
     *     
     */
    public HyperfineQuantumNumbersType getHyperfineQuantumNumbers() {
        return hyperfineQuantumNumbers;
    }

    /**
     * Sets the value of the hyperfineQuantumNumbers property.
     * 
     * @param value
     *     allowed object is
     *     {@link HyperfineQuantumNumbersType }
     *     
     */
    public void setHyperfineQuantumNumbers(HyperfineQuantumNumbersType value) {
        this.hyperfineQuantumNumbers = value;
    }

}
