/**
 * AvailabilityRequestComponent.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class AvailabilityRequestComponent  implements java.io.Serializable {
    private int startScreen;

    private java.lang.String company;

    private java.lang.String program;

    private java.lang.String product;

    private java.lang.String prev;

    private java.lang.String next;

    private java.lang.String availTime;

    private com.rightrez.AvailabilityTypes availType;

    private int componentUniqueKey;

    private com.rightrez.AvailabilityTuning tuning;

    private boolean showNonPreferredCarriers;

    private int numoptions;

    private com.rightrez.TripDirectionType tripType;

    private java.lang.String departCity;

    private java.lang.String arriveCity;

    private java.lang.String connectCity;

    private com.rightrez.ServiceLevel serviceLevel;

    private java.util.Calendar departDate;

    private java.util.Calendar arriveDate;

    private java.lang.String flightPrefs;

    private java.lang.String departBefore;

    private java.lang.String departAfter;

    private java.lang.String departOptimal;

    private java.lang.String arriveBefore;

    private java.lang.String arriveAfter;

    private java.lang.String arriveOptimal;

    private com.rightrez.FlightInfo flightToMatch;

    private java.util.Calendar fareDate;

    private java.lang.String flightNumber;

    private com.rightrez.RRZAirSegment[] blockFlights;

    private java.lang.String[] excludeCarriers;

    private com.rightrez.DepartAirport[] departAirports;

    private com.rightrez.ArriveAirport[] arriveAirports;

    private java.lang.String[] carrierPrefs;

    private boolean useAirSeaFares;

    private boolean useMarineFares;

    private boolean usePublishedFares;

    public AvailabilityRequestComponent() {
    }

    public AvailabilityRequestComponent(
           int startScreen,
           java.lang.String company,
           java.lang.String program,
           java.lang.String product,
           java.lang.String prev,
           java.lang.String next,
           java.lang.String availTime,
           com.rightrez.AvailabilityTypes availType,
           int componentUniqueKey,
           com.rightrez.AvailabilityTuning tuning,
           boolean showNonPreferredCarriers,
           int numoptions,
           com.rightrez.TripDirectionType tripType,
           java.lang.String departCity,
           java.lang.String arriveCity,
           java.lang.String connectCity,
           com.rightrez.ServiceLevel serviceLevel,
           java.util.Calendar departDate,
           java.util.Calendar arriveDate,
           java.lang.String flightPrefs,
           java.lang.String departBefore,
           java.lang.String departAfter,
           java.lang.String departOptimal,
           java.lang.String arriveBefore,
           java.lang.String arriveAfter,
           java.lang.String arriveOptimal,
           com.rightrez.FlightInfo flightToMatch,
           java.util.Calendar fareDate,
           java.lang.String flightNumber,
           com.rightrez.RRZAirSegment[] blockFlights,
           java.lang.String[] excludeCarriers,
           com.rightrez.DepartAirport[] departAirports,
           com.rightrez.ArriveAirport[] arriveAirports,
           java.lang.String[] carrierPrefs,
           boolean useAirSeaFares,
           boolean useMarineFares,
           boolean usePublishedFares) {
           this.startScreen = startScreen;
           this.company = company;
           this.program = program;
           this.product = product;
           this.prev = prev;
           this.next = next;
           this.availTime = availTime;
           this.availType = availType;
           this.componentUniqueKey = componentUniqueKey;
           this.tuning = tuning;
           this.showNonPreferredCarriers = showNonPreferredCarriers;
           this.numoptions = numoptions;
           this.tripType = tripType;
           this.departCity = departCity;
           this.arriveCity = arriveCity;
           this.connectCity = connectCity;
           this.serviceLevel = serviceLevel;
           this.departDate = departDate;
           this.arriveDate = arriveDate;
           this.flightPrefs = flightPrefs;
           this.departBefore = departBefore;
           this.departAfter = departAfter;
           this.departOptimal = departOptimal;
           this.arriveBefore = arriveBefore;
           this.arriveAfter = arriveAfter;
           this.arriveOptimal = arriveOptimal;
           this.flightToMatch = flightToMatch;
           this.fareDate = fareDate;
           this.flightNumber = flightNumber;
           this.blockFlights = blockFlights;
           this.excludeCarriers = excludeCarriers;
           this.departAirports = departAirports;
           this.arriveAirports = arriveAirports;
           this.carrierPrefs = carrierPrefs;
           this.useAirSeaFares = useAirSeaFares;
           this.useMarineFares = useMarineFares;
           this.usePublishedFares = usePublishedFares;
    }


    /**
     * Gets the startScreen value for this AvailabilityRequestComponent.
     * 
     * @return startScreen
     */
    public int getStartScreen() {
        return startScreen;
    }


    /**
     * Sets the startScreen value for this AvailabilityRequestComponent.
     * 
     * @param startScreen
     */
    public void setStartScreen(int startScreen) {
        this.startScreen = startScreen;
    }


    /**
     * Gets the company value for this AvailabilityRequestComponent.
     * 
     * @return company
     */
    public java.lang.String getCompany() {
        return company;
    }


    /**
     * Sets the company value for this AvailabilityRequestComponent.
     * 
     * @param company
     */
    public void setCompany(java.lang.String company) {
        this.company = company;
    }


    /**
     * Gets the program value for this AvailabilityRequestComponent.
     * 
     * @return program
     */
    public java.lang.String getProgram() {
        return program;
    }


    /**
     * Sets the program value for this AvailabilityRequestComponent.
     * 
     * @param program
     */
    public void setProgram(java.lang.String program) {
        this.program = program;
    }


    /**
     * Gets the product value for this AvailabilityRequestComponent.
     * 
     * @return product
     */
    public java.lang.String getProduct() {
        return product;
    }


    /**
     * Sets the product value for this AvailabilityRequestComponent.
     * 
     * @param product
     */
    public void setProduct(java.lang.String product) {
        this.product = product;
    }


    /**
     * Gets the prev value for this AvailabilityRequestComponent.
     * 
     * @return prev
     */
    public java.lang.String getPrev() {
        return prev;
    }


    /**
     * Sets the prev value for this AvailabilityRequestComponent.
     * 
     * @param prev
     */
    public void setPrev(java.lang.String prev) {
        this.prev = prev;
    }


    /**
     * Gets the next value for this AvailabilityRequestComponent.
     * 
     * @return next
     */
    public java.lang.String getNext() {
        return next;
    }


    /**
     * Sets the next value for this AvailabilityRequestComponent.
     * 
     * @param next
     */
    public void setNext(java.lang.String next) {
        this.next = next;
    }


    /**
     * Gets the availTime value for this AvailabilityRequestComponent.
     * 
     * @return availTime
     */
    public java.lang.String getAvailTime() {
        return availTime;
    }


    /**
     * Sets the availTime value for this AvailabilityRequestComponent.
     * 
     * @param availTime
     */
    public void setAvailTime(java.lang.String availTime) {
        this.availTime = availTime;
    }


    /**
     * Gets the availType value for this AvailabilityRequestComponent.
     * 
     * @return availType
     */
    public com.rightrez.AvailabilityTypes getAvailType() {
        return availType;
    }


    /**
     * Sets the availType value for this AvailabilityRequestComponent.
     * 
     * @param availType
     */
    public void setAvailType(com.rightrez.AvailabilityTypes availType) {
        this.availType = availType;
    }


    /**
     * Gets the componentUniqueKey value for this AvailabilityRequestComponent.
     * 
     * @return componentUniqueKey
     */
    public int getComponentUniqueKey() {
        return componentUniqueKey;
    }


    /**
     * Sets the componentUniqueKey value for this AvailabilityRequestComponent.
     * 
     * @param componentUniqueKey
     */
    public void setComponentUniqueKey(int componentUniqueKey) {
        this.componentUniqueKey = componentUniqueKey;
    }


    /**
     * Gets the tuning value for this AvailabilityRequestComponent.
     * 
     * @return tuning
     */
    public com.rightrez.AvailabilityTuning getTuning() {
        return tuning;
    }


    /**
     * Sets the tuning value for this AvailabilityRequestComponent.
     * 
     * @param tuning
     */
    public void setTuning(com.rightrez.AvailabilityTuning tuning) {
        this.tuning = tuning;
    }


    /**
     * Gets the showNonPreferredCarriers value for this AvailabilityRequestComponent.
     * 
     * @return showNonPreferredCarriers
     */
    public boolean isShowNonPreferredCarriers() {
        return showNonPreferredCarriers;
    }


    /**
     * Sets the showNonPreferredCarriers value for this AvailabilityRequestComponent.
     * 
     * @param showNonPreferredCarriers
     */
    public void setShowNonPreferredCarriers(boolean showNonPreferredCarriers) {
        this.showNonPreferredCarriers = showNonPreferredCarriers;
    }


    /**
     * Gets the numoptions value for this AvailabilityRequestComponent.
     * 
     * @return numoptions
     */
    public int getNumoptions() {
        return numoptions;
    }


    /**
     * Sets the numoptions value for this AvailabilityRequestComponent.
     * 
     * @param numoptions
     */
    public void setNumoptions(int numoptions) {
        this.numoptions = numoptions;
    }


    /**
     * Gets the tripType value for this AvailabilityRequestComponent.
     * 
     * @return tripType
     */
    public com.rightrez.TripDirectionType getTripType() {
        return tripType;
    }


    /**
     * Sets the tripType value for this AvailabilityRequestComponent.
     * 
     * @param tripType
     */
    public void setTripType(com.rightrez.TripDirectionType tripType) {
        this.tripType = tripType;
    }


    /**
     * Gets the departCity value for this AvailabilityRequestComponent.
     * 
     * @return departCity
     */
    public java.lang.String getDepartCity() {
        return departCity;
    }


    /**
     * Sets the departCity value for this AvailabilityRequestComponent.
     * 
     * @param departCity
     */
    public void setDepartCity(java.lang.String departCity) {
        this.departCity = departCity;
    }


    /**
     * Gets the arriveCity value for this AvailabilityRequestComponent.
     * 
     * @return arriveCity
     */
    public java.lang.String getArriveCity() {
        return arriveCity;
    }


    /**
     * Sets the arriveCity value for this AvailabilityRequestComponent.
     * 
     * @param arriveCity
     */
    public void setArriveCity(java.lang.String arriveCity) {
        this.arriveCity = arriveCity;
    }


    /**
     * Gets the connectCity value for this AvailabilityRequestComponent.
     * 
     * @return connectCity
     */
    public java.lang.String getConnectCity() {
        return connectCity;
    }


    /**
     * Sets the connectCity value for this AvailabilityRequestComponent.
     * 
     * @param connectCity
     */
    public void setConnectCity(java.lang.String connectCity) {
        this.connectCity = connectCity;
    }


    /**
     * Gets the serviceLevel value for this AvailabilityRequestComponent.
     * 
     * @return serviceLevel
     */
    public com.rightrez.ServiceLevel getServiceLevel() {
        return serviceLevel;
    }


    /**
     * Sets the serviceLevel value for this AvailabilityRequestComponent.
     * 
     * @param serviceLevel
     */
    public void setServiceLevel(com.rightrez.ServiceLevel serviceLevel) {
        this.serviceLevel = serviceLevel;
    }


    /**
     * Gets the departDate value for this AvailabilityRequestComponent.
     * 
     * @return departDate
     */
    public java.util.Calendar getDepartDate() {
        return departDate;
    }


    /**
     * Sets the departDate value for this AvailabilityRequestComponent.
     * 
     * @param departDate
     */
    public void setDepartDate(java.util.Calendar departDate) {
        this.departDate = departDate;
    }


    /**
     * Gets the arriveDate value for this AvailabilityRequestComponent.
     * 
     * @return arriveDate
     */
    public java.util.Calendar getArriveDate() {
        return arriveDate;
    }


    /**
     * Sets the arriveDate value for this AvailabilityRequestComponent.
     * 
     * @param arriveDate
     */
    public void setArriveDate(java.util.Calendar arriveDate) {
        this.arriveDate = arriveDate;
    }


    /**
     * Gets the flightPrefs value for this AvailabilityRequestComponent.
     * 
     * @return flightPrefs
     */
    public java.lang.String getFlightPrefs() {
        return flightPrefs;
    }


    /**
     * Sets the flightPrefs value for this AvailabilityRequestComponent.
     * 
     * @param flightPrefs
     */
    public void setFlightPrefs(java.lang.String flightPrefs) {
        this.flightPrefs = flightPrefs;
    }


    /**
     * Gets the departBefore value for this AvailabilityRequestComponent.
     * 
     * @return departBefore
     */
    public java.lang.String getDepartBefore() {
        return departBefore;
    }


    /**
     * Sets the departBefore value for this AvailabilityRequestComponent.
     * 
     * @param departBefore
     */
    public void setDepartBefore(java.lang.String departBefore) {
        this.departBefore = departBefore;
    }


    /**
     * Gets the departAfter value for this AvailabilityRequestComponent.
     * 
     * @return departAfter
     */
    public java.lang.String getDepartAfter() {
        return departAfter;
    }


    /**
     * Sets the departAfter value for this AvailabilityRequestComponent.
     * 
     * @param departAfter
     */
    public void setDepartAfter(java.lang.String departAfter) {
        this.departAfter = departAfter;
    }


    /**
     * Gets the departOptimal value for this AvailabilityRequestComponent.
     * 
     * @return departOptimal
     */
    public java.lang.String getDepartOptimal() {
        return departOptimal;
    }


    /**
     * Sets the departOptimal value for this AvailabilityRequestComponent.
     * 
     * @param departOptimal
     */
    public void setDepartOptimal(java.lang.String departOptimal) {
        this.departOptimal = departOptimal;
    }


    /**
     * Gets the arriveBefore value for this AvailabilityRequestComponent.
     * 
     * @return arriveBefore
     */
    public java.lang.String getArriveBefore() {
        return arriveBefore;
    }


    /**
     * Sets the arriveBefore value for this AvailabilityRequestComponent.
     * 
     * @param arriveBefore
     */
    public void setArriveBefore(java.lang.String arriveBefore) {
        this.arriveBefore = arriveBefore;
    }


    /**
     * Gets the arriveAfter value for this AvailabilityRequestComponent.
     * 
     * @return arriveAfter
     */
    public java.lang.String getArriveAfter() {
        return arriveAfter;
    }


    /**
     * Sets the arriveAfter value for this AvailabilityRequestComponent.
     * 
     * @param arriveAfter
     */
    public void setArriveAfter(java.lang.String arriveAfter) {
        this.arriveAfter = arriveAfter;
    }


    /**
     * Gets the arriveOptimal value for this AvailabilityRequestComponent.
     * 
     * @return arriveOptimal
     */
    public java.lang.String getArriveOptimal() {
        return arriveOptimal;
    }


    /**
     * Sets the arriveOptimal value for this AvailabilityRequestComponent.
     * 
     * @param arriveOptimal
     */
    public void setArriveOptimal(java.lang.String arriveOptimal) {
        this.arriveOptimal = arriveOptimal;
    }


    /**
     * Gets the flightToMatch value for this AvailabilityRequestComponent.
     * 
     * @return flightToMatch
     */
    public com.rightrez.FlightInfo getFlightToMatch() {
        return flightToMatch;
    }


    /**
     * Sets the flightToMatch value for this AvailabilityRequestComponent.
     * 
     * @param flightToMatch
     */
    public void setFlightToMatch(com.rightrez.FlightInfo flightToMatch) {
        this.flightToMatch = flightToMatch;
    }


    /**
     * Gets the fareDate value for this AvailabilityRequestComponent.
     * 
     * @return fareDate
     */
    public java.util.Calendar getFareDate() {
        return fareDate;
    }


    /**
     * Sets the fareDate value for this AvailabilityRequestComponent.
     * 
     * @param fareDate
     */
    public void setFareDate(java.util.Calendar fareDate) {
        this.fareDate = fareDate;
    }


    /**
     * Gets the flightNumber value for this AvailabilityRequestComponent.
     * 
     * @return flightNumber
     */
    public java.lang.String getFlightNumber() {
        return flightNumber;
    }


    /**
     * Sets the flightNumber value for this AvailabilityRequestComponent.
     * 
     * @param flightNumber
     */
    public void setFlightNumber(java.lang.String flightNumber) {
        this.flightNumber = flightNumber;
    }


    /**
     * Gets the blockFlights value for this AvailabilityRequestComponent.
     * 
     * @return blockFlights
     */
    public com.rightrez.RRZAirSegment[] getBlockFlights() {
        return blockFlights;
    }


    /**
     * Sets the blockFlights value for this AvailabilityRequestComponent.
     * 
     * @param blockFlights
     */
    public void setBlockFlights(com.rightrez.RRZAirSegment[] blockFlights) {
        this.blockFlights = blockFlights;
    }


    /**
     * Gets the excludeCarriers value for this AvailabilityRequestComponent.
     * 
     * @return excludeCarriers
     */
    public java.lang.String[] getExcludeCarriers() {
        return excludeCarriers;
    }


    /**
     * Sets the excludeCarriers value for this AvailabilityRequestComponent.
     * 
     * @param excludeCarriers
     */
    public void setExcludeCarriers(java.lang.String[] excludeCarriers) {
        this.excludeCarriers = excludeCarriers;
    }


    /**
     * Gets the departAirports value for this AvailabilityRequestComponent.
     * 
     * @return departAirports
     */
    public com.rightrez.DepartAirport[] getDepartAirports() {
        return departAirports;
    }


    /**
     * Sets the departAirports value for this AvailabilityRequestComponent.
     * 
     * @param departAirports
     */
    public void setDepartAirports(com.rightrez.DepartAirport[] departAirports) {
        this.departAirports = departAirports;
    }


    /**
     * Gets the arriveAirports value for this AvailabilityRequestComponent.
     * 
     * @return arriveAirports
     */
    public com.rightrez.ArriveAirport[] getArriveAirports() {
        return arriveAirports;
    }


    /**
     * Sets the arriveAirports value for this AvailabilityRequestComponent.
     * 
     * @param arriveAirports
     */
    public void setArriveAirports(com.rightrez.ArriveAirport[] arriveAirports) {
        this.arriveAirports = arriveAirports;
    }


    /**
     * Gets the carrierPrefs value for this AvailabilityRequestComponent.
     * 
     * @return carrierPrefs
     */
    public java.lang.String[] getCarrierPrefs() {
        return carrierPrefs;
    }


    /**
     * Sets the carrierPrefs value for this AvailabilityRequestComponent.
     * 
     * @param carrierPrefs
     */
    public void setCarrierPrefs(java.lang.String[] carrierPrefs) {
        this.carrierPrefs = carrierPrefs;
    }


    /**
     * Gets the useAirSeaFares value for this AvailabilityRequestComponent.
     * 
     * @return useAirSeaFares
     */
    public boolean isUseAirSeaFares() {
        return useAirSeaFares;
    }


    /**
     * Sets the useAirSeaFares value for this AvailabilityRequestComponent.
     * 
     * @param useAirSeaFares
     */
    public void setUseAirSeaFares(boolean useAirSeaFares) {
        this.useAirSeaFares = useAirSeaFares;
    }


    /**
     * Gets the useMarineFares value for this AvailabilityRequestComponent.
     * 
     * @return useMarineFares
     */
    public boolean isUseMarineFares() {
        return useMarineFares;
    }


    /**
     * Sets the useMarineFares value for this AvailabilityRequestComponent.
     * 
     * @param useMarineFares
     */
    public void setUseMarineFares(boolean useMarineFares) {
        this.useMarineFares = useMarineFares;
    }


    /**
     * Gets the usePublishedFares value for this AvailabilityRequestComponent.
     * 
     * @return usePublishedFares
     */
    public boolean isUsePublishedFares() {
        return usePublishedFares;
    }


    /**
     * Sets the usePublishedFares value for this AvailabilityRequestComponent.
     * 
     * @param usePublishedFares
     */
    public void setUsePublishedFares(boolean usePublishedFares) {
        this.usePublishedFares = usePublishedFares;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailabilityRequestComponent)) return false;
        AvailabilityRequestComponent other = (AvailabilityRequestComponent) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.startScreen == other.getStartScreen() &&
            ((this.company==null && other.getCompany()==null) || 
             (this.company!=null &&
              this.company.equals(other.getCompany()))) &&
            ((this.program==null && other.getProgram()==null) || 
             (this.program!=null &&
              this.program.equals(other.getProgram()))) &&
            ((this.product==null && other.getProduct()==null) || 
             (this.product!=null &&
              this.product.equals(other.getProduct()))) &&
            ((this.prev==null && other.getPrev()==null) || 
             (this.prev!=null &&
              this.prev.equals(other.getPrev()))) &&
            ((this.next==null && other.getNext()==null) || 
             (this.next!=null &&
              this.next.equals(other.getNext()))) &&
            ((this.availTime==null && other.getAvailTime()==null) || 
             (this.availTime!=null &&
              this.availTime.equals(other.getAvailTime()))) &&
            ((this.availType==null && other.getAvailType()==null) || 
             (this.availType!=null &&
              this.availType.equals(other.getAvailType()))) &&
            this.componentUniqueKey == other.getComponentUniqueKey() &&
            ((this.tuning==null && other.getTuning()==null) || 
             (this.tuning!=null &&
              this.tuning.equals(other.getTuning()))) &&
            this.showNonPreferredCarriers == other.isShowNonPreferredCarriers() &&
            this.numoptions == other.getNumoptions() &&
            ((this.tripType==null && other.getTripType()==null) || 
             (this.tripType!=null &&
              this.tripType.equals(other.getTripType()))) &&
            ((this.departCity==null && other.getDepartCity()==null) || 
             (this.departCity!=null &&
              this.departCity.equals(other.getDepartCity()))) &&
            ((this.arriveCity==null && other.getArriveCity()==null) || 
             (this.arriveCity!=null &&
              this.arriveCity.equals(other.getArriveCity()))) &&
            ((this.connectCity==null && other.getConnectCity()==null) || 
             (this.connectCity!=null &&
              this.connectCity.equals(other.getConnectCity()))) &&
            ((this.serviceLevel==null && other.getServiceLevel()==null) || 
             (this.serviceLevel!=null &&
              this.serviceLevel.equals(other.getServiceLevel()))) &&
            ((this.departDate==null && other.getDepartDate()==null) || 
             (this.departDate!=null &&
              this.departDate.equals(other.getDepartDate()))) &&
            ((this.arriveDate==null && other.getArriveDate()==null) || 
             (this.arriveDate!=null &&
              this.arriveDate.equals(other.getArriveDate()))) &&
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
              this.flightToMatch.equals(other.getFlightToMatch()))) &&
            ((this.fareDate==null && other.getFareDate()==null) || 
             (this.fareDate!=null &&
              this.fareDate.equals(other.getFareDate()))) &&
            ((this.flightNumber==null && other.getFlightNumber()==null) || 
             (this.flightNumber!=null &&
              this.flightNumber.equals(other.getFlightNumber()))) &&
            ((this.blockFlights==null && other.getBlockFlights()==null) || 
             (this.blockFlights!=null &&
              java.util.Arrays.equals(this.blockFlights, other.getBlockFlights()))) &&
            ((this.excludeCarriers==null && other.getExcludeCarriers()==null) || 
             (this.excludeCarriers!=null &&
              java.util.Arrays.equals(this.excludeCarriers, other.getExcludeCarriers()))) &&
            ((this.departAirports==null && other.getDepartAirports()==null) || 
             (this.departAirports!=null &&
              java.util.Arrays.equals(this.departAirports, other.getDepartAirports()))) &&
            ((this.arriveAirports==null && other.getArriveAirports()==null) || 
             (this.arriveAirports!=null &&
              java.util.Arrays.equals(this.arriveAirports, other.getArriveAirports()))) &&
            ((this.carrierPrefs==null && other.getCarrierPrefs()==null) || 
             (this.carrierPrefs!=null &&
              java.util.Arrays.equals(this.carrierPrefs, other.getCarrierPrefs()))) &&
            this.useAirSeaFares == other.isUseAirSeaFares() &&
            this.useMarineFares == other.isUseMarineFares() &&
            this.usePublishedFares == other.isUsePublishedFares();
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
        _hashCode += getStartScreen();
        if (getCompany() != null) {
            _hashCode += getCompany().hashCode();
        }
        if (getProgram() != null) {
            _hashCode += getProgram().hashCode();
        }
        if (getProduct() != null) {
            _hashCode += getProduct().hashCode();
        }
        if (getPrev() != null) {
            _hashCode += getPrev().hashCode();
        }
        if (getNext() != null) {
            _hashCode += getNext().hashCode();
        }
        if (getAvailTime() != null) {
            _hashCode += getAvailTime().hashCode();
        }
        if (getAvailType() != null) {
            _hashCode += getAvailType().hashCode();
        }
        _hashCode += getComponentUniqueKey();
        if (getTuning() != null) {
            _hashCode += getTuning().hashCode();
        }
        _hashCode += (isShowNonPreferredCarriers() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += getNumoptions();
        if (getTripType() != null) {
            _hashCode += getTripType().hashCode();
        }
        if (getDepartCity() != null) {
            _hashCode += getDepartCity().hashCode();
        }
        if (getArriveCity() != null) {
            _hashCode += getArriveCity().hashCode();
        }
        if (getConnectCity() != null) {
            _hashCode += getConnectCity().hashCode();
        }
        if (getServiceLevel() != null) {
            _hashCode += getServiceLevel().hashCode();
        }
        if (getDepartDate() != null) {
            _hashCode += getDepartDate().hashCode();
        }
        if (getArriveDate() != null) {
            _hashCode += getArriveDate().hashCode();
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
        if (getFareDate() != null) {
            _hashCode += getFareDate().hashCode();
        }
        if (getFlightNumber() != null) {
            _hashCode += getFlightNumber().hashCode();
        }
        if (getBlockFlights() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBlockFlights());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getBlockFlights(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getExcludeCarriers() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getExcludeCarriers());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getExcludeCarriers(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
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
        _hashCode += (isUseAirSeaFares() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUseMarineFares() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isUsePublishedFares() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AvailabilityRequestComponent.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityRequestComponent"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startScreen");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "StartScreen"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("prev");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Prev"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("next");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Next"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AvailTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "AvailType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityTypes"));
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
        elemField.setFieldName("tuning");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Tuning"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityTuning"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("showNonPreferredCarriers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ShowNonPreferredCarriers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numoptions");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "Numoptions"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
        elemField.setFieldName("connectCity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ConnectCity"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fareDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FareDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flightNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "FlightNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("blockFlights");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "BlockFlights"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://rightrez.com/", "RRZAirSegment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "RRZAirSegment"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("excludeCarriers");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "ExcludeCarriers"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "string"));
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
        elemField.setFieldName("carrierPrefs");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "CarrierPrefs"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://rightrez.com/", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useAirSeaFares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "UseAirSeaFares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("useMarineFares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "UseMarineFares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usePublishedFares");
        elemField.setXmlName(new javax.xml.namespace.QName("http://rightrez.com/", "UsePublishedFares"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
