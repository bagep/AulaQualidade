package qualidade.aula.metodos;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import qualidade.aula.configuracao.ConfigNavegador;

public class ChamaMetodos {
	
    public void procuraElemento(String nome, String conteudo){
    	ConfigNavegador.getDriver().findElement(By.name(nome)).clear();
    	ConfigNavegador.getDriver().findElement(By.name(nome)).sendKeys(conteudo);
    }
    
    public void clicaBotaoLinkText(String nomeBotao){
    	ConfigNavegador.getDriver().findElement(By.linkText(nomeBotao)).click();
    }
    
    public void clicaBotaoPhp(String nomeBotao){
    	ConfigNavegador.getDriver().findElement(By.xpath(nomeBotao)).click();
    }
    
    public void clicaBotaoByName(String nomeBotao){
    	ConfigNavegador.getDriver().findElement(By.name(nomeBotao)).click();
    }
    
    public String procuraXPath(String nome){
    	ConfigNavegador.getDriver().findElement(By.xpath("//span[text()= '" + nome +"']"));
    	return nome;
    }
    
    public String procuraXPathEClica(String nome){
    	ConfigNavegador.getDriver().findElement(By.xpath("//span[text()= '" + nome +"']")).click();;
    	return nome;
    }
    
    public String procuraXPathPelaDiv(String nome){
    	ConfigNavegador.getDriver().findElement(By.xpath("//div[text()= '" + nome +"']"));
    	return nome;
    }
    
    public String procuraXPathPeloCite(String nome){
    	ConfigNavegador.getDriver().findElement(By.xpath("//cite[text()= '" + nome +"']"));
    	return nome;
    }
    
    public void procuraXPathPeloAeClica(String nome){
    	ConfigNavegador.getDriver().findElement(By.xpath("//a[text()= '" + nome +"']")).click();
    }
    
    public String procuraProxPagina(){
    	return ConfigNavegador.getDriver().getCurrentUrl();
    }
    
    public void mudaAba(){
    	List<String> aba = new ArrayList<String> (ConfigNavegador.getDriver().getWindowHandles());
    	ConfigNavegador.getDriver().switchTo().window(aba .get(1));
    }
}