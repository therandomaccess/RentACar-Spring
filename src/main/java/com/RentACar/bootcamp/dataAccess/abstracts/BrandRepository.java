package com.RentACar.bootcamp.dataAccess.abstracts;

import com.RentACar.bootcamp.entities.concretes.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Integer> {


}
