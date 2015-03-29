# Introdução #

A seguir será demonstrado um exemplo de uso para exportação.

## Exemplo ##
Suponhamos que seja necessário exportar o arquivo _4.9.1 Arquivo de Cadastro de Pessoas Jurídicas e Físicas_. Basta fazer:

```

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.edpichler.receita.interfaces.ICadastroPessoaJuridicaFisica;

public class GeradorPessoaJuridicaFisica {

	public static void main(String args[]){
		List<ICadastroPessoaJuridicaFisica> lista = new ArrayList<ICadastroPessoaJuridicaFisica>();
		for (int i = 0; i < 200; i++) {
			lista.add(createPersonPFPJ());
		}
		new GeradorPessoaJuridicaFisica().gerarArquivo(lista);
	}

	private ICadastroPessoaJuridicaFisica createPersonPFPJ() {
		return new ICadastroPessoaJuridicaFisica() {

			@Override
			public String getUnidadeFederacao() {

				return "SC";
			}

			@Override
			public String getRazaoSocial() {
				return "RAZAO SOCIAL SA";
			}

			@Override
			public String getPais() {
				return "Zimbábue";
			}

			@Override
			public String getMunicipio() {
				return "Blumenau";
			}

			@Override
			public String getInscricaoMunicipal() {
				return "3242343";
			}

			@Override
			public String getInscricaoEstadual() {
				return "66446466";
			}

			@Override
			public String getEndereco() {
				return "Rua das Carmecitas";
			}

			@Override
			public Date getDataDeAtualizacao() {
				Calendar instance = Calendar.getInstance();
				return instance.getTime();
			}

			@Override
			public String getCodigoParticipante() {
				return "234234234234";
			}

			@Override
			public String getCnpjCpf() {
 				return "041723423424";
			}

			@Override
			public String getCep() {

				return "84595777";
			}

			@Override
			public String getBairro() {

				return "Fortaleza Alta";
			}
		};
	}

}
```

Ao rodar a aplicação, note que será gerado o arquivo de pessoas. Outros arquivos funcionam do mesmo jeito, o que muda é o exportador que deve ser instanciado.

Para testar os arquivos exportados, baixe o programa validador de arquivos digitais da receita. Atualmente este programa está disponível na _url_ http://www.receita.fazenda.gov.br/previdencia/ArquivosDigitais/default.htm