package com.edpichler.receita.interfaces;

import java.util.Date;

/**
 * 4.4.2 Arquivo de importações
 * */
public interface IImportacao {
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
	 * Tamanho = 10
	 */
	public int getNumeroDeclaracaoImportacao();

}
