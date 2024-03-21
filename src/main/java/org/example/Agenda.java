package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Agenda {
    public DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    public DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");

    private Date data;
    private Date hora;
    private String medico;
    private String paciente;

    public Agenda(Date data, Date hora, String medico, String paciente) throws Exception {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
    }

    public Agenda() throws Exception {
        setData(new Date());
        setHora(new Date());
        setMedico("");
        setPaciente("");
    }

    public String getData() {
        return dateFormat.format(data);
    }

    public void setData(Date data) throws Exception {
        if(data.equals(new Date())){
            throw new Exception("Não é possível agendar consultas para o mesmo dia.");
        } else {
            this.data = data;
        }
    }

    public String getHora() {
        return hourFormat.format(hora);
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getMedico() {
        return medico;
    }

    public void setMedico(String medico) {
        this.medico = medico;
    }

    public String getPaciente() {
        return paciente;
    }

    public void setPaciente(String paciente) {
        this.paciente = paciente;
    }

    public void consultar(){
        //todo
    }

    public void mostrar(){
        System.out.println("----Agenda----");
        System.out.println();
        System.out.println("data: "+getData());
        System.out.println("hora: "+getHora());
        System.out.println("médico: "+getMedico());
        System.out.println("paciente: "+getPaciente());
    }
}
