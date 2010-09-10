package com.edpichler.receita.interfaces;

import java.util.Date;

/** 4.9.4 Tabela natureza da operação. */
public interface INaturezaOperacao {
	/**
	 * Tamanho = 8
	 */
	public Date getDataAtualizacao();

	/**
	 * Tamanho = 6
	 */
	public String getCodigoNaturezaOperacao();

	/**
	 * Tamanho = 45
	 */
	public String getDescricao();

}
