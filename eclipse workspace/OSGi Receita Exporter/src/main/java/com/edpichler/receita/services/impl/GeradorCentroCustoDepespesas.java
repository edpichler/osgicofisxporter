package com.edpichler.receita.services.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.List;

import com.edpichler.receita.interfaces.ICentroCustoDespesa;
import com.edpichler.receita.services.Constantes;
import com.edpichler.receita.services.IGerador;

public class GeradorCentroCustoDepespesas extends GeradorBase implements IGerador{
	private static String nomeArquivo = "4_9_3_tabela centro_custo_despesas.txt";

	@SuppressWarnings("unchecked")
	public  void gerarArquivo(List<?> param)
			throws IOException {
 
		File file = criarArquivoTexto(nomeArquivo);

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(file), Constantes.ENCODING_RECEITA));for (ICentroCustoDespesa iCentroCustoDespesa : (List<ICentroCustoDespesa>)param) {
			out.write(formatar(iCentroCustoDespesa) + "\n");
		}
		out.close();
	}

	private  String formatar(ICentroCustoDespesa param) {
		// data DDMMAAAA
		// codigo
		// descricao

		String codigo = param.getCodigo();
		if (codigo == null) {
			throw new IllegalArgumentException(
					"Código do centro de custo não pode ser nullo");
		}
		int maxCodLenght = 20;
		if (codigo.length() > maxCodLenght) {
			throw new IllegalArgumentException(
					"O código do centro de custo pode ter no máximo "
							+ maxCodLenght + "caracteres: código = " + codigo);
		}
		Date dataAtualizacao = param.getDataAtualizacao();
		if (dataAtualizacao == null) {
			throw new IllegalArgumentException(
					"Data no centro de custo nóo pode ser em branco. Centro de custo: "
							+ codigo);
		}
		int maxDesc = 9;
		if (param.getDescricao().length() > maxDesc) {
			throw new IllegalArgumentException(
					"Descricão do centro de custo não pode ter mais que "
							+ maxDesc + "caracteres. Centro de custo: "
							+ codigo);
		}

		StringBuilder st = new StringBuilder();
		st.append(formatarData(dataAtualizacao));
		st.append(formatarString(codigo, maxCodLenght));
		st.append(formatarString(param.getDescricao(), maxDesc));
		return st.toString();
	}

}
