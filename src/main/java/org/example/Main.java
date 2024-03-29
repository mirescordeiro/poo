package org.example;

import java.time.Instant;
import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        try {
            Paciente dora = new Paciente();
            dora.setCpf("12345");
            dora.setGenero('F');
            dora.setIdade(75);
            dora.setNome("Dora Vieira");
            dora.setTelefone("7898-7852");
            dora.mostrar();
        } catch (Exception error){
            System.out.println(error.getMessage());
        }

        System.out.println();

        try {
            Medico dilo = new Medico("3456.90", "Dilo Antonio", "4598-4856", "ortopedia", "123456");
            dilo.mostrar();
        } catch (Exception error){
            System.out.println(error.getMessage());
        }

        System.out.println();

        try {
            Recepcionista valeria = new Recepcionista("Valeria Tata", "4833521", "9999-88888", "987654");
            valeria.mostrar();
        } catch (Exception error){
            System.out.println(error.getMessage());
        }

        System.out.println();

        try {
            Agenda marcado = new Agenda(new Date(), new Date(), "Dilo", "Dora");
            marcado.mostrar();
        } catch (Exception error){
            System.out.println(error.getMessage());
        }

        System.out.println();

        try {
            Consulta analise = new Consulta();
            analise.setData(new Date());
            analise.setHora(new Date());
            analise.setMedico("Dilo");
            analise.setPaciente("Dora");
            analise.setMotivo("Dor no braço");
            analise.setHistorico("Dorme do lado esquerdo");
            analise.mostrar();
        } catch (Exception error){
            System.out.println(error.getMessage());
        }

        System.out.println();

        try {
            Exame pedido = new Exame("Raio X", new Date(), "Braço esquerdo");
            pedido.mostrar();
        } catch (Exception error){
            System.out.println(error.getMessage());
        }

        System.out.println();

        try {
            Receita remedio = new Receita("Arnica", new Date(), "Passar duas vezes ao dia");
            remedio.mostrar();
        } catch (Exception error){
            System.out.println(error.getMessage());
        }

    }
}