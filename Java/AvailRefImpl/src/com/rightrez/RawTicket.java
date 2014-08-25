/**
 * RawTicket.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class RawTicket  implements java.io.Serializable {
    private int sequence;

    private java.lang.String ticketNumber;

    private java.lang.String invoiceNumber;

    private java.lang.String carrierNumber;

    private java.lang.String carrierCode;

    private float amount;

    private boolean current;

    private java.lang.String lastName;

    private java.lang.String firstName;

    private java.lang.String currency;

    private java.lang.String timestamp;

    private java.util.Calendar ticketDateTime;

    private boolean isServiceFee;

    private java.lang.String nameNumber;

    private boolean eticket;

    private int[] segmentNumList;

    private int[] passNumList;

    private java.lang.String status;

    private int lineNumber;

    public RawTicket() {
    }

    public RawTicket(
           int sequence,
           java.lang.String ticketNumber,
           java.lang.String invoiceNumber,
           java.lang.String carrierNumber,
           java.lang.String carrierCode,
           float amount,
           boolean current,
           java.lang.String lastName,
           java.lang.String firstName,
           java.lang.String currency,
           java.lang.String timestamp,
           java.util.Calendar ticketDateTime,
           boolean isServiceFee,
           java.lang.String nameNumber,
           boolean eticket,
           int[] segmentNumList,
           int[] passNumList,
           java.lang.String status,
           int lineNumber) {
           this.sequence = sequence;
           this.ticketNumber = ticketNumber;
           this.invoiceNumber = invoiceNumber;
           this.carrierNumber = carrierNumber;
           this.carrierCode = carrierCode;
           this.amount = amount;
           this.current = current;
           this.lastName = lastName;
           this.firstName = firstName;
           this.currency = currency;
           this.timestamp = timestamp;
           this.ticketDateTime = ticketDateTime;
           this.isServiceFee = isServiceFee;
           this.nameNumber = nameNumber;
           this.eticket = eticket;
           this.segmentNumList = segmentNumList;
           this.passNumList = passNumList;
           this.status = status;
           this.lineNumber = lineNumber;
    }


    /**
     * Gets the sequence value for this RawTicket.
     * 
     * @return sequence
     */
    public int getSequence() {
        return sequence;
    }


    /**
     * Sets the sequence value for this RawTicket.
     * 
     * @param sequence
     */
    public void setSequence(int sequence) {
        this.sequence = sequence;
    }


    /**
     * Gets the ticketNumber value for this RawTicket.
     * 
     * @return ticketNumber
     */
    public java.lang.String getTicketNumber() {
        return ticketNumber;
    }


    /**
     * Sets the ticketNumber value for this RawTicket.
     * 
     * @param ticketNumber
     */
    public void setTicketNumber(java.lang.String ticketNumber) {
        this.ticketNumber = ticketNumber;
    }


    /**
     * Gets the invoiceNumber value for this RawTicket.
     * 
     * @return invoiceNumber
     */
    public java.lang.String getInvoiceNumber() {
        return invoiceNumber;
    }


    /**
     * Sets the invoiceNumber value for this RawTicket.
     * 
     * @param invoiceNumber
     */
    public void setInvoiceNumber(java.lang.String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }


    /**
     * Gets the carrierNumber value for this RawTicket.
     * 
     * @return carrierNumber
     */
    public java.lang.String getCarrierNumber() {
        return carrierNumber;
    }


    /**
     * Sets the carrierNumber value for this RawTicket.
     * 
     * @param carrierNumber
     */
    public void setCarrierNumber(java.lang.String carrierNumber) {
        this.carrierNumber = carrierNumber;
    }


    /**
     * Gets the carrierCode value for this RawTicket.
     * 
     * @return carrierCode
     */
    public java.lang.String getCarrierCode() {
        return carrierCode;
    }


    /**
     * Sets the carrierCode value for this RawTicket.
     * 
     * @param carrierCode
     */
    public void setCarrierCode(java.lang.String carrierCode) {
        this.carrierCode = carrierCode;
    }


    /**
     * Gets the amount value for this RawTicket.
     * 
     * @return amount
     */
    public float getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this RawTicket.
     * 
     * @param amount
     */
    public void setAmount(float amount) {
        this.amount = amount;
    }


    /**
     * Gets the current value for this RawTicket.
     * 
     * @return current
     */
    public boolean isCurrent() {
        return current;
    }


    /**
     * Sets the current value for this RawTicket.
     * 
     * @param current
     */
    public void setCurrent(boolean current) {
        this.current = current;
    }


    /**
     * Gets the lastName value for this RawTicket.
     * 
     * @return lastName
     */
    public java.lang.String getLastName() {
        return lastName;
    }


    /**
     * Sets the lastName value for this RawTicket.
     * 
     * @param lastName
     */
    public void setLastName(java.lang.String lastName) {
        this.lastName = lastName;
    }


    /**
     * Gets the firstName value for this RawTicket.
     * 
     * @return firstName
     */
    public java.lang.String getFirstName() {
        return firstName;
    }


    /**
     * Sets the firstName value for this RawTicket.
     * 
     * @param firstName
     */
    public void setFirstName(java.lang.String firstName) {
        this.firstName = firstName;
    }


    /**
     * Gets the currency value for this RawTicket.
     * 
     * @return currency
     */
    public java.lang.String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this RawTicket.
     * 
     * @param currency
     */
    public void setCurrency(java.lang.String currency) {
        this.currency = currency;
    }


    /**
     * Gets the timestamp value for this RawTicket.
     * 
     * @return timestamp
     */
    public java.lang.String getTimestamp() {
        return timestamp;
    }


    /**
     * Sets the timestamp value for this RawTicket.
     * 
     * @param timestamp
     */
    public void setTimestamp(java.lang.String timestamp) {
        this.timestamp = timestamp;
    }


    /**
     * Gets the ticketDateTime value for this RawTicket.
     * 
     * @return ticketDateTime
     */
    public java.util.Calendar getTicketDateTime() {
        return ticketDateTime;
    }


    /**
     * Sets the ticketDateTime value for this RawTicket.
     * 
     * @param ticketDateTime
     */
    public void setTicketDateTime(java.util.Calendar ticketDateTime) {
        this.ticketDateTime = ticketDateTime;
    }


    /**
     * Gets the isServiceFee value for this RawTicket.
     * 
     * @return isServiceFee
     */
    public boolean isIsServiceFee() {
        return isServiceFee;
    }


    /**
     * Sets the isServiceFee value for this RawTicket.
     * 
     * @param isServiceFee
     */
    public void setIsServiceFee(boolean isServiceFee) {
        this.isServiceFee = isServiceFee;
    }


    /**
     * Gets the nameNumber value for this RawTicket.
     * 
     * @return nameNumber
     */
    public java.lang.String getNameNumber() {
        return nameNumber;
    }


    /**
     * Sets the nameNumber value for this RawTicket.
     * 
     * @param nameNumber
     */
    public void setNameNumber(java.lang.String nameNumber) {
        this.nameNumber = nameNumber;
    }


    /**
     * Gets the eticket value for this RawTicket.
     * 
     * @return eticket
     */
    public boolean isEticket() {
        return eticket;
    }


    /**
     * Sets the eticket value for this RawTicket.
     * 
     * @param eticket
     */
    public void setEticket(boolean eticket) {
        this.eticket = eticket;
    }


    /**
     * Gets the segmentNumList value for this RawTicket.
     * 
     * @return segmentNumList
     */
    public int[] getSegmentNumList() {
        return segmentNumList;
    }


    /**
     * Sets the segmentNumList value for this RawTicket.
     * 
     * @param segmentNumList
     */
    public void setSegmentNumList(int[] segmentNumList) {
        this.segmentNumList = segmentNumList;
    }


    /**
     * Gets the passNumList value for this RawTicket.
     * 
     * @return passNumList
     */
    public int[] getPassNumList() {
        return passNumList;
    }


    /**
     * Sets the passNumList value for this RawTicket.
     * 
     * @param passNumList
     */
    public void setPassNumList(int[] passNumList) {
        this.passNumList = passNumList;
    }


    /**
     * Gets the status value for this RawTicket.
     * 
     * @return status
     */
    public java.lang.String getStatus() {
        return status;
    }


    /**
     * Sets the status value for this RawTicket.
     * 
     * @param status
     */
    public void setStatus(java.lang.String status) {
        this.status = status;
    }


    /**
     * Gets the lineNumber value for this RawTicket.
     * 
     * @return lineNumber
     */
    public int getLineNumber() {
        return lineNumber;
    }


    /**
     * Sets the lineNumber value for this RawTicket.
     * 
     * @param lineNumber
     */
    public void setLineNumber(int lineNumber) {
        this.lineNumber = lineNumber;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RawTicket)) return false;
        RawTicket other = (RawTicket) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.sequence == other.getSequence() &&
            ((this.ticketNumber==null && other.getTicketNumber()==null) || 
             (this.ticketNumber!=null &&
              this.ticketNumber.equals(other.getTicketNumber()))) &&
            ((this.invoiceNumber==null && other.getInvoiceNumber()==null) || 
             (this.invoiceNumber!=null &&
              this.invoiceNumber.equals(other.getInvoiceNumber()))) &&
            ((this.carrierNumber==null && other.getCarrierNumber()==null) || 
             (this.carrierNumber!=null &&
              this.carrierNumber.equals(other.getCarrierNumber()))) &&
            ((this.carrierCode==null && other.getCarrierCode()==null) || 
             (this.carrierCode!=null &&
              this.carrierCode.equals(other.getCarrierCode()))) &&
            this.amount == other.getAmount() &&
            this.current == other.isCurrent() &&
            ((this.lastName==null && other.getLastName()==null) || 
             (this.lastName!=null &&
              this.lastName.equals(other.getLastName()))) &&
            ((this.firstName==null && other.getFirstName()==null) || 
             (this.firstName!=null &&
              this.firstName.equals(other.getFirstName()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.timestamp==null && other.getTimestamp()==null) || 
             (this.timestamp!=null &&
              this.timestamp.equals(other.getTimestamp()))) &&
            ((this.ticketDateTime==null && other.getTicketDateTime()==null) || 
             (this.ticketDateTime!=null &&
              this.ticketDateTime.equals(other.getTicketDateTime()))) &&
            this.isServiceFee == other.isIsServiceFee() &&
            ((this.nameNumber==null && other.getNameNumber()==null) || 
             (this.nameNumber!=null &&
              this.nameNumber.equals(other.getNameNumber()))) &&
            this.eticket == other.isEticket() &&
            ((this.segmentNumList==null && other.getSegmentNumList()==null) || 
             (this.segmentNumList!=null &&
              java.util.Arrays.equals(this.segmentNumList, other.getSegmentNumList()))) &&
            ((this.passNumList==null && other.getPassNumList()==null) || 
             (this.passNumList!=null &&
              java.util.Arrays.equals(this.passNumList, other.getPassNumList()))) &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            this.lineNumber == other.getLineNumber();
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
        _hashCode += getSequence();
        if (getTicketNumber() != null) {
            _hashCode += getTicketNumber().hashCode();
        }
        if (getInvoiceNumber() != null) {
            _hashCode += getInvoiceNumber().hashCode();
        }
        if (getCarrierNumber() != null) {
            _hashCode += getCarrierNumber().hashCode();
        }
        if (getCarrierCode() != null) {
            _hashCode += getCarrierCode().hashCode();
        }
        _hashCode += new Float(getAmount()).hashCode();
        _hashCode += (isCurrent() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLastName() != null) {
            _hashCode += getLastName().hashCode();
        }
        if (getFirstName() != null) {
            _hashCode += getFirstName().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        if (getTimestamp() != null) {
            _hashCode += getTimestamp().hashCode();
        }
        if (getTicketDateTime() != null) {
            _hashCode += getTicketDateTime().hashCode();
        }
        _hashCode += (isIsServiceFee() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNameNumber() != null) {
            _hashCode += getNameNumber().hashCode();
        }
        _hashCode += (isEticket() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSegmentNumList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSegmentNumList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSegmentNumList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPassNumList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPassNumList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPassNumList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        _hashCode += getLineNumber();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RawTicket.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawTicket"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Sequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TicketNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "InvoiceNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CarrierNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CarrierCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("current");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Current"));
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Currency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timestamp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Timestamp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TicketDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isServiceFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "IsServiceFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "NameNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eticket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Eticket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentNumList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "SegmentNumList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passNumList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PassNumList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Status"));
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
