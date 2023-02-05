package com.tallstech.hizir.material.controller;

import static org.springframework.web.reactive.function.server.ServerResponse.created;

import com.tallstech.hizir.material.AidMaterialCategoryCreateDto;
import com.tallstech.hizir.material.service.AidMaterialService;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;


@Component
public class AidMaterialCategoryHandler {

    private final AidMaterialService aidMaterialService;

    public AidMaterialCategoryHandler(AidMaterialService aidMaterialService){
        this.aidMaterialService = aidMaterialService;
    }

    Mono<ServerResponse> createAidMaterialCategory(ServerRequest serverRequest){
        return null;

    }
}
