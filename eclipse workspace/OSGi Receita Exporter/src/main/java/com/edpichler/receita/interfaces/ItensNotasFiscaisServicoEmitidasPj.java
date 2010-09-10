package com.edpichler.receita.interfaces;

import java.util.Date;

/**
 * 4.3.6 Arquivo de Itens de Notas Fiscais de Serviço Emitidas pela Pessoa
 * Jurídica
 * */
public interface ItensNotasFiscaisServicoEmitidasPj {
	/**
	 * Tamanho = 5
	 * */
	public String getSerieSubserieDocumento();

	/**
	 * Tamanho = 6
	 * */
	public int getNumberoDocumento();

	/**
	 * Tamanho = 8
	 * */
	public Date getDataEmissaoDocumento();

	/**
	 * Tamanho = 3
	 * */
	public int getNumeroItem();

	/**
	 * Tamanho = 20
	 * */
	public String getCodigoServico();

	/**
	 * Tamanho = 45
	 * */
	public String getDescricaoComplementarServico();

	/**
	 * Tamanho = 17
	 * */
	public double getValorServico();

	/**
	 * Tamanho = 17
	 * */
	public double getDescontoServico();

	/**
	 * Tamanho = 5
	 * */
	public double getAliquotaISS();

	/**
	 * Tamanho = 17
	 * */
	public double getBaseCalculoIss();

	/**
	 * Tamanho = 17
	 * */
	public double getValorIss();
}