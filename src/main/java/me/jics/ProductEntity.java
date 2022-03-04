package me.jics;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@MappedEntity
@Data
@ToString
@Builder
public class ProductEntity {
    @GeneratedValue
    @Id
    private Long id;
    private String sku;
}
