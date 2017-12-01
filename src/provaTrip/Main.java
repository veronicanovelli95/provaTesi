package provaTrip;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ProvaTrip prova = new ProvaTrip();
		prova.setPage("http://www.tradingview.com/chat.html");
		System.out.println(prova.extractTotRanking());
		System.out.println(prova.extractRanking());
	}

}
