
package com.ipcommerce.schemas.cws.v2_0.transactionprocessing;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-10-25T15:03:52.889-06:00
 * Generated source version: 2.7.0
 */

@WebFault(name = "CWSOperationNotSupportedFault", targetNamespace = "http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults")
public class ICwsTransactionProcessingCaptureCWSOperationNotSupportedFaultFaultFaultMessage extends Exception {
    
    private com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSOperationNotSupportedFault cwsOperationNotSupportedFault;

    public ICwsTransactionProcessingCaptureCWSOperationNotSupportedFaultFaultFaultMessage() {
        super();
    }
    
    public ICwsTransactionProcessingCaptureCWSOperationNotSupportedFaultFaultFaultMessage(String message) {
        super(message);
    }
    
    public ICwsTransactionProcessingCaptureCWSOperationNotSupportedFaultFaultFaultMessage(String message, Throwable cause) {
        super(message, cause);
    }

    public ICwsTransactionProcessingCaptureCWSOperationNotSupportedFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSOperationNotSupportedFault cwsOperationNotSupportedFault) {
        super(message);
        this.cwsOperationNotSupportedFault = cwsOperationNotSupportedFault;
    }

    public ICwsTransactionProcessingCaptureCWSOperationNotSupportedFaultFaultFaultMessage(String message, com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSOperationNotSupportedFault cwsOperationNotSupportedFault, Throwable cause) {
        super(message, cause);
        this.cwsOperationNotSupportedFault = cwsOperationNotSupportedFault;
    }

    public com.ipcommerce.schemas.cws.v2_0.transactions.faults.CWSOperationNotSupportedFault getFaultInfo() {
        return this.cwsOperationNotSupportedFault;
    }
}