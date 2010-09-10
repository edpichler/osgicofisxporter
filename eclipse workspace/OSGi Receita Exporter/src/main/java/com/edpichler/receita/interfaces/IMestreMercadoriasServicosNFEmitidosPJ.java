package com.edpichler.receita.interfaces;

import java.util.Date;

/**
 * 4.3.1 Arquivo Mestre de Mercadorias/Serviços - Notas Fiscais de Saída ou de Entrada Emitidas pela Pessoa Jurídica.
 * */
public interface IMestreMercadoriasServicosNFEmitidosPJ {
	/**
	 * Tamanho = 1
	 **/
	public EntradaSaida getIndicadorDoMovimento();

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
	public Date getDataDaSaidaEntrada();

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
	 * Tamanho = 15
	 **/
	public String getViaTransporte();

	/**
	 * Tamanho = 14
	 **/
	public String getCodigoDoTransportador();

	
	/**
	 * Tamanho = 17
	 **/
	public int getQuantidadeDeVolumes();

	/**
	 * Tamanho = 10
	 **/
	public String getEspecieDeVolume();

	/**
	 * Tamanho = 17
	 **/
	public double getPesoBruto();

	/**
	 * Tamanho = 17
	 **/
	public double getPesoLiquido();

	/**
	 * Tamanho = 3
	 **/
	public String getModalidadeFrete();

	/**
	 * Tamanho = 15
	 **/
	public String getIdentificacaoVeiculo();

	public boolean getIndicadorDeSituacaoCancelamentoDocumento();

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
