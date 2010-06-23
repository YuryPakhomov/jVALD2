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
 * <p>Java class for RotationalCharacterisationType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RotationalCharacterisationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RovibrationalSpeciesNotation" type="{}SymbolType" minOccurs="0"/>
 *         &lt;element name="RovibronicSpeciesNotation" type="{}SymbolType" minOccurs="0"/>
 *         &lt;element name="RovibronicAngularMomentumP" type="{}MagneticQuantumNumberType" minOccurs="0"/>
 *         &lt;element name="PermutationSymmetry" type="{}PermutationSymmetryType" minOccurs="0"/>
 *         &lt;element name="InversionSymmetry" type="{}PermutationSymmetryType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RotationalCharacterisationType", propOrder = {
    "rovibrationalSpeciesNotation",
    "rovibronicSpeciesNotation",
    "rovibronicAngularMomentumP",
    "permutationSymmetry",
    "inversionSymmetry"
})
public class RotationalCharacterisationType {

    @XmlElement(name = "RovibrationalSpeciesNotation")
    protected SymbolType rovibrationalSpeciesNotation;
    @XmlElement(name = "RovibronicSpeciesNotation")
    protected SymbolType rovibronicSpeciesNotation;
    @XmlElement(name = "RovibronicAngularMomentumP")
    protected MagneticQuantumNumberType rovibronicAngularMomentumP;
    @XmlElement(name = "PermutationSymmetry")
    protected PermutationSymmetryType permutationSymmetry;
    @XmlElement(name = "InversionSymmetry")
    protected PermutationSymmetryType inversionSymmetry;

    /**
     * Gets the value of the rovibrationalSpeciesNotation property.
     * 
     * @return
     *     possible object is
     *     {@link SymbolType }
     *     
     */
    public SymbolType getRovibrationalSpeciesNotation() {
        return rovibrationalSpeciesNotation;
    }

    /**
     * Sets the value of the rovibrationalSpeciesNotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolType }
     *     
     */
    public void setRovibrationalSpeciesNotation(SymbolType value) {
        this.rovibrationalSpeciesNotation = value;
    }

    /**
     * Gets the value of the rovibronicSpeciesNotation property.
     * 
     * @return
     *     possible object is
     *     {@link SymbolType }
     *     
     */
    public SymbolType getRovibronicSpeciesNotation() {
        return rovibronicSpeciesNotation;
    }

    /**
     * Sets the value of the rovibronicSpeciesNotation property.
     * 
     * @param value
     *     allowed object is
     *     {@link SymbolType }
     *     
     */
    public void setRovibronicSpeciesNotation(SymbolType value) {
        this.rovibronicSpeciesNotation = value;
    }

    /**
     * Gets the value of the rovibronicAngularMomentumP property.
     * 
     * @return
     *     possible object is
     *     {@link MagneticQuantumNumberType }
     *     
     */
    public MagneticQuantumNumberType getRovibronicAngularMomentumP() {
        return rovibronicAngularMomentumP;
    }

    /**
     * Sets the value of the rovibronicAngularMomentumP property.
     * 
     * @param value
     *     allowed object is
     *     {@link MagneticQuantumNumberType }
     *     
     */
    public void setRovibronicAngularMomentumP(MagneticQuantumNumberType value) {
        this.rovibronicAngularMomentumP = value;
    }

    /**
     * Gets the value of the permutationSymmetry property.
     * 
     * @return
     *     possible object is
     *     {@link PermutationSymmetryType }
     *     
     */
    public PermutationSymmetryType getPermutationSymmetry() {
        return permutationSymmetry;
    }

    /**
     * Sets the value of the permutationSymmetry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermutationSymmetryType }
     *     
     */
    public void setPermutationSymmetry(PermutationSymmetryType value) {
        this.permutationSymmetry = value;
    }

    /**
     * Gets the value of the inversionSymmetry property.
     * 
     * @return
     *     possible object is
     *     {@link PermutationSymmetryType }
     *     
     */
    public PermutationSymmetryType getInversionSymmetry() {
        return inversionSymmetry;
    }

    /**
     * Sets the value of the inversionSymmetry property.
     * 
     * @param value
     *     allowed object is
     *     {@link PermutationSymmetryType }
     *     
     */
    public void setInversionSymmetry(PermutationSymmetryType value) {
        this.inversionSymmetry = value;
    }

}
