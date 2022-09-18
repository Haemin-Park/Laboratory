package com.example.myapplication

import javax.inject.Inject

class Green @Inject constructor() : Color {
    override val name: String = "Green"
    override val code: String = "G"
}