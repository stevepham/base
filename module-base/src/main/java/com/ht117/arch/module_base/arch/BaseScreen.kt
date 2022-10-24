package com.ht117.arch.module_base.arch

import android.os.Bundle
import android.view.View
import androidx.annotation.LayoutRes
import androidx.fragment.app.Fragment

abstract class BaseScreen(@LayoutRes layoutId: Int): Fragment(layoutId) {

    open fun initFirst() {}
    open fun initView() {}
    open fun initLogic() {}

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initFirst()
        initView()
    }

    override fun onResume() {
        super.onResume()
        initLogic()
    }

}