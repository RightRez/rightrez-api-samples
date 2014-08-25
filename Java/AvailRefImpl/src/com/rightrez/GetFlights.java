/**
 * GetFlights.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class GetFlights  implements java.io.Serializable {
    private com.rightrez.AvailabilityRequest availRequest;

    public GetFlights() {
    }

    public GetFlights(
           com.rightrez.AvailabilityRequest availRequest) {
           this.availRequest = availRequest;
    }


    /**
     * Gets the availRequest value for this GetFlights.
     * 
     * @return availRequest
     */
    public com.rightrez.AvailabilityRequest getAvailRequest() {
        return availRequest;
    }


    /**
     * Sets the availRequest value for this GetFlights.
     * 
     * @param availRequest
     */
    public void setAvailRequest(com.rightrez.AvailabilityRequest availRequest) {
        this.availRequest = availRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetFlights)) return false;
        GetFlights other = (GetFlights) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.availRequest==null && other.getAvailRequest()==null) || 
             (this.availRequest!=null &&
              this.availRequest.equals(other.getAvailRequest())));
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
        if (getAvailRequest() != null) {
            _hashCode += getAvailRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetFlights.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", ">GetFlights"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "availRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityRequest"));
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
