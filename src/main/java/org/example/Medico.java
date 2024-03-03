package org.example;

public class Medico {
    public String nome;
    public String crm;
    public String telefone;
    public String especialidade;
    public String senha;

    public void acessar(){
        //todo
    }

    public void mostrar(){
        System.out.println("Médico");
        System.out.println();
        System.out.println("nome: "+nome);
        System.out.println("crm: "+crm);
        System.out.println("tel: "+telefone);
        System.out.println("especialidade: "+especialidade);
        System.out.println("senha: "+senha);
    }
}
