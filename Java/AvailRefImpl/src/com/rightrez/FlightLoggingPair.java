/**
 * FlightLoggingPair.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class FlightLoggingPair  implements java.io.Serializable {
    private com.rightrez.FlightValidationStatus status;

    private com.rightrez.FlightInfo[] flights;

    public FlightLoggingPair() {
    }

    public FlightLoggingPair(
           com.rightrez.FlightValidationStatus status,
           com.rightrez.FlightInfo[] flights) {
           this.status = status;
           this.flights = flights;
    }


    /**
     * Gets the status value for this FlightLoggingPair.
     * 
     * @return status
     */
    public com.rightrez.FlightValidationStatus getStatus() {
        return status;
    }


    /**
     * Sets the status value for this FlightLoggingPair.
     * 
     * @param status
     */
    public void setStatus(com.rightrez.FlightValidationStatus status) {
        this.status = status;
    }


    /**
     * Gets the flights value for this FlightLoggingPair.
     * 
     * @return flights
     */
    public com.rightrez.FlightInfo[] getFlights() {
        return flights;
    }


    /**
     * Sets the flights value for this FlightLoggingPair.
     * 
     * @param flights
     */
    public void setFlights(com.rightrez.FlightInfo[] flights) {
        this.flights = flights;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightLoggingPair)) return false;
        FlightLoggingPair other = (FlightLoggingPair) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.flights==null && other.getFlights()==null) || 
             (this.flights!=null &&
              java.util.Arrays.equals(this.flights, other.getFlights())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        if (getFlights() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlights());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlights(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightLoggingPair.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightLoggingPair"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightValidationStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Flights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "FlightInfo"));
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
