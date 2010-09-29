package com.edpichler.receita.interfaces;

import java.util.Date;

/**
 * 4.10.1 Arquivo complementar de registro de saída de Mercadorias/Serviços
 * */
public interface IRegistroSaidaMercadoriasEServicos {

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
	 * Tamanho = 3
	 */
	public int getNumeroDoItem();

	/**
	 * Tamanho = 2
	 */
	public String getCodigoSituacaoTributariaPisPasep();
	/**
	 * Tamanho = 2
	 */
	public String getCodigoSituacaoTributariaCofins();

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
