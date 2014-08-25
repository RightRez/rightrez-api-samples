/**
 * RawSeat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class RawSeat  implements java.io.Serializable {
    private com.rightrez.RawPassengerName passenger;

    private java.lang.String seatText;

    public RawSeat() {
    }

    public RawSeat(
           com.rightrez.RawPassengerName passenger,
           java.lang.String seatText) {
           this.passenger = passenger;
           this.seatText = seatText;
    }


    /**
     * Gets the passenger value for this RawSeat.
     * 
     * @return passenger
     */
    public com.rightrez.RawPassengerName getPassenger() {
        return passenger;
    }


    /**
     * Sets the passenger value for this RawSeat.
     * 
     * @param passenger
     */
    public void setPassenger(com.rightrez.RawPassengerName passenger) {
        this.passenger = passenger;
    }


    /**
     * Gets the seatText value for this RawSeat.
     * 
     * @return seatText
     */
    public java.lang.String getSeatText() {
        return seatText;
    }


    /**
     * Sets the seatText value for this RawSeat.
     * 
     * @param seatText
     */
    public void setSeatText(java.lang.String seatText) {
        this.seatText = seatText;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RawSeat)) return false;
        RawSeat other = (RawSeat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.passenger==null && other.getPassenger()==null) || 
             (this.passenger!=null &&
              this.passenger.equals(other.getPassenger()))) &&
            ((this.seatText==null && other.getSeatText()==null) || 
             (this.seatText!=null &&
              this.seatText.equals(other.getSeatText())));
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
        if (getPassenger() != null) {
            _hashCode += getPassenger().hashCode();
        }
        if (getSeatText() != null) {
            _hashCode += getSeatText().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RawSeat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawSeat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passenger");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Passenger"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawPassengerName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seatText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "SeatText"));
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
