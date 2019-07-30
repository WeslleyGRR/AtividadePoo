package br.ufpb.horarioJogo;


public class Jogo {
	protected Hora inicio;
	protected Hora fim;
	
	public Jogo(Hora inicial, Hora fim ) {
		this.inicio = inicial;
		this.fim = fim;
	}
	
	public Hora calculaTempo() {
		int total = fim.getTempoEmMinutos() - inicio.getTempoEmMinutos();
		Hora duracao = new Hora(total);
		return duracao;
	}
	
	
}
