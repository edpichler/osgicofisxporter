package com.edpichler.receita.interfaces;

import java.util.Date;

/**
 *4.3.3 Arquivo mestre mercadorias e servicos, entradas emitido por terceiros.
 * */
public interface IMestreMercadoriasServicosEntradaEmitidosTerceiros {
	/**
	 * Tamanho = 2
	 **/
	public String getModeloDoDocumento();

	/**
	 * Tamanho = 5
	 **/
	public String getSerieSubserieDocumento();

	/**
	 * Tamanho = 9
	 *
	 **/
	public int getNumeroDocumento();

	/**
	 * Tamanho = 8
	 **/
	public Date getDataEmissaoDocumento();

	/**
	 * Tamanho = 14
	 **/
	public String getCodigoParticipante();

	/**
	 * Tamanho = 8
	 **/
	public Date getDataDaEntrada();

	/**
	 * Tamanho = 17
	 **/
	public double getValorTotalMercadorias();

	/**
	 * Tamanho = 17
	 **/
	public double getValorTotalDesconto();

	/**
	 * Tamanho = 17
	 **/
	public double getValorFrete();

	/**
	 * Tamanho = 17
	 **/
	public double getValorDoSeguro();

	/**
	 * Tamanho = 17
	 **/
	public double getValorOutrasDespesas();

	/**
	 * Tamanho = 17
	 **/
	public double getValorTotalIPI();

	/**
	 * Tamanho = 17
	 **/
	public double getValorTotalICMSSubstituicaoTributaria();

	/**
	 * Tamanho = 17
	 **/
	public double getValorTotaldaNotaFiscal();

	/**
	 * Tamanho = 14
	 **/
	public String getInscricaoEstadualSubstitutoTributario();

	/**
	 * Tamanho = 1
	 * */
	public VistaPrazo getTipoDaFatura();

	/**
	 * Tamanho = 45
	 **/
	public String getObservacao();

	/**
	 * Tamanho = 50
	 **/
	public String getAtoDeclaratorioExecutivo();

	/**
	 * Tamanho = 2
	 **/
	public String getModeloDocumentoReferenciado();

	/**
	 * Tamanho = 5
	 **/
	public String getSerieSubserieDocumentoReferenciado();

	/**
	 * Tamanho = 6
	 **/
	public int getNumeroDocumentoReferenciado();

	/**
	 * Tamanho = 8
	 **/
	public Date getDataEmissaoDocumentoReferenciado();

	/**
	 * Tamanho = 14
	 **/
	public String getCodigoParticipanteDocumentoReferenciado();

}
