// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.rails.api.core.ClientOptions
import com.rails.api.core.RequestOptions
import com.rails.api.core.http.HttpResponseFor
import com.rails.api.models.transactions.TransactionListByAccountParams
import com.rails.api.models.transactions.TransactionListByAccountResponse
import com.rails.api.models.transactions.TransactionRetrieveParams
import com.rails.api.models.transactions.TransactionRetrieveResponse

interface TransactionServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransactionServiceAsync

    /** Retrieve transaction */
    suspend fun retrieve(
        id: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): TransactionRetrieveResponse =
        retrieve(id, TransactionRetrieveParams.none(), requestOptions)

    /** List account transactions */
    suspend fun listByAccount(
        accountId: String,
        params: TransactionListByAccountParams = TransactionListByAccountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TransactionListByAccountResponse> =
        listByAccount(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see listByAccount */
    suspend fun listByAccount(
        params: TransactionListByAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<TransactionListByAccountResponse>

    /** @see listByAccount */
    suspend fun listByAccount(
        accountId: String,
        requestOptions: RequestOptions,
    ): List<TransactionListByAccountResponse> =
        listByAccount(accountId, TransactionListByAccountParams.none(), requestOptions)

    /**
     * A view of [TransactionServiceAsync] that provides access to raw HTTP responses for each
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
        ): TransactionServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/transactions/{id}`, but is otherwise the
         * same as [TransactionServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionRetrieveResponse> =
            retrieve(id, TransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/accounts/{account_id}/transactions`, but is
         * otherwise the same as [TransactionServiceAsync.listByAccount].
         */
        @MustBeClosed
        suspend fun listByAccount(
            accountId: String,
            params: TransactionListByAccountParams = TransactionListByAccountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TransactionListByAccountResponse>> =
            listByAccount(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see listByAccount */
        @MustBeClosed
        suspend fun listByAccount(
            params: TransactionListByAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<TransactionListByAccountResponse>>

        /** @see listByAccount */
        @MustBeClosed
        suspend fun listByAccount(
            accountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TransactionListByAccountResponse>> =
            listByAccount(accountId, TransactionListByAccountParams.none(), requestOptions)
    }
}
