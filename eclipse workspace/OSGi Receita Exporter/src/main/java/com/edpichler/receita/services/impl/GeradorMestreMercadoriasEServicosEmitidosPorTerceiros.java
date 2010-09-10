package com.edpichler.receita.services.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.edpichler.receita.interfaces.IMestreMercadoriasServicosEntradaEmitidosTerceiros;
import com.edpichler.receita.interfaces.VistaPrazo;
import com.edpichler.receita.services.Constantes;
import com.edpichler.receita.services.IGerador;

public class GeradorMestreMercadoriasEServicosEmitidosPorTerceiros extends
		GeradorBase implements IGerador {
	private static String nomeArquivo = "4_3_3_arquivo_mestre_de_mercadorias_servicos_entradas_emitidas_por_terceiros.txt";

	@SuppressWarnings("unchecked")
	public void gerarArquivo(List<?> param) throws IOException {

		File file = criarArquivoTexto(nomeArquivo);

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(file), Constantes.ENCODING_RECEITA));
		for (IMestreMercadoriasServicosEntradaEmitidosTerceiros pc : (List<IMestreMercadoriasServicosEntradaEmitidosTerceiros>) param) {
			out.write(formatar(pc) + "\n");
		}
		out.close();
	}

	private String formatar(IMestreMercadoriasServicosEntradaEmitidosTerceiros param) {
		StringBuilder st = new StringBuilder();
		st.append(formatarString(param.getModeloDoDocumento(), 2));
		st.append(formatarString(param.getSerieSubserieDocumento(), 5));
		st.append(formatarNumero(param.getNumeroDocumento(), 9, 0));
		st.append(formatarData(param.getDataEmissaoDocumento()));
		st.append(formatarString(param.getCodigoParticipante(), 14));
		st.append(formatarData(param.getDataDaEntrada()));
		st.append(formatarNumero(param.getValorTotalMercadorias(), 17, 2));
		st.append(formatarNumero(param.getValorTotalDesconto(), 17, 2));
		st.append(formatarNumero(param.getValorFrete(), 17, 2));

		st.append(formatarNumero(param.getValorDoSeguro(), 17, 2));
		st.append(formatarNumero(param.getValorOutrasDespesas(), 17, 2));
		st.append(formatarNumero(param.getValorTotalIPI(), 17, 2));
		st.append(formatarNumero(param
				.getValorTotalICMSSubstituicaoTributaria(), 17, 2));
		st.append(formatarNumero(param.getValorTotaldaNotaFiscal(), 17, 2));
		st.append(formatarString(param
				.getInscricaoEstadualSubstitutoTributario(), 14));
		if (param.getTipoDaFatura().equals(VistaPrazo.PRAZO)) {
			st.append(formatarString("2", 1));
		} else {
			st.append(formatarString("1", 1));
		}
		st.append(formatarString(param.getObservacao(), 45));

		st.append(formatarString(param.getAtoDeclaratorioExecutivo(), 50));

		st.append(formatarString(param.getModeloDocumentoReferenciado(), 2));

		st.append(formatarString(param.getSerieSubserieDocumentoReferenciado(),
				5));

		st.append(formatarNumero(param.getNumeroDocumentoReferenciado(), 9, 2));
		st.append(formatarData(param.getDataEmissaoDocumentoReferenciado()));
		st.append(formatarString(param
				.getCodigoParticipanteDocumentoReferenciado(), 14));
		return st.toString();
	}

}
