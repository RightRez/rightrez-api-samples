/**
 * BookingRequestComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class BookingRequestComponent  implements java.io.Serializable {
    private int dataCaptureComponentId;

    private java.lang.String placeHolderCommand;

    private java.util.Calendar departDate;

    private java.lang.String arriveCity;

    private java.lang.String departCity;

    private int componentUniqueKey;

    private com.rightrez.FlightInfo[] sortedFlights;

    private com.rightrez.TripDirectionType tripType;

    private java.lang.String company;

    private java.lang.String program;

    private java.lang.String product;

    private com.rightrez.ServiceLevel serviceLevel;

    private org.apache.axis.types.UnsignedShort serviceLevelChar;

    private java.lang.String prevComponent;

    private java.lang.String nextComponent;

    public BookingRequestComponent() {
    }

    public BookingRequestComponent(
           int dataCaptureComponentId,
           java.lang.String placeHolderCommand,
           java.util.Calendar departDate,
           java.lang.String arriveCity,
           java.lang.String departCity,
           int componentUniqueKey,
           com.rightrez.FlightInfo[] sortedFlights,
           com.rightrez.TripDirectionType tripType,
           java.lang.String company,
           java.lang.String program,
           java.lang.String product,
           com.rightrez.ServiceLevel serviceLevel,
           org.apache.axis.types.UnsignedShort serviceLevelChar,
           java.lang.String prevComponent,
           java.lang.String nextComponent) {
           this.dataCaptureComponentId = dataCaptureComponentId;
           this.placeHolderCommand = placeHolderCommand;
           this.departDate = departDate;
           this.arriveCity = arriveCity;
           this.departCity = departCity;
           this.componentUniqueKey = componentUniqueKey;
           this.sortedFlights = sortedFlights;
           this.tripType = tripType;
           this.company = company;
           this.program = program;
           this.product = product;
           this.serviceLevel = serviceLevel;
           this.serviceLevelChar = serviceLevelChar;
           this.prevComponent = prevComponent;
           this.nextComponent = nextComponent;
    }


    /**
     * Gets the dataCaptureComponentId value for this BookingRequestComponent.
     * 
     * @return dataCaptureComponentId
     */
    public int getDataCaptureComponentId() {
        return dataCaptureComponentId;
    }


    /**
     * Sets the dataCaptureComponentId value for this BookingRequestComponent.
     * 
     * @param dataCaptureComponentId
     */
    public void setDataCaptureComponentId(int dataCaptureComponentId) {
        this.dataCaptureComponentId = dataCaptureComponentId;
    }


    /**
     * Gets the placeHolderCommand value for this BookingRequestComponent.
     * 
     * @return placeHolderCommand
     */
    public java.lang.String getPlaceHolderCommand() {
        return placeHolderCommand;
    }


    /**
     * Sets the placeHolderCommand value for this BookingRequestComponent.
     * 
     * @param placeHolderCommand
     */
    public void setPlaceHolderCommand(java.lang.String placeHolderCommand) {
        this.placeHolderCommand = placeHolderCommand;
    }


    /**
     * Gets the departDate value for this BookingRequestComponent.
     * 
     * @return departDate
     */
    public java.util.Calendar getDepartDate() {
        return departDate;
    }


    /**
     * Sets the departDate value for this BookingRequestComponent.
     * 
     * @param departDate
     */
    public void setDepartDate(java.util.Calendar departDate) {
        this.departDate = departDate;
    }


    /**
     * Gets the arriveCity value for this BookingRequestComponent.
     * 
     * @return arriveCity
     */
    public java.lang.String getArriveCity() {
        return arriveCity;
    }


    /**
     * Sets the arriveCity value for this BookingRequestComponent.
     * 
     * @param arriveCity
     */
    public void setArriveCity(java.lang.String arriveCity) {
        this.arriveCity = arriveCity;
    }


    /**
     * Gets the departCity value for this BookingRequestComponent.
     * 
     * @return departCity
     */
    public java.lang.String getDepartCity() {
        return departCity;
    }


    /**
     * Sets the departCity value for this BookingRequestComponent.
     * 
     * @param departCity
     */
    public void setDepartCity(java.lang.String departCity) {
        this.departCity = departCity;
    }


    /**
     * Gets the componentUniqueKey value for this BookingRequestComponent.
     * 
     * @return componentUniqueKey
     */
    public int getComponentUniqueKey() {
        return componentUniqueKey;
    }


    /**
     * Sets the componentUniqueKey value for this BookingRequestComponent.
     * 
     * @param componentUniqueKey
     */
    public void setComponentUniqueKey(int componentUniqueKey) {
        this.componentUniqueKey = componentUniqueKey;
    }


    /**
     * Gets the sortedFlights value for this BookingRequestComponent.
     * 
     * @return sortedFlights
     */
    public com.rightrez.FlightInfo[] getSortedFlights() {
        return sortedFlights;
    }


    /**
     * Sets the sortedFlights value for this BookingRequestComponent.
     * 
     * @param sortedFlights
     */
    public void setSortedFlights(com.rightrez.FlightInfo[] sortedFlights) {
        this.sortedFlights = sortedFlights;
    }


    /**
     * Gets the tripType value for this BookingRequestComponent.
     * 
     * @return tripType
     */
    public com.rightrez.TripDirectionType getTripType() {
        return tripType;
    }


    /**
     * Sets the tripType value for this BookingRequestComponent.
     * 
     * @param tripType
     */
    public void setTripType(com.rightrez.TripDirectionType tripType) {
        this.tripType = tripType;
    }


    /**
     * Gets the company value for this BookingRequestComponent.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this BookingRequestComponent.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the program value for this BookingRequestComponent.
     * 
     * @return program
     */
    public java.lang.String getProgram() {
        return program;
    }


    /**
     * Sets the program value for this BookingRequestComponent.
     * 
     * @param program
     */
    public void setProgram(java.lang.String program) {
        this.program = program;
    }


    /**
     * Gets the product value for this BookingRequestComponent.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this BookingRequestComponent.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the serviceLevel value for this BookingRequestComponent.
     * 
     * @return serviceLevel
     */
    public com.rightrez.ServiceLevel getServiceLevel() {
        return serviceLevel;
    }


    /**
     * Sets the serviceLevel value for this BookingRequestComponent.
     * 
     * @param serviceLevel
     */
    public void setServiceLevel(com.rightrez.ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }


    /**
     * Gets the serviceLevelChar value for this BookingRequestComponent.
     * 
     * @return serviceLevelChar
     */
    public org.apache.axis.types.UnsignedShort getServiceLevelChar() {
        return serviceLevelChar;
    }


    /**
     * Sets the serviceLevelChar value for this BookingRequestComponent.
     * 
     * @param serviceLevelChar
     */
    public void setServiceLevelChar(org.apache.axis.types.UnsignedShort serviceLevelChar) {
        this.serviceLevelChar = serviceLevelChar;
    }


    /**
     * Gets the prevComponent value for this BookingRequestComponent.
     * 
     * @return prevComponent
     */
    public java.lang.String getPrevComponent() {
        return prevComponent;
    }


    /**
     * Sets the prevComponent value for this BookingRequestComponent.
     * 
     * @param prevComponent
     */
    public void setPrevComponent(java.lang.String prevComponent) {
        this.prevComponent = prevComponent;
    }


    /**
     * Gets the nextComponent value for this BookingRequestComponent.
     * 
     * @return nextComponent
     */
    public java.lang.String getNextComponent() {
        return nextComponent;
    }


    /**
     * Sets the nextComponent value for this BookingRequestComponent.
     * 
     * @param nextComponent
     */
    public void setNextComponent(java.lang.String nextComponent) {
        this.nextComponent = nextComponent;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof BookingRequestComponent)) return false;
        BookingRequestComponent other = (BookingRequestComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.dataCaptureComponentId == other.getDataCaptureComponentId() &&
            ((this.placeHolderCommand==null && other.getPlaceHolderCommand()==null) || 
             (this.placeHolderCommand!=null &&
              this.placeHolderCommand.equals(other.getPlaceHolderCommand()))) &&
            ((this.departDate==null && other.getDepartDate()==null) || 
             (this.departDate!=null &&
              this.departDate.equals(other.getDepartDate()))) &&
            ((this.arriveCity==null && other.getArriveCity()==null) || 
             (this.arriveCity!=null &&
              this.arriveCity.equals(other.getArriveCity()))) &&
            ((this.departCity==null && other.getDepartCity()==null) || 
             (this.departCity!=null &&
              this.departCity.equals(other.getDepartCity()))) &&
            this.componentUniqueKey == other.getComponentUniqueKey() &&
            ((this.sortedFlights==null && other.getSortedFlights()==null) || 
             (this.sortedFlights!=null &&
              java.util.Arrays.equals(this.sortedFlights, other.getSortedFlights()))) &&
            ((this.tripType==null && other.getTripType()==null) || 
             (this.tripType!=null &&
              this.tripType.equals(other.getTripType()))) &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.program==null && other.getProgram()==null) || 
             (this.program!=null &&
              this.program.equals(other.getProgram()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.serviceLevel==null && other.getServiceLevel()==null) || 
             (this.serviceLevel!=null &&
              this.serviceLevel.equals(other.getServiceLevel()))) &&
            ((this.serviceLevelChar==null && other.getServiceLevelChar()==null) || 
             (this.serviceLevelChar!=null &&
              this.serviceLevelChar.equals(other.getServiceLevelChar()))) &&
            ((this.prevComponent==null && other.getPrevComponent()==null) || 
             (this.prevComponent!=null &&
              this.prevComponent.equals(other.getPrevComponent()))) &&
            ((this.nextComponent==null && other.getNextComponent()==null) || 
             (this.nextComponent!=null &&
              this.nextComponent.equals(other.getNextComponent())));
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
        _hashCode += getDataCaptureComponentId();
        if (getPlaceHolderCommand() != null) {
            _hashCode += getPlaceHolderCommand().hashCode();
        }
        if (getDepartDate() != null) {
            _hashCode += getDepartDate().hashCode();
        }
        if (getArriveCity() != null) {
            _hashCode += getArriveCity().hashCode();
        }
        if (getDepartCity() != null) {
            _hashCode += getDepartCity().hashCode();
        }
        _hashCode += getComponentUniqueKey();
        if (getSortedFlights() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getSortedFlights());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getSortedFlights(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTripType() != null) {
            _hashCode += getTripType().hashCode();
        }
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getProgram() != null) {
            _hashCode += getProgram().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getServiceLevel() != null) {
            _hashCode += getServiceLevel().hashCode();
        }
        if (getServiceLevelChar() != null) {
            _hashCode += getServiceLevelChar().hashCode();
        }
        if (getPrevComponent() != null) {
            _hashCode += getPrevComponent().hashCode();
        }
        if (getNextComponent() != null) {
            _hashCode += getNextComponent().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BookingRequestComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "BookingRequestComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataCaptureComponentId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DataCaptureComponentId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("placeHolderCommand");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PlaceHolderCommand"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DepartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arriveCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ArriveCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DepartCity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentUniqueKey");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ComponentUniqueKey"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortedFlights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "SortedFlights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightInfo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "FlightInfo"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tripType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TripType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "TripDirectionType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Company"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("program");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Program"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Product"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ServiceLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "ServiceLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceLevelChar");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ServiceLevelChar"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "unsignedShort"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "PrevComponent"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextComponent");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "NextComponent"));
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
