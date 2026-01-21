// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.async

import com.google.errorprone.annotations.MustBeClosed
import com.rails.api.core.ClientOptions
import com.rails.api.core.RequestOptions
import com.rails.api.core.http.HttpResponseFor
import com.rails.api.models.accounts.AccountCloseParams
import com.rails.api.models.accounts.AccountCloseResponse
import com.rails.api.models.accounts.AccountCreateParams
import com.rails.api.models.accounts.AccountCreateResponse
import com.rails.api.models.accounts.AccountDepositParams
import com.rails.api.models.accounts.AccountDepositResponse
import com.rails.api.models.accounts.AccountListParams
import com.rails.api.models.accounts.AccountListResponse
import com.rails.api.models.accounts.AccountRetrieveParams
import com.rails.api.models.accounts.AccountRetrieveResponse
import com.rails.api.models.accounts.AccountTransferParams
import com.rails.api.models.accounts.AccountTransferResponse
import com.rails.api.models.accounts.AccountUpdateStatusParams
import com.rails.api.models.accounts.AccountUpdateStatusResponse
import com.rails.api.models.accounts.AccountWithdrawParams
import com.rails.api.models.accounts.AccountWithdrawResponse

interface AccountServiceAsync {

    /**
     * Returns a view of this service that provides access to raw HTTP responses for each method.
     */
    fun withRawResponse(): WithRawResponse

    /**
     * Returns a view of this service with the given option modifications applied.
     *
     * The original service is not modified.
     */
    fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountServiceAsync

    /** Create account */
    suspend fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCreateResponse

