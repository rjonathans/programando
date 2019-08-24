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
    

}
