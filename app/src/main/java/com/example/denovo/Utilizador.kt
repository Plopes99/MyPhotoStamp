package com.example.denovo

class Utilizador {
    var id: Int = 0
    var username : String = ""
    var password : String = ""
    constructor(username:String, password:String)

    { this.username = username
        this.password = password }

    constructor() {}
}