// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.services.async

import com.railsinfra.core.ClientOptions
import com.railsinfra.core.RequestOptions
import com.railsinfra.core.checkRequired
import com.railsinfra.core.handlers.errorBodyHandler
import com.railsinfra.core.handlers.errorHandler
import com.railsinfra.core.handlers.jsonHandler
import com.railsinfra.core.http.HttpMethod
import com.railsinfra.core.http.HttpRequest
import com.railsinfra.core.http.HttpResponse
import com.railsinfra.core.http.HttpResponse.Handler
import com.railsinfra.core.http.HttpResponseFor
import com.railsinfra.core.http.parseable
import com.railsinfra.core.prepareAsync
import com.railsinfra.models.Transaction
import com.railsinfra.models.transactions.TransactionListByAccountParams
import com.railsinfra.models.transactions.TransactionListParams
import com.railsinfra.models.transactions.TransactionListResponse
import com.railsinfra.models.transactions.TransactionRetrieveParams

/** Transactions */
class TransactionServiceAsyncImpl internal constructor(private val clientOptions: ClientOptions) :
    TransactionServiceAsync {

    private val withRawResponse: TransactionServiceAsync.WithRawResponse by lazy {
        WithRawResponseImpl(clientOptions)
    }

    override fun withRawResponse(): TransactionServiceAsync.WithRawResponse = withRawResponse

    override fun withOptions(modifier: (ClientOptions.Builder) -> Unit): TransactionServiceAsync =
        TransactionServiceAsyncImpl(clientOptions.toBuilder().apply(modifier).build())

    override suspend fun retrieve(
        params: TransactionRetrieveParams,
        requestOptions: RequestOptions,
    ): Transaction =
        // get /api/v1/transactions/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun list(
        params: TransactionListParams,
        requestOptions: RequestOptions,
    ): TransactionListResponse =
        // get /api/v1/transactions
        withRawResponse().list(params, requestOptions).parse()

    override suspend fun listByAccount(
        params: TransactionListByAccountParams,
        requestOptions: RequestOptions,
    ): List<Transaction> =
        // get /api/v1/accounts/{account_id}/transactions
        withRawResponse().listByAccount(params, requestOptions).parse()

    class WithRawResponseImpl internal constructor(private val clientOptions: ClientOptions) :
        TransactionServiceAsync.WithRawResponse {

        private val errorHandler: Handler<HttpResponse> =
            errorHandler(errorBodyHandler(clientOptions.jsonMapper))

        override fun withOptions(
            modifier: (ClientOptions.Builder) -> Unit
        ): TransactionServiceAsync.WithRawResponse =
            TransactionServiceAsyncImpl.WithRawResponseImpl(
                clientOptions.toBuilder().apply(modifier).build()
            )

        private val retrieveHandler: Handler<Transaction> =
            jsonHandler<Transaction>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<Transaction> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("id", params.id())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "transactions", params._pathParam(0))
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

        private val listHandler: Handler<TransactionListResponse> =
            jsonHandler<TransactionListResponse>(clientOptions.jsonMapper)

        override suspend fun list(
            params: TransactionListParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionListResponse> {
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "transactions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.validate()
                        }
                    }
            }
        }

        private val listByAccountHandler: Handler<List<Transaction>> =
            jsonHandler<List<Transaction>>(clientOptions.jsonMapper)

        override suspend fun listByAccount(
            params: TransactionListByAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<Transaction>> {
            // We check here instead of in the params builder because this can be specified
            // positionally or in the params class.
            checkRequired("accountId", params.accountId())
            val request =
                HttpRequest.builder()
                    .method(HttpMethod.GET)
                    .baseUrl(clientOptions.baseUrl())
                    .addPathSegments("api", "v1", "accounts", params._pathParam(0), "transactions")
                    .build()
                    .prepareAsync(clientOptions, params)
            val requestOptions = requestOptions.applyDefaults(RequestOptions.from(clientOptions))
            val response = clientOptions.httpClient.executeAsync(request, requestOptions)
            return errorHandler.handle(response).parseable {
                response
                    .use { listByAccountHandler.handle(it) }
                    .also {
                        if (requestOptions.responseValidation!!) {
                            it.forEach { it.validate() }
                        }
                    }
            }
        }
    }
}
