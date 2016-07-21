/*
 Developed on 20/07/2016 by Murilo Campos
*/

package youseApp.pages;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import br.gov.frameworkdemoiselle.behave.runner.ui.ListBox;
import youseApp.config.Config;

@ScreenMap(name = "Pagina Order Seguro Residencial Youse", base = Config.URLBASE, location = "/home/order/edit")
public class PaginaOrderEditSeguroResYouse {

	@ElementMap(name = "Campo Nome", locatorType = ElementLocatorType.XPath, locator = "/html/body/section/form/fieldset[1]/fieldset[1]/input")
	private TextField campoNome;
	
	@ElementMap(name = "Campo Celular", locatorType = ElementLocatorType.Id, locator = "home_order_flow_pricing_requirements_lead_person_attributes_phone")
	private TextField campoCelular;
	
	@ElementMap(name = "Campo Email", locatorType = ElementLocatorType.Id, locator = "home_order_flow_pricing_requirements_lead_person_attributes_email")
	private TextField campoEmail;
	
	@ElementMap(name = "Lista Tipo Imovel", locatorType = ElementLocatorType.XPath, locator = "/html/body/section/form/fieldset[2]/fieldset[1]/select")
	private ListBox listaTipoImovel;
	
	@ElementMap(name = "Campo Valor", locatorType = ElementLocatorType.XPath, locator = "/html/body/section/form/fieldset[2]/fieldset[2]/input")
	private TextField campoValor;
	
	@ElementMap(name = "Campo CEP", locatorType = ElementLocatorType.XPath, locator = "/html/body/section/form/fieldset[2]/fieldset[3]/input")
	private TextField campoCEP;
	
	@ElementMap(name = "Lista Terreno Vizinho", locatorType = ElementLocatorType.XPath, locator = "/html/body/section/form/fieldset[2]/fieldset[4]/fieldset/label/select")
	private ListBox listaTerrenoVizinho;
	
	@ElementMap(name = "Botao Escolher Coberturas", locatorType = ElementLocatorType.Value, locator = "escolher coberturas")
	private Button BotaoEscolherCoberturas;
}