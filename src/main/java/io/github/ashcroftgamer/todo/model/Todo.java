package io.github.ashcroftgamer.todo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

@Entity
@Data
public class Todo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column
	private String description;

	@Column
	private boolean done;

	@Column
	@JsonFormat(pattern = "dd/MM/yyyy  HH:mm")
	private LocalDateTime createdDate;

	@Column
	@JsonFormat(pattern = "dd/MM/yyyy  HH:mm")
	private LocalDateTime doneDate;

	
	
	@PrePersist  //essa anotação faz com que o metodo seja executado antes de toda operação seja executada dentro do banco
	public void beforeSave() {
		setCreatedDate(LocalDateTime.now());
	}
}