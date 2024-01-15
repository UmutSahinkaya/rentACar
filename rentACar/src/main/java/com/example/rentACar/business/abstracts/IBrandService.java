package com.example.rentACar.business.abstracts;

import com.example.rentACar.business.requests.CreateBrandRequest;
import com.example.rentACar.business.responses.GetAllBrandsResponse;

import java.util.List;

public interface IBrandService {
    List<GetAllBrandsResponse> getAll();
    void add(CreateBrandRequest createBrandRequest);
}
