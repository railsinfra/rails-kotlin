// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.async

import com.rails.api.client.okhttp.RailsOkHttpClientAsync
import com.rails.api.models.users.UserCreateParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class UserServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val userServiceAsync = client.users()

        val user =
            userServiceAsync.create(
                UserCreateParams.builder()
                    .xEnvironment(UserCreateParams.XEnvironment.SANDBOX)
                    .email("dev@stainless.com")
                    .firstName("first_name")
                    .lastName("last_name")
                    .password("password")
                    .build()
            )

        user.validate()
    }
}
