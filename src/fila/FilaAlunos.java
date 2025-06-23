package fila;
import aluno.Aluno;
import org.w3c.dom.ls.LSOutput;

public class FilaAlunos {
    private Aluno[] alunos;
    private int quantidade;

    public FilaAlunos(){
        alunos = new Aluno[5];
        quantidade = 0;
    }

    public void addFim(Aluno aluno){
        if(quantidade == alunos.length){
            aumentarTamanho();
        }
        alunos[quantidade] = aluno;
        quantidade++;
    }

    public void aumentarTamanho(){
        Aluno[] aumentarAluno = new Aluno[alunos.length * 2];
        for(int i = 0; i < quantidade; i++){
            aumentarAluno[i] = alunos[i];
        }
        alunos = aumentarAluno;
    }

    public Aluno removerInicio(){
        if(quantidade == 0){
            System.out.println("A fila está vazia");
            return null;
        }
        
        Aluno removido = alunos[0];
        
        for(int i = 0; i < quantidade - 1; i++){
            alunos[i] = alunos[i + 1];
        }
        alunos[quantidade - 1] = null;
        quantidade--;
        
        return removido;
    }
    
    public Aluno getAluno(String nome){
        for(int i = 0; i < quantidade; i++){
            if(alunos[i].getNome().equalsIgnoreCase(nome)){
                return alunos[i];
            }
        }
        return null;
    }

    public Aluno getAluno(int indice){
        if(indice < 0 || indice >= quantidade){
            System.out.println("índice inválido");
            return null;
        }
        return alunos[indice];
    }

    public int getTamanho(){
        return quantidade;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < quantidade; i++){
            sb.append(alunos[i].toString()).append("\n==================================================================\n");
        }
        return sb.toString();
    }
}
