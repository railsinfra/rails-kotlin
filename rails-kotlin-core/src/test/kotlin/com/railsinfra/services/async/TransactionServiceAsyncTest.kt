// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.services.async

import com.railsinfra.client.okhttp.RailsOkHttpClientAsync
import com.railsinfra.models.transactions.TransactionListByAccountParams
import com.railsinfra.models.transactions.TransactionListParams
import com.railsinfra.models.transactions.TransactionRetrieveParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transactionServiceAsync = client.transactions()

        val transaction =
            transactionServiceAsync.retrieve(
                TransactionRetrieveParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xEnvironment(TransactionRetrieveParams.XEnvironment.SANDBOX)
                    .build()
            )

        transaction.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transactionServiceAsync = client.transactions()

        val transactions =
            transactionServiceAsync.list(
                TransactionListParams.builder()
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .page(1L)
                    .perPage(1L)
                    .xEnvironment(TransactionListParams.XEnvironment.SANDBOX)
                    .build()
            )

        transactions.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun listByAccount() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transactionServiceAsync = client.transactions()

        val transactions =
            transactionServiceAsync.listByAccount(
                TransactionListByAccountParams.builder()
                    .accountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .limit(0L)
                    .xEnvironment(TransactionListByAccountParams.XEnvironment.SANDBOX)
                    .build()
            )

        transactions.forEach { it.validate() }
    }
}
