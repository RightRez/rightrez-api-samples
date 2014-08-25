/**
 * BookingResponseComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class BookingResponseComponent  implements java.io.Serializable {
    private com.rightrez.TripDirectionType tripType;

    private boolean succeeded;

    private com.rightrez.FlightInfo flightSold;

    private int componentUniqueKey;

    public BookingResponseComponent() {
    }

    public BookingResponseComponent(
           com.rightrez.TripDirectionType tripType,
           boolean succeeded,
           com.rightrez.FlightInfo flightSold,
           int componentUniqueKey) {
           this.tripType = tripType;
           this.succeeded = succeeded;
           this.flightSold = flightSold;
           this.componentUniqueKey = componentUniqueKey;
    }


    /**
     * Gets the tripType value for this BookingResponseComponent.
     * 
     * @return tripType
     */
    public com.rightrez.TripDirectionType getTripType() {
        return tripType;
    }


    /**
     * Sets the tripType value for this BookingResponseComponent.
     * 
     * @param tripType
     */
    public void setTripType(com.rightrez.TripDirectionType tripType) {
        this.tripType = tripType;
    }


    /**
     * Gets the succeeded value for this BookingResponseComponent.
     * 
     * @return succeeded
     */
    public boolean isSucceeded() {
        return succeeded;
    }


    /**
     * Sets the succeeded value for this BookingResponseComponent.
     * 
     * @param succeeded
     */
    public void setSucceeded(boolean succeeded) {
        this.succeeded = succeeded;
    }


    /**
     * Gets the flightSold value for this BookingResponseComponent.
     * 
     * @return flightSold
     */
    public com.rightrez.FlightInfo getFlightSold() {
        return flightSold;
    }


    /**
     * Sets the flightSold value for this BookingResponseComponent.
     * 
     * @param flightSold
     */
    public void setFlightSold(com.rightrez.FlightInfo flightSold) {
        this.flightSold = flightSold;
    }


    /**
     * Gets the componentUniqueKey value for this BookingResponseComponent.
     * 
     * @return componentUniqueKey
     */
    public int getComponentUniqueKey() {
        return componentUniqueKey;
    }


    /**
     * Sets the componentUniqueKey value for this BookingResponseComponent.
     * 
     * @param componentUniqueKey
     */
    public void setComponentUniqueKey(int componentUniqueKey) {
        this.componentUniqueKey = componentUniqueKey;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookingResponseComponent)) return false;
        BookingResponseComponent other = (BookingResponseComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tripType==null && other.getTripType()==null) || 
             (this.tripType!=null &&
              this.tripType.equals(other.getTripType()))) &&
            this.succeeded == other.isSucceeded() &&
            ((this.flightSold==null && other.getFlightSold()==null) || 
             (this.flightSold!=null &&
              this.flightSold.equals(other.getFlightSold()))) &&
            this.componentUniqueKey == other.getComponentUniqueKey();
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
        if (getTripType() != null) {
            _hashCode += getTripType().hashCode();
        }
        _hashCode += (isSucceeded() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFlightSold() != null) {
            _hashCode += getFlightSold().hashCode();
        }
        _hashCode += getComponentUniqueKey();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookingResponseComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "BookingResponseComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tripType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TripType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "TripDirectionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("succeeded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Succeeded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightSold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FlightSold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentUniqueKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ComponentUniqueKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
