/**
 * IsBookingNumberExistsResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class IsBookingNumberExistsResponse  implements java.io.Serializable {
    private boolean isBookingNumberExistsResult;

    public IsBookingNumberExistsResponse() {
    }

    public IsBookingNumberExistsResponse(
           boolean isBookingNumberExistsResult) {
           this.isBookingNumberExistsResult = isBookingNumberExistsResult;
    }


    /**
     * Gets the isBookingNumberExistsResult value for this IsBookingNumberExistsResponse.
     * 
     * @return isBookingNumberExistsResult
     */
    public boolean isIsBookingNumberExistsResult() {
        return isBookingNumberExistsResult;
    }


    /**
     * Sets the isBookingNumberExistsResult value for this IsBookingNumberExistsResponse.
     * 
     * @param isBookingNumberExistsResult
     */
    public void setIsBookingNumberExistsResult(boolean isBookingNumberExistsResult) {
        this.isBookingNumberExistsResult = isBookingNumberExistsResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof IsBookingNumberExistsResponse)) return false;
        IsBookingNumberExistsResponse other = (IsBookingNumberExistsResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.isBookingNumberExistsResult == other.isIsBookingNumberExistsResult();
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
        _hashCode += (isIsBookingNumberExistsResult() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IsBookingNumberExistsResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", ">IsBookingNumberExistsResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isBookingNumberExistsResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "IsBookingNumberExistsResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
