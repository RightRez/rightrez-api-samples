/**
 * PricingInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class PricingInfo  implements java.io.Serializable {
    private boolean hasError;

    private java.lang.String errorMessage;

    private com.rightrez.MoneyAmount totalFare;

    private com.rightrez.MoneyAmount baseFare;

    private java.math.BigDecimal bankRateUsed;

    private com.rightrez.CurrencyInfo fareCalcCurrency;

    private java.math.BigDecimal fareCalcROE;

    private java.lang.String referenceNumber;

    private boolean isStoredFare;

    private boolean isManualStoredFare;

    private java.lang.String penaltyText;

    private java.util.Calendar ticketByDate;

    private com.rightrez.PricingType pricingType;

    private boolean publishedFare;

    private java.lang.String originCityCode;

    private com.rightrez.MoneyAmount taxYQ;

    private com.rightrez.MoneyAmount taxYR;

    private com.rightrez.TaxInfoForPricing[] taxes;

    private java.lang.String originDate;

    private com.rightrez.LinearFareDestinationInfo[] destinationInfo;

    private java.lang.String returnOriginCityCode;

    private java.lang.String returnOriginDate;

    private com.rightrez.LinearFareDestinationInfo[] returnDestinationInfo;

    private java.lang.String linearFareLine;

    private com.rightrez.AirportChargeItem[] XFs;

    private com.rightrez.AirportChargeItem[] ZPs;

    private java.lang.String XFandZPstring;

    private int numTickets;

    private com.rightrez.MoneyAmount equivAmount;

    private com.rightrez.MoneyAmount fareCalcFieldQ;

    private com.rightrez.MoneyAmount equivCurrencyFareCalcFieldQ;

    private int[] segmentNumbers;

    private com.rightrez.FareRule[] fareRules;

    private java.lang.String[] fareBasisCodes;

    public PricingInfo() {
    }

    public PricingInfo(
           boolean hasError,
           java.lang.String errorMessage,
           com.rightrez.MoneyAmount totalFare,
           com.rightrez.MoneyAmount baseFare,
           java.math.BigDecimal bankRateUsed,
           com.rightrez.CurrencyInfo fareCalcCurrency,
           java.math.BigDecimal fareCalcROE,
           java.lang.String referenceNumber,
           boolean isStoredFare,
           boolean isManualStoredFare,
           java.lang.String penaltyText,
           java.util.Calendar ticketByDate,
           com.rightrez.PricingType pricingType,
           boolean publishedFare,
           java.lang.String originCityCode,
           com.rightrez.MoneyAmount taxYQ,
           com.rightrez.MoneyAmount taxYR,
           com.rightrez.TaxInfoForPricing[] taxes,
           java.lang.String originDate,
           com.rightrez.LinearFareDestinationInfo[] destinationInfo,
           java.lang.String returnOriginCityCode,
           java.lang.String returnOriginDate,
           com.rightrez.LinearFareDestinationInfo[] returnDestinationInfo,
           java.lang.String linearFareLine,
           com.rightrez.AirportChargeItem[] XFs,
           com.rightrez.AirportChargeItem[] ZPs,
           java.lang.String XFandZPstring,
           int numTickets,
           com.rightrez.MoneyAmount equivAmount,
           com.rightrez.MoneyAmount fareCalcFieldQ,
           com.rightrez.MoneyAmount equivCurrencyFareCalcFieldQ,
           int[] segmentNumbers,
           com.rightrez.FareRule[] fareRules,
           java.lang.String[] fareBasisCodes) {
           this.hasError = hasError;
           this.errorMessage = errorMessage;
           this.totalFare = totalFare;
           this.baseFare = baseFare;
           this.bankRateUsed = bankRateUsed;
           this.fareCalcCurrency = fareCalcCurrency;
           this.fareCalcROE = fareCalcROE;
           this.referenceNumber = referenceNumber;
           this.isStoredFare = isStoredFare;
           this.isManualStoredFare = isManualStoredFare;
           this.penaltyText = penaltyText;
           this.ticketByDate = ticketByDate;
           this.pricingType = pricingType;
           this.publishedFare = publishedFare;
           this.originCityCode = originCityCode;
           this.taxYQ = taxYQ;
           this.taxYR = taxYR;
           this.taxes = taxes;
           this.originDate = originDate;
           this.destinationInfo = destinationInfo;
           this.returnOriginCityCode = returnOriginCityCode;
           this.returnOriginDate = returnOriginDate;
           this.returnDestinationInfo = returnDestinationInfo;
           this.linearFareLine = linearFareLine;
           this.XFs = XFs;
           this.ZPs = ZPs;
           this.XFandZPstring = XFandZPstring;
           this.numTickets = numTickets;
           this.equivAmount = equivAmount;
           this.fareCalcFieldQ = fareCalcFieldQ;
           this.equivCurrencyFareCalcFieldQ = equivCurrencyFareCalcFieldQ;
           this.segmentNumbers = segmentNumbers;
           this.fareRules = fareRules;
           this.fareBasisCodes = fareBasisCodes;
    }


    /**
     * Gets the hasError value for this PricingInfo.
     * 
     * @return hasError
     */
    public boolean isHasError() {
        return hasError;
    }


    /**
     * Sets the hasError value for this PricingInfo.
     * 
     * @param hasError
     */
    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }


    /**
     * Gets the errorMessage value for this PricingInfo.
     * 
     * @return errorMessage
     */
    public java.lang.String getErrorMessage() {
        return errorMessage;
    }


    /**
     * Sets the errorMessage value for this PricingInfo.
     * 
     * @param errorMessage
     */
    public void setErrorMessage(java.lang.String errorMessage) {
        this.errorMessage = errorMessage;
    }


    /**
     * Gets the totalFare value for this PricingInfo.
     * 
     * @return totalFare
     */
    public com.rightrez.MoneyAmount getTotalFare() {
        return totalFare;
    }


    /**
     * Sets the totalFare value for this PricingInfo.
     * 
     * @param totalFare
     */
    public void setTotalFare(com.rightrez.MoneyAmount totalFare) {
        this.totalFare = totalFare;
    }


    /**
     * Gets the baseFare value for this PricingInfo.
     * 
     * @return baseFare
     */
    public com.rightrez.MoneyAmount getBaseFare() {
        return baseFare;
    }


    /**
     * Sets the baseFare value for this PricingInfo.
     * 
     * @param baseFare
     */
    public void setBaseFare(com.rightrez.MoneyAmount baseFare) {
        this.baseFare = baseFare;
    }


    /**
     * Gets the bankRateUsed value for this PricingInfo.
     * 
     * @return bankRateUsed
     */
    public java.math.BigDecimal getBankRateUsed() {
        return bankRateUsed;
    }


    /**
     * Sets the bankRateUsed value for this PricingInfo.
     * 
     * @param bankRateUsed
     */
    public void setBankRateUsed(java.math.BigDecimal bankRateUsed) {
        this.bankRateUsed = bankRateUsed;
    }


    /**
     * Gets the fareCalcCurrency value for this PricingInfo.
     * 
     * @return fareCalcCurrency
     */
    public com.rightrez.CurrencyInfo getFareCalcCurrency() {
        return fareCalcCurrency;
    }


    /**
     * Sets the fareCalcCurrency value for this PricingInfo.
     * 
     * @param fareCalcCurrency
     */
    public void setFareCalcCurrency(com.rightrez.CurrencyInfo fareCalcCurrency) {
        this.fareCalcCurrency = fareCalcCurrency;
    }


    /**
     * Gets the fareCalcROE value for this PricingInfo.
     * 
     * @return fareCalcROE
     */
    public java.math.BigDecimal getFareCalcROE() {
        return fareCalcROE;
    }


    /**
     * Sets the fareCalcROE value for this PricingInfo.
     * 
     * @param fareCalcROE
     */
    public void setFareCalcROE(java.math.BigDecimal fareCalcROE) {
        this.fareCalcROE = fareCalcROE;
    }


    /**
     * Gets the referenceNumber value for this PricingInfo.
     * 
     * @return referenceNumber
     */
    public java.lang.String getReferenceNumber() {
        return referenceNumber;
    }


    /**
     * Sets the referenceNumber value for this PricingInfo.
     * 
     * @param referenceNumber
     */
    public void setReferenceNumber(java.lang.String referenceNumber) {
        this.referenceNumber = referenceNumber;
    }


    /**
     * Gets the isStoredFare value for this PricingInfo.
     * 
     * @return isStoredFare
     */
    public boolean isIsStoredFare() {
        return isStoredFare;
    }


    /**
     * Sets the isStoredFare value for this PricingInfo.
     * 
     * @param isStoredFare
     */
    public void setIsStoredFare(boolean isStoredFare) {
        this.isStoredFare = isStoredFare;
    }


    /**
     * Gets the isManualStoredFare value for this PricingInfo.
     * 
     * @return isManualStoredFare
     */
    public boolean isIsManualStoredFare() {
        return isManualStoredFare;
    }


    /**
     * Sets the isManualStoredFare value for this PricingInfo.
     * 
     * @param isManualStoredFare
     */
    public void setIsManualStoredFare(boolean isManualStoredFare) {
        this.isManualStoredFare = isManualStoredFare;
    }


    /**
     * Gets the penaltyText value for this PricingInfo.
     * 
     * @return penaltyText
     */
    public java.lang.String getPenaltyText() {
        return penaltyText;
    }


    /**
     * Sets the penaltyText value for this PricingInfo.
     * 
     * @param penaltyText
     */
    public void setPenaltyText(java.lang.String penaltyText) {
        this.penaltyText = penaltyText;
    }


    /**
     * Gets the ticketByDate value for this PricingInfo.
     * 
     * @return ticketByDate
     */
    public java.util.Calendar getTicketByDate() {
        return ticketByDate;
    }


    /**
     * Sets the ticketByDate value for this PricingInfo.
     * 
     * @param ticketByDate
     */
    public void setTicketByDate(java.util.Calendar ticketByDate) {
        this.ticketByDate = ticketByDate;
    }


    /**
     * Gets the pricingType value for this PricingInfo.
     * 
     * @return pricingType
     */
    public com.rightrez.PricingType getPricingType() {
        return pricingType;
    }


    /**
     * Sets the pricingType value for this PricingInfo.
     * 
     * @param pricingType
     */
    public void setPricingType(com.rightrez.PricingType pricingType) {
        this.pricingType = pricingType;
    }


    /**
     * Gets the publishedFare value for this PricingInfo.
     * 
     * @return publishedFare
     */
    public boolean isPublishedFare() {
        return publishedFare;
    }


    /**
     * Sets the publishedFare value for this PricingInfo.
     * 
     * @param publishedFare
     */
    public void setPublishedFare(boolean publishedFare) {
        this.publishedFare = publishedFare;
    }


    /**
     * Gets the originCityCode value for this PricingInfo.
     * 
     * @return originCityCode
     */
    public java.lang.String getOriginCityCode() {
        return originCityCode;
    }


    /**
     * Sets the originCityCode value for this PricingInfo.
     * 
     * @param originCityCode
     */
    public void setOriginCityCode(java.lang.String originCityCode) {
        this.originCityCode = originCityCode;
    }


    /**
     * Gets the taxYQ value for this PricingInfo.
     * 
     * @return taxYQ
     */
    public com.rightrez.MoneyAmount getTaxYQ() {
        return taxYQ;
    }


    /**
     * Sets the taxYQ value for this PricingInfo.
     * 
     * @param taxYQ
     */
    public void setTaxYQ(com.rightrez.MoneyAmount taxYQ) {
        this.taxYQ = taxYQ;
    }


    /**
     * Gets the taxYR value for this PricingInfo.
     * 
     * @return taxYR
     */
    public com.rightrez.MoneyAmount getTaxYR() {
        return taxYR;
    }


    /**
     * Sets the taxYR value for this PricingInfo.
     * 
     * @param taxYR
     */
    public void setTaxYR(com.rightrez.MoneyAmount taxYR) {
        this.taxYR = taxYR;
    }


    /**
     * Gets the taxes value for this PricingInfo.
     * 
     * @return taxes
     */
    public com.rightrez.TaxInfoForPricing[] getTaxes() {
        return taxes;
    }


    /**
     * Sets the taxes value for this PricingInfo.
     * 
     * @param taxes
     */
    public void setTaxes(com.rightrez.TaxInfoForPricing[] taxes) {
        this.taxes = taxes;
    }


    /**
     * Gets the originDate value for this PricingInfo.
     * 
     * @return originDate
     */
    public java.lang.String getOriginDate() {
        return originDate;
    }


    /**
     * Sets the originDate value for this PricingInfo.
     * 
     * @param originDate
     */
    public void setOriginDate(java.lang.String originDate) {
        this.originDate = originDate;
    }


    /**
     * Gets the destinationInfo value for this PricingInfo.
     * 
     * @return destinationInfo
     */
    public com.rightrez.LinearFareDestinationInfo[] getDestinationInfo() {
        return destinationInfo;
    }


    /**
     * Sets the destinationInfo value for this PricingInfo.
     * 
     * @param destinationInfo
     */
    public void setDestinationInfo(com.rightrez.LinearFareDestinationInfo[] destinationInfo) {
        this.destinationInfo = destinationInfo;
    }


    /**
     * Gets the returnOriginCityCode value for this PricingInfo.
     * 
     * @return returnOriginCityCode
     */
    public java.lang.String getReturnOriginCityCode() {
        return returnOriginCityCode;
    }


    /**
     * Sets the returnOriginCityCode value for this PricingInfo.
     * 
     * @param returnOriginCityCode
     */
    public void setReturnOriginCityCode(java.lang.String returnOriginCityCode) {
        this.returnOriginCityCode = returnOriginCityCode;
    }


    /**
     * Gets the returnOriginDate value for this PricingInfo.
     * 
     * @return returnOriginDate
     */
    public java.lang.String getReturnOriginDate() {
        return returnOriginDate;
    }


    /**
     * Sets the returnOriginDate value for this PricingInfo.
     * 
     * @param returnOriginDate
     */
    public void setReturnOriginDate(java.lang.String returnOriginDate) {
        this.returnOriginDate = returnOriginDate;
    }


    /**
     * Gets the returnDestinationInfo value for this PricingInfo.
     * 
     * @return returnDestinationInfo
     */
    public com.rightrez.LinearFareDestinationInfo[] getReturnDestinationInfo() {
        return returnDestinationInfo;
    }


    /**
     * Sets the returnDestinationInfo value for this PricingInfo.
     * 
     * @param returnDestinationInfo
     */
    public void setReturnDestinationInfo(com.rightrez.LinearFareDestinationInfo[] returnDestinationInfo) {
        this.returnDestinationInfo = returnDestinationInfo;
    }


    /**
     * Gets the linearFareLine value for this PricingInfo.
     * 
     * @return linearFareLine
     */
    public java.lang.String getLinearFareLine() {
        return linearFareLine;
    }


    /**
     * Sets the linearFareLine value for this PricingInfo.
     * 
     * @param linearFareLine
     */
    public void setLinearFareLine(java.lang.String linearFareLine) {
        this.linearFareLine = linearFareLine;
    }


    /**
     * Gets the XFs value for this PricingInfo.
     * 
     * @return XFs
     */
    public com.rightrez.AirportChargeItem[] getXFs() {
        return XFs;
    }


    /**
     * Sets the XFs value for this PricingInfo.
     * 
     * @param XFs
     */
    public void setXFs(com.rightrez.AirportChargeItem[] XFs) {
        this.XFs = XFs;
    }


    /**
     * Gets the ZPs value for this PricingInfo.
     * 
     * @return ZPs
     */
    public com.rightrez.AirportChargeItem[] getZPs() {
        return ZPs;
    }


    /**
     * Sets the ZPs value for this PricingInfo.
     * 
     * @param ZPs
     */
    public void setZPs(com.rightrez.AirportChargeItem[] ZPs) {
        this.ZPs = ZPs;
    }


    /**
     * Gets the XFandZPstring value for this PricingInfo.
     * 
     * @return XFandZPstring
     */
    public java.lang.String getXFandZPstring() {
        return XFandZPstring;
    }


    /**
     * Sets the XFandZPstring value for this PricingInfo.
     * 
     * @param XFandZPstring
     */
    public void setXFandZPstring(java.lang.String XFandZPstring) {
        this.XFandZPstring = XFandZPstring;
    }


    /**
     * Gets the numTickets value for this PricingInfo.
     * 
     * @return numTickets
     */
    public int getNumTickets() {
        return numTickets;
    }


    /**
     * Sets the numTickets value for this PricingInfo.
     * 
     * @param numTickets
     */
    public void setNumTickets(int numTickets) {
        this.numTickets = numTickets;
    }


    /**
     * Gets the equivAmount value for this PricingInfo.
     * 
     * @return equivAmount
     */
    public com.rightrez.MoneyAmount getEquivAmount() {
        return equivAmount;
    }


    /**
     * Sets the equivAmount value for this PricingInfo.
     * 
     * @param equivAmount
     */
    public void setEquivAmount(com.rightrez.MoneyAmount equivAmount) {
        this.equivAmount = equivAmount;
    }


    /**
     * Gets the fareCalcFieldQ value for this PricingInfo.
     * 
     * @return fareCalcFieldQ
     */
    public com.rightrez.MoneyAmount getFareCalcFieldQ() {
        return fareCalcFieldQ;
    }


    /**
     * Sets the fareCalcFieldQ value for this PricingInfo.
     * 
     * @param fareCalcFieldQ
     */
    public void setFareCalcFieldQ(com.rightrez.MoneyAmount fareCalcFieldQ) {
        this.fareCalcFieldQ = fareCalcFieldQ;
    }


    /**
     * Gets the equivCurrencyFareCalcFieldQ value for this PricingInfo.
     * 
     * @return equivCurrencyFareCalcFieldQ
     */
    public com.rightrez.MoneyAmount getEquivCurrencyFareCalcFieldQ() {
        return equivCurrencyFareCalcFieldQ;
    }


    /**
     * Sets the equivCurrencyFareCalcFieldQ value for this PricingInfo.
     * 
     * @param equivCurrencyFareCalcFieldQ
     */
    public void setEquivCurrencyFareCalcFieldQ(com.rightrez.MoneyAmount equivCurrencyFareCalcFieldQ) {
        this.equivCurrencyFareCalcFieldQ = equivCurrencyFareCalcFieldQ;
    }


    /**
     * Gets the segmentNumbers value for this PricingInfo.
     * 
     * @return segmentNumbers
     */
    public int[] getSegmentNumbers() {
        return segmentNumbers;
    }


    /**
     * Sets the segmentNumbers value for this PricingInfo.
     * 
     * @param segmentNumbers
     */
    public void setSegmentNumbers(int[] segmentNumbers) {
        this.segmentNumbers = segmentNumbers;
    }


    /**
     * Gets the fareRules value for this PricingInfo.
     * 
     * @return fareRules
     */
    public com.rightrez.FareRule[] getFareRules() {
        return fareRules;
    }


    /**
     * Sets the fareRules value for this PricingInfo.
     * 
     * @param fareRules
     */
    public void setFareRules(com.rightrez.FareRule[] fareRules) {
        this.fareRules = fareRules;
    }


    /**
     * Gets the fareBasisCodes value for this PricingInfo.
     * 
     * @return fareBasisCodes
     */
    public java.lang.String[] getFareBasisCodes() {
        return fareBasisCodes;
    }


    /**
     * Sets the fareBasisCodes value for this PricingInfo.
     * 
     * @param fareBasisCodes
     */
    public void setFareBasisCodes(java.lang.String[] fareBasisCodes) {
        this.fareBasisCodes = fareBasisCodes;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof PricingInfo)) return false;
        PricingInfo other = (PricingInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.hasError == other.isHasError() &&
            ((this.errorMessage==null && other.getErrorMessage()==null) || 
             (this.errorMessage!=null &&
              this.errorMessage.equals(other.getErrorMessage()))) &&
            ((this.totalFare==null && other.getTotalFare()==null) || 
             (this.totalFare!=null &&
              this.totalFare.equals(other.getTotalFare()))) &&
            ((this.baseFare==null && other.getBaseFare()==null) || 
             (this.baseFare!=null &&
              this.baseFare.equals(other.getBaseFare()))) &&
            ((this.bankRateUsed==null && other.getBankRateUsed()==null) || 
             (this.bankRateUsed!=null &&
              this.bankRateUsed.equals(other.getBankRateUsed()))) &&
            ((this.fareCalcCurrency==null && other.getFareCalcCurrency()==null) || 
             (this.fareCalcCurrency!=null &&
              this.fareCalcCurrency.equals(other.getFareCalcCurrency()))) &&
            ((this.fareCalcROE==null && other.getFareCalcROE()==null) || 
             (this.fareCalcROE!=null &&
              this.fareCalcROE.equals(other.getFareCalcROE()))) &&
            ((this.referenceNumber==null && other.getReferenceNumber()==null) || 
             (this.referenceNumber!=null &&
              this.referenceNumber.equals(other.getReferenceNumber()))) &&
            this.isStoredFare == other.isIsStoredFare() &&
            this.isManualStoredFare == other.isIsManualStoredFare() &&
            ((this.penaltyText==null && other.getPenaltyText()==null) || 
             (this.penaltyText!=null &&
              this.penaltyText.equals(other.getPenaltyText()))) &&
            ((this.ticketByDate==null && other.getTicketByDate()==null) || 
             (this.ticketByDate!=null &&
              this.ticketByDate.equals(other.getTicketByDate()))) &&
            ((this.pricingType==null && other.getPricingType()==null) || 
             (this.pricingType!=null &&
              this.pricingType.equals(other.getPricingType()))) &&
            this.publishedFare == other.isPublishedFare() &&
            ((this.originCityCode==null && other.getOriginCityCode()==null) || 
             (this.originCityCode!=null &&
              this.originCityCode.equals(other.getOriginCityCode()))) &&
            ((this.taxYQ==null && other.getTaxYQ()==null) || 
             (this.taxYQ!=null &&
              this.taxYQ.equals(other.getTaxYQ()))) &&
            ((this.taxYR==null && other.getTaxYR()==null) || 
             (this.taxYR!=null &&
              this.taxYR.equals(other.getTaxYR()))) &&
            ((this.taxes==null && other.getTaxes()==null) || 
             (this.taxes!=null &&
              java.util.Arrays.equals(this.taxes, other.getTaxes()))) &&
            ((this.originDate==null && other.getOriginDate()==null) || 
             (this.originDate!=null &&
              this.originDate.equals(other.getOriginDate()))) &&
            ((this.destinationInfo==null && other.getDestinationInfo()==null) || 
             (this.destinationInfo!=null &&
              java.util.Arrays.equals(this.destinationInfo, other.getDestinationInfo()))) &&
            ((this.returnOriginCityCode==null && other.getReturnOriginCityCode()==null) || 
             (this.returnOriginCityCode!=null &&
              this.returnOriginCityCode.equals(other.getReturnOriginCityCode()))) &&
            ((this.returnOriginDate==null && other.getReturnOriginDate()==null) || 
             (this.returnOriginDate!=null &&
              this.returnOriginDate.equals(other.getReturnOriginDate()))) &&
            ((this.returnDestinationInfo==null && other.getReturnDestinationInfo()==null) || 
             (this.returnDestinationInfo!=null &&
              java.util.Arrays.equals(this.returnDestinationInfo, other.getReturnDestinationInfo()))) &&
            ((this.linearFareLine==null && other.getLinearFareLine()==null) || 
             (this.linearFareLine!=null &&
              this.linearFareLine.equals(other.getLinearFareLine()))) &&
            ((this.XFs==null && other.getXFs()==null) || 
             (this.XFs!=null &&
              java.util.Arrays.equals(this.XFs, other.getXFs()))) &&
            ((this.ZPs==null && other.getZPs()==null) || 
             (this.ZPs!=null &&
              java.util.Arrays.equals(this.ZPs, other.getZPs()))) &&
            ((this.XFandZPstring==null && other.getXFandZPstring()==null) || 
             (this.XFandZPstring!=null &&
              this.XFandZPstring.equals(other.getXFandZPstring()))) &&
            this.numTickets == other.getNumTickets() &&
            ((this.equivAmount==null && other.getEquivAmount()==null) || 
             (this.equivAmount!=null &&
              this.equivAmount.equals(other.getEquivAmount()))) &&
            ((this.fareCalcFieldQ==null && other.getFareCalcFieldQ()==null) || 
             (this.fareCalcFieldQ!=null &&
              this.fareCalcFieldQ.equals(other.getFareCalcFieldQ()))) &&
            ((this.equivCurrencyFareCalcFieldQ==null && other.getEquivCurrencyFareCalcFieldQ()==null) || 
             (this.equivCurrencyFareCalcFieldQ!=null &&
              this.equivCurrencyFareCalcFieldQ.equals(other.getEquivCurrencyFareCalcFieldQ()))) &&
            ((this.segmentNumbers==null && other.getSegmentNumbers()==null) || 
             (this.segmentNumbers!=null &&
              java.util.Arrays.equals(this.segmentNumbers, other.getSegmentNumbers()))) &&
            ((this.fareRules==null && other.getFareRules()==null) || 
             (this.fareRules!=null &&
              java.util.Arrays.equals(this.fareRules, other.getFareRules()))) &&
            ((this.fareBasisCodes==null && other.getFareBasisCodes()==null) || 
             (this.fareBasisCodes!=null &&
              java.util.Arrays.equals(this.fareBasisCodes, other.getFareBasisCodes())));
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
        _hashCode += (isHasError() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getErrorMessage() != null) {
            _hashCode += getErrorMessage().hashCode();
        }
        if (getTotalFare() != null) {
            _hashCode += getTotalFare().hashCode();
        }
        if (getBaseFare() != null) {
            _hashCode += getBaseFare().hashCode();
        }
        if (getBankRateUsed() != null) {
            _hashCode += getBankRateUsed().hashCode();
        }
        if (getFareCalcCurrency() != null) {
            _hashCode += getFareCalcCurrency().hashCode();
        }
        if (getFareCalcROE() != null) {
            _hashCode += getFareCalcROE().hashCode();
        }
        if (getReferenceNumber() != null) {
            _hashCode += getReferenceNumber().hashCode();
        }
        _hashCode += (isIsStoredFare() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIsManualStoredFare() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPenaltyText() != null) {
            _hashCode += getPenaltyText().hashCode();
        }
        if (getTicketByDate() != null) {
            _hashCode += getTicketByDate().hashCode();
        }
        if (getPricingType() != null) {
            _hashCode += getPricingType().hashCode();
        }
        _hashCode += (isPublishedFare() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getOriginCityCode() != null) {
            _hashCode += getOriginCityCode().hashCode();
        }
        if (getTaxYQ() != null) {
            _hashCode += getTaxYQ().hashCode();
        }
        if (getTaxYR() != null) {
            _hashCode += getTaxYR().hashCode();
        }
        if (getTaxes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTaxes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTaxes(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOriginDate() != null) {
            _hashCode += getOriginDate().hashCode();
        }
        if (getDestinationInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDestinationInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDestinationInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getReturnOriginCityCode() != null) {
            _hashCode += getReturnOriginCityCode().hashCode();
        }
        if (getReturnOriginDate() != null) {
            _hashCode += getReturnOriginDate().hashCode();
        }
        if (getReturnDestinationInfo() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getReturnDestinationInfo());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getReturnDestinationInfo(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLinearFareLine() != null) {
            _hashCode += getLinearFareLine().hashCode();
        }
        if (getXFs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getXFs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getXFs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getZPs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getZPs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getZPs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getXFandZPstring() != null) {
            _hashCode += getXFandZPstring().hashCode();
        }
        _hashCode += getNumTickets();
        if (getEquivAmount() != null) {
            _hashCode += getEquivAmount().hashCode();
        }
        if (getFareCalcFieldQ() != null) {
            _hashCode += getFareCalcFieldQ().hashCode();
        }
        if (getEquivCurrencyFareCalcFieldQ() != null) {
            _hashCode += getEquivCurrencyFareCalcFieldQ().hashCode();
        }
        if (getSegmentNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSegmentNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSegmentNumbers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFareRules() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFareRules());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFareRules(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFareBasisCodes() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFareBasisCodes());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFareBasisCodes(), i);
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
        new org.apache.axis.description.TypeDesc(PricingInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "PricingInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "HasError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TotalFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("baseFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BaseFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bankRateUsed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BankRateUsed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareCalcCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FareCalcCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "CurrencyInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareCalcROE");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FareCalcROE"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("isStoredFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "IsStoredFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isManualStoredFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "IsManualStoredFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("penaltyText");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PenaltyText"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketByDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TicketByDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pricingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PricingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "PricingType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("publishedFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PublishedFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originCityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "OriginCityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxYQ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TaxYQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxYR");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TaxYR"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Taxes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "TaxInfoForPricing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "TaxInfoForPricing"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "OriginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DestinationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "LinearFareDestinationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "LinearFareDestinationInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnOriginCityCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ReturnOriginCityCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnOriginDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ReturnOriginDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("returnDestinationInfo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ReturnDestinationInfo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "LinearFareDestinationInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "LinearFareDestinationInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("linearFareLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "LinearFareLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XFs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "XFs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "AirportChargeItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "AirportChargeItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ZPs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ZPs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "AirportChargeItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "AirportChargeItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("XFandZPstring");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "XFandZPstring"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numTickets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "NumTickets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equivAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "EquivAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareCalcFieldQ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FareCalcFieldQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("equivCurrencyFareCalcFieldQ");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "EquivCurrencyFareCalcFieldQ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segmentNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "SegmentNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "int"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FareRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FareRule"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "FareRule"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareBasisCodes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FareBasisCodes"));
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
