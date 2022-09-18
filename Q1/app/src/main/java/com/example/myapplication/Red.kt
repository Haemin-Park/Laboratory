package com.example.myapplication

import javax.inject.Inject

class Red @Inject constructor() : Color {
    override val name: String = "Red"
    override val code: String = "R"
}