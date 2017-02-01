package br.com.caelum.argentum.modelo;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

public final class Negociacao {
	private final double preco;
	public Negociacao(double preco, int quantidade, Calendar data) {
		this.preco = preco;
		this.quantidade = quantidade;
		this.data = data;
	}
	private final int quantidade;
	private final Calendar data;
	public double getPreco() {
		return preco;
	}
	public int getQuantidade() {
		return quantidade;
	}
	public Calendar getData() {
		return data;
	}
	public double getVolume() {
		return preco * quantidade;
	}
	public boolean isMesmoDia(Calendar outraData) {
		  return this.data.equals(outraData);
		}
		
	@Test
	public void mesmoMilissegundoEhDoMesmoDia() {
		  Calendar agora = Calendar.getInstance();
		  Calendar mesmoMomento = (Calendar) agora.clone();

		  Negociacao negociacao = new Negociacao(40.0, 100, agora);
		  Assert.assertTrue(negociacao.isMesmoDia(mesmoMomento));
		}
	
}
