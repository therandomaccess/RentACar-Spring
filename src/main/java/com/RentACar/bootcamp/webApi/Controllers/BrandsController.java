package com.RentACar.bootcamp.webApi.Controllers;

import com.RentACar.bootcamp.business.abstracts.BrandService;
import com.RentACar.bootcamp.business.requests.CreateBrandRequest;
import com.RentACar.bootcamp.business.responses.GetAllBrandsResponse;
import com.RentACar.bootcamp.entities.concretes.Brand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/brands")
public class BrandsController {
    private BrandService brandService;

    @Autowired
    BrandsController(BrandService brandService) {
        this.brandService = brandService;

    }

    @GetMapping("/getAll")
    public List<GetAllBrandsResponse> GetAll() {
        return brandService.getAll();


    }

    @PostMapping("/add")
    public void Add(@RequestBody CreateBrandRequest createBrandRequest) {
    brandService.Add(createBrandRequest);
    }


}
