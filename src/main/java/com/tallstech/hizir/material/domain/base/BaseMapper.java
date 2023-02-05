package com.tallstech.hizir.material.domain.base;

import java.util.List;

import org.mapstruct.BeanMapping;
import org.mapstruct.InheritConfiguration;
import org.mapstruct.InheritInverseConfiguration;
import org.mapstruct.MappingTarget;
import org.mapstruct.NullValuePropertyMappingStrategy;

/**
 * M : Model/Entity object
 * D : Dto object of Model
 * C: Create Dto object
 * U: Update/Patch dto object
 * **/
public interface BaseMapper<M, D, C, U>{

    D toDto(M d);
    @InheritInverseConfiguration
    M toDao(C c);

    @InheritConfiguration
    List<D> toDtoList(List<M> sourceList);

    @InheritConfiguration
    List<M> toDaoList(List<D> targetList);

    @BeanMapping(nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
    void toDaoForPatch(U u, @MappingTarget M d);

}