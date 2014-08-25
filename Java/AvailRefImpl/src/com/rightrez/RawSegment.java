/**
 * RawSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class RawSegment  implements java.io.Serializable {
    private int segmentNumber;

    private com.rightrez.SEGMENT_TYPE segmentType;

    private java.lang.String referenceNumber;

    private boolean isPlaceholder;

    public RawSegment() {
    }

    public RawSegment(
           int segmentNumber,
           com.rightrez.SEGMENT_TYPE segmentType,
           java.lang.String referenceNumber,
           boolean isPlaceholder) {
           this.segmentNumber = segmentNumber;
           this.segmentType = segmentType;
           this.referenceNumber = referenceNumber;
           this.isPlaceholder = isPlaceholder;
    }


    /**
     * Gets the segmentNumber value for this RawSegment.
     * 
     * @return segmentNumber
     */
    public int getSegmentNumber() {
        return segmentNumber;
    }


    /**
     * Sets the segmentNumber value for this RawSegment.
     * 
     * @param segmentNumber
     */
    public void setSegmentNumber(int segmentNumber) {
        this.segmentNumber = segmentNumber;
    }


    /**
     * Gets the segmentType value for this RawSegment.
     * 
     * @return segmentType
     */
    public com.rightrez.SEGMENT_TYPE getSegmentType() {
        return segmentType;
    }


    /**
     * Sets the segmentType value for this RawSegment.
     * 
     * @param segmentType
     */
    public void setSegmentType(com.rightrez.SEGMENT_TYPE segmentType) {
        this.segmentType = segmentType;
    }


    /**
     * Gets the referenceNumber value for this RawSegment.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this RawSegment.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the isPlaceholder value for this RawSegment.
     * 
     * @return isPlaceholder
     */
    public boolean isIsPlaceholder() {
        return isPlaceholder;
    }


    /**
     * Sets the isPlaceholder value for this RawSegment.
     * 
     * @param isPlaceholder
     */
    public void setIsPlaceholder(boolean isPlaceholder) {
        this.isPlaceholder = isPlaceholder;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RawSegment)) return false;
        RawSegment other = (RawSegment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.segmentNumber == other.getSegmentNumber() &&
            ((this.segmentType==null && other.getSegmentType()==null) || 
             (this.segmentType!=null &&
              this.segmentType.equals(other.getSegmentType()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            this.isPlaceholder == other.isIsPlaceholder();
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
        _hashCode += getSegmentNumber();
        if (getSegmentType() != null) {
            _hashCode += getSegmentType().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        _hashCode += (isIsPlaceholder() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RawSegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawSegment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "SegmentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "SegmentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "SEGMENT_TYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isPlaceholder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "IsPlaceholder"));
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
