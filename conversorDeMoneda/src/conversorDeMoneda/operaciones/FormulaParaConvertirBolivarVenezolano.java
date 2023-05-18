package conversorDeMoneda.operaciones;

import conversorDeMoneda.enums.Monedas;
import java.math.BigDecimal;

public class FormulaParaConvertirBolivarVenezolano extends FormulaParaConvertir{

	public BigDecimal dolarAMoneda(Monedas moneda, BigDecimal valorEnMoneda) {
		moneda = Monedas.BOLIVAR;
		return super.dolarAMoneda(moneda, valorEnMoneda);
	}

	public BigDecimal monedaADolar(Monedas moneda, BigDecimal valorEnDolar) {
		moneda = Monedas.BOLIVAR;
		return super.monedaADolar(moneda, valorEnDolar);
	}
	
	
}
