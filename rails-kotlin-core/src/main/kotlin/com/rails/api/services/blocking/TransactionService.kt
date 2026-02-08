// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.blocking

import com.google.errorprone.annotations.MustBeClosed
import com.rails.api.core.ClientOptions
import com.rails.api.core.RequestOptions
import com.rails.api.core.http.HttpResponseFor
import com.rails.api.models.Transaction
import com.rails.api.models.transactions.TransactionListByAccountParams
import com.rails.api.models.transactions.TransactionListParams
import com.rails.api.models.transactions.TransactionListResponse
import com.rails.api.models.transactions.TransactionRetrieveParams

interface TransactionService {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransactionService

    /** Retrieve transaction */
    fun retrieve(
        id: String,
        params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): Transaction

    /** @see retrieve */
    fun retrieve(id: String, requestOptions: RequestOptions): Transaction =
        retrieve(id, TransactionRetrieveParams.none(), requestOptions)

    /** List transactions by organization */
    fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): TransactionListResponse

    /** List account transactions */
    fun listByAccount(
        accountId: String,
        params: TransactionListByAccountParams = TransactionListByAccountParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Transaction> =
        listByAccount(params.toBuilder().accountId(accountId).build(), requestOptions)

    /** @see listByAccount */
    fun listByAccount(
        params: TransactionListByAccountParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<Transaction>

    /** @see listByAccount */
    fun listByAccount(accountId: String, requestOptions: RequestOptions): List<Transaction> =
        listByAccount(accountId, TransactionListByAccountParams.none(), requestOptions)

    /**
     * A view of [TransactionService] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransactionService.WithRawResponse

        /**
         * Returns a raw HTTP response for `get /api/v1/transactions/{id}`, but is otherwise the
         * same as [TransactionService.retrieve].
         */
        @MustBeClosed
        fun retrieve(
            id: String,
            params: TransactionRetrieveParams = TransactionRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<Transaction>

        /** @see retrieve */
        @MustBeClosed
        fun retrieve(id: String, requestOptions: RequestOptions): HttpResponseFor<Transaction> =
            retrieve(id, TransactionRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/transactions`, but is otherwise the same as
         * [TransactionService.list].
         */
        @MustBeClosed
        fun list(
            params: TransactionListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<TransactionListResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/accounts/{account_id}/transactions`, but is
         * otherwise the same as [TransactionService.listByAccount].
         */
        @MustBeClosed
        fun listByAccount(
            accountId: String,
            params: TransactionListByAccountParams = TransactionListByAccountParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Transaction>> =
            listByAccount(params.toBuilder().accountId(accountId).build(), requestOptions)

        /** @see listByAccount */
        @MustBeClosed
        fun listByAccount(
            params: TransactionListByAccountParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<Transaction>>

        /** @see listByAccount */
        @MustBeClosed
        fun listByAccount(
            accountId: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Transaction>> =
            listByAccount(accountId, TransactionListByAccountParams.none(), requestOptions)
    }
}
