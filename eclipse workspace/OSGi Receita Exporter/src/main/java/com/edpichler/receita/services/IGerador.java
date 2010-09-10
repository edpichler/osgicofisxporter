package com.edpichler.receita.services;

import java.io.IOException;
import java.util.List;

public interface IGerador{
	public void gerarArquivo(List<?> lista) throws IOException;
}
