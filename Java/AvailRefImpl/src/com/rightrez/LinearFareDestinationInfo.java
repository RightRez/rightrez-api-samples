/**
 * LinearFareDestinationInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class LinearFareDestinationInfo  implements java.io.Serializable {
    private java.lang.String cityCode;

    private boolean connectionPoint;

    private int lineNumber;

    private java.lang.String QAmount;

    private java.lang.String carrier;

    public LinearFareDestinationInfo() {
    }

    public LinearFareDestinationInfo(
           java.lang.String cityCode,
           boolean connectionPoint,
           int lineNumber,
           java.lang.String QAmount,
           java.lang.String carrier) {
           this.cityCode = cityCode;
           this.connectionPoint = connectionPoint;
           this.lineNumber = lineNumber;
           this.QAmount = QAmount;
           this.carrier = carrier;
    }


    /**
     * Gets the cityCode value for this LinearFareDestinationInfo.
     * 
     * @return cityCode
     */
    public java.lang.String getCityCode() {
        return cityCode;
    }


    /**
     * Sets the cityCode value for this LinearFareDestinationInfo.
     * 
     * @param cityCode
     */
    public void setCityCode(java.lang.String cityCode) {
        this.cityCode = cityCode;
    }


    /**
     * Gets the connectionPoint value for this LinearFareDestinationInfo.
     * 
     * @return connectionPoint
     */
    public boolean isConnectionPoint() {
        return connectionPoint;
    }


    /**
     * Sets the connectionPoint value for this LinearFareDestinationInfo.
     * 
     * @param connectionPoint
     */
    public void setConnectionPoint(boolean connectionPoint) {
        this.connectionPoint = connectionPoint;
    }


    /**
     * Gets the lineNumber value for this LinearFareDestinationInfo.
     * 
     * @return lineNumber
     */
    public int getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this LinearFareDestinationInfo.
     * 
     * @param lineNumber
     */
    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the QAmount value for this LinearFareDestinationInfo.
     * 
     * @return QAmount
     */
    public java.lang.String getQAmount() {
        return QAmount;
    }


    /**
     * Sets the QAmount value for this LinearFareDestinationInfo.
     * 
     * @param QAmount
     */
    public void setQAmount(java.lang.String QAmount) {
        this.QAmount = QAmount;
    }


    /**
     * Gets the carrier value for this LinearFareDestinationInfo.
     * 
     * @return carrier
     */
    public java.lang.String getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this LinearFareDestinationInfo.
     * 
     * @param carrier
     */
    public void setCarrier(java.lang.String carrier) {
        this.carrier = carrier;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof LinearFareDestinationInfo)) return false;
        LinearFareDestinationInfo other = (LinearFareDestinationInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.cityCode==null && other.getCityCode()==null) || 
             (this.cityCode!=null &&
              this.cityCode.equals(other.getCityCode()))) &&
            this.connectionPoint == other.isConnectionPoint() &&
            this.lineNumber == other.getLineNumber() &&
            ((this.QAmount==null && other.getQAmount()==null) || 
             (this.QAmount!=null &&
              this.QAmount.equals(other.getQAmount()))) &&
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier())));
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
        if (getCityCode() != null) {
            _hashCode += getCityCode().hashCode();
        }
        _hashCode += (isConnectionPoint() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getLineNumber();
        if (getQAmount() != null) {
            _hashCode += getQAmount().hashCode();
        }
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(LinearFareDestinationInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "LinearFareDestinationInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectionPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ConnectionPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "LineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "QAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Carrier"));
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
