package com.ehuhn.realogycodingchallenge.networkapi

import com.ehuhn.realogycodingchallenge.model.Character
import com.ehuhn.realogycodingchallenge.model.RelatedTopic
import com.google.gson.annotations.SerializedName

class ApiResponse {
    @SerializedName("results")
    lateinit var characterHeader: List<Character>
    lateinit var characterList: List<RelatedTopic>
}