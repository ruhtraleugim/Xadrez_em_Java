package com.xadres_Java.demo.Model;

public class TorreModel extends PecaModel{
    @Override
    public String getNomePeca() {
        return "Torre";
    }
    
    @Override
    public double getPontosValor() {
        return 5.0;
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
