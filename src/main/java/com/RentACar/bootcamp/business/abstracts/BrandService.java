package com.RentACar.bootcamp.business.abstracts;

import com.RentACar.bootcamp.business.requests.CreateBrandRequest;
import com.RentACar.bootcamp.business.responses.GetAllBrandsResponse;
import com.RentACar.bootcamp.entities.concretes.Brand;

import java.util.List;

public interface BrandService {
    List<GetAllBrandsResponse> getAll();
    void Add(CreateBrandRequest createBrandRequest);

}
