/**
 * DepartAirport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class DepartAirport  implements java.io.Serializable {
    private java.util.Calendar departBefore;

    private java.util.Calendar departAfter;

    private java.util.Calendar departOptimal;

    private float timePenalty;

    private float pricePenalty;

    private java.lang.String airportCode;

    private boolean validateTimePrefs;

    private java.lang.String cityCode;

    public DepartAirport() {
    }

    public DepartAirport(
           java.util.Calendar departBefore,
           java.util.Calendar departAfter,
           java.util.Calendar departOptimal,
           float timePenalty,
           float pricePenalty,
           java.lang.String airportCode,
           boolean validateTimePrefs,
           java.lang.String cityCode) {
           this.departBefore = departBefore;
           this.departAfter = departAfter;
           this.departOptimal = departOptimal;
           this.timePenalty = timePenalty;
           this.pricePenalty = pricePenalty;
           this.airportCode = airportCode;
           this.validateTimePrefs = validateTimePrefs;
           this.cityCode = cityCode;
    }


    /**
     * Gets the departBefore value for this DepartAirport.
     * 
     * @return departBefore
     */
    public java.util.Calendar getDepartBefore() {
        return departBefore;
    }


    /**
     * Sets the departBefore value for this DepartAirport.
     * 
     * @param departBefore
     */
    public void setDepartBefore(java.util.Calendar departBefore) {
        this.departBefore = departBefore;
    }


    /**
     * Gets the departAfter value for this DepartAirport.
     * 
     * @return departAfter
     */
    public java.util.Calendar getDepartAfter() {
        return departAfter;
    }


    /**
     * Sets the departAfter value for this DepartAirport.
     * 
     * @param departAfter
     */
    public void setDepartAfter(java.util.Calendar departAfter) {
        this.departAfter = departAfter;
    }


    /**
     * Gets the departOptimal value for this DepartAirport.
     * 
     * @return departOptimal
     */
    public java.util.Calendar getDepartOptimal() {
        return departOptimal;
    }


    /**
     * Sets the departOptimal value for this DepartAirport.
     * 
     * @param departOptimal
     */
    public void setDepartOptimal(java.util.Calendar departOptimal) {
        this.departOptimal = departOptimal;
    }


    /**
     * Gets the timePenalty value for this DepartAirport.
     * 
     * @return timePenalty
     */
    public float getTimePenalty() {
        return timePenalty;
    }


    /**
     * Sets the timePenalty value for this DepartAirport.
     * 
     * @param timePenalty
     */
    public void setTimePenalty(float timePenalty) {
        this.timePenalty = timePenalty;
    }


    /**
     * Gets the pricePenalty value for this DepartAirport.
     * 
     * @return pricePenalty
     */
    public float getPricePenalty() {
        return pricePenalty;
    }


    /**
     * Sets the pricePenalty value for this DepartAirport.
     * 
     * @param pricePenalty
     */
    public void setPricePenalty(float pricePenalty) {
        this.pricePenalty = pricePenalty;
    }


    /**
     * Gets the airportCode value for this DepartAirport.
     * 
     * @return airportCode
     */
    public java.lang.String getAirportCode() {
        return airportCode;
    }


    /**
     * Sets the airportCode value for this DepartAirport.
     * 
     * @param airportCode
     */
    public void setAirportCode(java.lang.String airportCode) {
        this.airportCode = airportCode;
    }


    /**
     * Gets the validateTimePrefs value for this DepartAirport.
     * 
     * @return validateTimePrefs
     */
    public boolean isValidateTimePrefs() {
        return validateTimePrefs;
    }


    /**
     * Sets the validateTimePrefs value for this DepartAirport.
     * 
     * @param validateTimePrefs
     */
    public void setValidateTimePrefs(boolean validateTimePrefs) {
        this.validateTimePrefs = validateTimePrefs;
    }


    /**
     * Gets the cityCode value for this DepartAirport.
     * 
     * @return cityCode
     */
    public java.lang.String getCityCode() {
        return cityCode;
    }


    /**
     * Sets the cityCode value for this DepartAirport.
     * 
     * @param cityCode
     */
    public void setCityCode(java.lang.String cityCode) {
        this.cityCode = cityCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof DepartAirport)) return false;
        DepartAirport other = (DepartAirport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.departBefore==null && other.getDepartBefore()==null) || 
             (this.departBefore!=null &&
              this.departBefore.equals(other.getDepartBefore()))) &&
            ((this.departAfter==null && other.getDepartAfter()==null) || 
             (this.departAfter!=null &&
              this.departAfter.equals(other.getDepartAfter()))) &&
            ((this.departOptimal==null && other.getDepartOptimal()==null) || 
             (this.departOptimal!=null &&
              this.departOptimal.equals(other.getDepartOptimal()))) &&
            this.timePenalty == other.getTimePenalty() &&
            this.pricePenalty == other.getPricePenalty() &&
            ((this.airportCode==null && other.getAirportCode()==null) || 
             (this.airportCode!=null &&
              this.airportCode.equals(other.getAirportCode()))) &&
            this.validateTimePrefs == other.isValidateTimePrefs() &&
            ((this.cityCode==null && other.getCityCode()==null) || 
             (this.cityCode!=null &&
              this.cityCode.equals(other.getCityCode())));
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
        if (getDepartBefore() != null) {
            _hashCode += getDepartBefore().hashCode();
        }
        if (getDepartAfter() != null) {
            _hashCode += getDepartAfter().hashCode();
        }
        if (getDepartOptimal() != null) {
            _hashCode += getDepartOptimal().hashCode();
        }
        _hashCode += new Float(getTimePenalty()).hashCode();
        _hashCode += new Float(getPricePenalty()).hashCode();
        if (getAirportCode() != null) {
            _hashCode += getAirportCode().hashCode();
        }
        _hashCode += (isValidateTimePrefs() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCityCode() != null) {
            _hashCode += getCityCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(DepartAirport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "DepartAirport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DepartBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DepartAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departOptimal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DepartOptimal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timePenalty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TimePenalty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricePenalty");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PricePenalty"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airportCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AirportCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validateTimePrefs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ValidateTimePrefs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CityCode"));
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
