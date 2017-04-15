package qualidade.aula.testes;

import org.junit.Assert;

import qualidade.aula.metodos.ChamaMetodos;

public class TesteFrames {
	ChamaMetodos chama = new ChamaMetodos();
	
	public void frameNovaAba(){
		chama.clicaBotaoLinkText("Frames and windows");
		chama.procuraXPathPeloAeClica("New Browser Tab");
		chama.mudaAba();
		Assert.assertEquals(chama.procuraProxPagina(),"http://demoqa.com/frames-and-windows/#");
	}
}