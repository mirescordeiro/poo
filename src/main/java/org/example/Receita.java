package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Receita {
    public DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    public String consulta;
    public Date data;
    public String descritivo;

    public void preescrever(){
        //todo
    }

    public void consultar(){
        //todo
    }

    public void mostrar(){
        System.out.println("consulta: "+consulta);
        System.out.println("data: "+dateFormat.format(data));
        System.out.println("descritivo: "+descritivo);
    }
}
