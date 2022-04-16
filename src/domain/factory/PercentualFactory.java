package domain.factory;

import java.math.BigDecimal;

import domain.model.Eleitor;
import domain.model.TipoVoto;
import domain.model.Voto;

public final class PercentualFactory {

	public static BigDecimal calcularPercentual(Eleitor eleitor, Voto voto, TipoVoto tipoVoto) {
		return calcular(voto, tipoVoto);
	}

	private static BigDecimal calcular(Voto voto, TipoVoto tipoVoto) {
		BigDecimal percentual = BigDecimal.ZERO;

		if (TipoVoto.VALIDO.equals(tipoVoto)) {
			percentual = voto.valido();
		} else if (TipoVoto.BRANCO.equals(tipoVoto)) {
			percentual = voto.branco();
		} else if (TipoVoto.NULO.equals(tipoVoto)) {
			percentual = voto.nulo();
		}
		return percentual;
	}
}
