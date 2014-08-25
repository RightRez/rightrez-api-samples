/**
 * PassportType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class PassportType implements java.io.Serializable {
    private java.lang.String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected PassportType(java.lang.String value) {
        _value_ = value;
        _table_.put(_value_,this);
    }

    public static final java.lang.String _PassengerPassport = "PassengerPassport";
    public static final java.lang.String _PassportCard = "PassportCard";
    public static final java.lang.String _IdentityCard = "IdentityCard";
    public static final java.lang.String _CrewMemberCert = "CrewMemberCert";
    public static final java.lang.String _NonStandard = "NonStandard";
    public static final java.lang.String _Unknown = "Unknown";
    public static final PassportType PassengerPassport = new PassportType(_PassengerPassport);
    public static final PassportType PassportCard = new PassportType(_PassportCard);
    public static final PassportType IdentityCard = new PassportType(_IdentityCard);
    public static final PassportType CrewMemberCert = new PassportType(_CrewMemberCert);
    public static final PassportType NonStandard = new PassportType(_NonStandard);
    public static final PassportType Unknown = new PassportType(_Unknown);
    public java.lang.String getValue() { return _value_;}
    public static PassportType fromValue(java.lang.String value)
          throws java.lang.IllegalArgumentException {
        PassportType enumeration = (PassportType)
            _table_.get(value);
        if (enumeration==null) throw new java.lang.IllegalArgumentException();
        return enumeration;
    }
    public static PassportType fromString(java.lang.String value)
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
        new org.apache.axis.description.TypeDesc(PassportType.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "PassportType"));
    }
    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
