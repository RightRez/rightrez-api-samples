/**
 * SeatMap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class SeatMap  implements java.io.Serializable {
    private com.rightrez.MAP_TYPE mapType;

    private com.rightrez.SeatRow[] rows;

    private org.apache.axis.types.UnsignedShort[] columns;

    private java.lang.String rawResponse;

    public SeatMap() {
    }

    public SeatMap(
           com.rightrez.MAP_TYPE mapType,
           com.rightrez.SeatRow[] rows,
           org.apache.axis.types.UnsignedShort[] columns,
           java.lang.String rawResponse) {
           this.mapType = mapType;
           this.rows = rows;
           this.columns = columns;
           this.rawResponse = rawResponse;
    }


    /**
     * Gets the mapType value for this SeatMap.
     * 
     * @return mapType
     */
    public com.rightrez.MAP_TYPE getMapType() {
        return mapType;
    }


    /**
     * Sets the mapType value for this SeatMap.
     * 
     * @param mapType
     */
    public void setMapType(com.rightrez.MAP_TYPE mapType) {
        this.mapType = mapType;
    }


    /**
     * Gets the rows value for this SeatMap.
     * 
     * @return rows
     */
    public com.rightrez.SeatRow[] getRows() {
        return rows;
    }


    /**
     * Sets the rows value for this SeatMap.
     * 
     * @param rows
     */
    public void setRows(com.rightrez.SeatRow[] rows) {
        this.rows = rows;
    }


    /**
     * Gets the columns value for this SeatMap.
     * 
     * @return columns
     */
    public org.apache.axis.types.UnsignedShort[] getColumns() {
        return columns;
    }


    /**
     * Sets the columns value for this SeatMap.
     * 
     * @param columns
     */
    public void setColumns(org.apache.axis.types.UnsignedShort[] columns) {
        this.columns = columns;
    }


    /**
     * Gets the rawResponse value for this SeatMap.
     * 
     * @return rawResponse
     */
    public java.lang.String getRawResponse() {
        return rawResponse;
    }


    /**
     * Sets the rawResponse value for this SeatMap.
     * 
     * @param rawResponse
     */
    public void setRawResponse(java.lang.String rawResponse) {
        this.rawResponse = rawResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof SeatMap)) return false;
        SeatMap other = (SeatMap) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.mapType==null && other.getMapType()==null) || 
             (this.mapType!=null &&
              this.mapType.equals(other.getMapType()))) &&
            ((this.rows==null && other.getRows()==null) || 
             (this.rows!=null &&
              java.util.Arrays.equals(this.rows, other.getRows()))) &&
            ((this.columns==null && other.getColumns()==null) || 
             (this.columns!=null &&
              java.util.Arrays.equals(this.columns, other.getColumns()))) &&
            ((this.rawResponse==null && other.getRawResponse()==null) || 
             (this.rawResponse!=null &&
              this.rawResponse.equals(other.getRawResponse())));
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
        if (getMapType() != null) {
            _hashCode += getMapType().hashCode();
        }
        if (getRows() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getRows());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getRows(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getColumns() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getColumns());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getColumns(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRawResponse() != null) {
            _hashCode += getRawResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SeatMap.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "SeatMap"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("mapType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "MapType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MAP_TYPE"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rows");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Rows"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "SeatRow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "SeatRow"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Columns"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "char"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "char"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rawResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "RawResponse"));
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
