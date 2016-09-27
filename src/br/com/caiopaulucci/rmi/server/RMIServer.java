package br.com.caiopaulucci.rmi.server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

import br.com.caiopaulucci.rmi.interfaces.Mensageiro;

public class RMIServer {

	public static void main(String args[]) {

		try {
			Mensageiro msgeiro = new MensageiroImpl();
			Registry registry = LocateRegistry.createRegistry(8016);
			registry.bind("Mensageiro", msgeiro);

			System.err.println("Server ready");
		} catch (Exception e) {
			System.err.println("Server exception: " + e.toString());
			e.printStackTrace();
		}
	}

}
