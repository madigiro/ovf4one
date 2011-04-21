//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.3-hudson-jaxb-ri-2.2.3-3- 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.04.07 at 06:26:18 PM CEST 
//


package org.opennebula.xmlschema;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.opennebula.xmlschema package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _VM_QNAME = new QName("http://opennebula.org/XMLSchema", "VM");
    private final static QName _VNET_QNAME = new QName("http://opennebula.org/XMLSchema", "VNET");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.opennebula.xmlschema
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CLUSTERPOOL }
     * 
     */
    public CLUSTERPOOL createCLUSTERPOOL() {
        return new CLUSTERPOOL();
    }

    /**
     * Create an instance of {@link CLUSTER }
     * 
     */
    public CLUSTER createCLUSTER() {
        return new CLUSTER();
    }

    /**
     * Create an instance of {@link org.opennebula.xmlschema.HOST }
     * 
     */
    public org.opennebula.xmlschema.HOST createHOST() {
        return new org.opennebula.xmlschema.HOST();
    }

    /**
     * Create an instance of {@link HOSTPOOL }
     * 
     */
    public HOSTPOOL createHOSTPOOL() {
        return new HOSTPOOL();
    }

    /**
     * Create an instance of {@link HOSTPOOL.HOST }
     * 
     */
    public HOSTPOOL.HOST createHOSTPOOLHOST() {
        return new HOSTPOOL.HOST();
    }

    /**
     * Create an instance of {@link org.opennebula.xmlschema.HOST.HOSTSHARE }
     * 
     */
    public org.opennebula.xmlschema.HOST.HOSTSHARE createHOSTHOSTSHARE() {
        return new org.opennebula.xmlschema.HOST.HOSTSHARE();
    }

    /**
     * Create an instance of {@link HOSTPOOL.HOST.HOSTSHARE }
     * 
     */
    public HOSTPOOL.HOST.HOSTSHARE createHOSTPOOLHOSTHOSTSHARE() {
        return new HOSTPOOL.HOST.HOSTSHARE();
    }

    /**
     * Create an instance of {@link IMAGEPOOL }
     * 
     */
    public IMAGEPOOL createIMAGEPOOL() {
        return new IMAGEPOOL();
    }

    /**
     * Create an instance of {@link IMAGE }
     * 
     */
    public IMAGE createIMAGE() {
        return new IMAGE();
    }

    /**
     * Create an instance of {@link USERPOOL }
     * 
     */
    public USERPOOL createUSERPOOL() {
        return new USERPOOL();
    }

    /**
     * Create an instance of {@link USER }
     * 
     */
    public USER createUSER() {
        return new USER();
    }

    /**
     * Create an instance of {@link VMPOOL }
     * 
     */
    public VMPOOL createVMPOOL() {
        return new VMPOOL();
    }

    /**
     * Create an instance of {@link VMCOMPLEX }
     * 
     */
    public VMCOMPLEX createVMCOMPLEX() {
        return new VMCOMPLEX();
    }

    /**
     * Create an instance of {@link VMSIMPLE }
     * 
     */
    public VMSIMPLE createVMSIMPLE() {
        return new VMSIMPLE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VMCOMPLEX }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opennebula.org/XMLSchema", name = "VM")
    public JAXBElement<VMCOMPLEX> createVM(VMCOMPLEX value) {
        return new JAXBElement<VMCOMPLEX>(_VM_QNAME, VMCOMPLEX.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VMSIMPLE }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opennebula.org/XMLSchema", name = "VM")
    public JAXBElement<VMSIMPLE> createVM(VMSIMPLE value) {
        return new JAXBElement<VMSIMPLE>(_VM_QNAME, VMSIMPLE.class, null, value);
    }

    /**
     * Create an instance of {@link VNET }
     * 
     */
    public VNET createVNET() {
        return new VNET();
    }

    /**
     * Create an instance of {@link VNETPOOL }
     * 
     */
    public VNETPOOL createVNETPOOL() {
        return new VNETPOOL();
    }

    /**
     * Create an instance of {@link VNET.LEASES }
     * 
     */
    public VNET.LEASES createVNETLEASES() {
        return new VNET.LEASES();
    }

    /**
     * Create an instance of {@link VNET.LEASES.LEASE }
     * 
     */
    public VNET.LEASES.LEASE createVNETLEASESLEASE() {
        return new VNET.LEASES.LEASE();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link VNET }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://opennebula.org/XMLSchema", name = "VNET")
    public JAXBElement<VNET> createVNET(VNET value) {
        return new JAXBElement<VNET>(_VNET_QNAME, VNET.class, null, value);
    }

}
