/**
 * RawOSI.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class RawOSI  implements java.io.Serializable {
    private java.lang.String carrier;

    private java.lang.String text;

    private int lineNumber;

    private int referenceNumber;

    private int segmentReference;

    private int passengerReference;

    public RawOSI() {
    }

    public RawOSI(
           java.lang.String carrier,
           java.lang.String text,
           int lineNumber,
           int referenceNumber,
           int segmentReference,
           int passengerReference) {
           this.carrier = carrier;
           this.text = text;
           this.lineNumber = lineNumber;
           this.referenceNumber = referenceNumber;
           this.segmentReference = segmentReference;
           this.passengerReference = passengerReference;
    }


    /**
     * Gets the carrier value for this RawOSI.
     * 
     * @return carrier
     */
    public java.lang.String getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this RawOSI.
     * 
     * @param carrier
     */
    public void setCarrier(java.lang.String carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the text value for this RawOSI.
     * 
     * @return text
     */
    public java.lang.String getText() {
        return text;
    }


    /**
     * Sets the text value for this RawOSI.
     * 
     * @param text
     */
    public void setText(java.lang.String text) {
        this.text = text;
    }


    /**
     * Gets the lineNumber value for this RawOSI.
     * 
     * @return lineNumber
     */
    public int getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this RawOSI.
     * 
     * @param lineNumber
     */
    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the referenceNumber value for this RawOSI.
     * 
     * @return referenceNumber
     */
    public int getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this RawOSI.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(int referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the segmentReference value for this RawOSI.
     * 
     * @return segmentReference
     */
    public int getSegmentReference() {
        return segmentReference;
    }


    /**
     * Sets the segmentReference value for this RawOSI.
     * 
     * @param segmentReference
     */
    public void setSegmentReference(int segmentReference) {
        this.segmentReference = segmentReference;
    }


    /**
     * Gets the passengerReference value for this RawOSI.
     * 
     * @return passengerReference
     */
    public int getPassengerReference() {
        return passengerReference;
    }


    /**
     * Sets the passengerReference value for this RawOSI.
     * 
     * @param passengerReference
     */
    public void setPassengerReference(int passengerReference) {
        this.passengerReference = passengerReference;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RawOSI)) return false;
        RawOSI other = (RawOSI) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            ((this.text==null && other.getText()==null) || 
             (this.text!=null &&
              this.text.equals(other.getText()))) &&
            this.lineNumber == other.getLineNumber() &&
            this.referenceNumber == other.getReferenceNumber() &&
            this.segmentReference == other.getSegmentReference() &&
            this.passengerReference == other.getPassengerReference();
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
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        if (getText() != null) {
            _hashCode += getText().hashCode();
        }
        _hashCode += getLineNumber();
        _hashCode += getReferenceNumber();
        _hashCode += getSegmentReference();
        _hashCode += getPassengerReference();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RawOSI.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawOSI"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Carrier"));
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
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "LineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "SegmentReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PassengerReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
