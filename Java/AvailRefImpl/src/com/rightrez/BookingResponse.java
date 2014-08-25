/**
 * BookingResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class BookingResponse  implements java.io.Serializable {
    private java.lang.String errorText;

    private boolean isError;

    private java.lang.Integer accountingID;

    private java.lang.String loggingID;

    private com.rightrez.RRZPnr PNR;

    private com.rightrez.BookingResponseComponent[] components;

    public BookingResponse() {
    }

    public BookingResponse(
           java.lang.String errorText,
           boolean isError,
           java.lang.Integer accountingID,
           java.lang.String loggingID,
           com.rightrez.RRZPnr PNR,
           com.rightrez.BookingResponseComponent[] components) {
           this.errorText = errorText;
           this.isError = isError;
           this.accountingID = accountingID;
           this.loggingID = loggingID;
           this.PNR = PNR;
           this.components = components;
    }


    /**
     * Gets the errorText value for this BookingResponse.
     * 
     * @return errorText
     */
    public java.lang.String getErrorText() {
        return errorText;
    }


    /**
     * Sets the errorText value for this BookingResponse.
     * 
     * @param errorText
     */
    public void setErrorText(java.lang.String errorText) {
        this.errorText = errorText;
    }


    /**
     * Gets the isError value for this BookingResponse.
     * 
     * @return isError
     */
    public boolean isIsError() {
        return isError;
    }


    /**
     * Sets the isError value for this BookingResponse.
     * 
     * @param isError
     */
    public void setIsError(boolean isError) {
        this.isError = isError;
    }


    /**
     * Gets the accountingID value for this BookingResponse.
     * 
     * @return accountingID
     */
    public java.lang.Integer getAccountingID() {
        return accountingID;
    }


    /**
     * Sets the accountingID value for this BookingResponse.
     * 
     * @param accountingID
     */
    public void setAccountingID(java.lang.Integer accountingID) {
        this.accountingID = accountingID;
    }


    /**
     * Gets the loggingID value for this BookingResponse.
     * 
     * @return loggingID
     */
    public java.lang.String getLoggingID() {
        return loggingID;
    }


    /**
     * Sets the loggingID value for this BookingResponse.
     * 
     * @param loggingID
     */
    public void setLoggingID(java.lang.String loggingID) {
        this.loggingID = loggingID;
    }


    /**
     * Gets the PNR value for this BookingResponse.
     * 
     * @return PNR
     */
    public com.rightrez.RRZPnr getPNR() {
        return PNR;
    }


    /**
     * Sets the PNR value for this BookingResponse.
     * 
     * @param PNR
     */
    public void setPNR(com.rightrez.RRZPnr PNR) {
        this.PNR = PNR;
    }


    /**
     * Gets the components value for this BookingResponse.
     * 
     * @return components
     */
    public com.rightrez.BookingResponseComponent[] getComponents() {
        return components;
    }


    /**
     * Sets the components value for this BookingResponse.
     * 
     * @param components
     */
    public void setComponents(com.rightrez.BookingResponseComponent[] components) {
        this.components = components;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookingResponse)) return false;
        BookingResponse other = (BookingResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.errorText==null && other.getErrorText()==null) || 
             (this.errorText!=null &&
              this.errorText.equals(other.getErrorText()))) &&
            this.isError == other.isIsError() &&
            ((this.accountingID==null && other.getAccountingID()==null) || 
             (this.accountingID!=null &&
              this.accountingID.equals(other.getAccountingID()))) &&
            ((this.loggingID==null && other.getLoggingID()==null) || 
             (this.loggingID!=null &&
              this.loggingID.equals(other.getLoggingID()))) &&
            ((this.PNR==null && other.getPNR()==null) || 
             (this.PNR!=null &&
              this.PNR.equals(other.getPNR()))) &&
            ((this.components==null && other.getComponents()==null) || 
             (this.components!=null &&
              java.util.Arrays.equals(this.components, other.getComponents())));
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
        if (getErrorText() != null) {
            _hashCode += getErrorText().hashCode();
        }
        _hashCode += (isIsError() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAccountingID() != null) {
            _hashCode += getAccountingID().hashCode();
        }
        if (getLoggingID() != null) {
            _hashCode += getLoggingID().hashCode();
        }
        if (getPNR() != null) {
            _hashCode += getPNR().hashCode();
        }
        if (getComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookingResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "BookingResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ErrorText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "IsError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AccountingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loggingID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "LoggingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PNR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PNR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RRZPnr"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("components");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Components"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "BookingResponseComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "BookingResponseComponent"));
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
