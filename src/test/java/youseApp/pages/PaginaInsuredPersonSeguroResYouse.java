/*
 Developed on 20/07/2016 by Murilo Campos
*/

package youseApp.pages;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;
import br.gov.frameworkdemoiselle.behave.runner.ui.ListBox;
import youseApp.config.Config;

@ScreenMap(name = "Pagina Insured Person Seguro Residencial Youse", base = Config.URLBASE, location = "/home/order/insured_person_data/edit")
public class PaginaInsuredPersonSeguroResYouse {
	
	@ElementMap(name = "Campo Nome Completo", locatorType = ElementLocatorType.XPath, locator = "/html/body/section[1]/form/fieldset[1]/fieldset[2]/input")
	private TextField campoNomeCompleto;
	
	@ElementMap(name = "Lista Sexo", locatorType = ElementLocatorType.XPath, locator = "/html/body/section[1]/form/fieldset[1]/fieldset[3]/select")
	private ListBox listaSexo;
	
	@ElementMap(name = "Campo CPF", locatorType = ElementLocatorType.XPath, locator = "/html/body/section[1]/form/fieldset[1]/fieldset[4]/input")
	private TextField campoCPF;
	
	@ElementMap(name = "Campo Data Nascimento", locatorType = ElementLocatorType.XPath, locator = "/html/body/section[1]/form/fieldset[2]/fieldset/fieldset[1]/fieldset[1]/input")
	private TextField campoDataNascimento;
	
	@ElementMap(name = "Lista Trabalho", locatorType = ElementLocatorType.XPath, locator = "/html/body/section[1]/form/fieldset[3]/fieldset[1]/span/span[1]/span/span[1]")
	private ListBox listaTrabalho;
	
	@ElementMap(name = "Lista Renda Familiar", locatorType = ElementLocatorType.XPath, locator = "/html/body/section[1]/form/fieldset[3]/fieldset[2]/select")
	private ListBox listaRendaFamiliar;
	
	@ElementMap(name = "Lista Caracteristicas", locatorType = ElementLocatorType.XPath, locator = "/html/body/section[1]/form/fieldset[3]/fieldset[3]/select")
	private ListBox listaCaracteristicas;
	
	@ElementMap(name = "Botao Proximo Passo", locatorType = ElementLocatorType.Value, locator = "próximo passo")
	private Button BotaoProximoPasso;
	
	
}