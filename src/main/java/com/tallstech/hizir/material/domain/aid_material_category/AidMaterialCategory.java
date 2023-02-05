package com.tallstech.hizir.material.domain.aid_material_category;

import java.time.LocalDateTime;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.annotation.Version;
import org.springframework.data.relational.core.mapping.Table;


@Table("aid_material_categories")
public record AidMaterialCategory(
        @Id
        String id,
        @CreatedDate
        LocalDateTime createdDate,
        @LastModifiedDate
        LocalDateTime lastModifiedDate,
        String categoryName,
        boolean isActive,
        @Version
        Long version
) {
}
