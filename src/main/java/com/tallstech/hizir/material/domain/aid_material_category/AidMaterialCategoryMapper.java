package com.tallstech.hizir.material.domain.aid_material_category;

import com.tallstech.hizir.material.AidMaterialCategoryCreateDto;
import com.tallstech.hizir.material.AidMaterialCategoryDto;
import com.tallstech.hizir.material.AidMaterialCategoryUpdateDto;
import com.tallstech.hizir.material.domain.base.BaseMapper;
import org.mapstruct.Mapper;


@Mapper(componentModel = "spring")
public interface AidMaterialCategoryMapper extends BaseMapper<AidMaterialCategory, AidMaterialCategoryDto, AidMaterialCategoryCreateDto, AidMaterialCategoryUpdateDto> {
}
