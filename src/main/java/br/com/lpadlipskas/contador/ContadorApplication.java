package br.com.lpadlipskas.contador;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.util.Scanner;

@SpringBootApplication
public class ContadorApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ContadorApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		// 1.
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Digite um número para contagem: ");
//		var numero = scanner.nextInt();
//
//		for (int i = 0; i <= numero; i++) {
//			System.out.printf(i + " ");
//		}

		// 3. e 4.
		Tarefa tarefa1 = new Tarefa("assistir aula1", false, "João");
		ObjectMapper objectMapper = new ObjectMapper();
		objectMapper.writeValue(new File("tarefa.json"), tarefa1);
		System.out.println("Dados salvos no arquivo tarefa.json: \n" + tarefa1.getDescricao() +
				"\n" + tarefa1.isConcluida() + "\n" + tarefa1.getPessoaResponsavel() + "\n");
		//System.out.println(tarefa1);

		// 5.
		ObjectMapper objectMapper2 = new ObjectMapper();
		Tarefa tarefa2 = objectMapper2.readValue(new File("tarefa.json"), Tarefa.class);
		System.out.println("Tarefa lida do json:");
		System.out.println(tarefa2);

		// 6.



	}
}
