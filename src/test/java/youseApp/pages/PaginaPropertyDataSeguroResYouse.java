/*
 Developed on 20/07/2016 by Murilo Campos
*/

package youseApp.pages;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;
import youseApp.config.Config;

@ScreenMap(name = "Pagina Property Data Seguro Residencial Youse", base = Config.URLBASE, location = "/home/order/property_data/edit")
public class PaginaPropertyDataSeguroResYouse {
	
	@ElementMap(name = "Campo Numero Imovel", locatorType = ElementLocatorType.XPath, locator = "/html/body/section[1]/form/fieldset[1]/fieldset[2]/fieldset[1]/input")
	private TextField campoNumeroImovel;
	
	@ElementMap(name = "Campo Complemento Imovel", locatorType = ElementLocatorType.XPath, locator = "/html/body/section[1]/form/fieldset[1]/fieldset[2]/fieldset[2]/input")
	private TextField campoComplementoImovel;
	
	@ElementMap(name = "Botao Pagamento", locatorType = ElementLocatorType.XPath, locator = "/html/body/section[1]/form/p[3]/input")
	private Button botaoPagamento;
}