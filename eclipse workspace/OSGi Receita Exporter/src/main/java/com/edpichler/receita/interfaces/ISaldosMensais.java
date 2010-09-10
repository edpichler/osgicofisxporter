package com.edpichler.receita.interfaces;

import java.util.Date;

/** 4.1.2 Arquivo de saldos mensais */
public interface ISaldosMensais {
	public Date getDataSaldoInicial();

	public String getCodigoContaAnalitica();

	public double getValorSaldoInicialMes();

	public DebitoCredito getDebitoCredito();

	public double getValorTotalDebitos();

	public double getValorTotalCreditos();

	public double getValorSaldoFinalMes();

	public DebitoCredito getCreditoDebitoSaldoFinalMes();
}
