/**
 * GetWebBookingRequestFromBookingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class GetWebBookingRequestFromBookingResponse  implements java.io.Serializable {
    private com.rightrez.CreatePNRRequest getWebBookingRequestFromBookingResult;

    public GetWebBookingRequestFromBookingResponse() {
    }

    public GetWebBookingRequestFromBookingResponse(
           com.rightrez.CreatePNRRequest getWebBookingRequestFromBookingResult) {
           this.getWebBookingRequestFromBookingResult = getWebBookingRequestFromBookingResult;
    }


    /**
     * Gets the getWebBookingRequestFromBookingResult value for this GetWebBookingRequestFromBookingResponse.
     * 
     * @return getWebBookingRequestFromBookingResult
     */
    public com.rightrez.CreatePNRRequest getGetWebBookingRequestFromBookingResult() {
        return getWebBookingRequestFromBookingResult;
    }


    /**
     * Sets the getWebBookingRequestFromBookingResult value for this GetWebBookingRequestFromBookingResponse.
     * 
     * @param getWebBookingRequestFromBookingResult
     */
    public void setGetWebBookingRequestFromBookingResult(com.rightrez.CreatePNRRequest getWebBookingRequestFromBookingResult) {
        this.getWebBookingRequestFromBookingResult = getWebBookingRequestFromBookingResult;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetWebBookingRequestFromBookingResponse)) return false;
        GetWebBookingRequestFromBookingResponse other = (GetWebBookingRequestFromBookingResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.getWebBookingRequestFromBookingResult==null && other.getGetWebBookingRequestFromBookingResult()==null) || 
             (this.getWebBookingRequestFromBookingResult!=null &&
              this.getWebBookingRequestFromBookingResult.equals(other.getGetWebBookingRequestFromBookingResult())));
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
        if (getGetWebBookingRequestFromBookingResult() != null) {
            _hashCode += getGetWebBookingRequestFromBookingResult().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetWebBookingRequestFromBookingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", ">GetWebBookingRequestFromBookingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getWebBookingRequestFromBookingResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "GetWebBookingRequestFromBookingResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "CreatePNRRequest"));
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
