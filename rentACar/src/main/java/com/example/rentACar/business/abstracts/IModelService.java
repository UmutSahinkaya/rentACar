package com.example.rentACar.business.abstracts;

import com.example.rentACar.business.responses.GetAllModelsResponse;

import java.util.List;

public interface IModelService {
    List<GetAllModelsResponse> getAll();
    /*GetByIdModelResponse getById(int id);
    void add(CreateBrandRequest createBrandRequest);
    void update(UpdateModelRequest updateModelRequest);
    void delete(int id);*/
}
