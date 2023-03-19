package com.simtop.bragdoc

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform