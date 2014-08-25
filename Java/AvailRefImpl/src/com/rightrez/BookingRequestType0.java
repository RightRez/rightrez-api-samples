/**
 * BookingRequestType0.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class BookingRequestType0  implements java.io.Serializable {
    private com.rightrez.BookingRequest bookingRequest;

    public BookingRequestType0() {
    }

    public BookingRequestType0(
           com.rightrez.BookingRequest bookingRequest) {
           this.bookingRequest = bookingRequest;
    }


    /**
     * Gets the bookingRequest value for this BookingRequestType0.
     * 
     * @return bookingRequest
     */
    public com.rightrez.BookingRequest getBookingRequest() {
        return bookingRequest;
    }


    /**
     * Sets the bookingRequest value for this BookingRequestType0.
     * 
     * @param bookingRequest
     */
    public void setBookingRequest(com.rightrez.BookingRequest bookingRequest) {
        this.bookingRequest = bookingRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookingRequestType0)) return false;
        BookingRequestType0 other = (BookingRequestType0) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bookingRequest==null && other.getBookingRequest()==null) || 
             (this.bookingRequest!=null &&
              this.bookingRequest.equals(other.getBookingRequest())));
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
        if (getBookingRequest() != null) {
            _hashCode += getBookingRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookingRequestType0.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", ">BookingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "bookingRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "BookingRequest"));
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
