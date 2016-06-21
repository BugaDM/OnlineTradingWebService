
/**
 * ModificarUsersDBCallbackHandler.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */


    /**
     *  ModificarUsersDBCallbackHandler Callback class, Users can extend this class and implement
     *  their own receiveResult and receiveError methods.
     */
    public abstract class ModificarUsersDBCallbackHandler{



    protected Object clientData;

    /**
    * User can pass in any object that needs to be accessed once the NonBlocking
    * Web service call is finished and appropriate method of this CallBack is called.
    * @param clientData Object mechanism by which the user can pass in user data
    * that will be avilable at the time this callback is called.
    */
    public ModificarUsersDBCallbackHandler(Object clientData){
        this.clientData = clientData;
    }

    /**
    * Please use this constructor if you don't want to set any clientData
    */
    public ModificarUsersDBCallbackHandler(){
        this.clientData = null;
    }

    /**
     * Get the client data
     */

     public Object getClientData() {
        return clientData;
     }

        
           /**
            * auto generated Axis2 call back method for anadirUser method
            * override this method for handling normal response from anadirUser operation
            */
           public void receiveResultanadirUser(
                    ModificarUsersDBStub.AnadirUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from anadirUser operation
           */
            public void receiveErroranadirUser(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for verUsers method
            * override this method for handling normal response from verUsers operation
            */
           public void receiveResultverUsers(
                    ModificarUsersDBStub.VerUsersResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from verUsers operation
           */
            public void receiveErrorverUsers(java.lang.Exception e) {
            }
                
           /**
            * auto generated Axis2 call back method for borrarUser method
            * override this method for handling normal response from borrarUser operation
            */
           public void receiveResultborrarUser(
                    ModificarUsersDBStub.BorrarUserResponse result
                        ) {
           }

          /**
           * auto generated Axis2 Error handler
           * override this method for handling error response from borrarUser operation
           */
            public void receiveErrorborrarUser(java.lang.Exception e) {
            }
                


    }
    