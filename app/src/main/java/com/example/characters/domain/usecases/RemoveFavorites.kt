package com.example.characters.domain.usecases

import com.example.characters.domain.model.CharacterDisplay
import com.example.characters.domain.repository.DbRepository
import javax.inject.Inject


class RemoveFavorites @Inject constructor(private val repository: DbRepository) {

    suspend operator fun invoke(character: CharacterDisplay) {
        repository.deleteItem(character)
    }
}
