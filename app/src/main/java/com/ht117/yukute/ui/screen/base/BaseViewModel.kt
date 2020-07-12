package com.ht117.yukute.ui.screen.base

import androidx.lifecycle.ViewModel

sealed class UiState {
    object OnLoading: UiState()
    object OnComplete: UiState()
    data class OnNext<D>(val data: D): UiState()
    data class OnFailed(val message: String)
}

class BaseViewModel: ViewModel() {



}