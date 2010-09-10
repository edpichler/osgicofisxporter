package com.edpichler.receita.services;

import java.io.IOException;
import java.util.List;

import com.edpichler.receita.interfaces.ICentroCustoDespesa;
import com.edpichler.receita.interfaces.IPlanoContas;
import com.edpichler.receita.services.impl.GeradorCentroCustoDepespesas;
import com.edpichler.receita.services.impl.GeradorPlanoContas;

public class GeradorArquivos {

	public void gerarArquivoCentroCustoDespesas(List<ICentroCustoDespesa> param) throws IOException {
		new GeradorCentroCustoDepespesas().gerarArquivo(param);
	}

	public void gerarPlanoContas(List <IPlanoContas> param) throws IOException {
		new GeradorPlanoContas().gerarArquivo(param);		
	}
}
