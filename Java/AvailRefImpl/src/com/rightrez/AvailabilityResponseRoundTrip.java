/**
 * AvailabilityResponseRoundTrip.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class AvailabilityResponseRoundTrip  implements java.io.Serializable {
    private com.rightrez.FlightPairing[] flightPairings;

    private com.rightrez.FlightPairing[] flightPairingsNoPrice;

    private com.rightrez.FlightPairing[] publishedFlightPairings;

    private com.rightrez.SerializableKeyValuePairOfFlightValidationStatusListOfFlightPairing[] invalidPublishedFlightPairings;

    private com.rightrez.AvailabilityResponseComponent[] components;

    private boolean hasError;

    private java.lang.String GDSErrorMessage;

    public AvailabilityResponseRoundTrip() {
    }

    public AvailabilityResponseRoundTrip(
           com.rightrez.FlightPairing[] flightPairings,
           com.rightrez.FlightPairing[] flightPairingsNoPrice,
           com.rightrez.FlightPairing[] publishedFlightPairings,
           com.rightrez.SerializableKeyValuePairOfFlightValidationStatusListOfFlightPairing[] invalidPublishedFlightPairings,
           com.rightrez.AvailabilityResponseComponent[] components,
           boolean hasError,
           java.lang.String GDSErrorMessage) {
           this.flightPairings = flightPairings;
           this.flightPairingsNoPrice = flightPairingsNoPrice;
           this.publishedFlightPairings = publishedFlightPairings;
           this.invalidPublishedFlightPairings = invalidPublishedFlightPairings;
           this.components = components;
           this.hasError = hasError;
           this.GDSErrorMessage = GDSErrorMessage;
    }


    /**
     * Gets the flightPairings value for this AvailabilityResponseRoundTrip.
     * 
     * @return flightPairings
     */
    public com.rightrez.FlightPairing[] getFlightPairings() {
        return flightPairings;
    }


    /**
     * Sets the flightPairings value for this AvailabilityResponseRoundTrip.
     * 
     * @param flightPairings
     */
    public void setFlightPairings(com.rightrez.FlightPairing[] flightPairings) {
        this.flightPairings = flightPairings;
    }


    /**
     * Gets the flightPairingsNoPrice value for this AvailabilityResponseRoundTrip.
     * 
     * @return flightPairingsNoPrice
     */
    public com.rightrez.FlightPairing[] getFlightPairingsNoPrice() {
        return flightPairingsNoPrice;
    }


    /**
     * Sets the flightPairingsNoPrice value for this AvailabilityResponseRoundTrip.
     * 
     * @param flightPairingsNoPrice
     */
    public void setFlightPairingsNoPrice(com.rightrez.FlightPairing[] flightPairingsNoPrice) {
        this.flightPairingsNoPrice = flightPairingsNoPrice;
    }


    /**
     * Gets the publishedFlightPairings value for this AvailabilityResponseRoundTrip.
     * 
     * @return publishedFlightPairings
     */
    public com.rightrez.FlightPairing[] getPublishedFlightPairings() {
        return publishedFlightPairings;
    }


    /**
     * Sets the publishedFlightPairings value for this AvailabilityResponseRoundTrip.
     * 
     * @param publishedFlightPairings
     */
    public void setPublishedFlightPairings(com.rightrez.FlightPairing[] publishedFlightPairings) {
        this.publishedFlightPairings = publishedFlightPairings;
    }


    /**
     * Gets the invalidPublishedFlightPairings value for this AvailabilityResponseRoundTrip.
     * 
     * @return invalidPublishedFlightPairings
     */
    public com.rightrez.SerializableKeyValuePairOfFlightValidationStatusListOfFlightPairing[] getInvalidPublishedFlightPairings() {
        return invalidPublishedFlightPairings;
    }


    /**
     * Sets the invalidPublishedFlightPairings value for this AvailabilityResponseRoundTrip.
     * 
     * @param invalidPublishedFlightPairings
     */
    public void setInvalidPublishedFlightPairings(com.rightrez.SerializableKeyValuePairOfFlightValidationStatusListOfFlightPairing[] invalidPublishedFlightPairings) {
        this.invalidPublishedFlightPairings = invalidPublishedFlightPairings;
    }


    /**
     * Gets the components value for this AvailabilityResponseRoundTrip.
     * 
     * @return components
     */
    public com.rightrez.AvailabilityResponseComponent[] getComponents() {
        return components;
    }


    /**
     * Sets the components value for this AvailabilityResponseRoundTrip.
     * 
     * @param components
     */
    public void setComponents(com.rightrez.AvailabilityResponseComponent[] components) {
        this.components = components;
    }


    /**
     * Gets the hasError value for this AvailabilityResponseRoundTrip.
     * 
     * @return hasError
     */
    public boolean isHasError() {
        return hasError;
    }


    /**
     * Sets the hasError value for this AvailabilityResponseRoundTrip.
     * 
     * @param hasError
     */
    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }


    /**
     * Gets the GDSErrorMessage value for this AvailabilityResponseRoundTrip.
     * 
     * @return GDSErrorMessage
     */
    public java.lang.String getGDSErrorMessage() {
        return GDSErrorMessage;
    }


    /**
     * Sets the GDSErrorMessage value for this AvailabilityResponseRoundTrip.
     * 
     * @param GDSErrorMessage
     */
    public void setGDSErrorMessage(java.lang.String GDSErrorMessage) {
        this.GDSErrorMessage = GDSErrorMessage;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailabilityResponseRoundTrip)) return false;
        AvailabilityResponseRoundTrip other = (AvailabilityResponseRoundTrip) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.flightPairings==null && other.getFlightPairings()==null) || 
             (this.flightPairings!=null &&
              java.util.Arrays.equals(this.flightPairings, other.getFlightPairings()))) &&
            ((this.flightPairingsNoPrice==null && other.getFlightPairingsNoPrice()==null) || 
             (this.flightPairingsNoPrice!=null &&
              java.util.Arrays.equals(this.flightPairingsNoPrice, other.getFlightPairingsNoPrice()))) &&
            ((this.publishedFlightPairings==null && other.getPublishedFlightPairings()==null) || 
             (this.publishedFlightPairings!=null &&
              java.util.Arrays.equals(this.publishedFlightPairings, other.getPublishedFlightPairings()))) &&
            ((this.invalidPublishedFlightPairings==null && other.getInvalidPublishedFlightPairings()==null) || 
             (this.invalidPublishedFlightPairings!=null &&
              java.util.Arrays.equals(this.invalidPublishedFlightPairings, other.getInvalidPublishedFlightPairings()))) &&
            ((this.components==null && other.getComponents()==null) || 
             (this.components!=null &&
              java.util.Arrays.equals(this.components, other.getComponents()))) &&
            this.hasError == other.isHasError() &&
            ((this.GDSErrorMessage==null && other.getGDSErrorMessage()==null) || 
             (this.GDSErrorMessage!=null &&
              this.GDSErrorMessage.equals(other.getGDSErrorMessage())));
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
        if (getFlightPairings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlightPairings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlightPairings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFlightPairingsNoPrice() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlightPairingsNoPrice());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlightPairingsNoPrice(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPublishedFlightPairings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPublishedFlightPairings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPublishedFlightPairings(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvalidPublishedFlightPairings() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvalidPublishedFlightPairings());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvalidPublishedFlightPairings(), i);
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
        if (getGDSErrorMessage() != null) {
            _hashCode += getGDSErrorMessage().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvailabilityResponseRoundTrip.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityResponseRoundTrip"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightPairings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FlightPairings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightPairing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "FlightPairing"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightPairingsNoPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FlightPairingsNoPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightPairing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "FlightPairing"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishedFlightPairings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PublishedFlightPairings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightPairing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "FlightPairing"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidPublishedFlightPairings");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "InvalidPublishedFlightPairings"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfFlightValidationStatusListOfFlightPairing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfFlightValidationStatusListOfFlightPairing"));
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
        elemField.setFieldName("GDSErrorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "GDSErrorMessage"));
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
