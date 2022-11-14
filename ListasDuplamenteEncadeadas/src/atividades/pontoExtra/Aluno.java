package atividades.pontoExtra;

public class Aluno {
    private String matricula;
    private String nome;
    private double mediaFinal;
    private int faltas;

    public Aluno(String matricula, String nome, double mediaFinal, int faltas) {
        this.matricula = matricula;
        this.nome = nome;
        this.mediaFinal = mediaFinal;
        this.faltas = faltas;
    }

    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getMediaFinal() {
        return mediaFinal;
    }

    public void setMediaFinal(double mediaFinal) {
        this.mediaFinal = mediaFinal;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }

    @Override
    public String toString() {
        return "Aluno [matricula=" + matricula + ", nome=" + nome + ", mediaFinal=" + mediaFinal + ", faltas=" + faltas
                + "]";
    }

    public int compareTo(String matricula){
        return this.getMatricula().compareTo(matricula);
    }

    

    
}


