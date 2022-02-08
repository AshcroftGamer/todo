package io.github.ashcroftgamer.todo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TodoApplication {

//	//teste de aplicacao antes de criar todos os componentes
//	@Autowired
//	private TodoRepository todoRepository;
//
//	@Bean
//	public CommandLineRunner init() {
//		return new CommandLineRunner() {
//
//			@Override
//			public void run(String... args) throws Exception {
//				// TODO Auto-generated method stub
//
//				Todo todo = new Todo();
//				
//				todo.setDescription("Estudar Spring");
//				todo.setCreatedDate(LocalDateTime.now());
//				todoRepository.save(todo);
//
//			}
//		};
//	}
//	//fim

	public static void main(String[] args) {
		SpringApplication.run(TodoApplication.class, args);
	}

}
