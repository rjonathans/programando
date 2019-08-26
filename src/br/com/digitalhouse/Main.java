package br.com.digitalhouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        System.out.println("* * BEM VINDO AO SISTEMA DE ALUNOS * *");

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Cadastrar nome do professor Titular :\n");
        String nome = sc1.next();
        System.out.println("Cadastrar nome do professor Titular :\n");
        String sobreNome = sc1.next();
        System.out.println("Cadastrar nome do professor Titular :\n");
        Integer codigo = sc1.nextInt();
        System.out.println("QUAL ESPECIALIDADE? \nR.:");
        String especialidade = sc1.next();


        digitalHouseManager.registrarProfessorTitular(nome,sobreNome,codigo,especialidade);

    }
}

