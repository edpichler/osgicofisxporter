package com.edpichler.receita.interfaces;

import java.util.Date;

/**
 * 4.1.1 Arquivo de lançamentos contábeis.
 * */
public interface ILancamentosContabeis {
	public Date getDataLancamento();

	public String getCodigoContaAnalitica();

	public String getCodigoCentroCustoDespesa();

	public String getCodigoContrapartida();

	public double getValor();

	public DebitoCredito getIndicador();

	public String getNumeroArquivamento();

	public String getNumeroLancamento();

	public String getHistorico();
}
