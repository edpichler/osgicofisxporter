package com.edpichler.receita.services.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.List;

import com.edpichler.receita.interfaces.ICentroCustoDespesa;
import com.edpichler.receita.interfaces.ItensNotasFiscaisServicoEmitidasPj;
import com.edpichler.receita.services.Constantes;
import com.edpichler.receita.services.IGerador;

public class GeradorItensNotasFiscaisServicoEmitidasPj extends GeradorBase
		implements IGerador {
	private static String nomeArquivo = "4_3_6_arquivo_de_itens_de_notas_Fiscais"
			+ "_de_servico_emitidas_pela_pessoa_juridica.txt";

	@SuppressWarnings("unchecked")
	public void gerarArquivo(List<?> param) throws IOException {

		File file = criarArquivoTexto(nomeArquivo);

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(file), Constantes.ENCODING_RECEITA));
		for (ItensNotasFiscaisServicoEmitidasPj iCentroCustoDespesa : (List<ItensNotasFiscaisServicoEmitidasPj>) param) {
			out.write(formatar(iCentroCustoDespesa) + "\n");
		}
		out.close();
	}

	private String formatar(ItensNotasFiscaisServicoEmitidasPj param) {
		StringBuilder st = new StringBuilder();
		st.append(formatarString(param.getSerieSubserieDocumento(), 5));

		st.append(formatarNumero(param.getNumberoDocumento(), 9, 0));
		st.append(formatarData(param.getDataEmissaoDocumento()));
		st.append(formatarNumero(param.getNumeroItem(), 3, 0));
		st.append(formatarString(param.getCodigoServico(), 20));
		st.append(formatarString(param.getDescricaoComplementarServico(), 45));
		st.append(formatarNumero(param.getValorServico(), 17, 2));
		st.append(formatarNumero(param.getDescontoServico(), 17, 2));
		st.append(formatarNumero(param.getAliquotaISS(), 5, 2));
		st.append(formatarNumero(param.getBaseCalculoIss(), 17, 2));
		st.append(formatarNumero(param.getValorIss(), 17, 2));

		return st.toString();
	}
}