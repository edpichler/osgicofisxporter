package com.edpichler.receita.services.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.edpichler.receita.interfaces.ItensNotasFiscaisServicoEmitidasPj;

public class GeradorItensNotasFiscaisServicoEmitidasPjTest {

	@Test
	public void testGerarArquivo() throws IOException {
		GeradorItensNotasFiscaisServicoEmitidasPj g = new GeradorItensNotasFiscaisServicoEmitidasPj();

		g.gerarArquivo(getLista());
	}

	private List<ItensNotasFiscaisServicoEmitidasPj> getLista() {

		List<ItensNotasFiscaisServicoEmitidasPj> lista = new ArrayList<ItensNotasFiscaisServicoEmitidasPj>();
		for (int i = 0; i < 500; i++) {
			lista.add(create());
		}
		;

		return lista;
	}

	private ItensNotasFiscaisServicoEmitidasPj create() {
		return new ItensNotasFiscaisServicoEmitidasPj() {

			@Override
			public double getValorServico() {

				return getDouble();
			}

			private double getDouble() {
				return (Math.random() * 6000);
			}

			@Override
			public double getValorIss() {

				return getDouble();
			}

			@Override
			public String getSerieSubserieDocumento() {

				return "A" + getDouble() + "Z";
			}

			@Override
			public int getNumeroItem() {
				return (int) (Math.random() * 600);
			}

			@Override
			public int getNumberoDocumento() {
				return (int) getDouble();
			}

			@Override
			public String getDescricaoComplementarServico() {

				return "A" + getDouble() + "Z";
			}

			@Override
			public double getDescontoServico() {

				return getDouble();
			}

			@Override
			public Date getDataEmissaoDocumento() {

				return new Date();
			}

			@Override
			public String getCodigoServico() {

				return "A" + getDouble() + "Z";
			}

			@Override
			public double getBaseCalculoIss() {

				return getDouble();
			}

			@Override
			public double getAliquotaISS() {

				return getDouble();
			}
		};
	}
}
