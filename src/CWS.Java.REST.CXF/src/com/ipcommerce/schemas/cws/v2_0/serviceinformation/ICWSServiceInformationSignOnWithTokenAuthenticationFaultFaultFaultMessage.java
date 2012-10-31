
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:02:09.679-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "AuthenticationFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class ICWSServiceInformationSignOnWithTokenAuthenticationFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.AuthenticationFault authenticationFault;

    public ICWSServiceInformationSignOnWithTokenAuthenticationFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationSignOnWithTokenAuthenticationFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationSignOnWithTokenAuthenticationFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationSignOnWithTokenAuthenticationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.AuthenticationFault authenticationFault) {
        super(message);
        this.authenticationFault = authenticationFault;
    }

    public ICWSServiceInformationSignOnWithTokenAuthenticationFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.AuthenticationFault authenticationFault, Throwable cause) {
        super(message, cause);
        this.authenticationFault = authenticationFault;
    }

    public com.ipcommerce.schemas.identity._1.AuthenticationFault getFaultInfo() {
        return this.authenticationFault;
    }
}