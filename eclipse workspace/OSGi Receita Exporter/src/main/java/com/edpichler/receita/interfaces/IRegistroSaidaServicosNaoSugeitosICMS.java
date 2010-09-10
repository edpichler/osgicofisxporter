package com.edpichler.receita.interfaces;

import java.util.Date;
/**
 * 4.10.2 Arquivo complementar de registro de saída de serviços, não sujeitos ao ICMS
 * */
public interface IRegistroSaidaServicosNaoSugeitosICMS {
	/**
	 * Tamanho = 5
	 */
	public String getSerieSubSerieDocumento();

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
	 * Tamanho = 2
	 */
	public String getCodigoSituacaoTributariaPisPasep();

	/**
	 * Tamanho = 8
	 */
	public double getAliquotaPisPasep();

	/**
	 * Tamanho = 17
	 */
	public double getBaseCalculoPisPasep();

	/**
	 * Tamanho = 17
	 */
	public double getValorPisPasep();

	/**
	 * Tamanho = 2
	 */
	public String getCodigoSituacaoTributariaCofins();

	/**
	 * Tamanho = 8
	 */
	public double getAliquotaCofins();

	/**
	 * Tamanho = 17
	 */
	public double getBaseCalculoCofins();

	/**
	 * Tamanho = 17
	 */
	public double getValorCofins();

	/**
	 * Tamanho = 8
	 */
	public Date getDataApropriacao();
}
