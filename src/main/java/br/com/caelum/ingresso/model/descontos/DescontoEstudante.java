package br.com.caelum.ingresso.model.descontos;

import java.math.BigDecimal;

public class DescontoEstudante implements Desconto {
	
	private BigDecimal metade = new BigDecimal("2.0");
	
	@Override
	public BigDecimal aplicarDescontoSobre(BigDecimal precoOgirinal) {
		
		return precoOgirinal.divide(metade);
		
	}

}
