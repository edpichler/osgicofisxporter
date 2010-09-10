package com.edpichler.receita.interfaces;

import java.util.Date;

/**
 * 4.3.5 Arquivo Mestre de Notas Fiscais de Serviço Emitidas pela Pessoa
 * Jurídica
 */
public interface IMestreNFServicosEmitidasPJ {
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
	 * Tamanho = 17
	 * */
	public double getValorTotalServico();

	/**
	 * Tamanho = 17
	 * */
	public double getValorTotalDesconto();

	/**
	 * Tamanho = 5
	 * */
	public double getAliquotaIRRF();

	/**
	 * Tamanho = 17
	 * */
	public double getValorIRRF();

	/**
	 * Tamanho = 17
	 * */
	public double getBaseCalculoIRRF();

	/**
	 * Tamanho = 14
	 * */
	public String getCodigoParticipante();

	/**
	 * Tamanho = 1
	 * */
	public boolean getIndicadorSituacaoCancelamentoDocumento();
}
