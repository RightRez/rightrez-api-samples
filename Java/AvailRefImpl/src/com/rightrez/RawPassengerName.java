/**
 * RawPassengerName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class RawPassengerName  implements java.io.Serializable {
    private com.rightrez.PassengerAccountingItem passengerAccountingInfo;

    private int passengerNumber;

    private int groupNumber;

    private boolean isInfant;

    private boolean isGroupName;

    private java.lang.String lastName;

    private java.lang.String firstName;

    private java.lang.String remark;

    private java.lang.String groupID;

    private int infantMonths;

    private java.lang.String referenceNumber;

    private java.lang.String passengerType;

    private int lastNameNumber;

    private int firstNameNumber;

    private java.lang.String accountingCode;

    public RawPassengerName() {
    }

    public RawPassengerName(
           com.rightrez.PassengerAccountingItem passengerAccountingInfo,
           int passengerNumber,
           int groupNumber,
           boolean isInfant,
           boolean isGroupName,
           java.lang.String lastName,
           java.lang.String firstName,
           java.lang.String remark,
           java.lang.String groupID,
           int infantMonths,
           java.lang.String referenceNumber,
           java.lang.String passengerType,
           int lastNameNumber,
           int firstNameNumber,
           java.lang.String accountingCode) {
           this.passengerAccountingInfo = passengerAccountingInfo;
           this.passengerNumber = passengerNumber;
           this.groupNumber = groupNumber;
           this.isInfant = isInfant;
           this.isGroupName = isGroupName;
           this.lastName = lastName;
           this.firstName = firstName;
           this.remark = remark;
           this.groupID = groupID;
           this.infantMonths = infantMonths;
           this.referenceNumber = referenceNumber;
           this.passengerType = passengerType;
           this.lastNameNumber = lastNameNumber;
           this.firstNameNumber = firstNameNumber;
           this.accountingCode = accountingCode;
    }


    /**
     * Gets the passengerAccountingInfo value for this RawPassengerName.
     * 
     * @return passengerAccountingInfo
     */
    public com.rightrez.PassengerAccountingItem getPassengerAccountingInfo() {
        return passengerAccountingInfo;
    }


    /**
     * Sets the passengerAccountingInfo value for this RawPassengerName.
     * 
     * @param passengerAccountingInfo
     */
    public void setPassengerAccountingInfo(com.rightrez.PassengerAccountingItem passengerAccountingInfo) {
        this.passengerAccountingInfo = passengerAccountingInfo;
    }


    /**
     * Gets the passengerNumber value for this RawPassengerName.
     * 
     * @return passengerNumber
     */
    public int getPassengerNumber() {
        return passengerNumber;
    }


    /**
     * Sets the passengerNumber value for this RawPassengerName.
     * 
     * @param passengerNumber
     */
    public void setPassengerNumber(int passengerNumber) {
        this.passengerNumber = passengerNumber;
    }


    /**
     * Gets the groupNumber value for this RawPassengerName.
     * 
     * @return groupNumber
     */
    public int getGroupNumber() {
        return groupNumber;
    }


    /**
     * Sets the groupNumber value for this RawPassengerName.
     * 
     * @param groupNumber
     */
    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }


    /**
     * Gets the isInfant value for this RawPassengerName.
     * 
     * @return isInfant
     */
    public boolean isIsInfant() {
        return isInfant;
    }


    /**
     * Sets the isInfant value for this RawPassengerName.
     * 
     * @param isInfant
     */
    public void setIsInfant(boolean isInfant) {
        this.isInfant = isInfant;
    }


    /**
     * Gets the isGroupName value for this RawPassengerName.
     * 
     * @return isGroupName
     */
    public boolean isIsGroupName() {
        return isGroupName;
    }


    /**
     * Sets the isGroupName value for this RawPassengerName.
     * 
     * @param isGroupName
     */
    public void setIsGroupName(boolean isGroupName) {
        this.isGroupName = isGroupName;
    }


    /**
     * Gets the lastName value for this RawPassengerName.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this RawPassengerName.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the firstName value for this RawPassengerName.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this RawPassengerName.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the remark value for this RawPassengerName.
     * 
     * @return remark
     */
    public java.lang.String getRemark() {
        return remark;
    }


    /**
     * Sets the remark value for this RawPassengerName.
     * 
     * @param remark
     */
    public void setRemark(java.lang.String remark) {
        this.remark = remark;
    }


    /**
     * Gets the groupID value for this RawPassengerName.
     * 
     * @return groupID
     */
    public java.lang.String getGroupID() {
        return groupID;
    }


    /**
     * Sets the groupID value for this RawPassengerName.
     * 
     * @param groupID
     */
    public void setGroupID(java.lang.String groupID) {
        this.groupID = groupID;
    }


    /**
     * Gets the infantMonths value for this RawPassengerName.
     * 
     * @return infantMonths
     */
    public int getInfantMonths() {
        return infantMonths;
    }


    /**
     * Sets the infantMonths value for this RawPassengerName.
     * 
     * @param infantMonths
     */
    public void setInfantMonths(int infantMonths) {
        this.infantMonths = infantMonths;
    }


    /**
     * Gets the referenceNumber value for this RawPassengerName.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this RawPassengerName.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the passengerType value for this RawPassengerName.
     * 
     * @return passengerType
     */
    public java.lang.String getPassengerType() {
        return passengerType;
    }


    /**
     * Sets the passengerType value for this RawPassengerName.
     * 
     * @param passengerType
     */
    public void setPassengerType(java.lang.String passengerType) {
        this.passengerType = passengerType;
    }


    /**
     * Gets the lastNameNumber value for this RawPassengerName.
     * 
     * @return lastNameNumber
     */
    public int getLastNameNumber() {
        return lastNameNumber;
    }


    /**
     * Sets the lastNameNumber value for this RawPassengerName.
     * 
     * @param lastNameNumber
     */
    public void setLastNameNumber(int lastNameNumber) {
        this.lastNameNumber = lastNameNumber;
    }


    /**
     * Gets the firstNameNumber value for this RawPassengerName.
     * 
     * @return firstNameNumber
     */
    public int getFirstNameNumber() {
        return firstNameNumber;
    }


    /**
     * Sets the firstNameNumber value for this RawPassengerName.
     * 
     * @param firstNameNumber
     */
    public void setFirstNameNumber(int firstNameNumber) {
        this.firstNameNumber = firstNameNumber;
    }


    /**
     * Gets the accountingCode value for this RawPassengerName.
     * 
     * @return accountingCode
     */
    public java.lang.String getAccountingCode() {
        return accountingCode;
    }


    /**
     * Sets the accountingCode value for this RawPassengerName.
     * 
     * @param accountingCode
     */
    public void setAccountingCode(java.lang.String accountingCode) {
        this.accountingCode = accountingCode;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RawPassengerName)) return false;
        RawPassengerName other = (RawPassengerName) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.passengerAccountingInfo==null && other.getPassengerAccountingInfo()==null) || 
             (this.passengerAccountingInfo!=null &&
              this.passengerAccountingInfo.equals(other.getPassengerAccountingInfo()))) &&
            this.passengerNumber == other.getPassengerNumber() &&
            this.groupNumber == other.getGroupNumber() &&
            this.isInfant == other.isIsInfant() &&
            this.isGroupName == other.isIsGroupName() &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.remark==null && other.getRemark()==null) || 
             (this.remark!=null &&
              this.remark.equals(other.getRemark()))) &&
            ((this.groupID==null && other.getGroupID()==null) || 
             (this.groupID!=null &&
              this.groupID.equals(other.getGroupID()))) &&
            this.infantMonths == other.getInfantMonths() &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.passengerType==null && other.getPassengerType()==null) || 
             (this.passengerType!=null &&
              this.passengerType.equals(other.getPassengerType()))) &&
            this.lastNameNumber == other.getLastNameNumber() &&
            this.firstNameNumber == other.getFirstNameNumber() &&
            ((this.accountingCode==null && other.getAccountingCode()==null) || 
             (this.accountingCode!=null &&
              this.accountingCode.equals(other.getAccountingCode())));
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
        if (getPassengerAccountingInfo() != null) {
            _hashCode += getPassengerAccountingInfo().hashCode();
        }
        _hashCode += getPassengerNumber();
        _hashCode += getGroupNumber();
        _hashCode += (isIsInfant() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsGroupName() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getRemark() != null) {
            _hashCode += getRemark().hashCode();
        }
        if (getGroupID() != null) {
            _hashCode += getGroupID().hashCode();
        }
        _hashCode += getInfantMonths();
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getPassengerType() != null) {
            _hashCode += getPassengerType().hashCode();
        }
        _hashCode += getLastNameNumber();
        _hashCode += getFirstNameNumber();
        if (getAccountingCode() != null) {
            _hashCode += getAccountingCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RawPassengerName.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawPassengerName"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerAccountingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PassengerAccountingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "PassengerAccountingItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PassengerNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "GroupNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInfant");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "IsInfant"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGroupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "IsGroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("remark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Remark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "GroupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infantMonths");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "InfantMonths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PassengerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastNameNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "LastNameNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("firstNameNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FirstNameNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AccountingCode"));
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
