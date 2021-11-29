package com.example.jetpacknavigation.movies

class MainRepository constructor(private val retrofitService: RetrofitService) {
    fun getAllMovies()=retrofitService.getAllMovies()
}