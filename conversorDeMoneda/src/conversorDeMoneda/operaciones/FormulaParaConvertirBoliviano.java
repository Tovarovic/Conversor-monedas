package conversorDeMoneda.operaciones;

import java.math.BigDecimal;
import conversorDeMoneda.enums.Monedas;

public class FormulaParaConvertirBoliviano extends FormulaParaConvertir {
	
	public BigDecimal dolarAMoneda(Monedas moneda, BigDecimal valorEnMoneda) {
		moneda = Monedas.BOLIVIANO;
		return super.dolarAMoneda(moneda, valorEnMoneda);
	}

	public BigDecimal monedaADolar(Monedas moneda, BigDecimal valorEnDolar) {
		moneda = Monedas.BOLIVIANO;
		return super.monedaADolar(moneda, valorEnDolar);
	}
	
}
