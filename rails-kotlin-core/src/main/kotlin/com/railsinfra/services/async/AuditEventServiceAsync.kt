// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.railsinfra.core.ClientOptions
import com.railsinfra.core.RequestOptions
import com.railsinfra.core.http.HttpResponseFor
import com.railsinfra.models.auditevents.AuditEventListParams
import com.railsinfra.models.auditevents.AuditEventListResponse

/** Audit events */
interface AuditEventServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AuditEventServiceAsync

    /** List audit events */
    suspend fun list(
        params: AuditEventListParams = AuditEventListParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AuditEventListResponse

    /** @see list */
    suspend fun list(requestOptions: RequestOptions): AuditEventListResponse =
        list(AuditEventListParams.none(), requestOptions)

    /**
     * A view of [AuditEventServiceAsync] that provides access to raw HTTP responses for each
     * method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AuditEventServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/audit/events`, but is otherwise the same as
         * [AuditEventServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AuditEventListParams = AuditEventListParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AuditEventListResponse>

        /** @see list */
        @MustBeClosed
        suspend fun list(requestOptions: RequestOptions): HttpResponseFor<AuditEventListResponse> =
            list(AuditEventListParams.none(), requestOptions)
    }
}
