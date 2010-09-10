package com.edpichler.receita.interfaces;

import java.util.Date;

/**
 * 4.9.5 Tabela de Mercadorias e Servicos.
 * */
public interface IMercadoriasServicos {
	/**
	 * Tamanho = 8
	 */
	public Date getDataAtualizacao();

	/**
	 * Tamanho = 20
	 */
	public String getCodigoMercadoria();

	/**
	 * Tamanho = 45
	 */
	public String getDescricao();

}
