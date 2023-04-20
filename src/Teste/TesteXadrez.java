package Teste;

import pooxadrez.Bispo;
import pooxadrez.Cavalo;
import pooxadrez.Peao;
import pooxadrez.Peca;
import pooxadrez.Rainha;
import pooxadrez.Rei;
import pooxadrez.Torre;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author giovannipds
 */
public class TesteXadrez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Peca peao = new Peao();
        Peca cavalo = new Cavalo();
        Peca bispo = new Bispo();
        Peca torre = new Torre();
        Peca rainha = new Rainha();
        Peca rei = new Rei();
        
        peao.mover();
        cavalo.mover();
        bispo.mover();
        torre.mover();
        rainha.mover();
        rei.mover();
        
        System.out.println(peao instanceof Peca);
        System.out.println(cavalo instanceof Peca);
        System.out.println(bispo instanceof Peca);
        System.out.println(torre instanceof Peca);
        System.out.println(rainha instanceof Peca);
        System.out.println(rei instanceof Peca);
    }
    
}
