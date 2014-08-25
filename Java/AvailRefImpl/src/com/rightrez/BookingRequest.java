/**
 * BookingRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class BookingRequest  implements java.io.Serializable {
    private boolean storeFare;

    private java.lang.String department;

    private boolean deleteStoredFare;

    private java.lang.String loggingID;

    private boolean addAccounting;

    private java.lang.String bookingType;

    private java.lang.String[] fareType;

    private float totalQuoted;

    private float externalMarkup;

    private boolean writePPLine;

    private com.rightrez.GenericSeatRequest seatRequest;

    private com.rightrez.FlightPairing flightPairing;

    private com.rightrez.CRSQueue[] queues;

    private java.lang.String clientID;

    private java.lang.String userID;

    private java.lang.String[] nameCommands;

    private java.lang.String[] addlCommands;

    private boolean allowPlaceholder;

    private com.rightrez.RRZName[] names;

    private com.rightrez.BookingRequestComponent[] components;

    private java.lang.String PNRLocator;

    private com.rightrez.SerializableKeyValuePairOfStringString[] customContent;

    private com.rightrez.PnrEmail[] passengerEmails;

    public BookingRequest() {
    }

    public BookingRequest(
           boolean storeFare,
           java.lang.String department,
           boolean deleteStoredFare,
           java.lang.String loggingID,
           boolean addAccounting,
           java.lang.String bookingType,
           java.lang.String[] fareType,
           float totalQuoted,
           float externalMarkup,
           boolean writePPLine,
           com.rightrez.GenericSeatRequest seatRequest,
           com.rightrez.FlightPairing flightPairing,
           com.rightrez.CRSQueue[] queues,
           java.lang.String clientID,
           java.lang.String userID,
           java.lang.String[] nameCommands,
           java.lang.String[] addlCommands,
           boolean allowPlaceholder,
           com.rightrez.RRZName[] names,
           com.rightrez.BookingRequestComponent[] components,
           java.lang.String PNRLocator,
           com.rightrez.SerializableKeyValuePairOfStringString[] customContent,
           com.rightrez.PnrEmail[] passengerEmails) {
           this.storeFare = storeFare;
           this.department = department;
           this.deleteStoredFare = deleteStoredFare;
           this.loggingID = loggingID;
           this.addAccounting = addAccounting;
           this.bookingType = bookingType;
           this.fareType = fareType;
           this.totalQuoted = totalQuoted;
           this.externalMarkup = externalMarkup;
           this.writePPLine = writePPLine;
           this.seatRequest = seatRequest;
           this.flightPairing = flightPairing;
           this.queues = queues;
           this.clientID = clientID;
           this.userID = userID;
           this.nameCommands = nameCommands;
           this.addlCommands = addlCommands;
           this.allowPlaceholder = allowPlaceholder;
           this.names = names;
           this.components = components;
           this.PNRLocator = PNRLocator;
           this.customContent = customContent;
           this.passengerEmails = passengerEmails;
    }


    /**
     * Gets the storeFare value for this BookingRequest.
     * 
     * @return storeFare
     */
    public boolean isStoreFare() {
        return storeFare;
    }


    /**
     * Sets the storeFare value for this BookingRequest.
     * 
     * @param storeFare
     */
    public void setStoreFare(boolean storeFare) {
        this.storeFare = storeFare;
    }


    /**
     * Gets the department value for this BookingRequest.
     * 
     * @return department
     */
    public java.lang.String getDepartment() {
        return department;
    }


    /**
     * Sets the department value for this BookingRequest.
     * 
     * @param department
     */
    public void setDepartment(java.lang.String department) {
        this.department = department;
    }


    /**
     * Gets the deleteStoredFare value for this BookingRequest.
     * 
     * @return deleteStoredFare
     */
    public boolean isDeleteStoredFare() {
        return deleteStoredFare;
    }


    /**
     * Sets the deleteStoredFare value for this BookingRequest.
     * 
     * @param deleteStoredFare
     */
    public void setDeleteStoredFare(boolean deleteStoredFare) {
        this.deleteStoredFare = deleteStoredFare;
    }


    /**
     * Gets the loggingID value for this BookingRequest.
     * 
     * @return loggingID
     */
    public java.lang.String getLoggingID() {
        return loggingID;
    }


    /**
     * Sets the loggingID value for this BookingRequest.
     * 
     * @param loggingID
     */
    public void setLoggingID(java.lang.String loggingID) {
        this.loggingID = loggingID;
    }


    /**
     * Gets the addAccounting value for this BookingRequest.
     * 
     * @return addAccounting
     */
    public boolean isAddAccounting() {
        return addAccounting;
    }


    /**
     * Sets the addAccounting value for this BookingRequest.
     * 
     * @param addAccounting
     */
    public void setAddAccounting(boolean addAccounting) {
        this.addAccounting = addAccounting;
    }


    /**
     * Gets the bookingType value for this BookingRequest.
     * 
     * @return bookingType
     */
    public java.lang.String getBookingType() {
        return bookingType;
    }


    /**
     * Sets the bookingType value for this BookingRequest.
     * 
     * @param bookingType
     */
    public void setBookingType(java.lang.String bookingType) {
        this.bookingType = bookingType;
    }


    /**
     * Gets the fareType value for this BookingRequest.
     * 
     * @return fareType
     */
    public java.lang.String[] getFareType() {
        return fareType;
    }


    /**
     * Sets the fareType value for this BookingRequest.
     * 
     * @param fareType
     */
    public void setFareType(java.lang.String[] fareType) {
        this.fareType = fareType;
    }


    /**
     * Gets the totalQuoted value for this BookingRequest.
     * 
     * @return totalQuoted
     */
    public float getTotalQuoted() {
        return totalQuoted;
    }


    /**
     * Sets the totalQuoted value for this BookingRequest.
     * 
     * @param totalQuoted
     */
    public void setTotalQuoted(float totalQuoted) {
        this.totalQuoted = totalQuoted;
    }


    /**
     * Gets the externalMarkup value for this BookingRequest.
     * 
     * @return externalMarkup
     */
    public float getExternalMarkup() {
        return externalMarkup;
    }


    /**
     * Sets the externalMarkup value for this BookingRequest.
     * 
     * @param externalMarkup
     */
    public void setExternalMarkup(float externalMarkup) {
        this.externalMarkup = externalMarkup;
    }


    /**
     * Gets the writePPLine value for this BookingRequest.
     * 
     * @return writePPLine
     */
    public boolean isWritePPLine() {
        return writePPLine;
    }


    /**
     * Sets the writePPLine value for this BookingRequest.
     * 
     * @param writePPLine
     */
    public void setWritePPLine(boolean writePPLine) {
        this.writePPLine = writePPLine;
    }


    /**
     * Gets the seatRequest value for this BookingRequest.
     * 
     * @return seatRequest
     */
    public com.rightrez.GenericSeatRequest getSeatRequest() {
        return seatRequest;
    }


    /**
     * Sets the seatRequest value for this BookingRequest.
     * 
     * @param seatRequest
     */
    public void setSeatRequest(com.rightrez.GenericSeatRequest seatRequest) {
        this.seatRequest = seatRequest;
    }


    /**
     * Gets the flightPairing value for this BookingRequest.
     * 
     * @return flightPairing
     */
    public com.rightrez.FlightPairing getFlightPairing() {
        return flightPairing;
    }


    /**
     * Sets the flightPairing value for this BookingRequest.
     * 
     * @param flightPairing
     */
    public void setFlightPairing(com.rightrez.FlightPairing flightPairing) {
        this.flightPairing = flightPairing;
    }


    /**
     * Gets the queues value for this BookingRequest.
     * 
     * @return queues
     */
    public com.rightrez.CRSQueue[] getQueues() {
        return queues;
    }


    /**
     * Sets the queues value for this BookingRequest.
     * 
     * @param queues
     */
    public void setQueues(com.rightrez.CRSQueue[] queues) {
        this.queues = queues;
    }


    /**
     * Gets the clientID value for this BookingRequest.
     * 
     * @return clientID
     */
    public java.lang.String getClientID() {
        return clientID;
    }


    /**
     * Sets the clientID value for this BookingRequest.
     * 
     * @param clientID
     */
    public void setClientID(java.lang.String clientID) {
        this.clientID = clientID;
    }


    /**
     * Gets the userID value for this BookingRequest.
     * 
     * @return userID
     */
    public java.lang.String getUserID() {
        return userID;
    }


    /**
     * Sets the userID value for this BookingRequest.
     * 
     * @param userID
     */
    public void setUserID(java.lang.String userID) {
        this.userID = userID;
    }


    /**
     * Gets the nameCommands value for this BookingRequest.
     * 
     * @return nameCommands
     */
    public java.lang.String[] getNameCommands() {
        return nameCommands;
    }


    /**
     * Sets the nameCommands value for this BookingRequest.
     * 
     * @param nameCommands
     */
    public void setNameCommands(java.lang.String[] nameCommands) {
        this.nameCommands = nameCommands;
    }


    /**
     * Gets the addlCommands value for this BookingRequest.
     * 
     * @return addlCommands
     */
    public java.lang.String[] getAddlCommands() {
        return addlCommands;
    }


    /**
     * Sets the addlCommands value for this BookingRequest.
     * 
     * @param addlCommands
     */
    public void setAddlCommands(java.lang.String[] addlCommands) {
        this.addlCommands = addlCommands;
    }


    /**
     * Gets the allowPlaceholder value for this BookingRequest.
     * 
     * @return allowPlaceholder
     */
    public boolean isAllowPlaceholder() {
        return allowPlaceholder;
    }


    /**
     * Sets the allowPlaceholder value for this BookingRequest.
     * 
     * @param allowPlaceholder
     */
    public void setAllowPlaceholder(boolean allowPlaceholder) {
        this.allowPlaceholder = allowPlaceholder;
    }


    /**
     * Gets the names value for this BookingRequest.
     * 
     * @return names
     */
    public com.rightrez.RRZName[] getNames() {
        return names;
    }


    /**
     * Sets the names value for this BookingRequest.
     * 
     * @param names
     */
    public void setNames(com.rightrez.RRZName[] names) {
        this.names = names;
    }


    /**
     * Gets the components value for this BookingRequest.
     * 
     * @return components
     */
    public com.rightrez.BookingRequestComponent[] getComponents() {
        return components;
    }


    /**
     * Sets the components value for this BookingRequest.
     * 
     * @param components
     */
    public void setComponents(com.rightrez.BookingRequestComponent[] components) {
        this.components = components;
    }


    /**
     * Gets the PNRLocator value for this BookingRequest.
     * 
     * @return PNRLocator
     */
    public java.lang.String getPNRLocator() {
        return PNRLocator;
    }


    /**
     * Sets the PNRLocator value for this BookingRequest.
     * 
     * @param PNRLocator
     */
    public void setPNRLocator(java.lang.String PNRLocator) {
        this.PNRLocator = PNRLocator;
    }


    /**
     * Gets the customContent value for this BookingRequest.
     * 
     * @return customContent
     */
    public com.rightrez.SerializableKeyValuePairOfStringString[] getCustomContent() {
        return customContent;
    }


    /**
     * Sets the customContent value for this BookingRequest.
     * 
     * @param customContent
     */
    public void setCustomContent(com.rightrez.SerializableKeyValuePairOfStringString[] customContent) {
        this.customContent = customContent;
    }


    /**
     * Gets the passengerEmails value for this BookingRequest.
     * 
     * @return passengerEmails
     */
    public com.rightrez.PnrEmail[] getPassengerEmails() {
        return passengerEmails;
    }


    /**
     * Sets the passengerEmails value for this BookingRequest.
     * 
     * @param passengerEmails
     */
    public void setPassengerEmails(com.rightrez.PnrEmail[] passengerEmails) {
        this.passengerEmails = passengerEmails;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookingRequest)) return false;
        BookingRequest other = (BookingRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.storeFare == other.isStoreFare() &&
            ((this.department==null && other.getDepartment()==null) || 
             (this.department!=null &&
              this.department.equals(other.getDepartment()))) &&
            this.deleteStoredFare == other.isDeleteStoredFare() &&
            ((this.loggingID==null && other.getLoggingID()==null) || 
             (this.loggingID!=null &&
              this.loggingID.equals(other.getLoggingID()))) &&
            this.addAccounting == other.isAddAccounting() &&
            ((this.bookingType==null && other.getBookingType()==null) || 
             (this.bookingType!=null &&
              this.bookingType.equals(other.getBookingType()))) &&
            ((this.fareType==null && other.getFareType()==null) || 
             (this.fareType!=null &&
              java.util.Arrays.equals(this.fareType, other.getFareType()))) &&
            this.totalQuoted == other.getTotalQuoted() &&
            this.externalMarkup == other.getExternalMarkup() &&
            this.writePPLine == other.isWritePPLine() &&
            ((this.seatRequest==null && other.getSeatRequest()==null) || 
             (this.seatRequest!=null &&
              this.seatRequest.equals(other.getSeatRequest()))) &&
            ((this.flightPairing==null && other.getFlightPairing()==null) || 
             (this.flightPairing!=null &&
              this.flightPairing.equals(other.getFlightPairing()))) &&
            ((this.queues==null && other.getQueues()==null) || 
             (this.queues!=null &&
              java.util.Arrays.equals(this.queues, other.getQueues()))) &&
            ((this.clientID==null && other.getClientID()==null) || 
             (this.clientID!=null &&
              this.clientID.equals(other.getClientID()))) &&
            ((this.userID==null && other.getUserID()==null) || 
             (this.userID!=null &&
              this.userID.equals(other.getUserID()))) &&
            ((this.nameCommands==null && other.getNameCommands()==null) || 
             (this.nameCommands!=null &&
              java.util.Arrays.equals(this.nameCommands, other.getNameCommands()))) &&
            ((this.addlCommands==null && other.getAddlCommands()==null) || 
             (this.addlCommands!=null &&
              java.util.Arrays.equals(this.addlCommands, other.getAddlCommands()))) &&
            this.allowPlaceholder == other.isAllowPlaceholder() &&
            ((this.names==null && other.getNames()==null) || 
             (this.names!=null &&
              java.util.Arrays.equals(this.names, other.getNames()))) &&
            ((this.components==null && other.getComponents()==null) || 
             (this.components!=null &&
              java.util.Arrays.equals(this.components, other.getComponents()))) &&
            ((this.PNRLocator==null && other.getPNRLocator()==null) || 
             (this.PNRLocator!=null &&
              this.PNRLocator.equals(other.getPNRLocator()))) &&
            ((this.customContent==null && other.getCustomContent()==null) || 
             (this.customContent!=null &&
              java.util.Arrays.equals(this.customContent, other.getCustomContent()))) &&
            ((this.passengerEmails==null && other.getPassengerEmails()==null) || 
             (this.passengerEmails!=null &&
              java.util.Arrays.equals(this.passengerEmails, other.getPassengerEmails())));
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
        _hashCode += (isStoreFare() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getDepartment() != null) {
            _hashCode += getDepartment().hashCode();
        }
        _hashCode += (isDeleteStoredFare() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getLoggingID() != null) {
            _hashCode += getLoggingID().hashCode();
        }
        _hashCode += (isAddAccounting() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBookingType() != null) {
            _hashCode += getBookingType().hashCode();
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
        _hashCode += new Float(getTotalQuoted()).hashCode();
        _hashCode += new Float(getExternalMarkup()).hashCode();
        _hashCode += (isWritePPLine() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getSeatRequest() != null) {
            _hashCode += getSeatRequest().hashCode();
        }
        if (getFlightPairing() != null) {
            _hashCode += getFlightPairing().hashCode();
        }
        if (getQueues() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getQueues());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getQueues(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getClientID() != null) {
            _hashCode += getClientID().hashCode();
        }
        if (getUserID() != null) {
            _hashCode += getUserID().hashCode();
        }
        if (getNameCommands() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNameCommands());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNameCommands(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getAddlCommands() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getAddlCommands());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getAddlCommands(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isAllowPlaceholder() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNames() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getNames());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getNames(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getComponents(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getPNRLocator() != null) {
            _hashCode += getPNRLocator().hashCode();
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
        if (getPassengerEmails() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPassengerEmails());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getPassengerEmails(), i);
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
        new org.apache.axis.description.TypeDesc(BookingRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "BookingRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("storeFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "StoreFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Department"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteStoredFare");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DeleteStoredFare"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loggingID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "LoggingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addAccounting");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AddAccounting"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BookingType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("totalQuoted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TotalQuoted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("externalMarkup");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ExternalMarkup"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "float"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("writePPLine");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "WritePPLine"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seatRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "SeatRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "GenericSeatRequest"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightPairing");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FlightPairing"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightPairing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("queues");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Queues"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "CRSQueue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "CRSQueue"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clientID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ClientID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("userID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "UserID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nameCommands");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "NameCommands"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addlCommands");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AddlCommands"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowPlaceholder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AllowPlaceholder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("names");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Names"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RRZName"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "RRZName"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("components");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Components"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "BookingRequestComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "BookingRequestComponent"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PNRLocator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PNRLocator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CustomContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfStringString"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfStringString"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passengerEmails");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PassengerEmails"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "PnrEmail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "PnrEmail"));
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
