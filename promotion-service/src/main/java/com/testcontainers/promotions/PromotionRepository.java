package com.testcontainers.promotions;

import org.springframework.data.jpa.repository.JpaRepository;

interface PromotionRepository extends JpaRepository<Promotion, Long> {
}
