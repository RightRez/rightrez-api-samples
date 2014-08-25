/**
 * RRZAirSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class RRZAirSegment  extends com.rightrez.RawAirSegment  implements java.io.Serializable {
    private java.lang.Integer blockLinkNumber;

    private com.rightrez.SeatMap seatMap;

    private com.rightrez.TimeSpan connectTime;

    private com.rightrez.FaresItem faresItem;

    private com.rightrez.FaresItem[] bumpFares;

    private java.lang.String groupCOS;

    private boolean cancelled;

    private java.lang.String serviceLevel;

    public RRZAirSegment() {
    }

    public RRZAirSegment(
           int segmentNumber,
           com.rightrez.SEGMENT_TYPE segmentType,
           java.lang.String referenceNumber,
           boolean isPlaceholder,
           com.rightrez.StopCity[] stopCities,
           boolean hasGroup,
           java.lang.String ackn,
           boolean departed,
           java.lang.String carrier,
           java.lang.String flightNumber,
           java.lang.String COS,
           java.lang.String departCity,
           java.lang.String arriveCity,
           java.util.Calendar departTime,
           java.util.Calendar arriveTime,
           java.lang.String fltStatus,
           int numberOfPassengers,
           java.lang.String meal,
           java.lang.String fareBasis,
           int stops,
           java.lang.String equipment,
           com.rightrez.TimeSpan journeyTime,
           java.lang.String timeDiff,
           java.lang.String groupLocator,
           int groupLinenum,
           java.lang.String operatedBy,
           java.lang.String operatedByCode,
           java.lang.String planeChange,
           boolean link,
           boolean codeShare,
           boolean eticket,
           int marriageNumber,
           int minConnectTime,
           java.lang.String airComment,
           boolean hideComment,
           com.rightrez.RawSeat[] seatList,
           double airMilesFlown,
           java.lang.Integer blockLinkNumber,
           com.rightrez.SeatMap seatMap,
           com.rightrez.TimeSpan connectTime,
           com.rightrez.FaresItem faresItem,
           com.rightrez.FaresItem[] bumpFares,
           java.lang.String groupCOS,
           boolean cancelled,
           java.lang.String serviceLevel) {
        super(
            segmentNumber,
            segmentType,
            referenceNumber,
            isPlaceholder,
            stopCities,
            hasGroup,
            ackn,
            departed,
            carrier,
            flightNumber,
            COS,
            departCity,
            arriveCity,
            departTime,
            arriveTime,
            fltStatus,
            numberOfPassengers,
            meal,
            fareBasis,
            stops,
            equipment,
            journeyTime,
            timeDiff,
            groupLocator,
            groupLinenum,
            operatedBy,
            operatedByCode,
            planeChange,
            link,
            codeShare,
            eticket,
            marriageNumber,
            minConnectTime,
            airComment,
            hideComment,
            seatList,
            airMilesFlown);
        this.blockLinkNumber = blockLinkNumber;
        this.seatMap = seatMap;
        this.connectTime = connectTime;
        this.faresItem = faresItem;
        this.bumpFares = bumpFares;
        this.groupCOS = groupCOS;
        this.cancelled = cancelled;
        this.serviceLevel = serviceLevel;
    }


    /**
     * Gets the blockLinkNumber value for this RRZAirSegment.
     * 
     * @return blockLinkNumber
     */
    public java.lang.Integer getBlockLinkNumber() {
        return blockLinkNumber;
    }


    /**
     * Sets the blockLinkNumber value for this RRZAirSegment.
     * 
     * @param blockLinkNumber
     */
    public void setBlockLinkNumber(java.lang.Integer blockLinkNumber) {
        this.blockLinkNumber = blockLinkNumber;
    }


    /**
     * Gets the seatMap value for this RRZAirSegment.
     * 
     * @return seatMap
     */
    public com.rightrez.SeatMap getSeatMap() {
        return seatMap;
    }


    /**
     * Sets the seatMap value for this RRZAirSegment.
     * 
     * @param seatMap
     */
    public void setSeatMap(com.rightrez.SeatMap seatMap) {
        this.seatMap = seatMap;
    }


    /**
     * Gets the connectTime value for this RRZAirSegment.
     * 
     * @return connectTime
     */
    public com.rightrez.TimeSpan getConnectTime() {
        return connectTime;
    }


    /**
     * Sets the connectTime value for this RRZAirSegment.
     * 
     * @param connectTime
     */
    public void setConnectTime(com.rightrez.TimeSpan connectTime) {
        this.connectTime = connectTime;
    }


    /**
     * Gets the faresItem value for this RRZAirSegment.
     * 
     * @return faresItem
     */
    public com.rightrez.FaresItem getFaresItem() {
        return faresItem;
    }


    /**
     * Sets the faresItem value for this RRZAirSegment.
     * 
     * @param faresItem
     */
    public void setFaresItem(com.rightrez.FaresItem faresItem) {
        this.faresItem = faresItem;
    }


    /**
     * Gets the bumpFares value for this RRZAirSegment.
     * 
     * @return bumpFares
     */
    public com.rightrez.FaresItem[] getBumpFares() {
        return bumpFares;
    }


    /**
     * Sets the bumpFares value for this RRZAirSegment.
     * 
     * @param bumpFares
     */
    public void setBumpFares(com.rightrez.FaresItem[] bumpFares) {
        this.bumpFares = bumpFares;
    }


    /**
     * Gets the groupCOS value for this RRZAirSegment.
     * 
     * @return groupCOS
     */
    public java.lang.String getGroupCOS() {
        return groupCOS;
    }


    /**
     * Sets the groupCOS value for this RRZAirSegment.
     * 
     * @param groupCOS
     */
    public void setGroupCOS(java.lang.String groupCOS) {
        this.groupCOS = groupCOS;
    }


    /**
     * Gets the cancelled value for this RRZAirSegment.
     * 
     * @return cancelled
     */
    public boolean isCancelled() {
        return cancelled;
    }


    /**
     * Sets the cancelled value for this RRZAirSegment.
     * 
     * @param cancelled
     */
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }


    /**
     * Gets the serviceLevel value for this RRZAirSegment.
     * 
     * @return serviceLevel
     */
    public java.lang.String getServiceLevel() {
        return serviceLevel;
    }


    /**
     * Sets the serviceLevel value for this RRZAirSegment.
     * 
     * @param serviceLevel
     */
    public void setServiceLevel(java.lang.String serviceLevel) {
        this.serviceLevel = serviceLevel;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RRZAirSegment)) return false;
        RRZAirSegment other = (RRZAirSegment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.blockLinkNumber==null && other.getBlockLinkNumber()==null) || 
             (this.blockLinkNumber!=null &&
              this.blockLinkNumber.equals(other.getBlockLinkNumber()))) &&
            ((this.seatMap==null && other.getSeatMap()==null) || 
             (this.seatMap!=null &&
              this.seatMap.equals(other.getSeatMap()))) &&
            ((this.connectTime==null && other.getConnectTime()==null) || 
             (this.connectTime!=null &&
              this.connectTime.equals(other.getConnectTime()))) &&
            ((this.faresItem==null && other.getFaresItem()==null) || 
             (this.faresItem!=null &&
              this.faresItem.equals(other.getFaresItem()))) &&
            ((this.bumpFares==null && other.getBumpFares()==null) || 
             (this.bumpFares!=null &&
              java.util.Arrays.equals(this.bumpFares, other.getBumpFares()))) &&
            ((this.groupCOS==null && other.getGroupCOS()==null) || 
             (this.groupCOS!=null &&
              this.groupCOS.equals(other.getGroupCOS()))) &&
            this.cancelled == other.isCancelled() &&
            ((this.serviceLevel==null && other.getServiceLevel()==null) || 
             (this.serviceLevel!=null &&
              this.serviceLevel.equals(other.getServiceLevel())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getBlockLinkNumber() != null) {
            _hashCode += getBlockLinkNumber().hashCode();
        }
        if (getSeatMap() != null) {
            _hashCode += getSeatMap().hashCode();
        }
        if (getConnectTime() != null) {
            _hashCode += getConnectTime().hashCode();
        }
        if (getFaresItem() != null) {
            _hashCode += getFaresItem().hashCode();
        }
        if (getBumpFares() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBumpFares());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBumpFares(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGroupCOS() != null) {
            _hashCode += getGroupCOS().hashCode();
        }
        _hashCode += (isCancelled() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getServiceLevel() != null) {
            _hashCode += getServiceLevel().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RRZAirSegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RRZAirSegment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockLinkNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BlockLinkNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seatMap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "SeatMap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "SeatMap"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("connectTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ConnectTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "TimeSpan"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faresItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FaresItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FaresItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bumpFares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BumpFares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FaresItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "FaresItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupCOS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "GroupCOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cancelled");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Cancelled"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ServiceLevel"));
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
