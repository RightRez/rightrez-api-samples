/**
 * FlightValidationStatus.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class FlightValidationStatus implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FlightValidationStatus(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _None = "None";
    public static final java.lang.String _Valid = "Valid";
    public static final java.lang.String _ValidPublished = "ValidPublished";
    public static final java.lang.String _InvalidCancelled = "InvalidCancelled";
    public static final java.lang.String _InvalidDeparted = "InvalidDeparted";
    public static final java.lang.String _InvalidFlightNumber = "InvalidFlightNumber";
    public static final java.lang.String _InvalidGateway = "InvalidGateway";
    public static final java.lang.String _InvalidDestination = "InvalidDestination";
    public static final java.lang.String _InvalidMisconnect = "InvalidMisconnect";
    public static final java.lang.String _InvalidBlackout = "InvalidBlackout";
    public static final java.lang.String _InvalidRouting = "InvalidRouting";
    public static final java.lang.String _InvalidCarrier = "InvalidCarrier";
    public static final java.lang.String _InvalidNoPrice = "InvalidNoPrice";
    public static final java.lang.String _InvalidSoldOut = "InvalidSoldOut";
    public static final java.lang.String _InvalidDuplicate = "InvalidDuplicate";
    public static final java.lang.String _InvalidShortCircuit = "InvalidShortCircuit";
    public static final FlightValidationStatus None = new FlightValidationStatus(_None);
    public static final FlightValidationStatus Valid = new FlightValidationStatus(_Valid);
    public static final FlightValidationStatus ValidPublished = new FlightValidationStatus(_ValidPublished);
    public static final FlightValidationStatus InvalidCancelled = new FlightValidationStatus(_InvalidCancelled);
    public static final FlightValidationStatus InvalidDeparted = new FlightValidationStatus(_InvalidDeparted);
    public static final FlightValidationStatus InvalidFlightNumber = new FlightValidationStatus(_InvalidFlightNumber);
    public static final FlightValidationStatus InvalidGateway = new FlightValidationStatus(_InvalidGateway);
    public static final FlightValidationStatus InvalidDestination = new FlightValidationStatus(_InvalidDestination);
    public static final FlightValidationStatus InvalidMisconnect = new FlightValidationStatus(_InvalidMisconnect);
    public static final FlightValidationStatus InvalidBlackout = new FlightValidationStatus(_InvalidBlackout);
    public static final FlightValidationStatus InvalidRouting = new FlightValidationStatus(_InvalidRouting);
    public static final FlightValidationStatus InvalidCarrier = new FlightValidationStatus(_InvalidCarrier);
    public static final FlightValidationStatus InvalidNoPrice = new FlightValidationStatus(_InvalidNoPrice);
    public static final FlightValidationStatus InvalidSoldOut = new FlightValidationStatus(_InvalidSoldOut);
    public static final FlightValidationStatus InvalidDuplicate = new FlightValidationStatus(_InvalidDuplicate);
    public static final FlightValidationStatus InvalidShortCircuit = new FlightValidationStatus(_InvalidShortCircuit);
    public java.lang.String getValue() { return _value_;}
    public static FlightValidationStatus fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FlightValidationStatus enumeration = (FlightValidationStatus)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FlightValidationStatus fromString(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        return fromValue(value);
    }
    public boolean equals(java.lang.Object obj) {return (obj == this);}
    public int hashCode() { return toString().hashCode();}
    public java.lang.String toString() { return _value_;}
    public java.lang.Object readResolve() throws java.io.ObjectStreamException { return fromValue(_value_);}
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumSerializer(
            _javaType, _xmlType);
    }
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new org.apache.axis.encoding.ser.EnumDeserializer(
            _javaType, _xmlType);
    }
    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightValidationStatus.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightValidationStatus"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
