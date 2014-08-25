/**
 * AvailabilityTuning.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class AvailabilityTuning  implements java.io.Serializable {
    private java.math.BigDecimal carrierDiversityWeight;

    private java.math.BigDecimal requestedFlightWeight;

    private java.math.BigDecimal visaRestrictionWeight;

    private java.math.BigDecimal optionCountWeight;

    public AvailabilityTuning() {
    }

    public AvailabilityTuning(
           java.math.BigDecimal carrierDiversityWeight,
           java.math.BigDecimal requestedFlightWeight,
           java.math.BigDecimal visaRestrictionWeight,
           java.math.BigDecimal optionCountWeight) {
           this.carrierDiversityWeight = carrierDiversityWeight;
           this.requestedFlightWeight = requestedFlightWeight;
           this.visaRestrictionWeight = visaRestrictionWeight;
           this.optionCountWeight = optionCountWeight;
    }


    /**
     * Gets the carrierDiversityWeight value for this AvailabilityTuning.
     * 
     * @return carrierDiversityWeight
     */
    public java.math.BigDecimal getCarrierDiversityWeight() {
        return carrierDiversityWeight;
    }


    /**
     * Sets the carrierDiversityWeight value for this AvailabilityTuning.
     * 
     * @param carrierDiversityWeight
     */
    public void setCarrierDiversityWeight(java.math.BigDecimal carrierDiversityWeight) {
        this.carrierDiversityWeight = carrierDiversityWeight;
    }


    /**
     * Gets the requestedFlightWeight value for this AvailabilityTuning.
     * 
     * @return requestedFlightWeight
     */
    public java.math.BigDecimal getRequestedFlightWeight() {
        return requestedFlightWeight;
    }


    /**
     * Sets the requestedFlightWeight value for this AvailabilityTuning.
     * 
     * @param requestedFlightWeight
     */
    public void setRequestedFlightWeight(java.math.BigDecimal requestedFlightWeight) {
        this.requestedFlightWeight = requestedFlightWeight;
    }


    /**
     * Gets the visaRestrictionWeight value for this AvailabilityTuning.
     * 
     * @return visaRestrictionWeight
     */
    public java.math.BigDecimal getVisaRestrictionWeight() {
        return visaRestrictionWeight;
    }


    /**
     * Sets the visaRestrictionWeight value for this AvailabilityTuning.
     * 
     * @param visaRestrictionWeight
     */
    public void setVisaRestrictionWeight(java.math.BigDecimal visaRestrictionWeight) {
        this.visaRestrictionWeight = visaRestrictionWeight;
    }


    /**
     * Gets the optionCountWeight value for this AvailabilityTuning.
     * 
     * @return optionCountWeight
     */
    public java.math.BigDecimal getOptionCountWeight() {
        return optionCountWeight;
    }


    /**
     * Sets the optionCountWeight value for this AvailabilityTuning.
     * 
     * @param optionCountWeight
     */
    public void setOptionCountWeight(java.math.BigDecimal optionCountWeight) {
        this.optionCountWeight = optionCountWeight;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailabilityTuning)) return false;
        AvailabilityTuning other = (AvailabilityTuning) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carrierDiversityWeight==null && other.getCarrierDiversityWeight()==null) || 
             (this.carrierDiversityWeight!=null &&
              this.carrierDiversityWeight.equals(other.getCarrierDiversityWeight()))) &&
            ((this.requestedFlightWeight==null && other.getRequestedFlightWeight()==null) || 
             (this.requestedFlightWeight!=null &&
              this.requestedFlightWeight.equals(other.getRequestedFlightWeight()))) &&
            ((this.visaRestrictionWeight==null && other.getVisaRestrictionWeight()==null) || 
             (this.visaRestrictionWeight!=null &&
              this.visaRestrictionWeight.equals(other.getVisaRestrictionWeight()))) &&
            ((this.optionCountWeight==null && other.getOptionCountWeight()==null) || 
             (this.optionCountWeight!=null &&
              this.optionCountWeight.equals(other.getOptionCountWeight())));
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
        if (getCarrierDiversityWeight() != null) {
            _hashCode += getCarrierDiversityWeight().hashCode();
        }
        if (getRequestedFlightWeight() != null) {
            _hashCode += getRequestedFlightWeight().hashCode();
        }
        if (getVisaRestrictionWeight() != null) {
            _hashCode += getVisaRestrictionWeight().hashCode();
        }
        if (getOptionCountWeight() != null) {
            _hashCode += getOptionCountWeight().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvailabilityTuning.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityTuning"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierDiversityWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CarrierDiversityWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedFlightWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "RequestedFlightWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("visaRestrictionWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "VisaRestrictionWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("optionCountWeight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "OptionCountWeight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
