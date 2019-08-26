package br.com.digitalhouse;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();

        System.out.println("* * BEM VINDO AO SISTEMA DE ALUNOS * *");

        Scanner sc1 = new Scanner(System.in);
        System.out.print("DIGITE O NOME: ");
        String nome = sc1.next();
        System.out.print("DIGITE O SOBRENOME: ");
        String sobreNome = sc1.next();
        System.out.print("DIGITE O CODIGO: ");
        Integer codigo = sc1.nextInt();
        System.out.print("DIGITE A ESPECIALIDADE: ");
        String especialidade = sc1.next();

        digitalHouseManager.registrarProfessorTitular(nome,sobreNome,codigo,especialidade);

    }
}

