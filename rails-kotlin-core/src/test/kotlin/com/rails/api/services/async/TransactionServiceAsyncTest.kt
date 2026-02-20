// File generated from our OpenAPI spec by Stainless.

package com.rails.api.services.async

import com.rails.api.client.okhttp.RailsOkHttpClientAsync
import com.rails.api.models.transactions.TransactionListByAccountParams
import com.rails.api.models.transactions.TransactionListParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class TransactionServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val transactionServiceAsync = client.transactions()

        val transaction = transactionServiceAsync.retrieve("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")

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
                    .build()
            )

        transactions.forEach { it.validate() }
    }
}
