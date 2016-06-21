
/**
 * ReestablecerStockDBClassNotFoundExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */



public class ReestablecerStockDBClassNotFoundExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1430785797592L;
    
    private ReestablecerStockDBStub.ReestablecerStockDBClassNotFoundException faultMessage;

    
        public ReestablecerStockDBClassNotFoundExceptionException() {
            super("ReestablecerStockDBClassNotFoundExceptionException");
        }

        public ReestablecerStockDBClassNotFoundExceptionException(java.lang.String s) {
           super(s);
        }

        public ReestablecerStockDBClassNotFoundExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ReestablecerStockDBClassNotFoundExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(ReestablecerStockDBStub.ReestablecerStockDBClassNotFoundException msg){
       faultMessage = msg;
    }
    
    public ReestablecerStockDBStub.ReestablecerStockDBClassNotFoundException getFaultMessage(){
       return faultMessage;
    }
}
    