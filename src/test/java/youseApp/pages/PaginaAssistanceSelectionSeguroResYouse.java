/*
 Developed on 20/07/2016 by Murilo Campos
*/

package youseApp.pages;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import youseApp.config.Config;

@ScreenMap(name = "Pagina Assistance Selection Seguro Residencial Youse", base = Config.URLBASE, location = "/home/order/assistances_selection/edit")
public class PaginaAssistanceSelectionSeguroResYouse {
	
	@ElementMap(name = "Botao Preencher Meus Dados", locatorType = ElementLocatorType.Value, locator = "preencher meus dados")
	private Button BotaoPreencherMeusDados;
}