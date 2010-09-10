package com.edpichler.receita.services.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.edpichler.receita.interfaces.IMestreMercadoriasServicosEntradaEmitidosTerceiros;
import com.edpichler.receita.interfaces.IMestreNFServicosEmitidasPJ;
import com.edpichler.receita.interfaces.VistaPrazo;
import com.edpichler.receita.services.Constantes;
import com.edpichler.receita.services.IGerador;

public class GeradorMestreNFServicosEmitidasPJ extends GeradorBase implements
		IGerador {
	private static String nomeArquivo = "4_3_5_arquivo_mestre_de_notas_fiscais_de_servico_emitidas pela_pessoa_juridica.txt";

	@SuppressWarnings("unchecked")
	public void gerarArquivo(List<?> param) throws IOException {

		File file = criarArquivoTexto(nomeArquivo);

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(file), Constantes.ENCODING_RECEITA));
		for (IMestreNFServicosEmitidasPJ pc : (List<IMestreNFServicosEmitidasPJ>) param) {
			out.write(formatar(pc) + "\n");
		}
		out.close();
	}

	private String formatar(IMestreNFServicosEmitidasPJ param) {
		StringBuilder st = new StringBuilder();
		st.append(formatarString(param.getSerieSubserieDocumento(), 5));
		st.append(formatarNumero(param.getNumberoDocumento(), 9, 0));

		st.append(formatarData(param.getDataEmissaoDocumento()));	

		st.append(formatarString(param.getCodigoParticipante(), 14));

		st.append(formatarNumero(param.getValorTotalServico(), 17, 2));
		st.append(formatarNumero(param.getValorTotalDesconto(), 17, 2));
		st.append(formatarNumero(param.getAliquotaIRRF(), 5, 2));
		st.append(formatarNumero(param.getBaseCalculoIRRF(), 17, 2));
		st.append(formatarNumero(param.getValorIRRF(), 17, 2));
		if (param.getIndicadorSituacaoCancelamentoDocumento()) {
			st.append(formatarString("S", 1));
		} else {
			st.append(formatarString("N", 1));
		}
		return st.toString();
	}
}