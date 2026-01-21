// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.async

import com.rails.api.TestServerExtension
import com.rails.api.client.okhttp.RailsOkHttpClientAsync
import com.rails.api.models.pet.Pet
import com.rails.api.models.pet.PetFindByStatusParams
import com.rails.api.models.pet.PetFindByTagsParams
import com.rails.api.models.pet.PetUpdateWithFormDataParams
import com.rails.api.models.pet.PetUploadImageParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.extension.ExtendWith

@ExtendWith(TestServerExtension::class)
internal class PetServiceAsyncTest {

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun create() {
        val client =
            RailsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petServiceAsync = client.pet()

        val pet =
            petServiceAsync.create(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(Pet.Category.builder().id(1L).name("Dogs").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(0L).name("name").build())
                    .build()
            )

        pet.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun retrieve() {
        val client =
            RailsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petServiceAsync = client.pet()

        val pet = petServiceAsync.retrieve(0L)

        pet.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun update() {
        val client =
            RailsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petServiceAsync = client.pet()

        val pet =
            petServiceAsync.update(
                Pet.builder()
                    .name("doggie")
                    .addPhotoUrl("string")
                    .id(10L)
                    .category(Pet.Category.builder().id(1L).name("Dogs").build())
                    .status(Pet.Status.AVAILABLE)
                    .addTag(Pet.Tag.builder().id(0L).name("name").build())
                    .build()
            )

        pet.validate()
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun delete() {
        val client =
            RailsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petServiceAsync = client.pet()

        petServiceAsync.delete(0L)
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun findByStatus() {
        val client =
            RailsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petServiceAsync = client.pet()

        val pets =
            petServiceAsync.findByStatus(
                PetFindByStatusParams.builder()
                    .status(PetFindByStatusParams.Status.AVAILABLE)
                    .build()
            )

        pets.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun findByTags() {
        val client =
            RailsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petServiceAsync = client.pet()

        val pets =
            petServiceAsync.findByTags(PetFindByTagsParams.builder().addTag("string").build())

        pets.forEach { it.validate() }
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun updateWithFormData() {
        val client =
            RailsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petServiceAsync = client.pet()

        petServiceAsync.updateWithFormData(
            PetUpdateWithFormDataParams.builder().petId(0L).name("name").status("status").build()
        )
    }

    @Disabled("Prism tests are disabled")
    @Test
    suspend fun uploadImage() {
        val client =
            RailsOkHttpClientAsync.builder()
                .baseUrl(TestServerExtension.BASE_URL)
                .apiKey("My API Key")
                .build()
        val petServiceAsync = client.pet()

        val response =
            petServiceAsync.uploadImage(
                PetUploadImageParams.builder()
                    .petId(0L)
                    .additionalMetadata("additionalMetadata")
                    .body("some content")
                    .build()
            )

        response.validate()
    }
}
