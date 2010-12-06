package com.edpichler.receita.services.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.edpichler.receita.interfaces.IExportacao;
import com.edpichler.receita.services.Constantes;

public class GeradorExportacao extends GeradorBase {
	private static String nomeArquivo = "4_4_1_arquivo_exportacao.txt";

	public void gerarArquivo(List<IExportacao> param) throws IOException {

		File file = criarArquivoTexto(nomeArquivo);

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(file), Constantes.ENCODING_RECEITA));
		for (IExportacao pc : param) {
			out.write(formatar(pc) + "\n");
		}
		out.close();
	}

	private String formatar(IExportacao param) {
		StringBuilder st = new StringBuilder();

		st.append(formatarString(param.getModeloDocumento(), 2));
		st.append(formatarString(param.getSerieSubserieDocumento(), 5));
		st.append(formatarNumero(param.getNumeroDocumento(), 9, 0));
		st.append(formatarData(param.getDataEmissaoDocumento()));

		st.append(formatarNumero(param.getNumeroRegistroExportacao(), 12, 0));
		st.append(formatarNumero(param.getNumeroDespachoExportacao(), 12, 0));
		return st.toString();
	}
}
