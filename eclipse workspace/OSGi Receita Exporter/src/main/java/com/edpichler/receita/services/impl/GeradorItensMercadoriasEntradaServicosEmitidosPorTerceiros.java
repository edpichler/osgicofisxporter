package com.edpichler.receita.services.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.edpichler.receita.interfaces.ItensMercadoriasServicosEntradaEmitidosTerceiros;
import com.edpichler.receita.services.Constantes;
import com.edpichler.receita.services.IGerador;

public class GeradorItensMercadoriasEntradaServicosEmitidosPorTerceiros extends GeradorBase implements IGerador {
	private static String nomeArquivo = "4_3_4_arquivo_de_itens_de_mercadorias_servicos_entradas_emitidas_por_terceiros.txt";

	

	@SuppressWarnings("unchecked")
	public void gerarArquivo(List<?> param) throws IOException {

		File file = criarArquivoTexto(nomeArquivo);

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(file), Constantes.ENCODING_RECEITA));
		for (ItensMercadoriasServicosEntradaEmitidosTerceiros p : (List<ItensMercadoriasServicosEntradaEmitidosTerceiros>) param) {
			out.write(formatar(p) + "\n");
		}
		out.close();
	}

	private String formatar(ItensMercadoriasServicosEntradaEmitidosTerceiros p) {
		StringBuilder st = new StringBuilder();
		st.append(formatarString(p.getModeloDocumento(), 2));
		st.append(formatarString(p.getSerieSubserieDocumento(), 5));
		st.append(formatarNumero(p.getNumeroDocumento(), 9, 0));
		st.append(formatarData(p.getDataEmissaoDocumento()));
		st.append(formatarString(p.getCodigoParticipante(),14));
		st.append(formatarNumero(p.getNumeroDoItem(), 3, 0));
		st.append(formatarString(p.getCodigoMercadoriaServico(),20));
		st.append(formatarString(p.getDescricaoComplementar(), 45));
		st.append(formatarString(p.getCodigoFiscaoOperacao(), 4));		
		st.append(formatarString(p.getNaturezaOperacao(), 6));
		st.append(formatarString(p.getClassificaoFiscalMercadoria(), 8));
		st.append(formatarNumero(p.getQuantidade(), 17, 3));
		st.append(formatarString(p.getUnidade(), 3));
		st.append(formatarNumero(p.getValorUnitario(), 17, 4));
		st.append(formatarNumero(p.getValorTotalDoItem(), 17, 2));
		st.append(formatarNumero(p.getValorDescontoItem(), 17, 2));	
		
		switch (p.getIndicadorTributacaoIpi()) {
		case ISENTO_OU_NAO_TRIBUTADO:
			st.append(formatarString("2", 1));
			break;
		case TRIBUTADO:			
		case OUTRAS:
			st.append(formatarString("3", 1));
			break;
		case RECUPERA_IPI:
			st.append(formatarString("1", 1));
			break;
		default:
			break;
		}
		st.append(formatarNumero(p.getAliquotaIpi(), 5, 2));
		st.append(formatarNumero(p.getBaseCalculoIpi(), 17, 2));
		st.append(formatarNumero(p.getValorIpi(), 17, 2));
		st.append(formatarString(p.getSituacaoTributariaEstadual(), 3));
		switch (p.getIndicadorTributarioIcms()) {
		case ISENTO_OU_NAO_TRIBUTADO:
			st.append(formatarString("2", 1));
			break;
		case RECUPERA_IPI:			
		case OUTRAS:
			st.append(formatarString("3", 1));
			break;		
		case TRIBUTADO:
			st.append(formatarString("1", 1));
			break;
		default:
			break;
		}

		st.append(formatarNumero(p.getAliquotaIcms(), 5, 2));
		st.append(formatarNumero(p.getBaseCalculoIcmsProprio(), 17, 2));
		st.append(formatarNumero(p.getValorIcmsProprio(), 17, 2));
		st.append(formatarNumero(p.getBaseCalculoIcmsSubstituicaoTributaria(), 17, 2));
		st.append(formatarNumero(p.getValorIcmsSubstituicaoTributaria(), 17, 2));
		if(p.getIndicadorMovimentacaoFisicaMercadoria()){
			st.append(formatarString("S", 1));
		}else{
			st.append(formatarString("N", 1));
		}
		st.append(formatarString(p.getCodigoSituacaoTributariaIpi(), 2));
		return st.toString();

	}
}

