package com.jordilucas.marvelapp.framework.di

import com.example.core.data.repository.CharactersRemoteDataSource
import com.example.core.data.repository.CharactersRepository
import com.jordilucas.marvelapp.framework.CharactersRepositoryImpl
import com.jordilucas.marvelapp.framework.network.response.DataWrapperResponse
import com.jordilucas.marvelapp.framework.remote.RetrofitCharactersDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
interface RepositoryModule {

    @Binds
    fun bindCharacterRepository(repositoryImpl: CharactersRepositoryImpl) : CharactersRepository

    @Binds
    fun bindRemoteDataSource(dataSource: RetrofitCharactersDataSource) : CharactersRemoteDataSource<DataWrapperResponse>

}