package com.edpichler.receita.services.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.edpichler.receita.interfaces.IImportacao;
import com.edpichler.receita.services.Constantes;
import com.edpichler.receita.services.IGerador;

public class GeradorImportacao extends GeradorBase implements IGerador {
	private static String nomeArquivo = "4_4_2_arquivo_exportacao.txt";

	@SuppressWarnings("unchecked")
	public void gerarArquivo(List<?> param) throws IOException {

		File file = criarArquivoTexto(nomeArquivo);

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(file), Constantes.ENCODING_RECEITA));
		for (IImportacao p : (List<IImportacao>) param) {
			out.write(formatar(p) + "\n");
		}
		out.close();
	}

	private String formatar(IImportacao param) {
		StringBuilder st = new StringBuilder();
		st.append(formatarString( param.getModeloDocumento(), 2));
		st.append(formatarString( param.getSerieSubserieDocumento() ,5));
		st.append(formatarNumero( param.getNumeroDocumento(), 9, 2));
		st.append(formatarData( param.getDataEmissaoDocumento()));
		st.append(formatarNumero( param.getNumeroDeclaracaoImportacao(), 10, 2));

		return st.toString();

	}
}