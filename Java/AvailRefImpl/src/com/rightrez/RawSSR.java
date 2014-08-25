/**
 * RawSSR.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class RawSSR  implements java.io.Serializable {
    private java.lang.String type;

    private java.lang.String lastName;

    private java.lang.String firstName;

    private java.lang.String comment;

    private java.lang.String carrier;

    private java.lang.String flightNumber;

    private java.lang.String COS;

    private java.lang.String departTime;

    private java.lang.String departCity;

    private java.lang.String arriveCity;

    private java.lang.String status;

    private int numberOfPassengers;

    private int segmentReference;

    private int passengerReference;

    private int lineNumber;

    private java.lang.String fullText;

    private int referenceNumber;

    public RawSSR() {
    }

    public RawSSR(
           java.lang.String type,
           java.lang.String lastName,
           java.lang.String firstName,
           java.lang.String comment,
           java.lang.String carrier,
           java.lang.String flightNumber,
           java.lang.String COS,
           java.lang.String departTime,
           java.lang.String departCity,
           java.lang.String arriveCity,
           java.lang.String status,
           int numberOfPassengers,
           int segmentReference,
           int passengerReference,
           int lineNumber,
           java.lang.String fullText,
           int referenceNumber) {
           this.type = type;
           this.lastName = lastName;
           this.firstName = firstName;
           this.comment = comment;
           this.carrier = carrier;
           this.flightNumber = flightNumber;
           this.COS = COS;
           this.departTime = departTime;
           this.departCity = departCity;
           this.arriveCity = arriveCity;
           this.status = status;
           this.numberOfPassengers = numberOfPassengers;
           this.segmentReference = segmentReference;
           this.passengerReference = passengerReference;
           this.lineNumber = lineNumber;
           this.fullText = fullText;
           this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the type value for this RawSSR.
     * 
     * @return type
     */
    public java.lang.String getType() {
        return type;
    }


    /**
     * Sets the type value for this RawSSR.
     * 
     * @param type
     */
    public void setType(java.lang.String type) {
        this.type = type;
    }


    /**
     * Gets the lastName value for this RawSSR.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this RawSSR.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the firstName value for this RawSSR.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this RawSSR.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the comment value for this RawSSR.
     * 
     * @return comment
     */
    public java.lang.String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this RawSSR.
     * 
     * @param comment
     */
    public void setComment(java.lang.String comment) {
        this.comment = comment;
    }


    /**
     * Gets the carrier value for this RawSSR.
     * 
     * @return carrier
     */
    public java.lang.String getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this RawSSR.
     * 
     * @param carrier
     */
    public void setCarrier(java.lang.String carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the flightNumber value for this RawSSR.
     * 
     * @return flightNumber
     */
    public java.lang.String getFlightNumber() {
        return flightNumber;
    }


    /**
     * Sets the flightNumber value for this RawSSR.
     * 
     * @param flightNumber
     */
    public void setFlightNumber(java.lang.String flightNumber) {
        this.flightNumber = flightNumber;
    }


    /**
     * Gets the COS value for this RawSSR.
     * 
     * @return COS
     */
    public java.lang.String getCOS() {
        return COS;
    }


    /**
     * Sets the COS value for this RawSSR.
     * 
     * @param COS
     */
    public void setCOS(java.lang.String COS) {
        this.COS = COS;
    }


    /**
     * Gets the departTime value for this RawSSR.
     * 
     * @return departTime
     */
    public java.lang.String getDepartTime() {
        return departTime;
    }


    /**
     * Sets the departTime value for this RawSSR.
     * 
     * @param departTime
     */
    public void setDepartTime(java.lang.String departTime) {
        this.departTime = departTime;
    }


    /**
     * Gets the departCity value for this RawSSR.
     * 
     * @return departCity
     */
    public java.lang.String getDepartCity() {
        return departCity;
    }


    /**
     * Sets the departCity value for this RawSSR.
     * 
     * @param departCity
     */
    public void setDepartCity(java.lang.String departCity) {
        this.departCity = departCity;
    }


    /**
     * Gets the arriveCity value for this RawSSR.
     * 
     * @return arriveCity
     */
    public java.lang.String getArriveCity() {
        return arriveCity;
    }


    /**
     * Sets the arriveCity value for this RawSSR.
     * 
     * @param arriveCity
     */
    public void setArriveCity(java.lang.String arriveCity) {
        this.arriveCity = arriveCity;
    }


    /**
     * Gets the status value for this RawSSR.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RawSSR.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the numberOfPassengers value for this RawSSR.
     * 
     * @return numberOfPassengers
     */
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }


    /**
     * Sets the numberOfPassengers value for this RawSSR.
     * 
     * @param numberOfPassengers
     */
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }


    /**
     * Gets the segmentReference value for this RawSSR.
     * 
     * @return segmentReference
     */
    public int getSegmentReference() {
        return segmentReference;
    }


    /**
     * Sets the segmentReference value for this RawSSR.
     * 
     * @param segmentReference
     */
    public void setSegmentReference(int segmentReference) {
        this.segmentReference = segmentReference;
    }


    /**
     * Gets the passengerReference value for this RawSSR.
     * 
     * @return passengerReference
     */
    public int getPassengerReference() {
        return passengerReference;
    }


    /**
     * Sets the passengerReference value for this RawSSR.
     * 
     * @param passengerReference
     */
    public void setPassengerReference(int passengerReference) {
        this.passengerReference = passengerReference;
    }


    /**
     * Gets the lineNumber value for this RawSSR.
     * 
     * @return lineNumber
     */
    public int getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this RawSSR.
     * 
     * @param lineNumber
     */
    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the fullText value for this RawSSR.
     * 
     * @return fullText
     */
    public java.lang.String getFullText() {
        return fullText;
    }


    /**
     * Sets the fullText value for this RawSSR.
     * 
     * @param fullText
     */
    public void setFullText(java.lang.String fullText) {
        this.fullText = fullText;
    }


    /**
     * Gets the referenceNumber value for this RawSSR.
     * 
     * @return referenceNumber
     */
    public int getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this RawSSR.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(int referenceNumber) {
        this.referenceNumber = referenceNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RawSSR)) return false;
        RawSSR other = (RawSSR) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.type==null && other.getType()==null) || 
             (this.type!=null &&
              this.type.equals(other.getType()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            ((this.flightNumber==null && other.getFlightNumber()==null) || 
             (this.flightNumber!=null &&
              this.flightNumber.equals(other.getFlightNumber()))) &&
            ((this.COS==null && other.getCOS()==null) || 
             (this.COS!=null &&
              this.COS.equals(other.getCOS()))) &&
            ((this.departTime==null && other.getDepartTime()==null) || 
             (this.departTime!=null &&
              this.departTime.equals(other.getDepartTime()))) &&
            ((this.departCity==null && other.getDepartCity()==null) || 
             (this.departCity!=null &&
              this.departCity.equals(other.getDepartCity()))) &&
            ((this.arriveCity==null && other.getArriveCity()==null) || 
             (this.arriveCity!=null &&
              this.arriveCity.equals(other.getArriveCity()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.numberOfPassengers == other.getNumberOfPassengers() &&
            this.segmentReference == other.getSegmentReference() &&
            this.passengerReference == other.getPassengerReference() &&
            this.lineNumber == other.getLineNumber() &&
            ((this.fullText==null && other.getFullText()==null) || 
             (this.fullText!=null &&
              this.fullText.equals(other.getFullText()))) &&
            this.referenceNumber == other.getReferenceNumber();
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
        if (getType() != null) {
            _hashCode += getType().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        if (getFlightNumber() != null) {
            _hashCode += getFlightNumber().hashCode();
        }
        if (getCOS() != null) {
            _hashCode += getCOS().hashCode();
        }
        if (getDepartTime() != null) {
            _hashCode += getDepartTime().hashCode();
        }
        if (getDepartCity() != null) {
            _hashCode += getDepartCity().hashCode();
        }
        if (getArriveCity() != null) {
            _hashCode += getArriveCity().hashCode();
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += getNumberOfPassengers();
        _hashCode += getSegmentReference();
        _hashCode += getPassengerReference();
        _hashCode += getLineNumber();
        if (getFullText() != null) {
            _hashCode += getFullText().hashCode();
        }
        _hashCode += getReferenceNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RawSSR.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawSSR"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "LastName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FirstName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Carrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FlightNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "COS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DepartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DepartCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arriveCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ArriveCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberOfPassengers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "NumberOfPassengers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "SegmentReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PassengerReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "LineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fullText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FullText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ReferenceNumber"));
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
