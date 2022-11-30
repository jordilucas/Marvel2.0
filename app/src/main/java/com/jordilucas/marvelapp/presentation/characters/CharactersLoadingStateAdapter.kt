package com.jordilucas.marvelapp.presentation.characters

import android.view.ViewGroup
import androidx.paging.LoadState
import androidx.paging.LoadStateAdapter

class CharactersLoadingStateAdapter(
    private val retry: () -> Unit
) : LoadStateAdapter<CharactersLoadingMoreStateViewHolder>(){
    override fun onBindViewHolder(
        holder: CharactersLoadingMoreStateViewHolder,
        loadState: LoadState
    ) = holder.bind(loadState)

    override fun onCreateViewHolder(
        parent: ViewGroup,
        loadState: LoadState
    ) = CharactersLoadingMoreStateViewHolder.create(parent, retry)
}