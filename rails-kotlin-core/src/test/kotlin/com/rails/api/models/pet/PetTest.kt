// File generated from our OpenAPI spec by Stainless.

package com.rails.api.models.pet

import com.fasterxml.jackson.module.kotlin.jacksonTypeRef
import com.rails.api.core.jsonMapper
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class PetTest {

    @Test
    fun create() {
        val pet =
            Pet.builder()
                .name("doggie")
                .addPhotoUrl("string")
                .id(10L)
                .category(Pet.Category.builder().id(1L).name("Dogs").build())
                .status(Pet.Status.AVAILABLE)
                .addTag(Pet.Tag.builder().id(0L).name("name").build())
                .build()

        assertThat(pet.name()).isEqualTo("doggie")
        assertThat(pet.photoUrls()).containsExactly("string")
        assertThat(pet.id()).isEqualTo(10L)
        assertThat(pet.category()).isEqualTo(Pet.Category.builder().id(1L).name("Dogs").build())
        assertThat(pet.status()).isEqualTo(Pet.Status.AVAILABLE)
        assertThat(pet.tags()).containsExactly(Pet.Tag.builder().id(0L).name("name").build())
    }

    @Test
    fun roundtrip() {
        val jsonMapper = jsonMapper()
        val pet =
            Pet.builder()
                .name("doggie")
                .addPhotoUrl("string")
                .id(10L)
                .category(Pet.Category.builder().id(1L).name("Dogs").build())
                .status(Pet.Status.AVAILABLE)
                .addTag(Pet.Tag.builder().id(0L).name("name").build())
                .build()

        val roundtrippedPet =
            jsonMapper.readValue(jsonMapper.writeValueAsString(pet), jacksonTypeRef<Pet>())

        assertThat(roundtrippedPet).isEqualTo(pet)
    }
}
