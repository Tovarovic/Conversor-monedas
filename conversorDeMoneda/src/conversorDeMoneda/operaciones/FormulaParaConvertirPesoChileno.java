package conversorDeMoneda.operaciones;

import java.math.BigDecimal;

import conversorDeMoneda.enums.Monedas;

public class FormulaParaConvertirPesoChileno extends FormulaParaConvertir {
	
	public BigDecimal dolarAMoneda(Monedas moneda, BigDecimal valorEnMoneda) {
		moneda = Monedas.PESO_CHI;
		return super.dolarAMoneda(moneda, valorEnMoneda);
	}

	public BigDecimal monedaADolar(Monedas moneda, BigDecimal valorEnDolar) {
		moneda = Monedas.PESO_CHI;
		return super.monedaADolar(moneda, valorEnDolar);
	}
	

}
