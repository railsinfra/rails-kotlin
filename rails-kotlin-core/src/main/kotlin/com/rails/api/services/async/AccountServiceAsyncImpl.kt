// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.async

import com.rails.api.core.ClientOptions
import com.rails.api.core.RequestOptions
import com.rails.api.core.checkRequired
import com.rails.api.core.handlers.errorBodyHandler
import com.rails.api.core.handlers.errorHandler
import com.rails.api.core.handlers.jsonHandler
import com.rails.api.core.http.HttpMethod
import com.rails.api.core.http.HttpRequest
import com.rails.api.core.http.HttpResponse
import com.rails.api.core.http.HttpResponse.Handler
import com.rails.api.core.http.HttpResponseFor
import com.rails.api.core.http.json
import com.rails.api.core.http.parseable
import com.rails.api.core.prepareAsync
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

/** Accounts */
class AccountServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    AccountServiceAsync {

    private val withRawResponse: AccountServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): AccountServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): AccountServiceAsync =
        AccountServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun create(
        params: AccountCreateParams,
        requestOptions: RequestOptions,
    ): AccountCreateResponse =
        // post /api/v1/accounts
        withRawResponse().create(params, requestOptions).parse()

    override suspend fun retrieve(
        params: AccountRetrieveParams,
        requestOptions: RequestOptions,
    ): AccountRetrieveResponse =
        // get /api/v1/accounts/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: AccountListParams,
        requestOptions: RequestOptions,
    ): List<AccountListResponse> =
        // get /api/v1/accounts
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun close(
        params: AccountCloseParams,
        requestOptions: RequestOptions,
    ): AccountCloseResponse =
        // delete /api/v1/accounts/{id}
        withRawResponse().close(params, requestOptions).parse()

    override suspend fun deposit(
        params: AccountDepositParams,
        requestOptions: RequestOptions,
    ): AccountDepositResponse =
        // post /api/v1/accounts/{id}/deposit
        withRawResponse().deposit(params, requestOptions).parse()

    override suspend fun transfer(
        params: AccountTransferParams,
        requestOptions: RequestOptions,
    ): AccountTransferResponse =
        // post /api/v1/accounts/{id}/transfer
        withRawResponse().transfer(params, requestOptions).parse()

    override suspend fun updateStatus(
        params: AccountUpdateStatusParams,
        requestOptions: RequestOptions,
    ): AccountUpdateStatusResponse =
        // patch /api/v1/accounts/{id}
        withRawResponse().updateStatus(params, requestOptions).parse()

    override suspend fun withdraw(
        params: AccountWithdrawParams,
        requestOptions: RequestOptions,
    ): AccountWithdrawResponse =
        // post /api/v1/accounts/{id}/withdraw
        withRawResponse().withdraw(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        AccountServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): AccountServiceAsync.WithRawResponse =
            AccountServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val createHandler: Handler<AccountCreateResponse> =
            jsonHandler<AccountCreateResponse>(clientOptions.jsonMapper)

        override suspend fun create(
            params: AccountCreateParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountCreateResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "accounts")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { createHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val retrieveHandler: Handler<AccountRetrieveResponse> =
            jsonHandler<AccountRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: AccountRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountRetrieveResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "accounts", params._pathParam(0))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { retrieveHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listHandler: Handler<List<AccountListResponse>> =
            jsonHandler<List<AccountListResponse>>(clientOptions.jsonMapper)

        override suspend fun list(
            params: AccountListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<AccountListResponse>> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "accounts")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }

        private val closeHandler: Handler<AccountCloseResponse> =
            jsonHandler<AccountCloseResponse>(clientOptions.jsonMapper)

        override suspend fun close(
            params: AccountCloseParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountCloseResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.DELETE)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "accounts", params._pathParam(0))
                    .apply { params._body()?.let { body(json(clientOptions.jsonMapper, it)) } }
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { closeHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val depositHandler: Handler<AccountDepositResponse> =
            jsonHandler<AccountDepositResponse>(clientOptions.jsonMapper)

        override suspend fun deposit(
            params: AccountDepositParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountDepositResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "accounts", params._pathParam(0), "deposit")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { depositHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val transferHandler: Handler<AccountTransferResponse> =
            jsonHandler<AccountTransferResponse>(clientOptions.jsonMapper)

        override suspend fun transfer(
            params: AccountTransferParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountTransferResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "accounts", params._pathParam(0), "transfer")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { transferHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val updateStatusHandler: Handler<AccountUpdateStatusResponse> =
            jsonHandler<AccountUpdateStatusResponse>(clientOptions.jsonMapper)

        override suspend fun updateStatus(
            params: AccountUpdateStatusParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountUpdateStatusResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.PATCH)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "accounts", params._pathParam(0))
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { updateStatusHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val withdrawHandler: Handler<AccountWithdrawResponse> =
            jsonHandler<AccountWithdrawResponse>(clientOptions.jsonMapper)

        override suspend fun withdraw(
            params: AccountWithdrawParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<AccountWithdrawResponse> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.POST)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "accounts", params._pathParam(0), "withdraw")
                    .body(json(clientOptions.jsonMapper, params._body()))
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { withdrawHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }
    }
}
