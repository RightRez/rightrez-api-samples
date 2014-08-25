/**
 * RRZName.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class RRZName  extends com.rightrez.RawPassengerName  implements java.io.Serializable {
    private com.rightrez.CustomContent[] customContent;

    private java.lang.String bookingNumber;

    private int bookingSequence;

    private com.rightrez.MoneyAmount bookedCost;

    private com.rightrez.GenericSeatRequest seatRequest;

    private boolean wheelchair;

    private com.rightrez.PassportInfo passport;

    private java.lang.String title;

    private java.lang.String mealRequest;

    private com.rightrez.SerializableKeyValuePairOfServiceLevelMoneyAmount[] budgetedCosts;

    private com.rightrez.RRZTicket[] tickets;

    private com.rightrez.RRZSeat[] seats;

    private com.rightrez.FrequentFlyerInfo[] frequentFlyerNumbers;

    public RRZName() {
    }

    public RRZName(
           com.rightrez.PassengerAccountingItem passengerAccountingInfo,
           int passengerNumber,
           int groupNumber,
           boolean isInfant,
           boolean isGroupName,
           java.lang.String lastName,
           java.lang.String firstName,
           java.lang.String remark,
           java.lang.String groupID,
           int infantMonths,
           java.lang.String referenceNumber,
           java.lang.String passengerType,
           int lastNameNumber,
           int firstNameNumber,
           java.lang.String accountingCode,
           com.rightrez.CustomContent[] customContent,
           java.lang.String bookingNumber,
           int bookingSequence,
           com.rightrez.MoneyAmount bookedCost,
           com.rightrez.GenericSeatRequest seatRequest,
           boolean wheelchair,
           com.rightrez.PassportInfo passport,
           java.lang.String title,
           java.lang.String mealRequest,
           com.rightrez.SerializableKeyValuePairOfServiceLevelMoneyAmount[] budgetedCosts,
           com.rightrez.RRZTicket[] tickets,
           com.rightrez.RRZSeat[] seats,
           com.rightrez.FrequentFlyerInfo[] frequentFlyerNumbers) {
        super(
            passengerAccountingInfo,
            passengerNumber,
            groupNumber,
            isInfant,
            isGroupName,
            lastName,
            firstName,
            remark,
            groupID,
            infantMonths,
            referenceNumber,
            passengerType,
            lastNameNumber,
            firstNameNumber,
            accountingCode);
        this.customContent = customContent;
        this.bookingNumber = bookingNumber;
        this.bookingSequence = bookingSequence;
        this.bookedCost = bookedCost;
        this.seatRequest = seatRequest;
        this.wheelchair = wheelchair;
        this.passport = passport;
        this.title = title;
        this.mealRequest = mealRequest;
        this.budgetedCosts = budgetedCosts;
        this.tickets = tickets;
        this.seats = seats;
        this.frequentFlyerNumbers = frequentFlyerNumbers;
    }


    /**
     * Gets the customContent value for this RRZName.
     * 
     * @return customContent
     */
    public com.rightrez.CustomContent[] getCustomContent() {
        return customContent;
    }


    /**
     * Sets the customContent value for this RRZName.
     * 
     * @param customContent
     */
    public void setCustomContent(com.rightrez.CustomContent[] customContent) {
        this.customContent = customContent;
    }


    /**
     * Gets the bookingNumber value for this RRZName.
     * 
     * @return bookingNumber
     */
    public java.lang.String getBookingNumber() {
        return bookingNumber;
    }


    /**
     * Sets the bookingNumber value for this RRZName.
     * 
     * @param bookingNumber
     */
    public void setBookingNumber(java.lang.String bookingNumber) {
        this.bookingNumber = bookingNumber;
    }


    /**
     * Gets the bookingSequence value for this RRZName.
     * 
     * @return bookingSequence
     */
    public int getBookingSequence() {
        return bookingSequence;
    }


    /**
     * Sets the bookingSequence value for this RRZName.
     * 
     * @param bookingSequence
     */
    public void setBookingSequence(int bookingSequence) {
        this.bookingSequence = bookingSequence;
    }


    /**
     * Gets the bookedCost value for this RRZName.
     * 
     * @return bookedCost
     */
    public com.rightrez.MoneyAmount getBookedCost() {
        return bookedCost;
    }


    /**
     * Sets the bookedCost value for this RRZName.
     * 
     * @param bookedCost
     */
    public void setBookedCost(com.rightrez.MoneyAmount bookedCost) {
        this.bookedCost = bookedCost;
    }


    /**
     * Gets the seatRequest value for this RRZName.
     * 
     * @return seatRequest
     */
    public com.rightrez.GenericSeatRequest getSeatRequest() {
        return seatRequest;
    }


    /**
     * Sets the seatRequest value for this RRZName.
     * 
     * @param seatRequest
     */
    public void setSeatRequest(com.rightrez.GenericSeatRequest seatRequest) {
        this.seatRequest = seatRequest;
    }


    /**
     * Gets the wheelchair value for this RRZName.
     * 
     * @return wheelchair
     */
    public boolean isWheelchair() {
        return wheelchair;
    }


    /**
     * Sets the wheelchair value for this RRZName.
     * 
     * @param wheelchair
     */
    public void setWheelchair(boolean wheelchair) {
        this.wheelchair = wheelchair;
    }


    /**
     * Gets the passport value for this RRZName.
     * 
     * @return passport
     */
    public com.rightrez.PassportInfo getPassport() {
        return passport;
    }


    /**
     * Sets the passport value for this RRZName.
     * 
     * @param passport
     */
    public void setPassport(com.rightrez.PassportInfo passport) {
        this.passport = passport;
    }


    /**
     * Gets the title value for this RRZName.
     * 
     * @return title
     */
    public java.lang.String getTitle() {
        return title;
    }


    /**
     * Sets the title value for this RRZName.
     * 
     * @param title
     */
    public void setTitle(java.lang.String title) {
        this.title = title;
    }


    /**
     * Gets the mealRequest value for this RRZName.
     * 
     * @return mealRequest
     */
    public java.lang.String getMealRequest() {
        return mealRequest;
    }


    /**
     * Sets the mealRequest value for this RRZName.
     * 
     * @param mealRequest
     */
    public void setMealRequest(java.lang.String mealRequest) {
        this.mealRequest = mealRequest;
    }


    /**
     * Gets the budgetedCosts value for this RRZName.
     * 
     * @return budgetedCosts
     */
    public com.rightrez.SerializableKeyValuePairOfServiceLevelMoneyAmount[] getBudgetedCosts() {
        return budgetedCosts;
    }


    /**
     * Sets the budgetedCosts value for this RRZName.
     * 
     * @param budgetedCosts
     */
    public void setBudgetedCosts(com.rightrez.SerializableKeyValuePairOfServiceLevelMoneyAmount[] budgetedCosts) {
        this.budgetedCosts = budgetedCosts;
    }


    /**
     * Gets the tickets value for this RRZName.
     * 
     * @return tickets
     */
    public com.rightrez.RRZTicket[] getTickets() {
        return tickets;
    }


    /**
     * Sets the tickets value for this RRZName.
     * 
     * @param tickets
     */
    public void setTickets(com.rightrez.RRZTicket[] tickets) {
        this.tickets = tickets;
    }


    /**
     * Gets the seats value for this RRZName.
     * 
     * @return seats
     */
    public com.rightrez.RRZSeat[] getSeats() {
        return seats;
    }


    /**
     * Sets the seats value for this RRZName.
     * 
     * @param seats
     */
    public void setSeats(com.rightrez.RRZSeat[] seats) {
        this.seats = seats;
    }


    /**
     * Gets the frequentFlyerNumbers value for this RRZName.
     * 
     * @return frequentFlyerNumbers
     */
    public com.rightrez.FrequentFlyerInfo[] getFrequentFlyerNumbers() {
        return frequentFlyerNumbers;
    }


    /**
     * Sets the frequentFlyerNumbers value for this RRZName.
     * 
     * @param frequentFlyerNumbers
     */
    public void setFrequentFlyerNumbers(com.rightrez.FrequentFlyerInfo[] frequentFlyerNumbers) {
        this.frequentFlyerNumbers = frequentFlyerNumbers;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RRZName)) return false;
        RRZName other = (RRZName) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.customContent==null && other.getCustomContent()==null) || 
             (this.customContent!=null &&
              java.util.Arrays.equals(this.customContent, other.getCustomContent()))) &&
            ((this.bookingNumber==null && other.getBookingNumber()==null) || 
             (this.bookingNumber!=null &&
              this.bookingNumber.equals(other.getBookingNumber()))) &&
            this.bookingSequence == other.getBookingSequence() &&
            ((this.bookedCost==null && other.getBookedCost()==null) || 
             (this.bookedCost!=null &&
              this.bookedCost.equals(other.getBookedCost()))) &&
            ((this.seatRequest==null && other.getSeatRequest()==null) || 
             (this.seatRequest!=null &&
              this.seatRequest.equals(other.getSeatRequest()))) &&
            this.wheelchair == other.isWheelchair() &&
            ((this.passport==null && other.getPassport()==null) || 
             (this.passport!=null &&
              this.passport.equals(other.getPassport()))) &&
            ((this.title==null && other.getTitle()==null) || 
             (this.title!=null &&
              this.title.equals(other.getTitle()))) &&
            ((this.mealRequest==null && other.getMealRequest()==null) || 
             (this.mealRequest!=null &&
              this.mealRequest.equals(other.getMealRequest()))) &&
            ((this.budgetedCosts==null && other.getBudgetedCosts()==null) || 
             (this.budgetedCosts!=null &&
              java.util.Arrays.equals(this.budgetedCosts, other.getBudgetedCosts()))) &&
            ((this.tickets==null && other.getTickets()==null) || 
             (this.tickets!=null &&
              java.util.Arrays.equals(this.tickets, other.getTickets()))) &&
            ((this.seats==null && other.getSeats()==null) || 
             (this.seats!=null &&
              java.util.Arrays.equals(this.seats, other.getSeats()))) &&
            ((this.frequentFlyerNumbers==null && other.getFrequentFlyerNumbers()==null) || 
             (this.frequentFlyerNumbers!=null &&
              java.util.Arrays.equals(this.frequentFlyerNumbers, other.getFrequentFlyerNumbers())));
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
        if (getBookingNumber() != null) {
            _hashCode += getBookingNumber().hashCode();
        }
        _hashCode += getBookingSequence();
        if (getBookedCost() != null) {
            _hashCode += getBookedCost().hashCode();
        }
        if (getSeatRequest() != null) {
            _hashCode += getSeatRequest().hashCode();
        }
        _hashCode += (isWheelchair() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getPassport() != null) {
            _hashCode += getPassport().hashCode();
        }
        if (getTitle() != null) {
            _hashCode += getTitle().hashCode();
        }
        if (getMealRequest() != null) {
            _hashCode += getMealRequest().hashCode();
        }
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
        if (getSeats() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSeats());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSeats(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFrequentFlyerNumbers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFrequentFlyerNumbers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFrequentFlyerNumbers(), i);
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
        new org.apache.axis.description.TypeDesc(RRZName.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RRZName"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customContent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CustomContent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "CustomContent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "CustomContent"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BookingNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookingSequence");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BookingSequence"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BookedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seatRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "SeatRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "GenericSeatRequest"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wheelchair");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Wheelchair"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("passport");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Passport"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "PassportInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Title"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mealRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "MealRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tickets");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Tickets"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RRZTicket"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "RRZTicket"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Seats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RRZSeat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "RRZSeat"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("frequentFlyerNumbers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FrequentFlyerNumbers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FrequentFlyerInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "FrequentFlyerInfo"));
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
