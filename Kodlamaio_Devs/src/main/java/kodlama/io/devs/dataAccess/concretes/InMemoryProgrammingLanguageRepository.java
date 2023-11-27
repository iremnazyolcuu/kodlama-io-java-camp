package kodlama.io.devs.dataAccess.concretes;

import kodlama.io.devs.dataAccess.abstracts.ProgrammingLanguageRepository;
import kodlama.io.devs.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class InMemoryProgrammingLanguageRepository implements ProgrammingLanguageRepository {

    List<ProgrammingLanguage> programmingLanguages;

    public InMemoryProgrammingLanguageRepository() {
        programmingLanguages = new ArrayList<ProgrammingLanguage>();
        programmingLanguages.add(new ProgrammingLanguage(1, "Java"));
        programmingLanguages.add(new ProgrammingLanguage(2, "Javascript"));
        programmingLanguages.add(new ProgrammingLanguage(3, "React"));
        programmingLanguages.add(new ProgrammingLanguage(4, "Node.js"));
        programmingLanguages.add(new ProgrammingLanguage(5, "Python"));
        programmingLanguages.add(new ProgrammingLanguage(6, "Swift"));
        programmingLanguages.add(new ProgrammingLanguage(7, "Php"));
        programmingLanguages.add(new ProgrammingLanguage(8, "C#"));
    }

    @Override
    public List<ProgrammingLanguage> getAll() {
        return programmingLanguages;
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        programmingLanguages.add(programmingLanguage);

    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        ProgrammingLanguage currentProgrammingLanguage = getById(programmingLanguage.getId());
        if (currentProgrammingLanguage != null) {
            currentProgrammingLanguage.setName(programmingLanguage.getName());
        }
    }

    @Override
    public void delete(int id) {
        ProgrammingLanguage toRemoveProgrammingLanguage = getById(id);
        if (toRemoveProgrammingLanguage != null) {
            programmingLanguages.remove(toRemoveProgrammingLanguage);
        }
    }

    @Override
    public ProgrammingLanguage getById(int id) {
        for (ProgrammingLanguage programmingLanguage : programmingLanguages) {
            if (programmingLanguage.getId() == id) {
                return programmingLanguage;
            }
        }
        return null;
    }
}
