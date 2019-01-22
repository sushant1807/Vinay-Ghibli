package com.example.vinay_gilibili

class Film {

    var year: String? = null
    var title: String? = null
    var director: String? = null

    constructor(year: String, title: String, director: String) {
        this.year = year
        this.title = title
        this.director = director
    }
}