/*
 Developed on 20/07/2016 by Murilo Campos
*/

package youseApp.pages;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import br.gov.frameworkdemoiselle.behave.runner.ui.Element;
import youseApp.config.Config;

@ScreenMap(name = "Pagina Principal Youse", base = Config.URLBASE, location = "")
public class PaginaPrincipalYouse {
	
	@ElementMap(name = "Opcao Menu Produtos", locatorType = ElementLocatorType.XPath, locator = "/html/body/div[2]/div[3]/div/div[2]/nav/ul/li[2]/a")
	private Element menuProdutos;
	
	@ElementMap(name = "Botao Conheca Seg Residencial", locatorType = ElementLocatorType.XPath, locator = "/html/body/div[2]/main/section[2]/div[2]/div/div[1]/a")
	private Button BotaoSegResid;
	
	@ElementMap(name = "Botao Conheca Seg Auto", locatorType = ElementLocatorType.XPath, locator = "/html/body/div[2]/main/section[2]/div[2]/div/div[2]/a")
	private Button BotaoSegAuto;
	
	@ElementMap(name = "Botao Conheca Seg Vida", locatorType = ElementLocatorType.XPath, locator = "/html/body/div[2]/main/section[2]/div[2]/div/div[3]/a")
	private Button BotaoSegVida;	
}