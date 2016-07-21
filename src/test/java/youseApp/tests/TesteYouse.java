/*
 * Developed in 20/07/2016 by Murilo Campos
*/

package youseApp.tests;

import org.junit.Test;
import br.gov.frameworkdemoiselle.behave.controller.BehaveContext;

public class TesteYouse {

	private BehaveContext eng = BehaveContext.getInstance();

	public TesteYouse() {
	}
	
	@Test
	public void testeCadastroYouse() throws Throwable {
		/*Primeiro Teste e cenario que sera executado*/
		eng.addStories("/stories/cadastro/cadastro.story");
		eng.run();
	}	
	
	@Test
	public void bateriaDeTestesYouse() throws Throwable {
		/*Segundo Teste e cenario que sera executado*/
		eng.addStories("/stories/login/loginInvalido.story");
		/*Terceiro cenario que sera executado*/
		eng.addStories("/stories/login/login.story");
		/*Quarto cenario que sera executado*/
		eng.addStories("/stories/telasInstitucionais/telasInstitucionais.story");
		/*Quinto cenario que sera executado*/
		eng.addStories("/stories/cotacao/cotacao.story");
		
		eng.run();
	}
	
	
}