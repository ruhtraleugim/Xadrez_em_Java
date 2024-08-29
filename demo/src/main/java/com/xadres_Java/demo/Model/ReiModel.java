package com.xadres_Java.demo.Model;

public class ReiModel extends PecaModel{
    @Override
    public String getNomePeca() {
        return "Rei";
    }
    
    @Override
    public double getPontosValor() {
        return 100.0;
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
