
/**
 * TweetAppTwitterExceptionException.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */


public class TweetAppTwitterExceptionException extends java.lang.Exception{

    private static final long serialVersionUID = 1430781933978L;
    
    private TweetAppStub.TweetAppTwitterException faultMessage;

    
        public TweetAppTwitterExceptionException() {
            super("TweetAppTwitterExceptionException");
        }

        public TweetAppTwitterExceptionException(java.lang.String s) {
           super(s);
        }

        public TweetAppTwitterExceptionException(java.lang.String s, java.lang.Throwable ex) {
          super(s, ex);
        }

        public TweetAppTwitterExceptionException(java.lang.Throwable cause) {
            super(cause);
        }
    

    public void setFaultMessage(TweetAppStub.TweetAppTwitterException msg){
       faultMessage = msg;
    }
    
    public TweetAppStub.TweetAppTwitterException getFaultMessage(){
       return faultMessage;
    }
}
    