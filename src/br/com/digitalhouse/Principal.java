package br.com.digitalhouse;

import javax.jws.soap.SOAPBinding;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        System.out.println("... OLÁ!...\n" +
                "\nBem vindo ao Sistema DIGITAL HOUSE ver 1.0\n" +
                "*********************************************\n" +
                "PARA COMEÇAR DIGITE UMA DAS OPÇÕES ABAIXO:\n" +
                "1)REGISTRAR PROFESSOR TITULAR :\n" +
                "2)REGISTRAR PROFESSOR ADJUNTO\n" +
                "3)REGISTRAR CURSO: \n" +
                "4)ALOCAR PROFESSOR: \n" +
                "5)REGISTRAR ALUNO: \n" +
                "6)MATRICULAR ALUNO EM CURSO: \n" +
                ">>>> DIGITE A OPÇÃO DESEJADA: \n>>>>R.: ");

        Integer escolhido = sc1.nextInt();


        if (escolhido.equals(0)){

            System.out.println("... OLÁ!...\n" +
                    "\nBem vindo ao Sistema DIGITAL HOUSE ver 1.0\n" +
                    "*********************************************\n" +
                    "PARA COMEÇAR DIGITE UMA DAS OPÇÕES ABAIXO:\n" +
                    "1)REGISTRAR PROFESSOR TITULAR :\n" +
                    "2)REGISTRAR PROFESSOR ADJUNTO\n" +
                    "3)REGISTRAR CURSO: \n" +
                    "4)REGISTRAR ALUNO: \n" +
                    "5)ALOCAÇÃO DOS PROFESSORES: \n" +
                    "6)MATRICULAR ALUNO EM CURSO: \n" +
                    ">>>> DIGITE A OPÇÃO DESEJADA: \n>>>>R.: ");

            return;

        }

        if (escolhido.equals(1)){

            System.out.println("* * VOCÊ ESCOLHEU A OPÇÃO CADASTRAR PROFESSOR TITULAR\n" +
                    "DIGITE OS DADOS SOLICITADOS: \n");

            System.out.print("DIGITE O NOME: ");
            String nomeTitular = sc1.next();
            System.out.print("DIGITE O SOBRENOME: ");
            String sobreNomeTitular = sc1.next();
            System.out.print("DIGITE O CODIGO: ");
            Integer codigoTitular = sc1.nextInt();
            System.out.print("DIGITE A ESPECIALIDADE: ");
            String especialidade = sc1.next();

            digitalHouseManager.registrarProfessorTitular(nomeTitular, sobreNomeTitular, codigoTitular, especialidade);
            return;

        }if(escolhido.equals(2)){

            System.out.println("* * VOCÊ ESCOLHEU A OPÇÃO CADASTRAR PROFESSOR ADJUNTO\n" +
                    "DIGITE OS DADOS SOLICITADOS: \n");

            System.out.print("DIGITE O NOME: ");
            String nomeAdjunto = sc1.next();
            System.out.print("DIGITE O SOBRENOME: ");
            String sobrenomeAdjunto = sc1.next();
            System.out.print("DIGITE O CODIGO: ");
            Integer codigoAdjunto = sc1.nextInt();
            System.out.print("DIGITE A QUANTIDADE DE HORAS DE MONITORIA: ");
            Integer qtdadeDeHoras = sc1.nextInt();

            digitalHouseManager.registrarProfessorAdjunto(nomeAdjunto, sobrenomeAdjunto, codigoAdjunto, qtdadeDeHoras);

        }if(escolhido.equals(3)){

            System.out.println("* * VOCÊ ESCOLHEU A OPÇÃO REGISTRAR CURSO \n" +
                    "DIGITE OS DADOS SOLICITADOS: \n");

            System.out.print("DIGITE O NOME DO CURSO: ");
            String nomeCurso = sc1.next();
            System.out.print("DIGITE O CODIGO DO CURSO: ");
            Integer codigoCurso = sc1.nextInt();
            System.out.print("QUANTOS ALUNOS ESSE CURSO TERÁ: ");
            Integer qtdaDeAlunos = sc1.nextInt();

            digitalHouseManager.registrarCurso(nomeCurso, codigoCurso, qtdaDeAlunos);
            return;
        }if (escolhido.equals(4)){

            System.out.println("* * VOCÊ ESCOLHEU A OPÇÃO ALOCAR PROFESSOR\n" +
                    "DIGITE OS DADOS SOLICITADOS: \n");

            System.out.print("DIGITE O CODIGO DO CURSO PARA O QUAL DESEJA ALOCAR UM PROFESSOR: ");
            Integer cursoOndeSeraAlocado = sc1.nextInt();
            System.out.print("DIGITE O CODIGO DE UM PROFESSOR TITULAR: ");
            Integer codigoProfessorTitular = sc1.nextInt();
            System.out.print("DIGITE O CODIGO DE UM PROFESSOR ADJUNTO: ");
            Integer codigoProfessorAdjunto = sc1.nextInt();

            digitalHouseManager.alocarProfessores(cursoOndeSeraAlocado, codigoProfessorTitular, codigoProfessorAdjunto);
            return;
        }if (escolhido.equals(5)){

            System.out.println("* * VOCÊ ESCOLHEU A OPÇÃO REGISTRAR ALUNO NA ESCOLA\n" +
                    "DIGITE OS DADOS SOLICITADOS: \n");

            System.out.print("DIGITE O NOME: ");
            String nomeAluno = sc1.next();
            System.out.print("DIGITE O SOBRENOME: ");
            String sobreNomeAluno = sc1.next();
            System.out.print("DIGITE O CODIGO DO CURSO: ");
            Integer codigoCurso2 = sc1.nextInt();

            digitalHouseManager.registrarAluno(nomeAluno, sobreNomeAluno, codigoCurso2);

        }if(escolhido.equals(6)){

            System.out.println("* * VOCÊ ESCOLHEU A OPÇÃO MATRICULAR ALUNO EM UM CURSO\n" +
                    "DIGITE OS DADOS SOLICITADOS: \n");

            System.out.print("DIGITE O SOBRENOME: ");
            Integer procuraCodigoAluno = sc1.nextInt();
            System.out.print("DIGITE O SOBRENOME: ");
            Integer procuraCodigoCurso = sc1.nextInt();

            digitalHouseManager.matricularAluno(procuraCodigoAluno, procuraCodigoCurso);
            return;
        }if (0< escolhido && escolhido >=7 || escolhido.equals(null) ){
            escolhido=7;
        }



    }
}

