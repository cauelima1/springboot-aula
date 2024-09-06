package com.aulaspringboot.aula.curso.controller;

import com.aulaspringboot.aula.curso.bean.Cursos;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CursoController {

    //http://localhost:8080/cursos
    @GetMapping("/cursos")
    public List<Cursos> getTodosCursos(){
        return Arrays.asList(new Cursos(1, "Curso de Frameworks", "Aula Sobre Spring Boot"));
    }
}
