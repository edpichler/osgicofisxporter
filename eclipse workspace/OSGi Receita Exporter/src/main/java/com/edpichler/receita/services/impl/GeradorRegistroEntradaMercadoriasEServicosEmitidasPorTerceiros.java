package com.edpichler.receita.services.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.edpichler.receita.interfaces.IRegistroEntradaMercadoriasEServicosEmitidasPorTerceiros;
import com.edpichler.receita.interfaces.IRegistroEntradaMercadoriasEServicosEmitidasPropriaPJ;
import com.edpichler.receita.interfaces.IRegistroSaidaMercadoriasEServicos;
import com.edpichler.receita.services.Constantes;
import com.edpichler.receita.services.IGerador;

public class GeradorRegistroEntradaMercadoriasEServicosEmitidasPorTerceiros extends GeradorBase
		implements IGerador {
	private static String nomeArquivo = "4_10_5_registro_de_entrada_de_mercadorias_servicos_emitidas_por_terceiros.txt";

	@SuppressWarnings("unchecked")
	public void gerarArquivo(List<?> param) throws IOException {

		File file = criarArquivoTexto(nomeArquivo);

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(file), Constantes.ENCODING_RECEITA));
		for (IRegistroEntradaMercadoriasEServicosEmitidasPorTerceiros pc : (List<IRegistroEntradaMercadoriasEServicosEmitidasPorTerceiros>) param) {
			out.write(formatar(pc) + "\n");
		}
		out.flush();
		out.close();
		
	}

	private String formatar(IRegistroEntradaMercadoriasEServicosEmitidasPorTerceiros param) {
		StringBuilder st = new StringBuilder();

		st.append(formatarString(param.getModeloDoDocumento(), 2));
		st.append(formatarString(param.getSerieSubserieDocumento(), 5));
		st.append(formatarNumero(param.getNumeroDocumento(), 9, 0));
		st.append(formatarData(param.getDataEmissaoDocumento()));
		st.append(formatarString(param.getCodigoParticipante(),14));
		st.append(formatarNumero(param.getNumeroDoItem(), 3, 0));
		st.append(formatarString(param.getCodigoSituacaoTributariaPisPasep(), 2));
		st.append(formatarNumero(param.getAliquotaCreditoPisPasep(), 8, 4));
		st.append(formatarNumero(param.getBaseCalculoCreditoPisPasep(), 17, 3));
		st.append(formatarNumero(param.getValorCreditoPisPasepVinculadoReceitaExportacao(), 17, 2));
		st.append(formatarNumero(param.getValorCreditoPisPasepVinculadoReceitaTributadaMercadoInterno(), 17, 2));
		st.append(formatarNumero(param.getValorCreditoPisPasepVinculadoReceitaNaoTributadaMercadoInterno(), 17, 2));		
		st.append(formatarNumero(param.getValorCreditoPisPasep(),17,2));		
		st.append(formatarString(param.getCodigoSituacaoTributariaCofins(), 2));
		
		st.append(formatarNumero(param.getAliquotaCreditoCofins(), 8, 4));
		st.append(formatarNumero(param.getBaseCalculoCreditoCofins(), 17, 3));
		st.append(formatarNumero(param.getValorCreditoCofinsVinculadoReceitaExportacao(), 17, 2));
		st.append(formatarNumero(param.getValorCreditoCofinsVinculadoReceitaTributadaMercadoInterno(), 17, 2));
		st.append(formatarNumero(param.getValorCreditoCofinsVinculadoReceitaNaoTributadaMercadoInterno(), 17, 2));
		st.append(formatarNumero(param.getValorCreditoCofins(), 17, 2));
		
		st.append(formatarData(param.getDataApropriacao()));

		return st.toString();
	}
}