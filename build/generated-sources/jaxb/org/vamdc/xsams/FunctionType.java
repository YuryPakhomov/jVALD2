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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Description of used functions
 * 
 * <p>Java class for FunctionType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="FunctionType">
 *   &lt;complexContent>
 *     &lt;extension base="{}PrimaryType">
 *       &lt;sequence>
 *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Expression" type="{}ExpressionType"/>
 *         &lt;element name="Y" type="{}ArgumentType"/>
 *         &lt;element name="Arguments" type="{}ArgumentsType"/>
 *         &lt;element name="Parameters" type="{}ParametersType" minOccurs="0"/>
 *         &lt;element name="ReferenceFrame" type="{}ReferenceFrameType" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SourceCodeURL" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute ref="{}functionID use="required""/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FunctionType", propOrder = {
    "name",
    "expression",
    "y",
    "arguments",
    "parameters",
    "referenceFrame",
    "description",
    "sourceCodeURL"
})
public class FunctionType
    extends PrimaryType
{

    @XmlElement(name = "Name")
    protected String name;
    @XmlElement(name = "Expression", required = true)
    protected ExpressionType expression;
    @XmlElement(name = "Y", required = true)
    protected ArgumentType y;
    @XmlElement(name = "Arguments", required = true)
    protected ArgumentsType arguments;
    @XmlElement(name = "Parameters")
    protected ParametersType parameters;
    @XmlElement(name = "ReferenceFrame")
    protected ReferenceFrameType referenceFrame;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "SourceCodeURL")
    protected String sourceCodeURL;
    @XmlAttribute(name = "functionID", required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    protected String functionID;

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the expression property.
     * 
     * @return
     *     possible object is
     *     {@link ExpressionType }
     *     
     */
    public ExpressionType getExpression() {
        return expression;
    }

    /**
     * Sets the value of the expression property.
     * 
     * @param value
     *     allowed object is
     *     {@link ExpressionType }
     *     
     */
    public void setExpression(ExpressionType value) {
        this.expression = value;
    }

    /**
     * Gets the value of the y property.
     * 
     * @return
     *     possible object is
     *     {@link ArgumentType }
     *     
     */
    public ArgumentType getY() {
        return y;
    }

    /**
     * Sets the value of the y property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArgumentType }
     *     
     */
    public void setY(ArgumentType value) {
        this.y = value;
    }

    /**
     * Gets the value of the arguments property.
     * 
     * @return
     *     possible object is
     *     {@link ArgumentsType }
     *     
     */
    public ArgumentsType getArguments() {
        return arguments;
    }

    /**
     * Sets the value of the arguments property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArgumentsType }
     *     
     */
    public void setArguments(ArgumentsType value) {
        this.arguments = value;
    }

    /**
     * Gets the value of the parameters property.
     * 
     * @return
     *     possible object is
     *     {@link ParametersType }
     *     
     */
    public ParametersType getParameters() {
        return parameters;
    }

    /**
     * Sets the value of the parameters property.
     * 
     * @param value
     *     allowed object is
     *     {@link ParametersType }
     *     
     */
    public void setParameters(ParametersType value) {
        this.parameters = value;
    }

    /**
     * Gets the value of the referenceFrame property.
     * 
     * @return
     *     possible object is
     *     {@link ReferenceFrameType }
     *     
     */
    public ReferenceFrameType getReferenceFrame() {
        return referenceFrame;
    }

    /**
     * Sets the value of the referenceFrame property.
     * 
     * @param value
     *     allowed object is
     *     {@link ReferenceFrameType }
     *     
     */
    public void setReferenceFrame(ReferenceFrameType value) {
        this.referenceFrame = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * Sets the value of the description property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the sourceCodeURL property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceCodeURL() {
        return sourceCodeURL;
    }

    /**
     * Sets the value of the sourceCodeURL property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceCodeURL(String value) {
        this.sourceCodeURL = value;
    }

    /**
     * Gets the value of the functionID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFunctionID() {
        return functionID;
    }

    /**
     * Sets the value of the functionID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFunctionID(String value) {
        this.functionID = value;
    }

}
