package kodlama.io.devs.dataAccess.abstracts;

import kodlama.io.devs.entities.concretes.ProgrammingLanguage;

import java.util.List;

public interface ProgrammingLanguageRepository {
    List<ProgrammingLanguage> getAll();

    void add(ProgrammingLanguage programmingLanguage);

    void update(ProgrammingLanguage programmingLanguage);

    void delete(int id);

    ProgrammingLanguage getById(int id);
}
