
package com.ipcommerce.schemas.cws.v2_0.serviceinformation;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:02:10.300-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "ExpiredTokenFault", targetNamespace = "http://schemas.ipcommerce.com/Identity/1.0/")
public class ICWSServiceInformationGetMerchantProfileIdsExpiredTokenFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.identity._1.ExpiredTokenFault expiredTokenFault;

    public ICWSServiceInformationGetMerchantProfileIdsExpiredTokenFaultFaultFaultMessage() {
        super();
    }
    
    public ICWSServiceInformationGetMerchantProfileIdsExpiredTokenFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICWSServiceInformationGetMerchantProfileIdsExpiredTokenFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICWSServiceInformationGetMerchantProfileIdsExpiredTokenFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.ExpiredTokenFault expiredTokenFault) {
        super(message);
        this.expiredTokenFault = expiredTokenFault;
    }

    public ICWSServiceInformationGetMerchantProfileIdsExpiredTokenFaultFaultFaultMessage(String message, com.ipcommerce.schemas.identity._1.ExpiredTokenFault expiredTokenFault, Throwable cause) {
        super(message, cause);
        this.expiredTokenFault = expiredTokenFault;
    }

    public com.ipcommerce.schemas.identity._1.ExpiredTokenFault getFaultInfo() {
        return this.expiredTokenFault;
    }
}