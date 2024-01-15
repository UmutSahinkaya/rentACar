package com.example.rentACar.business.concretes;

import com.example.rentACar.business.abstracts.IBrandService;
import com.example.rentACar.business.requests.CreateBrandRequest;
import com.example.rentACar.business.responses.GetAllBrandsResponse;
import com.example.rentACar.dataAccess.abstracts.IBrandRepository;
import com.example.rentACar.entities.concretes.Brand;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BrandManager implements IBrandService {
    private IBrandRepository _brandRepository;

    @Override
    public List<GetAllBrandsResponse> getAll(){
        List<Brand> brands=_brandRepository.findAll();
        List<GetAllBrandsResponse> brandsResponse=new ArrayList<GetAllBrandsResponse>();

        for (Brand brand:brands){
            GetAllBrandsResponse responseItem=new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());

            brandsResponse.add(responseItem);
        }

        return brandsResponse;
    }

    @Override
    public void add(CreateBrandRequest createBrandRequest) {
        Brand brand =new Brand();
        brand.setName(createBrandRequest.getName());
        this._brandRepository.save(brand);
    }

}
