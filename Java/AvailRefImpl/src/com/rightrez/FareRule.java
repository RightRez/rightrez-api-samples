/**
 * FareRule.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class FareRule  implements java.io.Serializable {
    private java.lang.String categoryCode;

    private java.lang.String ruleTitle;

    private java.lang.String ruleContent;

    public FareRule() {
    }

    public FareRule(
           java.lang.String categoryCode,
           java.lang.String ruleTitle,
           java.lang.String ruleContent) {
           this.categoryCode = categoryCode;
           this.ruleTitle = ruleTitle;
           this.ruleContent = ruleContent;
    }


    /**
     * Gets the categoryCode value for this FareRule.
     * 
     * @return categoryCode
     */
    public java.lang.String getCategoryCode() {
        return categoryCode;
    }


    /**
     * Sets the categoryCode value for this FareRule.
     * 
     * @param categoryCode
     */
    public void setCategoryCode(java.lang.String categoryCode) {
        this.categoryCode = categoryCode;
    }


    /**
     * Gets the ruleTitle value for this FareRule.
     * 
     * @return ruleTitle
     */
    public java.lang.String getRuleTitle() {
        return ruleTitle;
    }


    /**
     * Sets the ruleTitle value for this FareRule.
     * 
     * @param ruleTitle
     */
    public void setRuleTitle(java.lang.String ruleTitle) {
        this.ruleTitle = ruleTitle;
    }


    /**
     * Gets the ruleContent value for this FareRule.
     * 
     * @return ruleContent
     */
    public java.lang.String getRuleContent() {
        return ruleContent;
    }


    /**
     * Sets the ruleContent value for this FareRule.
     * 
     * @param ruleContent
     */
    public void setRuleContent(java.lang.String ruleContent) {
        this.ruleContent = ruleContent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FareRule)) return false;
        FareRule other = (FareRule) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.categoryCode==null && other.getCategoryCode()==null) || 
             (this.categoryCode!=null &&
              this.categoryCode.equals(other.getCategoryCode()))) &&
            ((this.ruleTitle==null && other.getRuleTitle()==null) || 
             (this.ruleTitle!=null &&
              this.ruleTitle.equals(other.getRuleTitle()))) &&
            ((this.ruleContent==null && other.getRuleContent()==null) || 
             (this.ruleContent!=null &&
              this.ruleContent.equals(other.getRuleContent())));
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
        if (getCategoryCode() != null) {
            _hashCode += getCategoryCode().hashCode();
        }
        if (getRuleTitle() != null) {
            _hashCode += getRuleTitle().hashCode();
        }
        if (getRuleContent() != null) {
            _hashCode += getRuleContent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FareRule.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FareRule"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("categoryCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CategoryCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleTitle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "RuleTitle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ruleContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "RuleContent"));
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
