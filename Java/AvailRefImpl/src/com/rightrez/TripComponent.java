/**
 * TripComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class TripComponent  implements java.io.Serializable {
    private java.lang.String company;

    private java.lang.String program;

    private java.lang.String product;

    private int numoptions;

    private java.lang.String[] carrierPrefs;

    private boolean showNonPreferredCarriers;

    private boolean usePublishedFares;

    private java.lang.String[] fareType;

    private boolean useMarineFares;

    private java.lang.String componentType;

    private java.lang.String prevComponent;

    private java.lang.String nextComponent;

    private com.rightrez.TripDirectionType tripType;

    private java.lang.String departCity;

    private java.lang.String arriveCity;

    private com.rightrez.ServiceLevel serviceLevel;

    private java.lang.String serviceLevelChar;

    private java.util.Calendar departDate;

    private java.util.Calendar arriveDate;

    private com.rightrez.DepartAirport[] departAirports;

    private com.rightrez.ArriveAirport[] arriveAirports;

    private java.lang.String flightPrefs;

    private java.lang.String departBefore;

    private java.lang.String departAfter;

    private java.lang.String departOptimal;

    private java.lang.String arriveBefore;

    private java.lang.String arriveAfter;

    private java.lang.String arriveOptimal;

    private com.rightrez.FlightInfo flightToMatch;

    public TripComponent() {
    }

    public TripComponent(
           java.lang.String company,
           java.lang.String program,
           java.lang.String product,
           int numoptions,
           java.lang.String[] carrierPrefs,
           boolean showNonPreferredCarriers,
           boolean usePublishedFares,
           java.lang.String[] fareType,
           boolean useMarineFares,
           java.lang.String componentType,
           java.lang.String prevComponent,
           java.lang.String nextComponent,
           com.rightrez.TripDirectionType tripType,
           java.lang.String departCity,
           java.lang.String arriveCity,
           com.rightrez.ServiceLevel serviceLevel,
           java.lang.String serviceLevelChar,
           java.util.Calendar departDate,
           java.util.Calendar arriveDate,
           com.rightrez.DepartAirport[] departAirports,
           com.rightrez.ArriveAirport[] arriveAirports,
           java.lang.String flightPrefs,
           java.lang.String departBefore,
           java.lang.String departAfter,
           java.lang.String departOptimal,
           java.lang.String arriveBefore,
           java.lang.String arriveAfter,
           java.lang.String arriveOptimal,
           com.rightrez.FlightInfo flightToMatch) {
           this.company = company;
           this.program = program;
           this.product = product;
           this.numoptions = numoptions;
           this.carrierPrefs = carrierPrefs;
           this.showNonPreferredCarriers = showNonPreferredCarriers;
           this.usePublishedFares = usePublishedFares;
           this.fareType = fareType;
           this.useMarineFares = useMarineFares;
           this.componentType = componentType;
           this.prevComponent = prevComponent;
           this.nextComponent = nextComponent;
           this.tripType = tripType;
           this.departCity = departCity;
           this.arriveCity = arriveCity;
           this.serviceLevel = serviceLevel;
           this.serviceLevelChar = serviceLevelChar;
           this.departDate = departDate;
           this.arriveDate = arriveDate;
           this.departAirports = departAirports;
           this.arriveAirports = arriveAirports;
           this.flightPrefs = flightPrefs;
           this.departBefore = departBefore;
           this.departAfter = departAfter;
           this.departOptimal = departOptimal;
           this.arriveBefore = arriveBefore;
           this.arriveAfter = arriveAfter;
           this.arriveOptimal = arriveOptimal;
           this.flightToMatch = flightToMatch;
    }


    /**
     * Gets the company value for this TripComponent.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this TripComponent.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the program value for this TripComponent.
     * 
     * @return program
     */
    public java.lang.String getProgram() {
        return program;
    }


    /**
     * Sets the program value for this TripComponent.
     * 
     * @param program
     */
    public void setProgram(java.lang.String program) {
        this.program = program;
    }


    /**
     * Gets the product value for this TripComponent.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this TripComponent.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the numoptions value for this TripComponent.
     * 
     * @return numoptions
     */
    public int getNumoptions() {
        return numoptions;
    }


    /**
     * Sets the numoptions value for this TripComponent.
     * 
     * @param numoptions
     */
    public void setNumoptions(int numoptions) {
        this.numoptions = numoptions;
    }


    /**
     * Gets the carrierPrefs value for this TripComponent.
     * 
     * @return carrierPrefs
     */
    public java.lang.String[] getCarrierPrefs() {
        return carrierPrefs;
    }


    /**
     * Sets the carrierPrefs value for this TripComponent.
     * 
     * @param carrierPrefs
     */
    public void setCarrierPrefs(java.lang.String[] carrierPrefs) {
        this.carrierPrefs = carrierPrefs;
    }


    /**
     * Gets the showNonPreferredCarriers value for this TripComponent.
     * 
     * @return showNonPreferredCarriers
     */
    public boolean isShowNonPreferredCarriers() {
        return showNonPreferredCarriers;
    }


    /**
     * Sets the showNonPreferredCarriers value for this TripComponent.
     * 
     * @param showNonPreferredCarriers
     */
    public void setShowNonPreferredCarriers(boolean showNonPreferredCarriers) {
        this.showNonPreferredCarriers = showNonPreferredCarriers;
    }


    /**
     * Gets the usePublishedFares value for this TripComponent.
     * 
     * @return usePublishedFares
     */
    public boolean isUsePublishedFares() {
        return usePublishedFares;
    }


    /**
     * Sets the usePublishedFares value for this TripComponent.
     * 
     * @param usePublishedFares
     */
    public void setUsePublishedFares(boolean usePublishedFares) {
        this.usePublishedFares = usePublishedFares;
    }


    /**
     * Gets the fareType value for this TripComponent.
     * 
     * @return fareType
     */
    public java.lang.String[] getFareType() {
        return fareType;
    }


    /**
     * Sets the fareType value for this TripComponent.
     * 
     * @param fareType
     */
    public void setFareType(java.lang.String[] fareType) {
        this.fareType = fareType;
    }


    /**
     * Gets the useMarineFares value for this TripComponent.
     * 
     * @return useMarineFares
     */
    public boolean isUseMarineFares() {
        return useMarineFares;
    }


    /**
     * Sets the useMarineFares value for this TripComponent.
     * 
     * @param useMarineFares
     */
    public void setUseMarineFares(boolean useMarineFares) {
        this.useMarineFares = useMarineFares;
    }


    /**
     * Gets the componentType value for this TripComponent.
     * 
     * @return componentType
     */
    public java.lang.String getComponentType() {
        return componentType;
    }


    /**
     * Sets the componentType value for this TripComponent.
     * 
     * @param componentType
     */
    public void setComponentType(java.lang.String componentType) {
        this.componentType = componentType;
    }


    /**
     * Gets the prevComponent value for this TripComponent.
     * 
     * @return prevComponent
     */
    public java.lang.String getPrevComponent() {
        return prevComponent;
    }


    /**
     * Sets the prevComponent value for this TripComponent.
     * 
     * @param prevComponent
     */
    public void setPrevComponent(java.lang.String prevComponent) {
        this.prevComponent = prevComponent;
    }


    /**
     * Gets the nextComponent value for this TripComponent.
     * 
     * @return nextComponent
     */
    public java.lang.String getNextComponent() {
        return nextComponent;
    }


    /**
     * Sets the nextComponent value for this TripComponent.
     * 
     * @param nextComponent
     */
    public void setNextComponent(java.lang.String nextComponent) {
        this.nextComponent = nextComponent;
    }


    /**
     * Gets the tripType value for this TripComponent.
     * 
     * @return tripType
     */
    public com.rightrez.TripDirectionType getTripType() {
        return tripType;
    }


    /**
     * Sets the tripType value for this TripComponent.
     * 
     * @param tripType
     */
    public void setTripType(com.rightrez.TripDirectionType tripType) {
        this.tripType = tripType;
    }


    /**
     * Gets the departCity value for this TripComponent.
     * 
     * @return departCity
     */
    public java.lang.String getDepartCity() {
        return departCity;
    }


    /**
     * Sets the departCity value for this TripComponent.
     * 
     * @param departCity
     */
    public void setDepartCity(java.lang.String departCity) {
        this.departCity = departCity;
    }


    /**
     * Gets the arriveCity value for this TripComponent.
     * 
     * @return arriveCity
     */
    public java.lang.String getArriveCity() {
        return arriveCity;
    }


    /**
     * Sets the arriveCity value for this TripComponent.
     * 
     * @param arriveCity
     */
    public void setArriveCity(java.lang.String arriveCity) {
        this.arriveCity = arriveCity;
    }


    /**
     * Gets the serviceLevel value for this TripComponent.
     * 
     * @return serviceLevel
     */
    public com.rightrez.ServiceLevel getServiceLevel() {
        return serviceLevel;
    }


    /**
     * Sets the serviceLevel value for this TripComponent.
     * 
     * @param serviceLevel
     */
    public void setServiceLevel(com.rightrez.ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }


    /**
     * Gets the serviceLevelChar value for this TripComponent.
     * 
     * @return serviceLevelChar
     */
    public java.lang.String getServiceLevelChar() {
        return serviceLevelChar;
    }


    /**
     * Sets the serviceLevelChar value for this TripComponent.
     * 
     * @param serviceLevelChar
     */
    public void setServiceLevelChar(java.lang.String serviceLevelChar) {
        this.serviceLevelChar = serviceLevelChar;
    }


    /**
     * Gets the departDate value for this TripComponent.
     * 
     * @return departDate
     */
    public java.util.Calendar getDepartDate() {
        return departDate;
    }


    /**
     * Sets the departDate value for this TripComponent.
     * 
     * @param departDate
     */
    public void setDepartDate(java.util.Calendar departDate) {
        this.departDate = departDate;
    }


    /**
     * Gets the arriveDate value for this TripComponent.
     * 
     * @return arriveDate
     */
    public java.util.Calendar getArriveDate() {
        return arriveDate;
    }


    /**
     * Sets the arriveDate value for this TripComponent.
     * 
     * @param arriveDate
     */
    public void setArriveDate(java.util.Calendar arriveDate) {
        this.arriveDate = arriveDate;
    }


    /**
     * Gets the departAirports value for this TripComponent.
     * 
     * @return departAirports
     */
    public com.rightrez.DepartAirport[] getDepartAirports() {
        return departAirports;
    }


    /**
     * Sets the departAirports value for this TripComponent.
     * 
     * @param departAirports
     */
    public void setDepartAirports(com.rightrez.DepartAirport[] departAirports) {
        this.departAirports = departAirports;
    }


    /**
     * Gets the arriveAirports value for this TripComponent.
     * 
     * @return arriveAirports
     */
    public com.rightrez.ArriveAirport[] getArriveAirports() {
        return arriveAirports;
    }


    /**
     * Sets the arriveAirports value for this TripComponent.
     * 
     * @param arriveAirports
     */
    public void setArriveAirports(com.rightrez.ArriveAirport[] arriveAirports) {
        this.arriveAirports = arriveAirports;
    }


    /**
     * Gets the flightPrefs value for this TripComponent.
     * 
     * @return flightPrefs
     */
    public java.lang.String getFlightPrefs() {
        return flightPrefs;
    }


    /**
     * Sets the flightPrefs value for this TripComponent.
     * 
     * @param flightPrefs
     */
    public void setFlightPrefs(java.lang.String flightPrefs) {
        this.flightPrefs = flightPrefs;
    }


    /**
     * Gets the departBefore value for this TripComponent.
     * 
     * @return departBefore
     */
    public java.lang.String getDepartBefore() {
        return departBefore;
    }


    /**
     * Sets the departBefore value for this TripComponent.
     * 
     * @param departBefore
     */
    public void setDepartBefore(java.lang.String departBefore) {
        this.departBefore = departBefore;
    }


    /**
     * Gets the departAfter value for this TripComponent.
     * 
     * @return departAfter
     */
    public java.lang.String getDepartAfter() {
        return departAfter;
    }


    /**
     * Sets the departAfter value for this TripComponent.
     * 
     * @param departAfter
     */
    public void setDepartAfter(java.lang.String departAfter) {
        this.departAfter = departAfter;
    }


    /**
     * Gets the departOptimal value for this TripComponent.
     * 
     * @return departOptimal
     */
    public java.lang.String getDepartOptimal() {
        return departOptimal;
    }


    /**
     * Sets the departOptimal value for this TripComponent.
     * 
     * @param departOptimal
     */
    public void setDepartOptimal(java.lang.String departOptimal) {
        this.departOptimal = departOptimal;
    }


    /**
     * Gets the arriveBefore value for this TripComponent.
     * 
     * @return arriveBefore
     */
    public java.lang.String getArriveBefore() {
        return arriveBefore;
    }


    /**
     * Sets the arriveBefore value for this TripComponent.
     * 
     * @param arriveBefore
     */
    public void setArriveBefore(java.lang.String arriveBefore) {
        this.arriveBefore = arriveBefore;
    }


    /**
     * Gets the arriveAfter value for this TripComponent.
     * 
     * @return arriveAfter
     */
    public java.lang.String getArriveAfter() {
        return arriveAfter;
    }


    /**
     * Sets the arriveAfter value for this TripComponent.
     * 
     * @param arriveAfter
     */
    public void setArriveAfter(java.lang.String arriveAfter) {
        this.arriveAfter = arriveAfter;
    }


    /**
     * Gets the arriveOptimal value for this TripComponent.
     * 
     * @return arriveOptimal
     */
    public java.lang.String getArriveOptimal() {
        return arriveOptimal;
    }


    /**
     * Sets the arriveOptimal value for this TripComponent.
     * 
     * @param arriveOptimal
     */
    public void setArriveOptimal(java.lang.String arriveOptimal) {
        this.arriveOptimal = arriveOptimal;
    }


    /**
     * Gets the flightToMatch value for this TripComponent.
     * 
     * @return flightToMatch
     */
    public com.rightrez.FlightInfo getFlightToMatch() {
        return flightToMatch;
    }


    /**
     * Sets the flightToMatch value for this TripComponent.
     * 
     * @param flightToMatch
     */
    public void setFlightToMatch(com.rightrez.FlightInfo flightToMatch) {
        this.flightToMatch = flightToMatch;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TripComponent)) return false;
        TripComponent other = (TripComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.program==null && other.getProgram()==null) || 
             (this.program!=null &&
              this.program.equals(other.getProgram()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            this.numoptions == other.getNumoptions() &&
            ((this.carrierPrefs==null && other.getCarrierPrefs()==null) || 
             (this.carrierPrefs!=null &&
              java.util.Arrays.equals(this.carrierPrefs, other.getCarrierPrefs()))) &&
            this.showNonPreferredCarriers == other.isShowNonPreferredCarriers() &&
            this.usePublishedFares == other.isUsePublishedFares() &&
            ((this.fareType==null && other.getFareType()==null) || 
             (this.fareType!=null &&
              java.util.Arrays.equals(this.fareType, other.getFareType()))) &&
            this.useMarineFares == other.isUseMarineFares() &&
            ((this.componentType==null && other.getComponentType()==null) || 
             (this.componentType!=null &&
              this.componentType.equals(other.getComponentType()))) &&
            ((this.prevComponent==null && other.getPrevComponent()==null) || 
             (this.prevComponent!=null &&
              this.prevComponent.equals(other.getPrevComponent()))) &&
            ((this.nextComponent==null && other.getNextComponent()==null) || 
             (this.nextComponent!=null &&
              this.nextComponent.equals(other.getNextComponent()))) &&
            ((this.tripType==null && other.getTripType()==null) || 
             (this.tripType!=null &&
              this.tripType.equals(other.getTripType()))) &&
            ((this.departCity==null && other.getDepartCity()==null) || 
             (this.departCity!=null &&
              this.departCity.equals(other.getDepartCity()))) &&
            ((this.arriveCity==null && other.getArriveCity()==null) || 
             (this.arriveCity!=null &&
              this.arriveCity.equals(other.getArriveCity()))) &&
            ((this.serviceLevel==null && other.getServiceLevel()==null) || 
             (this.serviceLevel!=null &&
              this.serviceLevel.equals(other.getServiceLevel()))) &&
            ((this.serviceLevelChar==null && other.getServiceLevelChar()==null) || 
             (this.serviceLevelChar!=null &&
              this.serviceLevelChar.equals(other.getServiceLevelChar()))) &&
            ((this.departDate==null && other.getDepartDate()==null) || 
             (this.departDate!=null &&
              this.departDate.equals(other.getDepartDate()))) &&
            ((this.arriveDate==null && other.getArriveDate()==null) || 
             (this.arriveDate!=null &&
              this.arriveDate.equals(other.getArriveDate()))) &&
            ((this.departAirports==null && other.getDepartAirports()==null) || 
             (this.departAirports!=null &&
              java.util.Arrays.equals(this.departAirports, other.getDepartAirports()))) &&
            ((this.arriveAirports==null && other.getArriveAirports()==null) || 
             (this.arriveAirports!=null &&
              java.util.Arrays.equals(this.arriveAirports, other.getArriveAirports()))) &&
            ((this.flightPrefs==null && other.getFlightPrefs()==null) || 
             (this.flightPrefs!=null &&
              this.flightPrefs.equals(other.getFlightPrefs()))) &&
            ((this.departBefore==null && other.getDepartBefore()==null) || 
             (this.departBefore!=null &&
              this.departBefore.equals(other.getDepartBefore()))) &&
            ((this.departAfter==null && other.getDepartAfter()==null) || 
             (this.departAfter!=null &&
              this.departAfter.equals(other.getDepartAfter()))) &&
            ((this.departOptimal==null && other.getDepartOptimal()==null) || 
             (this.departOptimal!=null &&
              this.departOptimal.equals(other.getDepartOptimal()))) &&
            ((this.arriveBefore==null && other.getArriveBefore()==null) || 
             (this.arriveBefore!=null &&
              this.arriveBefore.equals(other.getArriveBefore()))) &&
            ((this.arriveAfter==null && other.getArriveAfter()==null) || 
             (this.arriveAfter!=null &&
              this.arriveAfter.equals(other.getArriveAfter()))) &&
            ((this.arriveOptimal==null && other.getArriveOptimal()==null) || 
             (this.arriveOptimal!=null &&
              this.arriveOptimal.equals(other.getArriveOptimal()))) &&
            ((this.flightToMatch==null && other.getFlightToMatch()==null) || 
             (this.flightToMatch!=null &&
              this.flightToMatch.equals(other.getFlightToMatch())));
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
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getProgram() != null) {
            _hashCode += getProgram().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        _hashCode += getNumoptions();
        if (getCarrierPrefs() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getCarrierPrefs());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getCarrierPrefs(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        _hashCode += (isShowNonPreferredCarriers() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUsePublishedFares() ? Boolean.TRUE : Boolean.FALSE).hashCode();
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
        _hashCode += (isUseMarineFares() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getComponentType() != null) {
            _hashCode += getComponentType().hashCode();
        }
        if (getPrevComponent() != null) {
            _hashCode += getPrevComponent().hashCode();
        }
        if (getNextComponent() != null) {
            _hashCode += getNextComponent().hashCode();
        }
        if (getTripType() != null) {
            _hashCode += getTripType().hashCode();
        }
        if (getDepartCity() != null) {
            _hashCode += getDepartCity().hashCode();
        }
        if (getArriveCity() != null) {
            _hashCode += getArriveCity().hashCode();
        }
        if (getServiceLevel() != null) {
            _hashCode += getServiceLevel().hashCode();
        }
        if (getServiceLevelChar() != null) {
            _hashCode += getServiceLevelChar().hashCode();
        }
        if (getDepartDate() != null) {
            _hashCode += getDepartDate().hashCode();
        }
        if (getArriveDate() != null) {
            _hashCode += getArriveDate().hashCode();
        }
        if (getDepartAirports() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getDepartAirports());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getDepartAirports(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getArriveAirports() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getArriveAirports());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getArriveAirports(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFlightPrefs() != null) {
            _hashCode += getFlightPrefs().hashCode();
        }
        if (getDepartBefore() != null) {
            _hashCode += getDepartBefore().hashCode();
        }
        if (getDepartAfter() != null) {
            _hashCode += getDepartAfter().hashCode();
        }
        if (getDepartOptimal() != null) {
            _hashCode += getDepartOptimal().hashCode();
        }
        if (getArriveBefore() != null) {
            _hashCode += getArriveBefore().hashCode();
        }
        if (getArriveAfter() != null) {
            _hashCode += getArriveAfter().hashCode();
        }
        if (getArriveOptimal() != null) {
            _hashCode += getArriveOptimal().hashCode();
        }
        if (getFlightToMatch() != null) {
            _hashCode += getFlightToMatch().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TripComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "TripComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("numoptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Numoptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("carrierPrefs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CarrierPrefs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showNonPreferredCarriers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ShowNonPreferredCarriers"));
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
        elemField.setFieldName("fareType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FareType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FareType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useMarineFares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "UseMarineFares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("componentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ComponentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tripType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "TripType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "TripDirectionType"));
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
        elemField.setFieldName("arriveCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ArriveCity"));
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
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DepartDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arriveDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ArriveDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departAirports");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DepartAirports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "DepartAirport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "DepartAirport"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arriveAirports");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ArriveAirports"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "ArriveAirport"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "ArriveAirport"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightPrefs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FlightPrefs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DepartBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DepartAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("departOptimal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "DepartOptimal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arriveBefore");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ArriveBefore"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arriveAfter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ArriveAfter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("arriveOptimal");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ArriveOptimal"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightToMatch");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FlightToMatch"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "FlightInfo"));
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
