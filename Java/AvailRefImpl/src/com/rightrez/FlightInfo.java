/**
 * FlightInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class FlightInfo  implements java.io.Serializable {
    private boolean isGDSPriced;

    private float routeCost;

    private com.rightrez.MoneyAmount RRezPrice;

    private boolean violatesDepartTimePrefs;

    private boolean violatesArriveTimePrefs;

    private boolean violatesMinConnectTime;

    private boolean violatesMaxConnectTime;

    private int arrivalScore;

    private int departureScore;

    private boolean hasVisaRestriction;

    private int groupCount;

    private com.rightrez.FlightTypeEnum flightType;

    private com.rightrez.RRZAirSegment[] segments;

    private com.rightrez.PricingInfo pricingInfo;

    private java.math.BigDecimal internalFlat;

    private java.math.BigDecimal internalPct;

    private java.lang.String internalMarkupLevel;

    private com.rightrez.MoneyAmount internalMarkup;

    private com.rightrez.MoneyAmount externalMarkup;

    private com.rightrez.MoneyAmount addCollect;

    private java.lang.Object pricingLock;

    private boolean priceAttempted;

    private java.lang.String uniqueId;

    public FlightInfo() {
    }

    public FlightInfo(
           boolean isGDSPriced,
           float routeCost,
           com.rightrez.MoneyAmount RRezPrice,
           boolean violatesDepartTimePrefs,
           boolean violatesArriveTimePrefs,
           boolean violatesMinConnectTime,
           boolean violatesMaxConnectTime,
           int arrivalScore,
           int departureScore,
           boolean hasVisaRestriction,
           int groupCount,
           com.rightrez.FlightTypeEnum flightType,
           com.rightrez.RRZAirSegment[] segments,
           com.rightrez.PricingInfo pricingInfo,
           java.math.BigDecimal internalFlat,
           java.math.BigDecimal internalPct,
           java.lang.String internalMarkupLevel,
           com.rightrez.MoneyAmount internalMarkup,
           com.rightrez.MoneyAmount externalMarkup,
           com.rightrez.MoneyAmount addCollect,
           java.lang.Object pricingLock,
           boolean priceAttempted,
           java.lang.String uniqueId) {
           this.isGDSPriced = isGDSPriced;
           this.routeCost = routeCost;
           this.RRezPrice = RRezPrice;
           this.violatesDepartTimePrefs = violatesDepartTimePrefs;
           this.violatesArriveTimePrefs = violatesArriveTimePrefs;
           this.violatesMinConnectTime = violatesMinConnectTime;
           this.violatesMaxConnectTime = violatesMaxConnectTime;
           this.arrivalScore = arrivalScore;
           this.departureScore = departureScore;
           this.hasVisaRestriction = hasVisaRestriction;
           this.groupCount = groupCount;
           this.flightType = flightType;
           this.segments = segments;
           this.pricingInfo = pricingInfo;
           this.internalFlat = internalFlat;
           this.internalPct = internalPct;
           this.internalMarkupLevel = internalMarkupLevel;
           this.internalMarkup = internalMarkup;
           this.externalMarkup = externalMarkup;
           this.addCollect = addCollect;
           this.pricingLock = pricingLock;
           this.priceAttempted = priceAttempted;
           this.uniqueId = uniqueId;
    }


    /**
     * Gets the isGDSPriced value for this FlightInfo.
     * 
     * @return isGDSPriced
     */
    public boolean isIsGDSPriced() {
        return isGDSPriced;
    }


    /**
     * Sets the isGDSPriced value for this FlightInfo.
     * 
     * @param isGDSPriced
     */
    public void setIsGDSPriced(boolean isGDSPriced) {
        this.isGDSPriced = isGDSPriced;
    }


    /**
     * Gets the routeCost value for this FlightInfo.
     * 
     * @return routeCost
     */
    public float getRouteCost() {
        return routeCost;
    }


    /**
     * Sets the routeCost value for this FlightInfo.
     * 
     * @param routeCost
     */
    public void setRouteCost(float routeCost) {
        this.routeCost = routeCost;
    }


    /**
     * Gets the RRezPrice value for this FlightInfo.
     * 
     * @return RRezPrice
     */
    public com.rightrez.MoneyAmount getRRezPrice() {
        return RRezPrice;
    }


    /**
     * Sets the RRezPrice value for this FlightInfo.
     * 
     * @param RRezPrice
     */
    public void setRRezPrice(com.rightrez.MoneyAmount RRezPrice) {
        this.RRezPrice = RRezPrice;
    }


    /**
     * Gets the violatesDepartTimePrefs value for this FlightInfo.
     * 
     * @return violatesDepartTimePrefs
     */
    public boolean isViolatesDepartTimePrefs() {
        return violatesDepartTimePrefs;
    }


    /**
     * Sets the violatesDepartTimePrefs value for this FlightInfo.
     * 
     * @param violatesDepartTimePrefs
     */
    public void setViolatesDepartTimePrefs(boolean violatesDepartTimePrefs) {
        this.violatesDepartTimePrefs = violatesDepartTimePrefs;
    }


    /**
     * Gets the violatesArriveTimePrefs value for this FlightInfo.
     * 
     * @return violatesArriveTimePrefs
     */
    public boolean isViolatesArriveTimePrefs() {
        return violatesArriveTimePrefs;
    }


    /**
     * Sets the violatesArriveTimePrefs value for this FlightInfo.
     * 
     * @param violatesArriveTimePrefs
     */
    public void setViolatesArriveTimePrefs(boolean violatesArriveTimePrefs) {
        this.violatesArriveTimePrefs = violatesArriveTimePrefs;
    }


    /**
     * Gets the violatesMinConnectTime value for this FlightInfo.
     * 
     * @return violatesMinConnectTime
     */
    public boolean isViolatesMinConnectTime() {
        return violatesMinConnectTime;
    }


    /**
     * Sets the violatesMinConnectTime value for this FlightInfo.
     * 
     * @param violatesMinConnectTime
     */
    public void setViolatesMinConnectTime(boolean violatesMinConnectTime) {
        this.violatesMinConnectTime = violatesMinConnectTime;
    }


    /**
     * Gets the violatesMaxConnectTime value for this FlightInfo.
     * 
     * @return violatesMaxConnectTime
     */
    public boolean isViolatesMaxConnectTime() {
        return violatesMaxConnectTime;
    }


    /**
     * Sets the violatesMaxConnectTime value for this FlightInfo.
     * 
     * @param violatesMaxConnectTime
     */
    public void setViolatesMaxConnectTime(boolean violatesMaxConnectTime) {
        this.violatesMaxConnectTime = violatesMaxConnectTime;
    }


    /**
     * Gets the arrivalScore value for this FlightInfo.
     * 
     * @return arrivalScore
     */
    public int getArrivalScore() {
        return arrivalScore;
    }


    /**
     * Sets the arrivalScore value for this FlightInfo.
     * 
     * @param arrivalScore
     */
    public void setArrivalScore(int arrivalScore) {
        this.arrivalScore = arrivalScore;
    }


    /**
     * Gets the departureScore value for this FlightInfo.
     * 
     * @return departureScore
     */
    public int getDepartureScore() {
        return departureScore;
    }


    /**
     * Sets the departureScore value for this FlightInfo.
     * 
     * @param departureScore
     */
    public void setDepartureScore(int departureScore) {
        this.departureScore = departureScore;
    }


    /**
     * Gets the hasVisaRestriction value for this FlightInfo.
     * 
     * @return hasVisaRestriction
     */
    public boolean isHasVisaRestriction() {
        return hasVisaRestriction;
    }


    /**
     * Sets the hasVisaRestriction value for this FlightInfo.
     * 
     * @param hasVisaRestriction
     */
    public void setHasVisaRestriction(boolean hasVisaRestriction) {
        this.hasVisaRestriction = hasVisaRestriction;
    }


    /**
     * Gets the groupCount value for this FlightInfo.
     * 
     * @return groupCount
     */
    public int getGroupCount() {
        return groupCount;
    }


    /**
     * Sets the groupCount value for this FlightInfo.
     * 
     * @param groupCount
     */
    public void setGroupCount(int groupCount) {
        this.groupCount = groupCount;
    }


    /**
     * Gets the flightType value for this FlightInfo.
     * 
     * @return flightType
     */
    public com.rightrez.FlightTypeEnum getFlightType() {
        return flightType;
    }


    /**
     * Sets the flightType value for this FlightInfo.
     * 
     * @param flightType
     */
    public void setFlightType(com.rightrez.FlightTypeEnum flightType) {
        this.flightType = flightType;
    }


    /**
     * Gets the segments value for this FlightInfo.
     * 
     * @return segments
     */
    public com.rightrez.RRZAirSegment[] getSegments() {
        return segments;
    }


    /**
     * Sets the segments value for this FlightInfo.
     * 
     * @param segments
     */
    public void setSegments(com.rightrez.RRZAirSegment[] segments) {
        this.segments = segments;
    }


    /**
     * Gets the pricingInfo value for this FlightInfo.
     * 
     * @return pricingInfo
     */
    public com.rightrez.PricingInfo getPricingInfo() {
        return pricingInfo;
    }


    /**
     * Sets the pricingInfo value for this FlightInfo.
     * 
     * @param pricingInfo
     */
    public void setPricingInfo(com.rightrez.PricingInfo pricingInfo) {
        this.pricingInfo = pricingInfo;
    }


    /**
     * Gets the internalFlat value for this FlightInfo.
     * 
     * @return internalFlat
     */
    public java.math.BigDecimal getInternalFlat() {
        return internalFlat;
    }


    /**
     * Sets the internalFlat value for this FlightInfo.
     * 
     * @param internalFlat
     */
    public void setInternalFlat(java.math.BigDecimal internalFlat) {
        this.internalFlat = internalFlat;
    }


    /**
     * Gets the internalPct value for this FlightInfo.
     * 
     * @return internalPct
     */
    public java.math.BigDecimal getInternalPct() {
        return internalPct;
    }


    /**
     * Sets the internalPct value for this FlightInfo.
     * 
     * @param internalPct
     */
    public void setInternalPct(java.math.BigDecimal internalPct) {
        this.internalPct = internalPct;
    }


    /**
     * Gets the internalMarkupLevel value for this FlightInfo.
     * 
     * @return internalMarkupLevel
     */
    public java.lang.String getInternalMarkupLevel() {
        return internalMarkupLevel;
    }


    /**
     * Sets the internalMarkupLevel value for this FlightInfo.
     * 
     * @param internalMarkupLevel
     */
    public void setInternalMarkupLevel(java.lang.String internalMarkupLevel) {
        this.internalMarkupLevel = internalMarkupLevel;
    }


    /**
     * Gets the internalMarkup value for this FlightInfo.
     * 
     * @return internalMarkup
     */
    public com.rightrez.MoneyAmount getInternalMarkup() {
        return internalMarkup;
    }


    /**
     * Sets the internalMarkup value for this FlightInfo.
     * 
     * @param internalMarkup
     */
    public void setInternalMarkup(com.rightrez.MoneyAmount internalMarkup) {
        this.internalMarkup = internalMarkup;
    }


    /**
     * Gets the externalMarkup value for this FlightInfo.
     * 
     * @return externalMarkup
     */
    public com.rightrez.MoneyAmount getExternalMarkup() {
        return externalMarkup;
    }


    /**
     * Sets the externalMarkup value for this FlightInfo.
     * 
     * @param externalMarkup
     */
    public void setExternalMarkup(com.rightrez.MoneyAmount externalMarkup) {
        this.externalMarkup = externalMarkup;
    }


    /**
     * Gets the addCollect value for this FlightInfo.
     * 
     * @return addCollect
     */
    public com.rightrez.MoneyAmount getAddCollect() {
        return addCollect;
    }


    /**
     * Sets the addCollect value for this FlightInfo.
     * 
     * @param addCollect
     */
    public void setAddCollect(com.rightrez.MoneyAmount addCollect) {
        this.addCollect = addCollect;
    }


    /**
     * Gets the pricingLock value for this FlightInfo.
     * 
     * @return pricingLock
     */
    public java.lang.Object getPricingLock() {
        return pricingLock;
    }


    /**
     * Sets the pricingLock value for this FlightInfo.
     * 
     * @param pricingLock
     */
    public void setPricingLock(java.lang.Object pricingLock) {
        this.pricingLock = pricingLock;
    }


    /**
     * Gets the priceAttempted value for this FlightInfo.
     * 
     * @return priceAttempted
     */
    public boolean isPriceAttempted() {
        return priceAttempted;
    }


    /**
     * Sets the priceAttempted value for this FlightInfo.
     * 
     * @param priceAttempted
     */
    public void setPriceAttempted(boolean priceAttempted) {
        this.priceAttempted = priceAttempted;
    }


    /**
     * Gets the uniqueId value for this FlightInfo.
     * 
     * @return uniqueId
     */
    public java.lang.String getUniqueId() {
        return uniqueId;
    }


    /**
     * Sets the uniqueId value for this FlightInfo.
     * 
     * @param uniqueId
     */
    public void setUniqueId(java.lang.String uniqueId) {
        this.uniqueId = uniqueId;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FlightInfo)) return false;
        FlightInfo other = (FlightInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.isGDSPriced == other.isIsGDSPriced() &&
            this.routeCost == other.getRouteCost() &&
            ((this.RRezPrice==null && other.getRRezPrice()==null) || 
             (this.RRezPrice!=null &&
              this.RRezPrice.equals(other.getRRezPrice()))) &&
            this.violatesDepartTimePrefs == other.isViolatesDepartTimePrefs() &&
            this.violatesArriveTimePrefs == other.isViolatesArriveTimePrefs() &&
            this.violatesMinConnectTime == other.isViolatesMinConnectTime() &&
            this.violatesMaxConnectTime == other.isViolatesMaxConnectTime() &&
            this.arrivalScore == other.getArrivalScore() &&
            this.departureScore == other.getDepartureScore() &&
            this.hasVisaRestriction == other.isHasVisaRestriction() &&
            this.groupCount == other.getGroupCount() &&
            ((this.flightType==null && other.getFlightType()==null) || 
             (this.flightType!=null &&
              this.flightType.equals(other.getFlightType()))) &&
            ((this.segments==null && other.getSegments()==null) || 
             (this.segments!=null &&
              java.util.Arrays.equals(this.segments, other.getSegments()))) &&
            ((this.pricingInfo==null && other.getPricingInfo()==null) || 
             (this.pricingInfo!=null &&
              this.pricingInfo.equals(other.getPricingInfo()))) &&
            ((this.internalFlat==null && other.getInternalFlat()==null) || 
             (this.internalFlat!=null &&
              this.internalFlat.equals(other.getInternalFlat()))) &&
            ((this.internalPct==null && other.getInternalPct()==null) || 
             (this.internalPct!=null &&
              this.internalPct.equals(other.getInternalPct()))) &&
            ((this.internalMarkupLevel==null && other.getInternalMarkupLevel()==null) || 
             (this.internalMarkupLevel!=null &&
              this.internalMarkupLevel.equals(other.getInternalMarkupLevel()))) &&
            ((this.internalMarkup==null && other.getInternalMarkup()==null) || 
             (this.internalMarkup!=null &&
              this.internalMarkup.equals(other.getInternalMarkup()))) &&
            ((this.externalMarkup==null && other.getExternalMarkup()==null) || 
             (this.externalMarkup!=null &&
              this.externalMarkup.equals(other.getExternalMarkup()))) &&
            ((this.addCollect==null && other.getAddCollect()==null) || 
             (this.addCollect!=null &&
              this.addCollect.equals(other.getAddCollect()))) &&
            ((this.pricingLock==null && other.getPricingLock()==null) || 
             (this.pricingLock!=null &&
              this.pricingLock.equals(other.getPricingLock()))) &&
            this.priceAttempted == other.isPriceAttempted() &&
            ((this.uniqueId==null && other.getUniqueId()==null) || 
             (this.uniqueId!=null &&
              this.uniqueId.equals(other.getUniqueId())));
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
        _hashCode += (isIsGDSPriced() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Float(getRouteCost()).hashCode();
        if (getRRezPrice() != null) {
            _hashCode += getRRezPrice().hashCode();
        }
        _hashCode += (isViolatesDepartTimePrefs() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isViolatesArriveTimePrefs() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isViolatesMinConnectTime() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isViolatesMaxConnectTime() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getArrivalScore();
        _hashCode += getDepartureScore();
        _hashCode += (isHasVisaRestriction() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getGroupCount();
        if (getFlightType() != null) {
            _hashCode += getFlightType().hashCode();
        }
        if (getSegments() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSegments());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSegments(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPricingInfo() != null) {
            _hashCode += getPricingInfo().hashCode();
        }
        if (getInternalFlat() != null) {
            _hashCode += getInternalFlat().hashCode();
        }
        if (getInternalPct() != null) {
            _hashCode += getInternalPct().hashCode();
        }
        if (getInternalMarkupLevel() != null) {
            _hashCode += getInternalMarkupLevel().hashCode();
        }
        if (getInternalMarkup() != null) {
            _hashCode += getInternalMarkup().hashCode();
        }
        if (getExternalMarkup() != null) {
            _hashCode += getExternalMarkup().hashCode();
        }
        if (getAddCollect() != null) {
            _hashCode += getAddCollect().hashCode();
        }
        if (getPricingLock() != null) {
            _hashCode += getPricingLock().hashCode();
        }
        _hashCode += (isPriceAttempted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getUniqueId() != null) {
            _hashCode += getUniqueId().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(FlightInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isGDSPriced");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "IsGDSPriced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routeCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "RouteCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RRezPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "RRezPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("violatesDepartTimePrefs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ViolatesDepartTimePrefs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("violatesArriveTimePrefs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ViolatesArriveTimePrefs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("violatesMinConnectTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ViolatesMinConnectTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("violatesMaxConnectTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ViolatesMaxConnectTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arrivalScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ArrivalScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departureScore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DepartureScore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasVisaRestriction");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "HasVisaRestriction"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "GroupCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FlightType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightTypeEnum"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Segments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RRZAirSegment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "RRZAirSegment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PricingInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "PricingInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalFlat");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "InternalFlat"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalPct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "InternalPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalMarkupLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "InternalMarkupLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalMarkup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "InternalMarkup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalMarkup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ExternalMarkup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addCollect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AddCollect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingLock");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PricingLock"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceAttempted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PriceAttempted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("uniqueId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "UniqueId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
