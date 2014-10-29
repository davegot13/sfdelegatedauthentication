/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesforce.delegatedauthentication;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author dgottlieb
 */
@WebService(serviceName = "AuthenticationService")
public class AuthenticationService {

    /**
     * This is a sample web service operation
     * @param username
     * @param password
     * @param sourceIp
     * @return 
     */
    @WebMethod(operationName = "Authenticate")
    public AuthenticateResult Authentication(@WebParam(name = "username") String username,
                                            @WebParam(name = "password") String password,
                                            @WebParam(name = "sourceIp") String sourceIp) 
    {
        return new AuthenticateResult();
    }
}