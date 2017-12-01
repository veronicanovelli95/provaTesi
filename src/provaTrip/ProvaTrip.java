package provaTrip;

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.WebClient;
import com.gargoylesoftware.htmlunit.html.DomNode;
import com.gargoylesoftware.htmlunit.html.DomNodeList;
import com.gargoylesoftware.htmlunit.html.HtmlPage;

public class ProvaTrip {
	static WebClient webClient;
	String pageURL;
	HtmlPage page;


	public ProvaTrip() {
		System.out.println("prova1");
		 webClient = new WebClient(BrowserVersion.FIREFOX_52);
		 webClient.getOptions().setThrowExceptionOnScriptError(false);
	}
	
	public void setPage(String s) {
		try {
			System.out.println("prova2");
			this.pageURL = s;
			this.page = webClient.getPage(s);
			System.out.println("s");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	public String getPageURL() {
		return pageURL;
	}
	
	
	public String extractRanking() {
		try{
			String rank = page.querySelector(".ch-data").getFirstChild().getNodeValue();
//			String array[] = rank.split(" ");
//			rank = array[1];

			return rank;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
	
	public String extractTotRanking() { 		
		try{
			DomNodeList <DomNode> childNodes = page.querySelector(".standalone-chat-list msg-data pc-data");
			int denominator = childNodes.getLength();
//			System.out.println(denominator);
//			for(DomNode d:childNodes )
			System.out.println(denominator);
			return "banan"; 
		} catch (Exception e) {
			e.printStackTrace();
			return "";
		}
	}

}
