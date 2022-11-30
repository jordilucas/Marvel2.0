package com.jordilucas.marvelapp.presentation.characters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.paging.LoadState
import androidx.recyclerview.widget.RecyclerView
import com.jordilucas.marvelapp.databinding.ItemCharacterLoadMoreStateBinding

class CharactersLoadingMoreStateViewHolder(
    itemBinding: ItemCharacterLoadMoreStateBinding,
    retry: () -> Unit
) : RecyclerView.ViewHolder(itemBinding.root) {

    private val binding = ItemCharacterLoadMoreStateBinding.bind(itemView)
    private val textErrorMessage = binding.textTryAgain.also {
        it.setOnClickListener {
            retry()
        }
    }
    private val progressBar = binding.progressLoadingMore

    fun bind(loadState: LoadState) {
        progressBar.isVisible = loadState is LoadState.Loading
        textErrorMessage.isVisible = loadState is LoadState.Error
    }

    companion object {
        fun create(parent: ViewGroup, retry: () -> Unit): CharactersLoadingMoreStateViewHolder {
            val itemBinding = ItemCharacterLoadMoreStateBinding
                .inflate(LayoutInflater.from(parent.context), parent, false)
            return CharactersLoadingMoreStateViewHolder(itemBinding, retry)
        }
    }

}