package tech.blur.redline.core.model

class User(
    val id: String,
    val login: String,
    val name: String,
    val password: String,
    val preferences: ArrayList<String>
)