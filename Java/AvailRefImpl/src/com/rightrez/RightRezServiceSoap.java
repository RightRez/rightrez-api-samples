/**
 * RightRezServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.rightrez;

public interface RightRezServiceSoap extends java.rmi.Remote {
    public int webBookingRequestInformation(com.rightrez.CreatePNRRequest pnrRequestInformation) throws java.rmi.RemoteException;
    public com.rightrez.CreatePNRRequest getWebBookingRequest(int id) throws java.rmi.RemoteException;
    public com.rightrez.CreatePNRRequest getWebBookingRequestFromBooking(java.lang.String bookingNumber) throws java.rmi.RemoteException;
    public com.rightrez.BookingResponse bookingRequest(com.rightrez.BookingRequest bookingRequest) throws java.rmi.RemoteException;
    public com.rightrez.AvailabilityResponse getFlights(com.rightrez.AvailabilityRequest availRequest) throws java.rmi.RemoteException;
    public boolean isBookingNumberExists(java.lang.String bookingNumber) throws java.rmi.RemoteException;
    public java.lang.String getRequestIdFromBookingNo(java.lang.String bookingNumber) throws java.rmi.RemoteException;
    public int webBookingRequestDemoInformation(com.rightrez.CreatePNRRequest pnrRequestInformation) throws java.rmi.RemoteException;
}
