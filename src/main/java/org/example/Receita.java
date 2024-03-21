package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Receita {
    public DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    private String consulta;
    private Date data;
    private String descritivo;

    public Receita(String consulta, Date data, String descritivo) throws Exception {
        setConsulta(consulta);
        setData(data);
        setDescritivo(descritivo);
    }

    public Receita() throws Exception {
        setConsulta("");
        setData(new Date());
        setDescritivo("");
    }

    public String getConsulta() {
        return consulta;
    }

    public void setConsulta(String consulta) {
        this.consulta = consulta;
    }

    public String getData() {
        return dateFormat.format(data);
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getDescritivo() {
        return descritivo;
    }

    public void setDescritivo(String descritivo) throws Exception {
        if(descritivo.isEmpty()){
            throw new Exception("Adicione uma descrição.");
        } else {
            this.descritivo = descritivo;
        }
    }

    public void preescrever(){
        //todo
    }

    public void consultar(){
        //todo
    }

    public void mostrar(){
        System.out.println("----Receita----");
        System.out.println();
        System.out.println("consulta: "+getConsulta());
        System.out.println("data: "+getData());
        System.out.println("descritivo: "+getDescritivo());
    }
}
