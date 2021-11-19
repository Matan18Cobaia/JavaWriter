package br.com.alura.java.io.teste;

import java.io.FileWriter;
import java.io.IOException;

public class TesteEscritaFileWriter {

  public static void main(String[] args) throws IOException {

    FileWriter fw = new FileWriter("lorem2.txt");

    fw.write("Meu nome � Mateus Andriola");
    fw.write(System.lineSeparator());
    fw.write("a�lksjdf�lka");
    fw.close();
  }
}
