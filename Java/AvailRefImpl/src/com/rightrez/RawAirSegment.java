/**
 * RawAirSegment.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class RawAirSegment  extends com.rightrez.RawSegment  implements java.io.Serializable {
    private com.rightrez.StopCity[] stopCities;

    private boolean hasGroup;

    private java.lang.String ackn;

    private boolean departed;

    private java.lang.String carrier;

    private java.lang.String flightNumber;

    private java.lang.String COS;

    private java.lang.String departCity;

    private java.lang.String arriveCity;

    private java.util.Calendar departTime;

    private java.util.Calendar arriveTime;

    private java.lang.String fltStatus;

    private int numberOfPassengers;

    private java.lang.String meal;

    private java.lang.String fareBasis;

    private int stops;

    private java.lang.String equipment;

    private com.rightrez.TimeSpan journeyTime;

    private java.lang.String timeDiff;

    private java.lang.String groupLocator;

    private int groupLinenum;

    private java.lang.String operatedBy;

    private java.lang.String operatedByCode;

    private java.lang.String planeChange;

    private boolean link;

    private boolean codeShare;

    private boolean eticket;

    private int marriageNumber;

    private int minConnectTime;

    private java.lang.String airComment;

    private boolean hideComment;

    private com.rightrez.RawSeat[] seatList;

    private double airMilesFlown;

    public RawAirSegment() {
    }

    public RawAirSegment(
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
           double airMilesFlown) {
        super(
            segmentNumber,
            segmentType,
            referenceNumber,
            isPlaceholder);
        this.stopCities = stopCities;
        this.hasGroup = hasGroup;
        this.ackn = ackn;
        this.departed = departed;
        this.carrier = carrier;
        this.flightNumber = flightNumber;
        this.COS = COS;
        this.departCity = departCity;
        this.arriveCity = arriveCity;
        this.departTime = departTime;
        this.arriveTime = arriveTime;
        this.fltStatus = fltStatus;
        this.numberOfPassengers = numberOfPassengers;
        this.meal = meal;
        this.fareBasis = fareBasis;
        this.stops = stops;
        this.equipment = equipment;
        this.journeyTime = journeyTime;
        this.timeDiff = timeDiff;
        this.groupLocator = groupLocator;
        this.groupLinenum = groupLinenum;
        this.operatedBy = operatedBy;
        this.operatedByCode = operatedByCode;
        this.planeChange = planeChange;
        this.link = link;
        this.codeShare = codeShare;
        this.eticket = eticket;
        this.marriageNumber = marriageNumber;
        this.minConnectTime = minConnectTime;
        this.airComment = airComment;
        this.hideComment = hideComment;
        this.seatList = seatList;
        this.airMilesFlown = airMilesFlown;
    }


    /**
     * Gets the stopCities value for this RawAirSegment.
     * 
     * @return stopCities
     */
    public com.rightrez.StopCity[] getStopCities() {
        return stopCities;
    }


    /**
     * Sets the stopCities value for this RawAirSegment.
     * 
     * @param stopCities
     */
    public void setStopCities(com.rightrez.StopCity[] stopCities) {
        this.stopCities = stopCities;
    }


    /**
     * Gets the hasGroup value for this RawAirSegment.
     * 
     * @return hasGroup
     */
    public boolean isHasGroup() {
        return hasGroup;
    }


    /**
     * Sets the hasGroup value for this RawAirSegment.
     * 
     * @param hasGroup
     */
    public void setHasGroup(boolean hasGroup) {
        this.hasGroup = hasGroup;
    }


    /**
     * Gets the ackn value for this RawAirSegment.
     * 
     * @return ackn
     */
    public java.lang.String getAckn() {
        return ackn;
    }


    /**
     * Sets the ackn value for this RawAirSegment.
     * 
     * @param ackn
     */
    public void setAckn(java.lang.String ackn) {
        this.ackn = ackn;
    }


    /**
     * Gets the departed value for this RawAirSegment.
     * 
     * @return departed
     */
    public boolean isDeparted() {
        return departed;
    }


    /**
     * Sets the departed value for this RawAirSegment.
     * 
     * @param departed
     */
    public void setDeparted(boolean departed) {
        this.departed = departed;
    }


    /**
     * Gets the carrier value for this RawAirSegment.
     * 
     * @return carrier
     */
    public java.lang.String getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this RawAirSegment.
     * 
     * @param carrier
     */
    public void setCarrier(java.lang.String carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the flightNumber value for this RawAirSegment.
     * 
     * @return flightNumber
     */
    public java.lang.String getFlightNumber() {
        return flightNumber;
    }


    /**
     * Sets the flightNumber value for this RawAirSegment.
     * 
     * @param flightNumber
     */
    public void setFlightNumber(java.lang.String flightNumber) {
        this.flightNumber = flightNumber;
    }


    /**
     * Gets the COS value for this RawAirSegment.
     * 
     * @return COS
     */
    public java.lang.String getCOS() {
        return COS;
    }


    /**
     * Sets the COS value for this RawAirSegment.
     * 
     * @param COS
     */
    public void setCOS(java.lang.String COS) {
        this.COS = COS;
    }


    /**
     * Gets the departCity value for this RawAirSegment.
     * 
     * @return departCity
     */
    public java.lang.String getDepartCity() {
        return departCity;
    }


    /**
     * Sets the departCity value for this RawAirSegment.
     * 
     * @param departCity
     */
    public void setDepartCity(java.lang.String departCity) {
        this.departCity = departCity;
    }


    /**
     * Gets the arriveCity value for this RawAirSegment.
     * 
     * @return arriveCity
     */
    public java.lang.String getArriveCity() {
        return arriveCity;
    }


    /**
     * Sets the arriveCity value for this RawAirSegment.
     * 
     * @param arriveCity
     */
    public void setArriveCity(java.lang.String arriveCity) {
        this.arriveCity = arriveCity;
    }


    /**
     * Gets the departTime value for this RawAirSegment.
     * 
     * @return departTime
     */
    public java.util.Calendar getDepartTime() {
        return departTime;
    }


    /**
     * Sets the departTime value for this RawAirSegment.
     * 
     * @param departTime
     */
    public void setDepartTime(java.util.Calendar departTime) {
        this.departTime = departTime;
    }


    /**
     * Gets the arriveTime value for this RawAirSegment.
     * 
     * @return arriveTime
     */
    public java.util.Calendar getArriveTime() {
        return arriveTime;
    }


    /**
     * Sets the arriveTime value for this RawAirSegment.
     * 
     * @param arriveTime
     */
    public void setArriveTime(java.util.Calendar arriveTime) {
        this.arriveTime = arriveTime;
    }


    /**
     * Gets the fltStatus value for this RawAirSegment.
     * 
     * @return fltStatus
     */
    public java.lang.String getFltStatus() {
        return fltStatus;
    }


    /**
     * Sets the fltStatus value for this RawAirSegment.
     * 
     * @param fltStatus
     */
    public void setFltStatus(java.lang.String fltStatus) {
        this.fltStatus = fltStatus;
    }


    /**
     * Gets the numberOfPassengers value for this RawAirSegment.
     * 
     * @return numberOfPassengers
     */
    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }


    /**
     * Sets the numberOfPassengers value for this RawAirSegment.
     * 
     * @param numberOfPassengers
     */
    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }


    /**
     * Gets the meal value for this RawAirSegment.
     * 
     * @return meal
     */
    public java.lang.String getMeal() {
        return meal;
    }


    /**
     * Sets the meal value for this RawAirSegment.
     * 
     * @param meal
     */
    public void setMeal(java.lang.String meal) {
        this.meal = meal;
    }


    /**
     * Gets the fareBasis value for this RawAirSegment.
     * 
     * @return fareBasis
     */
    public java.lang.String getFareBasis() {
        return fareBasis;
    }


    /**
     * Sets the fareBasis value for this RawAirSegment.
     * 
     * @param fareBasis
     */
    public void setFareBasis(java.lang.String fareBasis) {
        this.fareBasis = fareBasis;
    }


    /**
     * Gets the stops value for this RawAirSegment.
     * 
     * @return stops
     */
    public int getStops() {
        return stops;
    }


    /**
     * Sets the stops value for this RawAirSegment.
     * 
     * @param stops
     */
    public void setStops(int stops) {
        this.stops = stops;
    }


    /**
     * Gets the equipment value for this RawAirSegment.
     * 
     * @return equipment
     */
    public java.lang.String getEquipment() {
        return equipment;
    }


    /**
     * Sets the equipment value for this RawAirSegment.
     * 
     * @param equipment
     */
    public void setEquipment(java.lang.String equipment) {
        this.equipment = equipment;
    }


    /**
     * Gets the journeyTime value for this RawAirSegment.
     * 
     * @return journeyTime
     */
    public com.rightrez.TimeSpan getJourneyTime() {
        return journeyTime;
    }


    /**
     * Sets the journeyTime value for this RawAirSegment.
     * 
     * @param journeyTime
     */
    public void setJourneyTime(com.rightrez.TimeSpan journeyTime) {
        this.journeyTime = journeyTime;
    }


    /**
     * Gets the timeDiff value for this RawAirSegment.
     * 
     * @return timeDiff
     */
    public java.lang.String getTimeDiff() {
        return timeDiff;
    }


    /**
     * Sets the timeDiff value for this RawAirSegment.
     * 
     * @param timeDiff
     */
    public void setTimeDiff(java.lang.String timeDiff) {
        this.timeDiff = timeDiff;
    }


    /**
     * Gets the groupLocator value for this RawAirSegment.
     * 
     * @return groupLocator
     */
    public java.lang.String getGroupLocator() {
        return groupLocator;
    }


    /**
     * Sets the groupLocator value for this RawAirSegment.
     * 
     * @param groupLocator
     */
    public void setGroupLocator(java.lang.String groupLocator) {
        this.groupLocator = groupLocator;
    }


    /**
     * Gets the groupLinenum value for this RawAirSegment.
     * 
     * @return groupLinenum
     */
    public int getGroupLinenum() {
        return groupLinenum;
    }


    /**
     * Sets the groupLinenum value for this RawAirSegment.
     * 
     * @param groupLinenum
     */
    public void setGroupLinenum(int groupLinenum) {
        this.groupLinenum = groupLinenum;
    }


    /**
     * Gets the operatedBy value for this RawAirSegment.
     * 
     * @return operatedBy
     */
    public java.lang.String getOperatedBy() {
        return operatedBy;
    }


    /**
     * Sets the operatedBy value for this RawAirSegment.
     * 
     * @param operatedBy
     */
    public void setOperatedBy(java.lang.String operatedBy) {
        this.operatedBy = operatedBy;
    }


    /**
     * Gets the operatedByCode value for this RawAirSegment.
     * 
     * @return operatedByCode
     */
    public java.lang.String getOperatedByCode() {
        return operatedByCode;
    }


    /**
     * Sets the operatedByCode value for this RawAirSegment.
     * 
     * @param operatedByCode
     */
    public void setOperatedByCode(java.lang.String operatedByCode) {
        this.operatedByCode = operatedByCode;
    }


    /**
     * Gets the planeChange value for this RawAirSegment.
     * 
     * @return planeChange
     */
    public java.lang.String getPlaneChange() {
        return planeChange;
    }


    /**
     * Sets the planeChange value for this RawAirSegment.
     * 
     * @param planeChange
     */
    public void setPlaneChange(java.lang.String planeChange) {
        this.planeChange = planeChange;
    }


    /**
     * Gets the link value for this RawAirSegment.
     * 
     * @return link
     */
    public boolean isLink() {
        return link;
    }


    /**
     * Sets the link value for this RawAirSegment.
     * 
     * @param link
     */
    public void setLink(boolean link) {
        this.link = link;
    }


    /**
     * Gets the codeShare value for this RawAirSegment.
     * 
     * @return codeShare
     */
    public boolean isCodeShare() {
        return codeShare;
    }


    /**
     * Sets the codeShare value for this RawAirSegment.
     * 
     * @param codeShare
     */
    public void setCodeShare(boolean codeShare) {
        this.codeShare = codeShare;
    }


    /**
     * Gets the eticket value for this RawAirSegment.
     * 
     * @return eticket
     */
    public boolean isEticket() {
        return eticket;
    }


    /**
     * Sets the eticket value for this RawAirSegment.
     * 
     * @param eticket
     */
    public void setEticket(boolean eticket) {
        this.eticket = eticket;
    }


    /**
     * Gets the marriageNumber value for this RawAirSegment.
     * 
     * @return marriageNumber
     */
    public int getMarriageNumber() {
        return marriageNumber;
    }


    /**
     * Sets the marriageNumber value for this RawAirSegment.
     * 
     * @param marriageNumber
     */
    public void setMarriageNumber(int marriageNumber) {
        this.marriageNumber = marriageNumber;
    }


    /**
     * Gets the minConnectTime value for this RawAirSegment.
     * 
     * @return minConnectTime
     */
    public int getMinConnectTime() {
        return minConnectTime;
    }


    /**
     * Sets the minConnectTime value for this RawAirSegment.
     * 
     * @param minConnectTime
     */
    public void setMinConnectTime(int minConnectTime) {
        this.minConnectTime = minConnectTime;
    }


    /**
     * Gets the airComment value for this RawAirSegment.
     * 
     * @return airComment
     */
    public java.lang.String getAirComment() {
        return airComment;
    }


    /**
     * Sets the airComment value for this RawAirSegment.
     * 
     * @param airComment
     */
    public void setAirComment(java.lang.String airComment) {
        this.airComment = airComment;
    }


    /**
     * Gets the hideComment value for this RawAirSegment.
     * 
     * @return hideComment
     */
    public boolean isHideComment() {
        return hideComment;
    }


    /**
     * Sets the hideComment value for this RawAirSegment.
     * 
     * @param hideComment
     */
    public void setHideComment(boolean hideComment) {
        this.hideComment = hideComment;
    }


    /**
     * Gets the seatList value for this RawAirSegment.
     * 
     * @return seatList
     */
    public com.rightrez.RawSeat[] getSeatList() {
        return seatList;
    }


    /**
     * Sets the seatList value for this RawAirSegment.
     * 
     * @param seatList
     */
    public void setSeatList(com.rightrez.RawSeat[] seatList) {
        this.seatList = seatList;
    }


    /**
     * Gets the airMilesFlown value for this RawAirSegment.
     * 
     * @return airMilesFlown
     */
    public double getAirMilesFlown() {
        return airMilesFlown;
    }


    /**
     * Sets the airMilesFlown value for this RawAirSegment.
     * 
     * @param airMilesFlown
     */
    public void setAirMilesFlown(double airMilesFlown) {
        this.airMilesFlown = airMilesFlown;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RawAirSegment)) return false;
        RawAirSegment other = (RawAirSegment) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.stopCities==null && other.getStopCities()==null) || 
             (this.stopCities!=null &&
              java.util.Arrays.equals(this.stopCities, other.getStopCities()))) &&
            this.hasGroup == other.isHasGroup() &&
            ((this.ackn==null && other.getAckn()==null) || 
             (this.ackn!=null &&
              this.ackn.equals(other.getAckn()))) &&
            this.departed == other.isDeparted() &&
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            ((this.flightNumber==null && other.getFlightNumber()==null) || 
             (this.flightNumber!=null &&
              this.flightNumber.equals(other.getFlightNumber()))) &&
            ((this.COS==null && other.getCOS()==null) || 
             (this.COS!=null &&
              this.COS.equals(other.getCOS()))) &&
            ((this.departCity==null && other.getDepartCity()==null) || 
             (this.departCity!=null &&
              this.departCity.equals(other.getDepartCity()))) &&
            ((this.arriveCity==null && other.getArriveCity()==null) || 
             (this.arriveCity!=null &&
              this.arriveCity.equals(other.getArriveCity()))) &&
            ((this.departTime==null && other.getDepartTime()==null) || 
             (this.departTime!=null &&
              this.departTime.equals(other.getDepartTime()))) &&
            ((this.arriveTime==null && other.getArriveTime()==null) || 
             (this.arriveTime!=null &&
              this.arriveTime.equals(other.getArriveTime()))) &&
            ((this.fltStatus==null && other.getFltStatus()==null) || 
             (this.fltStatus!=null &&
              this.fltStatus.equals(other.getFltStatus()))) &&
            this.numberOfPassengers == other.getNumberOfPassengers() &&
            ((this.meal==null && other.getMeal()==null) || 
             (this.meal!=null &&
              this.meal.equals(other.getMeal()))) &&
            ((this.fareBasis==null && other.getFareBasis()==null) || 
             (this.fareBasis!=null &&
              this.fareBasis.equals(other.getFareBasis()))) &&
            this.stops == other.getStops() &&
            ((this.equipment==null && other.getEquipment()==null) || 
             (this.equipment!=null &&
              this.equipment.equals(other.getEquipment()))) &&
            ((this.journeyTime==null && other.getJourneyTime()==null) || 
             (this.journeyTime!=null &&
              this.journeyTime.equals(other.getJourneyTime()))) &&
            ((this.timeDiff==null && other.getTimeDiff()==null) || 
             (this.timeDiff!=null &&
              this.timeDiff.equals(other.getTimeDiff()))) &&
            ((this.groupLocator==null && other.getGroupLocator()==null) || 
             (this.groupLocator!=null &&
              this.groupLocator.equals(other.getGroupLocator()))) &&
            this.groupLinenum == other.getGroupLinenum() &&
            ((this.operatedBy==null && other.getOperatedBy()==null) || 
             (this.operatedBy!=null &&
              this.operatedBy.equals(other.getOperatedBy()))) &&
            ((this.operatedByCode==null && other.getOperatedByCode()==null) || 
             (this.operatedByCode!=null &&
              this.operatedByCode.equals(other.getOperatedByCode()))) &&
            ((this.planeChange==null && other.getPlaneChange()==null) || 
             (this.planeChange!=null &&
              this.planeChange.equals(other.getPlaneChange()))) &&
            this.link == other.isLink() &&
            this.codeShare == other.isCodeShare() &&
            this.eticket == other.isEticket() &&
            this.marriageNumber == other.getMarriageNumber() &&
            this.minConnectTime == other.getMinConnectTime() &&
            ((this.airComment==null && other.getAirComment()==null) || 
             (this.airComment!=null &&
              this.airComment.equals(other.getAirComment()))) &&
            this.hideComment == other.isHideComment() &&
            ((this.seatList==null && other.getSeatList()==null) || 
             (this.seatList!=null &&
              java.util.Arrays.equals(this.seatList, other.getSeatList()))) &&
            this.airMilesFlown == other.getAirMilesFlown();
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
        if (getStopCities() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStopCities());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStopCities(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isHasGroup() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAckn() != null) {
            _hashCode += getAckn().hashCode();
        }
        _hashCode += (isDeparted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        if (getFlightNumber() != null) {
            _hashCode += getFlightNumber().hashCode();
        }
        if (getCOS() != null) {
            _hashCode += getCOS().hashCode();
        }
        if (getDepartCity() != null) {
            _hashCode += getDepartCity().hashCode();
        }
        if (getArriveCity() != null) {
            _hashCode += getArriveCity().hashCode();
        }
        if (getDepartTime() != null) {
            _hashCode += getDepartTime().hashCode();
        }
        if (getArriveTime() != null) {
            _hashCode += getArriveTime().hashCode();
        }
        if (getFltStatus() != null) {
            _hashCode += getFltStatus().hashCode();
        }
        _hashCode += getNumberOfPassengers();
        if (getMeal() != null) {
            _hashCode += getMeal().hashCode();
        }
        if (getFareBasis() != null) {
            _hashCode += getFareBasis().hashCode();
        }
        _hashCode += getStops();
        if (getEquipment() != null) {
            _hashCode += getEquipment().hashCode();
        }
        if (getJourneyTime() != null) {
            _hashCode += getJourneyTime().hashCode();
        }
        if (getTimeDiff() != null) {
            _hashCode += getTimeDiff().hashCode();
        }
        if (getGroupLocator() != null) {
            _hashCode += getGroupLocator().hashCode();
        }
        _hashCode += getGroupLinenum();
        if (getOperatedBy() != null) {
            _hashCode += getOperatedBy().hashCode();
        }
        if (getOperatedByCode() != null) {
            _hashCode += getOperatedByCode().hashCode();
        }
        if (getPlaneChange() != null) {
            _hashCode += getPlaneChange().hashCode();
        }
        _hashCode += (isLink() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCodeShare() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEticket() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getMarriageNumber();
        _hashCode += getMinConnectTime();
        if (getAirComment() != null) {
            _hashCode += getAirComment().hashCode();
        }
        _hashCode += (isHideComment() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSeatList() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeatList());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeatList(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += new Double(getAirMilesFlown()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RawAirSegment.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawAirSegment"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stopCities");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "StopCities"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "StopCity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "StopCity"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasGroup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "HasGroup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ackn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Ackn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Departed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("departTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DepartTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arriveTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ArriveTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fltStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FltStatus"));
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
        elemField.setFieldName("meal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Meal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareBasis");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FareBasis"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("stops");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Stops"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equipment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Equipment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("journeyTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "JourneyTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "TimeSpan"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeDiff");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TimeDiff"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupLocator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "GroupLocator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupLinenum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "GroupLinenum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatedBy");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "OperatedBy"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("operatedByCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "OperatedByCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("planeChange");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PlaneChange"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("link");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Link"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codeShare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CodeShare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eticket");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Eticket"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marriageNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "MarriageNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minConnectTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "MinConnectTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AirComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hideComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "HideComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seatList");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "SeatList"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawSeat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "RawSeat"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airMilesFlown");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AirMilesFlown"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
