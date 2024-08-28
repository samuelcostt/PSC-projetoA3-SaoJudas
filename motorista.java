package a3;

public class motorista {
    private String nome, email, telefone, CPF, CNH, senha;
    private int codigo;


    public motorista(){
        
    }

     public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
   

    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getEmail() {
        return email;
    }


    public void setEmail(String email) {
        this.email = email;
    }


    public String getTelefone() {
        return telefone;
    }


    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }


    public String getCPF() {
        return CPF;
    }


    public void setCPF(String CPF) {
        this.CPF = CPF;
    }


    public String getCNH() {
        return CNH;
    }


    public void setCNH(String CNH) {
        this.CNH = CNH;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
}
