
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:55.440-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSOperationNotSupportedFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingCaptureAllCWSOperationNotSupportedFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSOperationNotSupportedFault cwsOperationNotSupportedFault;

    public ICwsTransactionProcessingCaptureAllCWSOperationNotSupportedFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingCaptureAllCWSOperationNotSupportedFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingCaptureAllCWSOperationNotSupportedFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingCaptureAllCWSOperationNotSupportedFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSOperationNotSupportedFault cwsOperationNotSupportedFault) {
        super(message);
        this.cwsOperationNotSupportedFault = cwsOperationNotSupportedFault;
    }

    public ICwsTransactionProcessingCaptureAllCWSOperationNotSupportedFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSOperationNotSupportedFault cwsOperationNotSupportedFault, Throwable cause) {
        super(message, cause);
        this.cwsOperationNotSupportedFault = cwsOperationNotSupportedFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSOperationNotSupportedFault getFaultInfo() {
        return this.cwsOperationNotSupportedFault;
    }
}