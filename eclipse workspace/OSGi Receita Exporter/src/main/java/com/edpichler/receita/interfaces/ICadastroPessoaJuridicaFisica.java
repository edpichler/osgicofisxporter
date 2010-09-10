package com.edpichler.receita.interfaces;

import java.util.Date;

/**
 * 4.9.1 Arquivo de Cadastro de Pessoas Jurídicas e Físicas
 * */
public interface ICadastroPessoaJuridicaFisica {

	/**
	 * Tamanho = 8
	 */
	public Date getDataDeAtualizacao();

	/**
	 * Tamanho = 14
	 */
	public String getCodigoParticipante();

	/**
	 * Tamanho = 14
	 */
	public String getCnpjCpf();

	/**
	 * Tamanho = 14
	 */
	public String getInscricaoEstadual();

	/**
	 * Tamanho = 14
	 */
	public String getInscricaoMunicipal();

	/**
	 * Tamanho = 70
	 */
	public String getRazaoSocial();

	/**
	 * Tamanho = 60
	 */
	public String getEndereco();

	/**
	 * Tamanho = 20
	 */
	public String getBairro();

	/**
	 * Tamanho = 20
	 */
	public String getMunicipio();

	/**
	 * Tamanho = 2
	 */
	public String getUnidadeFederacao();

	/**
	 * Tamanho = 20
	 */
	public String getPais();

	/**
	 * Tamanho = 8
	 */
	public String getCep();

}
