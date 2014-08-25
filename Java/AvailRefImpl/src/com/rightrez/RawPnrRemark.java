/**
 * RawPnrRemark.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class RawPnrRemark  implements java.io.Serializable {
    private int lineNumber;

    private java.lang.String qualifier;

    private java.lang.String text;

    private int referenceNumber;

    private boolean historical;

    public RawPnrRemark() {
    }

    public RawPnrRemark(
           int lineNumber,
           java.lang.String qualifier,
           java.lang.String text,
           int referenceNumber,
           boolean historical) {
           this.lineNumber = lineNumber;
           this.qualifier = qualifier;
           this.text = text;
           this.referenceNumber = referenceNumber;
           this.historical = historical;
    }


    /**
     * Gets the lineNumber value for this RawPnrRemark.
     * 
     * @return lineNumber
     */
    public int getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this RawPnrRemark.
     * 
     * @param lineNumber
     */
    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the qualifier value for this RawPnrRemark.
     * 
     * @return qualifier
     */
    public java.lang.String getQualifier() {
        return qualifier;
    }


    /**
     * Sets the qualifier value for this RawPnrRemark.
     * 
     * @param qualifier
     */
    public void setQualifier(java.lang.String qualifier) {
        this.qualifier = qualifier;
    }


    /**
     * Gets the text value for this RawPnrRemark.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this RawPnrRemark.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the referenceNumber value for this RawPnrRemark.
     * 
     * @return referenceNumber
     */
    public int getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this RawPnrRemark.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(int referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the historical value for this RawPnrRemark.
     * 
     * @return historical
     */
    public boolean isHistorical() {
        return historical;
    }


    /**
     * Sets the historical value for this RawPnrRemark.
     * 
     * @param historical
     */
    public void setHistorical(boolean historical) {
        this.historical = historical;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RawPnrRemark)) return false;
        RawPnrRemark other = (RawPnrRemark) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.lineNumber == other.getLineNumber() &&
            ((this.qualifier==null && other.getQualifier()==null) || 
             (this.qualifier!=null &&
              this.qualifier.equals(other.getQualifier()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            this.referenceNumber == other.getReferenceNumber() &&
            this.historical == other.isHistorical();
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
        _hashCode += getLineNumber();
        if (getQualifier() != null) {
            _hashCode += getQualifier().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        _hashCode += getReferenceNumber();
        _hashCode += (isHistorical() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RawPnrRemark.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawPnrRemark"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "LineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("qualifier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Qualifier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("text");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Text"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("historical");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Historical"));
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
