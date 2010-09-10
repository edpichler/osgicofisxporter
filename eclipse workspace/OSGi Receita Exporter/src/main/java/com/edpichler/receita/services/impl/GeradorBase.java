package com.edpichler.receita.services.impl;

import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public abstract class GeradorBase {

	protected File criarArquivoTexto(String nomeArquivo) throws IOException {
		File file = new File(nomeArquivo.toLowerCase());
		if (file.exists()) {
			file.delete();
		}
		file.createNewFile();
		return file;
	}

	/**
	 * Preenche com espacos os caracteres faltantes.
	 * 
	 * @param parametro
	 *            string para ser formatada.
	 * @param qtCaracteres
	 *            quantidade de caracteres que precisa ter
	 * */
	protected String formatarString(String parametro, int qtCaracteres) {
		// String result = String.format("%" + qtCaracteres + "s", parametro);
		if (parametro == null) {
			parametro = "";
		}
		if (parametro.length() > qtCaracteres) {
			return parametro.substring(0, qtCaracteres);
		}
		StringBuffer buf = new StringBuffer(parametro);
		int qtFalta = qtCaracteres - parametro.length();
		for (int i = 0; i < qtFalta; i++) {
			buf.append(" ");
		}
		return buf.toString();
	}

	/**
	 * 14 ou 11 dígitos. 
	 * Somente números, preenchido de espaços em branco a direita.
	 * */
	public String formatarCpfCpj(String cpfcnpj) {
		if(cpfcnpj == null){
			cpfcnpj = "";
		}
		int qtCaracteres = 14;
		if (cpfcnpj.length() > qtCaracteres) {
			return cpfcnpj.substring(0, qtCaracteres - 1);
		}
		StringBuffer buf = new StringBuffer("");
		int qtFalta = qtCaracteres - cpfcnpj.length();
		for (int i = 0; i < qtFalta; i++) {
			buf.append(" ");
		}
		buf.append(cpfcnpj);
		return buf.toString();
	}

	/**
	 * Preenche com espacos os caracteres faltantes. Alinhado à direita. Formata
	 * sem vírgula e sem espaçoos.
	 * 
	 * @param qt
	 *            quantidade de caracteres
	 * */
	protected String formatarNumero(double param, int qtTotalCaracteres,
			int casasDecimais) {
		
		if (String.valueOf( (int) param).length() > qtTotalCaracteres) {
			throw new IllegalArgumentException(
					"O número é maior do que a quantidade de caracteres permitida. Número: "
							+ param + ", qt: " + qtTotalCaracteres);
		}
		if (casasDecimais > qtTotalCaracteres) {
			String msg = "A quantidade de casas decimais não pode ser maior que a quantidade total de caracteres";
			throw new IllegalArgumentException(msg);
		}

		if (param < 0) {
			qtTotalCaracteres--;// devido sinal negativo
		}
		StringBuffer pattern = new StringBuffer();
		for (int i = 0; i < qtTotalCaracteres; i++) {
			pattern.append(0);
		}

		if (casasDecimais > 0) {
			pattern.insert((qtTotalCaracteres - (casasDecimais)), ".");
		}

		DecimalFormat formatter = new DecimalFormat(pattern.toString());
		return formatter.format(param).replace(".", "").replace(",", "");
	}

	protected String formatarData(Date dataAtualizacao) {
		if (dataAtualizacao == null) {
			return "        ";//dataAtualizacao = Calendar.getInstance().getTime();
		}
		// Tamanho 8 DDMMAAAA
		SimpleDateFormat df = new SimpleDateFormat("ddMMyyyy");
		return df.format(dataAtualizacao);
	}
//
//	public void validarNaoNula(String nomeCampo, Object o)
//			throws IllegalArgumentException {
//		if (o == null) {
//			throw new IllegalArgumentException(nomeCampo
//					+ " n‹o pode ser nulo.");
//		}
//	}
//
//	/**
//	 * Valida o nœmero de caracteres
//	 * */
//	protected void validarMaximoNumeroCaracteres(String nomeCampo,
//			String valor, int maxChars) throws IllegalArgumentException {
//
//		if (valor.length() > maxChars) {
//			throw new IllegalArgumentException("Campo " + nomeCampo
//					+ " pode ter no m‡ximo " + maxChars
//					+ "caracteres. Valor = " + valor);
//		}
//
//	}
}
