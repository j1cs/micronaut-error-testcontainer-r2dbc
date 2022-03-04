package me.jics

import io.micronaut.test.extensions.spock.annotation.MicronautTest
import jakarta.inject.Inject
import reactor.test.StepVerifier
import spock.lang.Shared
import spock.lang.Specification

@MicronautTest
class ProductServiceSpec extends Specification {
    @Inject
    ProductService productService

    @Shared
    String sku = "1234565"

    def "Store"() {
        given: "A product"
        def product = Product.builder()
                .sku(sku)
                .build()
        when: "The product is save"
        def productCreated = productService.store(product)
        then: "Product attributes has to ve the same of the input values"
        StepVerifier.create(productCreated)
                .assertNext(response -> {
                    response.sku == sku
                })
                .verifyComplete()
    }
}
