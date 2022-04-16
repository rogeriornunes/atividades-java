package domain.model;

import java.math.BigDecimal;

public class Voto {

	private BigDecimal valido;
	private BigDecimal branco;
	private BigDecimal nulo;
	
	public BigDecimal getValido() {
		return valido;
	}
	public void setValido(BigDecimal valido) {
		this.valido = valido;
	}
	public BigDecimal getBranco() {
		return branco;
	}
	public void setBranco(BigDecimal branco) {
		this.branco = branco;
	}
	public BigDecimal getNulo() {
		return nulo;
	}
	public void setNulo(BigDecimal nulo) {
		this.nulo = nulo;
	}
	
	public  BigDecimal valido() {
		return this.valido.divide(new BigDecimal(1000L)).multiply(new BigDecimal(100L));
	}

	public  BigDecimal branco() {
		return this.branco.divide(new BigDecimal(1000L)).multiply(new BigDecimal(100L));	
	}

	public  BigDecimal nulo() {
		return this.nulo.divide(new BigDecimal(1000L)).multiply(new BigDecimal(100L));
	}

}
