package com.RentACar.bootcamp.business.concretes;

import com.RentACar.bootcamp.business.abstracts.BrandService;
import com.RentACar.bootcamp.business.requests.CreateBrandRequest;
import com.RentACar.bootcamp.business.responses.GetAllBrandsResponse;
import com.RentACar.bootcamp.dataAccess.abstracts.BrandRepository;
import com.RentACar.bootcamp.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BrandManager implements BrandService {
    private BrandRepository brandRepository;

    @Autowired
    public BrandManager(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;

    }

    @Override
    public List<GetAllBrandsResponse> getAll() {
        List<Brand> brands = brandRepository.findAll();
        List<GetAllBrandsResponse> responseList = new ArrayList<>();
        for (Brand brand : brands) {
            GetAllBrandsResponse responseItem = new GetAllBrandsResponse();
            responseItem.setId(brand.getId());
            responseItem.setName(brand.getName());
            responseList.add(responseItem);
        }
        return responseList;
    }

    @Override
    public void Add(CreateBrandRequest createBrandRequest) {
        Brand brand = new Brand();
        brand.setName(createBrandRequest.getName());
        brandRepository.save(brand);
    }
}
