package com.xadres_Java.demo.Model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class TabuleiroModel {
    protected final int[][] tabuleiro = new int[8][8];
    public String corDaCasa;
}
