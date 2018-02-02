package com.astimac.kotlin.mvvmexample.di

/**
 * Created by astimac on 02.02.18..
 */
import android.arch.lifecycle.ViewModelProvider
import dagger.Binds
import dagger.Module

@Module interface ViewModelModule {

    @Binds fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}
