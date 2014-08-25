/**
 * ArriveAirport.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class ArriveAirport  implements java.io.Serializable {
    private java.util.Calendar arriveBefore;

    private java.util.Calendar arriveAfter;

    private java.util.Calendar arriveOptimal;

    private float timePenalty;

    private float pricePenalty;

    private java.lang.String airportCode;

    private boolean validateTimePrefs;

    private java.lang.String cityCode;

    public ArriveAirport() {
    }

    public ArriveAirport(
           java.util.Calendar arriveBefore,
           java.util.Calendar arriveAfter,
           java.util.Calendar arriveOptimal,
           float timePenalty,
           float pricePenalty,
           java.lang.String airportCode,
           boolean validateTimePrefs,
           java.lang.String cityCode) {
           this.arriveBefore = arriveBefore;
           this.arriveAfter = arriveAfter;
           this.arriveOptimal = arriveOptimal;
           this.timePenalty = timePenalty;
           this.pricePenalty = pricePenalty;
           this.airportCode = airportCode;
           this.validateTimePrefs = validateTimePrefs;
           this.cityCode = cityCode;
    }


    /**
     * Gets the arriveBefore value for this ArriveAirport.
     * 
     * @return arriveBefore
     */
    public java.util.Calendar getArriveBefore() {
        return arriveBefore;
    }


    /**
     * Sets the arriveBefore value for this ArriveAirport.
     * 
     * @param arriveBefore
     */
    public void setArriveBefore(java.util.Calendar arriveBefore) {
        this.arriveBefore = arriveBefore;
    }


    /**
     * Gets the arriveAfter value for this ArriveAirport.
     * 
     * @return arriveAfter
     */
    public java.util.Calendar getArriveAfter() {
        return arriveAfter;
    }


    /**
     * Sets the arriveAfter value for this ArriveAirport.
     * 
     * @param arriveAfter
     */
    public void setArriveAfter(java.util.Calendar arriveAfter) {
        this.arriveAfter = arriveAfter;
    }


    /**
     * Gets the arriveOptimal value for this ArriveAirport.
     * 
     * @return arriveOptimal
     */
    public java.util.Calendar getArriveOptimal() {
        return arriveOptimal;
    }


    /**
     * Sets the arriveOptimal value for this ArriveAirport.
     * 
     * @param arriveOptimal
     */
    public void setArriveOptimal(java.util.Calendar arriveOptimal) {
        this.arriveOptimal = arriveOptimal;
    }


    /**
     * Gets the timePenalty value for this ArriveAirport.
     * 
     * @return timePenalty
     */
    public float getTimePenalty() {
        return timePenalty;
    }


    /**
     * Sets the timePenalty value for this ArriveAirport.
     * 
     * @param timePenalty
     */
    public void setTimePenalty(float timePenalty) {
        this.timePenalty = timePenalty;
    }


    /**
     * Gets the pricePenalty value for this ArriveAirport.
     * 
     * @return pricePenalty
     */
    public float getPricePenalty() {
        return pricePenalty;
    }


    /**
     * Sets the pricePenalty value for this ArriveAirport.
     * 
     * @param pricePenalty
     */
    public void setPricePenalty(float pricePenalty) {
        this.pricePenalty = pricePenalty;
    }


    /**
     * Gets the airportCode value for this ArriveAirport.
     * 
     * @return airportCode
     */
    public java.lang.String getAirportCode() {
        return airportCode;
    }


    /**
     * Sets the airportCode value for this ArriveAirport.
     * 
     * @param airportCode
     */
    public void setAirportCode(java.lang.String airportCode) {
        this.airportCode = airportCode;
    }


    /**
     * Gets the validateTimePrefs value for this ArriveAirport.
     * 
     * @return validateTimePrefs
     */
    public boolean isValidateTimePrefs() {
        return validateTimePrefs;
    }


    /**
     * Sets the validateTimePrefs value for this ArriveAirport.
     * 
     * @param validateTimePrefs
     */
    public void setValidateTimePrefs(boolean validateTimePrefs) {
        this.validateTimePrefs = validateTimePrefs;
    }


    /**
     * Gets the cityCode value for this ArriveAirport.
     * 
     * @return cityCode
     */
    public java.lang.String getCityCode() {
        return cityCode;
    }


    /**
     * Sets the cityCode value for this ArriveAirport.
     * 
     * @param cityCode
     */
    public void setCityCode(java.lang.String cityCode) {
        this.cityCode = cityCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ArriveAirport)) return false;
        ArriveAirport other = (ArriveAirport) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.arriveBefore==null && other.getArriveBefore()==null) || 
             (this.arriveBefore!=null &&
              this.arriveBefore.equals(other.getArriveBefore()))) &&
            ((this.arriveAfter==null && other.getArriveAfter()==null) || 
             (this.arriveAfter!=null &&
              this.arriveAfter.equals(other.getArriveAfter()))) &&
            ((this.arriveOptimal==null && other.getArriveOptimal()==null) || 
             (this.arriveOptimal!=null &&
              this.arriveOptimal.equals(other.getArriveOptimal()))) &&
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
        if (getArriveBefore() != null) {
            _hashCode += getArriveBefore().hashCode();
        }
        if (getArriveAfter() != null) {
            _hashCode += getArriveAfter().hashCode();
        }
        if (getArriveOptimal() != null) {
            _hashCode += getArriveOptimal().hashCode();
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
        new org.apache.axis.description.TypeDesc(ArriveAirport.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "ArriveAirport"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arriveBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ArriveBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arriveAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ArriveAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arriveOptimal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ArriveOptimal"));
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
