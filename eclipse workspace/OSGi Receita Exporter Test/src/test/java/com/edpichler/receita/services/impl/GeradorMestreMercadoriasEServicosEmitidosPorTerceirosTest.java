package com.edpichler.receita.services.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.edpichler.receita.interfaces.IMestreMercadoriasServicosEntradaEmitidosTerceiros;
import com.edpichler.receita.interfaces.VistaPrazo;

public class GeradorMestreMercadoriasEServicosEmitidosPorTerceirosTest {

	@Test
	public void testGerarArquivo() throws IOException {
		GeradorMestreMercadoriasEServicosEmitidosPorTerceiros ge = new GeradorMestreMercadoriasEServicosEmitidosPorTerceiros();
		ge.gerarArquivo(getLista());
	}

	private List<IMestreMercadoriasServicosEntradaEmitidosTerceiros> getLista() {
		List<IMestreMercadoriasServicosEntradaEmitidosTerceiros> ret = new ArrayList<IMestreMercadoriasServicosEntradaEmitidosTerceiros>();

		for (int i = 0; i < 333; i++) {
			ret.add(createObject());
		}
		return ret;
	}

	private IMestreMercadoriasServicosEntradaEmitidosTerceiros createObject() {
		return new IMestreMercadoriasServicosEntradaEmitidosTerceiros() {
			
			@Override
			public double getValorTotaldaNotaFiscal() {
			
				return 03.233;
			}
			
			@Override
			public double getValorTotalMercadorias() {
				
				return 0234.233;
			}
			
			@Override
			public double getValorTotalIPI() {
				
				return 023423.32;
			}
			
			@Override
			public double getValorTotalICMSSubstituicaoTributaria() {
				
				return 33.330;
			}
			
			@Override
			public double getValorTotalDesconto() {
				
				return 234.10;
			}
			
			@Override
			public double getValorOutrasDespesas() {
				
				return 0323.23;
			}
			
			@Override
			public double getValorFrete() {
				
				return 02332.32;
			}
			
			@Override
			public double getValorDoSeguro() {
				
				return 023.23;
			}
			
			@Override
			public VistaPrazo getTipoDaFatura() {
				
				return VistaPrazo.PRAZO;
			}
			
			@Override
			public String getSerieSubserieDocumentoReferenciado() {
				
				return "234234";
			}
			
			@Override
			public String getSerieSubserieDocumento() {
				
				return "3423";
			}
			
			@Override
			public String getObservacao() {
				
				return "333";
			}
			
			@Override
			public int getNumeroDocumentoReferenciado() {
				
				return 33330;
			}
			
			@Override
			public int getNumeroDocumento() {
				
				return 033;
			}
			
			@Override
			public String getModeloDocumentoReferenciado() {
				
				return "23424";
			}
			
			@Override
			public String getModeloDoDocumento() {
				
				return "23423";
			}
			
			@Override
			public String getInscricaoEstadualSubstitutoTributario() {
				
				return "32434234";
			}
			
			@Override
			public Date getDataEmissaoDocumentoReferenciado() {
				
				return new Date();
			}
			
			@Override
			public Date getDataEmissaoDocumento() {
				
				return new Date();
			}
			
			@Override
			public Date getDataDaEntrada() {
				
				return new Date();
			}
			
			@Override
			public String getCodigoParticipanteDocumentoReferenciado() {
				
				return "34345";
			}
			
			@Override
			public String getCodigoParticipante() {
				
				return "4234";
			}
			
			@Override
			public String getAtoDeclaratorioExecutivo() {
				
				return "324234";
			}
		};
	}

}
