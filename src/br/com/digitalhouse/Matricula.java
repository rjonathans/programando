package br.com.digitalhouse;

import java.util.Date;
import java.util.PrimitiveIterator;

public class Matricula {
    //Attributes

    private Aluno aluno;
    private Curso Curso;
    private Date dataDoDia;

    //Constructor
    public Matricula(Aluno aluno,Curso curso) {
        this.aluno = aluno;
        Curso = curso;
        Date dataDoDia = new Date();
        this.dataDoDia=dataDoDia;
        System.out.println(dataDoDia);
    }

}
