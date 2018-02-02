package com.astimac.kotlin.mvvmexample.di.activity

import com.astimac.kotlin.mvvmexample.ui.main.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

/**
 * Created by astimac on 02.02.18..
 */
@Module interface MainActivityBuilder {
    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    fun contributeMainActivity(): MainActivity
}