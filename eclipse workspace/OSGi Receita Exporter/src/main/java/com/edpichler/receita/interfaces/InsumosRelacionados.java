package com.edpichler.receita.interfaces;

import java.util.Date;

/** 4.6.1 Arquivo de insumos relacionados. */
public interface InsumosRelacionados {

	/**
	 * Tamanho = 20
	 */
	public String getCodigoProduto();

	/**
	 * Tamanho = 3
	 */
	public String getUnidadeProduto();

	/**
	 * Tamanho = 20
	 */
	public String getCodigoInsumo();

	/**
	 * Tamanho = 17
	 */
	public double getQuantidade();

	/**
	 * Tamanho = 5
	 */
	public double getPercentualPerda();

	/**
	 * Tamanho = 3
	 */
	public String getUnidade();

	/**
	 * Tamanho = 8
	 */
	public Date getDataInicio();

	/**
	 * Tamanho = 8
	 */
	public Date getDataFinal();

}
