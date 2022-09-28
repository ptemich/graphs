package pl.ptemich.graphs;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import pl.ptemich.graphs.model.Graph;

@SpringBootApplication
public class GraphsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GraphsApplication.class, args);
	}

	@Override
	public void run(String... args) {
		Graph graph = new Graph();
		graph.a
	}
}
