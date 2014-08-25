/**
 * AvailabilityResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class AvailabilityResponse  implements java.io.Serializable {
    private com.rightrez.SerializableKeyValuePairOfAvailabilityRequestDependencyAvailabilityResponseRoundTrip[] roundTripOptions;

    private com.rightrez.SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip[] singleCompRoundTripOptions;

    private com.rightrez.AvailabilityResponseComponent[] components;

    private boolean hasError;

    private java.lang.String loggingID;

    private java.lang.String GDSErrorMessage;

    private boolean hasResults;

    private boolean hasMoreOptionsToPrice;

    public AvailabilityResponse() {
    }

    public AvailabilityResponse(
           com.rightrez.SerializableKeyValuePairOfAvailabilityRequestDependencyAvailabilityResponseRoundTrip[] roundTripOptions,
           com.rightrez.SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip[] singleCompRoundTripOptions,
           com.rightrez.AvailabilityResponseComponent[] components,
           boolean hasError,
           java.lang.String loggingID,
           java.lang.String GDSErrorMessage,
           boolean hasResults,
           boolean hasMoreOptionsToPrice) {
           this.roundTripOptions = roundTripOptions;
           this.singleCompRoundTripOptions = singleCompRoundTripOptions;
           this.components = components;
           this.hasError = hasError;
           this.loggingID = loggingID;
           this.GDSErrorMessage = GDSErrorMessage;
           this.hasResults = hasResults;
           this.hasMoreOptionsToPrice = hasMoreOptionsToPrice;
    }


    /**
     * Gets the roundTripOptions value for this AvailabilityResponse.
     * 
     * @return roundTripOptions
     */
    public com.rightrez.SerializableKeyValuePairOfAvailabilityRequestDependencyAvailabilityResponseRoundTrip[] getRoundTripOptions() {
        return roundTripOptions;
    }


    /**
     * Sets the roundTripOptions value for this AvailabilityResponse.
     * 
     * @param roundTripOptions
     */
    public void setRoundTripOptions(com.rightrez.SerializableKeyValuePairOfAvailabilityRequestDependencyAvailabilityResponseRoundTrip[] roundTripOptions) {
        this.roundTripOptions = roundTripOptions;
    }


    /**
     * Gets the singleCompRoundTripOptions value for this AvailabilityResponse.
     * 
     * @return singleCompRoundTripOptions
     */
    public com.rightrez.SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip[] getSingleCompRoundTripOptions() {
        return singleCompRoundTripOptions;
    }


    /**
     * Sets the singleCompRoundTripOptions value for this AvailabilityResponse.
     * 
     * @param singleCompRoundTripOptions
     */
    public void setSingleCompRoundTripOptions(com.rightrez.SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip[] singleCompRoundTripOptions) {
        this.singleCompRoundTripOptions = singleCompRoundTripOptions;
    }


    /**
     * Gets the components value for this AvailabilityResponse.
     * 
     * @return components
     */
    public com.rightrez.AvailabilityResponseComponent[] getComponents() {
        return components;
    }


    /**
     * Sets the components value for this AvailabilityResponse.
     * 
     * @param components
     */
    public void setComponents(com.rightrez.AvailabilityResponseComponent[] components) {
        this.components = components;
    }


    /**
     * Gets the hasError value for this AvailabilityResponse.
     * 
     * @return hasError
     */
    public boolean isHasError() {
        return hasError;
    }


    /**
     * Sets the hasError value for this AvailabilityResponse.
     * 
     * @param hasError
     */
    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }


    /**
     * Gets the loggingID value for this AvailabilityResponse.
     * 
     * @return loggingID
     */
    public java.lang.String getLoggingID() {
        return loggingID;
    }


    /**
     * Sets the loggingID value for this AvailabilityResponse.
     * 
     * @param loggingID
     */
    public void setLoggingID(java.lang.String loggingID) {
        this.loggingID = loggingID;
    }


    /**
     * Gets the GDSErrorMessage value for this AvailabilityResponse.
     * 
     * @return GDSErrorMessage
     */
    public java.lang.String getGDSErrorMessage() {
        return GDSErrorMessage;
    }


    /**
     * Sets the GDSErrorMessage value for this AvailabilityResponse.
     * 
     * @param GDSErrorMessage
     */
    public void setGDSErrorMessage(java.lang.String GDSErrorMessage) {
        this.GDSErrorMessage = GDSErrorMessage;
    }


    /**
     * Gets the hasResults value for this AvailabilityResponse.
     * 
     * @return hasResults
     */
    public boolean isHasResults() {
        return hasResults;
    }


    /**
     * Sets the hasResults value for this AvailabilityResponse.
     * 
     * @param hasResults
     */
    public void setHasResults(boolean hasResults) {
        this.hasResults = hasResults;
    }


    /**
     * Gets the hasMoreOptionsToPrice value for this AvailabilityResponse.
     * 
     * @return hasMoreOptionsToPrice
     */
    public boolean isHasMoreOptionsToPrice() {
        return hasMoreOptionsToPrice;
    }


    /**
     * Sets the hasMoreOptionsToPrice value for this AvailabilityResponse.
     * 
     * @param hasMoreOptionsToPrice
     */
    public void setHasMoreOptionsToPrice(boolean hasMoreOptionsToPrice) {
        this.hasMoreOptionsToPrice = hasMoreOptionsToPrice;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailabilityResponse)) return false;
        AvailabilityResponse other = (AvailabilityResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.roundTripOptions==null && other.getRoundTripOptions()==null) || 
             (this.roundTripOptions!=null &&
              java.util.Arrays.equals(this.roundTripOptions, other.getRoundTripOptions()))) &&
            ((this.singleCompRoundTripOptions==null && other.getSingleCompRoundTripOptions()==null) || 
             (this.singleCompRoundTripOptions!=null &&
              java.util.Arrays.equals(this.singleCompRoundTripOptions, other.getSingleCompRoundTripOptions()))) &&
            ((this.components==null && other.getComponents()==null) || 
             (this.components!=null &&
              java.util.Arrays.equals(this.components, other.getComponents()))) &&
            this.hasError == other.isHasError() &&
            ((this.loggingID==null && other.getLoggingID()==null) || 
             (this.loggingID!=null &&
              this.loggingID.equals(other.getLoggingID()))) &&
            ((this.GDSErrorMessage==null && other.getGDSErrorMessage()==null) || 
             (this.GDSErrorMessage!=null &&
              this.GDSErrorMessage.equals(other.getGDSErrorMessage()))) &&
            this.hasResults == other.isHasResults() &&
            this.hasMoreOptionsToPrice == other.isHasMoreOptionsToPrice();
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
        if (getRoundTripOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRoundTripOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRoundTripOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSingleCompRoundTripOptions() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSingleCompRoundTripOptions());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSingleCompRoundTripOptions(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        _hashCode += (isHasError() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLoggingID() != null) {
            _hashCode += getLoggingID().hashCode();
        }
        if (getGDSErrorMessage() != null) {
            _hashCode += getGDSErrorMessage().hashCode();
        }
        _hashCode += (isHasResults() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHasMoreOptionsToPrice() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvailabilityResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("roundTripOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "RoundTripOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfAvailabilityRequestDependencyAvailabilityResponseRoundTrip"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfAvailabilityRequestDependencyAvailabilityResponseRoundTrip"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("singleCompRoundTripOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "SingleCompRoundTripOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("components");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Components"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityResponseComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityResponseComponent"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "HasError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loggingID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "LoggingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GDSErrorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "GDSErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasResults");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "HasResults"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasMoreOptionsToPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "HasMoreOptionsToPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
