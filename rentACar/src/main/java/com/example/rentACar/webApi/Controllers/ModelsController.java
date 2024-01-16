package com.example.rentACar.webApi.Controllers;

import com.example.rentACar.business.abstracts.IModelService;
import com.example.rentACar.business.responses.GetAllModelsResponse;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/models")
@AllArgsConstructor
public class ModelsController {
    private IModelService _service;

    @GetMapping
    public List<GetAllModelsResponse> getAll(){
        return _service.getAll();
    }
}
