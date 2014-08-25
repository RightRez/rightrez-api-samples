/**
 * RRZPnr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class RRZPnr  extends com.rightrez.RawPnr  implements java.io.Serializable {
    private boolean isInDC;

    private com.rightrez.MoneyAmount internalMarkup;

    private boolean repriced;

    private boolean addCollectChangeable;

    private com.rightrez.MoneyAmount addCollect;

    private int dataCapturePNRID;

    private java.lang.String TWID;

    private java.lang.String[] travelWithLocators;

    private com.rightrez.MoneyAmount totalQuoted;

    private com.rightrez.MoneyAmount externalMarkup;

    private com.rightrez.MoneyAmount billableCost;

    private com.rightrez.MoneyAmount billableCostBaseFare;

    private int PPLineNumber;

    private com.rightrez.PPLine PPLine;

    private java.lang.String[] fareType;

    private java.lang.String bookType;

    private java.lang.String secondaryBookType;

    private java.lang.Object[][] RRZPnrComponents;

    private com.rightrez.RRZName[] RRZNames;

    private com.rightrez.GDSTicketedStatus GDSTicketedStatus;

    private boolean hasError;

    private java.lang.String GDSErrorMessage;

    private boolean hasRoundTripPricing;

    private java.lang.String clientID;

    private com.rightrez.TicketStatus DBTicketStatus;

    private java.lang.String[] contentParsingMessages;

    private com.rightrez.CustomContent[] customContent;

    private boolean useMarineFares;

    private boolean usePublishedFares;

    private com.rightrez.SerializableKeyValuePairOfServiceLevelMoneyAmount[] budgetedCosts;

    public RRZPnr() {
    }

    public RRZPnr(
           java.lang.String[] billingAddresses,
           java.lang.String[] mailingAddresses,
           com.rightrez.PnrEmail[] emailAddresses,
           java.lang.String[] errors,
           com.rightrez.RawPnrHeader header,
           com.rightrez.RawPassengerName[] passengers,
           com.rightrez.RawPnrRemark[] remarks,
           com.rightrez.RawSegment[] segments,
           com.rightrez.RawTicket[] tickets,
           com.rightrez.RawOSI[] OSIs,
           com.rightrez.RawSSR[] SSRs,
           com.rightrez.PricingInfo[] storedFares,
           com.rightrez.SerializableKeyValuePairOfInt32RawAirSegment[] airReferences,
           com.rightrez.PassengerAccountingItem[] accountingItems,
           com.rightrez.PnrTicketInfo[] ticketingLines,
           boolean hasFDLine,
           java.lang.String[] invoiceRemarks,
           java.lang.String[] itineraryRemarks,
           java.lang.String[] confidentialRemarks,
           java.lang.String[] corporateRemarks,
           java.lang.String customerID,
           boolean isInDC,
           com.rightrez.MoneyAmount internalMarkup,
           boolean repriced,
           boolean addCollectChangeable,
           com.rightrez.MoneyAmount addCollect,
           int dataCapturePNRID,
           java.lang.String TWID,
           java.lang.String[] travelWithLocators,
           com.rightrez.MoneyAmount totalQuoted,
           com.rightrez.MoneyAmount externalMarkup,
           com.rightrez.MoneyAmount billableCost,
           com.rightrez.MoneyAmount billableCostBaseFare,
           int PPLineNumber,
           com.rightrez.PPLine PPLine,
           java.lang.String[] fareType,
           java.lang.String bookType,
           java.lang.String secondaryBookType,
           java.lang.Object[][] RRZPnrComponents,
           com.rightrez.RRZName[] RRZNames,
           com.rightrez.GDSTicketedStatus GDSTicketedStatus,
           boolean hasError,
           java.lang.String GDSErrorMessage,
           boolean hasRoundTripPricing,
           java.lang.String clientID,
           com.rightrez.TicketStatus DBTicketStatus,
           java.lang.String[] contentParsingMessages,
           com.rightrez.CustomContent[] customContent,
           boolean useMarineFares,
           boolean usePublishedFares,
           com.rightrez.SerializableKeyValuePairOfServiceLevelMoneyAmount[] budgetedCosts) {
        super(
            billingAddresses,
            mailingAddresses,
            emailAddresses,
            errors,
            header,
            passengers,
            remarks,
            segments,
            tickets,
            OSIs,
            SSRs,
            storedFares,
            airReferences,
            accountingItems,
            ticketingLines,
            hasFDLine,
            invoiceRemarks,
            itineraryRemarks,
            confidentialRemarks,
            corporateRemarks,
            customerID);
        this.isInDC = isInDC;
        this.internalMarkup = internalMarkup;
        this.repriced = repriced;
        this.addCollectChangeable = addCollectChangeable;
        this.addCollect = addCollect;
        this.dataCapturePNRID = dataCapturePNRID;
        this.TWID = TWID;
        this.travelWithLocators = travelWithLocators;
        this.totalQuoted = totalQuoted;
        this.externalMarkup = externalMarkup;
        this.billableCost = billableCost;
        this.billableCostBaseFare = billableCostBaseFare;
        this.PPLineNumber = PPLineNumber;
        this.PPLine = PPLine;
        this.fareType = fareType;
        this.bookType = bookType;
        this.secondaryBookType = secondaryBookType;
        this.RRZPnrComponents = RRZPnrComponents;
        this.RRZNames = RRZNames;
        this.GDSTicketedStatus = GDSTicketedStatus;
        this.hasError = hasError;
        this.GDSErrorMessage = GDSErrorMessage;
        this.hasRoundTripPricing = hasRoundTripPricing;
        this.clientID = clientID;
        this.DBTicketStatus = DBTicketStatus;
        this.contentParsingMessages = contentParsingMessages;
        this.customContent = customContent;
        this.useMarineFares = useMarineFares;
        this.usePublishedFares = usePublishedFares;
        this.budgetedCosts = budgetedCosts;
    }


    /**
     * Gets the isInDC value for this RRZPnr.
     * 
     * @return isInDC
     */
    public boolean isIsInDC() {
        return isInDC;
    }


    /**
     * Sets the isInDC value for this RRZPnr.
     * 
     * @param isInDC
     */
    public void setIsInDC(boolean isInDC) {
        this.isInDC = isInDC;
    }


    /**
     * Gets the internalMarkup value for this RRZPnr.
     * 
     * @return internalMarkup
     */
    public com.rightrez.MoneyAmount getInternalMarkup() {
        return internalMarkup;
    }


    /**
     * Sets the internalMarkup value for this RRZPnr.
     * 
     * @param internalMarkup
     */
    public void setInternalMarkup(com.rightrez.MoneyAmount internalMarkup) {
        this.internalMarkup = internalMarkup;
    }


    /**
     * Gets the repriced value for this RRZPnr.
     * 
     * @return repriced
     */
    public boolean isRepriced() {
        return repriced;
    }


    /**
     * Sets the repriced value for this RRZPnr.
     * 
     * @param repriced
     */
    public void setRepriced(boolean repriced) {
        this.repriced = repriced;
    }


    /**
     * Gets the addCollectChangeable value for this RRZPnr.
     * 
     * @return addCollectChangeable
     */
    public boolean isAddCollectChangeable() {
        return addCollectChangeable;
    }


    /**
     * Sets the addCollectChangeable value for this RRZPnr.
     * 
     * @param addCollectChangeable
     */
    public void setAddCollectChangeable(boolean addCollectChangeable) {
        this.addCollectChangeable = addCollectChangeable;
    }


    /**
     * Gets the addCollect value for this RRZPnr.
     * 
     * @return addCollect
     */
    public com.rightrez.MoneyAmount getAddCollect() {
        return addCollect;
    }


    /**
     * Sets the addCollect value for this RRZPnr.
     * 
     * @param addCollect
     */
    public void setAddCollect(com.rightrez.MoneyAmount addCollect) {
        this.addCollect = addCollect;
    }


    /**
     * Gets the dataCapturePNRID value for this RRZPnr.
     * 
     * @return dataCapturePNRID
     */
    public int getDataCapturePNRID() {
        return dataCapturePNRID;
    }


    /**
     * Sets the dataCapturePNRID value for this RRZPnr.
     * 
     * @param dataCapturePNRID
     */
    public void setDataCapturePNRID(int dataCapturePNRID) {
        this.dataCapturePNRID = dataCapturePNRID;
    }


    /**
     * Gets the TWID value for this RRZPnr.
     * 
     * @return TWID
     */
    public java.lang.String getTWID() {
        return TWID;
    }


    /**
     * Sets the TWID value for this RRZPnr.
     * 
     * @param TWID
     */
    public void setTWID(java.lang.String TWID) {
        this.TWID = TWID;
    }


    /**
     * Gets the travelWithLocators value for this RRZPnr.
     * 
     * @return travelWithLocators
     */
    public java.lang.String[] getTravelWithLocators() {
        return travelWithLocators;
    }


    /**
     * Sets the travelWithLocators value for this RRZPnr.
     * 
     * @param travelWithLocators
     */
    public void setTravelWithLocators(java.lang.String[] travelWithLocators) {
        this.travelWithLocators = travelWithLocators;
    }


    /**
     * Gets the totalQuoted value for this RRZPnr.
     * 
     * @return totalQuoted
     */
    public com.rightrez.MoneyAmount getTotalQuoted() {
        return totalQuoted;
    }


    /**
     * Sets the totalQuoted value for this RRZPnr.
     * 
     * @param totalQuoted
     */
    public void setTotalQuoted(com.rightrez.MoneyAmount totalQuoted) {
        this.totalQuoted = totalQuoted;
    }


    /**
     * Gets the externalMarkup value for this RRZPnr.
     * 
     * @return externalMarkup
     */
    public com.rightrez.MoneyAmount getExternalMarkup() {
        return externalMarkup;
    }


    /**
     * Sets the externalMarkup value for this RRZPnr.
     * 
     * @param externalMarkup
     */
    public void setExternalMarkup(com.rightrez.MoneyAmount externalMarkup) {
        this.externalMarkup = externalMarkup;
    }


    /**
     * Gets the billableCost value for this RRZPnr.
     * 
     * @return billableCost
     */
    public com.rightrez.MoneyAmount getBillableCost() {
        return billableCost;
    }


    /**
     * Sets the billableCost value for this RRZPnr.
     * 
     * @param billableCost
     */
    public void setBillableCost(com.rightrez.MoneyAmount billableCost) {
        this.billableCost = billableCost;
    }


    /**
     * Gets the billableCostBaseFare value for this RRZPnr.
     * 
     * @return billableCostBaseFare
     */
    public com.rightrez.MoneyAmount getBillableCostBaseFare() {
        return billableCostBaseFare;
    }


    /**
     * Sets the billableCostBaseFare value for this RRZPnr.
     * 
     * @param billableCostBaseFare
     */
    public void setBillableCostBaseFare(com.rightrez.MoneyAmount billableCostBaseFare) {
        this.billableCostBaseFare = billableCostBaseFare;
    }


    /**
     * Gets the PPLineNumber value for this RRZPnr.
     * 
     * @return PPLineNumber
     */
    public int getPPLineNumber() {
        return PPLineNumber;
    }


    /**
     * Sets the PPLineNumber value for this RRZPnr.
     * 
     * @param PPLineNumber
     */
    public void setPPLineNumber(int PPLineNumber) {
        this.PPLineNumber = PPLineNumber;
    }


    /**
     * Gets the PPLine value for this RRZPnr.
     * 
     * @return PPLine
     */
    public com.rightrez.PPLine getPPLine() {
        return PPLine;
    }


    /**
     * Sets the PPLine value for this RRZPnr.
     * 
     * @param PPLine
     */
    public void setPPLine(com.rightrez.PPLine PPLine) {
        this.PPLine = PPLine;
    }


    /**
     * Gets the fareType value for this RRZPnr.
     * 
     * @return fareType
     */
    public java.lang.String[] getFareType() {
        return fareType;
    }


    /**
     * Sets the fareType value for this RRZPnr.
     * 
     * @param fareType
     */
    public void setFareType(java.lang.String[] fareType) {
        this.fareType = fareType;
    }


    /**
     * Gets the bookType value for this RRZPnr.
     * 
     * @return bookType
     */
    public java.lang.String getBookType() {
        return bookType;
    }


    /**
     * Sets the bookType value for this RRZPnr.
     * 
     * @param bookType
     */
    public void setBookType(java.lang.String bookType) {
        this.bookType = bookType;
    }


    /**
     * Gets the secondaryBookType value for this RRZPnr.
     * 
     * @return secondaryBookType
     */
    public java.lang.String getSecondaryBookType() {
        return secondaryBookType;
    }


    /**
     * Sets the secondaryBookType value for this RRZPnr.
     * 
     * @param secondaryBookType
     */
    public void setSecondaryBookType(java.lang.String secondaryBookType) {
        this.secondaryBookType = secondaryBookType;
    }


    /**
     * Gets the RRZPnrComponents value for this RRZPnr.
     * 
     * @return RRZPnrComponents
     */
    public java.lang.Object[][] getRRZPnrComponents() {
        return RRZPnrComponents;
    }


    /**
     * Sets the RRZPnrComponents value for this RRZPnr.
     * 
     * @param RRZPnrComponents
     */
    public void setRRZPnrComponents(java.lang.Object[][] RRZPnrComponents) {
        this.RRZPnrComponents = RRZPnrComponents;
    }


    /**
     * Gets the RRZNames value for this RRZPnr.
     * 
     * @return RRZNames
     */
    public com.rightrez.RRZName[] getRRZNames() {
        return RRZNames;
    }


    /**
     * Sets the RRZNames value for this RRZPnr.
     * 
     * @param RRZNames
     */
    public void setRRZNames(com.rightrez.RRZName[] RRZNames) {
        this.RRZNames = RRZNames;
    }


    /**
     * Gets the GDSTicketedStatus value for this RRZPnr.
     * 
     * @return GDSTicketedStatus
     */
    public com.rightrez.GDSTicketedStatus getGDSTicketedStatus() {
        return GDSTicketedStatus;
    }


    /**
     * Sets the GDSTicketedStatus value for this RRZPnr.
     * 
     * @param GDSTicketedStatus
     */
    public void setGDSTicketedStatus(com.rightrez.GDSTicketedStatus GDSTicketedStatus) {
        this.GDSTicketedStatus = GDSTicketedStatus;
    }


    /**
     * Gets the hasError value for this RRZPnr.
     * 
     * @return hasError
     */
    public boolean isHasError() {
        return hasError;
    }


    /**
     * Sets the hasError value for this RRZPnr.
     * 
     * @param hasError
     */
    public void setHasError(boolean hasError) {
        this.hasError = hasError;
    }


    /**
     * Gets the GDSErrorMessage value for this RRZPnr.
     * 
     * @return GDSErrorMessage
     */
    public java.lang.String getGDSErrorMessage() {
        return GDSErrorMessage;
    }


    /**
     * Sets the GDSErrorMessage value for this RRZPnr.
     * 
     * @param GDSErrorMessage
     */
    public void setGDSErrorMessage(java.lang.String GDSErrorMessage) {
        this.GDSErrorMessage = GDSErrorMessage;
    }


    /**
     * Gets the hasRoundTripPricing value for this RRZPnr.
     * 
     * @return hasRoundTripPricing
     */
    public boolean isHasRoundTripPricing() {
        return hasRoundTripPricing;
    }


    /**
     * Sets the hasRoundTripPricing value for this RRZPnr.
     * 
     * @param hasRoundTripPricing
     */
    public void setHasRoundTripPricing(boolean hasRoundTripPricing) {
        this.hasRoundTripPricing = hasRoundTripPricing;
    }


    /**
     * Gets the clientID value for this RRZPnr.
     * 
     * @return clientID
     */
    public java.lang.String getClientID() {
        return clientID;
    }


    /**
     * Sets the clientID value for this RRZPnr.
     * 
     * @param clientID
     */
    public void setClientID(java.lang.String clientID) {
        this.clientID = clientID;
    }


    /**
     * Gets the DBTicketStatus value for this RRZPnr.
     * 
     * @return DBTicketStatus
     */
    public com.rightrez.TicketStatus getDBTicketStatus() {
        return DBTicketStatus;
    }


    /**
     * Sets the DBTicketStatus value for this RRZPnr.
     * 
     * @param DBTicketStatus
     */
    public void setDBTicketStatus(com.rightrez.TicketStatus DBTicketStatus) {
        this.DBTicketStatus = DBTicketStatus;
    }


    /**
     * Gets the contentParsingMessages value for this RRZPnr.
     * 
     * @return contentParsingMessages
     */
    public java.lang.String[] getContentParsingMessages() {
        return contentParsingMessages;
    }


    /**
     * Sets the contentParsingMessages value for this RRZPnr.
     * 
     * @param contentParsingMessages
     */
    public void setContentParsingMessages(java.lang.String[] contentParsingMessages) {
        this.contentParsingMessages = contentParsingMessages;
    }


    /**
     * Gets the customContent value for this RRZPnr.
     * 
     * @return customContent
     */
    public com.rightrez.CustomContent[] getCustomContent() {
        return customContent;
    }


    /**
     * Sets the customContent value for this RRZPnr.
     * 
     * @param customContent
     */
    public void setCustomContent(com.rightrez.CustomContent[] customContent) {
        this.customContent = customContent;
    }


    /**
     * Gets the useMarineFares value for this RRZPnr.
     * 
     * @return useMarineFares
     */
    public boolean isUseMarineFares() {
        return useMarineFares;
    }


    /**
     * Sets the useMarineFares value for this RRZPnr.
     * 
     * @param useMarineFares
     */
    public void setUseMarineFares(boolean useMarineFares) {
        this.useMarineFares = useMarineFares;
    }


    /**
     * Gets the usePublishedFares value for this RRZPnr.
     * 
     * @return usePublishedFares
     */
    public boolean isUsePublishedFares() {
        return usePublishedFares;
    }


    /**
     * Sets the usePublishedFares value for this RRZPnr.
     * 
     * @param usePublishedFares
     */
    public void setUsePublishedFares(boolean usePublishedFares) {
        this.usePublishedFares = usePublishedFares;
    }


    /**
     * Gets the budgetedCosts value for this RRZPnr.
     * 
     * @return budgetedCosts
     */
    public com.rightrez.SerializableKeyValuePairOfServiceLevelMoneyAmount[] getBudgetedCosts() {
        return budgetedCosts;
    }


    /**
     * Sets the budgetedCosts value for this RRZPnr.
     * 
     * @param budgetedCosts
     */
    public void setBudgetedCosts(com.rightrez.SerializableKeyValuePairOfServiceLevelMoneyAmount[] budgetedCosts) {
        this.budgetedCosts = budgetedCosts;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RRZPnr)) return false;
        RRZPnr other = (RRZPnr) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            this.isInDC == other.isIsInDC() &&
            ((this.internalMarkup==null && other.getInternalMarkup()==null) || 
             (this.internalMarkup!=null &&
              this.internalMarkup.equals(other.getInternalMarkup()))) &&
            this.repriced == other.isRepriced() &&
            this.addCollectChangeable == other.isAddCollectChangeable() &&
            ((this.addCollect==null && other.getAddCollect()==null) || 
             (this.addCollect!=null &&
              this.addCollect.equals(other.getAddCollect()))) &&
            this.dataCapturePNRID == other.getDataCapturePNRID() &&
            ((this.TWID==null && other.getTWID()==null) || 
             (this.TWID!=null &&
              this.TWID.equals(other.getTWID()))) &&
            ((this.travelWithLocators==null && other.getTravelWithLocators()==null) || 
             (this.travelWithLocators!=null &&
              java.util.Arrays.equals(this.travelWithLocators, other.getTravelWithLocators()))) &&
            ((this.totalQuoted==null && other.getTotalQuoted()==null) || 
             (this.totalQuoted!=null &&
              this.totalQuoted.equals(other.getTotalQuoted()))) &&
            ((this.externalMarkup==null && other.getExternalMarkup()==null) || 
             (this.externalMarkup!=null &&
              this.externalMarkup.equals(other.getExternalMarkup()))) &&
            ((this.billableCost==null && other.getBillableCost()==null) || 
             (this.billableCost!=null &&
              this.billableCost.equals(other.getBillableCost()))) &&
            ((this.billableCostBaseFare==null && other.getBillableCostBaseFare()==null) || 
             (this.billableCostBaseFare!=null &&
              this.billableCostBaseFare.equals(other.getBillableCostBaseFare()))) &&
            this.PPLineNumber == other.getPPLineNumber() &&
            ((this.PPLine==null && other.getPPLine()==null) || 
             (this.PPLine!=null &&
              this.PPLine.equals(other.getPPLine()))) &&
            ((this.fareType==null && other.getFareType()==null) || 
             (this.fareType!=null &&
              java.util.Arrays.equals(this.fareType, other.getFareType()))) &&
            ((this.bookType==null && other.getBookType()==null) || 
             (this.bookType!=null &&
              this.bookType.equals(other.getBookType()))) &&
            ((this.secondaryBookType==null && other.getSecondaryBookType()==null) || 
             (this.secondaryBookType!=null &&
              this.secondaryBookType.equals(other.getSecondaryBookType()))) &&
            ((this.RRZPnrComponents==null && other.getRRZPnrComponents()==null) || 
             (this.RRZPnrComponents!=null &&
              java.util.Arrays.equals(this.RRZPnrComponents, other.getRRZPnrComponents()))) &&
            ((this.RRZNames==null && other.getRRZNames()==null) || 
             (this.RRZNames!=null &&
              java.util.Arrays.equals(this.RRZNames, other.getRRZNames()))) &&
            ((this.GDSTicketedStatus==null && other.getGDSTicketedStatus()==null) || 
             (this.GDSTicketedStatus!=null &&
              this.GDSTicketedStatus.equals(other.getGDSTicketedStatus()))) &&
            this.hasError == other.isHasError() &&
            ((this.GDSErrorMessage==null && other.getGDSErrorMessage()==null) || 
             (this.GDSErrorMessage!=null &&
              this.GDSErrorMessage.equals(other.getGDSErrorMessage()))) &&
            this.hasRoundTripPricing == other.isHasRoundTripPricing() &&
            ((this.clientID==null && other.getClientID()==null) || 
             (this.clientID!=null &&
              this.clientID.equals(other.getClientID()))) &&
            ((this.DBTicketStatus==null && other.getDBTicketStatus()==null) || 
             (this.DBTicketStatus!=null &&
              this.DBTicketStatus.equals(other.getDBTicketStatus()))) &&
            ((this.contentParsingMessages==null && other.getContentParsingMessages()==null) || 
             (this.contentParsingMessages!=null &&
              java.util.Arrays.equals(this.contentParsingMessages, other.getContentParsingMessages()))) &&
            ((this.customContent==null && other.getCustomContent()==null) || 
             (this.customContent!=null &&
              java.util.Arrays.equals(this.customContent, other.getCustomContent()))) &&
            this.useMarineFares == other.isUseMarineFares() &&
            this.usePublishedFares == other.isUsePublishedFares() &&
            ((this.budgetedCosts==null && other.getBudgetedCosts()==null) || 
             (this.budgetedCosts!=null &&
              java.util.Arrays.equals(this.budgetedCosts, other.getBudgetedCosts())));
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
        _hashCode += (isIsInDC() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getInternalMarkup() != null) {
            _hashCode += getInternalMarkup().hashCode();
        }
        _hashCode += (isRepriced() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAddCollectChangeable() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getAddCollect() != null) {
            _hashCode += getAddCollect().hashCode();
        }
        _hashCode += getDataCapturePNRID();
        if (getTWID() != null) {
            _hashCode += getTWID().hashCode();
        }
        if (getTravelWithLocators() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTravelWithLocators());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTravelWithLocators(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTotalQuoted() != null) {
            _hashCode += getTotalQuoted().hashCode();
        }
        if (getExternalMarkup() != null) {
            _hashCode += getExternalMarkup().hashCode();
        }
        if (getBillableCost() != null) {
            _hashCode += getBillableCost().hashCode();
        }
        if (getBillableCostBaseFare() != null) {
            _hashCode += getBillableCostBaseFare().hashCode();
        }
        _hashCode += getPPLineNumber();
        if (getPPLine() != null) {
            _hashCode += getPPLine().hashCode();
        }
        if (getFareType() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFareType());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFareType(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getBookType() != null) {
            _hashCode += getBookType().hashCode();
        }
        if (getSecondaryBookType() != null) {
            _hashCode += getSecondaryBookType().hashCode();
        }
        if (getRRZPnrComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRRZPnrComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRRZPnrComponents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRRZNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRRZNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRRZNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getGDSTicketedStatus() != null) {
            _hashCode += getGDSTicketedStatus().hashCode();
        }
        _hashCode += (isHasError() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getGDSErrorMessage() != null) {
            _hashCode += getGDSErrorMessage().hashCode();
        }
        _hashCode += (isHasRoundTripPricing() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getClientID() != null) {
            _hashCode += getClientID().hashCode();
        }
        if (getDBTicketStatus() != null) {
            _hashCode += getDBTicketStatus().hashCode();
        }
        if (getContentParsingMessages() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getContentParsingMessages());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getContentParsingMessages(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomContent() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCustomContent());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCustomContent(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isUseMarineFares() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUsePublishedFares() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBudgetedCosts() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBudgetedCosts());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBudgetedCosts(), i);
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
        new org.apache.axis.description.TypeDesc(RRZPnr.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RRZPnr"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isInDC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "IsInDC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("internalMarkup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "InternalMarkup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("repriced");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Repriced"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addCollectChangeable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AddCollectChangeable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addCollect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AddCollect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCapturePNRID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DataCapturePNRID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("TWID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TWID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("travelWithLocators");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TravelWithLocators"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalQuoted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TotalQuoted"));
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
        elemField.setFieldName("billableCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BillableCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billableCostBaseFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BillableCostBaseFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPLineNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PPLineNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PPLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "PPLine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FareType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FareType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BookType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secondaryBookType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "SecondaryBookType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RRZPnrComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "RRZPnrComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfAnyType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfAnyType"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("RRZNames");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "RRZNames"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RRZName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "RRZName"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GDSTicketedStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "GDSTicketedStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "GDSTicketedStatus"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasError");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "HasError"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("GDSErrorMessage");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "GDSErrorMessage"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasRoundTripPricing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "HasRoundTripPricing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ClientID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("DBTicketStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DBTicketStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "TicketStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("contentParsingMessages");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ContentParsingMessages"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CustomContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "CustomContent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "CustomContent"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useMarineFares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "UseMarineFares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usePublishedFares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "UsePublishedFares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("budgetedCosts");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BudgetedCosts"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfServiceLevelMoneyAmount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfServiceLevelMoneyAmount"));
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
