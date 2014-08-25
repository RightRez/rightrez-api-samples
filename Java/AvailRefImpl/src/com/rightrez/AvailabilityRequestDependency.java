/**
 * AvailabilityRequestDependency.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class AvailabilityRequestDependency  implements java.io.Serializable {
    private boolean considerOneWayOptions;

    private com.rightrez.MoneyAmount bookedTotalPrice;

    private int[] dependentComponents;

    public AvailabilityRequestDependency() {
    }

    public AvailabilityRequestDependency(
           boolean considerOneWayOptions,
           com.rightrez.MoneyAmount bookedTotalPrice,
           int[] dependentComponents) {
           this.considerOneWayOptions = considerOneWayOptions;
           this.bookedTotalPrice = bookedTotalPrice;
           this.dependentComponents = dependentComponents;
    }


    /**
     * Gets the considerOneWayOptions value for this AvailabilityRequestDependency.
     * 
     * @return considerOneWayOptions
     */
    public boolean isConsiderOneWayOptions() {
        return considerOneWayOptions;
    }


    /**
     * Sets the considerOneWayOptions value for this AvailabilityRequestDependency.
     * 
     * @param considerOneWayOptions
     */
    public void setConsiderOneWayOptions(boolean considerOneWayOptions) {
        this.considerOneWayOptions = considerOneWayOptions;
    }


    /**
     * Gets the bookedTotalPrice value for this AvailabilityRequestDependency.
     * 
     * @return bookedTotalPrice
     */
    public com.rightrez.MoneyAmount getBookedTotalPrice() {
        return bookedTotalPrice;
    }


    /**
     * Sets the bookedTotalPrice value for this AvailabilityRequestDependency.
     * 
     * @param bookedTotalPrice
     */
    public void setBookedTotalPrice(com.rightrez.MoneyAmount bookedTotalPrice) {
        this.bookedTotalPrice = bookedTotalPrice;
    }


    /**
     * Gets the dependentComponents value for this AvailabilityRequestDependency.
     * 
     * @return dependentComponents
     */
    public int[] getDependentComponents() {
        return dependentComponents;
    }


    /**
     * Sets the dependentComponents value for this AvailabilityRequestDependency.
     * 
     * @param dependentComponents
     */
    public void setDependentComponents(int[] dependentComponents) {
        this.dependentComponents = dependentComponents;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailabilityRequestDependency)) return false;
        AvailabilityRequestDependency other = (AvailabilityRequestDependency) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.considerOneWayOptions == other.isConsiderOneWayOptions() &&
            ((this.bookedTotalPrice==null && other.getBookedTotalPrice()==null) || 
             (this.bookedTotalPrice!=null &&
              this.bookedTotalPrice.equals(other.getBookedTotalPrice()))) &&
            ((this.dependentComponents==null && other.getDependentComponents()==null) || 
             (this.dependentComponents!=null &&
              java.util.Arrays.equals(this.dependentComponents, other.getDependentComponents())));
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
        _hashCode += (isConsiderOneWayOptions() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBookedTotalPrice() != null) {
            _hashCode += getBookedTotalPrice().hashCode();
        }
        if (getDependentComponents() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDependentComponents());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDependentComponents(), i);
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
        new org.apache.axis.description.TypeDesc(AvailabilityRequestDependency.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityRequestDependency"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("considerOneWayOptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ConsiderOneWayOptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bookedTotalPrice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BookedTotalPrice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dependentComponents");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DependentComponents"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "int"));
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
