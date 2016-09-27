package br.com.caiopaulucci.rmi.server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import br.com.caiopaulucci.rmi.interfaces.Mensageiro;

public class MensageiroImpl extends UnicastRemoteObject implements Mensageiro {

	public MensageiroImpl() throws RemoteException {
	}
	
	@Override
	public void enviarMensagem(String msg) throws RemoteException {
		System.out.println(msg);
	}

	@Override
	public String lerMensagem() throws RemoteException {
		return "OEE!";
	}

}
