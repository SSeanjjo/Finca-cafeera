package com.uniquindio.fincaCafetera.repository;

import com.uniquindio.fincaCafetera.entity.CoffeeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CoffeeTypeRepository extends JpaRepository<CoffeeType, Long> {

}
