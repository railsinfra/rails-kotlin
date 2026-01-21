package com.rails.api.errors

open class RailsException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
