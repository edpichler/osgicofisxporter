package com.edpichler.receita.services.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.edpichler.receita.interfaces.ICadastroPessoaJuridicaFisica;
import com.edpichler.receita.services.Constantes;
import com.edpichler.receita.services.IGerador;

public class GeradorPessoaJuridicaFisica extends GeradorBase implements
		IGerador {
	private String nomeArquivo = "4_9_1_arquivo_cadastro_pessoas_fisicas_juridicas.txt";

	@SuppressWarnings("unchecked")
	public void gerarArquivo(List<?> param) throws IOException {

		File file = criarArquivoTexto(nomeArquivo);

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(file), Constantes.ENCODING_RECEITA));

		for (ICadastroPessoaJuridicaFisica pc : (List<ICadastroPessoaJuridicaFisica>) param) {
			out.write(formatar(pc) + "\n");
		}
		out.close();
	}

	private String formatar(ICadastroPessoaJuridicaFisica param) {
		StringBuilder st = new StringBuilder();

		st.append(formatarData(param.getDataDeAtualizacao()));
		st.append(formatarString(param.getCodigoParticipante(), 14));
		st.append(formatarCpfCpj(param.getCnpjCpf()));
		st.append(formatarString(param.getInscricaoEstadual(), 14));
		st.append(formatarString(param.getInscricaoMunicipal(), 14));
		st.append(formatarString(param.getRazaoSocial(), 70));
		st.append(formatarString(param.getEndereco(), 60));
		st.append(formatarString(param.getBairro(), 20));
		st.append(formatarString(param.getMunicipio(), 20));
		st.append(formatarString(param.getUnidadeFederacao(), 2));

		if (param.getPais().toLowerCase().contains("brasil")) {
			// 11 País 237 20 C Se Brasil, deixar em branco.
			st.append(formatarString("", 20));
		} else {
			st.append(formatarString(param.getPais(), 20));
		}
		st.append(formatarString(param.getCep(), 8));
		return st.toString();
	}
}
