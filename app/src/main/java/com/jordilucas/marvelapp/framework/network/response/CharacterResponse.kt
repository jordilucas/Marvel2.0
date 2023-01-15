package com.jordilucas.marvelapp.framework.network.response

import com.example.core.domain.model.Character
import com.google.gson.annotations.SerializedName

/**
 * Created by Jordi Lucas on 08/05/2022.
 */
data class CharacterResponse(
    @SerializedName("id")
    val id: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("thumbnail")
    val thumbnail: ThumbnailResponse
)

fun CharacterResponse.toCharacterModel(): Character{
    return Character(
        name = this.name,
        imageUrl = "${this.thumbnail.path}.${this.thumbnail.extension}".replace("http", "https")
    )
}
