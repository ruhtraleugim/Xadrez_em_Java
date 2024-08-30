package com.xadres_Java.demo.Model;

import com.xadres_Java.demo.Model.Pecas.OrdemDaPecasModel;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TabuleiroModel {
    OrdemDaPecasModel ordemInicial = new OrdemDaPecasModel();
    private String[][] pecas = ordemInicial.ordemPecas();
    protected final int[][] tabuleiro = new int[8][8];
    private String corDaCasa;
    private int[][] tabuleiroModel;
};
