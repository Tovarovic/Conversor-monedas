package conversorDeMoneda.interfaces;

import java.math.BigDecimal;

import conversorDeMoneda.enums.Monedas;

public interface MonedaConvertible {
	
	BigDecimal dolarAMoneda(Monedas moneda, BigDecimal valorEnDolar);
    BigDecimal monedaADolar(Monedas moneda, BigDecimal valorEnMoneda);
    
}
