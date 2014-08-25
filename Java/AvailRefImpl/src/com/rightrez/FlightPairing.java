/**
 * FlightPairing.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class FlightPairing  implements java.io.Serializable {
    private com.rightrez.FlightInfo outboundFlight;

    private com.rightrez.FlightInfo returnFlight;

    private com.rightrez.PricingInfo pricingInfo;

    private java.math.BigDecimal internalFlat;

    private java.math.BigDecimal internalPct;

    private java.lang.String internalMarkupLevel;

    private com.rightrez.MoneyAmount internalMarkup;

    private com.rightrez.MoneyAmount externalMarkup;

    private com.rightrez.MoneyAmount addCollect;

    private boolean priceAttempted;

    public FlightPairing() {
    }

    public FlightPairing(
           com.rightrez.FlightInfo outboundFlight,
           com.rightrez.FlightInfo returnFlight,
           com.rightrez.PricingInfo pricingInfo,
           java.math.BigDecimal internalFlat,
           java.math.BigDecimal internalPct,
           java.lang.String internalMarkupLevel,
           com.rightrez.MoneyAmount internalMarkup,
           com.rightrez.MoneyAmount externalMarkup,
           com.rightrez.MoneyAmount addCollect,
           boolean priceAttempted) {
           this.outboundFlight = outboundFlight;
           this.returnFlight = returnFlight;
           this.pricingInfo = pricingInfo;
           this.internalFlat = internalFlat;
           this.internalPct = internalPct;
           this.internalMarkupLevel = internalMarkupLevel;
           this.internalMarkup = internalMarkup;
           this.externalMarkup = externalMarkup;
           this.addCollect = addCollect;
           this.priceAttempted = priceAttempted;
    }


    /**
     * Gets the outboundFlight value for this FlightPairing.
     * 
     * @return outboundFlight
     */
    public com.rightrez.FlightInfo getOutboundFlight() {
        return outboundFlight;
    }


    /**
     * Sets the outboundFlight value for this FlightPairing.
     * 
     * @param outboundFlight
     */
    public void setOutboundFlight(com.rightrez.FlightInfo outboundFlight) {
        this.outboundFlight = outboundFlight;
    }


    /**
     * Gets the returnFlight value for this FlightPairing.
     * 
     * @return returnFlight
     */
    public com.rightrez.FlightInfo getReturnFlight() {
        return returnFlight;
    }


    /**
     * Sets the returnFlight value for this FlightPairing.
     * 
     * @param returnFlight
     */
    public void setReturnFlight(com.rightrez.FlightInfo returnFlight) {
        this.returnFlight = returnFlight;
    }


    /**
     * Gets the pricingInfo value for this FlightPairing.
     * 
     * @return pricingInfo
     */
    public com.rightrez.PricingInfo getPricingInfo() {
        return pricingInfo;
    }


    /**
     * Sets the pricingInfo value for this FlightPairing.
     * 
     * @param pricingInfo
     */
    public void setPricingInfo(com.rightrez.PricingInfo pricingInfo) {
        this.pricingInfo = pricingInfo;
    }


    /**
     * Gets the internalFlat value for this FlightPairing.
     * 
     * @return internalFlat
     */
    public java.math.BigDecimal getInternalFlat() {
        return internalFlat;
    }


    /**
     * Sets the internalFlat value for this FlightPairing.
     * 
     * @param internalFlat
     */
    public void setInternalFlat(java.math.BigDecimal internalFlat) {
        this.internalFlat = internalFlat;
    }


    /**
     * Gets the internalPct value for this FlightPairing.
     * 
     * @return internalPct
     */
    public java.math.BigDecimal getInternalPct() {
        return internalPct;
    }


    /**
     * Sets the internalPct value for this FlightPairing.
     * 
     * @param internalPct
     */
    public void setInternalPct(java.math.BigDecimal internalPct) {
        this.internalPct = internalPct;
    }


    /**
     * Gets the internalMarkupLevel value for this FlightPairing.
     * 
     * @return internalMarkupLevel
     */
    public java.lang.String getInternalMarkupLevel() {
        return internalMarkupLevel;
    }


    /**
     * Sets the internalMarkupLevel value for this FlightPairing.
     * 
     * @param internalMarkupLevel
     */
    public void setInternalMarkupLevel(java.lang.String internalMarkupLevel) {
        this.internalMarkupLevel = internalMarkupLevel;
    }


    /**
     * Gets the internalMarkup value for this FlightPairing.
     * 
     * @return internalMarkup
     */
    public com.rightrez.MoneyAmount getInternalMarkup() {
        return internalMarkup;
    }


    /**
     * Sets the internalMarkup value for this FlightPairing.
     * 
     * @param internalMarkup
     */
    public void setInternalMarkup(com.rightrez.MoneyAmount internalMarkup) {
        this.internalMarkup = internalMarkup;
    }


    /**
     * Gets the externalMarkup value for this FlightPairing.
     * 
     * @return externalMarkup
     */
    public com.rightrez.MoneyAmount getExternalMarkup() {
        return externalMarkup;
    }


    /**
     * Sets the externalMarkup value for this FlightPairing.
     * 
     * @param externalMarkup
     */
    public void setExternalMarkup(com.rightrez.MoneyAmount externalMarkup) {
        this.externalMarkup = externalMarkup;
    }


    /**
     * Gets the addCollect value for this FlightPairing.
     * 
     * @return addCollect
     */
    public com.rightrez.MoneyAmount getAddCollect() {
        return addCollect;
    }


    /**
     * Sets the addCollect value for this FlightPairing.
     * 
     * @param addCollect
     */
    public void setAddCollect(com.rightrez.MoneyAmount addCollect) {
        this.addCollect = addCollect;
    }


    /**
     * Gets the priceAttempted value for this FlightPairing.
     * 
     * @return priceAttempted
     */
    public boolean isPriceAttempted() {
        return priceAttempted;
    }


    /**
     * Sets the priceAttempted value for this FlightPairing.
     * 
     * @param priceAttempted
     */
    public void setPriceAttempted(boolean priceAttempted) {
        this.priceAttempted = priceAttempted;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightPairing)) return false;
        FlightPairing other = (FlightPairing) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.outboundFlight==null && other.getOutboundFlight()==null) || 
             (this.outboundFlight!=null &&
              this.outboundFlight.equals(other.getOutboundFlight()))) &&
            ((this.returnFlight==null && other.getReturnFlight()==null) || 
             (this.returnFlight!=null &&
              this.returnFlight.equals(other.getReturnFlight()))) &&
            ((this.pricingInfo==null && other.getPricingInfo()==null) || 
             (this.pricingInfo!=null &&
              this.pricingInfo.equals(other.getPricingInfo()))) &&
            ((this.internalFlat==null && other.getInternalFlat()==null) || 
             (this.internalFlat!=null &&
              this.internalFlat.equals(other.getInternalFlat()))) &&
            ((this.internalPct==null && other.getInternalPct()==null) || 
             (this.internalPct!=null &&
              this.internalPct.equals(other.getInternalPct()))) &&
            ((this.internalMarkupLevel==null && other.getInternalMarkupLevel()==null) || 
             (this.internalMarkupLevel!=null &&
              this.internalMarkupLevel.equals(other.getInternalMarkupLevel()))) &&
            ((this.internalMarkup==null && other.getInternalMarkup()==null) || 
             (this.internalMarkup!=null &&
              this.internalMarkup.equals(other.getInternalMarkup()))) &&
            ((this.externalMarkup==null && other.getExternalMarkup()==null) || 
             (this.externalMarkup!=null &&
              this.externalMarkup.equals(other.getExternalMarkup()))) &&
            ((this.addCollect==null && other.getAddCollect()==null) || 
             (this.addCollect!=null &&
              this.addCollect.equals(other.getAddCollect()))) &&
            this.priceAttempted == other.isPriceAttempted();
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
        if (getOutboundFlight() != null) {
            _hashCode += getOutboundFlight().hashCode();
        }
        if (getReturnFlight() != null) {
            _hashCode += getReturnFlight().hashCode();
        }
        if (getPricingInfo() != null) {
            _hashCode += getPricingInfo().hashCode();
        }
        if (getInternalFlat() != null) {
            _hashCode += getInternalFlat().hashCode();
        }
        if (getInternalPct() != null) {
            _hashCode += getInternalPct().hashCode();
        }
        if (getInternalMarkupLevel() != null) {
            _hashCode += getInternalMarkupLevel().hashCode();
        }
        if (getInternalMarkup() != null) {
            _hashCode += getInternalMarkup().hashCode();
        }
        if (getExternalMarkup() != null) {
            _hashCode += getExternalMarkup().hashCode();
        }
        if (getAddCollect() != null) {
            _hashCode += getAddCollect().hashCode();
        }
        _hashCode += (isPriceAttempted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightPairing.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightPairing"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("outboundFlight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "OutboundFlight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnFlight");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ReturnFlight"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PricingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "PricingInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalFlat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "InternalFlat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalPct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "InternalPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalMarkupLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "InternalMarkupLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalMarkup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "InternalMarkup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalMarkup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ExternalMarkup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addCollect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AddCollect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceAttempted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PriceAttempted"));
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
