/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.salesforce.delegatedauthentication;

/**
 *
 * @author dgottlieb
 */
public class AuthenticateResult 
{
    public boolean Authenticated;
    
    public AuthenticateResult()
    {
        Authenticated = false;
    }
    
    public AuthenticateResult(boolean b)
    {
        Authenticated = b;
    }
}
