package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String getHello() {
		return "Hello turma 44!";
	}
	@GetMapping("/bsm")
	public String atividade1() {
		return "mentalidade de crescimento, orientação para o futuro,\"\r\n"
				+ "				+ \"persistência, proatividade";
}
	
	@GetMapping("/objetivos")
	public String atividade2() {
		return "desenvolvimento constânte, geração de valor, aprofundar meu conhecimento\"\r\n";
				
}
}