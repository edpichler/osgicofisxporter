package com.edpichler.receita.services.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.edpichler.receita.interfaces.IExportacao;


public class GeradorExportacaoTest {
	@Test
	public void testGerarExportacao() throws IOException{
		List<IExportacao> lista = new ArrayList<IExportacao>();
		for (int i = 0; i < 200; i++) {
			lista.add(createIE());
		}
		new GeradorExportacao().gerarArquivo(lista);
	}

	private IExportacao createIE() {
		return new IExportacao() {
			
			@Override
			public String getSerieSubserieDocumento() {
				
				return "23424242424234";
			}
			
			@Override
			public int getNumeroRegistroExportacao() {
				
				return 23424240;
			}
			
			@Override
			public int getNumeroDocumento() {
				
				return 02342424;
			}
			
			@Override
			public int getNumeroDespachoExportacao() {
				
				return 24234240;
			}
			
			@Override
			public String getModeloDocumento() {
				
				return "424123";
			}
			
			@Override
			public Date getDataEmissaoDocumento() {
				
				return Calendar.getInstance().getTime();
			}
		};
		
	}
}
