package com.ganesh.application.Repository;

import com.ganesh.application.Model.Province;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ProvinceRepository extends JpaRepository<Province,Integer> {

}
