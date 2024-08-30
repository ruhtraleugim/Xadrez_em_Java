package com.xadres_Java.demo.Service;

import org.springframework.stereotype.Service;

import com.xadres_Java.demo.Model.PecaModel;

@Service
public class MovimentoService {
        
    public static boolean PodeMover(PecaModel Peca){
        String nomePeca = Peca.getNomePeca();
        if (nomePeca.equals("torre")  ) {
            return false;
        }
        return true;
    }
    public static String getNomePeca(PecaModel model){
        return model.getNomePeca();
    }
}