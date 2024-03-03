package org.example;

public class Paciente {
    public String nome;
    public String cpf;
    public String telefone;
    public char genero;
    public int idade;

    public void consultar(){
        //todo
    }
    public boolean cadastrar(){
        //todo
        return false;
    }
    public void mostrar(){
        System.out.println("Paciente");
        System.out.println();
        System.out.println("nome: "+nome);
        System.out.println("cpf: "+cpf);
        System.out.println("tel: "+telefone);
        System.out.println("gênero: "+genero);
        System.out.println("idade: "+idade);
    }
}
