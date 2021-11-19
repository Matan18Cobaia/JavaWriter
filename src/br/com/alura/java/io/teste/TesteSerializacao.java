package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class TesteSerializacao {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Cliente.bin"));
		Cliente cliente = (Cliente) ois.readObject();
		System.out.println(cliente.getNome());
		ois.close();
	}

}
