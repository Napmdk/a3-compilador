Projeto A3 - Teoria da Computação e Compiladores
Nome do projeto - Linguagem de Teste (TL)

O projeto principal referente a UC (arquivo contendo a definição dos Tokens (léxica), regras sintáticas e semânticas) está em: linguagem-de-teste>src>main>javacc

O arquivo .java temporário contendo o método main (para testar os Tokens e regras gramaticais) está em: linguagem-de-teste>src>main>java>dev>napoleon

Plugins necessários (para rodar no VSCode):

<plugins>
      <!--Plugin do JavaCC, fonte: https://www.mojohaus.org/javacc-maven-plugin/usage.html-->
      <plugin>
        <groupId>org.codehaus.mojo</groupId>
        <artifactId>javacc-maven-plugin</artifactId>
        <version>3.3.0</version>
        <executions>
          <execution>
            <id>javacc</id>
            <goals>
              <goal>javacc</goal>
            </goals>
          </execution>
        </executions>
      </plugin>
      <plugin>
        <groupId>org.codehaus.mojo</groupId>
        <artifactId>build-helper-maven-plugin</artifactId>
        <version>3.4.0</version>
        <executions>
          <execution>
            <phase>generate-sources</phase>
            <goals>
              <goal>add-source</goal>
            </goals>
            <configuration>
              <sources>
                <source>target/generated-sources/javacc</source>
              </sources>
            </configuration>
          </execution>
        </executions>
      </plugin>
    </plugins>

Observação - colar dentro de <build> antes de <pluginManagement>.

Meu email (se precisar) - degreasnapoleon@gmail.com