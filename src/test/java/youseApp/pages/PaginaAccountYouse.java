/*
 Developed on 20/07/2016 by Murilo Campos
*/

package youseApp.pages;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import youseApp.config.Config;

@ScreenMap(name = "Pagina Account Youse", base = Config.URLBASE, location = "/account")
public class PaginaAccountYouse {
		
	@ElementMap(name = "Botao Cotar Seguro Residencial", locatorType = ElementLocatorType.XPath, locator = "/html/body/div[3]/div/div/article[1]/a")
	private Button BotaoCotarSegRes;	
}