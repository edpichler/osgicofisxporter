package com.edpichler.receita.services.impl;

import static org.junit.Assert.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.edpichler.receita.interfaces.IndicadorTributacao;
import com.edpichler.receita.interfaces.ItensMercadoriasServicosEntradaEmitidosTerceiros;

public class GeradorItensMercadoriasEServicosEmitidosPorTerceirosTest {

	@Test
	public void testGerarArquivo() throws IOException {
		GeradorItensMercadoriasEntradaServicosEmitidosPorTerceiros g = new GeradorItensMercadoriasEntradaServicosEmitidosPorTerceiros();
		g.gerarArquivo(getList());
	}

	private List<ItensMercadoriasServicosEntradaEmitidosTerceiros> getList() {
		List<ItensMercadoriasServicosEntradaEmitidosTerceiros> itens = new ArrayList<ItensMercadoriasServicosEntradaEmitidosTerceiros>();
		for (int i = 0; i < 1000; i++) {
			itens.add(create());
		}
		return itens;
	}

	private ItensMercadoriasServicosEntradaEmitidosTerceiros create() {
		return new ItensMercadoriasServicosEntradaEmitidosTerceiros() {

			@Override
			public double getValorUnitario() {

				return createDouble();
			}

			private double createDouble() {
				return ((double) Math.random()) * 1000;
			}

			@Override
			public double getValorTotalDoItem() {
				return createDouble();
			}

			@Override
			public double getValorLancadoDocumentoFiscal() {
				return createDouble();
			}

			@Override
			public double getValorIpi() {
				return createDouble();

			}

			@Override
			public double getValorIcmsSubstituicaoTributaria() {
				return createDouble();
			}

			@Override
			public double getValorIcmsProprio() {
				return createDouble();
			}

			@Override
			public double getValorDescontoItem() {
				return createDouble();
			}

			@Override
			public String getUnidade() {
				return createString();
			}

			@Override
			public String getSituacaoTributariaEstadual() {
				return createString();
			}

			@Override
			public String getSerieSubserieDocumento() {
				return createString();
			}

			@Override
			public double getQuantidade() {
				return createDouble();
			}

			@Override
			public int getNumeroDocumento() {
				return (int) createDouble();
			}

			@Override
			public int getNumeroDoItem() {
				return (int) createDouble();
			}

			@Override
			public String getNaturezaOperacao() {
				return createString();
			}

			@Override
			public String getModeloDocumento() {
				return createString();
			}

			@Override
			public IndicadorTributacao getIndicadorTributarioIcms() {
				return IndicadorTributacao.OUTRAS;
			}

			@Override
			public IndicadorTributacao getIndicadorTributacaoIpi() {

				return IndicadorTributacao.OUTRAS;
			}

			@Override
			public boolean getIndicadorMovimentacaoFisicaMercadoria() {

				return false;
			}

			@Override
			public String getDescricaoComplementar() {
				return createString();
			}

			@Override
			public Date getDataEmissaoDocumento() {

				return new Date();
			}

			@Override
			public String getCodigoSituacaoTributariaIpi() {
				return createString();
			}

			@Override
			public String getCodigoParticipante() {
				return createString();
			}

			@Override
			public String getCodigoMercadoriaServico() {
				return createString();
			}

			@Override
			public String getCodigoFiscaoOperacao() {
				return createString();
			}

			@Override
			public String getClassificaoFiscalMercadoria() {
				return createString();
			}

			private String createString() {
				String x = "A" + createDouble() + "Z";
				return x;
			}

			@Override
			public double getBaseCalculoIpi() {
				return createDouble();
			}

			@Override
			public double getBaseCalculoIcmsSubstituicaoTributaria() {
				return createDouble();
			}

			@Override
			public double getBaseCalculoIcmsProprio() {
				return createDouble();
			}

			@Override
			public double getAliquotaIpi() {
				return createDouble();
			}

			@Override
			public double getAliquotaIcms() {
				return createDouble();
			}
		};
	}

}
