package br.com.alura.java.io.teste;

import java.io.IOException;
import java.io.PrintStream;

public class TesteEscritaFileWriter2 {

  public static void main(String[] args) throws IOException {
    PrintStream ps = new PrintStream("lorem2.txt");
    ps.println("Meu nome � Mateus Andriola");
    ps.println();
    ps.println();
    ps.println();
    ps.println();
    ps.println("blabalbala");
    ps.close();
  }
}
