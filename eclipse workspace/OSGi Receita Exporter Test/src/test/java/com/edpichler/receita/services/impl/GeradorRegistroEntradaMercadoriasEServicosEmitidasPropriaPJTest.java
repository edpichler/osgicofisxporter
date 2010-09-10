package com.edpichler.receita.services.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.edpichler.receita.interfaces.IRegistroEntradaMercadoriasEServicosEmitidasPropriaPJ;
import com.edpichler.receita.interfaces.IRegistroSaidaMercadoriasEServicos;

public class GeradorRegistroEntradaMercadoriasEServicosEmitidasPropriaPJTest {

	@Test
	public void testGerarArquivo() throws IOException {
		GeradorRegistroEntradaMercadoriasEServicosEmitidasPropriaPJ g = new GeradorRegistroEntradaMercadoriasEServicosEmitidasPropriaPJ();
		g.gerarArquivo(getLista());
	}

	private List<?> getLista() {
		List<IRegistroEntradaMercadoriasEServicosEmitidasPropriaPJ> li = new ArrayList<IRegistroEntradaMercadoriasEServicosEmitidasPropriaPJ>();

		for (int i = 0; i < 1200; i++) {
			li.add(create());
		}
		return li;
	}

	private IRegistroEntradaMercadoriasEServicosEmitidasPropriaPJ create() {
		return new IRegistroEntradaMercadoriasEServicosEmitidasPropriaPJ() {

			@Override
			public double getValorCreditoPisPasepVinculadoReceitaTributadaMercadoInterno() {
				return getDouble();
			}

			@Override
			public double getValorCreditoPisPasepVinculadoReceitaNaoTributadaMercadoInterno() {

				return getDouble();
			}

			@Override
			public double getValorCreditoPisPasepVinculadoReceitaExportacao() {

				return getDouble();
			}

			@Override
			public double getValorCreditoPisPasep() {

				return getDouble();
			}

			@Override
			public double getValorCreditoCofinsVinculadoReceitaTributadaMercadoInterno() {

				return getDouble();
			}

			@Override
			public double getValorCreditoCofinsVinculadoReceitaNaoTributadaMercadoInterno() {

				return getDouble();
			}

			@Override
			public double getValorCreditoCofinsVinculadoReceitaExportacao() {

				return getDouble();
			}

			@Override
			public double getValorCreditoCofins() {

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
			public String getCodigoSituacaoTributariaCofins() {

				return getString();
			}

			@Override
			public double getBaseCalculoCreditoPisPasep() {

				return getDouble();
			}

			@Override
			public double getBaseCalculoCreditoCofins() {

				return getDouble();
			}

			@Override
			public double getAliquotaCreditoPisPasep() {

				return getDouble();
			}

			@Override
			public double getAliquotaCreditoCofins() {

				return getDouble();
			}
		};
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
}
