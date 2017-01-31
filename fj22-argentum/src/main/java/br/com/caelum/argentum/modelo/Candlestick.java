//recursos feitos a mao
package br.com.caelum.argentum.modelo;

import java.util.Calendar;

public final class Candlestick {
private final double abertura;
public double Abertura() {
	return abertura;
}
public double Fechamento() {
	return fechamento;
}
public double Minimo() {
	return minimo;
}
public double Maximo() {
	return maximo;
}
public double Volume() {
	return volume;
}
public Calendar Data() {
	return data;
}
private final double fechamento;
private final double minimo;
private final double maximo;
private final double volume;
private final Calendar data;
public Candlestick(double abertura, double fechamento, double minimo, double maximo, double volume, Calendar data) {
	this.abertura = abertura;
	this.fechamento = fechamento;
	this.minimo = minimo;
	this.maximo = maximo;
	this.volume = volume;
	this.data = data;
}
	public boolean isAlta(){
		return this.abertura < this.fechamento;
		
	}
	public boolean isBaixa() {
		return this.abertura > this.fechamento;
	}
}
