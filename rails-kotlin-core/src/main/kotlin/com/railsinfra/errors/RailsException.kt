package com.railsinfra.errors

open class RailsException(message: String? = null, cause: Throwable? = null) :
    RuntimeException(message, cause)
