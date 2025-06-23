package app;
import java.util.Scanner;
import aluno.Aluno;
import fila.FilaAlunos;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        FilaAlunos fila = new FilaAlunos();

        while(true){
            System.out.println("1- Adicionar aluno");
            System.out.println("2- Remover aluno");
            System.out.println("3- Buscar aluno por nome");
            System.out.println("4- Buscar aluno por índice");
            System.out.println("5- Verificar tamanho da fila");
            System.out.println("6- Imprimir fila");
            System.out.println("0- Sair");

            System.out.println("Escolha uma opção: ");
            int op = in.nextInt();
            in.nextLine();

            switch(op){
                case 1:
                    System.out.println("Nome: ");
                    String nome = in.nextLine();

                    System.out.println("Matrícula: ");
                    String matricula = in.nextLine();

                    System.out.println("CPF: ");
                    String cpf = in.nextLine();

                    System.out.println("Idade: ");
                    int idade = in.nextInt();
                    in.nextLine();

                    Aluno novoAluno = new Aluno(nome, matricula, cpf, idade);
                    fila.addFim(novoAluno);
                    break;

                case 2:
                    Aluno removido = fila.removerInicio();
                    if(removido != null){
                        System.out.println("Aluno removido: " + removido);
                    }
                    break;

                case 3:
                    System.out.println("Digite o nome do aluno: ");
                    String nomeAluno = in.nextLine();

                    Aluno buscarAluno = fila.getAluno(nomeAluno);
                    if(buscarAluno != null){
                        System.out.println("Aluno encontrado: " + buscarAluno);
                    } else{
                        System.out.println("Aluno não encontrado");
                    }
                    break;

                case 4:
                    System.out.println("Digite o índice: ");
                    int indice = in.nextInt();
                    in.nextLine();

                    Aluno indiceAluno = fila.getAluno(indice);
                    if(indiceAluno != null){
                        System.out.println("Aluno encontrado: " + indiceAluno);
                    } else {
                        System.out.println("Aluno não encontrado");
                    }
                    break;

                case 5:
                    System.out.println("Tamanho da fila: " + fila.getTamanho());
                    break;

                case 6:
                    System.out.println("Alunos na fila: ");
                    System.out.println(fila);
                    break;

                case 0:
                    System.out.println("Programa encerrado.");
                    in.close();
                    System.exit(0);
                    break;
            }
        }
    }
}
