package conversorDeMoneda.enums;

import java.math.BigDecimal;

public enum Monedas {
			
	PESO_ARG(BigDecimal.valueOf(228.53)),
	PESO_CHI(BigDecimal.valueOf(788.62)),
	PESO_URU(BigDecimal.valueOf(38.73)),
	GUARANI(BigDecimal.valueOf(7188.34)),
	PESO_COL(BigDecimal.valueOf(4549.75)),
	REAL(BigDecimal.valueOf(4.94)),
	BOLIVAR(BigDecimal.valueOf(25.15)),
	SOL_PERUANO(BigDecimal.valueOf(3.69)),
	BOLIVIANO(BigDecimal.valueOf(6.91));
			
	private BigDecimal VALOR_MONEDA;

	Monedas(BigDecimal VALOR_MONEDA) {
		this.VALOR_MONEDA = VALOR_MONEDA;
	}

	public BigDecimal getVALOR_MONEDA() {
		return VALOR_MONEDA;
	}
}
