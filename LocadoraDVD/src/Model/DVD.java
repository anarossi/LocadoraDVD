/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Ana
 */
public class DVD {
    public enum Tipo {
        normal, lancamento, infantil
    };
    private String título;
    private Tipo códigoDePreço;
    public DVD(String título, Tipo códigoDePreço) {
        this.título = título;
        this.códigoDePreço = códigoDePreço;
    }
    public String getTítulo() {
        return título;
    }
    public Tipo getCódigoDePreço() {
        return códigoDePreço;
    }
    public void setCódigoDePreço(Tipo códigoDePreço) {
        this.códigoDePreço = códigoDePreço;
    }
    
}
