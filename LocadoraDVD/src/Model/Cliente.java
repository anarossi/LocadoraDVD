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
import java.util.ArrayList;
import java.util.Collection;

public class Cliente {
    private String nome;
    private Collection<Aluguel> DVDsAlugados = new ArrayList<Aluguel>();
    public Cliente(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    public void adicionaAluguel(Aluguel aluguel) {
        DVDsAlugados.add(aluguel);
    }
    public String extrato() {
        final String fimDeLinha = System.getProperty("line.separator");
        double valorTotal = 0.0;
        int pontosDeAlugadorFrequente = 0;
        String resultado = "Registro de Alugueis de " + getNome() + fimDeLinha;
        for (Aluguel d : DVDsAlugados) {
            double valorCorrente = 0.0;
            Aluguel cada = d;
            // determina valores para cada linha
            // switch com enum
            switch (cada.getDVD().getCódigoDePreço()) {
            case normal:
                valorCorrente += 2;
                if (cada.getDiasAlugada() > 2) {
                    valorCorrente += (cada.getDiasAlugada() - 2) * 1.5;
                }
                break;
            case lancamento:
                valorCorrente += cada.getDiasAlugada() * 3;
                break;
            case infantil:
                valorCorrente += 1.5;
                if (cada.getDiasAlugada() > 3) {
                    valorCorrente += (cada.getDiasAlugada() - 3) * 1.5;
                }
                break;
            } // switch
            // trata de pontos de alugador frequente
            pontosDeAlugadorFrequente++;
            // adiciona bonus para aluguel de um lançamento por pelo menos 2
            // dias
            if (cada.getDVD().getCódigoDePreço() == DVD.Tipo.lancamento
                && cada.getDiasAlugada() > 1) {
                pontosDeAlugadorFrequente++;
            }
            // mostra valores para este aluguel
            resultado += "\t" + cada.getDVD().getTítulo() + "\t"
                         + valorCorrente + fimDeLinha;
            valorTotal += valorCorrente;
        } // while
        // adiciona rodapé
        resultado += "Valor total devido: " + valorTotal + fimDeLinha;
        resultado += "Voce acumulou " + pontosDeAlugadorFrequente
                     + " pontos de alugador frequente";
        return resultado;
    }
    
}
