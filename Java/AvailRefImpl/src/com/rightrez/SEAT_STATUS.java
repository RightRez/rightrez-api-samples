/**
 * SEAT_STATUS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class SEAT_STATUS implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SEAT_STATUS(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _AVAILABLE = "AVAILABLE";
    public static final java.lang.String _OCCUPIED = "OCCUPIED";
    public static final java.lang.String _DOESNOTEXIST = "DOESNOTEXIST";
    public static final java.lang.String _BLOCKED = "BLOCKED";
    public static final java.lang.String _CONDITIONAL = "CONDITIONAL";
    public static final java.lang.String _UNKNOWN = "UNKNOWN";
    public static final SEAT_STATUS AVAILABLE = new SEAT_STATUS(_AVAILABLE);
    public static final SEAT_STATUS OCCUPIED = new SEAT_STATUS(_OCCUPIED);
    public static final SEAT_STATUS DOESNOTEXIST = new SEAT_STATUS(_DOESNOTEXIST);
    public static final SEAT_STATUS BLOCKED = new SEAT_STATUS(_BLOCKED);
    public static final SEAT_STATUS CONDITIONAL = new SEAT_STATUS(_CONDITIONAL);
    public static final SEAT_STATUS UNKNOWN = new SEAT_STATUS(_UNKNOWN);
    public java.lang.String getValue() { return _value_;}
    public static SEAT_STATUS fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SEAT_STATUS enumeration = (SEAT_STATUS)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SEAT_STATUS fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SEAT_STATUS.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "SEAT_STATUS"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
