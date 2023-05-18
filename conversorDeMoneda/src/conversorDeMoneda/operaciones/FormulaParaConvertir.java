package conversorDeMoneda.operaciones;

import java.math.BigDecimal;
import java.math.RoundingMode;

import conversorDeMoneda.enums.Monedas;
import conversorDeMoneda.interfaces.MonedaConvertible;

public class FormulaParaConvertir implements MonedaConvertible {
	
	public BigDecimal dolarAMoneda(Monedas moneda, BigDecimal valorEnMoneda) {
		return valorEnMoneda.multiply(moneda.getVALOR_MONEDA());
	}
	
	public BigDecimal monedaADolar(Monedas moneda, BigDecimal valorEnDolar) {
		return valorEnDolar.divide(moneda.getVALOR_MONEDA(),  2, RoundingMode.HALF_UP);
	}
}
