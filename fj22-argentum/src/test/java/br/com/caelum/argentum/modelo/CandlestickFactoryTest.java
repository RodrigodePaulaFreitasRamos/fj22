package br.com.caelum.argentum.modelo;

import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CandlestickFactoryTest {

	@Test
	public void sequenciaSimplesDeNegociacoes() {
		Calendar hoje = Calendar.getInstance();

		Negociacao negociacao1 = new Negociacao(40.5, 100, hoje);
		Negociacao negociacao2 = new Negociacao(45.0, 100, hoje);
		Negociacao negociacao3 = new Negociacao(39.8, 100, hoje);
		Negociacao negociacao4 = new Negociacao(42.3, 100, hoje);

		List<Negociacao> negociacoes = Arrays.asList(negociacao1, negociacao2, negociacao3, negociacao4);

		CandlestickFactory fabrica = new CandlestickFactory();
		Candlestick candle = fabrica.constroiCandleParaData(hoje, negociacoes);

		Assert.assertEquals(40.5, candle.Abertura(), 0.00001);
		Assert.assertEquals(42.3, candle.Fechamento(), 0.00001);
		Assert.assertEquals(39.8, candle.Minimo(), 0.00001);
		Assert.assertEquals(45.0, candle.Maximo(), 0.00001);
		Assert.assertEquals(1676.0, candle.Volume(), 0.00001);
	}
}