package com.edpichler.receita.services.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.edpichler.receita.interfaces.DebitoCredito;
import com.edpichler.receita.interfaces.ILancamentosContabeis;

public class GeradorLancamentosContabeisTest {

	@Test
	public void testGerarArquivo() throws IOException {
		new GeradorLancamentosContabeis().gerarArquivo(createLancamentos());
	}

	private List<ILancamentosContabeis> createLancamentos() {
		List<ILancamentosContabeis> ret = new ArrayList<ILancamentosContabeis>();
		for (int i = 0; i < 122; i++) {
			ret.add(create());
		}
		return ret;
	}

	private ILancamentosContabeis create() {
		ILancamentosContabeis r = new ILancamentosContabeis() {
			
			@Override
			public double getValor() {
				 
				return 00100.100;
			}
			
			@Override
			public String getNumeroLancamento() {

				return "15584";
			}
			
			@Override
			public String getNumeroArquivamento() {

				return "48949844884";
			}
			
			@Override
			public DebitoCredito getIndicador() {
				
				return DebitoCredito.CREDITO;
			}
			
			@Override
			public String getHistorico() {
				
				return "historico..";
			}
			
			@Override
			public Date getDataLancamento() {
				return Calendar.getInstance().getTime();
			}
			
			@Override
			public String getCodigoContrapartida() {
				return "89894";
			}
			
			@Override
			public String getCodigoContaAnalitica() {
				return "8989445";
			}
			
			@Override
			public String getCodigoCentroCustoDespesa() {
				return "898943423423";
			}
		};
		return r;
	}

}
