package br.com.caiopaulucci.rmi.client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.com.caiopaulucci.rmi.interfaces.Mensageiro;

public class RMIClient {

	public static void main(String[] args) {
		String host = "127.0.0.1";
		Integer port = 8016;
		try {
			Registry registry = LocateRegistry.getRegistry(host,port);
			Mensageiro stub = (Mensageiro) registry.lookup("Mensageiro");
			String response = stub.lerMensagem();
			System.out.println("response: " + response);
		} catch (Exception e) {
			System.err.println("Client exception: " + e.toString());
			e.printStackTrace();
		}
	}

}
