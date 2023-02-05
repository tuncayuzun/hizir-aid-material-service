package com.tallstech.hizir.material.domain.aid_material_category;

import com.tallstech.hizir.material.AidMaterialCategoryCreateDto;
import com.tallstech.hizir.material.AidMaterialCategoryDto;
import com.tallstech.hizir.material.AidMaterialUpdateDto;
import com.tallstech.hizir.material.domain.base.BaseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
@Slf4j
@Transactional
public class AidMaterialCategoryService implements BaseService<AidMaterialCategory,AidMaterialCategoryDto, AidMaterialCategoryCreateDto, AidMaterialUpdateDto> {
    private final AidMaterialCategoryMapper aidMaterialCategoryMapper;
    private final AidMaterialCategoryRepository aidMaterialCategoryRepository;

    public AidMaterialCategoryService(AidMaterialCategoryMapper aidMaterialCategoryMapper, AidMaterialCategoryRepository aidMaterialCategoryRepository){
        this.aidMaterialCategoryMapper = aidMaterialCategoryMapper;
        this.aidMaterialCategoryRepository = aidMaterialCategoryRepository;
    }

    @Override
    public Mono<AidMaterialCategoryDto> getById(String id) {
        return null;
    }

    @Override
    public Flux<AidMaterialCategoryDto> getAll() {
        return null;
    }

    @Override
    public Mono<Page<AidMaterialCategoryDto>> getAllPaginated(int page, int size, String[] sortBy) {
        return null;
    }

    @Override
    public Mono<AidMaterialCategoryDto> create(AidMaterialCategoryCreateDto aidMaterialCategoryCreateDto) {
        var aidMaterialCategory = aidMaterialCategoryMapper.toDao(aidMaterialCategoryCreateDto);
        return this.aidMaterialCategoryRepository
                .save(aidMaterialCategory)
                .map(savedItem-> aidMaterialCategoryMapper.toDto(savedItem));
    }

    @Override
    public Mono<AidMaterialCategoryDto> patch(AidMaterialUpdateDto aidMaterialUpdateDto) {
        return null;
    }

    @Override
    public Mono<Void> delete(String id) {
        return null;
    }


}
