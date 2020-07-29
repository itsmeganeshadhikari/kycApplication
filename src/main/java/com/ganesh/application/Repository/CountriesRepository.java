package com.ganesh.application.Repository;

import com.ganesh.application.Model.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesRepository extends JpaRepository<Countries,Integer>
{

}
