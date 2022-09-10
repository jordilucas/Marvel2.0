package com.jordilucas.marvelapp.framework.remote

import com.example.core.data.repository.CharactersRemoteDataSource
import com.jordilucas.marvelapp.framework.network.MarvelApi
import com.jordilucas.marvelapp.framework.network.response.DataWrapperResponse
import javax.inject.Inject

class RetrofitCharactersDataSource @Inject constructor(
    private val marvelApi: MarvelApi
) : CharactersRemoteDataSource<DataWrapperResponse> {
    override suspend fun fetchCharacters(queries: Map<String, String>): DataWrapperResponse {
        return marvelApi.getCharacters(queries)
    }
}