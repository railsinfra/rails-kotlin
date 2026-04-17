package com.rails.api.example

import com.rails.api.client.okhttp.RailsOkHttpClient

/**
 * Minimal entrypoint for `./gradlew :rails-kotlin-example:run`.
 *
 * Set `RAILS_API_KEY` and optionally `RAILS_BASE_URL` in the environment (see SDK `ClientOptions`).
 */
fun main() {
    if (System.getenv("RAILS_API_KEY").isNullOrBlank()) {
        println("Set RAILS_API_KEY (and optionally RAILS_BASE_URL), then re-run.")
        return
    }
    val client = RailsOkHttpClient.fromEnv()
    println("Rails Kotlin SDK client ready (${client.javaClass.simpleName}).")
    println("Extend this example to call accounts(), users(), transactions(), etc.")
}
