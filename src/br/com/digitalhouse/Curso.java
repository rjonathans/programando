package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    //Attributes

    private String nomeCurso;
    private Integer codigoCurso;
    private Professor proessorfAdjunto;
    private Professor professorTitular;
    private Integer quantidadeMaximaDeAlunos;
    List<Aluno> alunos = new ArrayList<>();

    private Aluno alunoMatriculado=null;

    //Construtors


    //Methods
    public Boolean adicionarUmAluno(Aluno umAlunoProcurado) {

        for (Aluno aluno : alunos) {
            if (aluno.equals(umAlunoProcurado)) {
                return true;
            }
        }return false;
    }


        public String getNomeCurso () {
            return nomeCurso;
        }

        public void setNomeCurso (String nomeCurso){
            this.nomeCurso = nomeCurso;
        }

        public Integer getCodigoCurso () {
            return codigoCurso;
        }

        public void setCodigoCurso (Integer codigoCurso){
            this.codigoCurso = codigoCurso;
        }

        public Professor getProessorfAdjunto () {
            return proessorfAdjunto;
        }

        public void setProessorfAdjunto (Professor proessorfAdjunto){
            this.proessorfAdjunto = proessorfAdjunto;
        }

        public Professor getProfessorTitular () {
            return professorTitular;
        }

        public void setProfessorTitular (Professor professorTitular){
            this.professorTitular = professorTitular;
        }

        public Integer getQuantidadeMaximaDeAlunos () {
            return quantidadeMaximaDeAlunos;
        }

        public void setQuantidadeMaximaDeAlunos (Integer quantidadeMaximaDeAlunos){
            this.quantidadeMaximaDeAlunos = quantidadeMaximaDeAlunos;
        }

        public List<Aluno> getAlunos () {
            return alunos;
        }

        public void setAlunos (List < Aluno > alunos) {
            this.alunos = alunos;
        }

        public Aluno getAlunoMatriculado () {
            return alunoMatriculado;
        }

        public void setAlunoMatriculado (Aluno alunoMatriculado){
            this.alunoMatriculado = alunoMatriculado;
        }
    }
