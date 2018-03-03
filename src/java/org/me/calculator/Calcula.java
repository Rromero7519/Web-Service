/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.me.calculator;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Estudiantes
 */
@WebService(serviceName = "Calcula")
public class Calcula {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "agregar")
    public int agregar(@WebParam(name = "i") int i, @WebParam(name = "j") int j) {
        
        int k =i+j;
        System.out.println (k);
        //TODO write your implementation code here:
        return 0;
    }

}
