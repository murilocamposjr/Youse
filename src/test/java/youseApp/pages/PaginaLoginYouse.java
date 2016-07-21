/*
 Developed on 20/07/2016 by Murilo Campos
*/

package youseApp.pages;

import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;
import youseApp.config.Config;

@ScreenMap(name = "Pagina Login Youse", base = Config.URLBASE, location = "/users/email_verifications/new")
public class PaginaLoginYouse {

	@ElementMap(name = "Campo Email", locatorType = ElementLocatorType.XPath, locator = "/html/body/div[2]/article/form/fieldset/input")
	private TextField campoEmail;
	
	@ElementMap(name = "Botao Proximo Passo", locatorType = ElementLocatorType.Value, locator = "próximo passo")
	private Button BotaoProximoPasso;
	
	@ElementMap(name = "Campo Senha", locatorType = ElementLocatorType.XPath, locator = "/html/body/div[2]/article/form/fieldset[2]/input")
	private TextField campoSenha;
	
	@ElementMap(name = "Botao Entrar", locatorType = ElementLocatorType.Value, locator = "entrar")
	private Button BotaoEntrar;
	
}