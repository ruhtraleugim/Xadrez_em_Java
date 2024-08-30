package com.xadres_Java.demo.Model.Pecas;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class PecaModel {
    
    public String nomePeca , casaInicial, casaAtual, casasSobreAtaque ,  cor ;
    public double pontosValor;
    
}
