package com.edpichler.receita.interfaces;

import java.util.Date;

/**
 * 4.9.2 Tabela de plano de contas
 * */
public interface IPlanoContas {

	public Date getDataAtualizacao();

	public String getCodigoConta();

	public TipoConta getTipoConta();

	public String getCodigoContaTotalizadora();

	public String getDescicao();

}
