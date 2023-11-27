package kodlama.io.devs.webApi.controllers;

import kodlama.io.devs.business.abstracts.ProgrammingLanguageService;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/programming-languages")
public class ProgrammingLanguageController {
    private ProgrammingLanguageService programmingLanguageService;

    public ProgrammingLanguageController(ProgrammingLanguageService programmingLanguageService) {
        this.programmingLanguageService = programmingLanguageService;
    }

    @GetMapping("/get-all")
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguageService.getAll();
    }

    @PostMapping("/add")
    public void add(@RequestBody ProgrammingLanguage programmingLanguage) throws Exception {
        programmingLanguageService.add(programmingLanguage);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable int id) {
        programmingLanguageService.delete(id);
    }

    @PutMapping("/update/{id}")
    public void update(@RequestBody ProgrammingLanguage programmingLanguage) {
        programmingLanguageService.update(programmingLanguage);
    }

    @GetMapping("/get/{id}")
    public ProgrammingLanguage getById(@PathVariable(name = "id") int id) {
        return programmingLanguageService.getById(id);
    }
}