    /** Retrieve account */
    suspend fun retrieve(
        id: String,
        params: AccountRetrieveParams = AccountRetrieveParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountRetrieveResponse = retrieve(params.toBuilder().id(id).build(), requestOptions)

    /** @see retrieve */
    suspend fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountRetrieveResponse

    /** @see retrieve */
    suspend fun retrieve(id: String, requestOptions: RequestOptions): AccountRetrieveResponse =
        retrieve(id, AccountRetrieveParams.none(), requestOptions)

    /** List accounts */
    suspend fun list(
        params: AccountListParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): List<AccountListResponse>

    /** Close account */
    suspend fun close(
        id: String,
        params: AccountCloseParams = AccountCloseParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCloseResponse = close(params.toBuilder().id(id).build(), requestOptions)

    /** @see close */
    suspend fun close(
        params: AccountCloseParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountCloseResponse

    /** @see close */
    suspend fun close(id: String, requestOptions: RequestOptions): AccountCloseResponse =
        close(id, AccountCloseParams.none(), requestOptions)

    /** Deposit into account */
    suspend fun deposit(
        id: String,
        params: AccountDepositParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountDepositResponse = deposit(params.toBuilder().id(id).build(), requestOptions)

    /** @see deposit */
    suspend fun deposit(
        params: AccountDepositParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountDepositResponse

    /** Transfer between accounts */
    suspend fun transfer(
        id: String,
        params: AccountTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransferResponse = transfer(params.toBuilder().id(id).build(), requestOptions)

    /** @see transfer */
    suspend fun transfer(
        params: AccountTransferParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountTransferResponse

    /** Update account status */
    suspend fun updateStatus(
        id: String,
        params: AccountUpdateStatusParams = AccountUpdateStatusParams.none(),
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountUpdateStatusResponse = updateStatus(params.toBuilder().id(id).build(), requestOptions)

    /** @see updateStatus */
    suspend fun updateStatus(
        params: AccountUpdateStatusParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountUpdateStatusResponse

    /** @see updateStatus */
    suspend fun updateStatus(
        id: String,
        requestOptions: RequestOptions,
    ): AccountUpdateStatusResponse =
        updateStatus(id, AccountUpdateStatusParams.none(), requestOptions)

    /** Withdraw from account */
    suspend fun withdraw(
        id: String,
        params: AccountWithdrawParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountWithdrawResponse = withdraw(params.toBuilder().id(id).build(), requestOptions)

    /** @see withdraw */
    suspend fun withdraw(
        params: AccountWithdrawParams,
        requestOptions: RequestOptions = RequestOptions.none(),
    ): AccountWithdrawResponse

    /**
     * A view of [AccountServiceAsync] that provides access to raw HTTP responses for each method.
     */
    interface WithRawResponse {

        /**
         * Returns a view of this service with the given option modifications applied.
         *
         * The original service is not modified.
         */
        fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccountServiceAsync.WithRawResponse

        /**
         * Returns a raw HTTP response for `post /api/v1/accounts`, but is otherwise the same as
         * [AccountServiceAsync.create].
         */
        @MustBeClosed
        suspend fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCreateResponse>

        /**
         * Returns a raw HTTP response for `get /api/v1/accounts/{id}`, but is otherwise the same as
         * [AccountServiceAsync.retrieve].
         */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            params: AccountRetrieveParams = AccountRetrieveParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountRetrieveResponse> =
            retrieve(params.toBuilder().id(id).build(), requestOptions)

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountRetrieveResponse>

        /** @see retrieve */
        @MustBeClosed
        suspend fun retrieve(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountRetrieveResponse> =
            retrieve(id, AccountRetrieveParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `get /api/v1/accounts`, but is otherwise the same as
         * [AccountServiceAsync.list].
         */
        @MustBeClosed
        suspend fun list(
            params: AccountListParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<List<AccountListResponse>>

        /**
         * Returns a raw HTTP response for `delete /api/v1/accounts/{id}`, but is otherwise the same
         * as [AccountServiceAsync.close].
         */
        @MustBeClosed
        suspend fun close(
            id: String,
            params: AccountCloseParams = AccountCloseParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCloseResponse> =
            close(params.toBuilder().id(id).build(), requestOptions)

        /** @see close */
        @MustBeClosed
        suspend fun close(
            params: AccountCloseParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountCloseResponse>

        /** @see close */
        @MustBeClosed
        suspend fun close(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountCloseResponse> =
            close(id, AccountCloseParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/accounts/{id}/deposit`, but is otherwise
         * the same as [AccountServiceAsync.deposit].
         */
        @MustBeClosed
        suspend fun deposit(
            id: String,
            params: AccountDepositParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountDepositResponse> =
            deposit(params.toBuilder().id(id).build(), requestOptions)

        /** @see deposit */
        @MustBeClosed
        suspend fun deposit(
            params: AccountDepositParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountDepositResponse>

        /**
         * Returns a raw HTTP response for `post /api/v1/accounts/{id}/transfer`, but is otherwise
         * the same as [AccountServiceAsync.transfer].
         */
        @MustBeClosed
        suspend fun transfer(
            id: String,
            params: AccountTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransferResponse> =
            transfer(params.toBuilder().id(id).build(), requestOptions)

        /** @see transfer */
        @MustBeClosed
        suspend fun transfer(
            params: AccountTransferParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountTransferResponse>

        /**
         * Returns a raw HTTP response for `patch /api/v1/accounts/{id}`, but is otherwise the same
         * as [AccountServiceAsync.updateStatus].
         */
        @MustBeClosed
        suspend fun updateStatus(
            id: String,
            params: AccountUpdateStatusParams = AccountUpdateStatusParams.none(),
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountUpdateStatusResponse> =
            updateStatus(params.toBuilder().id(id).build(), requestOptions)

        /** @see updateStatus */
        @MustBeClosed
        suspend fun updateStatus(
            params: AccountUpdateStatusParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountUpdateStatusResponse>

        /** @see updateStatus */
        @MustBeClosed
        suspend fun updateStatus(
            id: String,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountUpdateStatusResponse> =
            updateStatus(id, AccountUpdateStatusParams.none(), requestOptions)

        /**
         * Returns a raw HTTP response for `post /api/v1/accounts/{id}/withdraw`, but is otherwise
         * the same as [AccountServiceAsync.withdraw].
         */
        @MustBeClosed
        suspend fun withdraw(
            id: String,
            params: AccountWithdrawParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountWithdrawResponse> =
            withdraw(params.toBuilder().id(id).build(), requestOptions)

        /** @see withdraw */
        @MustBeClosed
        suspend fun withdraw(
            params: AccountWithdrawParams,
            requestOptions: RequestOptions = RequestOptions.none(),
        ): HttpResponseFor<AccountWithdrawResponse>
    }
}
