package qualidade.aula.testes;

import org.junit.Assert;
import qualidade.aula.metodos.ChamaMetodos;

public class TesteContato {
	
	ChamaMetodos chama = new ChamaMetodos();
	
	public void contatoSemInfo() {
		chama.clicaBotaoLinkText("Contact");
		chama.clicaBotaoPhp("//input[@type='submit']");
		Assert.assertEquals("wpcf7-response-output wpcf7-display-none wpcf7-validation-errors","wpcf7-response-output wpcf7-display-none wpcf7-validation-errors");
	}
	
	public void contatoComInfoErrada(){
		chama.clicaBotaoLinkText("Contact");
		chama.procuraElemento("your-name", "Teste de Nome");
		chama.procuraElemento("your-email", "emailErrado.com");
		chama.clicaBotaoPhp("//input[@type='submit']");
		Assert.assertEquals(chama.procuraXPath("Email address seems invalid."), "Email address seems invalid.");
	}
	
	public void contatoComInfoCorreta(){
		chama.clicaBotaoLinkText("Contact");
		chama.procuraElemento("your-name", "Teste de Nome");
		chama.procuraElemento("your-email", "ola@gmail.com");
		chama.procuraElemento("your-subject", "Teste de Subject");
		chama.procuraElemento("your-message", "Este é um teste!");
		chama.clicaBotaoPhp("//input[@type='submit']");
		Assert.assertEquals(chama.procuraXPathPelaDiv("Your message was sent successfully. Thanks."),"Your message was sent successfully. Thanks.");
	}
}