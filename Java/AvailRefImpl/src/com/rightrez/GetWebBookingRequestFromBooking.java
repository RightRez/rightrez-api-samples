/**
 * GetWebBookingRequestFromBooking.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class GetWebBookingRequestFromBooking  implements java.io.Serializable {
    private java.lang.String bookingNumber;

    public GetWebBookingRequestFromBooking() {
    }

    public GetWebBookingRequestFromBooking(
           java.lang.String bookingNumber) {
           this.bookingNumber = bookingNumber;
    }


    /**
     * Gets the bookingNumber value for this GetWebBookingRequestFromBooking.
     * 
     * @return bookingNumber
     */
    public java.lang.String getBookingNumber() {
        return bookingNumber;
    }


    /**
     * Sets the bookingNumber value for this GetWebBookingRequestFromBooking.
     * 
     * @param bookingNumber
     */
    public void setBookingNumber(java.lang.String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWebBookingRequestFromBooking)) return false;
        GetWebBookingRequestFromBooking other = (GetWebBookingRequestFromBooking) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bookingNumber==null && other.getBookingNumber()==null) || 
             (this.bookingNumber!=null &&
              this.bookingNumber.equals(other.getBookingNumber())));
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
        if (getBookingNumber() != null) {
            _hashCode += getBookingNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWebBookingRequestFromBooking.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", ">GetWebBookingRequestFromBooking"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "bookingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
