package com.ganesh.application.Repository;

import com.ganesh.application.Model.BankName;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BankNameRepository extends JpaRepository<BankName,Integer> {
}
