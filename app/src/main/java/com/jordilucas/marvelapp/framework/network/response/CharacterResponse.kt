package com.jordilucas.marvelapp.framework.network.response

import com.example.core.domain.model.Character

/**
 * Created by Jordi Lucas on 08/05/2022.
 */
data class CharacterResponse(
    val id: String,
    val name: String,
    val thumbnail: ThumbnailResponse
)

fun CharacterResponse.toCharacterModel(): Character{
    return Character(
        name = this.name,
        imageUrl = "${this.thumbnail.path}.${this.thumbnail.extension}".replace("http", "https")
    )
}
