package org.example;

public class Paciente {
    private String nome;
    private String cpf;
    private String telefone;
    private char genero;
    private int idade;

    public Paciente(String nome, String cpf, String telefone, char genero, int idade) throws Exception {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setGenero(genero);
        setIdade(idade);
    }

    public Paciente() throws Exception {
        setNome("");
        setCpf("");
        setTelefone("");
        setGenero('\0');
        setIdade(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.isEmpty()){
            throw new Exception("Favor informar o nome do paciente.");
        } else {
            this.nome = nome;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public char getGenero() {
        return genero;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void consultar(){
        //todo
    }
    public boolean cadastrar(){
        //todo
        return false;
    }
    public void mostrar(){
        System.out.println("----Paciente----");
        System.out.println();
        System.out.println("nome: "+getNome());
        System.out.println("cpf: "+getCpf());
        System.out.println("tel: "+getTelefone());
        System.out.println("gênero: "+getGenero());
        System.out.println("idade: "+getIdade());
    }
}
