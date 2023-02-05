package com.tallstech.hizir.material.service;

import com.tallstech.hizir.material.AidMaterialCategoryCreateDto;
import com.tallstech.hizir.material.domain.aid_material_category.AidMaterialCategoryMapper;
import com.tallstech.hizir.material.domain.aid_material_category.AidMaterialCategory;
import com.tallstech.hizir.material.domain.aid_material_category.AidMaterialCategoryRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Mono;


@Service
@Slf4j
@Transactional
public class AidMaterialService {

    private final AidMaterialCategoryMapper aidMaterialCategoryMapper;
    private final AidMaterialCategoryRepository aidMaterialCategoryRepository;

    public AidMaterialService(AidMaterialCategoryMapper aidMaterialCategoryMapper, AidMaterialCategoryRepository aidMaterialRepository) {
        this.aidMaterialCategoryRepository = aidMaterialRepository;
        this.aidMaterialCategoryMapper = aidMaterialCategoryMapper;
    }

    public Mono<Page<AidMaterialCategory>> getMaterialCategories(PageRequest pageRequest) {
        return this.aidMaterialCategoryRepository
                .findBy(pageRequest.withSort(Sort.by("categoryName").descending()))
                .collectList()
                .zipWith(this.aidMaterialCategoryRepository.count())
                .map(item -> new PageImpl<>(item.getT1(), pageRequest, item.getT2()));

    }
}
