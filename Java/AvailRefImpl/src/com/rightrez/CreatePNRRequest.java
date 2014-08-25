/**
 * CreatePNRRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class CreatePNRRequest  implements java.io.Serializable {
    private com.rightrez.CustomContent[] customContent;

    private com.rightrez.RRZName[] passengers;

    private com.rightrez.TripComponent[] tripComponents;

    private java.lang.String clientBookingCode;

    private java.lang.String bookingNumber;

    private java.lang.String bookingType;

    private java.lang.String department;

    private java.lang.String[] fareType;

    private int instance;

    private boolean shell;

    private int createPNRRequestID;

    public CreatePNRRequest() {
    }

    public CreatePNRRequest(
           com.rightrez.CustomContent[] customContent,
           com.rightrez.RRZName[] passengers,
           com.rightrez.TripComponent[] tripComponents,
           java.lang.String clientBookingCode,
           java.lang.String bookingNumber,
           java.lang.String bookingType,
           java.lang.String department,
           java.lang.String[] fareType,
           int instance,
           boolean shell,
           int createPNRRequestID) {
           this.customContent = customContent;
           this.passengers = passengers;
           this.tripComponents = tripComponents;
           this.clientBookingCode = clientBookingCode;
           this.bookingNumber = bookingNumber;
           this.bookingType = bookingType;
           this.department = department;
           this.fareType = fareType;
           this.instance = instance;
           this.shell = shell;
           this.createPNRRequestID = createPNRRequestID;
    }


    /**
     * Gets the customContent value for this CreatePNRRequest.
     * 
     * @return customContent
     */
    public com.rightrez.CustomContent[] getCustomContent() {
        return customContent;
    }


    /**
     * Sets the customContent value for this CreatePNRRequest.
     * 
     * @param customContent
     */
    public void setCustomContent(com.rightrez.CustomContent[] customContent) {
        this.customContent = customContent;
    }


    /**
     * Gets the passengers value for this CreatePNRRequest.
     * 
     * @return passengers
     */
    public com.rightrez.RRZName[] getPassengers() {
        return passengers;
    }


    /**
     * Sets the passengers value for this CreatePNRRequest.
     * 
     * @param passengers
     */
    public void setPassengers(com.rightrez.RRZName[] passengers) {
        this.passengers = passengers;
    }


    /**
     * Gets the tripComponents value for this CreatePNRRequest.
     * 
     * @return tripComponents
     */
    public com.rightrez.TripComponent[] getTripComponents() {
        return tripComponents;
    }


    /**
     * Sets the tripComponents value for this CreatePNRRequest.
     * 
     * @param tripComponents
     */
    public void setTripComponents(com.rightrez.TripComponent[] tripComponents) {
        this.tripComponents = tripComponents;
    }


    /**
     * Gets the clientBookingCode value for this CreatePNRRequest.
     * 
     * @return clientBookingCode
     */
    public java.lang.String getClientBookingCode() {
        return clientBookingCode;
    }


    /**
     * Sets the clientBookingCode value for this CreatePNRRequest.
     * 
     * @param clientBookingCode
     */
    public void setClientBookingCode(java.lang.String clientBookingCode) {
        this.clientBookingCode = clientBookingCode;
    }


    /**
     * Gets the bookingNumber value for this CreatePNRRequest.
     * 
     * @return bookingNumber
     */
    public java.lang.String getBookingNumber() {
        return bookingNumber;
    }


    /**
     * Sets the bookingNumber value for this CreatePNRRequest.
     * 
     * @param bookingNumber
     */
    public void setBookingNumber(java.lang.String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }


    /**
     * Gets the bookingType value for this CreatePNRRequest.
     * 
     * @return bookingType
     */
    public java.lang.String getBookingType() {
        return bookingType;
    }


    /**
     * Sets the bookingType value for this CreatePNRRequest.
     * 
     * @param bookingType
     */
    public void setBookingType(java.lang.String bookingType) {
        this.bookingType = bookingType;
    }


    /**
     * Gets the department value for this CreatePNRRequest.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this CreatePNRRequest.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the fareType value for this CreatePNRRequest.
     * 
     * @return fareType
     */
    public java.lang.String[] getFareType() {
        return fareType;
    }


    /**
     * Sets the fareType value for this CreatePNRRequest.
     * 
     * @param fareType
     */
    public void setFareType(java.lang.String[] fareType) {
        this.fareType = fareType;
    }


    /**
     * Gets the instance value for this CreatePNRRequest.
     * 
     * @return instance
     */
    public int getInstance() {
        return instance;
    }


    /**
     * Sets the instance value for this CreatePNRRequest.
     * 
     * @param instance
     */
    public void setInstance(int instance) {
        this.instance = instance;
    }


    /**
     * Gets the shell value for this CreatePNRRequest.
     * 
     * @return shell
     */
    public boolean isShell() {
        return shell;
    }


    /**
     * Sets the shell value for this CreatePNRRequest.
     * 
     * @param shell
     */
    public void setShell(boolean shell) {
        this.shell = shell;
    }


    /**
     * Gets the createPNRRequestID value for this CreatePNRRequest.
     * 
     * @return createPNRRequestID
     */
    public int getCreatePNRRequestID() {
        return createPNRRequestID;
    }


    /**
     * Sets the createPNRRequestID value for this CreatePNRRequest.
     * 
     * @param createPNRRequestID
     */
    public void setCreatePNRRequestID(int createPNRRequestID) {
        this.createPNRRequestID = createPNRRequestID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CreatePNRRequest)) return false;
        CreatePNRRequest other = (CreatePNRRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.customContent==null && other.getCustomContent()==null) || 
             (this.customContent!=null &&
              java.util.Arrays.equals(this.customContent, other.getCustomContent()))) &&
            ((this.passengers==null && other.getPassengers()==null) || 
             (this.passengers!=null &&
              java.util.Arrays.equals(this.passengers, other.getPassengers()))) &&
            ((this.tripComponents==null && other.getTripComponents()==null) || 
             (this.tripComponents!=null &&
              java.util.Arrays.equals(this.tripComponents, other.getTripComponents()))) &&
            ((this.clientBookingCode==null && other.getClientBookingCode()==null) || 
             (this.clientBookingCode!=null &&
              this.clientBookingCode.equals(other.getClientBookingCode()))) &&
            ((this.bookingNumber==null && other.getBookingNumber()==null) || 
             (this.bookingNumber!=null &&
              this.bookingNumber.equals(other.getBookingNumber()))) &&
            ((this.bookingType==null && other.getBookingType()==null) || 
             (this.bookingType!=null &&
              this.bookingType.equals(other.getBookingType()))) &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            ((this.fareType==null && other.getFareType()==null) || 
             (this.fareType!=null &&
              java.util.Arrays.equals(this.fareType, other.getFareType()))) &&
            this.instance == other.getInstance() &&
            this.shell == other.isShell() &&
            this.createPNRRequestID == other.getCreatePNRRequestID();
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
        if (getCustomContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPassengers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPassengers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPassengers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTripComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTripComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTripComponents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClientBookingCode() != null) {
            _hashCode += getClientBookingCode().hashCode();
        }
        if (getBookingNumber() != null) {
            _hashCode += getBookingNumber().hashCode();
        }
        if (getBookingType() != null) {
            _hashCode += getBookingType().hashCode();
        }
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        if (getFareType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFareType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFareType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += getInstance();
        _hashCode += (isShell() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getCreatePNRRequestID();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreatePNRRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "CreatePNRRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CustomContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "CustomContent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "CustomContent"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Passengers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RRZName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "RRZName"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tripComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TripComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "TripComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "TripComponent"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientBookingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ClientBookingCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BookingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BookingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FareType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FareType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("instance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Instance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shell");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Shell"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createPNRRequestID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CreatePNRRequestID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
