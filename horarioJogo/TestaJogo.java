package br.ufpb.horarioJogo;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestaJogo {
	private Jogo jogo1;
	private Jogo jogo2;
	protected Jogo jogo3;
	private Jogo jogo4;
	
	@BeforeEach 
	void setUp() {
		try {
			this.jogo1 = new Jogo(new Hora(-12,30), new Hora(15,30));
			fail("Devia lançar exception");
			this.jogo2 = new Jogo(new Hora(10,90), new Hora(15,30));
			fail("Devia lançar exception");
		} catch (IOException e) {
			
		}
		try {
			Hora inicio = new Hora(10,15);
			Hora fim = new Hora(12,15);
			this.jogo3 = new Jogo(inicio, fim);
			this.jogo4 = new Jogo(new Hora(12, 18), new Hora(13,14));
		} catch (IOException e) {
			fail("Não devia lançar exception");
			e.printStackTrace();
		}
	}
	
	@Test
	void test() throws IOException { 
		assertEquals("Primeiro teste",jogo3.calculaTempo(), new Hora(2,0));
		assertEquals("Primeiro teste",jogo4.calculaTempo(), new Hora(0,56));

	}

}
