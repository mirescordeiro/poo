package org.example;

public class Recepcionista {
    private String nome;
    private String cpf;
    private String telefone;
    private String senha;

    public Recepcionista(String nome, String cpf, String telefone, String senha) throws Exception {
        setNome(nome);
        setCpf(cpf);
        setTelefone(telefone);
        setSenha(senha);
    }

    public Recepcionista() throws Exception {
        setNome("");
        setCpf("");
        setTelefone("");
        setSenha("");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws Exception {
        if(nome.isEmpty()){
            throw new Exception("Informe o nome do recepcionista.");
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void acessar(){
        //todo
    }

    public void mostrar(){
        System.out.println("----Recepcionista----");
        System.out.println();
        System.out.println("nome: "+getNome());
        System.out.println("cpf: "+getCpf());
        System.out.println("tel: "+getTelefone());
        System.out.println("senha: "+getSenha());
    }
}
