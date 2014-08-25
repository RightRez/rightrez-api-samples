/**
 * StopCity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class StopCity  implements java.io.Serializable {
    private java.lang.String airportCode;

    private java.util.Calendar arriveTime;

    private java.util.Calendar departTime;

    public StopCity() {
    }

    public StopCity(
           java.lang.String airportCode,
           java.util.Calendar arriveTime,
           java.util.Calendar departTime) {
           this.airportCode = airportCode;
           this.arriveTime = arriveTime;
           this.departTime = departTime;
    }


    /**
     * Gets the airportCode value for this StopCity.
     * 
     * @return airportCode
     */
    public java.lang.String getAirportCode() {
        return airportCode;
    }


    /**
     * Sets the airportCode value for this StopCity.
     * 
     * @param airportCode
     */
    public void setAirportCode(java.lang.String airportCode) {
        this.airportCode = airportCode;
    }


    /**
     * Gets the arriveTime value for this StopCity.
     * 
     * @return arriveTime
     */
    public java.util.Calendar getArriveTime() {
        return arriveTime;
    }


    /**
     * Sets the arriveTime value for this StopCity.
     * 
     * @param arriveTime
     */
    public void setArriveTime(java.util.Calendar arriveTime) {
        this.arriveTime = arriveTime;
    }


    /**
     * Gets the departTime value for this StopCity.
     * 
     * @return departTime
     */
    public java.util.Calendar getDepartTime() {
        return departTime;
    }


    /**
     * Sets the departTime value for this StopCity.
     * 
     * @param departTime
     */
    public void setDepartTime(java.util.Calendar departTime) {
        this.departTime = departTime;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StopCity)) return false;
        StopCity other = (StopCity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.airportCode==null && other.getAirportCode()==null) || 
             (this.airportCode!=null &&
              this.airportCode.equals(other.getAirportCode()))) &&
            ((this.arriveTime==null && other.getArriveTime()==null) || 
             (this.arriveTime!=null &&
              this.arriveTime.equals(other.getArriveTime()))) &&
            ((this.departTime==null && other.getDepartTime()==null) || 
             (this.departTime!=null &&
              this.departTime.equals(other.getDepartTime())));
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
        if (getAirportCode() != null) {
            _hashCode += getAirportCode().hashCode();
        }
        if (getArriveTime() != null) {
            _hashCode += getArriveTime().hashCode();
        }
        if (getDepartTime() != null) {
            _hashCode += getDepartTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StopCity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "StopCity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airportCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AirportCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arriveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ArriveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DepartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
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
