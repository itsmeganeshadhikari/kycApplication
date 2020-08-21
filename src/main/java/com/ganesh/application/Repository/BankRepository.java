package com.ganesh.application.Repository;

import com.ganesh.application.Model.Bank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankRepository extends JpaRepository<Bank,Integer> {
    String findByName(String name);

//    String findAllByBank_name(String bank_name);
}
