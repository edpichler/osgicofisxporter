package com.edpichler.receita.services.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.edpichler.receita.interfaces.IMestreNFServicosEmitidasPJ;

public class GeradorMestreNFServicosEmitidasPJTest {

	@Test
	public void testGerarArquivo() throws IOException {
		GeradorMestreNFServicosEmitidasPJ g = new GeradorMestreNFServicosEmitidasPJ();
		g.gerarArquivo(getLista());
	}

	private List<IMestreNFServicosEmitidasPJ> getLista() {
		List<IMestreNFServicosEmitidasPJ> lista = new ArrayList<IMestreNFServicosEmitidasPJ>();
		for (int i = 0; i < 200; i++) {
			lista.add(create());
		}
		return lista;
	}

	private IMestreNFServicosEmitidasPJ create() {
		return new IMestreNFServicosEmitidasPJ() {

			@Override
			public double getValorTotalServico() {
				return getDouble();
			}

			private double getDouble() {
				return Math.random() * 5000;
			}

			@Override
			public double getValorTotalDesconto() {

				return getDouble();
			}

			@Override
			public double getValorIRRF() {

				return getDouble();
			}

			@Override
			public String getSerieSubserieDocumento() {

				return "A" + getDouble() + "Z";
			}

			@Override
			public int getNumberoDocumento() {

				return (int) +getDouble();
			}

			@Override
			public boolean getIndicadorSituacaoCancelamentoDocumento() {

				return false;
			}

			@Override
			public Date getDataEmissaoDocumento() {

				return new Date();
			}

			@Override
			public String getCodigoParticipante() {

				return "A" + getDouble() + "Z";
			}

			@Override
			public double getBaseCalculoIRRF() {

				return getDouble();
			}

			@Override
			public double getAliquotaIRRF() {

				return getDouble();
			}
		};
	}
}
