package com.jordilucas.marvelapp.framework.network.response

/**
 * Created by Jordi Lucas on 08/05/2022.
 */
data class DataContainerResponse(
    val offset: Int,
    val total: Int,
    val results: List<CharacterResponse>
)
