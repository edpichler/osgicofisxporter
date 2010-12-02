package com.edpichler.receita.interfaces;

import java.util.Date;
/**
 * 4.4.1 Arquivo de exportações
 *   
 * */
public interface IExportacao {

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
	 * Tamanho = 12
	 */
	public long getNumeroRegistroExportacao();

	/**
	 * Tamanho = 12
	 */
	public long getNumeroDespachoExportacao();

}
