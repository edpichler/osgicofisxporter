package com.edpichler.receita.interfaces;

import java.util.Date;

/**
 * 4.3.4 Arquivo itens mercadorias e servicos, entradas emitido por terceiros.
 * */
public interface ItensMercadoriasServicosEntradaEmitidosTerceiros {

	/**
	 * Tamanho = 2
	 */
	public String getModeloDocumento();

	/**
	 * Tamanho = 5
	 */
	public String getSerieSubserieDocumento();

	/**
	 * Tamanho = 9
	 */
	public int getNumeroDocumento();

	/**
	 * Tamanho = 8
	 */
	public Date getDataEmissaoDocumento();

	/**
	 * Tamanho = 14
	 */
	public String getCodigoParticipante();

	/**
	 * Tamanho = 3
	 */
	public int getNumeroDoItem();

	/**
	 * Tamanho = 20
	 */
	public String getCodigoMercadoriaServico();

	/**
	 * Tamanho = 45
	 */
	public String getDescricaoComplementar();

	/**
	 * Tamanho = 4
	 */
	public String getCodigoFiscaoOperacao();

	/**
	 * Tamanho = 6
	 */
	public String getNaturezaOperacao();

	/**
	 * Tamanho = 8
	 */
	public String getClassificaoFiscalMercadoria();

	/**
	 * Tamanho = 17
	 */
	public double getQuantidade();

	/**
	 * Tamanho = 3
	 */
	public String getUnidade();

	/**
	 * Tamanho = 17
	 */
	public double getValorUnitario();

	/**
	 * Tamanho = 17
	 */
	public double getValorTotalDoItem();

	/**
	 * Tamanho = 17
	 */
	public double getValorDescontoItem();

	/**
	 * Tamanho = 1
	 */
	public IndicadorTributacao getIndicadorTributacaoIpi();

	/**
	 * Tamanho = 5
	 */
	public double getAliquotaIpi();

	/**
	 * Tamanho = 17
	 */
	public double getBaseCalculoIpi();

	/**
	 * Tamanho = 17
	 */
	public double getValorIpi();

	/**
	 * Tamanho = 3
	 */
	public String getSituacaoTributariaEstadual();

	/**
	 * Tamanho = 1
	 */
	public IndicadorTributacao getIndicadorTributarioIcms();

	/**
	 * Tamanho = 5
	 */
	public double getAliquotaIcms();

	/**
	 * Tamanho = 17
	 */
	public double getBaseCalculoIcmsProprio();

	/**
	 * Tamanho = 17
	 */
	public double getBaseCalculoIcmsSubstituicaoTributaria();

	/**
	 * Tamanho = 17
	 */
	public double getValorIcmsProprio();

	/**
	 * Tamanho = 17
	 */
	public double getValorLancadoDocumentoFiscal();

	/**
	 * Tamanho = 17
	 */
	public double getValorIcmsSubstituicaoTributaria();

	/**
	 * Tamanho = 1
	 */
	public boolean getIndicadorMovimentacaoFisicaMercadoria();

	// 28 Indicador de Movimentação Física da Mercadoria 300 1 C Preencher com
	// "S" ou "N".

	/**
	 * Tamanho = 2
	 */
	public String getCodigoSituacaoTributariaIpi();
}
