package atividades.pontoExtra;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int escolhaTurma, escolhaOpcao;
        Cadastro turma1 = new Cadastro();
        Cadastro turma2 = new Cadastro();
        Cadastro turma3 = new Cadastro();
        Cadastro turma4 = new Cadastro();
        Cadastro turmaEscolhida = null;

        do {
            exibirOpcoes();
            escolhaTurma = scan.nextInt(); scan.nextLine();

            if (escolhaTurma == 1) {
                turmaEscolhida = turma1;
            } else if (escolhaTurma == 2) {
                turmaEscolhida = turma2;
            } else if (escolhaTurma == 3) {
                turmaEscolhida = turma3;
            } else if (escolhaTurma == 4) {
                turmaEscolhida = turma4;
            }
            ITurma();
            escolhaOpcao = scan.nextInt(); scan.nextLine();
           
            
            if (escolhaOpcao == 1) {
                System.out.println("Digite o nome do aluno: ");
                String nome = scan.nextLine();
                System.out.println("Digite a matrícula do aluno: ");
                String matricula = scan.nextLine();

                Aluno alunoInserir = new Aluno(matricula, nome);
                turmaEscolhida.cadastrar(alunoInserir);
            } else if (escolhaOpcao == 2) {
                turmaEscolhida.listar();
            } else if (escolhaOpcao == 3) {
                System.out.println("Digite a matrícula do aluno: ");
                String matricula = scan.nextLine();

                turmaEscolhida.alterarMediaFinal(matricula);
            } else if (escolhaOpcao == 4) {
                System.out.println("Digite a matrícula: ");
                String matricula = scan.nextLine();

                turmaEscolhida.alterarFaltas(matricula);
            } else if (escolhaOpcao == 5) {
                System.out.println("Digite a matrícula do aluno: ");
                String matricula = scan.nextLine();

                turmaEscolhida.exibir(matricula);
            } else if (escolhaOpcao == 6) {
                System.out.println("Digite a matrícula do aluno: ");
                String matricula = scan.nextLine();

                turmaEscolhida.removerAluno(matricula);
            }

        } while (escolhaTurma != 0);

    }

    public static void exibirOpcoes() {
        System.out.println("1 -  Operações da turma 1");
        System.out.println("2 -  Operações da turma 2");
        System.out.println("3 -  Operações da turma 3");
        System.out.println("4 -  Operações da turma 4");
    }

    public static void ITurma(){
        System.out.println("1 - Inserir aluno");
        System.out.println("2 - Listar turma");
        System.out.println("3 - Alterar a média final de um aluno");
        System.out.println("4 - Alterar a quantidade de faltas de um aluno");
        System.out.println("5 - Exibir dados de aluno");
        System.out.println("6 - Remover aluno cadastrado");
    }

}
