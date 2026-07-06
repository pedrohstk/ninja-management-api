package com.pedrostucky.ninjas.ninja_management_api.Missoes.repository;

import com.pedrostucky.ninjas.ninja_management_api.Missoes.model.MissoesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MissoesRepository extends JpaRepository<MissoesModel, Long> {

}
