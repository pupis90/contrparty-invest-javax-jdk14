package security.contrparties.investigations.endpoints;


import javax.xml.ws.Endpoint;
import java.util.Scanner;

import static java.lang.Thread.sleep;


public class ContrPartyControlServicePublisher {

	public static final String ContrPartyControlService_URL = "http://localhost:7777/ContrPartyControlService";
	public static final Object ContrPartyControlServiceImpl = new CounterPartyControlServiceImpl();

	public static void main(String[] args) {

		String user_input = "";
		Endpoint ContrPartyResumeServiceEnp = Endpoint.publish(ContrPartyControlService_URL, ContrPartyControlServiceImpl);
		System.out.println("Введите S, если желаете остановить сервис  " + ContrPartyControlService_URL + "/?wsdl");
		Scanner scanner = new Scanner(System.in);
		while (!user_input.equalsIgnoreCase("S")) {
			user_input = scanner.next();

			try {
				sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

		}

		scanner.close();
		ContrPartyResumeServiceEnp.stop();
		System.out.println("Cервис  " + ContrPartyControlService_URL + " остановлен");
	}




}
