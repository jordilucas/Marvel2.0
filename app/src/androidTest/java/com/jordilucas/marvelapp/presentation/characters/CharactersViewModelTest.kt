package com.jordilucas.marvelapp.presentation.characters

import androidx.paging.PagingData
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.test.*
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.junit.MockitoJUnitRunner
import com.example.core.domain.model.Character

@RunWith(MockitoJUnitRunner::class)
class CharactersViewModelTest{

    @ExperimentalCoroutinesApi
    val testDispatcher: TestCoroutineDispatcher = TestCoroutineDispatcher()

    private lateinit var charactersViewModel: CharactersViewModel

    /*@ExperimentalCoroutinesApi
    @Before
    fun setUp(){
        Dispatchers.setMain(testDispatcher)
        charactersViewModel = CharactersViewModel()
    }*/

    /*@Test
    fun `should validate the paging data object values when calling charactersPagingData`() = runBlockingTest{
        val expetectedPagingData = PagingData.from(
            listOf(
                   Character(

                )
            )
        )
        val result = charactersViewModel.charactersPagingData("").first()

    }*/

}