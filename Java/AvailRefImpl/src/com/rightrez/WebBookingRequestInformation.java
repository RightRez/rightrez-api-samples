/**
 * WebBookingRequestInformation.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class WebBookingRequestInformation  implements java.io.Serializable {
    private com.rightrez.CreatePNRRequest pnrRequestInformation;

    public WebBookingRequestInformation() {
    }

    public WebBookingRequestInformation(
           com.rightrez.CreatePNRRequest pnrRequestInformation) {
           this.pnrRequestInformation = pnrRequestInformation;
    }


    /**
     * Gets the pnrRequestInformation value for this WebBookingRequestInformation.
     * 
     * @return pnrRequestInformation
     */
    public com.rightrez.CreatePNRRequest getPnrRequestInformation() {
        return pnrRequestInformation;
    }


    /**
     * Sets the pnrRequestInformation value for this WebBookingRequestInformation.
     * 
     * @param pnrRequestInformation
     */
    public void setPnrRequestInformation(com.rightrez.CreatePNRRequest pnrRequestInformation) {
        this.pnrRequestInformation = pnrRequestInformation;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof WebBookingRequestInformation)) return false;
        WebBookingRequestInformation other = (WebBookingRequestInformation) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.pnrRequestInformation==null && other.getPnrRequestInformation()==null) || 
             (this.pnrRequestInformation!=null &&
              this.pnrRequestInformation.equals(other.getPnrRequestInformation())));
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
        if (getPnrRequestInformation() != null) {
            _hashCode += getPnrRequestInformation().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(WebBookingRequestInformation.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", ">WebBookingRequestInformation"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pnrRequestInformation");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "pnrRequestInformation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "CreatePNRRequest"));
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
