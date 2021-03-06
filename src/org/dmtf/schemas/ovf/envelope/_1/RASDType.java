//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.03.24 at 06:18:05 PM CET 
//


package org.dmtf.schemas.ovf.envelope._1;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.dmtf.schemas.wbem.wscim._1.cim_schema._2.cim_resourceallocationsettingdata.CIMResourceAllocationSettingDataType;


/**
 * Wrapper for
 *                 CIM_ResourceAllocationSettingData_Type
 * 
 * <p>Java class for RASD_Type complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="RASD_Type">
 *   &lt;complexContent>
 *     &lt;extension base="{http://schemas.dmtf.org/wbem/wscim/1/cim-schema/2/CIM_ResourceAllocationSettingData}CIM_ResourceAllocationSettingData_Type">
 *       &lt;attribute name="required" type="{http://www.w3.org/2001/XMLSchema}boolean" default="true" />
 *       &lt;attribute name="configuration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="bound" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;anyAttribute processContents='lax'/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RASD_Type")
public class RASDType
    extends CIMResourceAllocationSettingDataType
{

    @XmlAttribute(name = "required", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    protected Boolean required;
    @XmlAttribute(name = "configuration", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    protected String configuration;
    @XmlAttribute(name = "bound", namespace = "http://schemas.dmtf.org/ovf/envelope/1")
    protected String bound;

    /**
     * Gets the value of the required property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRequired() {
        if (required == null) {
            return true;
        } else {
            return required;
        }
    }

    /**
     * Sets the value of the required property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRequired(Boolean value) {
        this.required = value;
    }

    /**
     * Gets the value of the configuration property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfiguration() {
        return configuration;
    }

    /**
     * Sets the value of the configuration property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfiguration(String value) {
        this.configuration = value;
    }

    /**
     * Gets the value of the bound property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBound() {
        return bound;
    }

    /**
     * Sets the value of the bound property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBound(String value) {
        this.bound = value;
    }

}
