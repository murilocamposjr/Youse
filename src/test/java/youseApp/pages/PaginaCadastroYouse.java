/*
 Developed on 20/07/2016 by Murilo Campos
*/

package youseApp.pages;

import youseApp.config.Config;
import br.gov.frameworkdemoiselle.behave.annotation.ElementLocatorType;
import br.gov.frameworkdemoiselle.behave.annotation.ElementMap;
import br.gov.frameworkdemoiselle.behave.annotation.ScreenMap;
import br.gov.frameworkdemoiselle.behave.runner.ui.TextField;
import br.gov.frameworkdemoiselle.behave.runner.ui.Button;

@ScreenMap(name = "Pagina Cadastro Youse", base = Config.URLBASE, location = "/users/sign_up")
public class PaginaCadastroYouse {

	@ElementMap(name = "Campo Nome", locatorType = ElementLocatorType.XPath, locator = "/html/body/div[2]/article/form/fieldset[1]/input")
	private TextField campoNome;
	
	@ElementMap(name = "Campo Email", locatorType = ElementLocatorType.XPath, locator = "/html/body/div[2]/article/form/fieldset[2]/input")
	private TextField campoEmail;
	
	@ElementMap(name = "Campo Senha", locatorType = ElementLocatorType.XPath, locator = "/html/body/div[2]/article/form/fieldset[3]/input")
	private TextField campoSenha;
	
	@ElementMap(name = "Campo Confirme Senha", locatorType = ElementLocatorType.XPath, locator = "/html/body/div[2]/article/form/fieldset[4]/input")
	private TextField campoConfirmeSenha;
	
	@ElementMap(name = "Botao Enviar Cadastro", locatorType = ElementLocatorType.Value, locator = "enviar cadastro")
	private Button BotaoEnviarCadastro;
	
}