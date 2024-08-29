package com.xadres_Java.demo.Model;

public class CavaloModel extends PecaModel {
    @Override
    public String getNomePeca() {
        return "Cavalo";
    }
    
    @Override
    public double getPontosValor() {
        return 3.0;
    }
    @Override
    public String getCasasSobreAtaque() {
        return "";
    }
    @Override
    public String getCasaInicial() {
        return "";
    }
    @Override
    public String getCor(){
        return "";
    }
}
