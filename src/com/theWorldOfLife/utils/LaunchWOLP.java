package com.theWorldOfLife.utils;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class LaunchWOLP {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		Desktop userDesktop = java.awt.Desktop.getDesktop(); 
		URI url = new URI("http://localhost:8080/TheWorldOfLife/index.html");
		userDesktop.browse(url);
		
		}catch (IOException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		
		} catch (URISyntaxException ex) {
			ex.printStackTrace();
			System.out.println(ex.getMessage());
		}
		AddToDB.connectAelDatabase();
	}

}
