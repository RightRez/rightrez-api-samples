/**
 * SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip  implements java.io.Serializable {
    private int key;

    private com.rightrez.AvailabilityResponseRoundTrip value;

    public SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip() {
    }

    public SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip(
           int key,
           com.rightrez.AvailabilityResponseRoundTrip value) {
           this.key = key;
           this.value = value;
    }


    /**
     * Gets the key value for this SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip.
     * 
     * @return key
     */
    public int getKey() {
        return key;
    }


    /**
     * Sets the key value for this SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip.
     * 
     * @param key
     */
    public void setKey(int key) {
        this.key = key;
    }


    /**
     * Gets the value value for this SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip.
     * 
     * @return value
     */
    public com.rightrez.AvailabilityResponseRoundTrip getValue() {
        return value;
    }


    /**
     * Sets the value value for this SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip.
     * 
     * @param value
     */
    public void setValue(com.rightrez.AvailabilityResponseRoundTrip value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip)) return false;
        SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip other = (SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.key == other.getKey() &&
            ((this.value==null && other.getValue()==null) || 
             (this.value!=null &&
              this.value.equals(other.getValue())));
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
        _hashCode += getKey();
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityResponseRoundTrip"));
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
