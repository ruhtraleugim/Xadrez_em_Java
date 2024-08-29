package com.xadres_Java.demo.Model;

public class RainhaModel extends PecaModel {
    @Override
    public String getNomePeca() {
        return "Rainha";
    }
    
    @Override
    public double getPontosValor() {
        return 9.0;
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
