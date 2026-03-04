// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.rails.api.core.ClientOptions
import com.rails.api.core.RequestOptions
import com.rails.api.core.http.HttpResponseFor
import com.rails.api.models.users.UserCreateParams
import com.rails.api.models.users.UserCreateResponse

/** Users */
interface UserServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync

    /** Create user */
    suspend fun create(
        params: UserCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): UserCreateResponse

    /** A view of [UserServiceAsync] that provides access to raw HTTP responses for each method. */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(modifier: (ClientOptions.Builder) -> Unit): UserServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/users`, but is otherwise the same as
         * [UserServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: UserCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<UserCreateResponse>
    }
}
