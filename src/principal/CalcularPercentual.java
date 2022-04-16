package principal;

import java.math.BigDecimal;

import domain.factory.PercentualFactory;
import domain.model.Eleitor;
import domain.model.TipoVoto;
import domain.model.Voto;

public class CalcularPercentual {

	public static void main(String[] args) {
		Eleitor eleitor = montandoEleitor();
		Voto voto = montandoVoto();
		
		valido(eleitor, voto);
		branco(eleitor, voto);
		nulo(eleitor, voto);
	}

	private static Voto montandoVoto() {
		BigDecimal valido = new BigDecimal(800L);
		BigDecimal branco = new BigDecimal(150L);
		BigDecimal nulo = new BigDecimal(50L);
		
		Voto voto = new Voto();
		voto.setValido(valido);
		voto.setBranco(branco);
		voto.setNulo(nulo);
		return voto;
	}

	private static Eleitor montandoEleitor() {
		BigDecimal toltalEleitor = new BigDecimal(1000L);
		Eleitor eleitor = new Eleitor();
		eleitor.setTotalEleitor(toltalEleitor);
		return eleitor;
	}

	private static void valido(Eleitor eleitor, Voto voto) {
		BigDecimal percentual = BigDecimal.ZERO;
		percentual = PercentualFactory.calcularPercentual(eleitor, voto, TipoVoto.VALIDO);
		mostrarMensagem(percentual, TipoVoto.VALIDO);
	}
	
	private static void branco(Eleitor eleitor, Voto voto) {
		BigDecimal percentual = BigDecimal.ZERO;
		percentual = PercentualFactory.calcularPercentual(eleitor, voto, TipoVoto.BRANCO);
		mostrarMensagem(percentual, TipoVoto.BRANCO);
	}
	
	private static void nulo(Eleitor eleitor, Voto voto) {
		BigDecimal percentual = BigDecimal.ZERO;
		percentual = PercentualFactory.calcularPercentual(eleitor, voto, TipoVoto.NULO);
		mostrarMensagem(percentual, TipoVoto.NULO);
	}
	
	public static void mostrarMensagem(BigDecimal percentual, TipoVoto tipoVoto) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("Percentual: ");
		stringBuilder.append(percentual);
		stringBuilder.append(" % dos votos ");
		stringBuilder.append(tipoVoto);
		System.out.println(stringBuilder.toString());
	}
}
