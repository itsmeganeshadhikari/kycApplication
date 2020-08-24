package com.ganesh.application.Repository;

import com.ganesh.application.Model.Broker;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BrokerRepositry extends JpaRepository<Broker,Integer> {
}
