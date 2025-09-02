package com.lucas.jdbc.test.infra.exceptions;

import java.rmi.NotBoundException;
import java.text.ParseException;

public class GlobalExceptionHandler {

    public static String tratarExcecao(Exception e){
        String mensagem = "Error";

        if(e instanceof NumberFormatException){
            mensagem = "Input invalido";
        } else if (e instanceof NotBoundException){
            mensagem = "Input invalido";
        }

        return mensagem;

    }

}
