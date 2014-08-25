/**
 * SeatRow.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class SeatRow  implements java.io.Serializable {
    private int rowNum;

    private boolean exitRow;

    private boolean bulkhead;

    private boolean wingRow;

    private boolean preferential;

    private boolean restricted;

    private boolean upperDeck;

    private boolean premium;

    private com.rightrez.Seat[] seats;

    public SeatRow() {
    }

    public SeatRow(
           int rowNum,
           boolean exitRow,
           boolean bulkhead,
           boolean wingRow,
           boolean preferential,
           boolean restricted,
           boolean upperDeck,
           boolean premium,
           com.rightrez.Seat[] seats) {
           this.rowNum = rowNum;
           this.exitRow = exitRow;
           this.bulkhead = bulkhead;
           this.wingRow = wingRow;
           this.preferential = preferential;
           this.restricted = restricted;
           this.upperDeck = upperDeck;
           this.premium = premium;
           this.seats = seats;
    }


    /**
     * Gets the rowNum value for this SeatRow.
     * 
     * @return rowNum
     */
    public int getRowNum() {
        return rowNum;
    }


    /**
     * Sets the rowNum value for this SeatRow.
     * 
     * @param rowNum
     */
    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }


    /**
     * Gets the exitRow value for this SeatRow.
     * 
     * @return exitRow
     */
    public boolean isExitRow() {
        return exitRow;
    }


    /**
     * Sets the exitRow value for this SeatRow.
     * 
     * @param exitRow
     */
    public void setExitRow(boolean exitRow) {
        this.exitRow = exitRow;
    }


    /**
     * Gets the bulkhead value for this SeatRow.
     * 
     * @return bulkhead
     */
    public boolean isBulkhead() {
        return bulkhead;
    }


    /**
     * Sets the bulkhead value for this SeatRow.
     * 
     * @param bulkhead
     */
    public void setBulkhead(boolean bulkhead) {
        this.bulkhead = bulkhead;
    }


    /**
     * Gets the wingRow value for this SeatRow.
     * 
     * @return wingRow
     */
    public boolean isWingRow() {
        return wingRow;
    }


    /**
     * Sets the wingRow value for this SeatRow.
     * 
     * @param wingRow
     */
    public void setWingRow(boolean wingRow) {
        this.wingRow = wingRow;
    }


    /**
     * Gets the preferential value for this SeatRow.
     * 
     * @return preferential
     */
    public boolean isPreferential() {
        return preferential;
    }


    /**
     * Sets the preferential value for this SeatRow.
     * 
     * @param preferential
     */
    public void setPreferential(boolean preferential) {
        this.preferential = preferential;
    }


    /**
     * Gets the restricted value for this SeatRow.
     * 
     * @return restricted
     */
    public boolean isRestricted() {
        return restricted;
    }


    /**
     * Sets the restricted value for this SeatRow.
     * 
     * @param restricted
     */
    public void setRestricted(boolean restricted) {
        this.restricted = restricted;
    }


    /**
     * Gets the upperDeck value for this SeatRow.
     * 
     * @return upperDeck
     */
    public boolean isUpperDeck() {
        return upperDeck;
    }


    /**
     * Sets the upperDeck value for this SeatRow.
     * 
     * @param upperDeck
     */
    public void setUpperDeck(boolean upperDeck) {
        this.upperDeck = upperDeck;
    }


    /**
     * Gets the premium value for this SeatRow.
     * 
     * @return premium
     */
    public boolean isPremium() {
        return premium;
    }


    /**
     * Sets the premium value for this SeatRow.
     * 
     * @param premium
     */
    public void setPremium(boolean premium) {
        this.premium = premium;
    }


    /**
     * Gets the seats value for this SeatRow.
     * 
     * @return seats
     */
    public com.rightrez.Seat[] getSeats() {
        return seats;
    }


    /**
     * Sets the seats value for this SeatRow.
     * 
     * @param seats
     */
    public void setSeats(com.rightrez.Seat[] seats) {
        this.seats = seats;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeatRow)) return false;
        SeatRow other = (SeatRow) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.rowNum == other.getRowNum() &&
            this.exitRow == other.isExitRow() &&
            this.bulkhead == other.isBulkhead() &&
            this.wingRow == other.isWingRow() &&
            this.preferential == other.isPreferential() &&
            this.restricted == other.isRestricted() &&
            this.upperDeck == other.isUpperDeck() &&
            this.premium == other.isPremium() &&
            ((this.seats==null && other.getSeats()==null) || 
             (this.seats!=null &&
              java.util.Arrays.equals(this.seats, other.getSeats())));
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
        _hashCode += getRowNum();
        _hashCode += (isExitRow() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBulkhead() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isWingRow() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPreferential() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRestricted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUpperDeck() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPremium() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeatRow.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "SeatRow"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "RowNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exitRow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ExitRow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkhead");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Bulkhead"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("wingRow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "WingRow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("preferential");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Preferential"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restricted");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Restricted"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("upperDeck");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "UpperDeck"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("premium");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Premium"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("seats");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Seats"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "Seat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "Seat"));
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
