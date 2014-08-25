/**
 * PassengerAccountingItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class PassengerAccountingItem  implements java.io.Serializable {
    private java.lang.String referenceNumber;

    private java.lang.String segmentNumber;

    private java.lang.String accountNumber;

    private java.lang.String costCenter;

    private java.lang.String clientReference;

    private java.lang.String IATACompanyNumber;

    private int lineNumber;

    private java.lang.String[] passengerReferences;

    public PassengerAccountingItem() {
    }

    public PassengerAccountingItem(
           java.lang.String referenceNumber,
           java.lang.String segmentNumber,
           java.lang.String accountNumber,
           java.lang.String costCenter,
           java.lang.String clientReference,
           java.lang.String IATACompanyNumber,
           int lineNumber,
           java.lang.String[] passengerReferences) {
           this.referenceNumber = referenceNumber;
           this.segmentNumber = segmentNumber;
           this.accountNumber = accountNumber;
           this.costCenter = costCenter;
           this.clientReference = clientReference;
           this.IATACompanyNumber = IATACompanyNumber;
           this.lineNumber = lineNumber;
           this.passengerReferences = passengerReferences;
    }


    /**
     * Gets the referenceNumber value for this PassengerAccountingItem.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this PassengerAccountingItem.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the segmentNumber value for this PassengerAccountingItem.
     * 
     * @return segmentNumber
     */
    public java.lang.String getSegmentNumber() {
        return segmentNumber;
    }


    /**
     * Sets the segmentNumber value for this PassengerAccountingItem.
     * 
     * @param segmentNumber
     */
    public void setSegmentNumber(java.lang.String segmentNumber) {
        this.segmentNumber = segmentNumber;
    }


    /**
     * Gets the accountNumber value for this PassengerAccountingItem.
     * 
     * @return accountNumber
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this PassengerAccountingItem.
     * 
     * @param accountNumber
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the costCenter value for this PassengerAccountingItem.
     * 
     * @return costCenter
     */
    public java.lang.String getCostCenter() {
        return costCenter;
    }


    /**
     * Sets the costCenter value for this PassengerAccountingItem.
     * 
     * @param costCenter
     */
    public void setCostCenter(java.lang.String costCenter) {
        this.costCenter = costCenter;
    }


    /**
     * Gets the clientReference value for this PassengerAccountingItem.
     * 
     * @return clientReference
     */
    public java.lang.String getClientReference() {
        return clientReference;
    }


    /**
     * Sets the clientReference value for this PassengerAccountingItem.
     * 
     * @param clientReference
     */
    public void setClientReference(java.lang.String clientReference) {
        this.clientReference = clientReference;
    }


    /**
     * Gets the IATACompanyNumber value for this PassengerAccountingItem.
     * 
     * @return IATACompanyNumber
     */
    public java.lang.String getIATACompanyNumber() {
        return IATACompanyNumber;
    }


    /**
     * Sets the IATACompanyNumber value for this PassengerAccountingItem.
     * 
     * @param IATACompanyNumber
     */
    public void setIATACompanyNumber(java.lang.String IATACompanyNumber) {
        this.IATACompanyNumber = IATACompanyNumber;
    }


    /**
     * Gets the lineNumber value for this PassengerAccountingItem.
     * 
     * @return lineNumber
     */
    public int getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this PassengerAccountingItem.
     * 
     * @param lineNumber
     */
    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }


    /**
     * Gets the passengerReferences value for this PassengerAccountingItem.
     * 
     * @return passengerReferences
     */
    public java.lang.String[] getPassengerReferences() {
        return passengerReferences;
    }


    /**
     * Sets the passengerReferences value for this PassengerAccountingItem.
     * 
     * @param passengerReferences
     */
    public void setPassengerReferences(java.lang.String[] passengerReferences) {
        this.passengerReferences = passengerReferences;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PassengerAccountingItem)) return false;
        PassengerAccountingItem other = (PassengerAccountingItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            ((this.segmentNumber==null && other.getSegmentNumber()==null) || 
             (this.segmentNumber!=null &&
              this.segmentNumber.equals(other.getSegmentNumber()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.costCenter==null && other.getCostCenter()==null) || 
             (this.costCenter!=null &&
              this.costCenter.equals(other.getCostCenter()))) &&
            ((this.clientReference==null && other.getClientReference()==null) || 
             (this.clientReference!=null &&
              this.clientReference.equals(other.getClientReference()))) &&
            ((this.IATACompanyNumber==null && other.getIATACompanyNumber()==null) || 
             (this.IATACompanyNumber!=null &&
              this.IATACompanyNumber.equals(other.getIATACompanyNumber()))) &&
            this.lineNumber == other.getLineNumber() &&
            ((this.passengerReferences==null && other.getPassengerReferences()==null) || 
             (this.passengerReferences!=null &&
              java.util.Arrays.equals(this.passengerReferences, other.getPassengerReferences())));
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
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        if (getSegmentNumber() != null) {
            _hashCode += getSegmentNumber().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getCostCenter() != null) {
            _hashCode += getCostCenter().hashCode();
        }
        if (getClientReference() != null) {
            _hashCode += getClientReference().hashCode();
        }
        if (getIATACompanyNumber() != null) {
            _hashCode += getIATACompanyNumber().hashCode();
        }
        _hashCode += getLineNumber();
        if (getPassengerReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPassengerReferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPassengerReferences(), i);
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
        new org.apache.axis.description.TypeDesc(PassengerAccountingItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "PassengerAccountingItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ReferenceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "SegmentNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("costCenter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CostCenter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientReference");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ClientReference"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IATACompanyNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "IATACompanyNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "LineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PassengerReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "string"));
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
