package com.xadres_Java.demo.Model;

public class PawnModel extends PecaModel {
    @Override
    public String getNomePeca() {
        return "Peão";
    }
    
    @Override
    public double getPontosValor() {
        return 1.0;
    }
}
