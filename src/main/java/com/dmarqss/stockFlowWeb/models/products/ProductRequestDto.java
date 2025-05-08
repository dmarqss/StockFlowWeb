package com.dmarqss.stockFlowWeb.models.products;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;

public record ProductRequestDto(
        @NotNull
        Long ean,

        @NotBlank
        String name,

        @Min(0)
        Double price,

        @Min(0)
        int amount,

        @NotBlank
        String type
) {
}
