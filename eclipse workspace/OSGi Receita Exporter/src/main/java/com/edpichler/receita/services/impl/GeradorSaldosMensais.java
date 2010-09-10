package com.edpichler.receita.services.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.edpichler.receita.interfaces.DebitoCredito;
import com.edpichler.receita.interfaces.ISaldosMensais;
import com.edpichler.receita.services.Constantes;
import com.edpichler.receita.services.IGerador;

public class GeradorSaldosMensais extends GeradorBase  implements IGerador{
	private static String nomeArquivo = "4_1_2_saldos_mensais.txt";

	@SuppressWarnings("unchecked")
	public  void gerarArquivo(List<?> param)
			throws IOException {

		File file = criarArquivoTexto(nomeArquivo);

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(file), Constantes.ENCODING_RECEITA));
		for (ISaldosMensais sm : (List<ISaldosMensais>) param) {
			out.write(formatar(sm) + "\n");
		}
		out.close();
	}

	private  String formatar(ISaldosMensais param) {
		StringBuilder st = new StringBuilder();
		st.append(formatarData(param.getDataSaldoInicial()));
		st.append(formatarString(param.getCodigoContaAnalitica(), 28));
		st.append(formatarNumero(param.getValorSaldoInicialMes(), 17, 2));

		DebitoCredito tip = param.getDebitoCredito();
		if (tip.equals(DebitoCredito.CREDITO)) {
			st.append(formatarString("C", 1));
		} else {
			st.append(formatarString("D", 1));
		}

		st.append(formatarNumero(param.getValorTotalDebitos(), 17, 2));
 
		st.append(formatarNumero(param.getValorTotalCreditos(), 17, 2));

		st.append(formatarNumero(param.getValorSaldoFinalMes(), 17, 2));

		DebitoCredito tipf = param.getCreditoDebitoSaldoFinalMes();

		if (tipf.equals(DebitoCredito.CREDITO)) {
			st.append(formatarString("C", 1));
		} else {
			st.append(formatarString("D", 1));
		}

		return st.toString();
	}

}
