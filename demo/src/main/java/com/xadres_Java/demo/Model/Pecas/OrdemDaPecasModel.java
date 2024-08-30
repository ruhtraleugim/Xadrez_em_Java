package com.xadres_Java.demo.Model.Pecas;

public record OrdemDaPecasModel(String[][] ordemPecas) {
    public OrdemDaPecasModel() {
        this(new String[][] {
            {"torre", "cavalo", "bispo", "rainha", "rei", "bispo", "cavalo", "torre"},
            {"Peão", "Peão", "Peão", "Peão", "Peão", "Peão", "Peão", "Peão"},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", " "},
            {" ", " ", " ", " ", " ", " ", " ", ""},
            {" ", " ", " ", " ", " ", " ", " ", ""},
            {"peão", "peão", "peão", "peão", "peão", "peão", "peão", "peão"},
            {"torre", "cavalo", "bispo", "rainha", "rei", "bispo", "cavalo", "torre"}
        });
    }
}
