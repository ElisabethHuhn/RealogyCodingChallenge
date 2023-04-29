package com.ehuhn.realogycodingchallenge.networkapi

import retrofit2.Call
import retrofit2.http.GET

private const val CHARACTER_ENDPOINT_BASE = "/"
private const val SIMPSONS_CHARACTER_URL = "?q=the+simpsons+characters&format=json"
private const val WIRE_CHARACTER_URL = "?q=the+wire+characters&format=json"


interface CharacterApi {
    //The GET activates the Apple search
    @GET(SIMPSONS_CHARACTER_URL)
    //returns a Call object that represents a single web request
    //  the Call itself can be executed
    //  deserialize the response to the call into a String
    fun fetchCharacters (): Call<ApiResponse>

}