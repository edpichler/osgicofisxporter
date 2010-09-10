package com.edpichler.receita.interfaces;

import java.util.Date;

/**
 * 4.10.5 Arquivo complementar de registro de entrada de Mercadorias/Serviços,
 * emitidas por terceiros
 * */
public interface IRegistroSaidaMercadoriasEServicosEmitidasTerceiros {
	/**
	 * Tamanho = 2
	 */
	public String getModeloDoDocumento();

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
	 * Tamanho = 2
	 */
	public String getCodigoSituacaoTributariaPisPasep();

	/**
	 * Tamanho = 8
	 */
	public double getAliquotaCreditoPisPasep();

	/**
	 * Tamanho = 17
	 */
	public double getBaseCalculoCreditoPisPasep();

	/**
	 * Tamanho = 17
	 */
	public double getValorCreditoPisPasepVinculadoReceitaExportacao();

	/**
	 * Tamanho = 17
	 */
	public double getValorCreditoPisPasepVinculadoReceitaTributadaMercadoInterno();

	/**
	 * Tamanho = 17
	 */
	public double getValorCreditoPisPasepVinculadoReceitaNaoTributadaMercadoInterno();

	/**
	 * Tamanho = 17
	 */
	public double getValorCreditoPisPasep();

	/**
	 * Tamanho = 2
	 */
	public String getCodigoSituacaoTributariaCofins();

	/**
	 * Tamanho = 8
	 */
	public double getAliquotaCreditoCofins();

	/**
	 * Tamanho = 17
	 */
	public double getBaseCalculoCreditoCofins();

	/**
	 * Tamanho = 17
	 */
	public double getValorCreditoCofinsVinculadoReceitaExportacao();

	/**
	 * Tamanho = 17
	 */
	public double getValorCreditoCofinsVinculadoReceitaTributadaMercadoInterno();

	/**
	 * Tamanho = 17
	 */
	public double getValorCreditoCofinsVinculadoReceitaNaoTributadaMercadoInterno();

	/**
	 * Tamanho = 17
	 */
	public double getValorCreditoCofins();

	/**
	 * Tamanho = 8
	 */
	public Date getDataApropriacao();
}
