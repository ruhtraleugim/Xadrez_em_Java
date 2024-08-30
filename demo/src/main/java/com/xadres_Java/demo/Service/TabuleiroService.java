package com.xadres_Java.demo.Service;

import com.xadres_Java.demo.Model.TabuleiroModel;

public class TabuleiroService {
    TabuleiroModel  tabuleiroModel;

    public int[][] DefinirBinarioDasCasas(){
        int[][] tabuleiroBinario = new int[8][8]; 
        for(int i=0; i<8 ; i++){
            for(int j=0; j<8 ; j++){
                if( (i+j)%2  == 0){
                    tabuleiroBinario[i][j] = 0;
                }else tabuleiroBinario[i][j] = 1;           
            }
        }
        return tabuleiroBinario;
    }
    public String[][] DefinirCorDasCasas(int[][] tabuleiroBinario){
        String[][] tabuleiro = new String[8][8]; 
        for(int i=0; i<8 ; i++){
            for(int j=0; j<8 ; j++){
                if( tabuleiroBinario[i][j] == 1){
                    tabuleiro[i][j] = "Branco";
                } else tabuleiro[i][j] = "Preto";           
            }
        }
        return tabuleiro;
    }

}
