package dev.napoleon;

import java.io.FileInputStream;
import java.io.InputStream;
import java.nio.file.Path;

public class Main {
    public static void main(String[] args) {
        
        Path arquivoCodigo = Path.of("linguagem-de-teste", "src", "main", "java", "dev", "napoleon", "linguagem-de-teste.txt");

        try (InputStream entrada = new FileInputStream(arquivoCodigo.toFile())) {
            Compilador compilador = new Compilador(entrada);
            double resultado = compilador.Start();
            System.out.println("Resultado: " + resultado);
        } catch (Exception e) {
            System.err.println("Erro ao compilar/executar - " + e.getMessage());
        }
    }
}
