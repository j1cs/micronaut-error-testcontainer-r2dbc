package me.jics;

import reactor.core.publisher.Mono;

public interface ProductService {
    Mono<ProductCreated> store(Product product);
}
