package com.pedrostucky.ninjas.ninja_management_api.Ninjas.repository;

import com.pedrostucky.ninjas.ninja_management_api.Ninjas.model.NinjaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {

}
