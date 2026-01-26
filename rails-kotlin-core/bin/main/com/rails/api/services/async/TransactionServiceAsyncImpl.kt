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
import com.rails.api.core.http.parseable
import com.rails.api.core.prepareAsync
import com.rails.api.models.transactions.TransactionListByAccountParams
import com.rails.api.models.transactions.TransactionListByAccountResponse
import com.rails.api.models.transactions.TransactionRetrieveParams
import com.rails.api.models.transactions.TransactionRetrieveResponse

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
    ): TransactionRetrieveResponse =
        // get /api/v1/transactions/{id}
        withRawResponse().retrieve(params, requestOptions).parse()

    override suspend fun listByAccount(
        params: TransactionListByAccountParams,
        requestOptions: RequestOptions,
    ): List<TransactionListByAccountResponse> =
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

        private val retrieveHandler: Handler<TransactionRetrieveResponse> =
            jsonHandler<TransactionRetrieveResponse>(clientOptions.jsonMapper)

        override suspend fun retrieve(
            params: TransactionRetrieveParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<TransactionRetrieveResponse> {
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

        private val listByAccountHandler: Handler<List<TransactionListByAccountResponse>> =
            jsonHandler<List<TransactionListByAccountResponse>>(clientOptions.jsonMapper)

        override suspend fun listByAccount(
            params: TransactionListByAccountParams,
            requestOptions: RequestOptions,
        ): HttpResponseFor<List<TransactionListByAccountResponse>> {
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
