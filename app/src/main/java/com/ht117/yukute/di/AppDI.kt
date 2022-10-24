package com.ht117.yukute.di

import com.ht117.data.di.getDataModules
import org.koin.core.module.Module
import org.koin.dsl.module

val module = module {
}

fun getDI(): List<Module> {
    val dataModules = getDataModules()
    return mutableListOf(module).also {
        it.addAll(dataModules)
    }
}