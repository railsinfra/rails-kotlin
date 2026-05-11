package com.railsinfra.errors

class RailsIoException(message: String? = null, cause: Throwable? = null) :
    RailsException(message, cause)
