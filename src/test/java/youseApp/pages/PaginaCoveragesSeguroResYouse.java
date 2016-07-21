/*
 Developed on 20/07/2016 by Murilo Campos
*/

package youseApp.pages;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import youseApp.config.Config;

@ScreenMap(name = "Pagina Coverage Seguro Residencial Youse", base = Config.URLBASE, location = "/home/order/coverages_selection/edit")
public class PaginaCoveragesSeguroResYouse {
	
	@ElementMap(name = "Botao Proximo Passo", locatorType = ElementLocatorType.Value, locator = "próximo passo")
	private Button BotaoProximoPasso;
}