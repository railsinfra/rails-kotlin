// File generated from our OpenAPI spec by Stainless.

package com.railsinfra.services.async

import com.railsinfra.client.okhttp.RailsOkHttpClientAsync
import com.railsinfra.models.accounts.AccountCloseParams
import com.railsinfra.models.accounts.AccountCreateParams
import com.railsinfra.models.accounts.AccountDepositParams
import com.railsinfra.models.accounts.AccountListParams
import com.railsinfra.models.accounts.AccountRetrieveParams
import com.railsinfra.models.accounts.AccountTransferParams
import com.railsinfra.models.accounts.AccountUpdateStatusParams
import com.railsinfra.models.accounts.AccountWithdrawParams
import org.junit.jupiter.api.Disabled
import org.junit.jupiter.api.Test

internal class AccountServiceAsyncTest {

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun create() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val account =
            accountServiceAsync.create(
                AccountCreateParams.builder()
                    .xEnvironment(AccountCreateParams.XEnvironment.SANDBOX)
                    .accountType(AccountCreateParams.AccountType.CHECKING)
                    .currency("SEW")
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .environment("environment")
                    .organizationId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .build()
            )

        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun retrieve() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val account =
            accountServiceAsync.retrieve(
                AccountRetrieveParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xEnvironment(AccountRetrieveParams.XEnvironment.SANDBOX)
                    .build()
            )

        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun list() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val accounts =
            accountServiceAsync.list(
                AccountListParams.builder()
                    .userId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xEnvironment(AccountListParams.XEnvironment.SANDBOX)
                    .build()
            )

        accounts.forEach { it.validate() }
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun close() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val account =
            accountServiceAsync.close(
                AccountCloseParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xEnvironment(AccountCloseParams.XEnvironment.SANDBOX)
                    .build()
            )

        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun deposit() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val response =
            accountServiceAsync.deposit(
                AccountDepositParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xEnvironment(AccountDepositParams.XEnvironment.SANDBOX)
                    .amount("amount")
                    .description("description")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun transfer() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val response =
            accountServiceAsync.transfer(
                AccountTransferParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xEnvironment(AccountTransferParams.XEnvironment.SANDBOX)
                    .amount("amount")
                    .toAccountId("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .description("description")
                    .build()
            )

        response.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun updateStatus() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val account =
            accountServiceAsync.updateStatus(
                AccountUpdateStatusParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xEnvironment(AccountUpdateStatusParams.XEnvironment.SANDBOX)
                    .status(AccountUpdateStatusParams.Status.ACTIVE)
                    .build()
            )

        account.validate()
    }

    @Disabled("Mock server tests are disabled")
    @Test
    suspend fun withdraw() {
        val client = RailsOkHttpClientAsync.builder().apiKey("My API Key").build()
        val accountServiceAsync = client.accounts()

        val response =
            accountServiceAsync.withdraw(
                AccountWithdrawParams.builder()
                    .id("182bd5e5-6e1a-4fe4-a799-aa6d9a6ab26e")
                    .xEnvironment(AccountWithdrawParams.XEnvironment.SANDBOX)
                    .amount("amount")
                    .description("description")
                    .build()
            )

        response.validate()
    }
}
