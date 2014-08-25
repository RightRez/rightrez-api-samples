/**
 * AvailabilityResponseComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class AvailabilityResponseComponent  implements java.io.Serializable {
    private int numScreens;

    private com.rightrez.TripDirectionType triptype;

    private com.rightrez.ServiceLevel serviceLevel;

    private int componentUniqueKey;

    private int dataCaptureComponentId;

    private com.rightrez.FlightInfo[] flights;

    private com.rightrez.FlightInfo[][] unpricedFlights;

    private com.rightrez.FlightLoggingPair[] invalidFlights;

    public AvailabilityResponseComponent() {
    }

    public AvailabilityResponseComponent(
           int numScreens,
           com.rightrez.TripDirectionType triptype,
           com.rightrez.ServiceLevel serviceLevel,
           int componentUniqueKey,
           int dataCaptureComponentId,
           com.rightrez.FlightInfo[] flights,
           com.rightrez.FlightInfo[][] unpricedFlights,
           com.rightrez.FlightLoggingPair[] invalidFlights) {
           this.numScreens = numScreens;
           this.triptype = triptype;
           this.serviceLevel = serviceLevel;
           this.componentUniqueKey = componentUniqueKey;
           this.dataCaptureComponentId = dataCaptureComponentId;
           this.flights = flights;
           this.unpricedFlights = unpricedFlights;
           this.invalidFlights = invalidFlights;
    }


    /**
     * Gets the numScreens value for this AvailabilityResponseComponent.
     * 
     * @return numScreens
     */
    public int getNumScreens() {
        return numScreens;
    }


    /**
     * Sets the numScreens value for this AvailabilityResponseComponent.
     * 
     * @param numScreens
     */
    public void setNumScreens(int numScreens) {
        this.numScreens = numScreens;
    }


    /**
     * Gets the triptype value for this AvailabilityResponseComponent.
     * 
     * @return triptype
     */
    public com.rightrez.TripDirectionType getTriptype() {
        return triptype;
    }


    /**
     * Sets the triptype value for this AvailabilityResponseComponent.
     * 
     * @param triptype
     */
    public void setTriptype(com.rightrez.TripDirectionType triptype) {
        this.triptype = triptype;
    }


    /**
     * Gets the serviceLevel value for this AvailabilityResponseComponent.
     * 
     * @return serviceLevel
     */
    public com.rightrez.ServiceLevel getServiceLevel() {
        return serviceLevel;
    }


    /**
     * Sets the serviceLevel value for this AvailabilityResponseComponent.
     * 
     * @param serviceLevel
     */
    public void setServiceLevel(com.rightrez.ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }


    /**
     * Gets the componentUniqueKey value for this AvailabilityResponseComponent.
     * 
     * @return componentUniqueKey
     */
    public int getComponentUniqueKey() {
        return componentUniqueKey;
    }


    /**
     * Sets the componentUniqueKey value for this AvailabilityResponseComponent.
     * 
     * @param componentUniqueKey
     */
    public void setComponentUniqueKey(int componentUniqueKey) {
        this.componentUniqueKey = componentUniqueKey;
    }


    /**
     * Gets the dataCaptureComponentId value for this AvailabilityResponseComponent.
     * 
     * @return dataCaptureComponentId
     */
    public int getDataCaptureComponentId() {
        return dataCaptureComponentId;
    }


    /**
     * Sets the dataCaptureComponentId value for this AvailabilityResponseComponent.
     * 
     * @param dataCaptureComponentId
     */
    public void setDataCaptureComponentId(int dataCaptureComponentId) {
        this.dataCaptureComponentId = dataCaptureComponentId;
    }


    /**
     * Gets the flights value for this AvailabilityResponseComponent.
     * 
     * @return flights
     */
    public com.rightrez.FlightInfo[] getFlights() {
        return flights;
    }


    /**
     * Sets the flights value for this AvailabilityResponseComponent.
     * 
     * @param flights
     */
    public void setFlights(com.rightrez.FlightInfo[] flights) {
        this.flights = flights;
    }


    /**
     * Gets the unpricedFlights value for this AvailabilityResponseComponent.
     * 
     * @return unpricedFlights
     */
    public com.rightrez.FlightInfo[][] getUnpricedFlights() {
        return unpricedFlights;
    }


    /**
     * Sets the unpricedFlights value for this AvailabilityResponseComponent.
     * 
     * @param unpricedFlights
     */
    public void setUnpricedFlights(com.rightrez.FlightInfo[][] unpricedFlights) {
        this.unpricedFlights = unpricedFlights;
    }


    /**
     * Gets the invalidFlights value for this AvailabilityResponseComponent.
     * 
     * @return invalidFlights
     */
    public com.rightrez.FlightLoggingPair[] getInvalidFlights() {
        return invalidFlights;
    }


    /**
     * Sets the invalidFlights value for this AvailabilityResponseComponent.
     * 
     * @param invalidFlights
     */
    public void setInvalidFlights(com.rightrez.FlightLoggingPair[] invalidFlights) {
        this.invalidFlights = invalidFlights;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailabilityResponseComponent)) return false;
        AvailabilityResponseComponent other = (AvailabilityResponseComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.numScreens == other.getNumScreens() &&
            ((this.triptype==null && other.getTriptype()==null) || 
             (this.triptype!=null &&
              this.triptype.equals(other.getTriptype()))) &&
            ((this.serviceLevel==null && other.getServiceLevel()==null) || 
             (this.serviceLevel!=null &&
              this.serviceLevel.equals(other.getServiceLevel()))) &&
            this.componentUniqueKey == other.getComponentUniqueKey() &&
            this.dataCaptureComponentId == other.getDataCaptureComponentId() &&
            ((this.flights==null && other.getFlights()==null) || 
             (this.flights!=null &&
              java.util.Arrays.equals(this.flights, other.getFlights()))) &&
            ((this.unpricedFlights==null && other.getUnpricedFlights()==null) || 
             (this.unpricedFlights!=null &&
              java.util.Arrays.equals(this.unpricedFlights, other.getUnpricedFlights()))) &&
            ((this.invalidFlights==null && other.getInvalidFlights()==null) || 
             (this.invalidFlights!=null &&
              java.util.Arrays.equals(this.invalidFlights, other.getInvalidFlights())));
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
        _hashCode += getNumScreens();
        if (getTriptype() != null) {
            _hashCode += getTriptype().hashCode();
        }
        if (getServiceLevel() != null) {
            _hashCode += getServiceLevel().hashCode();
        }
        _hashCode += getComponentUniqueKey();
        _hashCode += getDataCaptureComponentId();
        if (getFlights() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFlights());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFlights(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getUnpricedFlights() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getUnpricedFlights());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getUnpricedFlights(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getInvalidFlights() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvalidFlights());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvalidFlights(), i);
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
        new org.apache.axis.description.TypeDesc(AvailabilityResponseComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityResponseComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numScreens");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "NumScreens"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("triptype");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Triptype"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "TripDirectionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ServiceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "ServiceLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentUniqueKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ComponentUniqueKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCaptureComponentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DataCaptureComponentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Flights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "FlightInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unpricedFlights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "UnpricedFlights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfFlightInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfFlightInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invalidFlights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "InvalidFlights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightLoggingPair"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "FlightLoggingPair"));
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
