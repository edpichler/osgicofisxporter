package com.edpichler.receita.services.impl;

import static org.junit.Assert.fail;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.edpichler.receita.interfaces.ICentroCustoDespesa;
import com.edpichler.receita.services.GeradorArquivos;

public class GeradorCentroCustoTest {

	@Test
	public void testGerarArquivoCentroCustoDespesas() {
		List<ICentroCustoDespesa> lista = new ArrayList<ICentroCustoDespesa>();
		for (int i = 0; i < 20; i++) {
			lista.add(generateCentroCusto());
		}

		GeradorArquivos gerador = new GeradorArquivos();
		try {
			gerador.gerarArquivoCentroCustoDespesas(lista);
		} catch (IOException e) {

			e.printStackTrace();
			fail(e.getMessage());
		}
	}

	private ICentroCustoDespesa generateCentroCusto() {
		return new ICentroCustoDespesa() {

			@Override
			public String getDescricao() {

				return "Des";
			}

			@Override
			public Date getDataAtualizacao() {

				return Calendar.getInstance().getTime();
			}

			@Override
			public String getCodigo() {

				return ((int) (Math.random() * 200)) + "3982893";
			}
		};
	}

}
