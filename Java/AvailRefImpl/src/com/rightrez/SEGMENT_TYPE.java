/**
 * SEGMENT_TYPE.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class SEGMENT_TYPE implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SEGMENT_TYPE(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _ARNK_SEGMENT = "ARNK_SEGMENT";
    public static final java.lang.String _AIR_SEGMENT = "AIR_SEGMENT";
    public static final java.lang.String _CAR_SEGMENT = "CAR_SEGMENT";
    public static final java.lang.String _HOTEL_SEGMENT = "HOTEL_SEGMENT";
    public static final java.lang.String _TRAIN_SEGMENT = "TRAIN_SEGMENT";
    public static final java.lang.String _TUR_SEGMENT = "TUR_SEGMENT";
    public static final java.lang.String _LIMO_SEGMENT = "LIMO_SEGMENT";
    public static final java.lang.String _OTH_SEGMENT = "OTH_SEGMENT";
    public static final java.lang.String _GEN_SEGMENT = "GEN_SEGMENT";
    public static final java.lang.String _MIS_SEGMENT = "MIS_SEGMENT";
    public static final java.lang.String _UNKNOWN_SEGMENT = "UNKNOWN_SEGMENT";
    public static final SEGMENT_TYPE ARNK_SEGMENT = new SEGMENT_TYPE(_ARNK_SEGMENT);
    public static final SEGMENT_TYPE AIR_SEGMENT = new SEGMENT_TYPE(_AIR_SEGMENT);
    public static final SEGMENT_TYPE CAR_SEGMENT = new SEGMENT_TYPE(_CAR_SEGMENT);
    public static final SEGMENT_TYPE HOTEL_SEGMENT = new SEGMENT_TYPE(_HOTEL_SEGMENT);
    public static final SEGMENT_TYPE TRAIN_SEGMENT = new SEGMENT_TYPE(_TRAIN_SEGMENT);
    public static final SEGMENT_TYPE TUR_SEGMENT = new SEGMENT_TYPE(_TUR_SEGMENT);
    public static final SEGMENT_TYPE LIMO_SEGMENT = new SEGMENT_TYPE(_LIMO_SEGMENT);
    public static final SEGMENT_TYPE OTH_SEGMENT = new SEGMENT_TYPE(_OTH_SEGMENT);
    public static final SEGMENT_TYPE GEN_SEGMENT = new SEGMENT_TYPE(_GEN_SEGMENT);
    public static final SEGMENT_TYPE MIS_SEGMENT = new SEGMENT_TYPE(_MIS_SEGMENT);
    public static final SEGMENT_TYPE UNKNOWN_SEGMENT = new SEGMENT_TYPE(_UNKNOWN_SEGMENT);
    public java.lang.String getValue() { return _value_;}
    public static SEGMENT_TYPE fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        SEGMENT_TYPE enumeration = (SEGMENT_TYPE)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static SEGMENT_TYPE fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(SEGMENT_TYPE.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "SEGMENT_TYPE"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
