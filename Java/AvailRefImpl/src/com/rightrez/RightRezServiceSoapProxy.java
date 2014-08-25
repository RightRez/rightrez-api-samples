package com.rightrez;

public class RightRezServiceSoapProxy implements com.rightrez.RightRezServiceSoap {
  private String _endpoint = null;
  private com.rightrez.RightRezServiceSoap rightRezServiceSoap = null;
  
  public RightRezServiceSoapProxy() {
    _initRightRezServiceSoapProxy();
  }
  
  public RightRezServiceSoapProxy(String endpoint) {
    _endpoint = endpoint;
    _initRightRezServiceSoapProxy();
  }
  
  private void _initRightRezServiceSoapProxy() {
    try {
      rightRezServiceSoap = (new com.rightrez.RightRezServiceLocator()).getRightRezServiceSoap();
      if (rightRezServiceSoap != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)rightRezServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)rightRezServiceSoap)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (rightRezServiceSoap != null)
      ((javax.xml.rpc.Stub)rightRezServiceSoap)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public com.rightrez.RightRezServiceSoap getRightRezServiceSoap() {
    if (rightRezServiceSoap == null)
      _initRightRezServiceSoapProxy();
    return rightRezServiceSoap;
  }
  
  public int webBookingRequestInformation(com.rightrez.CreatePNRRequest pnrRequestInformation) throws java.rmi.RemoteException{
    if (rightRezServiceSoap == null)
      _initRightRezServiceSoapProxy();
    return rightRezServiceSoap.webBookingRequestInformation(pnrRequestInformation);
  }
  
  public com.rightrez.CreatePNRRequest getWebBookingRequest(int id) throws java.rmi.RemoteException{
    if (rightRezServiceSoap == null)
      _initRightRezServiceSoapProxy();
    return rightRezServiceSoap.getWebBookingRequest(id);
  }
  
  public com.rightrez.CreatePNRRequest getWebBookingRequestFromBooking(java.lang.String bookingNumber) throws java.rmi.RemoteException{
    if (rightRezServiceSoap == null)
      _initRightRezServiceSoapProxy();
    return rightRezServiceSoap.getWebBookingRequestFromBooking(bookingNumber);
  }
  
  public com.rightrez.BookingResponse bookingRequest(com.rightrez.BookingRequest bookingRequest) throws java.rmi.RemoteException{
    if (rightRezServiceSoap == null)
      _initRightRezServiceSoapProxy();
    return rightRezServiceSoap.bookingRequest(bookingRequest);
  }
  
  public boolean isBookingNumberExists(java.lang.String bookingNumber) throws java.rmi.RemoteException{
    if (rightRezServiceSoap == null)
      _initRightRezServiceSoapProxy();
    return rightRezServiceSoap.isBookingNumberExists(bookingNumber);
  }
  
  public java.lang.String getRequestIdFromBookingNo(java.lang.String bookingNumber) throws java.rmi.RemoteException{
    if (rightRezServiceSoap == null)
      _initRightRezServiceSoapProxy();
    return rightRezServiceSoap.getRequestIdFromBookingNo(bookingNumber);
  }
  
  public int webBookingRequestDemoInformation(com.rightrez.CreatePNRRequest pnrRequestInformation) throws java.rmi.RemoteException{
    if (rightRezServiceSoap == null)
      _initRightRezServiceSoapProxy();
    return rightRezServiceSoap.webBookingRequestDemoInformation(pnrRequestInformation);
  }
  
  public com.rightrez.AvailabilityResponse getFlights(com.rightrez.AvailabilityRequest availRequest) throws java.rmi.RemoteException{
    if (rightRezServiceSoap == null)
      _initRightRezServiceSoapProxy();
    return rightRezServiceSoap.getFlights(availRequest);
  }
  
  
}