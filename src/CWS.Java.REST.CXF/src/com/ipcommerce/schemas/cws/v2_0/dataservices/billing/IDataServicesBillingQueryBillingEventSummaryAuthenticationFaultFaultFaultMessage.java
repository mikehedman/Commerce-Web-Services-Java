
package com.ipcommerce.schemas.cws.v2_0.dataservices.billing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T13:53:38.224-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "AuthenticationFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class IDataServicesBillingQueryBillingEventSummaryAuthenticationFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.AuthenticationFault authenticationFault;

    public IDataServicesBillingQueryBillingEventSummaryAuthenticationFaultFaultFaultMessage() {
        super();
    }
    
    public IDataServicesBillingQueryBillingEventSummaryAuthenticationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public IDataServicesBillingQueryBillingEventSummaryAuthenticationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public IDataServicesBillingQueryBillingEventSummaryAuthenticationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.AuthenticationFault authenticationFault) {
        super(message);
        this.authenticationFault = authenticationFault;
    }

    public IDataServicesBillingQueryBillingEventSummaryAuthenticationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.AuthenticationFault authenticationFault, Throwable cause) {
        super(message, cause);
        this.authenticationFault = authenticationFault;
    }

    public com.ipcommerce.schemas.identity._1.AuthenticationFault getFaultInfo() {
        return this.authenticationFault;
    }
}