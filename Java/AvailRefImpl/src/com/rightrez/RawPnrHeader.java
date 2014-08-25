/**
 * RawPnrHeader.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class RawPnrHeader  implements java.io.Serializable {
    private java.lang.String locator;

    private java.lang.String agentID;

    private java.util.Calendar createDate;

    private java.lang.String headerRemark;

    private java.lang.String additionalContent;

    private java.lang.String PCC;

    public RawPnrHeader() {
    }

    public RawPnrHeader(
           java.lang.String locator,
           java.lang.String agentID,
           java.util.Calendar createDate,
           java.lang.String headerRemark,
           java.lang.String additionalContent,
           java.lang.String PCC) {
           this.locator = locator;
           this.agentID = agentID;
           this.createDate = createDate;
           this.headerRemark = headerRemark;
           this.additionalContent = additionalContent;
           this.PCC = PCC;
    }


    /**
     * Gets the locator value for this RawPnrHeader.
     * 
     * @return locator
     */
    public java.lang.String getLocator() {
        return locator;
    }


    /**
     * Sets the locator value for this RawPnrHeader.
     * 
     * @param locator
     */
    public void setLocator(java.lang.String locator) {
        this.locator = locator;
    }


    /**
     * Gets the agentID value for this RawPnrHeader.
     * 
     * @return agentID
     */
    public java.lang.String getAgentID() {
        return agentID;
    }


    /**
     * Sets the agentID value for this RawPnrHeader.
     * 
     * @param agentID
     */
    public void setAgentID(java.lang.String agentID) {
        this.agentID = agentID;
    }


    /**
     * Gets the createDate value for this RawPnrHeader.
     * 
     * @return createDate
     */
    public java.util.Calendar getCreateDate() {
        return createDate;
    }


    /**
     * Sets the createDate value for this RawPnrHeader.
     * 
     * @param createDate
     */
    public void setCreateDate(java.util.Calendar createDate) {
        this.createDate = createDate;
    }


    /**
     * Gets the headerRemark value for this RawPnrHeader.
     * 
     * @return headerRemark
     */
    public java.lang.String getHeaderRemark() {
        return headerRemark;
    }


    /**
     * Sets the headerRemark value for this RawPnrHeader.
     * 
     * @param headerRemark
     */
    public void setHeaderRemark(java.lang.String headerRemark) {
        this.headerRemark = headerRemark;
    }


    /**
     * Gets the additionalContent value for this RawPnrHeader.
     * 
     * @return additionalContent
     */
    public java.lang.String getAdditionalContent() {
        return additionalContent;
    }


    /**
     * Sets the additionalContent value for this RawPnrHeader.
     * 
     * @param additionalContent
     */
    public void setAdditionalContent(java.lang.String additionalContent) {
        this.additionalContent = additionalContent;
    }


    /**
     * Gets the PCC value for this RawPnrHeader.
     * 
     * @return PCC
     */
    public java.lang.String getPCC() {
        return PCC;
    }


    /**
     * Sets the PCC value for this RawPnrHeader.
     * 
     * @param PCC
     */
    public void setPCC(java.lang.String PCC) {
        this.PCC = PCC;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RawPnrHeader)) return false;
        RawPnrHeader other = (RawPnrHeader) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.locator==null && other.getLocator()==null) || 
             (this.locator!=null &&
              this.locator.equals(other.getLocator()))) &&
            ((this.agentID==null && other.getAgentID()==null) || 
             (this.agentID!=null &&
              this.agentID.equals(other.getAgentID()))) &&
            ((this.createDate==null && other.getCreateDate()==null) || 
             (this.createDate!=null &&
              this.createDate.equals(other.getCreateDate()))) &&
            ((this.headerRemark==null && other.getHeaderRemark()==null) || 
             (this.headerRemark!=null &&
              this.headerRemark.equals(other.getHeaderRemark()))) &&
            ((this.additionalContent==null && other.getAdditionalContent()==null) || 
             (this.additionalContent!=null &&
              this.additionalContent.equals(other.getAdditionalContent()))) &&
            ((this.PCC==null && other.getPCC()==null) || 
             (this.PCC!=null &&
              this.PCC.equals(other.getPCC())));
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
        if (getLocator() != null) {
            _hashCode += getLocator().hashCode();
        }
        if (getAgentID() != null) {
            _hashCode += getAgentID().hashCode();
        }
        if (getCreateDate() != null) {
            _hashCode += getCreateDate().hashCode();
        }
        if (getHeaderRemark() != null) {
            _hashCode += getHeaderRemark().hashCode();
        }
        if (getAdditionalContent() != null) {
            _hashCode += getAdditionalContent().hashCode();
        }
        if (getPCC() != null) {
            _hashCode += getPCC().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RawPnrHeader.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawPnrHeader"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Locator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("agentID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AgentID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("createDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CreateDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("headerRemark");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "HeaderRemark"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AdditionalContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PCC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PCC"));
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
