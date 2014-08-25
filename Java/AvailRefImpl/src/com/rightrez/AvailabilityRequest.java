/**
 * AvailabilityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class AvailabilityRequest  implements java.io.Serializable {
    private java.lang.String nationality;

    private boolean allowFBCMismatch;

    private boolean forceFBCOnMismatch;

    private boolean allowNegativeAddCollect;

    private boolean calculateAddCollectWhenBudgetZero;

    private boolean onlyCheapestCOS;

    private int numPassengers;

    private java.lang.String clientID;

    private com.rightrez.MoneyAmount budgetedCost;

    private com.rightrez.MoneyAmount existingAddCollect;

    private boolean getFareRules;

    private java.lang.String bookType;

    private boolean maximizeCarrierDiversity;

    private java.math.BigDecimal creditCardMarkupPct;

    private java.lang.String loggingID;

    private com.rightrez.AvailabilityRequestDependency[] dependencies;

    private com.rightrez.AvailabilityRequestComponent[] components;

    public AvailabilityRequest() {
    }

    public AvailabilityRequest(
           java.lang.String nationality,
           boolean allowFBCMismatch,
           boolean forceFBCOnMismatch,
           boolean allowNegativeAddCollect,
           boolean calculateAddCollectWhenBudgetZero,
           boolean onlyCheapestCOS,
           int numPassengers,
           java.lang.String clientID,
           com.rightrez.MoneyAmount budgetedCost,
           com.rightrez.MoneyAmount existingAddCollect,
           boolean getFareRules,
           java.lang.String bookType,
           boolean maximizeCarrierDiversity,
           java.math.BigDecimal creditCardMarkupPct,
           java.lang.String loggingID,
           com.rightrez.AvailabilityRequestDependency[] dependencies,
           com.rightrez.AvailabilityRequestComponent[] components) {
           this.nationality = nationality;
           this.allowFBCMismatch = allowFBCMismatch;
           this.forceFBCOnMismatch = forceFBCOnMismatch;
           this.allowNegativeAddCollect = allowNegativeAddCollect;
           this.calculateAddCollectWhenBudgetZero = calculateAddCollectWhenBudgetZero;
           this.onlyCheapestCOS = onlyCheapestCOS;
           this.numPassengers = numPassengers;
           this.clientID = clientID;
           this.budgetedCost = budgetedCost;
           this.existingAddCollect = existingAddCollect;
           this.getFareRules = getFareRules;
           this.bookType = bookType;
           this.maximizeCarrierDiversity = maximizeCarrierDiversity;
           this.creditCardMarkupPct = creditCardMarkupPct;
           this.loggingID = loggingID;
           this.dependencies = dependencies;
           this.components = components;
    }


    /**
     * Gets the nationality value for this AvailabilityRequest.
     * 
     * @return nationality
     */
    public java.lang.String getNationality() {
        return nationality;
    }


    /**
     * Sets the nationality value for this AvailabilityRequest.
     * 
     * @param nationality
     */
    public void setNationality(java.lang.String nationality) {
        this.nationality = nationality;
    }


    /**
     * Gets the allowFBCMismatch value for this AvailabilityRequest.
     * 
     * @return allowFBCMismatch
     */
    public boolean isAllowFBCMismatch() {
        return allowFBCMismatch;
    }


    /**
     * Sets the allowFBCMismatch value for this AvailabilityRequest.
     * 
     * @param allowFBCMismatch
     */
    public void setAllowFBCMismatch(boolean allowFBCMismatch) {
        this.allowFBCMismatch = allowFBCMismatch;
    }


    /**
     * Gets the forceFBCOnMismatch value for this AvailabilityRequest.
     * 
     * @return forceFBCOnMismatch
     */
    public boolean isForceFBCOnMismatch() {
        return forceFBCOnMismatch;
    }


    /**
     * Sets the forceFBCOnMismatch value for this AvailabilityRequest.
     * 
     * @param forceFBCOnMismatch
     */
    public void setForceFBCOnMismatch(boolean forceFBCOnMismatch) {
        this.forceFBCOnMismatch = forceFBCOnMismatch;
    }


    /**
     * Gets the allowNegativeAddCollect value for this AvailabilityRequest.
     * 
     * @return allowNegativeAddCollect
     */
    public boolean isAllowNegativeAddCollect() {
        return allowNegativeAddCollect;
    }


    /**
     * Sets the allowNegativeAddCollect value for this AvailabilityRequest.
     * 
     * @param allowNegativeAddCollect
     */
    public void setAllowNegativeAddCollect(boolean allowNegativeAddCollect) {
        this.allowNegativeAddCollect = allowNegativeAddCollect;
    }


    /**
     * Gets the calculateAddCollectWhenBudgetZero value for this AvailabilityRequest.
     * 
     * @return calculateAddCollectWhenBudgetZero
     */
    public boolean isCalculateAddCollectWhenBudgetZero() {
        return calculateAddCollectWhenBudgetZero;
    }


    /**
     * Sets the calculateAddCollectWhenBudgetZero value for this AvailabilityRequest.
     * 
     * @param calculateAddCollectWhenBudgetZero
     */
    public void setCalculateAddCollectWhenBudgetZero(boolean calculateAddCollectWhenBudgetZero) {
        this.calculateAddCollectWhenBudgetZero = calculateAddCollectWhenBudgetZero;
    }


    /**
     * Gets the onlyCheapestCOS value for this AvailabilityRequest.
     * 
     * @return onlyCheapestCOS
     */
    public boolean isOnlyCheapestCOS() {
        return onlyCheapestCOS;
    }


    /**
     * Sets the onlyCheapestCOS value for this AvailabilityRequest.
     * 
     * @param onlyCheapestCOS
     */
    public void setOnlyCheapestCOS(boolean onlyCheapestCOS) {
        this.onlyCheapestCOS = onlyCheapestCOS;
    }


    /**
     * Gets the numPassengers value for this AvailabilityRequest.
     * 
     * @return numPassengers
     */
    public int getNumPassengers() {
        return numPassengers;
    }


    /**
     * Sets the numPassengers value for this AvailabilityRequest.
     * 
     * @param numPassengers
     */
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }


    /**
     * Gets the clientID value for this AvailabilityRequest.
     * 
     * @return clientID
     */
    public java.lang.String getClientID() {
        return clientID;
    }


    /**
     * Sets the clientID value for this AvailabilityRequest.
     * 
     * @param clientID
     */
    public void setClientID(java.lang.String clientID) {
        this.clientID = clientID;
    }


    /**
     * Gets the budgetedCost value for this AvailabilityRequest.
     * 
     * @return budgetedCost
     */
    public com.rightrez.MoneyAmount getBudgetedCost() {
        return budgetedCost;
    }


    /**
     * Sets the budgetedCost value for this AvailabilityRequest.
     * 
     * @param budgetedCost
     */
    public void setBudgetedCost(com.rightrez.MoneyAmount budgetedCost) {
        this.budgetedCost = budgetedCost;
    }


    /**
     * Gets the existingAddCollect value for this AvailabilityRequest.
     * 
     * @return existingAddCollect
     */
    public com.rightrez.MoneyAmount getExistingAddCollect() {
        return existingAddCollect;
    }


    /**
     * Sets the existingAddCollect value for this AvailabilityRequest.
     * 
     * @param existingAddCollect
     */
    public void setExistingAddCollect(com.rightrez.MoneyAmount existingAddCollect) {
        this.existingAddCollect = existingAddCollect;
    }


    /**
     * Gets the getFareRules value for this AvailabilityRequest.
     * 
     * @return getFareRules
     */
    public boolean isGetFareRules() {
        return getFareRules;
    }


    /**
     * Sets the getFareRules value for this AvailabilityRequest.
     * 
     * @param getFareRules
     */
    public void setGetFareRules(boolean getFareRules) {
        this.getFareRules = getFareRules;
    }


    /**
     * Gets the bookType value for this AvailabilityRequest.
     * 
     * @return bookType
     */
    public java.lang.String getBookType() {
        return bookType;
    }


    /**
     * Sets the bookType value for this AvailabilityRequest.
     * 
     * @param bookType
     */
    public void setBookType(java.lang.String bookType) {
        this.bookType = bookType;
    }


    /**
     * Gets the maximizeCarrierDiversity value for this AvailabilityRequest.
     * 
     * @return maximizeCarrierDiversity
     */
    public boolean isMaximizeCarrierDiversity() {
        return maximizeCarrierDiversity;
    }


    /**
     * Sets the maximizeCarrierDiversity value for this AvailabilityRequest.
     * 
     * @param maximizeCarrierDiversity
     */
    public void setMaximizeCarrierDiversity(boolean maximizeCarrierDiversity) {
        this.maximizeCarrierDiversity = maximizeCarrierDiversity;
    }


    /**
     * Gets the creditCardMarkupPct value for this AvailabilityRequest.
     * 
     * @return creditCardMarkupPct
     */
    public java.math.BigDecimal getCreditCardMarkupPct() {
        return creditCardMarkupPct;
    }


    /**
     * Sets the creditCardMarkupPct value for this AvailabilityRequest.
     * 
     * @param creditCardMarkupPct
     */
    public void setCreditCardMarkupPct(java.math.BigDecimal creditCardMarkupPct) {
        this.creditCardMarkupPct = creditCardMarkupPct;
    }


    /**
     * Gets the loggingID value for this AvailabilityRequest.
     * 
     * @return loggingID
     */
    public java.lang.String getLoggingID() {
        return loggingID;
    }


    /**
     * Sets the loggingID value for this AvailabilityRequest.
     * 
     * @param loggingID
     */
    public void setLoggingID(java.lang.String loggingID) {
        this.loggingID = loggingID;
    }


    /**
     * Gets the dependencies value for this AvailabilityRequest.
     * 
     * @return dependencies
     */
    public com.rightrez.AvailabilityRequestDependency[] getDependencies() {
        return dependencies;
    }


    /**
     * Sets the dependencies value for this AvailabilityRequest.
     * 
     * @param dependencies
     */
    public void setDependencies(com.rightrez.AvailabilityRequestDependency[] dependencies) {
        this.dependencies = dependencies;
    }


    /**
     * Gets the components value for this AvailabilityRequest.
     * 
     * @return components
     */
    public com.rightrez.AvailabilityRequestComponent[] getComponents() {
        return components;
    }


    /**
     * Sets the components value for this AvailabilityRequest.
     * 
     * @param components
     */
    public void setComponents(com.rightrez.AvailabilityRequestComponent[] components) {
        this.components = components;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailabilityRequest)) return false;
        AvailabilityRequest other = (AvailabilityRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.nationality==null && other.getNationality()==null) || 
             (this.nationality!=null &&
              this.nationality.equals(other.getNationality()))) &&
            this.allowFBCMismatch == other.isAllowFBCMismatch() &&
            this.forceFBCOnMismatch == other.isForceFBCOnMismatch() &&
            this.allowNegativeAddCollect == other.isAllowNegativeAddCollect() &&
            this.calculateAddCollectWhenBudgetZero == other.isCalculateAddCollectWhenBudgetZero() &&
            this.onlyCheapestCOS == other.isOnlyCheapestCOS() &&
            this.numPassengers == other.getNumPassengers() &&
            ((this.clientID==null && other.getClientID()==null) || 
             (this.clientID!=null &&
              this.clientID.equals(other.getClientID()))) &&
            ((this.budgetedCost==null && other.getBudgetedCost()==null) || 
             (this.budgetedCost!=null &&
              this.budgetedCost.equals(other.getBudgetedCost()))) &&
            ((this.existingAddCollect==null && other.getExistingAddCollect()==null) || 
             (this.existingAddCollect!=null &&
              this.existingAddCollect.equals(other.getExistingAddCollect()))) &&
            this.getFareRules == other.isGetFareRules() &&
            ((this.bookType==null && other.getBookType()==null) || 
             (this.bookType!=null &&
              this.bookType.equals(other.getBookType()))) &&
            this.maximizeCarrierDiversity == other.isMaximizeCarrierDiversity() &&
            ((this.creditCardMarkupPct==null && other.getCreditCardMarkupPct()==null) || 
             (this.creditCardMarkupPct!=null &&
              this.creditCardMarkupPct.equals(other.getCreditCardMarkupPct()))) &&
            ((this.loggingID==null && other.getLoggingID()==null) || 
             (this.loggingID!=null &&
              this.loggingID.equals(other.getLoggingID()))) &&
            ((this.dependencies==null && other.getDependencies()==null) || 
             (this.dependencies!=null &&
              java.util.Arrays.equals(this.dependencies, other.getDependencies()))) &&
            ((this.components==null && other.getComponents()==null) || 
             (this.components!=null &&
              java.util.Arrays.equals(this.components, other.getComponents())));
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
        if (getNationality() != null) {
            _hashCode += getNationality().hashCode();
        }
        _hashCode += (isAllowFBCMismatch() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isForceFBCOnMismatch() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isAllowNegativeAddCollect() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isCalculateAddCollectWhenBudgetZero() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isOnlyCheapestCOS() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getNumPassengers();
        if (getClientID() != null) {
            _hashCode += getClientID().hashCode();
        }
        if (getBudgetedCost() != null) {
            _hashCode += getBudgetedCost().hashCode();
        }
        if (getExistingAddCollect() != null) {
            _hashCode += getExistingAddCollect().hashCode();
        }
        _hashCode += (isGetFareRules() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getBookType() != null) {
            _hashCode += getBookType().hashCode();
        }
        _hashCode += (isMaximizeCarrierDiversity() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getCreditCardMarkupPct() != null) {
            _hashCode += getCreditCardMarkupPct().hashCode();
        }
        if (getLoggingID() != null) {
            _hashCode += getLoggingID().hashCode();
        }
        if (getDependencies() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDependencies());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDependencies(), i);
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvailabilityRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationality");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Nationality"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowFBCMismatch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AllowFBCMismatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("forceFBCOnMismatch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ForceFBCOnMismatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowNegativeAddCollect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AllowNegativeAddCollect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calculateAddCollectWhenBudgetZero");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CalculateAddCollectWhenBudgetZero"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("onlyCheapestCOS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "OnlyCheapestCOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numPassengers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "NumPassengers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("budgetedCost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BudgetedCost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("existingAddCollect");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ExistingAddCollect"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("getFareRules");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "GetFareRules"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("maximizeCarrierDiversity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "MaximizeCarrierDiversity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditCardMarkupPct");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CreditCardMarkupPct"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loggingID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "LoggingID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dependencies");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Dependencies"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityRequestDependency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityRequestDependency"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("components");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Components"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityRequestComponent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityRequestComponent"));
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
