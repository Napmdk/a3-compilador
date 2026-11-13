package dev.napoleon;

public class Main {

    public static void main(String[] args) {

        try {
            System.out.println("________________________________");
            System.out.println("Compilador iniciado com sucesso!");
            System.out.println("Digite uma expressão aritmética simples + Enter e Ctrl+Z (windows) | Ctrl+D (Linux) para sair: ");
            Compilador parser = new Compilador(System.in);
            double resultado = parser.Start();
            System.out.printf("Resultado: %.2f %n", resultado);
            System.out.println("________________________________"); 
        } catch (TokenMgrError e) {
            System.out.println("SÍMBOLO INVÁLIDO: " + e.getMessage());
            System.out.println("________________________________");
        } catch (ParseException e) {
            System.out.println("EXPRESSÃO INVÁLIDA: " + e.getMessage());
            System.out.println("________________________________");
        }

    }
    
}
