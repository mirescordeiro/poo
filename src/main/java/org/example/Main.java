package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        Paciente dora = new Paciente();
        dora.cpf = "12345";
        dora.genero = 'F';
        dora.idade = 75;
        dora.nome = "Dora Vieira";
        dora.telefone = "7898-7852";
        dora.mostrar();

        System.out.println();
        System.out.println("___________");
        System.out.println();

        Medico dilo = new Medico();
        dilo.crm = "3456.90";
        dilo.nome = "Dilo Antonio";
        dilo.telefone = "4598-4856";
        dilo.especialidade = "ortopedia";
        dilo.senha = "123456";
        dilo.mostrar();

        System.out.println();
        System.out.println("___________");
        System.out.println();

        Recepcionista valeria = new Recepcionista();
        valeria.nome = "Valeria Tata";
        valeria.cpf = "4833521";
        valeria.telefone = "9999-88888";
        valeria.senha = "987654";
        valeria.mostrar();

        System.out.println();
        System.out.println("___________");
        System.out.println();

        Agenda marcado = new Agenda();
        marcado.data = new Date();
        marcado.hora = new Date();
        marcado.medico = "Dilo";
        marcado.paciente = "Dora";
        marcado.mostrar();

        System.out.println();
        System.out.println("___________");
        System.out.println();

        Consulta analise = new Consulta();
        analise.data = new Date();
        analise.hora = new Date();
        analise.medico = "Dilo";
        analise.paciente = "Dora";
        analise.motivo = "Dor no braço";
        analise.historico = "Dorme do lado esquerdo";
        analise.mostrar();

        System.out.println();
        System.out.println("___________");
        System.out.println();

        Exame pedido = new Exame();
        pedido.consulta = "Raio X";
        pedido.data = new Date();
        pedido.descritivo = "Braço esquerdo";
        pedido.mostrar();
    }
}