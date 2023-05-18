package conversorDeMoneda.operaciones;

import java.math.BigDecimal;

import conversorDeMoneda.enums.Monedas;

public class FormulaParaConvertirPesoColombiano extends FormulaParaConvertir {
	
	public BigDecimal dolarAMoneda(Monedas moneda, BigDecimal valorEnMoneda) {
		moneda = Monedas.PESO_COL;
		return super.dolarAMoneda(moneda, valorEnMoneda);
	}

	public BigDecimal monedaADolar(Monedas moneda, BigDecimal valorEnDolar) {
		moneda = Monedas.PESO_COL;
		return super.monedaADolar(moneda, valorEnDolar);
	}
	

}
