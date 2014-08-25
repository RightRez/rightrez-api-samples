/**
 * RightRezServiceLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class RightRezServiceLocator extends org.apache.axis.client.Service implements com.rightrez.RightRezService {

    public RightRezServiceLocator() {
    }


    public RightRezServiceLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public RightRezServiceLocator(java.lang.String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for RightRezServiceSoap12
    private java.lang.String RightRezServiceSoap12_address = "http://localhost:51436/WebServices/RightRezService.asmx";

    public java.lang.String getRightRezServiceSoap12Address() {
        return RightRezServiceSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RightRezServiceSoap12WSDDServiceName = "RightRezServiceSoap12";

    public java.lang.String getRightRezServiceSoap12WSDDServiceName() {
        return RightRezServiceSoap12WSDDServiceName;
    }

    public void setRightRezServiceSoap12WSDDServiceName(java.lang.String name) {
        RightRezServiceSoap12WSDDServiceName = name;
    }

    public com.rightrez.RightRezServiceSoap getRightRezServiceSoap12() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RightRezServiceSoap12_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRightRezServiceSoap12(endpoint);
    }

    public com.rightrez.RightRezServiceSoap getRightRezServiceSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.rightrez.RightRezServiceSoap12Stub _stub = new com.rightrez.RightRezServiceSoap12Stub(portAddress, this);
            _stub.setPortName(getRightRezServiceSoap12WSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRightRezServiceSoap12EndpointAddress(java.lang.String address) {
        RightRezServiceSoap12_address = address;
    }


    // Use to get a proxy class for RightRezServiceSoap
    private java.lang.String RightRezServiceSoap_address = "http://localhost:51436/WebServices/RightRezService.asmx";

    public java.lang.String getRightRezServiceSoapAddress() {
        return RightRezServiceSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private java.lang.String RightRezServiceSoapWSDDServiceName = "RightRezServiceSoap";

    public java.lang.String getRightRezServiceSoapWSDDServiceName() {
        return RightRezServiceSoapWSDDServiceName;
    }

    public void setRightRezServiceSoapWSDDServiceName(java.lang.String name) {
        RightRezServiceSoapWSDDServiceName = name;
    }

    public com.rightrez.RightRezServiceSoap getRightRezServiceSoap() throws javax.xml.rpc.ServiceException {
       java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(RightRezServiceSoap_address);
        }
        catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getRightRezServiceSoap(endpoint);
    }

    public com.rightrez.RightRezServiceSoap getRightRezServiceSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            com.rightrez.RightRezServiceSoapStub _stub = new com.rightrez.RightRezServiceSoapStub(portAddress, this);
            _stub.setPortName(getRightRezServiceSoapWSDDServiceName());
            return _stub;
        }
        catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setRightRezServiceSoapEndpointAddress(java.lang.String address) {
        RightRezServiceSoap_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (com.rightrez.RightRezServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.rightrez.RightRezServiceSoap12Stub _stub = new com.rightrez.RightRezServiceSoap12Stub(new java.net.URL(RightRezServiceSoap12_address), this);
                _stub.setPortName(getRightRezServiceSoap12WSDDServiceName());
                return _stub;
            }
            if (com.rightrez.RightRezServiceSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                com.rightrez.RightRezServiceSoapStub _stub = new com.rightrez.RightRezServiceSoapStub(new java.net.URL(RightRezServiceSoap_address), this);
                _stub.setPortName(getRightRezServiceSoapWSDDServiceName());
                return _stub;
            }
        }
        catch (java.lang.Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        java.lang.String inputPortName = portName.getLocalPart();
        if ("RightRezServiceSoap12".equals(inputPortName)) {
            return getRightRezServiceSoap12();
        }
        else if ("RightRezServiceSoap".equals(inputPortName)) {
            return getRightRezServiceSoap();
        }
        else  {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://rightrez.com/", "RightRezService");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://rightrez.com/", "RightRezServiceSoap12"));
            ports.add(new javax.xml.namespace.QName("http://rightrez.com/", "RightRezServiceSoap"));
        }
        return ports.iterator();
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(java.lang.String portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        
if ("RightRezServiceSoap12".equals(portName)) {
            setRightRezServiceSoap12EndpointAddress(address);
        }
        else 
if ("RightRezServiceSoap".equals(portName)) {
            setRightRezServiceSoapEndpointAddress(address);
        }
        else 
{ // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
    * Set the endpoint address for the specified port name.
    */
    public void setEndpointAddress(javax.xml.namespace.QName portName, java.lang.String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
