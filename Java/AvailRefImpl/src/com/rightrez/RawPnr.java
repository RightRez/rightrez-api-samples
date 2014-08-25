/**
 * RawPnr.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class RawPnr  implements java.io.Serializable {
    private java.lang.String[] billingAddresses;

    private java.lang.String[] mailingAddresses;

    private com.rightrez.PnrEmail[] emailAddresses;

    private java.lang.String[] errors;

    private com.rightrez.RawPnrHeader header;

    private com.rightrez.RawPassengerName[] passengers;

    private com.rightrez.RawPnrRemark[] remarks;

    private com.rightrez.RawSegment[] segments;

    private com.rightrez.RawTicket[] tickets;

    private com.rightrez.RawOSI[] OSIs;

    private com.rightrez.RawSSR[] SSRs;

    private com.rightrez.PricingInfo[] storedFares;

    private com.rightrez.SerializableKeyValuePairOfInt32RawAirSegment[] airReferences;

    private com.rightrez.PassengerAccountingItem[] accountingItems;

    private com.rightrez.PnrTicketInfo[] ticketingLines;

    private boolean hasFDLine;

    private java.lang.String[] invoiceRemarks;

    private java.lang.String[] itineraryRemarks;

    private java.lang.String[] confidentialRemarks;

    private java.lang.String[] corporateRemarks;

    private java.lang.String customerID;

    public RawPnr() {
    }

    public RawPnr(
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
           java.lang.String customerID) {
           this.billingAddresses = billingAddresses;
           this.mailingAddresses = mailingAddresses;
           this.emailAddresses = emailAddresses;
           this.errors = errors;
           this.header = header;
           this.passengers = passengers;
           this.remarks = remarks;
           this.segments = segments;
           this.tickets = tickets;
           this.OSIs = OSIs;
           this.SSRs = SSRs;
           this.storedFares = storedFares;
           this.airReferences = airReferences;
           this.accountingItems = accountingItems;
           this.ticketingLines = ticketingLines;
           this.hasFDLine = hasFDLine;
           this.invoiceRemarks = invoiceRemarks;
           this.itineraryRemarks = itineraryRemarks;
           this.confidentialRemarks = confidentialRemarks;
           this.corporateRemarks = corporateRemarks;
           this.customerID = customerID;
    }


    /**
     * Gets the billingAddresses value for this RawPnr.
     * 
     * @return billingAddresses
     */
    public java.lang.String[] getBillingAddresses() {
        return billingAddresses;
    }


    /**
     * Sets the billingAddresses value for this RawPnr.
     * 
     * @param billingAddresses
     */
    public void setBillingAddresses(java.lang.String[] billingAddresses) {
        this.billingAddresses = billingAddresses;
    }


    /**
     * Gets the mailingAddresses value for this RawPnr.
     * 
     * @return mailingAddresses
     */
    public java.lang.String[] getMailingAddresses() {
        return mailingAddresses;
    }


    /**
     * Sets the mailingAddresses value for this RawPnr.
     * 
     * @param mailingAddresses
     */
    public void setMailingAddresses(java.lang.String[] mailingAddresses) {
        this.mailingAddresses = mailingAddresses;
    }


    /**
     * Gets the emailAddresses value for this RawPnr.
     * 
     * @return emailAddresses
     */
    public com.rightrez.PnrEmail[] getEmailAddresses() {
        return emailAddresses;
    }


    /**
     * Sets the emailAddresses value for this RawPnr.
     * 
     * @param emailAddresses
     */
    public void setEmailAddresses(com.rightrez.PnrEmail[] emailAddresses) {
        this.emailAddresses = emailAddresses;
    }


    /**
     * Gets the errors value for this RawPnr.
     * 
     * @return errors
     */
    public java.lang.String[] getErrors() {
        return errors;
    }


    /**
     * Sets the errors value for this RawPnr.
     * 
     * @param errors
     */
    public void setErrors(java.lang.String[] errors) {
        this.errors = errors;
    }


    /**
     * Gets the header value for this RawPnr.
     * 
     * @return header
     */
    public com.rightrez.RawPnrHeader getHeader() {
        return header;
    }


    /**
     * Sets the header value for this RawPnr.
     * 
     * @param header
     */
    public void setHeader(com.rightrez.RawPnrHeader header) {
        this.header = header;
    }


    /**
     * Gets the passengers value for this RawPnr.
     * 
     * @return passengers
     */
    public com.rightrez.RawPassengerName[] getPassengers() {
        return passengers;
    }


    /**
     * Sets the passengers value for this RawPnr.
     * 
     * @param passengers
     */
    public void setPassengers(com.rightrez.RawPassengerName[] passengers) {
        this.passengers = passengers;
    }


    /**
     * Gets the remarks value for this RawPnr.
     * 
     * @return remarks
     */
    public com.rightrez.RawPnrRemark[] getRemarks() {
        return remarks;
    }


    /**
     * Sets the remarks value for this RawPnr.
     * 
     * @param remarks
     */
    public void setRemarks(com.rightrez.RawPnrRemark[] remarks) {
        this.remarks = remarks;
    }


    /**
     * Gets the segments value for this RawPnr.
     * 
     * @return segments
     */
    public com.rightrez.RawSegment[] getSegments() {
        return segments;
    }


    /**
     * Sets the segments value for this RawPnr.
     * 
     * @param segments
     */
    public void setSegments(com.rightrez.RawSegment[] segments) {
        this.segments = segments;
    }


    /**
     * Gets the tickets value for this RawPnr.
     * 
     * @return tickets
     */
    public com.rightrez.RawTicket[] getTickets() {
        return tickets;
    }


    /**
     * Sets the tickets value for this RawPnr.
     * 
     * @param tickets
     */
    public void setTickets(com.rightrez.RawTicket[] tickets) {
        this.tickets = tickets;
    }


    /**
     * Gets the OSIs value for this RawPnr.
     * 
     * @return OSIs
     */
    public com.rightrez.RawOSI[] getOSIs() {
        return OSIs;
    }


    /**
     * Sets the OSIs value for this RawPnr.
     * 
     * @param OSIs
     */
    public void setOSIs(com.rightrez.RawOSI[] OSIs) {
        this.OSIs = OSIs;
    }


    /**
     * Gets the SSRs value for this RawPnr.
     * 
     * @return SSRs
     */
    public com.rightrez.RawSSR[] getSSRs() {
        return SSRs;
    }


    /**
     * Sets the SSRs value for this RawPnr.
     * 
     * @param SSRs
     */
    public void setSSRs(com.rightrez.RawSSR[] SSRs) {
        this.SSRs = SSRs;
    }


    /**
     * Gets the storedFares value for this RawPnr.
     * 
     * @return storedFares
     */
    public com.rightrez.PricingInfo[] getStoredFares() {
        return storedFares;
    }


    /**
     * Sets the storedFares value for this RawPnr.
     * 
     * @param storedFares
     */
    public void setStoredFares(com.rightrez.PricingInfo[] storedFares) {
        this.storedFares = storedFares;
    }


    /**
     * Gets the airReferences value for this RawPnr.
     * 
     * @return airReferences
     */
    public com.rightrez.SerializableKeyValuePairOfInt32RawAirSegment[] getAirReferences() {
        return airReferences;
    }


    /**
     * Sets the airReferences value for this RawPnr.
     * 
     * @param airReferences
     */
    public void setAirReferences(com.rightrez.SerializableKeyValuePairOfInt32RawAirSegment[] airReferences) {
        this.airReferences = airReferences;
    }


    /**
     * Gets the accountingItems value for this RawPnr.
     * 
     * @return accountingItems
     */
    public com.rightrez.PassengerAccountingItem[] getAccountingItems() {
        return accountingItems;
    }


    /**
     * Sets the accountingItems value for this RawPnr.
     * 
     * @param accountingItems
     */
    public void setAccountingItems(com.rightrez.PassengerAccountingItem[] accountingItems) {
        this.accountingItems = accountingItems;
    }


    /**
     * Gets the ticketingLines value for this RawPnr.
     * 
     * @return ticketingLines
     */
    public com.rightrez.PnrTicketInfo[] getTicketingLines() {
        return ticketingLines;
    }


    /**
     * Sets the ticketingLines value for this RawPnr.
     * 
     * @param ticketingLines
     */
    public void setTicketingLines(com.rightrez.PnrTicketInfo[] ticketingLines) {
        this.ticketingLines = ticketingLines;
    }


    /**
     * Gets the hasFDLine value for this RawPnr.
     * 
     * @return hasFDLine
     */
    public boolean isHasFDLine() {
        return hasFDLine;
    }


    /**
     * Sets the hasFDLine value for this RawPnr.
     * 
     * @param hasFDLine
     */
    public void setHasFDLine(boolean hasFDLine) {
        this.hasFDLine = hasFDLine;
    }


    /**
     * Gets the invoiceRemarks value for this RawPnr.
     * 
     * @return invoiceRemarks
     */
    public java.lang.String[] getInvoiceRemarks() {
        return invoiceRemarks;
    }


    /**
     * Sets the invoiceRemarks value for this RawPnr.
     * 
     * @param invoiceRemarks
     */
    public void setInvoiceRemarks(java.lang.String[] invoiceRemarks) {
        this.invoiceRemarks = invoiceRemarks;
    }


    /**
     * Gets the itineraryRemarks value for this RawPnr.
     * 
     * @return itineraryRemarks
     */
    public java.lang.String[] getItineraryRemarks() {
        return itineraryRemarks;
    }


    /**
     * Sets the itineraryRemarks value for this RawPnr.
     * 
     * @param itineraryRemarks
     */
    public void setItineraryRemarks(java.lang.String[] itineraryRemarks) {
        this.itineraryRemarks = itineraryRemarks;
    }


    /**
     * Gets the confidentialRemarks value for this RawPnr.
     * 
     * @return confidentialRemarks
     */
    public java.lang.String[] getConfidentialRemarks() {
        return confidentialRemarks;
    }


    /**
     * Sets the confidentialRemarks value for this RawPnr.
     * 
     * @param confidentialRemarks
     */
    public void setConfidentialRemarks(java.lang.String[] confidentialRemarks) {
        this.confidentialRemarks = confidentialRemarks;
    }


    /**
     * Gets the corporateRemarks value for this RawPnr.
     * 
     * @return corporateRemarks
     */
    public java.lang.String[] getCorporateRemarks() {
        return corporateRemarks;
    }


    /**
     * Sets the corporateRemarks value for this RawPnr.
     * 
     * @param corporateRemarks
     */
    public void setCorporateRemarks(java.lang.String[] corporateRemarks) {
        this.corporateRemarks = corporateRemarks;
    }


    /**
     * Gets the customerID value for this RawPnr.
     * 
     * @return customerID
     */
    public java.lang.String getCustomerID() {
        return customerID;
    }


    /**
     * Sets the customerID value for this RawPnr.
     * 
     * @param customerID
     */
    public void setCustomerID(java.lang.String customerID) {
        this.customerID = customerID;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RawPnr)) return false;
        RawPnr other = (RawPnr) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billingAddresses==null && other.getBillingAddresses()==null) || 
             (this.billingAddresses!=null &&
              java.util.Arrays.equals(this.billingAddresses, other.getBillingAddresses()))) &&
            ((this.mailingAddresses==null && other.getMailingAddresses()==null) || 
             (this.mailingAddresses!=null &&
              java.util.Arrays.equals(this.mailingAddresses, other.getMailingAddresses()))) &&
            ((this.emailAddresses==null && other.getEmailAddresses()==null) || 
             (this.emailAddresses!=null &&
              java.util.Arrays.equals(this.emailAddresses, other.getEmailAddresses()))) &&
            ((this.errors==null && other.getErrors()==null) || 
             (this.errors!=null &&
              java.util.Arrays.equals(this.errors, other.getErrors()))) &&
            ((this.header==null && other.getHeader()==null) || 
             (this.header!=null &&
              this.header.equals(other.getHeader()))) &&
            ((this.passengers==null && other.getPassengers()==null) || 
             (this.passengers!=null &&
              java.util.Arrays.equals(this.passengers, other.getPassengers()))) &&
            ((this.remarks==null && other.getRemarks()==null) || 
             (this.remarks!=null &&
              java.util.Arrays.equals(this.remarks, other.getRemarks()))) &&
            ((this.segments==null && other.getSegments()==null) || 
             (this.segments!=null &&
              java.util.Arrays.equals(this.segments, other.getSegments()))) &&
            ((this.tickets==null && other.getTickets()==null) || 
             (this.tickets!=null &&
              java.util.Arrays.equals(this.tickets, other.getTickets()))) &&
            ((this.OSIs==null && other.getOSIs()==null) || 
             (this.OSIs!=null &&
              java.util.Arrays.equals(this.OSIs, other.getOSIs()))) &&
            ((this.SSRs==null && other.getSSRs()==null) || 
             (this.SSRs!=null &&
              java.util.Arrays.equals(this.SSRs, other.getSSRs()))) &&
            ((this.storedFares==null && other.getStoredFares()==null) || 
             (this.storedFares!=null &&
              java.util.Arrays.equals(this.storedFares, other.getStoredFares()))) &&
            ((this.airReferences==null && other.getAirReferences()==null) || 
             (this.airReferences!=null &&
              java.util.Arrays.equals(this.airReferences, other.getAirReferences()))) &&
            ((this.accountingItems==null && other.getAccountingItems()==null) || 
             (this.accountingItems!=null &&
              java.util.Arrays.equals(this.accountingItems, other.getAccountingItems()))) &&
            ((this.ticketingLines==null && other.getTicketingLines()==null) || 
             (this.ticketingLines!=null &&
              java.util.Arrays.equals(this.ticketingLines, other.getTicketingLines()))) &&
            this.hasFDLine == other.isHasFDLine() &&
            ((this.invoiceRemarks==null && other.getInvoiceRemarks()==null) || 
             (this.invoiceRemarks!=null &&
              java.util.Arrays.equals(this.invoiceRemarks, other.getInvoiceRemarks()))) &&
            ((this.itineraryRemarks==null && other.getItineraryRemarks()==null) || 
             (this.itineraryRemarks!=null &&
              java.util.Arrays.equals(this.itineraryRemarks, other.getItineraryRemarks()))) &&
            ((this.confidentialRemarks==null && other.getConfidentialRemarks()==null) || 
             (this.confidentialRemarks!=null &&
              java.util.Arrays.equals(this.confidentialRemarks, other.getConfidentialRemarks()))) &&
            ((this.corporateRemarks==null && other.getCorporateRemarks()==null) || 
             (this.corporateRemarks!=null &&
              java.util.Arrays.equals(this.corporateRemarks, other.getCorporateRemarks()))) &&
            ((this.customerID==null && other.getCustomerID()==null) || 
             (this.customerID!=null &&
              this.customerID.equals(other.getCustomerID())));
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
        if (getBillingAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBillingAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBillingAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getMailingAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getMailingAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getMailingAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getEmailAddresses() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getEmailAddresses());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getEmailAddresses(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getErrors() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getErrors());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getErrors(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getHeader() != null) {
            _hashCode += getHeader().hashCode();
        }
        if (getPassengers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPassengers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPassengers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRemarks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRemarks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRemarks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        if (getTickets() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTickets());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTickets(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getOSIs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getOSIs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getOSIs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSSRs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSSRs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSSRs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getStoredFares() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getStoredFares());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getStoredFares(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAirReferences() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAirReferences());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAirReferences(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAccountingItems() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAccountingItems());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAccountingItems(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTicketingLines() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getTicketingLines());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getTicketingLines(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isHasFDLine() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getInvoiceRemarks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getInvoiceRemarks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getInvoiceRemarks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getItineraryRemarks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getItineraryRemarks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getItineraryRemarks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getConfidentialRemarks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConfidentialRemarks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConfidentialRemarks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCorporateRemarks() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCorporateRemarks());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCorporateRemarks(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCustomerID() != null) {
            _hashCode += getCustomerID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RawPnr.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawPnr"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billingAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BillingAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mailingAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "MailingAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("emailAddresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "EmailAddresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "PnrEmail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "PnrEmail"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("errors");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Errors"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("header");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Header"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawPnrHeader"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Passengers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawPassengerName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "RawPassengerName"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("remarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Remarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawPnrRemark"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "RawPnrRemark"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("segments");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Segments"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawSegment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "RawSegment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tickets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Tickets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawTicket"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "RawTicket"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OSIs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "OSIs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawOSI"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "RawOSI"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SSRs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "SSRs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RawSSR"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "RawSSR"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storedFares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "StoredFares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "PricingInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "PricingInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("airReferences");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AirReferences"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfInt32RawAirSegment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfInt32RawAirSegment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountingItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AccountingItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "PassengerAccountingItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "PassengerAccountingItem"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ticketingLines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TicketingLines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "PnrTicketInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "PnrTicketInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("hasFDLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "HasFDLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("invoiceRemarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "InvoiceRemarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("itineraryRemarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ItineraryRemarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confidentialRemarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ConfidentialRemarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("corporateRemarks");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CorporateRemarks"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CustomerID"));
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
