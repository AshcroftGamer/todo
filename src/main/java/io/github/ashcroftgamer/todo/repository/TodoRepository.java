package io.github.ashcroftgamer.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import io.github.ashcroftgamer.todo.model.*;


public interface TodoRepository extends JpaRepository<Todo, Long> {

}
