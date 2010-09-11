package com.edpichler.receita.services.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.edpichler.receita.interfaces.ICadastroPessoaJuridicaFisica;

public class GeradorPessoaJuridicaFisicaTest {

	@Test
	public void testGerarArquivo() throws IOException {
		List<ICadastroPessoaJuridicaFisica> lista = new ArrayList<ICadastroPessoaJuridicaFisica>();
		for (int i = 0; i < 200; i++) {
			lista.add(createPersonPFPJ());
		}
		new GeradorPessoaJuridicaFisica().gerarArquivo(lista);
	}

	private ICadastroPessoaJuridicaFisica createPersonPFPJ() {
		return new ICadastroPessoaJuridicaFisica() {

			@Override
			public String getUnidadeFederacao() {

				return "SC";
			}

			@Override
			public String getRazaoSocial() {
				return "RAZAO SOCIAL SA";
			}

			@Override
			public String getPais() {
				return "Zimbábue";
			}

			@Override
			public String getMunicipio() {
				return "Blumenau";
			}

			@Override
			public String getInscricaoMunicipal() {
				return "3242343";
			}

			@Override
			public String getInscricaoEstadual() {
				return "66446466";
			}

			@Override
			public String getEndereco() {
				return "Rua das Carmecitas";
			}

			@Override
			public Date getDataDeAtualizacao() {
				Calendar instance = Calendar.getInstance();
				return instance.getTime();
			}

			@Override
			public String getCodigoParticipante() {
				return "234234234234";
			}

			@Override
			public String getCnpjCpf() {
 				return "041723423424";
			}

			@Override
			public String getCep() {

				return "84595777";
			}

			@Override
			public String getBairro() {

				return "Fortaleza Alta";
			}
		};
	}

}
