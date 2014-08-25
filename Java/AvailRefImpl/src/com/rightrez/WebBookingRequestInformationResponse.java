/**
 * WebBookingRequestInformationResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class WebBookingRequestInformationResponse  implements java.io.Serializable {
    private int webBookingRequestInformationResult;

    public WebBookingRequestInformationResponse() {
    }

    public WebBookingRequestInformationResponse(
           int webBookingRequestInformationResult) {
           this.webBookingRequestInformationResult = webBookingRequestInformationResult;
    }


    /**
     * Gets the webBookingRequestInformationResult value for this WebBookingRequestInformationResponse.
     * 
     * @return webBookingRequestInformationResult
     */
    public int getWebBookingRequestInformationResult() {
        return webBookingRequestInformationResult;
    }


    /**
     * Sets the webBookingRequestInformationResult value for this WebBookingRequestInformationResponse.
     * 
     * @param webBookingRequestInformationResult
     */
    public void setWebBookingRequestInformationResult(int webBookingRequestInformationResult) {
        this.webBookingRequestInformationResult = webBookingRequestInformationResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebBookingRequestInformationResponse)) return false;
        WebBookingRequestInformationResponse other = (WebBookingRequestInformationResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.webBookingRequestInformationResult == other.getWebBookingRequestInformationResult();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getWebBookingRequestInformationResult();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebBookingRequestInformationResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", ">WebBookingRequestInformationResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("webBookingRequestInformationResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "WebBookingRequestInformationResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
