package me.jics;

import jakarta.inject.Singleton;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Mono;

@Slf4j
@RequiredArgsConstructor
@Singleton
public class ProductServiceImpl implements ProductService {
    private final ProductMapper mapper;
    private final ProductCrudRepository productCrudRepository;

    @Override
    public Mono<ProductCreated> store(Product product) {
        return Mono.from(productCrudRepository.save(mapper.toRepository(product))).map(mapper::toDomain);
    }
}
