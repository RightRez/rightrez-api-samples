/**
 * PPLine.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class PPLine  implements java.io.Serializable {
    private java.util.Calendar entryDate;

    private java.math.BigDecimal baseFare;

    private java.math.BigDecimal markup;

    private java.math.BigDecimal taxes;

    private java.math.BigDecimal surcharges;

    private java.lang.String misc;

    public PPLine() {
    }

    public PPLine(
           java.util.Calendar entryDate,
           java.math.BigDecimal baseFare,
           java.math.BigDecimal markup,
           java.math.BigDecimal taxes,
           java.math.BigDecimal surcharges,
           java.lang.String misc) {
           this.entryDate = entryDate;
           this.baseFare = baseFare;
           this.markup = markup;
           this.taxes = taxes;
           this.surcharges = surcharges;
           this.misc = misc;
    }


    /**
     * Gets the entryDate value for this PPLine.
     * 
     * @return entryDate
     */
    public java.util.Calendar getEntryDate() {
        return entryDate;
    }


    /**
     * Sets the entryDate value for this PPLine.
     * 
     * @param entryDate
     */
    public void setEntryDate(java.util.Calendar entryDate) {
        this.entryDate = entryDate;
    }


    /**
     * Gets the baseFare value for this PPLine.
     * 
     * @return baseFare
     */
    public java.math.BigDecimal getBaseFare() {
        return baseFare;
    }


    /**
     * Sets the baseFare value for this PPLine.
     * 
     * @param baseFare
     */
    public void setBaseFare(java.math.BigDecimal baseFare) {
        this.baseFare = baseFare;
    }


    /**
     * Gets the markup value for this PPLine.
     * 
     * @return markup
     */
    public java.math.BigDecimal getMarkup() {
        return markup;
    }


    /**
     * Sets the markup value for this PPLine.
     * 
     * @param markup
     */
    public void setMarkup(java.math.BigDecimal markup) {
        this.markup = markup;
    }


    /**
     * Gets the taxes value for this PPLine.
     * 
     * @return taxes
     */
    public java.math.BigDecimal getTaxes() {
        return taxes;
    }


    /**
     * Sets the taxes value for this PPLine.
     * 
     * @param taxes
     */
    public void setTaxes(java.math.BigDecimal taxes) {
        this.taxes = taxes;
    }


    /**
     * Gets the surcharges value for this PPLine.
     * 
     * @return surcharges
     */
    public java.math.BigDecimal getSurcharges() {
        return surcharges;
    }


    /**
     * Sets the surcharges value for this PPLine.
     * 
     * @param surcharges
     */
    public void setSurcharges(java.math.BigDecimal surcharges) {
        this.surcharges = surcharges;
    }


    /**
     * Gets the misc value for this PPLine.
     * 
     * @return misc
     */
    public java.lang.String getMisc() {
        return misc;
    }


    /**
     * Sets the misc value for this PPLine.
     * 
     * @param misc
     */
    public void setMisc(java.lang.String misc) {
        this.misc = misc;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PPLine)) return false;
        PPLine other = (PPLine) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.entryDate==null && other.getEntryDate()==null) || 
             (this.entryDate!=null &&
              this.entryDate.equals(other.getEntryDate()))) &&
            ((this.baseFare==null && other.getBaseFare()==null) || 
             (this.baseFare!=null &&
              this.baseFare.equals(other.getBaseFare()))) &&
            ((this.markup==null && other.getMarkup()==null) || 
             (this.markup!=null &&
              this.markup.equals(other.getMarkup()))) &&
            ((this.taxes==null && other.getTaxes()==null) || 
             (this.taxes!=null &&
              this.taxes.equals(other.getTaxes()))) &&
            ((this.surcharges==null && other.getSurcharges()==null) || 
             (this.surcharges!=null &&
              this.surcharges.equals(other.getSurcharges()))) &&
            ((this.misc==null && other.getMisc()==null) || 
             (this.misc!=null &&
              this.misc.equals(other.getMisc())));
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
        if (getEntryDate() != null) {
            _hashCode += getEntryDate().hashCode();
        }
        if (getBaseFare() != null) {
            _hashCode += getBaseFare().hashCode();
        }
        if (getMarkup() != null) {
            _hashCode += getMarkup().hashCode();
        }
        if (getTaxes() != null) {
            _hashCode += getTaxes().hashCode();
        }
        if (getSurcharges() != null) {
            _hashCode += getSurcharges().hashCode();
        }
        if (getMisc() != null) {
            _hashCode += getMisc().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PPLine.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "PPLine"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("entryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "EntryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BaseFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("markup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Markup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Taxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("surcharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Surcharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("misc");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Misc"));
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
