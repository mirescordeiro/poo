package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Consulta {
    public DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    public DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");

    public Date data;
    public Date hora;
    public String medico;
    public String paciente;

    public String motivo;

    public String historico;

    public void marcar(){
        //todo
    }

    public void cancelar(){
        //todo
    }

    public void consultar(){
        //todo
    }

    public void realizar(){
        //todo
    }

    public void atualizar(){
        //todo
    }

    public void mostrar(){
        System.out.println("Consulta");
        System.out.println();
        System.out.println("data: "+dateFormat.format(data));
        System.out.println("hora: "+hourFormat.format(hora));
        System.out.println("médico: "+medico);
        System.out.println("paciente: "+paciente);
        System.out.println("motivo: "+motivo);
        System.out.println("histórico: "+historico);

    }
}
