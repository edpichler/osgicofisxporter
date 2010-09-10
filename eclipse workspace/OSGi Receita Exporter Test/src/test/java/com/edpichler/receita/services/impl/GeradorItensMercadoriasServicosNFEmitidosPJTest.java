package com.edpichler.receita.services.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.edpichler.receita.interfaces.EntradaSaida;
import com.edpichler.receita.interfaces.IndicadorTributacao;
import com.edpichler.receita.interfaces.ItensMercadoriasServicosNFEmitidosPJ;

public class GeradorItensMercadoriasServicosNFEmitidosPJTest {

	@Test
	public void testGerarArquivo() throws IOException {
		GeradorItensMercadoriasServicosNFEmitidosPJ g = new GeradorItensMercadoriasServicosNFEmitidosPJ();
		g.gerarArquivo(getLista());
	}

	private List<ItensMercadoriasServicosNFEmitidosPJ> getLista() {
		List<ItensMercadoriasServicosNFEmitidosPJ> li = new ArrayList<ItensMercadoriasServicosNFEmitidosPJ>();
		for (int i = 0; i < 1222; i++) {
			li.add(create());
		}
		return li;
	}

	private ItensMercadoriasServicosNFEmitidosPJ create() {

		return new ItensMercadoriasServicosNFEmitidosPJ() {

			@Override
			public double getValorUnitario() {

				return getDouble();
			}

			private double getDouble() {
				return Math.random() * 6000;
			}

			@Override
			public double getValorTotalDoItem() {

				return getDouble();
			}

			@Override
			public double getValorIpi() {
				return getDouble();
			}

			@Override
			public double getValorIcmsSubstituicaoTributaria() {
				return getDouble();
			}

			@Override
			public double getValorIcmsProprio() {
				return getDouble();
			}

			@Override
			public double getValorDescontoItem() {
				return getDouble();
			}

			@Override
			public String getUnidade() {
				return getString();
			}

			private String getString() {

				return "A" + getDouble() + "Z";
			}

			@Override
			public String getSituacaoTributariaEstadual() {
				return getString();
			}

			@Override
			public String getSerieSubserieDocumento() {
				return getString();
			}

			@Override
			public double getQuantidade() {
				return getDouble();
			}

			@Override
			public int getNumeroDocumento() {
				return (int) getDouble();
			}

			@Override
			public int getNumeroDoItem() {
				return (int) (Math.random() * 111);
			}

			@Override
			public String getModeloDocumento() {
				return getString();
			}

			@Override
			public IndicadorTributacao getIndicadorTributarioIcms() {
				return IndicadorTributacao.OUTRAS;
			}

			@Override
			public IndicadorTributacao getIndicadorTributacaoIpi() {

				return IndicadorTributacao.ISENTO_OU_NAO_TRIBUTADO;
			}

			@Override
			public EntradaSaida getIndicadorMovimento() {
				return EntradaSaida.SAIDA;
			}

			@Override
			public boolean getIndicadorMovimentacaoFisicaMercadoria() {
				return getBoolean();
			}

			private boolean getBoolean() {
				if (getDouble() % 2 == 0) {
					return false;
				} else {
					return true;
				}
			}

			@Override
			public String getDescricaoComplementar() {
				return getString();
			}

			@Override
			public Date getDataEmissaoDocumento() {
				return new Date();
			}

			@Override
			public String getCodigoSituacaoTributariaIpi() {
				return getString();
			}

			@Override
			public String getCodigoNaturezaOperacao() {
				return getString();
			}

			@Override
			public String getCodigoMercadoriaServico() {
				return getString();
			}

			@Override
			public String getCodigoFiscalOperacao() {
				return getString();
			}

			@Override
			public String getClassificaoFiscalMercadoria() {
				return getString();
			}

			@Override
			public double getBaseCalculoIpi() {
				return getDouble();
			}

			@Override
			public double getBaseCalculoIcmsSubsituicaoTributaria() {
				return getDouble();
			}

			@Override
			public double getBaseCalculoIcmsProprio() {
				return getDouble();
			}

			@Override
			public double getAliquotaIpi() {
				return getDouble();
			}

			@Override
			public double getAliquotaIcms() {
				return getDouble();
			}
		};
	}
}
