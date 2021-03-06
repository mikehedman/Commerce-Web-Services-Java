
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:54.602-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSOperationNotSupportedFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingCaptureSelectiveCWSOperationNotSupportedFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSOperationNotSupportedFault cwsOperationNotSupportedFault;

    public ICwsTransactionProcessingCaptureSelectiveCWSOperationNotSupportedFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingCaptureSelectiveCWSOperationNotSupportedFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingCaptureSelectiveCWSOperationNotSupportedFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingCaptureSelectiveCWSOperationNotSupportedFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSOperationNotSupportedFault cwsOperationNotSupportedFault) {
        super(message);
        this.cwsOperationNotSupportedFault = cwsOperationNotSupportedFault;
    }

    public ICwsTransactionProcessingCaptureSelectiveCWSOperationNotSupportedFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSOperationNotSupportedFault cwsOperationNotSupportedFault, Throwable cause) {
        super(message, cause);
        this.cwsOperationNotSupportedFault = cwsOperationNotSupportedFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSOperationNotSupportedFault getFaultInfo() {
        return this.cwsOperationNotSupportedFault;
    }
}
