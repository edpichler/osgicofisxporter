package com.edpichler.receita.services.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.edpichler.receita.interfaces.INaturezaOperacao;

public class GeradorNaturezaDaOperacaoTest {

	@Test
	public void testGerarArquivo() throws IOException {
		GeradorNaturezaDaOperacao ger = new GeradorNaturezaDaOperacao();
		ger.gerarArquivo(getLista());
	}

	private List<?> getLista() {
	    ArrayList<INaturezaOperacao> arr = new ArrayList<INaturezaOperacao>();
	    for (int i = 0; i < 133; i++) {
			arr.add(new INaturezaOperacao() {
				
				@Override
				public String getDescricao() {

					return "descricao";
				}
				
				@Override
				public Date getDataAtualizacao() {
					return Calendar.getInstance().getTime();
				}
				
				@Override
				public String getCodigoNaturezaOperacao() {
					return "ADAFE";
				}
			});
		}
		return arr;
	}

}
