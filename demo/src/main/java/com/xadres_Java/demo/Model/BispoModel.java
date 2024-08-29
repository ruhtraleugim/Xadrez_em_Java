package com.xadres_Java.demo.Model;

public class BispoModel extends PecaModel {
    @Override
    public String getNomePeca() {
        return "Bispo";
    }
    
    @Override
    public double getPontosValor() {
        return 3.5;
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
