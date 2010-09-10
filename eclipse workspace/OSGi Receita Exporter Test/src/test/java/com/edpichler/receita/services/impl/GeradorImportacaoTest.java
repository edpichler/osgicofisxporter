package com.edpichler.receita.services.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.edpichler.receita.interfaces.IImportacao;


public class GeradorImportacaoTest {
	@Test
	public void testGerarExportacao() throws IOException{
		List<IImportacao> lista = new ArrayList<IImportacao>();
		for (int i = 0; i < 200; i++) {
			lista.add(createIE());
		}
		new GeradorImportacao().gerarArquivo(lista);
	}

	private IImportacao createIE() {
		return new IImportacao() {
			
			@Override
			public String getSerieSubserieDocumento() {

				return "242434134";
			}
			
			@Override
			public int getNumeroDocumento() {

				return 13412340;
			}
			
			@Override
			public int getNumeroDeclaracaoImportacao() {

				return 01234124;
			}
			
			@Override
			public String getModeloDocumento() {

				return "231434";
			}
			
			@Override
			public Date getDataEmissaoDocumento() {

				return Calendar.getInstance().getTime();
			}
		};
		
	}
}
