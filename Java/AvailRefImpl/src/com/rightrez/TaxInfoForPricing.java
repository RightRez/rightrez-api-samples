/**
 * TaxInfoForPricing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class TaxInfoForPricing  implements java.io.Serializable {
    private java.lang.String taxDesignator;

    private java.lang.String taxNature;

    private com.rightrez.MoneyAmount taxAmount;

    public TaxInfoForPricing() {
    }

    public TaxInfoForPricing(
           java.lang.String taxDesignator,
           java.lang.String taxNature,
           com.rightrez.MoneyAmount taxAmount) {
           this.taxDesignator = taxDesignator;
           this.taxNature = taxNature;
           this.taxAmount = taxAmount;
    }


    /**
     * Gets the taxDesignator value for this TaxInfoForPricing.
     * 
     * @return taxDesignator
     */
    public java.lang.String getTaxDesignator() {
        return taxDesignator;
    }


    /**
     * Sets the taxDesignator value for this TaxInfoForPricing.
     * 
     * @param taxDesignator
     */
    public void setTaxDesignator(java.lang.String taxDesignator) {
        this.taxDesignator = taxDesignator;
    }


    /**
     * Gets the taxNature value for this TaxInfoForPricing.
     * 
     * @return taxNature
     */
    public java.lang.String getTaxNature() {
        return taxNature;
    }


    /**
     * Sets the taxNature value for this TaxInfoForPricing.
     * 
     * @param taxNature
     */
    public void setTaxNature(java.lang.String taxNature) {
        this.taxNature = taxNature;
    }


    /**
     * Gets the taxAmount value for this TaxInfoForPricing.
     * 
     * @return taxAmount
     */
    public com.rightrez.MoneyAmount getTaxAmount() {
        return taxAmount;
    }


    /**
     * Sets the taxAmount value for this TaxInfoForPricing.
     * 
     * @param taxAmount
     */
    public void setTaxAmount(com.rightrez.MoneyAmount taxAmount) {
        this.taxAmount = taxAmount;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TaxInfoForPricing)) return false;
        TaxInfoForPricing other = (TaxInfoForPricing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.taxDesignator==null && other.getTaxDesignator()==null) || 
             (this.taxDesignator!=null &&
              this.taxDesignator.equals(other.getTaxDesignator()))) &&
            ((this.taxNature==null && other.getTaxNature()==null) || 
             (this.taxNature!=null &&
              this.taxNature.equals(other.getTaxNature()))) &&
            ((this.taxAmount==null && other.getTaxAmount()==null) || 
             (this.taxAmount!=null &&
              this.taxAmount.equals(other.getTaxAmount())));
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
        if (getTaxDesignator() != null) {
            _hashCode += getTaxDesignator().hashCode();
        }
        if (getTaxNature() != null) {
            _hashCode += getTaxNature().hashCode();
        }
        if (getTaxAmount() != null) {
            _hashCode += getTaxAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TaxInfoForPricing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "TaxInfoForPricing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxDesignator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TaxDesignator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxNature");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TaxNature"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TaxAmount"));
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
