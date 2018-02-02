package com.astimac.kotlin.mvvmexample.di.activity

import android.arch.lifecycle.ViewModel
import android.support.v7.app.AppCompatActivity
import com.astimac.kotlin.mvvmexample.di.ViewModelKey
import com.astimac.kotlin.mvvmexample.ui.main.MainActivity
import com.astimac.kotlin.mvvmexample.ui.main.MainFragment
import com.astimac.kotlin.mvvmexample.ui.main.MainViewModel
import dagger.Binds
import dagger.Module
import dagger.android.ContributesAndroidInjector
import dagger.multibindings.IntoMap

/**
 * Created by astimac on 02.02.18..
 */
@Module interface MainActivityModule {
    @Binds fun provideAppCompatActivity(mainActivity: MainActivity): AppCompatActivity

    @ContributesAndroidInjector
    fun contributeMainFragment(): MainFragment

    @Binds @IntoMap
    @ViewModelKey(MainViewModel::class)
    fun bindMainViewModel(mainViewModel: MainViewModel): ViewModel
}