package br.com.digitalhouse;

public class ProfessorTitular extends Professor{
    //Attributes
    private String especialidade;


    //Constructor
    public ProfessorTitular(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor, String especialidade) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
        this.especialidade = especialidade;
    }

    //Getters and Setters
    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
