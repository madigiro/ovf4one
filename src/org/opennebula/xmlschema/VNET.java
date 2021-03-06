//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.05.17 at 08:02:58 PM CEST 
//


package org.opennebula.xmlschema;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for VNET complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="VNET">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="UID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="NAME" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="TYPE" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="BRIDGE" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="PUBLIC" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *         &lt;element name="TEMPLATE" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *         &lt;element name="LEASES">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="LEASE" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="IP" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="MAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="USED" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                             &lt;element name="VID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VNET", propOrder = {
    "id",
    "uid",
    "name",
    "type",
    "bridge",
    "_public",
    "template",
    "leases"
})
public class VNET {

    @XmlElement(name = "ID", required = true)
    protected BigInteger id;
    @XmlElement(name = "UID", required = true)
    protected BigInteger uid;
    @XmlElement(name = "NAME", required = true)
    protected String name;
    @XmlElement(name = "TYPE", required = true)
    protected BigInteger type;
    @XmlElement(name = "BRIDGE", required = true)
    protected String bridge;
    @XmlElement(name = "PUBLIC", required = true)
    protected BigInteger _public;
    @XmlElement(name = "TEMPLATE", required = true)
    protected Object template;
    @XmlElement(name = "LEASES", required = true)
    protected VNET.LEASES leases;

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * Gets the value of the uid property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getUID() {
        return uid;
    }

    /**
     * Sets the value of the uid property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setUID(BigInteger value) {
        this.uid = value;
    }

    /**
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNAME() {
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
    public void setNAME(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTYPE() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTYPE(BigInteger value) {
        this.type = value;
    }

    /**
     * Gets the value of the bridge property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBRIDGE() {
        return bridge;
    }

    /**
     * Sets the value of the bridge property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBRIDGE(String value) {
        this.bridge = value;
    }

    /**
     * Gets the value of the public property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPUBLIC() {
        return _public;
    }

    /**
     * Sets the value of the public property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPUBLIC(BigInteger value) {
        this._public = value;
    }

    /**
     * Gets the value of the template property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getTEMPLATE() {
        return template;
    }

    /**
     * Sets the value of the template property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setTEMPLATE(Object value) {
        this.template = value;
    }

    /**
     * Gets the value of the leases property.
     * 
     * @return
     *     possible object is
     *     {@link VNET.LEASES }
     *     
     */
    public VNET.LEASES getLEASES() {
        return leases;
    }

    /**
     * Sets the value of the leases property.
     * 
     * @param value
     *     allowed object is
     *     {@link VNET.LEASES }
     *     
     */
    public void setLEASES(VNET.LEASES value) {
        this.leases = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="LEASE" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="IP" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="MAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="USED" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                   &lt;element name="VID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "lease"
    })
    public static class LEASES {

        @XmlElement(name = "LEASE")
        protected List<VNET.LEASES.LEASE> lease;

        /**
         * Gets the value of the lease property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the lease property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLEASE().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VNET.LEASES.LEASE }
         * 
         * 
         */
        public List<VNET.LEASES.LEASE> getLEASE() {
            if (lease == null) {
                lease = new ArrayList<VNET.LEASES.LEASE>();
            }
            return this.lease;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="IP" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="MAC" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="USED" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *         &lt;element name="VID" type="{http://www.w3.org/2001/XMLSchema}integer"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "ip",
            "mac",
            "used",
            "vid"
        })
        public static class LEASE {

            @XmlElement(name = "IP", required = true)
            protected String ip;
            @XmlElement(name = "MAC", required = true)
            protected String mac;
            @XmlElement(name = "USED", required = true)
            protected BigInteger used;
            @XmlElement(name = "VID", required = true)
            protected BigInteger vid;

            /**
             * Gets the value of the ip property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIP() {
                return ip;
            }

            /**
             * Sets the value of the ip property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIP(String value) {
                this.ip = value;
            }

            /**
             * Gets the value of the mac property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMAC() {
                return mac;
            }

            /**
             * Sets the value of the mac property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMAC(String value) {
                this.mac = value;
            }

            /**
             * Gets the value of the used property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getUSED() {
                return used;
            }

            /**
             * Sets the value of the used property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setUSED(BigInteger value) {
                this.used = value;
            }

            /**
             * Gets the value of the vid property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getVID() {
                return vid;
            }

            /**
             * Sets the value of the vid property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setVID(BigInteger value) {
                this.vid = value;
            }

        }

    }

}
