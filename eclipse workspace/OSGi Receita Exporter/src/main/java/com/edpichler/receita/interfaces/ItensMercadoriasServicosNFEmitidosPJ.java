package com.edpichler.receita.interfaces;

import java.util.Date;

/**
 * 4.3.2 Arquivo de Itens de Mercadorias/Serviços - Notas Fiscais de Saída ou de
 * Entrada Emitidas pela Pessoa Jurídica.
 * */
public interface ItensMercadoriasServicosNFEmitidosPJ {
	/**
	 * Tamanho = 1
	 */
	public EntradaSaida getIndicadorMovimento();

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
	public String getCodigoFiscalOperacao();

	/**
	 * Tamanho = 6
	 */
	public String getCodigoNaturezaOperacao();

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
	public double getValorIcmsProprio();

	/**
	 * Tamanho = 17
	 */
	public double getBaseCalculoIcmsSubsituicaoTributaria();

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
