package com.hddroid.clean.core.presentation.view.base.contract

import com.hddroid.clean.core.presentation.view.base.BaseViewState

interface ViewStateContract<VS: BaseViewState> {
    fun renderState(it: VS)
}