package aluno;

public class Aluno {
    private String nome;
    private String matricula;
    private String cpf;
    private int idade;

    public Aluno(){
        this.nome = "";
        this.matricula = "";
        this.cpf = "";
        this.idade = idade;
    }

    public Aluno(String nome, String matricula, String cpf, int idade){
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
        this.idade = idade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString(){
        return String.format("Nome: %s | Matrícula: %s | CPF: %s | Idade: %d", nome, matricula, cpf, idade);
    }
}
