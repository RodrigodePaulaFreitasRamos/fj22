package br.com.caelum.argentum.modelo;

import java.util.Calendar;
import java.util.List;

public class CandlestickFactory {
	// ctrl+1 para adicionar o return automaticamente
	public Candlestick constroiCandleParaData(Calendar data, List<Negociacao> negociacoes) {
		double maximo = negociacoes.get(0).getPreco();
		double minimo = negociacoes.get(0).getPreco();
		double volume = 0;

		//digite foreach e de um ctrl + espaço para ajudar a criar o bloco abaixo
		for (Negociacao negociacao : negociacoes){
			volume +=negociacao.getVolume();
		
		
		if (negociacao.getPreco() > maximo) {
			maximo = negociacao.getPreco();
		} else if (negociacao.getPreco() < minimo) {
			minimo = negociacao.getPreco();
		}
		}

		double abertura = negociacoes.get(0).getPreco();
		double fechamento = negociacoes.get(negociacoes.size() - 1).getPreco();
		return new Candlestick(abertura, fechamento, minimo, maximo, volume, data);

	}
}