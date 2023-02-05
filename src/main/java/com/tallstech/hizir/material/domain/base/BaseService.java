package com.tallstech.hizir.material.domain.base;

import org.springframework.data.domain.Page;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


/**
 * M : Model/Entity object
 * D : Dto object of Model
 * C: Create Dto object
 * U: Update/Patch dto object
 * **/
public interface BaseService<M, D, C, U> {
    Mono<D> getById(String id);

    Flux<D> getAll();

    Mono<Page<D>> getAllPaginated(int page, int size, String[] sortBy);

    Mono<D> create(C c);

    Mono<D> patch(U u);

    Mono<Void> delete(String id);

}
