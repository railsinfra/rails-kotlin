package com.rails.api.errors

class RailsInvalidDataException(message: String? = null, cause: Throwable? = null) :
    RailsException(message, cause)
