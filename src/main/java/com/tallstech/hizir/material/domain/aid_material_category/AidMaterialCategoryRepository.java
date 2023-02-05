package com.tallstech.hizir.material.domain.aid_material_category;

import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;


@Repository
public interface AidMaterialCategoryRepository extends ReactiveCrudRepository<AidMaterialCategory, String> {
    Flux<AidMaterialCategory> findBy(Pageable pageable);
}
