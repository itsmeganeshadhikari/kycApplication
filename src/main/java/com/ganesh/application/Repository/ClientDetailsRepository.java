package com.ganesh.application.Repository;

import com.ganesh.application.Model.ClientDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface ClientDetailsRepository extends JpaRepository<ClientDetails,Integer> {

    List<ClientDetails> findTopByOrderByIdDesc();
}
