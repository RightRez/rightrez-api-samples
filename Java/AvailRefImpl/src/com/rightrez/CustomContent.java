/**
 * CustomContent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class CustomContent  implements java.io.Serializable {
    private java.lang.String contentName;

    private java.lang.String contentValue;

    public CustomContent() {
    }

    public CustomContent(
           java.lang.String contentName,
           java.lang.String contentValue) {
           this.contentName = contentName;
           this.contentValue = contentValue;
    }


    /**
     * Gets the contentName value for this CustomContent.
     * 
     * @return contentName
     */
    public java.lang.String getContentName() {
        return contentName;
    }


    /**
     * Sets the contentName value for this CustomContent.
     * 
     * @param contentName
     */
    public void setContentName(java.lang.String contentName) {
        this.contentName = contentName;
    }


    /**
     * Gets the contentValue value for this CustomContent.
     * 
     * @return contentValue
     */
    public java.lang.String getContentValue() {
        return contentValue;
    }


    /**
     * Sets the contentValue value for this CustomContent.
     * 
     * @param contentValue
     */
    public void setContentValue(java.lang.String contentValue) {
        this.contentValue = contentValue;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CustomContent)) return false;
        CustomContent other = (CustomContent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.contentName==null && other.getContentName()==null) || 
             (this.contentName!=null &&
              this.contentName.equals(other.getContentName()))) &&
            ((this.contentValue==null && other.getContentValue()==null) || 
             (this.contentValue!=null &&
              this.contentValue.equals(other.getContentValue())));
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
        if (getContentName() != null) {
            _hashCode += getContentName().hashCode();
        }
        if (getContentValue() != null) {
            _hashCode += getContentValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CustomContent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "CustomContent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ContentName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ContentValue"));
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
