package qualidade.aula.principal;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import qualidade.aula.configuracao.ConfigNavegador;
import qualidade.aula.testes.TesteContato;
import qualidade.aula.testes.TesteFrames;
import qualidade.aula.testes.TesteBlog;

public class MainPage {
	
	ConfigNavegador abreFecha = new ConfigNavegador();
	TesteContato teste = new TesteContato();
	TesteBlog blog = new TesteBlog();
	TesteFrames frame = new TesteFrames();

	@Before
	public void setUp() throws Exception {
		abreFecha.setBaseUrl("http://demoqa.com");
		abreFecha.configuraWebDriver();
	}

	@Test
	public void enviaContatoSemInfo() throws Exception {
		teste.contatoSemInfo();
	}

	@Test
	public void enviaContatoComInfoErrada() throws Exception {
		teste.contatoComInfoErrada();
	}
	
	@Test
	public void enviaContatoComInfoCorreta() throws Exception {
		teste.contatoComInfoCorreta();
	}
	
	@Test
	public void abreFrameEmNovaAba() throws Exception {
		frame.frameNovaAba();
	}

	@Test
	public void curteSeArtigoFoiUtil() throws Exception {		
		blog.artigoFoiUtil();
	}
	
	@Test
	public void postaComentarioSemPreencherCamposObrigatorios(){
		blog.postarComentarioSemPreencher();
	}
	
	@Test
	public void postaComentarioCorretamente(){
		blog.postarComentarioCorretamente();
	}


	@After
	public void tearDown() throws Exception {
		abreFecha.fechaNavegador();
	}
}