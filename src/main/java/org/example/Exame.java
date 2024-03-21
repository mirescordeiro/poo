package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exame {
    public DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    private String consulta;
    private Date data;
    private String descritivo;

    public Exame(String consulta, Date data, String descritivo) throws Exception {
        setConsulta(consulta);
        setData(data);
        setDescritivo(descritivo);
    }

    public Exame() throws Exception {
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
            throw new Exception("Favor adicionar uma descrição.");
        } else {
            this.descritivo = descritivo;
        }
    }

    void solicitar(){
        //todo
    }

    public void consultar(){
        //todo
    }

    public void mostrar(){
        System.out.println("----Exame----");
        System.out.println();
        System.out.println("consulta: "+getConsulta());
        System.out.println("data: "+getData());
        System.out.println("descritivo: "+getDescritivo());
    }
}
