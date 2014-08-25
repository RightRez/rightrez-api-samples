/**
 * Seat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class Seat  implements java.io.Serializable {
    private org.apache.axis.types.UnsignedShort column;

    private int rowNum;

    private boolean nonsmoking;

    private boolean aisle;

    private boolean window;

    private boolean restricted;

    private boolean inExitRow;

    private boolean handicap;

    private boolean bulkHead;

    private boolean upperDeck;

    private boolean premium;

    private com.rightrez.SEAT_STATUS status;

    public Seat() {
    }

    public Seat(
           org.apache.axis.types.UnsignedShort column,
           int rowNum,
           boolean nonsmoking,
           boolean aisle,
           boolean window,
           boolean restricted,
           boolean inExitRow,
           boolean handicap,
           boolean bulkHead,
           boolean upperDeck,
           boolean premium,
           com.rightrez.SEAT_STATUS status) {
           this.column = column;
           this.rowNum = rowNum;
           this.nonsmoking = nonsmoking;
           this.aisle = aisle;
           this.window = window;
           this.restricted = restricted;
           this.inExitRow = inExitRow;
           this.handicap = handicap;
           this.bulkHead = bulkHead;
           this.upperDeck = upperDeck;
           this.premium = premium;
           this.status = status;
    }


    /**
     * Gets the column value for this Seat.
     * 
     * @return column
     */
    public org.apache.axis.types.UnsignedShort getColumn() {
        return column;
    }


    /**
     * Sets the column value for this Seat.
     * 
     * @param column
     */
    public void setColumn(org.apache.axis.types.UnsignedShort column) {
        this.column = column;
    }


    /**
     * Gets the rowNum value for this Seat.
     * 
     * @return rowNum
     */
    public int getRowNum() {
        return rowNum;
    }


    /**
     * Sets the rowNum value for this Seat.
     * 
     * @param rowNum
     */
    public void setRowNum(int rowNum) {
        this.rowNum = rowNum;
    }


    /**
     * Gets the nonsmoking value for this Seat.
     * 
     * @return nonsmoking
     */
    public boolean isNonsmoking() {
        return nonsmoking;
    }


    /**
     * Sets the nonsmoking value for this Seat.
     * 
     * @param nonsmoking
     */
    public void setNonsmoking(boolean nonsmoking) {
        this.nonsmoking = nonsmoking;
    }


    /**
     * Gets the aisle value for this Seat.
     * 
     * @return aisle
     */
    public boolean isAisle() {
        return aisle;
    }


    /**
     * Sets the aisle value for this Seat.
     * 
     * @param aisle
     */
    public void setAisle(boolean aisle) {
        this.aisle = aisle;
    }


    /**
     * Gets the window value for this Seat.
     * 
     * @return window
     */
    public boolean isWindow() {
        return window;
    }


    /**
     * Sets the window value for this Seat.
     * 
     * @param window
     */
    public void setWindow(boolean window) {
        this.window = window;
    }


    /**
     * Gets the restricted value for this Seat.
     * 
     * @return restricted
     */
    public boolean isRestricted() {
        return restricted;
    }


    /**
     * Sets the restricted value for this Seat.
     * 
     * @param restricted
     */
    public void setRestricted(boolean restricted) {
        this.restricted = restricted;
    }


    /**
     * Gets the inExitRow value for this Seat.
     * 
     * @return inExitRow
     */
    public boolean isInExitRow() {
        return inExitRow;
    }


    /**
     * Sets the inExitRow value for this Seat.
     * 
     * @param inExitRow
     */
    public void setInExitRow(boolean inExitRow) {
        this.inExitRow = inExitRow;
    }


    /**
     * Gets the handicap value for this Seat.
     * 
     * @return handicap
     */
    public boolean isHandicap() {
        return handicap;
    }


    /**
     * Sets the handicap value for this Seat.
     * 
     * @param handicap
     */
    public void setHandicap(boolean handicap) {
        this.handicap = handicap;
    }


    /**
     * Gets the bulkHead value for this Seat.
     * 
     * @return bulkHead
     */
    public boolean isBulkHead() {
        return bulkHead;
    }


    /**
     * Sets the bulkHead value for this Seat.
     * 
     * @param bulkHead
     */
    public void setBulkHead(boolean bulkHead) {
        this.bulkHead = bulkHead;
    }


    /**
     * Gets the upperDeck value for this Seat.
     * 
     * @return upperDeck
     */
    public boolean isUpperDeck() {
        return upperDeck;
    }


    /**
     * Sets the upperDeck value for this Seat.
     * 
     * @param upperDeck
     */
    public void setUpperDeck(boolean upperDeck) {
        this.upperDeck = upperDeck;
    }


    /**
     * Gets the premium value for this Seat.
     * 
     * @return premium
     */
    public boolean isPremium() {
        return premium;
    }


    /**
     * Sets the premium value for this Seat.
     * 
     * @param premium
     */
    public void setPremium(boolean premium) {
        this.premium = premium;
    }


    /**
     * Gets the status value for this Seat.
     * 
     * @return status
     */
    public com.rightrez.SEAT_STATUS getStatus() {
        return status;
    }


    /**
     * Sets the status value for this Seat.
     * 
     * @param status
     */
    public void setStatus(com.rightrez.SEAT_STATUS status) {
        this.status = status;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Seat)) return false;
        Seat other = (Seat) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.column==null && other.getColumn()==null) || 
             (this.column!=null &&
              this.column.equals(other.getColumn()))) &&
            this.rowNum == other.getRowNum() &&
            this.nonsmoking == other.isNonsmoking() &&
            this.aisle == other.isAisle() &&
            this.window == other.isWindow() &&
            this.restricted == other.isRestricted() &&
            this.inExitRow == other.isInExitRow() &&
            this.handicap == other.isHandicap() &&
            this.bulkHead == other.isBulkHead() &&
            this.upperDeck == other.isUpperDeck() &&
            this.premium == other.isPremium() &&
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus())));
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
        if (getColumn() != null) {
            _hashCode += getColumn().hashCode();
        }
        _hashCode += getRowNum();
        _hashCode += (isNonsmoking() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAisle() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isWindow() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isRestricted() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isInExitRow() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isHandicap() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isBulkHead() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUpperDeck() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isPremium() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Seat.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "Seat"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("column");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Column"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rowNum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "RowNum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonsmoking");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Nonsmoking"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aisle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Aisle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("window");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Window"));
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
        elemField.setFieldName("inExitRow");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "InExitRow"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("handicap");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Handicap"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bulkHead");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BulkHead"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "SEAT_STATUS"));
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
