package atividades.pontoExtra;


public class Aluno implements Comparable<Aluno> {
	private String matricula;
	private String nome;
	private double media;
	private int faltas;
	
	public Aluno(String matricula, String nome) {
		this.matricula = matricula;
		this.nome = nome;
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

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public int getFaltas() {
		return faltas;
	}

	public void setFaltas(int faltas) {
		this.faltas = faltas;
	}

	@Override
	public String toString() {
		return "Aluno [matricula=" + matricula + ", nome=" + nome + ", media=" + media + ", faltas=" + faltas + "]";
	}
	
	//esse compareTo é o da nossa classe
	public int compareTo(Aluno aluno){
		int resultado;
		//esse compareTo é o da classe string(objeto this.matricula é string)
		//compara objeto que chamou o método com objeto a ser comparado(matricula)
		resultado = this.getMatricula().compareTo(aluno.matricula);
		return resultado;
	}
}
    

    



