/**
 * PassportInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class PassportInfo  implements java.io.Serializable {
    private com.rightrez.PassportType type;

    private java.lang.String passportNumber;

    private java.lang.String issuingCountry;

    private java.lang.String passengerNationality;

    private java.util.Calendar birthDate;

    private java.lang.String gender;

    private java.util.Calendar expiryDate;

    private java.lang.String lastName;

    private java.lang.String firstName;

    public PassportInfo() {
    }

    public PassportInfo(
           com.rightrez.PassportType type,
           java.lang.String passportNumber,
           java.lang.String issuingCountry,
           java.lang.String passengerNationality,
           java.util.Calendar birthDate,
           java.lang.String gender,
           java.util.Calendar expiryDate,
           java.lang.String lastName,
           java.lang.String firstName) {
           this.type = type;
           this.passportNumber = passportNumber;
           this.issuingCountry = issuingCountry;
           this.passengerNationality = passengerNationality;
           this.birthDate = birthDate;
           this.gender = gender;
           this.expiryDate = expiryDate;
           this.lastName = lastName;
           this.firstName = firstName;
    }


    /**
     * Gets the type value for this PassportInfo.
     * 
     * @return type
     */
    public com.rightrez.PassportType getType() {
        return type;
    }


    /**
     * Sets the type value for this PassportInfo.
     * 
     * @param type
     */
    public void setType(com.rightrez.PassportType type) {
        this.type = type;
    }


    /**
     * Gets the passportNumber value for this PassportInfo.
     * 
     * @return passportNumber
     */
    public java.lang.String getPassportNumber() {
        return passportNumber;
    }


    /**
     * Sets the passportNumber value for this PassportInfo.
     * 
     * @param passportNumber
     */
    public void setPassportNumber(java.lang.String passportNumber) {
        this.passportNumber = passportNumber;
    }


    /**
     * Gets the issuingCountry value for this PassportInfo.
     * 
     * @return issuingCountry
     */
    public java.lang.String getIssuingCountry() {
        return issuingCountry;
    }


    /**
     * Sets the issuingCountry value for this PassportInfo.
     * 
     * @param issuingCountry
     */
    public void setIssuingCountry(java.lang.String issuingCountry) {
        this.issuingCountry = issuingCountry;
    }


    /**
     * Gets the passengerNationality value for this PassportInfo.
     * 
     * @return passengerNationality
     */
    public java.lang.String getPassengerNationality() {
        return passengerNationality;
    }


    /**
     * Sets the passengerNationality value for this PassportInfo.
     * 
     * @param passengerNationality
     */
    public void setPassengerNationality(java.lang.String passengerNationality) {
        this.passengerNationality = passengerNationality;
    }


    /**
     * Gets the birthDate value for this PassportInfo.
     * 
     * @return birthDate
     */
    public java.util.Calendar getBirthDate() {
        return birthDate;
    }


    /**
     * Sets the birthDate value for this PassportInfo.
     * 
     * @param birthDate
     */
    public void setBirthDate(java.util.Calendar birthDate) {
        this.birthDate = birthDate;
    }


    /**
     * Gets the gender value for this PassportInfo.
     * 
     * @return gender
     */
    public java.lang.String getGender() {
        return gender;
    }


    /**
     * Sets the gender value for this PassportInfo.
     * 
     * @param gender
     */
    public void setGender(java.lang.String gender) {
        this.gender = gender;
    }


    /**
     * Gets the expiryDate value for this PassportInfo.
     * 
     * @return expiryDate
     */
    public java.util.Calendar getExpiryDate() {
        return expiryDate;
    }


    /**
     * Sets the expiryDate value for this PassportInfo.
     * 
     * @param expiryDate
     */
    public void setExpiryDate(java.util.Calendar expiryDate) {
        this.expiryDate = expiryDate;
    }


    /**
     * Gets the lastName value for this PassportInfo.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this PassportInfo.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the firstName value for this PassportInfo.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this PassportInfo.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PassportInfo)) return false;
        PassportInfo other = (PassportInfo) obj;
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
            ((this.passportNumber==null && other.getPassportNumber()==null) || 
             (this.passportNumber!=null &&
              this.passportNumber.equals(other.getPassportNumber()))) &&
            ((this.issuingCountry==null && other.getIssuingCountry()==null) || 
             (this.issuingCountry!=null &&
              this.issuingCountry.equals(other.getIssuingCountry()))) &&
            ((this.passengerNationality==null && other.getPassengerNationality()==null) || 
             (this.passengerNationality!=null &&
              this.passengerNationality.equals(other.getPassengerNationality()))) &&
            ((this.birthDate==null && other.getBirthDate()==null) || 
             (this.birthDate!=null &&
              this.birthDate.equals(other.getBirthDate()))) &&
            ((this.gender==null && other.getGender()==null) || 
             (this.gender!=null &&
              this.gender.equals(other.getGender()))) &&
            ((this.expiryDate==null && other.getExpiryDate()==null) || 
             (this.expiryDate!=null &&
              this.expiryDate.equals(other.getExpiryDate()))) &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName())));
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
        if (getPassportNumber() != null) {
            _hashCode += getPassportNumber().hashCode();
        }
        if (getIssuingCountry() != null) {
            _hashCode += getIssuingCountry().hashCode();
        }
        if (getPassengerNationality() != null) {
            _hashCode += getPassengerNationality().hashCode();
        }
        if (getBirthDate() != null) {
            _hashCode += getBirthDate().hashCode();
        }
        if (getGender() != null) {
            _hashCode += getGender().hashCode();
        }
        if (getExpiryDate() != null) {
            _hashCode += getExpiryDate().hashCode();
        }
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PassportInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "PassportInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Type"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "PassportType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passportNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PassportNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("issuingCountry");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "IssuingCountry"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerNationality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PassengerNationality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BirthDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Gender"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expiryDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ExpiryDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
