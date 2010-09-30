package com.edpichler.receita.services.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.edpichler.receita.interfaces.EntradaSaida;
import com.edpichler.receita.interfaces.IndicadorTributacao;
import com.edpichler.receita.interfaces.ItensMercadoriasServicosNFEmitidosPJ;
import com.edpichler.receita.services.Constantes;
import com.edpichler.receita.services.IGerador;

public class GeradorItensMercadoriasServicosNFEmitidosPJ extends GeradorBase
		implements IGerador {
	private static String nomeArquivo = "4_3_2_arquivo_de_itens_de_mercadorias_servicos_notas_fiscais_saida_entrada_emitidas_pessoa_juridica.txt";

	@SuppressWarnings("unchecked")
	public void gerarArquivo(List<?> param) throws IOException {

		File file = criarArquivoTexto(nomeArquivo);

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(file), Constantes.ENCODING_RECEITA));
		for (ItensMercadoriasServicosNFEmitidosPJ obje : (List<ItensMercadoriasServicosNFEmitidosPJ>) param) {
			out.write(formatar(obje) + "\n");
		}
		out.close();
	}

	private String formatar(ItensMercadoriasServicosNFEmitidosPJ param) {

		StringBuilder st = new StringBuilder();

		EntradaSaida entSai = param.getIndicadorMovimento();
		if (entSai == EntradaSaida.ENTRADA) {
			st.append(formatarString("E", 1));
		} else {
			st.append(formatarString("S", 1));
		}

		st.append(formatarString(param.getModeloDocumento(), 2));
		st.append(formatarString(param.getSerieSubserieDocumento(), 5));
		st.append(formatarNumero(param.getNumeroDocumento(), 9, 0));
		st.append(formatarData(param.getDataEmissaoDocumento()));
		st.append(formatarNumero(param.getNumeroDoItem(), 3, 0));
		st.append(formatarString(param.getCodigoMercadoriaServico(), 20));

		st.append(formatarString(param.getDescricaoComplementar(), 45));
		st.append(formatarString(param.getCodigoFiscalOperacao(), 4));
		st.append(formatarString(param.getCodigoNaturezaOperacao(), 6));
		st.append(formatarString(param.getClassificaoFiscalMercadoria(), 8));

		st.append(formatarNumero(param.getQuantidade(), 17, 3));

		st.append(formatarString(param.getUnidade(), 3));
		st.append(formatarNumero(param.getValorUnitario(), 17, 4));

		st.append(formatarNumero(param.getValorTotalDoItem(), 17, 2));
		st.append(formatarNumero(param.getValorDescontoItem(), 17, 2));

		// 17 Indicador de Tributação do IPI 183 1 C Nas saídas, preencher com:
		// "1"=TRIBUTADO; "2"=ISENTO OU NÃO TRIBUTADO; "3"=OUTRAS. Nas entradas,
		// preencher com: "1"=RECUPERA IPI; "2"=ISENTO OU NÃO TRIBUTADO;
		// "3"=OUTRAS.
		IndicadorTributacao ipi = param.getIndicadorTributacaoIpi();
		// codificado para fácil entendimento.
		if (ipi == IndicadorTributacao.TRIBUTADO
				|| ipi == IndicadorTributacao.RECUPERA_IPI) {
			st.append(formatarString("1", 1));
		} else if (ipi == IndicadorTributacao.ISENTO_OU_NAO_TRIBUTADO) {
			st.append(formatarString("2", 1));
		} else {
			st.append(formatarString("3", 1));
		}

		st.append(formatarNumero(param.getAliquotaIpi(), 5, 2));
		st.append(formatarNumero(param.getBaseCalculoIpi(), 17, 2));

		st.append(formatarNumero(param.getValorIpi(), 17, 2));
		st.append(formatarString(param.getSituacaoTributariaEstadual(), 3));

		IndicadorTributacao indiIcms = param.getIndicadorTributarioIcms();

		if (indiIcms == IndicadorTributacao.TRIBUTADO
				|| indiIcms == IndicadorTributacao.RECUPERA_IPI) {
			st.append(formatarString("1", 1));
		} else if (indiIcms == IndicadorTributacao.ISENTO_OU_NAO_TRIBUTADO) {
			st.append(formatarString("2", 1));
		} else {
			st.append(formatarString("3", 1));
		}
		
		st.append(formatarNumero(param.getAliquotaIcms(), 5, 2));
		st.append(formatarNumero(param.getBaseCalculoIcmsProprio(), 17, 2));
		st.append(formatarNumero(param.getValorIcmsProprio(), 17, 2));

		st.append(formatarNumero(param
				.getBaseCalculoIcmsSubsituicaoTributaria(), 17, 2));
		st.append(formatarNumero(param.getValorIcmsSubstituicaoTributaria(),
				17, 2));

		if (param.getIndicadorMovimentacaoFisicaMercadoria()) {
			st.append(formatarString("S", 1));
		} else {
			st.append(formatarString("N", 1));
		}

		st.append(formatarString(param.getCodigoSituacaoTributariaIpi(), 2));

		return st.toString();
	}
}