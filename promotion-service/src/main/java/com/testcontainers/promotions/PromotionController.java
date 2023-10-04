package com.testcontainers.promotions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/promotions")
class PromotionController {
    private final PromotionRepository repository;

    PromotionController(PromotionRepository repository) {
        this.repository = repository;
    }

    @GetMapping
    List<Promotion> all() {
        return repository.findAll();
    }
}
