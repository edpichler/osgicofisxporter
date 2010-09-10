package com.edpichler.receita.services.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.edpichler.receita.interfaces.IRegistroSaidaMercadoriasEServicos;

public class GeradorRegistroSaidaMercadoriasEServicosTest {

	@Test
	public void testGerarArquivo() throws IOException {
		GeradorRegistroSaidaMercadoriasEServicos g = new GeradorRegistroSaidaMercadoriasEServicos();
		g.gerarArquivo(getLista());
	}

	private List<?> getLista() {
		List<IRegistroSaidaMercadoriasEServicos> li = new ArrayList<IRegistroSaidaMercadoriasEServicos>();

		for (int i = 0; i < 1200; i++) {
			li.add(create());
		}
		return li;
	}

	private IRegistroSaidaMercadoriasEServicos create() {
		return new IRegistroSaidaMercadoriasEServicos() {

			@Override
			public double getValorPisPasep() {

				return getDouble();
			}

			@Override
			public double getValorCofins() {

				return getDouble();
			}

			@Override
			public String getSerieSubserieDocumento() {

				return getString();
			}

			@Override
			public int getNumeroDocumento() {
				return getInt();
			}

			@Override
			public int getNumeroDoItem() {

				return getInt();
			}

			@Override
			public String getModeloDoDocumento() {

				return getString();
			}

			@Override
			public Date getDataEmissaoDocumento() {

				return getDate();
			}

			@Override
			public Date getDataApropriacao() {

				return getDate();
			}

			@Override
			public String getCodigoSituacaoTributariaPisPasep() {

				return getString();
			}

			@Override
			public double getBaseCalculoPisPasep() {
				return getDouble();
			}

			@Override
			public double getBaseCalculoCofins() {
				return getDouble();
			}

			@Override
			public double getAliquotaPisPasep() {

				return getDouble();
			}

			@Override
			public double getAliquotaCofins() {

				return getDouble();
			}

			private double getDouble() {
				return Math.random() * 200;
			}

			private String getString() {
				return "a" + getDouble() + "z";
			}

			private int getInt() {
				return (int) getDouble();
			}

			private Date getDate() {
				return new Date();
			}
		};
	}

}
