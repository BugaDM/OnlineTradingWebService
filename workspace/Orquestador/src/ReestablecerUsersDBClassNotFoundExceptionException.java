
/**
 * ReestablecerUsersDBClassNotFoundExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */


public class ReestablecerUsersDBClassNotFoundExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1430784075581L;
    
    private ReestablecerUsersDBStub.ReestablecerUsersDBClassNotFoundException faultMessage;

    
        public ReestablecerUsersDBClassNotFoundExceptionException() {
            super("ReestablecerUsersDBClassNotFoundExceptionException");
        }

        public ReestablecerUsersDBClassNotFoundExceptionException(java.lang.String s) {
           super(s);
        }

        public ReestablecerUsersDBClassNotFoundExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public ReestablecerUsersDBClassNotFoundExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(ReestablecerUsersDBStub.ReestablecerUsersDBClassNotFoundException msg){
       faultMessage = msg;
    }
    
    public ReestablecerUsersDBStub.ReestablecerUsersDBClassNotFoundException getFaultMessage(){
       return faultMessage;
    }
}
    