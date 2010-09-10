package com.edpichler.receita.services.impl;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.List;

import com.edpichler.receita.interfaces.IMercadoriasServicos;
import com.edpichler.receita.services.Constantes;
import com.edpichler.receita.services.IGerador;

public class GeradorMercadoriasServicos extends GeradorBase implements IGerador {

	private String nomeArquivo = "4_9_5_tabela_mercadorias_servicos.txt";

	@SuppressWarnings("unchecked")
	public void gerarArquivo(List<?> param) throws IOException {

		File file = criarArquivoTexto(nomeArquivo);

		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(
				new FileOutputStream(file), Constantes.ENCODING_RECEITA));
		for (IMercadoriasServicos pc : (List<IMercadoriasServicos>) param) {
			out.write(formatar(pc) + "\n");
		}
		out.close();
	}

	private String formatar(IMercadoriasServicos param) {
		StringBuilder st = new StringBuilder();
		st.append(formatarData(param.getDataAtualizacao()));
		st.append(formatarString(param.getCodigoMercadoria(), 20));
		st.append(formatarString(param.getDescricao(), 45));
		return st.toString();
	}

}
// Item CAMPO Posição Inicial Tamanho Formato OBSERVAÇÕES
// 1 Data de Atualização 1 8 N Inclusão / Alteração.
// 2 Código da Mercadoria / Produto / Insumo / Serviço 9 20 C
// 3 Descrição 29 45 C

