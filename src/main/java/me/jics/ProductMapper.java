package me.jics;

import org.mapstruct.Mapper;

@Mapper(componentModel = "jsr330")
public interface ProductMapper {

    ProductEntity toRepository(Product product);

    ProductCreated toDomain(ProductEntity product);
}
