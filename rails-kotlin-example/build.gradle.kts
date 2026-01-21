plugins {
    id("rails.kotlin")
    application
}

dependencies {
    implementation(project(":rails-kotlin-core"))
    implementation(project(":rails-kotlin-client-okhttp"))
}

application {
    // Use `./gradlew :rails-kotlin-example:run` to run `Main`
    // Use `./gradlew :rails-kotlin-example:run -Pexample=Something` to run `SomethingExample`
    mainClass = "com.rails.api.example.${
        if (project.hasProperty("example"))
            "${project.property("example")}ExampleKt"
        else
            "MainKt"
    }"
}
