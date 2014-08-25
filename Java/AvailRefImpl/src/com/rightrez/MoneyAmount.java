/**
 * MoneyAmount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class MoneyAmount  implements java.io.Serializable {
    private int minorUnits;

    private com.rightrez.CurrencyInfo currencyInfo;

    public MoneyAmount() {
    }

    public MoneyAmount(
           int minorUnits,
           com.rightrez.CurrencyInfo currencyInfo) {
           this.minorUnits = minorUnits;
           this.currencyInfo = currencyInfo;
    }


    /**
     * Gets the minorUnits value for this MoneyAmount.
     * 
     * @return minorUnits
     */
    public int getMinorUnits() {
        return minorUnits;
    }


    /**
     * Sets the minorUnits value for this MoneyAmount.
     * 
     * @param minorUnits
     */
    public void setMinorUnits(int minorUnits) {
        this.minorUnits = minorUnits;
    }


    /**
     * Gets the currencyInfo value for this MoneyAmount.
     * 
     * @return currencyInfo
     */
    public com.rightrez.CurrencyInfo getCurrencyInfo() {
        return currencyInfo;
    }


    /**
     * Sets the currencyInfo value for this MoneyAmount.
     * 
     * @param currencyInfo
     */
    public void setCurrencyInfo(com.rightrez.CurrencyInfo currencyInfo) {
        this.currencyInfo = currencyInfo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof MoneyAmount)) return false;
        MoneyAmount other = (MoneyAmount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.minorUnits == other.getMinorUnits() &&
            ((this.currencyInfo==null && other.getCurrencyInfo()==null) || 
             (this.currencyInfo!=null &&
              this.currencyInfo.equals(other.getCurrencyInfo())));
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
        _hashCode += getMinorUnits();
        if (getCurrencyInfo() != null) {
            _hashCode += getCurrencyInfo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MoneyAmount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minorUnits");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "MinorUnits"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CurrencyInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "CurrencyInfo"));
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
