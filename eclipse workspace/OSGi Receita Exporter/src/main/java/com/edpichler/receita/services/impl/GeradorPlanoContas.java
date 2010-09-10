package com.edpichler.receita.services.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.edpichler.receita.interfaces.IPlanoContas;
import com.edpichler.receita.interfaces.TipoConta;
import com.edpichler.receita.services.Constantes;
import com.edpichler.receita.services.IGerador;

public class GeradorPlanoContas extends GeradorBase implements IGerador{

	private String nomeArquivo = "4_9_2_Tabela_plano_de_contas.txt";

	@SuppressWarnings("unchecked")
	public void gerarArquivo(List<?> param)
			throws IOException {

		File file = criarArquivoTexto(nomeArquivo);

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(file), Constantes.ENCODING_RECEITA));
		for (IPlanoContas pc : (List<IPlanoContas>)param) {
			out.write(formatar(pc) + "\n");
		}
		out.close();
	}

	private String formatar(IPlanoContas param) {
		StringBuilder st = new StringBuilder();
		st.append(formatarData(param.getDataAtualizacao()));
		st.append(formatarString(param.getCodigoConta(), 28));

		TipoConta tipoConta = param.getTipoConta();
		if (tipoConta.equals(TipoConta.ANALITICA)) {
			st.append(formatarString("A", 1));
		} else {
			st.append(formatarString("S", 1));
		}

		st.append(formatarString(param.getCodigoContaTotalizadora(), 28));
		st.append(formatarString(param.getDescicao(), 45));

		return st.toString();
	}

}
