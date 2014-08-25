/**
 * FaresItem.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class FaresItem  implements java.io.Serializable {
    private java.lang.String carrier;

    private java.lang.String fromCity;

    private java.lang.String toCity;

    private org.apache.axis.types.UnsignedShort serviceClass;

    private com.rightrez.ServiceLevel serviceLevel;

    private java.lang.String fareBasisCode;

    private java.math.BigDecimal fare;

    private java.math.BigDecimal longFuelFee;

    private java.math.BigDecimal shortFuelFee;

    private java.math.BigDecimal miscFee;

    private boolean isWeekday;

    private int priority;

    private org.apache.axis.types.UnsignedShort groupCOS;

    private int contractID;

    private java.lang.String availCommand;

    private boolean oneWay;

    private boolean bumpable;

    private boolean combinable;

    private java.lang.String addOnCarrier;

    private java.lang.Boolean addOnFirst;

    private org.apache.axis.types.UnsignedShort serviceClass2;

    private java.lang.Integer priority2;

    private java.lang.Integer addOnContractID;

    private java.lang.String routingAirport;

    private java.lang.Integer contractID2;

    private java.lang.Integer allianceID;

    private java.lang.String filedAs;

    private boolean priceInUSD;

    private boolean manualFares;

    private boolean airSea;

    private boolean marine;

    private java.lang.String alternateFBC;

    private int classID;

    private boolean thruFare;

    private java.lang.String tourCode;

    private java.lang.String ticketDesignator;

    private boolean useContractNumber;

    private java.lang.String contractNumber;

    private java.lang.String penaltyInfo;

    private java.math.BigDecimal nativeFareValue;

    private java.lang.String nativeFareCurrency;

    private java.math.BigDecimal nativeAddOnFareValue;

    private java.lang.String nativeAddOnCurrency;

    private boolean allowOneWayPricing;

    private java.math.BigDecimal nativeOneWayFare;

    private java.lang.String[] backupClasses;

    private java.lang.String[] shortHaulClasses;

    public FaresItem() {
    }

    public FaresItem(
           java.lang.String carrier,
           java.lang.String fromCity,
           java.lang.String toCity,
           org.apache.axis.types.UnsignedShort serviceClass,
           com.rightrez.ServiceLevel serviceLevel,
           java.lang.String fareBasisCode,
           java.math.BigDecimal fare,
           java.math.BigDecimal longFuelFee,
           java.math.BigDecimal shortFuelFee,
           java.math.BigDecimal miscFee,
           boolean isWeekday,
           int priority,
           org.apache.axis.types.UnsignedShort groupCOS,
           int contractID,
           java.lang.String availCommand,
           boolean oneWay,
           boolean bumpable,
           boolean combinable,
           java.lang.String addOnCarrier,
           java.lang.Boolean addOnFirst,
           org.apache.axis.types.UnsignedShort serviceClass2,
           java.lang.Integer priority2,
           java.lang.Integer addOnContractID,
           java.lang.String routingAirport,
           java.lang.Integer contractID2,
           java.lang.Integer allianceID,
           java.lang.String filedAs,
           boolean priceInUSD,
           boolean manualFares,
           boolean airSea,
           boolean marine,
           java.lang.String alternateFBC,
           int classID,
           boolean thruFare,
           java.lang.String tourCode,
           java.lang.String ticketDesignator,
           boolean useContractNumber,
           java.lang.String contractNumber,
           java.lang.String penaltyInfo,
           java.math.BigDecimal nativeFareValue,
           java.lang.String nativeFareCurrency,
           java.math.BigDecimal nativeAddOnFareValue,
           java.lang.String nativeAddOnCurrency,
           boolean allowOneWayPricing,
           java.math.BigDecimal nativeOneWayFare,
           java.lang.String[] backupClasses,
           java.lang.String[] shortHaulClasses) {
           this.carrier = carrier;
           this.fromCity = fromCity;
           this.toCity = toCity;
           this.serviceClass = serviceClass;
           this.serviceLevel = serviceLevel;
           this.fareBasisCode = fareBasisCode;
           this.fare = fare;
           this.longFuelFee = longFuelFee;
           this.shortFuelFee = shortFuelFee;
           this.miscFee = miscFee;
           this.isWeekday = isWeekday;
           this.priority = priority;
           this.groupCOS = groupCOS;
           this.contractID = contractID;
           this.availCommand = availCommand;
           this.oneWay = oneWay;
           this.bumpable = bumpable;
           this.combinable = combinable;
           this.addOnCarrier = addOnCarrier;
           this.addOnFirst = addOnFirst;
           this.serviceClass2 = serviceClass2;
           this.priority2 = priority2;
           this.addOnContractID = addOnContractID;
           this.routingAirport = routingAirport;
           this.contractID2 = contractID2;
           this.allianceID = allianceID;
           this.filedAs = filedAs;
           this.priceInUSD = priceInUSD;
           this.manualFares = manualFares;
           this.airSea = airSea;
           this.marine = marine;
           this.alternateFBC = alternateFBC;
           this.classID = classID;
           this.thruFare = thruFare;
           this.tourCode = tourCode;
           this.ticketDesignator = ticketDesignator;
           this.useContractNumber = useContractNumber;
           this.contractNumber = contractNumber;
           this.penaltyInfo = penaltyInfo;
           this.nativeFareValue = nativeFareValue;
           this.nativeFareCurrency = nativeFareCurrency;
           this.nativeAddOnFareValue = nativeAddOnFareValue;
           this.nativeAddOnCurrency = nativeAddOnCurrency;
           this.allowOneWayPricing = allowOneWayPricing;
           this.nativeOneWayFare = nativeOneWayFare;
           this.backupClasses = backupClasses;
           this.shortHaulClasses = shortHaulClasses;
    }


    /**
     * Gets the carrier value for this FaresItem.
     * 
     * @return carrier
     */
    public java.lang.String getCarrier() {
        return carrier;
    }


    /**
     * Sets the carrier value for this FaresItem.
     * 
     * @param carrier
     */
    public void setCarrier(java.lang.String carrier) {
        this.carrier = carrier;
    }


    /**
     * Gets the fromCity value for this FaresItem.
     * 
     * @return fromCity
     */
    public java.lang.String getFromCity() {
        return fromCity;
    }


    /**
     * Sets the fromCity value for this FaresItem.
     * 
     * @param fromCity
     */
    public void setFromCity(java.lang.String fromCity) {
        this.fromCity = fromCity;
    }


    /**
     * Gets the toCity value for this FaresItem.
     * 
     * @return toCity
     */
    public java.lang.String getToCity() {
        return toCity;
    }


    /**
     * Sets the toCity value for this FaresItem.
     * 
     * @param toCity
     */
    public void setToCity(java.lang.String toCity) {
        this.toCity = toCity;
    }


    /**
     * Gets the serviceClass value for this FaresItem.
     * 
     * @return serviceClass
     */
    public org.apache.axis.types.UnsignedShort getServiceClass() {
        return serviceClass;
    }


    /**
     * Sets the serviceClass value for this FaresItem.
     * 
     * @param serviceClass
     */
    public void setServiceClass(org.apache.axis.types.UnsignedShort serviceClass) {
        this.serviceClass = serviceClass;
    }


    /**
     * Gets the serviceLevel value for this FaresItem.
     * 
     * @return serviceLevel
     */
    public com.rightrez.ServiceLevel getServiceLevel() {
        return serviceLevel;
    }


    /**
     * Sets the serviceLevel value for this FaresItem.
     * 
     * @param serviceLevel
     */
    public void setServiceLevel(com.rightrez.ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }


    /**
     * Gets the fareBasisCode value for this FaresItem.
     * 
     * @return fareBasisCode
     */
    public java.lang.String getFareBasisCode() {
        return fareBasisCode;
    }


    /**
     * Sets the fareBasisCode value for this FaresItem.
     * 
     * @param fareBasisCode
     */
    public void setFareBasisCode(java.lang.String fareBasisCode) {
        this.fareBasisCode = fareBasisCode;
    }


    /**
     * Gets the fare value for this FaresItem.
     * 
     * @return fare
     */
    public java.math.BigDecimal getFare() {
        return fare;
    }


    /**
     * Sets the fare value for this FaresItem.
     * 
     * @param fare
     */
    public void setFare(java.math.BigDecimal fare) {
        this.fare = fare;
    }


    /**
     * Gets the longFuelFee value for this FaresItem.
     * 
     * @return longFuelFee
     */
    public java.math.BigDecimal getLongFuelFee() {
        return longFuelFee;
    }


    /**
     * Sets the longFuelFee value for this FaresItem.
     * 
     * @param longFuelFee
     */
    public void setLongFuelFee(java.math.BigDecimal longFuelFee) {
        this.longFuelFee = longFuelFee;
    }


    /**
     * Gets the shortFuelFee value for this FaresItem.
     * 
     * @return shortFuelFee
     */
    public java.math.BigDecimal getShortFuelFee() {
        return shortFuelFee;
    }


    /**
     * Sets the shortFuelFee value for this FaresItem.
     * 
     * @param shortFuelFee
     */
    public void setShortFuelFee(java.math.BigDecimal shortFuelFee) {
        this.shortFuelFee = shortFuelFee;
    }


    /**
     * Gets the miscFee value for this FaresItem.
     * 
     * @return miscFee
     */
    public java.math.BigDecimal getMiscFee() {
        return miscFee;
    }


    /**
     * Sets the miscFee value for this FaresItem.
     * 
     * @param miscFee
     */
    public void setMiscFee(java.math.BigDecimal miscFee) {
        this.miscFee = miscFee;
    }


    /**
     * Gets the isWeekday value for this FaresItem.
     * 
     * @return isWeekday
     */
    public boolean isIsWeekday() {
        return isWeekday;
    }


    /**
     * Sets the isWeekday value for this FaresItem.
     * 
     * @param isWeekday
     */
    public void setIsWeekday(boolean isWeekday) {
        this.isWeekday = isWeekday;
    }


    /**
     * Gets the priority value for this FaresItem.
     * 
     * @return priority
     */
    public int getPriority() {
        return priority;
    }


    /**
     * Sets the priority value for this FaresItem.
     * 
     * @param priority
     */
    public void setPriority(int priority) {
        this.priority = priority;
    }


    /**
     * Gets the groupCOS value for this FaresItem.
     * 
     * @return groupCOS
     */
    public org.apache.axis.types.UnsignedShort getGroupCOS() {
        return groupCOS;
    }


    /**
     * Sets the groupCOS value for this FaresItem.
     * 
     * @param groupCOS
     */
    public void setGroupCOS(org.apache.axis.types.UnsignedShort groupCOS) {
        this.groupCOS = groupCOS;
    }


    /**
     * Gets the contractID value for this FaresItem.
     * 
     * @return contractID
     */
    public int getContractID() {
        return contractID;
    }


    /**
     * Sets the contractID value for this FaresItem.
     * 
     * @param contractID
     */
    public void setContractID(int contractID) {
        this.contractID = contractID;
    }


    /**
     * Gets the availCommand value for this FaresItem.
     * 
     * @return availCommand
     */
    public java.lang.String getAvailCommand() {
        return availCommand;
    }


    /**
     * Sets the availCommand value for this FaresItem.
     * 
     * @param availCommand
     */
    public void setAvailCommand(java.lang.String availCommand) {
        this.availCommand = availCommand;
    }


    /**
     * Gets the oneWay value for this FaresItem.
     * 
     * @return oneWay
     */
    public boolean isOneWay() {
        return oneWay;
    }


    /**
     * Sets the oneWay value for this FaresItem.
     * 
     * @param oneWay
     */
    public void setOneWay(boolean oneWay) {
        this.oneWay = oneWay;
    }


    /**
     * Gets the bumpable value for this FaresItem.
     * 
     * @return bumpable
     */
    public boolean isBumpable() {
        return bumpable;
    }


    /**
     * Sets the bumpable value for this FaresItem.
     * 
     * @param bumpable
     */
    public void setBumpable(boolean bumpable) {
        this.bumpable = bumpable;
    }


    /**
     * Gets the combinable value for this FaresItem.
     * 
     * @return combinable
     */
    public boolean isCombinable() {
        return combinable;
    }


    /**
     * Sets the combinable value for this FaresItem.
     * 
     * @param combinable
     */
    public void setCombinable(boolean combinable) {
        this.combinable = combinable;
    }


    /**
     * Gets the addOnCarrier value for this FaresItem.
     * 
     * @return addOnCarrier
     */
    public java.lang.String getAddOnCarrier() {
        return addOnCarrier;
    }


    /**
     * Sets the addOnCarrier value for this FaresItem.
     * 
     * @param addOnCarrier
     */
    public void setAddOnCarrier(java.lang.String addOnCarrier) {
        this.addOnCarrier = addOnCarrier;
    }


    /**
     * Gets the addOnFirst value for this FaresItem.
     * 
     * @return addOnFirst
     */
    public java.lang.Boolean getAddOnFirst() {
        return addOnFirst;
    }


    /**
     * Sets the addOnFirst value for this FaresItem.
     * 
     * @param addOnFirst
     */
    public void setAddOnFirst(java.lang.Boolean addOnFirst) {
        this.addOnFirst = addOnFirst;
    }


    /**
     * Gets the serviceClass2 value for this FaresItem.
     * 
     * @return serviceClass2
     */
    public org.apache.axis.types.UnsignedShort getServiceClass2() {
        return serviceClass2;
    }


    /**
     * Sets the serviceClass2 value for this FaresItem.
     * 
     * @param serviceClass2
     */
    public void setServiceClass2(org.apache.axis.types.UnsignedShort serviceClass2) {
        this.serviceClass2 = serviceClass2;
    }


    /**
     * Gets the priority2 value for this FaresItem.
     * 
     * @return priority2
     */
    public java.lang.Integer getPriority2() {
        return priority2;
    }


    /**
     * Sets the priority2 value for this FaresItem.
     * 
     * @param priority2
     */
    public void setPriority2(java.lang.Integer priority2) {
        this.priority2 = priority2;
    }


    /**
     * Gets the addOnContractID value for this FaresItem.
     * 
     * @return addOnContractID
     */
    public java.lang.Integer getAddOnContractID() {
        return addOnContractID;
    }


    /**
     * Sets the addOnContractID value for this FaresItem.
     * 
     * @param addOnContractID
     */
    public void setAddOnContractID(java.lang.Integer addOnContractID) {
        this.addOnContractID = addOnContractID;
    }


    /**
     * Gets the routingAirport value for this FaresItem.
     * 
     * @return routingAirport
     */
    public java.lang.String getRoutingAirport() {
        return routingAirport;
    }


    /**
     * Sets the routingAirport value for this FaresItem.
     * 
     * @param routingAirport
     */
    public void setRoutingAirport(java.lang.String routingAirport) {
        this.routingAirport = routingAirport;
    }


    /**
     * Gets the contractID2 value for this FaresItem.
     * 
     * @return contractID2
     */
    public java.lang.Integer getContractID2() {
        return contractID2;
    }


    /**
     * Sets the contractID2 value for this FaresItem.
     * 
     * @param contractID2
     */
    public void setContractID2(java.lang.Integer contractID2) {
        this.contractID2 = contractID2;
    }


    /**
     * Gets the allianceID value for this FaresItem.
     * 
     * @return allianceID
     */
    public java.lang.Integer getAllianceID() {
        return allianceID;
    }


    /**
     * Sets the allianceID value for this FaresItem.
     * 
     * @param allianceID
     */
    public void setAllianceID(java.lang.Integer allianceID) {
        this.allianceID = allianceID;
    }


    /**
     * Gets the filedAs value for this FaresItem.
     * 
     * @return filedAs
     */
    public java.lang.String getFiledAs() {
        return filedAs;
    }


    /**
     * Sets the filedAs value for this FaresItem.
     * 
     * @param filedAs
     */
    public void setFiledAs(java.lang.String filedAs) {
        this.filedAs = filedAs;
    }


    /**
     * Gets the priceInUSD value for this FaresItem.
     * 
     * @return priceInUSD
     */
    public boolean isPriceInUSD() {
        return priceInUSD;
    }


    /**
     * Sets the priceInUSD value for this FaresItem.
     * 
     * @param priceInUSD
     */
    public void setPriceInUSD(boolean priceInUSD) {
        this.priceInUSD = priceInUSD;
    }


    /**
     * Gets the manualFares value for this FaresItem.
     * 
     * @return manualFares
     */
    public boolean isManualFares() {
        return manualFares;
    }


    /**
     * Sets the manualFares value for this FaresItem.
     * 
     * @param manualFares
     */
    public void setManualFares(boolean manualFares) {
        this.manualFares = manualFares;
    }


    /**
     * Gets the airSea value for this FaresItem.
     * 
     * @return airSea
     */
    public boolean isAirSea() {
        return airSea;
    }


    /**
     * Sets the airSea value for this FaresItem.
     * 
     * @param airSea
     */
    public void setAirSea(boolean airSea) {
        this.airSea = airSea;
    }


    /**
     * Gets the marine value for this FaresItem.
     * 
     * @return marine
     */
    public boolean isMarine() {
        return marine;
    }


    /**
     * Sets the marine value for this FaresItem.
     * 
     * @param marine
     */
    public void setMarine(boolean marine) {
        this.marine = marine;
    }


    /**
     * Gets the alternateFBC value for this FaresItem.
     * 
     * @return alternateFBC
     */
    public java.lang.String getAlternateFBC() {
        return alternateFBC;
    }


    /**
     * Sets the alternateFBC value for this FaresItem.
     * 
     * @param alternateFBC
     */
    public void setAlternateFBC(java.lang.String alternateFBC) {
        this.alternateFBC = alternateFBC;
    }


    /**
     * Gets the classID value for this FaresItem.
     * 
     * @return classID
     */
    public int getClassID() {
        return classID;
    }


    /**
     * Sets the classID value for this FaresItem.
     * 
     * @param classID
     */
    public void setClassID(int classID) {
        this.classID = classID;
    }


    /**
     * Gets the thruFare value for this FaresItem.
     * 
     * @return thruFare
     */
    public boolean isThruFare() {
        return thruFare;
    }


    /**
     * Sets the thruFare value for this FaresItem.
     * 
     * @param thruFare
     */
    public void setThruFare(boolean thruFare) {
        this.thruFare = thruFare;
    }


    /**
     * Gets the tourCode value for this FaresItem.
     * 
     * @return tourCode
     */
    public java.lang.String getTourCode() {
        return tourCode;
    }


    /**
     * Sets the tourCode value for this FaresItem.
     * 
     * @param tourCode
     */
    public void setTourCode(java.lang.String tourCode) {
        this.tourCode = tourCode;
    }


    /**
     * Gets the ticketDesignator value for this FaresItem.
     * 
     * @return ticketDesignator
     */
    public java.lang.String getTicketDesignator() {
        return ticketDesignator;
    }


    /**
     * Sets the ticketDesignator value for this FaresItem.
     * 
     * @param ticketDesignator
     */
    public void setTicketDesignator(java.lang.String ticketDesignator) {
        this.ticketDesignator = ticketDesignator;
    }


    /**
     * Gets the useContractNumber value for this FaresItem.
     * 
     * @return useContractNumber
     */
    public boolean isUseContractNumber() {
        return useContractNumber;
    }


    /**
     * Sets the useContractNumber value for this FaresItem.
     * 
     * @param useContractNumber
     */
    public void setUseContractNumber(boolean useContractNumber) {
        this.useContractNumber = useContractNumber;
    }


    /**
     * Gets the contractNumber value for this FaresItem.
     * 
     * @return contractNumber
     */
    public java.lang.String getContractNumber() {
        return contractNumber;
    }


    /**
     * Sets the contractNumber value for this FaresItem.
     * 
     * @param contractNumber
     */
    public void setContractNumber(java.lang.String contractNumber) {
        this.contractNumber = contractNumber;
    }


    /**
     * Gets the penaltyInfo value for this FaresItem.
     * 
     * @return penaltyInfo
     */
    public java.lang.String getPenaltyInfo() {
        return penaltyInfo;
    }


    /**
     * Sets the penaltyInfo value for this FaresItem.
     * 
     * @param penaltyInfo
     */
    public void setPenaltyInfo(java.lang.String penaltyInfo) {
        this.penaltyInfo = penaltyInfo;
    }


    /**
     * Gets the nativeFareValue value for this FaresItem.
     * 
     * @return nativeFareValue
     */
    public java.math.BigDecimal getNativeFareValue() {
        return nativeFareValue;
    }


    /**
     * Sets the nativeFareValue value for this FaresItem.
     * 
     * @param nativeFareValue
     */
    public void setNativeFareValue(java.math.BigDecimal nativeFareValue) {
        this.nativeFareValue = nativeFareValue;
    }


    /**
     * Gets the nativeFareCurrency value for this FaresItem.
     * 
     * @return nativeFareCurrency
     */
    public java.lang.String getNativeFareCurrency() {
        return nativeFareCurrency;
    }


    /**
     * Sets the nativeFareCurrency value for this FaresItem.
     * 
     * @param nativeFareCurrency
     */
    public void setNativeFareCurrency(java.lang.String nativeFareCurrency) {
        this.nativeFareCurrency = nativeFareCurrency;
    }


    /**
     * Gets the nativeAddOnFareValue value for this FaresItem.
     * 
     * @return nativeAddOnFareValue
     */
    public java.math.BigDecimal getNativeAddOnFareValue() {
        return nativeAddOnFareValue;
    }


    /**
     * Sets the nativeAddOnFareValue value for this FaresItem.
     * 
     * @param nativeAddOnFareValue
     */
    public void setNativeAddOnFareValue(java.math.BigDecimal nativeAddOnFareValue) {
        this.nativeAddOnFareValue = nativeAddOnFareValue;
    }


    /**
     * Gets the nativeAddOnCurrency value for this FaresItem.
     * 
     * @return nativeAddOnCurrency
     */
    public java.lang.String getNativeAddOnCurrency() {
        return nativeAddOnCurrency;
    }


    /**
     * Sets the nativeAddOnCurrency value for this FaresItem.
     * 
     * @param nativeAddOnCurrency
     */
    public void setNativeAddOnCurrency(java.lang.String nativeAddOnCurrency) {
        this.nativeAddOnCurrency = nativeAddOnCurrency;
    }


    /**
     * Gets the allowOneWayPricing value for this FaresItem.
     * 
     * @return allowOneWayPricing
     */
    public boolean isAllowOneWayPricing() {
        return allowOneWayPricing;
    }


    /**
     * Sets the allowOneWayPricing value for this FaresItem.
     * 
     * @param allowOneWayPricing
     */
    public void setAllowOneWayPricing(boolean allowOneWayPricing) {
        this.allowOneWayPricing = allowOneWayPricing;
    }


    /**
     * Gets the nativeOneWayFare value for this FaresItem.
     * 
     * @return nativeOneWayFare
     */
    public java.math.BigDecimal getNativeOneWayFare() {
        return nativeOneWayFare;
    }


    /**
     * Sets the nativeOneWayFare value for this FaresItem.
     * 
     * @param nativeOneWayFare
     */
    public void setNativeOneWayFare(java.math.BigDecimal nativeOneWayFare) {
        this.nativeOneWayFare = nativeOneWayFare;
    }


    /**
     * Gets the backupClasses value for this FaresItem.
     * 
     * @return backupClasses
     */
    public java.lang.String[] getBackupClasses() {
        return backupClasses;
    }


    /**
     * Sets the backupClasses value for this FaresItem.
     * 
     * @param backupClasses
     */
    public void setBackupClasses(java.lang.String[] backupClasses) {
        this.backupClasses = backupClasses;
    }


    /**
     * Gets the shortHaulClasses value for this FaresItem.
     * 
     * @return shortHaulClasses
     */
    public java.lang.String[] getShortHaulClasses() {
        return shortHaulClasses;
    }


    /**
     * Sets the shortHaulClasses value for this FaresItem.
     * 
     * @param shortHaulClasses
     */
    public void setShortHaulClasses(java.lang.String[] shortHaulClasses) {
        this.shortHaulClasses = shortHaulClasses;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof FaresItem)) return false;
        FaresItem other = (FaresItem) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.carrier==null && other.getCarrier()==null) || 
             (this.carrier!=null &&
              this.carrier.equals(other.getCarrier()))) &&
            ((this.fromCity==null && other.getFromCity()==null) || 
             (this.fromCity!=null &&
              this.fromCity.equals(other.getFromCity()))) &&
            ((this.toCity==null && other.getToCity()==null) || 
             (this.toCity!=null &&
              this.toCity.equals(other.getToCity()))) &&
            ((this.serviceClass==null && other.getServiceClass()==null) || 
             (this.serviceClass!=null &&
              this.serviceClass.equals(other.getServiceClass()))) &&
            ((this.serviceLevel==null && other.getServiceLevel()==null) || 
             (this.serviceLevel!=null &&
              this.serviceLevel.equals(other.getServiceLevel()))) &&
            ((this.fareBasisCode==null && other.getFareBasisCode()==null) || 
             (this.fareBasisCode!=null &&
              this.fareBasisCode.equals(other.getFareBasisCode()))) &&
            ((this.fare==null && other.getFare()==null) || 
             (this.fare!=null &&
              this.fare.equals(other.getFare()))) &&
            ((this.longFuelFee==null && other.getLongFuelFee()==null) || 
             (this.longFuelFee!=null &&
              this.longFuelFee.equals(other.getLongFuelFee()))) &&
            ((this.shortFuelFee==null && other.getShortFuelFee()==null) || 
             (this.shortFuelFee!=null &&
              this.shortFuelFee.equals(other.getShortFuelFee()))) &&
            ((this.miscFee==null && other.getMiscFee()==null) || 
             (this.miscFee!=null &&
              this.miscFee.equals(other.getMiscFee()))) &&
            this.isWeekday == other.isIsWeekday() &&
            this.priority == other.getPriority() &&
            ((this.groupCOS==null && other.getGroupCOS()==null) || 
             (this.groupCOS!=null &&
              this.groupCOS.equals(other.getGroupCOS()))) &&
            this.contractID == other.getContractID() &&
            ((this.availCommand==null && other.getAvailCommand()==null) || 
             (this.availCommand!=null &&
              this.availCommand.equals(other.getAvailCommand()))) &&
            this.oneWay == other.isOneWay() &&
            this.bumpable == other.isBumpable() &&
            this.combinable == other.isCombinable() &&
            ((this.addOnCarrier==null && other.getAddOnCarrier()==null) || 
             (this.addOnCarrier!=null &&
              this.addOnCarrier.equals(other.getAddOnCarrier()))) &&
            ((this.addOnFirst==null && other.getAddOnFirst()==null) || 
             (this.addOnFirst!=null &&
              this.addOnFirst.equals(other.getAddOnFirst()))) &&
            ((this.serviceClass2==null && other.getServiceClass2()==null) || 
             (this.serviceClass2!=null &&
              this.serviceClass2.equals(other.getServiceClass2()))) &&
            ((this.priority2==null && other.getPriority2()==null) || 
             (this.priority2!=null &&
              this.priority2.equals(other.getPriority2()))) &&
            ((this.addOnContractID==null && other.getAddOnContractID()==null) || 
             (this.addOnContractID!=null &&
              this.addOnContractID.equals(other.getAddOnContractID()))) &&
            ((this.routingAirport==null && other.getRoutingAirport()==null) || 
             (this.routingAirport!=null &&
              this.routingAirport.equals(other.getRoutingAirport()))) &&
            ((this.contractID2==null && other.getContractID2()==null) || 
             (this.contractID2!=null &&
              this.contractID2.equals(other.getContractID2()))) &&
            ((this.allianceID==null && other.getAllianceID()==null) || 
             (this.allianceID!=null &&
              this.allianceID.equals(other.getAllianceID()))) &&
            ((this.filedAs==null && other.getFiledAs()==null) || 
             (this.filedAs!=null &&
              this.filedAs.equals(other.getFiledAs()))) &&
            this.priceInUSD == other.isPriceInUSD() &&
            this.manualFares == other.isManualFares() &&
            this.airSea == other.isAirSea() &&
            this.marine == other.isMarine() &&
            ((this.alternateFBC==null && other.getAlternateFBC()==null) || 
             (this.alternateFBC!=null &&
              this.alternateFBC.equals(other.getAlternateFBC()))) &&
            this.classID == other.getClassID() &&
            this.thruFare == other.isThruFare() &&
            ((this.tourCode==null && other.getTourCode()==null) || 
             (this.tourCode!=null &&
              this.tourCode.equals(other.getTourCode()))) &&
            ((this.ticketDesignator==null && other.getTicketDesignator()==null) || 
             (this.ticketDesignator!=null &&
              this.ticketDesignator.equals(other.getTicketDesignator()))) &&
            this.useContractNumber == other.isUseContractNumber() &&
            ((this.contractNumber==null && other.getContractNumber()==null) || 
             (this.contractNumber!=null &&
              this.contractNumber.equals(other.getContractNumber()))) &&
            ((this.penaltyInfo==null && other.getPenaltyInfo()==null) || 
             (this.penaltyInfo!=null &&
              this.penaltyInfo.equals(other.getPenaltyInfo()))) &&
            ((this.nativeFareValue==null && other.getNativeFareValue()==null) || 
             (this.nativeFareValue!=null &&
              this.nativeFareValue.equals(other.getNativeFareValue()))) &&
            ((this.nativeFareCurrency==null && other.getNativeFareCurrency()==null) || 
             (this.nativeFareCurrency!=null &&
              this.nativeFareCurrency.equals(other.getNativeFareCurrency()))) &&
            ((this.nativeAddOnFareValue==null && other.getNativeAddOnFareValue()==null) || 
             (this.nativeAddOnFareValue!=null &&
              this.nativeAddOnFareValue.equals(other.getNativeAddOnFareValue()))) &&
            ((this.nativeAddOnCurrency==null && other.getNativeAddOnCurrency()==null) || 
             (this.nativeAddOnCurrency!=null &&
              this.nativeAddOnCurrency.equals(other.getNativeAddOnCurrency()))) &&
            this.allowOneWayPricing == other.isAllowOneWayPricing() &&
            ((this.nativeOneWayFare==null && other.getNativeOneWayFare()==null) || 
             (this.nativeOneWayFare!=null &&
              this.nativeOneWayFare.equals(other.getNativeOneWayFare()))) &&
            ((this.backupClasses==null && other.getBackupClasses()==null) || 
             (this.backupClasses!=null &&
              java.util.Arrays.equals(this.backupClasses, other.getBackupClasses()))) &&
            ((this.shortHaulClasses==null && other.getShortHaulClasses()==null) || 
             (this.shortHaulClasses!=null &&
              java.util.Arrays.equals(this.shortHaulClasses, other.getShortHaulClasses())));
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
        if (getCarrier() != null) {
            _hashCode += getCarrier().hashCode();
        }
        if (getFromCity() != null) {
            _hashCode += getFromCity().hashCode();
        }
        if (getToCity() != null) {
            _hashCode += getToCity().hashCode();
        }
        if (getServiceClass() != null) {
            _hashCode += getServiceClass().hashCode();
        }
        if (getServiceLevel() != null) {
            _hashCode += getServiceLevel().hashCode();
        }
        if (getFareBasisCode() != null) {
            _hashCode += getFareBasisCode().hashCode();
        }
        if (getFare() != null) {
            _hashCode += getFare().hashCode();
        }
        if (getLongFuelFee() != null) {
            _hashCode += getLongFuelFee().hashCode();
        }
        if (getShortFuelFee() != null) {
            _hashCode += getShortFuelFee().hashCode();
        }
        if (getMiscFee() != null) {
            _hashCode += getMiscFee().hashCode();
        }
        _hashCode += (isIsWeekday() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getPriority();
        if (getGroupCOS() != null) {
            _hashCode += getGroupCOS().hashCode();
        }
        _hashCode += getContractID();
        if (getAvailCommand() != null) {
            _hashCode += getAvailCommand().hashCode();
        }
        _hashCode += (isOneWay() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBumpable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCombinable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAddOnCarrier() != null) {
            _hashCode += getAddOnCarrier().hashCode();
        }
        if (getAddOnFirst() != null) {
            _hashCode += getAddOnFirst().hashCode();
        }
        if (getServiceClass2() != null) {
            _hashCode += getServiceClass2().hashCode();
        }
        if (getPriority2() != null) {
            _hashCode += getPriority2().hashCode();
        }
        if (getAddOnContractID() != null) {
            _hashCode += getAddOnContractID().hashCode();
        }
        if (getRoutingAirport() != null) {
            _hashCode += getRoutingAirport().hashCode();
        }
        if (getContractID2() != null) {
            _hashCode += getContractID2().hashCode();
        }
        if (getAllianceID() != null) {
            _hashCode += getAllianceID().hashCode();
        }
        if (getFiledAs() != null) {
            _hashCode += getFiledAs().hashCode();
        }
        _hashCode += (isPriceInUSD() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isManualFares() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAirSea() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isMarine() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAlternateFBC() != null) {
            _hashCode += getAlternateFBC().hashCode();
        }
        _hashCode += getClassID();
        _hashCode += (isThruFare() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getTourCode() != null) {
            _hashCode += getTourCode().hashCode();
        }
        if (getTicketDesignator() != null) {
            _hashCode += getTicketDesignator().hashCode();
        }
        _hashCode += (isUseContractNumber() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getContractNumber() != null) {
            _hashCode += getContractNumber().hashCode();
        }
        if (getPenaltyInfo() != null) {
            _hashCode += getPenaltyInfo().hashCode();
        }
        if (getNativeFareValue() != null) {
            _hashCode += getNativeFareValue().hashCode();
        }
        if (getNativeFareCurrency() != null) {
            _hashCode += getNativeFareCurrency().hashCode();
        }
        if (getNativeAddOnFareValue() != null) {
            _hashCode += getNativeAddOnFareValue().hashCode();
        }
        if (getNativeAddOnCurrency() != null) {
            _hashCode += getNativeAddOnCurrency().hashCode();
        }
        _hashCode += (isAllowOneWayPricing() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNativeOneWayFare() != null) {
            _hashCode += getNativeOneWayFare().hashCode();
        }
        if (getBackupClasses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBackupClasses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBackupClasses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getShortHaulClasses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getShortHaulClasses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getShortHaulClasses(), i);
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
        new org.apache.axis.description.TypeDesc(FaresItem.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FaresItem"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Carrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FromCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ToCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClass");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ServiceClass"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ServiceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "ServiceLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareBasisCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FareBasisCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Fare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("longFuelFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "LongFuelFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortFuelFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ShortFuelFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("miscFee");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "MiscFee"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isWeekday");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "IsWeekday"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Priority"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupCOS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "GroupCOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ContractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availCommand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AvailCommand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oneWay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "OneWay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bumpable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Bumpable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("combinable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Combinable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addOnCarrier");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AddOnCarrier"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addOnFirst");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AddOnFirst"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceClass2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ServiceClass2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priority2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Priority2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addOnContractID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AddOnContractID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("routingAirport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "RoutingAirport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractID2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ContractID2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allianceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AllianceID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("filedAs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FiledAs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("priceInUSD");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PriceInUSD"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manualFares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ManualFares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airSea");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AirSea"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("marine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Marine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alternateFBC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AlternateFBC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("classID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ClassID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thruFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ThruFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tourCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TourCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketDesignator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TicketDesignator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useContractNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "UseContractNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contractNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ContractNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("penaltyInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PenaltyInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nativeFareValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "NativeFareValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nativeFareCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "NativeFareCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nativeAddOnFareValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "NativeAddOnFareValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nativeAddOnCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "NativeAddOnCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowOneWayPricing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AllowOneWayPricing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nativeOneWayFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "NativeOneWayFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("backupClasses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BackupClasses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("shortHaulClasses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ShortHaulClasses"));
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
