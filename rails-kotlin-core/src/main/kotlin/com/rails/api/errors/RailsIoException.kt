package com.rails.api.errors

class RailsIoException(message: String? = null, cause: Throwable? = null) :
    RailsException(message, cause)
