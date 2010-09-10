package com.edpichler.receita.services.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.edpichler.receita.interfaces.INaturezaOperacao;
import com.edpichler.receita.services.Constantes;
import com.edpichler.receita.services.IGerador;

public class GeradorNaturezaDaOperacao extends GeradorBase implements IGerador {
	private static String nomeArquivo = "4_9_4_tabela_natureza_operacao.txt";

	@SuppressWarnings("unchecked")
	public void gerarArquivo(List<?> param) throws IOException {

		File file = criarArquivoTexto(nomeArquivo);

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(file), Constantes.ENCODING_RECEITA));
		for (INaturezaOperacao p : (List<INaturezaOperacao>) param) {
			out.write(formatar(p) + "\n");
		}
		out.close();
	}

	private String formatar(INaturezaOperacao param) {
		StringBuilder st = new StringBuilder();
		st.append(formatarData(param.getDataAtualizacao()));
		st.append(formatarString(param.getCodigoNaturezaOperacao(),6));
		st.append(formatarString(param.getDescricao(), 45));		

		return st.toString();

	}
}
