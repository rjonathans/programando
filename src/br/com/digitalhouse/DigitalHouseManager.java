package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    //Attributos
    List<Professor> professor = new ArrayList<>();
    List<Aluno>alunos;
    List<Curso>curso;
    List<Matricula>matricula;

    //Methods
    public void registrarCurso(String nome, Integer codigoCurso,Integer quantidadeMaximaDeAlunos){

    }
    public void excluirCurso(Integer codigoCurso){

    }
    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras){

    }
    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade){

    }
    public void excluirProfessor(Integer codigoProfessor){

    }
    public void matricularAluno(String nome, String sobrenome,Integer codigoAluno){

    }
    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){

    }

    //Getters and Setters
    public List<Professor> getProfessor() {
        return professor;
    }

    public void setProfessor(List<Professor> professor) {
        this.professor = professor;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public List<Curso> getCurso() {
        return curso;
    }

    public void setCurso(List<Curso> curso) {
        this.curso = curso;
    }

    public List<Matricula> getMatricula() {
        return matricula;
    }

    public void setMatricula(List<Matricula> matricula) {
        this.matricula = matricula;
    }
}
