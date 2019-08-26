package br.com.digitalhouse;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    //Attributos
    private List<Professor> professor = new ArrayList<>();
    private List<Aluno> alunos = new ArrayList<>();
    private List<Curso> curso = new ArrayList<>();
    private List<Matricula> matricula = new ArrayList<>();

    //Methods
    public void registrarCurso(String novoNome, Integer novoCodigoCurso, Integer novaQuantidadeMaximaDeAlunos) {
        //cria e instancia um novo urso com todos os atributos que o construtor pede
        Curso novoCurso = new Curso(novoNome, novoCodigoCurso, novaQuantidadeMaximaDeAlunos);     //********cria um curso
        //aqui adicinamos o novo curso instanciado na linha anterior dentro do list curso
        curso.add(novoCurso);
        //imprime informando no console do sucesso do procedimento
        System.out.println("Curso de " + novoCurso.getNomeCurso() + " registrado com sucesso!");
    }

    public void excluirCurso(Integer codigoCurso) {
        //Crio uma variável local sem atrbuir um valor
        Curso cursoEncontrado = null;
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
            } else {//se nao encontrar apenas imprime na tela que não foi possivel
                System.out.println("Curso não cadastrado!");
            }

        }
    }

    public void registrarProfessorAdjunto(String novoNome, String novoSobrenome, Integer novoCodigoProfessor, Integer novaQuantidadeDeHoras) {
        //cria e instancia um novo professor com todos os atributos que do construtor
        ProfessorAdjunto novoProfessorAdjunto = new ProfessorAdjunto(novoNome, novoSobrenome, novoCodigoProfessor, novaQuantidadeDeHoras);
        //atribuindo valor de 0 ao atributo tempodecasa do novo professor adjunto
        novoProfessorAdjunto.setTempoDeCasa(0);
        //adcionar o projessor adjunto instanciado em um list de Professores
        professor.add(novoProfessorAdjunto);
        //imprime no console que o metodo foi executado com sucesso
        System.out.println("O professor adjunto: " + novoNome + " " + novoSobrenome + " foi registrado com sucesso.");
    }

    public void registrarProfessorTitular(String novoNome, String novoSobrenome, Integer novoCodigoProfessor, String novaEspecialidade) {
        //cria e instancia um novo professor com todos os atributos que do construtor
        ProfessorTitular novoProfessorTitular = new ProfessorTitular(novoNome, novoSobrenome, novoCodigoProfessor, novaEspecialidade);
        //atribuindo valor de 0 ao atributo tempodecasa do novo professor titular
        novoProfessorTitular.setTempoDeCasa(0);
        //adcionar o projessor adjunto instanciado em um list de Professores
        professor.add(novoProfessorTitular);
        //imprime no console que o metodo foi executado com sucesso
        System.out.println("O professor titular: " + novoNome + " " + novoSobrenome + " foi registrado com sucesso.");
    }

    public void excluirProfessor(Integer codigoProfessor) {
        //Crio uma variável local sem atrbuir um valor
        Professor professorEncontrado = null;
        //verifica um por um todos os objetos do list professor usando a variável local professorProcurado
        for (Professor professorProcurado : professor) {
            //se encontrar um objeto com o mesmo código...
            if (professorProcurado.getCodigoProfessor().equals(codigoProfessor)) {
                //ele atribui à variavel curso encontrada, o valor do objeto onde ele esta contido
                professorEncontrado = professorProcurado;
                //usando o valor atribuido a variavel local curso encontrado, agora podemos remover o objeto com o codigo equivalente ao solicitado
                professor.remove(professorEncontrado);
                //imprime no console que o metodo foi executado com sucesso
                System.out.println("Professor titular " + professorEncontrado.getNome() + " " + professorEncontrado.getSobrenome() + " excluído com sucesso.");
            } else {
                //se o objeto não for encontrado no list imprime no console que o objeto não foi encontrado
                System.out.println("Impossível excluir, professor não cadastrado.");
            }


        }
    }

    public void registrarAluno(String nome, String sobrenome, Integer codigoAluno) {
        //cria e instancia um novo aluno com todos os atributos que do construtor
        Aluno novoAluno = new Aluno(nome, sobrenome, codigoAluno);
        //adiciona aluno instanciado em um list de Alunos
        alunos.add(novoAluno);
        System.out.println("Aluno: " + nome + " " + sobrenome + " foi matriculado com sucesso!");

    }

    public void matricularAluno(Integer novoCodigoAluno, Integer novoCodigoCurso) {
        //procurar o curso em que o aluno esta se matriculando
        Aluno alunoEncontrado = null;
        Curso cursoEncontrado = null;

        for (Curso curso : curso) {
            if (curso.getCodigoCurso().equals(novoCodigoCurso)) {
                cursoEncontrado = curso;
                System.out.println("***********************\nCurso encontraro\n***********************");
            }

        }
        for (Aluno aluno : alunos) {
            if (aluno.getCodigoAluno().equals(novoCodigoAluno)) {
                alunoEncontrado = aluno;
                System.out.println("***********************\nAluno encontrado\n***********************");
            }
        }
        assert cursoEncontrado != null;
        if ((cursoEncontrado.adicionarUmAluno(alunoEncontrado))) {
            Matricula novaMatricula = new Matricula(alunoEncontrado, cursoEncontrado);
            matricula.add(novaMatricula);
            System.out.println("Matrícula efetuada com sucesso!");

        } else {
            System.out.println("Matricula não pode ser efetuada");
        }
    }


    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {

        ProfessorTitular professorTitularEncontrado = null;
        ProfessorAdjunto professorAdjuntoEncontrado = null;
        Curso cursoEncontrado = null;

        for (Professor professor : professor) {
            if (professor.getCodigoProfessor().equals(codigoProfessorTitular)) {
                professorTitularEncontrado = (ProfessorTitular) professor;
            }
        }
        for (Professor professor : professor) {
            if (professor.getCodigoProfessor().equals(codigoProfessorAdjunto)) {
                professorAdjuntoEncontrado = (ProfessorAdjunto) professor;
            }
        }
        for (Curso curso : curso) {
            if (curso.getCodigoCurso().equals(codigoCurso)) {
                cursoEncontrado = curso;
            }

        }
        cursoEncontrado.setProfessorTitular(professorTitularEncontrado);
        cursoEncontrado.setProfessorAdjunto(professorAdjuntoEncontrado);


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
