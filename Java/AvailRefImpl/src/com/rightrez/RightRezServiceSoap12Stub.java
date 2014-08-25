/**
 * RightRezServiceSoap12Stub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public class RightRezServiceSoap12Stub extends org.apache.axis.client.Stub implements com.rightrez.RightRezServiceSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[8];
        _initOperationDesc1();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WebBookingRequestInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://rightrez.com/", "pnrRequestInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://rightrez.com/", "CreatePNRRequest"), com.rightrez.CreatePNRRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://rightrez.com/", "WebBookingRequestInformationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetWebBookingRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://rightrez.com/", "id"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rightrez.com/", "CreatePNRRequest"));
        oper.setReturnClass(com.rightrez.CreatePNRRequest.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://rightrez.com/", "GetWebBookingRequestResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetWebBookingRequestFromBooking");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://rightrez.com/", "bookingNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rightrez.com/", "CreatePNRRequest"));
        oper.setReturnClass(com.rightrez.CreatePNRRequest.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://rightrez.com/", "GetWebBookingRequestFromBookingResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("BookingRequest");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://rightrez.com/", "bookingRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://rightrez.com/", "BookingRequest"), com.rightrez.BookingRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rightrez.com/", "BookingResponse"));
        oper.setReturnClass(com.rightrez.BookingResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://rightrez.com/", "BookingRequestResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetFlights");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://rightrez.com/", "availRequest"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityRequest"), com.rightrez.AvailabilityRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityResponse"));
        oper.setReturnClass(com.rightrez.AvailabilityResponse.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://rightrez.com/", "GetFlightsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("IsBookingNumberExists");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://rightrez.com/", "bookingNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://rightrez.com/", "IsBookingNumberExistsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GetRequestIdFromBookingNo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://rightrez.com/", "bookingNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://rightrez.com/", "GetRequestIdFromBookingNoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("WebBookingRequestDemoInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("http://rightrez.com/", "pnrRequestInformation"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://rightrez.com/", "CreatePNRRequest"), com.rightrez.CreatePNRRequest.class, false, false);
        param.setOmittable(true);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("http://rightrez.com/", "WebBookingRequestDemoInformationResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

    }

    public RightRezServiceSoap12Stub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public RightRezServiceSoap12Stub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public RightRezServiceSoap12Stub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        addBindings0();
        addBindings1();
    }

    private void addBindings0() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "char");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.UnsignedShort.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "guid");
            cachedSerQNames.add(qName);
            cls = java.lang.String.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(org.apache.axis.encoding.ser.BaseSerializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleSerializerFactory.class, cls, qName));
            cachedDeserFactories.add(org.apache.axis.encoding.ser.BaseDeserializerFactory.createFactory(org.apache.axis.encoding.ser.SimpleDeserializerFactory.class, cls, qName));

            qName = new javax.xml.namespace.QName("http://rightrez.com/", ">BookingRequest");
            cachedSerQNames.add(qName);
            cls = com.rightrez.BookingRequestType0.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", ">BookingRequestResponse");
            cachedSerQNames.add(qName);
            cls = com.rightrez.BookingRequestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", ">GetFlights");
            cachedSerQNames.add(qName);
            cls = com.rightrez.GetFlights.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", ">GetFlightsResponse");
            cachedSerQNames.add(qName);
            cls = com.rightrez.GetFlightsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", ">GetRequestIdFromBookingNo");
            cachedSerQNames.add(qName);
            cls = com.rightrez.GetRequestIdFromBookingNo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", ">GetRequestIdFromBookingNoResponse");
            cachedSerQNames.add(qName);
            cls = com.rightrez.GetRequestIdFromBookingNoResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", ">GetWebBookingRequest");
            cachedSerQNames.add(qName);
            cls = com.rightrez.GetWebBookingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", ">GetWebBookingRequestFromBooking");
            cachedSerQNames.add(qName);
            cls = com.rightrez.GetWebBookingRequestFromBooking.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", ">GetWebBookingRequestFromBookingResponse");
            cachedSerQNames.add(qName);
            cls = com.rightrez.GetWebBookingRequestFromBookingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", ">GetWebBookingRequestResponse");
            cachedSerQNames.add(qName);
            cls = com.rightrez.GetWebBookingRequestResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", ">IsBookingNumberExists");
            cachedSerQNames.add(qName);
            cls = com.rightrez.IsBookingNumberExists.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", ">IsBookingNumberExistsResponse");
            cachedSerQNames.add(qName);
            cls = com.rightrez.IsBookingNumberExistsResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", ">WebBookingRequestDemoInformation");
            cachedSerQNames.add(qName);
            cls = com.rightrez.WebBookingRequestDemoInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", ">WebBookingRequestDemoInformationResponse");
            cachedSerQNames.add(qName);
            cls = com.rightrez.WebBookingRequestDemoInformationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", ">WebBookingRequestInformation");
            cachedSerQNames.add(qName);
            cls = com.rightrez.WebBookingRequestInformation.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", ">WebBookingRequestInformationResponse");
            cachedSerQNames.add(qName);
            cls = com.rightrez.WebBookingRequestInformationResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "AirportChargeItem");
            cachedSerQNames.add(qName);
            cls = com.rightrez.AirportChargeItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfAirportChargeItem");
            cachedSerQNames.add(qName);
            cls = com.rightrez.AirportChargeItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "AirportChargeItem");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "AirportChargeItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfAnyType");
            cachedSerQNames.add(qName);
            cls = java.lang.Object[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "anyType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfArrayOfAnyType");
            cachedSerQNames.add(qName);
            cls = java.lang.Object[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfAnyType");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfAnyType");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfArrayOfFlightInfo");
            cachedSerQNames.add(qName);
            cls = com.rightrez.FlightInfo[][].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfFlightInfo");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfFlightInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfArriveAirport");
            cachedSerQNames.add(qName);
            cls = com.rightrez.ArriveAirport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArriveAirport");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "ArriveAirport");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfAvailabilityRequestComponent");
            cachedSerQNames.add(qName);
            cls = com.rightrez.AvailabilityRequestComponent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityRequestComponent");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityRequestComponent");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfAvailabilityRequestDependency");
            cachedSerQNames.add(qName);
            cls = com.rightrez.AvailabilityRequestDependency[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityRequestDependency");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityRequestDependency");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfAvailabilityResponseComponent");
            cachedSerQNames.add(qName);
            cls = com.rightrez.AvailabilityResponseComponent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityResponseComponent");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityResponseComponent");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfBookingRequestComponent");
            cachedSerQNames.add(qName);
            cls = com.rightrez.BookingRequestComponent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "BookingRequestComponent");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "BookingRequestComponent");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfBookingResponseComponent");
            cachedSerQNames.add(qName);
            cls = com.rightrez.BookingResponseComponent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "BookingResponseComponent");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "BookingResponseComponent");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfChar");
            cachedSerQNames.add(qName);
            cls = org.apache.axis.types.UnsignedShort[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://microsoft.com/wsdl/types/", "char");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "char");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfCRSQueue");
            cachedSerQNames.add(qName);
            cls = com.rightrez.CRSQueue[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "CRSQueue");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "CRSQueue");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfCustomContent");
            cachedSerQNames.add(qName);
            cls = com.rightrez.CustomContent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "CustomContent");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "CustomContent");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfDepartAirport");
            cachedSerQNames.add(qName);
            cls = com.rightrez.DepartAirport[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "DepartAirport");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "DepartAirport");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfFareRule");
            cachedSerQNames.add(qName);
            cls = com.rightrez.FareRule[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "FareRule");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "FareRule");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfFaresItem");
            cachedSerQNames.add(qName);
            cls = com.rightrez.FaresItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "FaresItem");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "FaresItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfFlightInfo");
            cachedSerQNames.add(qName);
            cls = com.rightrez.FlightInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "FlightInfo");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "FlightInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfFlightLoggingPair");
            cachedSerQNames.add(qName);
            cls = com.rightrez.FlightLoggingPair[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "FlightLoggingPair");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "FlightLoggingPair");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfFlightPairing");
            cachedSerQNames.add(qName);
            cls = com.rightrez.FlightPairing[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "FlightPairing");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "FlightPairing");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfFrequentFlyerInfo");
            cachedSerQNames.add(qName);
            cls = com.rightrez.FrequentFlyerInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "FrequentFlyerInfo");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "FrequentFlyerInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "int");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfLinearFareDestinationInfo");
            cachedSerQNames.add(qName);
            cls = com.rightrez.LinearFareDestinationInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "LinearFareDestinationInfo");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "LinearFareDestinationInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfPassengerAccountingItem");
            cachedSerQNames.add(qName);
            cls = com.rightrez.PassengerAccountingItem[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "PassengerAccountingItem");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "PassengerAccountingItem");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfPnrEmail");
            cachedSerQNames.add(qName);
            cls = com.rightrez.PnrEmail[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "PnrEmail");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "PnrEmail");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfPnrTicketInfo");
            cachedSerQNames.add(qName);
            cls = com.rightrez.PnrTicketInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "PnrTicketInfo");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "PnrTicketInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfPricingInfo");
            cachedSerQNames.add(qName);
            cls = com.rightrez.PricingInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "PricingInfo");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "PricingInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfRawOSI");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawOSI[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawOSI");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "RawOSI");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfRawPassengerName");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawPassengerName[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawPassengerName");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "RawPassengerName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfRawPnrRemark");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawPnrRemark[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawPnrRemark");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "RawPnrRemark");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfRawSeat");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawSeat[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawSeat");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "RawSeat");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfRawSegment");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawSegment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawSegment");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "RawSegment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfRawSSR");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawSSR[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawSSR");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "RawSSR");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfRawTicket");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawTicket[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawTicket");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "RawTicket");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfRRZAirSegment");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RRZAirSegment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RRZAirSegment");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "RRZAirSegment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfRRZName");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RRZName[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RRZName");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "RRZName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfRRZSeat");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RRZSeat[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RRZSeat");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "RRZSeat");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfRRZTicket");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RRZTicket[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RRZTicket");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "RRZTicket");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfSeat");
            cachedSerQNames.add(qName);
            cls = com.rightrez.Seat[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "Seat");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "Seat");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfSeatRow");
            cachedSerQNames.add(qName);
            cls = com.rightrez.SeatRow[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "SeatRow");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "SeatRow");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfSerializableKeyValuePairOfAvailabilityRequestDependencyAvailabilityResponseRoundTrip");
            cachedSerQNames.add(qName);
            cls = com.rightrez.SerializableKeyValuePairOfAvailabilityRequestDependencyAvailabilityResponseRoundTrip[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfAvailabilityRequestDependencyAvailabilityResponseRoundTrip");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfAvailabilityRequestDependencyAvailabilityResponseRoundTrip");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfSerializableKeyValuePairOfFlightValidationStatusListOfFlightPairing");
            cachedSerQNames.add(qName);
            cls = com.rightrez.SerializableKeyValuePairOfFlightValidationStatusListOfFlightPairing[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfFlightValidationStatusListOfFlightPairing");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfFlightValidationStatusListOfFlightPairing");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfSerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip");
            cachedSerQNames.add(qName);
            cls = com.rightrez.SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfSerializableKeyValuePairOfInt32RawAirSegment");
            cachedSerQNames.add(qName);
            cls = com.rightrez.SerializableKeyValuePairOfInt32RawAirSegment[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfInt32RawAirSegment");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfInt32RawAirSegment");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfSerializableKeyValuePairOfServiceLevelMoneyAmount");
            cachedSerQNames.add(qName);
            cls = com.rightrez.SerializableKeyValuePairOfServiceLevelMoneyAmount[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfServiceLevelMoneyAmount");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfServiceLevelMoneyAmount");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfSerializableKeyValuePairOfStringString");
            cachedSerQNames.add(qName);
            cls = com.rightrez.SerializableKeyValuePairOfStringString[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfStringString");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfStringString");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfStopCity");
            cachedSerQNames.add(qName);
            cls = com.rightrez.StopCity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "StopCity");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "StopCity");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfTaxInfoForPricing");
            cachedSerQNames.add(qName);
            cls = com.rightrez.TaxInfoForPricing[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "TaxInfoForPricing");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "TaxInfoForPricing");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArrayOfTripComponent");
            cachedSerQNames.add(qName);
            cls = com.rightrez.TripComponent[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "TripComponent");
            qName2 = new javax.xml.namespace.QName("http://rightrez.com/", "TripComponent");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ArriveAirport");
            cachedSerQNames.add(qName);
            cls = com.rightrez.ArriveAirport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityRequest");
            cachedSerQNames.add(qName);
            cls = com.rightrez.AvailabilityRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityRequestComponent");
            cachedSerQNames.add(qName);
            cls = com.rightrez.AvailabilityRequestComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityRequestDependency");
            cachedSerQNames.add(qName);
            cls = com.rightrez.AvailabilityRequestDependency.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityResponse");
            cachedSerQNames.add(qName);
            cls = com.rightrez.AvailabilityResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityResponseComponent");
            cachedSerQNames.add(qName);
            cls = com.rightrez.AvailabilityResponseComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityResponseRoundTrip");
            cachedSerQNames.add(qName);
            cls = com.rightrez.AvailabilityResponseRoundTrip.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityTuning");
            cachedSerQNames.add(qName);
            cls = com.rightrez.AvailabilityTuning.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "AvailabilityTypes");
            cachedSerQNames.add(qName);
            cls = com.rightrez.AvailabilityTypes.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "BookingRequest");
            cachedSerQNames.add(qName);
            cls = com.rightrez.BookingRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "BookingRequestComponent");
            cachedSerQNames.add(qName);
            cls = com.rightrez.BookingRequestComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "BookingResponse");
            cachedSerQNames.add(qName);
            cls = com.rightrez.BookingResponse.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "BookingResponseComponent");
            cachedSerQNames.add(qName);
            cls = com.rightrez.BookingResponseComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "CreatePNRRequest");
            cachedSerQNames.add(qName);
            cls = com.rightrez.CreatePNRRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "CRSQueue");
            cachedSerQNames.add(qName);
            cls = com.rightrez.CRSQueue.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "CurrencyInfo");
            cachedSerQNames.add(qName);
            cls = com.rightrez.CurrencyInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "CustomContent");
            cachedSerQNames.add(qName);
            cls = com.rightrez.CustomContent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "DepartAirport");
            cachedSerQNames.add(qName);
            cls = com.rightrez.DepartAirport.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "FareRule");
            cachedSerQNames.add(qName);
            cls = com.rightrez.FareRule.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "FaresItem");
            cachedSerQNames.add(qName);
            cls = com.rightrez.FaresItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "FareType");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(simplelistsf);
            cachedDeserFactories.add(simplelistdf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "FareType>null");
            cachedSerQNames.add(qName);
            cls = com.rightrez.FareTypeNull.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "FlightInfo");
            cachedSerQNames.add(qName);
            cls = com.rightrez.FlightInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "FlightLoggingPair");
            cachedSerQNames.add(qName);
            cls = com.rightrez.FlightLoggingPair.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "FlightPairing");
            cachedSerQNames.add(qName);
            cls = com.rightrez.FlightPairing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "FlightTypeEnum");
            cachedSerQNames.add(qName);
            cls = com.rightrez.FlightTypeEnum.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "FlightValidationStatus");
            cachedSerQNames.add(qName);
            cls = com.rightrez.FlightValidationStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "FrequentFlyerInfo");
            cachedSerQNames.add(qName);
            cls = com.rightrez.FrequentFlyerInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "GDSTicketedStatus");
            cachedSerQNames.add(qName);
            cls = com.rightrez.GDSTicketedStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "GenericSeatRequest");
            cachedSerQNames.add(qName);
            cls = com.rightrez.GenericSeatRequest.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "LinearFareDestinationInfo");
            cachedSerQNames.add(qName);
            cls = com.rightrez.LinearFareDestinationInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "MAP_TYPE");
            cachedSerQNames.add(qName);
            cls = com.rightrez.MAP_TYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }
    private void addBindings1() {
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("http://rightrez.com/", "MoneyAmount");
            cachedSerQNames.add(qName);
            cls = com.rightrez.MoneyAmount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "PassengerAccountingItem");
            cachedSerQNames.add(qName);
            cls = com.rightrez.PassengerAccountingItem.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "PassportInfo");
            cachedSerQNames.add(qName);
            cls = com.rightrez.PassportInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "PassportType");
            cachedSerQNames.add(qName);
            cls = com.rightrez.PassportType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "PnrEmail");
            cachedSerQNames.add(qName);
            cls = com.rightrez.PnrEmail.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "PnrTicketInfo");
            cachedSerQNames.add(qName);
            cls = com.rightrez.PnrTicketInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "PPLine");
            cachedSerQNames.add(qName);
            cls = com.rightrez.PPLine.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "PricingInfo");
            cachedSerQNames.add(qName);
            cls = com.rightrez.PricingInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "PricingType");
            cachedSerQNames.add(qName);
            cls = com.rightrez.PricingType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawAirSegment");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawAirSegment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawArnkSegment");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawArnkSegment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawMISSegment");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawMISSegment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawOSI");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawOSI.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawOTHSegment");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawOTHSegment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawPassengerName");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawPassengerName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawPnr");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawPnr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawPnrHeader");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawPnrHeader.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawPnrRemark");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawPnrRemark.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawSeat");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawSeat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawSegment");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawSegment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawSSR");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawSSR.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawTicket");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawTicket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RawTURSegment");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RawTURSegment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RRZAirSegment");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RRZAirSegment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RRZName");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RRZName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RRZPnr");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RRZPnr.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RRZSeat");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RRZSeat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "RRZTicket");
            cachedSerQNames.add(qName);
            cls = com.rightrez.RRZTicket.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "Seat");
            cachedSerQNames.add(qName);
            cls = com.rightrez.Seat.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "SEAT_STATUS");
            cachedSerQNames.add(qName);
            cls = com.rightrez.SEAT_STATUS.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "SeatMap");
            cachedSerQNames.add(qName);
            cls = com.rightrez.SeatMap.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "SeatRow");
            cachedSerQNames.add(qName);
            cls = com.rightrez.SeatRow.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "SEGMENT_TYPE");
            cachedSerQNames.add(qName);
            cls = com.rightrez.SEGMENT_TYPE.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfAvailabilityRequestDependencyAvailabilityResponseRoundTrip");
            cachedSerQNames.add(qName);
            cls = com.rightrez.SerializableKeyValuePairOfAvailabilityRequestDependencyAvailabilityResponseRoundTrip.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfFlightValidationStatusListOfFlightPairing");
            cachedSerQNames.add(qName);
            cls = com.rightrez.SerializableKeyValuePairOfFlightValidationStatusListOfFlightPairing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip");
            cachedSerQNames.add(qName);
            cls = com.rightrez.SerializableKeyValuePairOfInt32AvailabilityResponseRoundTrip.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfInt32RawAirSegment");
            cachedSerQNames.add(qName);
            cls = com.rightrez.SerializableKeyValuePairOfInt32RawAirSegment.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfServiceLevelMoneyAmount");
            cachedSerQNames.add(qName);
            cls = com.rightrez.SerializableKeyValuePairOfServiceLevelMoneyAmount.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "SerializableKeyValuePairOfStringString");
            cachedSerQNames.add(qName);
            cls = com.rightrez.SerializableKeyValuePairOfStringString.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "ServiceLevel");
            cachedSerQNames.add(qName);
            cls = com.rightrez.ServiceLevel.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "StopCity");
            cachedSerQNames.add(qName);
            cls = com.rightrez.StopCity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "TaxInfoForPricing");
            cachedSerQNames.add(qName);
            cls = com.rightrez.TaxInfoForPricing.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "TicketInfoType");
            cachedSerQNames.add(qName);
            cls = com.rightrez.TicketInfoType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "TicketStatus");
            cachedSerQNames.add(qName);
            cls = com.rightrez.TicketStatus.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "TimeSpan");
            cachedSerQNames.add(qName);
            cls = com.rightrez.TimeSpan.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "TripComponent");
            cachedSerQNames.add(qName);
            cls = com.rightrez.TripComponent.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("http://rightrez.com/", "TripDirectionType");
            cachedSerQNames.add(qName);
            cls = com.rightrez.TripDirectionType.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(enumsf);
            cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public int webBookingRequestInformation(com.rightrez.CreatePNRRequest pnrRequestInformation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://rightrez.com/WebBookingRequestInformation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://rightrez.com/", "WebBookingRequestInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pnrRequestInformation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rightrez.CreatePNRRequest getWebBookingRequest(int id) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://rightrez.com/GetWebBookingRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://rightrez.com/", "GetWebBookingRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(id)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rightrez.CreatePNRRequest) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rightrez.CreatePNRRequest) org.apache.axis.utils.JavaUtils.convert(_resp, com.rightrez.CreatePNRRequest.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rightrez.CreatePNRRequest getWebBookingRequestFromBooking(java.lang.String bookingNumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://rightrez.com/GetWebBookingRequestFromBooking");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://rightrez.com/", "GetWebBookingRequestFromBooking"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bookingNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rightrez.CreatePNRRequest) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rightrez.CreatePNRRequest) org.apache.axis.utils.JavaUtils.convert(_resp, com.rightrez.CreatePNRRequest.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rightrez.BookingResponse bookingRequest(com.rightrez.BookingRequest bookingRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://rightrez.com/BookingRequest");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://rightrez.com/", "BookingRequest"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bookingRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rightrez.BookingResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rightrez.BookingResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.rightrez.BookingResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public com.rightrez.AvailabilityResponse getFlights(com.rightrez.AvailabilityRequest availRequest) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://rightrez.com/GetFlights");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://rightrez.com/", "GetFlights"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {availRequest});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (com.rightrez.AvailabilityResponse) _resp;
            } catch (java.lang.Exception _exception) {
                return (com.rightrez.AvailabilityResponse) org.apache.axis.utils.JavaUtils.convert(_resp, com.rightrez.AvailabilityResponse.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public boolean isBookingNumberExists(java.lang.String bookingNumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://rightrez.com/IsBookingNumberExists");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://rightrez.com/", "IsBookingNumberExists"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bookingNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Boolean) _resp).booleanValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String getRequestIdFromBookingNo(java.lang.String bookingNumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://rightrez.com/GetRequestIdFromBookingNo");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://rightrez.com/", "GetRequestIdFromBookingNo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {bookingNumber});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int webBookingRequestDemoInformation(com.rightrez.CreatePNRRequest pnrRequestInformation) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://rightrez.com/WebBookingRequestDemoInformation");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP12_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://rightrez.com/", "WebBookingRequestDemoInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {pnrRequestInformation});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
