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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for NonLinearElecCouplingType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="NonLinearElecCouplingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Label" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="EfSymmetry" type="{}EfSymmetryType" minOccurs="0"/>
 *         &lt;element name="TotalAngularMomentumN" type="{}MolecularQuantumNumberType"/>
 *         &lt;element name="TotalAngularMomentumJ" type="{}ComplexMolecularQuantumNumberType"/>
 *         &lt;element name="MolecularProjection" type="{}MolecularProjectionType"/>
 *         &lt;element name="RoVibronicSplitting" type="{}RoVibronicSplittingType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NonLinearElecCouplingType", propOrder = {
    "label",
    "efSymmetry",
    "totalAngularMomentumN",
    "totalAngularMomentumJ",
    "molecularProjection",
    "roVibronicSplitting"
})
@XmlSeeAlso({
    NonLinearElecNoHyperFType.class,
    NonLinearElecHyperFType.class
})
public class NonLinearElecCouplingType {

    @XmlElement(name = "Label")
    protected String label;
    @XmlElement(name = "EfSymmetry")
    protected EfSymmetryType efSymmetry;
    @XmlElement(name = "TotalAngularMomentumN", required = true)
    protected MolecularQuantumNumberType totalAngularMomentumN;
    @XmlElement(name = "TotalAngularMomentumJ", required = true)
    protected ComplexMolecularQuantumNumberType totalAngularMomentumJ;
    @XmlElement(name = "MolecularProjection", required = true)
    protected MolecularProjectionType molecularProjection;
    @XmlElement(name = "RoVibronicSplitting")
    protected RoVibronicSplittingType roVibronicSplitting;

    /**
     * Gets the value of the label property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLabel() {
        return label;
    }

    /**
     * Sets the value of the label property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLabel(String value) {
        this.label = value;
    }

    /**
     * Gets the value of the efSymmetry property.
     * 
     * @return
     *     possible object is
     *     {@link EfSymmetryType }
     *     
     */
    public EfSymmetryType getEfSymmetry() {
        return efSymmetry;
    }

    /**
     * Sets the value of the efSymmetry property.
     * 
     * @param value
     *     allowed object is
     *     {@link EfSymmetryType }
     *     
     */
    public void setEfSymmetry(EfSymmetryType value) {
        this.efSymmetry = value;
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
     * Gets the value of the molecularProjection property.
     * 
     * @return
     *     possible object is
     *     {@link MolecularProjectionType }
     *     
     */
    public MolecularProjectionType getMolecularProjection() {
        return molecularProjection;
    }

    /**
     * Sets the value of the molecularProjection property.
     * 
     * @param value
     *     allowed object is
     *     {@link MolecularProjectionType }
     *     
     */
    public void setMolecularProjection(MolecularProjectionType value) {
        this.molecularProjection = value;
    }

    /**
     * Gets the value of the roVibronicSplitting property.
     * 
     * @return
     *     possible object is
     *     {@link RoVibronicSplittingType }
     *     
     */
    public RoVibronicSplittingType getRoVibronicSplitting() {
        return roVibronicSplitting;
    }

    /**
     * Sets the value of the roVibronicSplitting property.
     * 
     * @param value
     *     allowed object is
     *     {@link RoVibronicSplittingType }
     *     
     */
    public void setRoVibronicSplitting(RoVibronicSplittingType value) {
        this.roVibronicSplitting = value;
    }

}
