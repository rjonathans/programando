package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    //Attributes
    private String nomeCurso;
    private Integer codigoCurso;
    private ProfessorAdjunto professorAdjunto;
    private ProfessorTitular professorTitular;
    private Integer quantidadeMaximaDeAlunos;
    List<Aluno> alunos = new ArrayList<>();


    //Construtors


    public Curso(String nomeCurso, List<Aluno> alunos) {
        this.nomeCurso = nomeCurso;
        this.alunos = alunos;
    }

    public Curso(String nomeCurso, Integer codigoCurso, ProfessorAdjunto professorAdjunto, ProfessorTitular professorTitular, Integer quantidadeMaximaDeAlunos, List<Aluno> alunos) {
        this.nomeCurso = nomeCurso;
        this.codigoCurso = codigoCurso;
        this.professorAdjunto = professorAdjunto;
        this.professorTitular = professorTitular;
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
        this.alunos = alunos;
    }

    //Methods
    public Boolean adicionarUmAluno(Aluno umAlunoProcurado) {
        Aluno alunoEncontrado = null;
        for (Aluno aluno : alunos) {
            aluno.equals(umAlunoProcurado);
        }
        if (alunoEncontrado == umAlunoProcurado) {
            System.out.println("Aluno ja cadastrado!");
            return false;
        } else {if (quantidadeMaximaDeAlunos <= 40) {
            alunos.add(umAlunoProcurado);
            quantidadeMaximaDeAlunos=quantidadeMaximaDeAlunos+1;
            System.out.println("Aluno " + umAlunoProcurado + " adicionado ao curso com sucesso.");
            return true;
        }else{
            return false;
        }
        }
    }


    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public Integer getQuantidadeMaximaDeAlunos() {
        return quantidadeMaximaDeAlunos;
    }

    public void setQuantidadeMaximaDeAlunos(Integer quantidadeMaximaDeAlunos) {
        this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }
}
