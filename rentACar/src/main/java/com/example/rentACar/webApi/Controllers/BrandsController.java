package com.example.rentACar.webApi.Controllers;

import com.example.rentACar.business.abstracts.IBrandService;
import com.example.rentACar.business.requests.CreateBrandRequest;
import com.example.rentACar.business.responses.GetAllBrandsResponse;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // annotation
@RequestMapping("/api/brands")
@AllArgsConstructor
public class BrandsController{
    private IBrandService _service;
    @GetMapping()
    public List<GetAllBrandsResponse> getAll(){
        return _service.getAll();
    }

    @PostMapping()
    @ResponseStatus(code= HttpStatus.CREATED)
    public void add(@RequestBody CreateBrandRequest createBrandRequest){
        this._service.add(createBrandRequest);
    }
}
