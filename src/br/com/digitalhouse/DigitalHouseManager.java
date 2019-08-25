package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DigitalHouseManager {

    //Attributos
    private List<Professor> professor = new ArrayList<>();
    private List<Aluno>alunos = new ArrayList<>();
    private List<Curso>curso = new ArrayList<>();
    private List<Matricula>matricula = new ArrayList<>();


    //Methods
    public void registrarCurso(String novoNome, Integer novoCodigoCurso,Integer novaQuantidadeMaximaDeAlunos){
        //cria e instancia um novo urso com todos os atributos que o construtor pede
        Curso novoCurso = new Curso(novoNome,novoCodigoCurso,novaQuantidadeMaximaDeAlunos);     //********cria um curso
        //aqui adicinamos o novo curso instanciado na linha anterior dentro do list curso
        curso.add(novoCurso);
        //imprime informando no console do sucesso do procedimento
        System.out.println("Curso de "+novoCurso.getNomeCurso()+" registrado com sucesso!");
    }

    public void excluirCurso(Integer codigoCurso) {
        //Crio uma variável local sem atrbuir um valor
        Curso cursoEncontrado ;
        //verifica um por um todos os objetos do list curso usando a variável local cursoProcurado
        for (Curso cursoProcurado : curso) {
            //se encontrar um objeto com o mesmo código
            if (cursoProcurado.getCodigoCurso().equals(codigoCurso)) {
                //ele atribui à variavel curso encontrada, o valor do objeto onde ele esta contido
                cursoEncontrado = cursoProcurado;
                //usando o valor atribuido a variavel local curso encontrado, agora podemos remover o objeto com o codigo equivalente ao solicitado
                curso.remove(cursoEncontrado);
                //em seguido imprime na tela avisando que o procedimento de remoção foi bem sucedido
                System.out.println("Curso removido com sucesso.");
            }
            //se nao encontrar apenas imprime na tela que não foi possivel
            System.out.println("Curso não cadastrado!");
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, Integer codigoProfessor, Integer quantidadeDeHoras) {

    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {

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
