package com.ht117.data.di

import org.koin.core.module.Module
import org.koin.dsl.module

val module = module {

}

fun getDataModules(): List<Module> {
    return listOf(module)
}