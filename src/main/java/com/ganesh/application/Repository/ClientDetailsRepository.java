package com.ganesh.application.Repository;

import com.ganesh.application.Model.ClientDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;


@Repository
public interface ClientDetailsRepository extends JpaRepository<ClientDetails,Integer> {

//    Optional<ClientDetails> findBank_name(String bank_name);
//    Optional<ClientDetails> findById(Integer id);

    @Query("SELECT t FROM ClientDetails t WHERE t.bank_name ='Nepal Bank Ltd.' OR t.bank_name='Rastriya Banijya Bank Ltd.'")
    List<ClientDetails> findTopByOrderByBank_nameDesc();


    @Query("SELECT  t FROM ClientDetails t WHERE t.id=:id AND t.bank_name=:name")
    Optional<ClientDetails> findTopByOrderByBank_nameAndIdDesc(Integer id,String name);


    List<ClientDetails> findTopByOrderByIdDesc();

    @Query("SELECT t FROM ClientDetails t WHERE t.broker_name ='Siprabi' OR t.broker_name='Nalta'")
    List<ClientDetails> findTopByOrderByBroker_nameDesc();

    @Query("SELECT  t FROM ClientDetails t WHERE t.broker_name=:broker_name AND t.id=:id")
    Optional<ClientDetails> findTopByOrderByBroker_nameAndIdDesc(Integer id,String broker_name);




}
