package br.ufpb.horarioJogo;

import java.io.IOException;

public class Hora {
	private int minutos;
	private int horas;
	
	
	public Hora(int horas, int minutos) throws IOException{
		if(minutos > 60 || minutos < 0 || (minutos <=0 && horas <=0) || horas < 0 || horas > 24) {
			throw new IOException();
		}
		this.horas = horas;
		this.minutos = minutos;
	}
	
	public Hora(int minutos) {
		this.horas = minutos/60;
		this.minutos = minutos % 60; 
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hora other = (Hora) obj;
		if (horas != other.horas)
			return false;
		if (minutos != other.minutos)
			return false;
		return true;
	}
	public String getHora() {
		return "Hora: "+this.horas+" minutos"+this.minutos;
	}
	public int getHoras() {
		return this.horas;
	}
	public int getMinutos() {
		return this.minutos;
	}
	public int getTempoEmMinutos() {
		return (this.horas*60) + this.minutos;
	}
	
}
