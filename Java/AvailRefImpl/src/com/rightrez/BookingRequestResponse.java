/**
 * BookingRequestResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class BookingRequestResponse  implements java.io.Serializable {
    private com.rightrez.BookingResponse bookingRequestResult;

    public BookingRequestResponse() {
    }

    public BookingRequestResponse(
           com.rightrez.BookingResponse bookingRequestResult) {
           this.bookingRequestResult = bookingRequestResult;
    }


    /**
     * Gets the bookingRequestResult value for this BookingRequestResponse.
     * 
     * @return bookingRequestResult
     */
    public com.rightrez.BookingResponse getBookingRequestResult() {
        return bookingRequestResult;
    }


    /**
     * Sets the bookingRequestResult value for this BookingRequestResponse.
     * 
     * @param bookingRequestResult
     */
    public void setBookingRequestResult(com.rightrez.BookingResponse bookingRequestResult) {
        this.bookingRequestResult = bookingRequestResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookingRequestResponse)) return false;
        BookingRequestResponse other = (BookingRequestResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bookingRequestResult==null && other.getBookingRequestResult()==null) || 
             (this.bookingRequestResult!=null &&
              this.bookingRequestResult.equals(other.getBookingRequestResult())));
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
        if (getBookingRequestResult() != null) {
            _hashCode += getBookingRequestResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookingRequestResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", ">BookingRequestResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingRequestResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BookingRequestResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "BookingResponse"));
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
