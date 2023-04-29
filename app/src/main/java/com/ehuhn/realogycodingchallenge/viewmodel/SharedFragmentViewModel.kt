package com.ehuhn.realogycodingchallenge.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.ehuhn.realogycodingchallenge.model.Character
import com.ehuhn.realogycodingchallenge.model.RelatedTopic
import com.ehuhn.realogycodingchallenge.repository.CharacterFetcher

class SharedFragmentViewModel : ViewModel() {
    val characterListLiveData: LiveData<List<RelatedTopic>>
    init {
        characterListLiveData = CharacterFetcher().fetchContents()
    }

    fun getSelectedCharacter(position: Int): RelatedTopic {
        return characterListLiveData.value!![position]
    }
}