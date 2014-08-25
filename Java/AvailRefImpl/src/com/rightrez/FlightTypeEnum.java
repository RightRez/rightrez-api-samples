/**
 * FlightTypeEnum.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class FlightTypeEnum implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected FlightTypeEnum(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _Nonstop = "Nonstop";
    public static final java.lang.String _Direct = "Direct";
    public static final java.lang.String _SingleOnline = "SingleOnline";
    public static final java.lang.String _DoubleOnline = "DoubleOnline";
    public static final java.lang.String _TripleOnline = "TripleOnline";
    public static final java.lang.String _SingleAlliance = "SingleAlliance";
    public static final java.lang.String _DoubleAlliance = "DoubleAlliance";
    public static final java.lang.String _TripleAlliance = "TripleAlliance";
    public static final java.lang.String _SingleInterline = "SingleInterline";
    public static final java.lang.String _DoubleInterline = "DoubleInterline";
    public static final java.lang.String _TripleInterline = "TripleInterline";
    public static final java.lang.String _Unknown = "Unknown";
    public static final FlightTypeEnum Nonstop = new FlightTypeEnum(_Nonstop);
    public static final FlightTypeEnum Direct = new FlightTypeEnum(_Direct);
    public static final FlightTypeEnum SingleOnline = new FlightTypeEnum(_SingleOnline);
    public static final FlightTypeEnum DoubleOnline = new FlightTypeEnum(_DoubleOnline);
    public static final FlightTypeEnum TripleOnline = new FlightTypeEnum(_TripleOnline);
    public static final FlightTypeEnum SingleAlliance = new FlightTypeEnum(_SingleAlliance);
    public static final FlightTypeEnum DoubleAlliance = new FlightTypeEnum(_DoubleAlliance);
    public static final FlightTypeEnum TripleAlliance = new FlightTypeEnum(_TripleAlliance);
    public static final FlightTypeEnum SingleInterline = new FlightTypeEnum(_SingleInterline);
    public static final FlightTypeEnum DoubleInterline = new FlightTypeEnum(_DoubleInterline);
    public static final FlightTypeEnum TripleInterline = new FlightTypeEnum(_TripleInterline);
    public static final FlightTypeEnum Unknown = new FlightTypeEnum(_Unknown);
    public java.lang.String getValue() { return _value_;}
    public static FlightTypeEnum fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        FlightTypeEnum enumeration = (FlightTypeEnum)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static FlightTypeEnum fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(FlightTypeEnum.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightTypeEnum"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
