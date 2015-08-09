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
public class Aluguel {
    private DVD dvd;
    private int diasAlugada;

    public Aluguel(DVD dvd, int diasAlugada) {
        this.dvd = dvd;
        this.diasAlugada = diasAlugada;
    }
    public DVD getDVD() {
        return dvd;
    }
    public int getDiasAlugada() {
        return diasAlugada;
    }
    
}
