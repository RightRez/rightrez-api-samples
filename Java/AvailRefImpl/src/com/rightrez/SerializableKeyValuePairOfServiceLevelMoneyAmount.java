/**
 * SerializableKeyValuePairOfServiceLevelMoneyAmount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class SerializableKeyValuePairOfServiceLevelMoneyAmount  implements java.io.Serializable {
    private com.rightrez.ServiceLevel key;

    private com.rightrez.MoneyAmount value;

    public SerializableKeyValuePairOfServiceLevelMoneyAmount() {
    }

    public SerializableKeyValuePairOfServiceLevelMoneyAmount(
           com.rightrez.ServiceLevel key,
           com.rightrez.MoneyAmount value) {
           this.key = key;
           this.value = value;
    }


    /**
     * Gets the key value for this SerializableKeyValuePairOfServiceLevelMoneyAmount.
     * 
     * @return key
     */
    public com.rightrez.ServiceLevel getKey() {
        return key;
    }


    /**
     * Sets the key value for this SerializableKeyValuePairOfServiceLevelMoneyAmount.
     * 
     * @param key
     */
    public void setKey(com.rightrez.ServiceLevel key) {
        this.key = key;
    }


    /**
     * Gets the value value for this SerializableKeyValuePairOfServiceLevelMoneyAmount.
     * 
     * @return value
     */
    public com.rightrez.MoneyAmount getValue() {
        return value;
    }


    /**
     * Sets the value value for this SerializableKeyValuePairOfServiceLevelMoneyAmount.
     * 
     * @param value
     */
    public void setValue(com.rightrez.MoneyAmount value) {
        this.value = value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SerializableKeyValuePairOfServiceLevelMoneyAmount)) return false;
        SerializableKeyValuePairOfServiceLevelMoneyAmount other = (SerializableKeyValuePairOfServiceLevelMoneyAmount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.key==null && other.getKey()==null) || 
             (this.key!=null &&
              this.key.equals(other.getKey()))) &&
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
        if (getKey() != null) {
            _hashCode += getKey().hashCode();
        }
        if (getValue() != null) {
            _hashCode += getValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SerializableKeyValuePairOfServiceLevelMoneyAmount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfServiceLevelMoneyAmount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("key");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Key"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "ServiceLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Value"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
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
