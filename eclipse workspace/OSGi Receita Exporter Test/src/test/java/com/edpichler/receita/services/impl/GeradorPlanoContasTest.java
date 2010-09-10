package com.edpichler.receita.services.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.edpichler.receita.interfaces.IPlanoContas;
import com.edpichler.receita.interfaces.TipoConta;

public class GeradorPlanoContasTest {

	@Test
	public void testGerarArquivo() throws IOException {
		List<IPlanoContas> param = new ArrayList<IPlanoContas>();
		for (int i = 0; i < 30; i++) {
			param.add(createPlanoContas());
		}

		new GeradorPlanoContas().gerarArquivo(param);
	}

	private IPlanoContas createPlanoContas() {
		IPlanoContas plano = new IPlanoContas() {

			@Override
			public TipoConta getTipoConta() {

				return TipoConta.ANALITICA;
			}

			@Override
			public String getDescicao() {

				return "Tipo de conta.....est... ";
			}

			@Override
			public Date getDataAtualizacao() {

				return null;
			}

			@Override
			public String getCodigoContaTotalizadora() {

				return null;
			}

			@Override
			public String getCodigoConta() {

				return "23423424234";
			}
		};
		return plano;
	}

}
