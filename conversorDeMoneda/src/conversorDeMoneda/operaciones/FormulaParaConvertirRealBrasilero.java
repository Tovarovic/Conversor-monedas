package conversorDeMoneda.operaciones;

import java.math.BigDecimal;

import conversorDeMoneda.enums.Monedas;

public class FormulaParaConvertirRealBrasilero extends FormulaParaConvertir {
	
	public BigDecimal dolarAMoneda(Monedas moneda, BigDecimal valorEnMoneda) {
		moneda = Monedas.REAL;
		return super.dolarAMoneda(moneda, valorEnMoneda);
	}

	public BigDecimal monedaADolar(Monedas moneda, BigDecimal valorEnDolar) {
		moneda = Monedas.REAL;
		return super.monedaADolar(moneda, valorEnDolar);
	}
	

}
