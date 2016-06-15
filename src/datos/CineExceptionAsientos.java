/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

/**
 *
 * @author murta
 */
public class CineExceptionAsientos extends Exception{
    
    String m;
    
    public CineExceptionAsientos(String mensaje){
        this.m = mensaje;
    }
    
    @Override
    public String toString(){
        return m;
    }
}
