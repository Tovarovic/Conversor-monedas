package conversorDeMoneda.operaciones;

import java.math.BigDecimal;

import conversorDeMoneda.enums.Monedas;

public class IniciarConversion {

	private static final String DOLAR_ARG = "Dolar a Peso Argentino";
	private static final String DOLAR_CHI = "Dolar a Peso Chileno";
	private static final String DOLAR_URU = "Dolar a Peso Uruguayo";
	private static final String DOLAR_COL = "Dolar a Peso Colombiano";
	private static final String DOLAR_BOLIVAR = "Dolar a Bolivar Venezolano";
	private static final String DOLAR_BOLIVIANO = "Dolar a Boliviano";
	private static final String DOLAR_REAL = "Dolar a Real Brasilero";
	private static final String DOLAR_SOL = "Dolar a Sol Peruano";
	private static final String DOLAR_GUARANI = "Dolar a Guarani Paraguayo";

	private static final String ARG_DOLAR = "Peso Argentino a Dolar";
	private static final String CHI_DOLAR = "Peso Chileno a Dolar";
	private static final String URU_DOLAR = "Peso Uruguayo a Dolar";
	private static final String COL_DOLAR = "Peso Colombiano a Dolar";
	private static final String BOLIVAR_DOLAR = "Bolivar Venezolano a Dolar";
	private static final String BOLIVIANO_DOLAR = "Boliviano a Dolar";
	private static final String REAL_DOLAR = "Real Brasilero a Dolar";
	private static final String SOL_DOLAR = "Sol Peruano a Dolar";
	private static final String GUARANI_DOLAR = "Guarani Paraguayo a Dolar";

	private FormulaParaConvertir formulaParaConvertirPesoArgentino = new FormulaParaConvertirPesoArgentino();
	private FormulaParaConvertir formulaParaConvertirPesoChileno = new FormulaParaConvertirPesoChileno();
	private FormulaParaConvertir formulaParaConvertirPesoUruguayo = new FormulaParaConvertirPesoUruguayo();
	private FormulaParaConvertir formulaParaConvertirPesoColombiano = new FormulaParaConvertirPesoColombiano();
	private FormulaParaConvertir formulaParaConvertirBolivarVenezolano = new FormulaParaConvertirBolivarVenezolano();
	private FormulaParaConvertir formulaParaConvertirBoliviano = new FormulaParaConvertirBoliviano();
	private FormulaParaConvertir formulaParaConvertirRealBrasilero = new FormulaParaConvertirRealBrasilero();
	private FormulaParaConvertir formulaParaConvertirSolPeruano = new FormulaParaConvertirSolPeruano();
	private FormulaParaConvertir formulaParaConvertirGuaraniParaguayo = new FormulaParaConvertirGuaraniParaguayo();

	private Monedas moneda;

	public BigDecimal InstruccionesOperaciones(String operacionMonedas, double valorInicial) throws Exception {

		switch (operacionMonedas) {
			case DOLAR_ARG:
				return formulaParaConvertirPesoArgentino.dolarAMoneda(moneda, BigDecimal.valueOf(valorInicial));
			case DOLAR_CHI:
				return formulaParaConvertirPesoChileno.dolarAMoneda(moneda, BigDecimal.valueOf(valorInicial));
			case DOLAR_URU:
				return formulaParaConvertirPesoUruguayo.dolarAMoneda(moneda, BigDecimal.valueOf(valorInicial));
			case DOLAR_COL:
				return formulaParaConvertirPesoColombiano.dolarAMoneda(moneda, BigDecimal.valueOf(valorInicial));
			case DOLAR_BOLIVAR:
				return formulaParaConvertirBolivarVenezolano.dolarAMoneda(moneda, BigDecimal.valueOf(valorInicial));
			case DOLAR_BOLIVIANO:
				return formulaParaConvertirBoliviano.dolarAMoneda(moneda, BigDecimal.valueOf(valorInicial));
			case DOLAR_REAL:
				return formulaParaConvertirRealBrasilero.dolarAMoneda(moneda, BigDecimal.valueOf(valorInicial));
			case DOLAR_SOL:
				return formulaParaConvertirSolPeruano.dolarAMoneda(moneda, BigDecimal.valueOf(valorInicial));
			case DOLAR_GUARANI:
				return formulaParaConvertirGuaraniParaguayo.dolarAMoneda(moneda, BigDecimal.valueOf(valorInicial));
			case ARG_DOLAR:
				return formulaParaConvertirPesoArgentino.monedaADolar(moneda, BigDecimal.valueOf(valorInicial));
			case CHI_DOLAR:
				return formulaParaConvertirPesoChileno.monedaADolar(moneda, BigDecimal.valueOf(valorInicial));
			case URU_DOLAR:
				return formulaParaConvertirPesoUruguayo.monedaADolar(moneda, BigDecimal.valueOf(valorInicial));
			case COL_DOLAR:
				return formulaParaConvertirPesoColombiano.monedaADolar(moneda, BigDecimal.valueOf(valorInicial));
			case BOLIVAR_DOLAR:
				return formulaParaConvertirBolivarVenezolano.monedaADolar(moneda, BigDecimal.valueOf(valorInicial));
			case BOLIVIANO_DOLAR:
				return formulaParaConvertirBoliviano.monedaADolar(moneda, BigDecimal.valueOf(valorInicial));
			case REAL_DOLAR:
				return formulaParaConvertirRealBrasilero.monedaADolar(moneda, BigDecimal.valueOf(valorInicial));
			case SOL_DOLAR:
				return formulaParaConvertirSolPeruano.monedaADolar(moneda, BigDecimal.valueOf(valorInicial));
			case GUARANI_DOLAR:
				return formulaParaConvertirGuaraniParaguayo.monedaADolar(moneda, BigDecimal.valueOf(valorInicial));
			default:
				throw new Exception("Operacion invalida");
		}
	}
}
