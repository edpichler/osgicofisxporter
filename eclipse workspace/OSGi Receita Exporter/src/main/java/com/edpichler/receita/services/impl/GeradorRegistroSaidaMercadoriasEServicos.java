package com.edpichler.receita.services.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.edpichler.receita.interfaces.IRegistroSaidaMercadoriasEServicos;
import com.edpichler.receita.services.Constantes;
import com.edpichler.receita.services.IGerador;

public class GeradorRegistroSaidaMercadoriasEServicos extends GeradorBase
		implements IGerador {
	private static String nomeArquivo = "4_10_1_arquivo_complementar_de_registro_de_saida_de_mercadorias_servicos.txt";

	@SuppressWarnings("unchecked")
	public void gerarArquivo(List<?> param) throws IOException {

		File file = criarArquivoTexto(nomeArquivo);

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(file), Constantes.ENCODING_RECEITA));
		for (IRegistroSaidaMercadoriasEServicos pc : (List<IRegistroSaidaMercadoriasEServicos>) param) {
			out.write(formatar(pc) + "\n");
		}
		out.flush();
		out.close();
		
	}

	private String formatar(IRegistroSaidaMercadoriasEServicos param) {
		StringBuilder st = new StringBuilder();

		st.append(formatarString(param.getModeloDoDocumento(), 2));
		st.append(formatarString(param.getSerieSubserieDocumento(), 5));
		st.append(formatarNumero(param.getNumeroDocumento(), 9, 0));
		st.append(formatarData(param.getDataEmissaoDocumento()));
		st.append(formatarNumero(param.getNumeroDoItem(), 3, 0));
		st.append(formatarString(param.getCodigoSituacaoTributariaPisPasep(), 2));
		st.append(formatarNumero(param.getAliquotaPisPasep(), 8, 4));
		st.append(formatarNumero(param.getBaseCalculoPisPasep(), 17, 4));
		st.append(formatarNumero(param.getValorPisPasep(), 17, 2));
		st.append(formatarString(param.getCodigoSituacaoTributariaCofins(), 2));
		st.append(formatarNumero(param.getAliquotaCofins(), 8, 4));
		st.append(formatarNumero(param.getBaseCalculoCofins(), 17, 3));
		st.append(formatarNumero(param.getValorCofins(), 17, 2));
		st.append(formatarData(param.getDataApropriacao()));

		return st.toString();
	}

}
