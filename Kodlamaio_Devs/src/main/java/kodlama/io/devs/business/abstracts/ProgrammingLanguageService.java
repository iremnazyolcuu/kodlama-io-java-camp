package kodlama.io.devs.business.abstracts;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageService {
    List<ProgrammingLanguage> getAll();

    void add(ProgrammingLanguage programmingLanguage) throws Exception;

    void update(ProgrammingLanguage programmingLanguage);

    void delete(int id);

    ProgrammingLanguage getById(int id);
}
