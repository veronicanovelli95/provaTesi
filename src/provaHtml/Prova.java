package provaHtml;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.WebElement;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Prova {

	public static void main(String[] args) throws IOException, InterruptedException {

		String s = "https://www.tradingview.com/chat/#bitcoin";
		URL url = new URL(s);

		
		
	  WebClient cl = new WebClient();
	cl.getPage(url);
	
	 WebDriver driver = new HtmlUnitDriver(true);
	 driver.get(s);
	 
     System.out.println(driver);

		
	
	      

	}

}
