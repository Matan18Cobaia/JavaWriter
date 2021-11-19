package br.com.alura.java.io.teste;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TesteEscrita {

  public static void main(String[] args) throws IOException {
    OutputStream fos = new FileOutputStream("lorem2.txt");
    OutputStreamWriter osw = new OutputStreamWriter(fos);
    BufferedWriter bw = new BufferedWriter(osw);
    bw.write("Meu nome � Mateus Andriola");
    bw.newLine();
    bw.write("Nova Linha");
    bw.close();
  }
}
