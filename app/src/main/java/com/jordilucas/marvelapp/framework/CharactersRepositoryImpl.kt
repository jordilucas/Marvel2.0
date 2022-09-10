package com.jordilucas.marvelapp.framework

import androidx.paging.PagingSource
import com.example.core.data.repository.CharactersRemoteDataSource
import com.example.core.data.repository.CharactersRepository
import com.example.core.domain.model.Character
import com.jordilucas.marvelapp.framework.network.response.DataWrapperResponse
import com.jordilucas.marvelapp.framework.paging.CharactersPagingSource
import javax.inject.Inject

class CharactersRepositoryImpl @Inject constructor(
    private val remoteDataSource: CharactersRemoteDataSource<DataWrapperResponse>
) : CharactersRepository{
    override fun getCharactersRepository(query: String): PagingSource<Int, Character> {
        return CharactersPagingSource(remoteDataSource, query)
    }


}