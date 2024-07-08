package ru.netology.controller;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.entity.Person;
import ru.netology.repository.Repository;
import java.util.List;

@AllArgsConstructor
@RestController
public class Controller {

    Repository repository;

    @GetMapping("/persons/by-city")
    public List<Person> getPersons(@RequestParam String city){
        return repository.getPersonsByCity(city);
    }
}