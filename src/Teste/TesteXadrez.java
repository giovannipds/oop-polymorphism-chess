package Teste;

import pooxadrez.Bispo;
import pooxadrez.Cavalo;
import pooxadrez.Peao;
import pooxadrez.Peca;
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
        
        peao.mover();
        cavalo.mover();
        bispo.mover();
        torre.mover();
    }
    
}
