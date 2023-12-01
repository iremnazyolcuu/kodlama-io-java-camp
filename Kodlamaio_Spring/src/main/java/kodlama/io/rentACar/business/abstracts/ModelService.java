package kodlama.io.rentACar.business.abstracts;

import kodlama.io.rentACar.business.dto.requests.CreateModelRequest;
import kodlama.io.rentACar.business.dto.responses.GetAllModelsResponse;

import java.util.List;

public interface ModelService {
    List<GetAllModelsResponse> getAll();

    void add(CreateModelRequest createModelRequest);
}
