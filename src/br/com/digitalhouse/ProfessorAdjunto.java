package br.com.digitalhouse;

public class ProfessorAdjunto extends Professor{
    //Attributes
    private Integer horasMonitoria;

    //Constructor
    public ProfessorAdjunto(String nome, String sobrenome, Integer tempoDeCasa, Integer codigoProfessor,Integer horasMonitoria) {
        super(nome, sobrenome, tempoDeCasa, codigoProfessor);
        this.horasMonitoria = horasMonitoria;
    }

    //Getters and Setters
    public Integer getHorasMonitoria() {
        return horasMonitoria;
    }

    public void setHorasMonitoria(Integer horasMonitoria) {
        this.horasMonitoria = horasMonitoria;
    }
}
