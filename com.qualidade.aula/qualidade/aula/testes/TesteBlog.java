package qualidade.aula.testes;

import org.junit.Assert;

import qualidade.aula.metodos.ChamaMetodos;

public class TesteBlog {
	ChamaMetodos chama = new ChamaMetodos();
	
	public void artigoFoiUtil(){
		chama.clicaBotaoLinkText("Blog");
		chama.clicaBotaoLinkText("Sample Post2");
		chama.procuraXPathEClica("This article was helpful");
		Assert.assertEquals(chama.procuraXPath("Thank you."),"Thank you.");
	}

	public void postarComentarioSemPreencher(){
		chama.clicaBotaoLinkText("Blog");
		chama.clicaBotaoLinkText("Sample Post2");
		chama.clicaBotaoByName("submit");
		Assert.assertEquals(chama.procuraProxPagina(),"http://demoqa.com/wp-comments-post.php");
	}
	
	public void postarComentarioCorretamente(){
		chama.clicaBotaoLinkText("Blog");
		chama.clicaBotaoLinkText("Sample Post2");
		chama.procuraXPathEClica("This article was helpful");
		chama.procuraElemento("author", "Fulano");
		chama.procuraElemento("email", "fulano@gmail.com");
		chama.procuraElemento("comment", "Obrigado pelos peixes!");
		chama.clicaBotaoByName("submit");
		Assert.assertEquals(chama.procuraXPathPeloCite("Fulano"), "Fulano");
	}
}
