package br.com.caelum.argentum.modelo;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import br.com.caelum.argentum.modelo.Candlestick;
import br.com.caelum.argentum.modelo.CandlestickFactory;
import br.com.caelum.argentum.modelo.Negociacao;

public class TestaCandlestickFactorySemNegociacoes {

	  public static void main(String[] args) {
	    Calendar hoje = Calendar.getInstance();
	    
	    List<Negociacao> negociacoes = Arrays.asList();
	    
	    CandlestickFactory fabrica = new CandlestickFactory();
	    Candlestick candle = fabrica.constroiCandleParaData(hoje, 
	    		negociacoes);
	    
	    System.out.println(candle.Abertura());
	    System.out.println(candle.Fechamento());
	    System.out.println(candle.Minimo());
	    System.out.println(candle.Maximo());
	    System.out.println(candle.Volume());
	  }
	}