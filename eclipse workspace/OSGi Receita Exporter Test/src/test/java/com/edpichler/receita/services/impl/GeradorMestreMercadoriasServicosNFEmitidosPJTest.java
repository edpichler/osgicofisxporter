package com.edpichler.receita.services.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;

import com.edpichler.receita.interfaces.EntradaSaida;
import com.edpichler.receita.interfaces.IMestreMercadoriasServicosNFEmitidosPJ;
import com.edpichler.receita.interfaces.VistaPrazo;

public class GeradorMestreMercadoriasServicosNFEmitidosPJTest {

	@Test
	public void testGerarArquivo() throws IOException {
		GeradorMestreMercadoriasServicosNFEmitidosPJ g = new GeradorMestreMercadoriasServicosNFEmitidosPJ();
		g.gerarArquivo(getLista());
	}

	private List<?> getLista() {
		List <IMestreMercadoriasServicosNFEmitidosPJ> li = new ArrayList<IMestreMercadoriasServicosNFEmitidosPJ>();
		
		for (int i = 0; i < 1200; i++) {
			li.add(create());
		}
		return li;
	}

	private IMestreMercadoriasServicosNFEmitidosPJ create() {
		return new IMestreMercadoriasServicosNFEmitidosPJ() {
			
			@Override
			public String getViaTransporte() {
				
				return getString();
			}
			
			@Override
			public double getValorTotaldaNotaFiscal() {
				
				return getDouble();
			}
			
			private double getDouble() {
				
				return Math.random() * 10000;
			}
			private String getString(){
				return  "A"+ getDouble() + "Z";
			}

			@Override
			public double getValorTotalMercadorias() {
				
				return getDouble();
			}
			
			@Override
			public double getValorTotalIPI() {
				
				return getDouble();
			}
			
			@Override
			public double getValorTotalICMSSubstituicaoTributaria() {
				
				return getDouble();
			}
			
			@Override
			public double getValorTotalDesconto() {
				
				return getDouble();
			}
			
			@Override
			public double getValorOutrasDespesas() {
				
				return getDouble();
			}
			
			@Override
			public double getValorFrete() {
				
				return getDouble();
			}
			
			@Override
			public double getValorDoSeguro() {
				
				return getDouble();
			}
			
			@Override
			public VistaPrazo getTipoDaFatura() {
				
				return VistaPrazo.PRAZO;
			}
			
			@Override
			public String getSerieSubserieDocumentoReferenciado() {
				
				return getString();
			}
			
			@Override
			public String getSerieSubserieDocumento() {
				
				return getString();
			}
			
			@Override
			public int getQuantidadeDeVolumes() {
				
				return (int) getDouble();
			}
			
			@Override
			public double getPesoLiquido() {
				
				return getDouble();
			}
			
			@Override
			public double getPesoBruto() {
				
				return getDouble();
			}
			
			@Override
			public String getObservacao() {
				
				return getString();
			}
			
			@Override
			public int getNumeroDocumentoReferenciado() {
				
				return (int) getDouble();
			}
			
			@Override
			public int getNumeroDocumento() {
				
				return (int) getDouble();
			}
			
			@Override
			public String getModeloDocumentoReferenciado() {
				
				return getString();
			}
			
			@Override
			public String getModeloDoDocumento() {
				
				return getString();
			}
			
			@Override
			public String getModalidadeFrete() {
				
				return getString();
			}
			
			@Override
			public String getInscricaoEstadualSubstitutoTributario() {
				
				return getString();
			}
			
			@Override
			public EntradaSaida getIndicadorDoMovimento() {
				
				return EntradaSaida.ENTRADA;
			}
			
			@Override
			public boolean getIndicadorDeSituacaoCancelamentoDocumento() {
				
				return false;
			}
			
			@Override
			public String getIdentificacaoVeiculo() {
				
				return getString();
			}
			
			@Override
			public String getEspecieDeVolume() {
				
				return getString();
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
			public Date getDataDaSaidaEntrada() {
				
				return new Date();
			}
			
			@Override
			public String getCodigoParticipanteDocumentoReferenciado() {
				
				return getString();
			}
			
			@Override
			public String getCodigoParticipante() {
				
				return getString();
			}
			
			@Override
			public String getCodigoDoTransportador() {
				
				return getString();
			}
			
			@Override
			public String getAtoDeclaratorioExecutivo() {
				
				return getString();
			}
		};
	}

}
