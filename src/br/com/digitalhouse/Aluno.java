package br.com.digitalhouse;

public class Aluno {
    //Attributes
    private String nome;
    private String sobrenome;
    private Integer codigoluno;

    //Constructor
    public Aluno() {
    }

    public Aluno(String nome, String sobrenome, Integer codigoluno) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.codigoluno = codigoluno;
    }

    //Getter and Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getCodigoluno() {
        return codigoluno;
    }

    public void setCodigoluno(Integer codigoluno) {
        this.codigoluno = codigoluno;
    }


}
