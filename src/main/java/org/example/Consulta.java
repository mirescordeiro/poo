package org.example;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Consulta {
    public DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");

    public DateFormat hourFormat = new SimpleDateFormat("HH:mm:ss");

    private Date data;
    private Date hora;
    private String medico;
    private String paciente;

    private String motivo;

    private String historico;

    public Consulta(Date data, Date hora, String medico, String paciente, String motivo, String historico) {
        setData(data);
        setHora(hora);
        setMedico(medico);
        setPaciente(paciente);
        setMotivo(motivo);
        setHistorico(historico);
    }

    public Consulta() {
        setData(new Date());
        setHora(new Date());
        setMedico("");
        setPaciente("");
        setMotivo("");
        setHistorico("");
    }

    public String getData() {
        return dateFormat.format(data);
    }

    public void setData(Date data) {
        this.data = data;
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

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getHistorico() {
        return historico;
    }

    public void setHistorico(String historico) {
        this.historico = historico;
    }

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
        System.out.println("----Consulta----");
        System.out.println();
        System.out.println("data: "+getData());
        System.out.println("hora: "+getHora());
        System.out.println("médico: "+getMedico());
        System.out.println("paciente: "+getPaciente());
        System.out.println("motivo: "+getMotivo());
        System.out.println("histórico: "+getHistorico());

    }
}
