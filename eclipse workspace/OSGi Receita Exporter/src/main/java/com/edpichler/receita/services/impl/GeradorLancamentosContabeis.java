package com.edpichler.receita.services.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.edpichler.receita.interfaces.DebitoCredito;
import com.edpichler.receita.interfaces.ILancamentosContabeis;
import com.edpichler.receita.services.Constantes;
import com.edpichler.receita.services.IGerador;

public class GeradorLancamentosContabeis extends GeradorBase implements
		IGerador {
	private static String nomeArquivo = "4_1_1_arquivo_lancamentos_contabeis.txt";

	@SuppressWarnings("unchecked")
	public void gerarArquivo(List<?> param) throws IOException {

		File file = criarArquivoTexto(nomeArquivo);

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(file), Constantes.ENCODING_RECEITA));
		for (ILancamentosContabeis pc : (List<ILancamentosContabeis>) param) {
			out.write(formatar(pc) + "\n");
		}
		out.close();
	}

	private String formatar(ILancamentosContabeis param) {
		StringBuilder st = new StringBuilder();

		st.append(formatarData(param.getDataLancamento()));
		st.append(formatarString(param.getCodigoContaAnalitica(), 28));
		st.append(formatarString(param.getCodigoCentroCustoDespesa(), 28));
		st.append(formatarString(param.getCodigoContrapartida(), 28));

		st.append(formatarNumero(param.getValor(), 17, 2));

		DebitoCredito tipo = param.getIndicador();
		if (tipo.equals(DebitoCredito.CREDITO)) {
			st.append(formatarString("C", 1));
		} else {
			st.append(formatarString("D", 1));
		}

		st.append(formatarString(param.getNumeroArquivamento(), 12));
		st.append(formatarString(param.getNumeroLancamento(), 12));
		st.append(formatarString(param.getHistorico(), 150));
		return st.toString();
	}

}
