package com.jordilucas.marvelapp.framework.network.response

import com.google.gson.annotations.SerializedName

/**
 * Created by Jordi Lucas on 08/05/2022.
 */
data class DataContainerResponse(
    @SerializedName("offset")
    val offset: Int,
    @SerializedName("total")
    val total: Int,
    @SerializedName("results")
    val results: List<CharacterResponse>
)
