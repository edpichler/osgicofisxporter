package com.edpichler.receita.services.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.edpichler.receita.interfaces.DebitoCredito;
import com.edpichler.receita.interfaces.ISaldosMensais;

public class GeradorSaldosMensaisTest {
	@Test
	public void testGerar() throws IOException {
		new GeradorSaldosMensais().gerarArquivo(getLista());
	}

	private List<ISaldosMensais> getLista() {
		List<ISaldosMensais> lista = new ArrayList<ISaldosMensais>();
		for (int i = 0; i < 103; i++) {
			lista.add(new ISaldosMensais() {
				
				@Override
				public double getValorTotalDebitos() {

					return Math.random()  * 200;
				}
				
				@Override
				public double getValorTotalCreditos() {

					return Math.random()  * 200;
				}
				
				@Override
				public double getValorSaldoInicialMes() {

					return Math.random()  * 200;
				}
				
				@Override
				public double getValorSaldoFinalMes() {

					return 500.123;
				}
				
				@Override
				public DebitoCredito getDebitoCredito() {

					return DebitoCredito.CREDITO;
				}
				
				@Override
				public Date getDataSaldoInicial() {
					return Calendar.getInstance().getTime();
				}
				
				@Override
				public DebitoCredito getCreditoDebitoSaldoFinalMes() {

					return DebitoCredito.CREDITO;
				}
				
				@Override
				public String getCodigoContaAnalitica() {

					return null;
				}
			});
		}
		return lista;
	}
}
