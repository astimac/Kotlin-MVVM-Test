package com.astimac.kotlin.mvvmexample.di

import android.app.Application
import android.content.Context
import com.astimac.kotlin.mvvmexample.util.rx.AppSchedulerProvider
import com.astimac.kotlin.mvvmexample.util.rx.SchedulerProvider
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

/**
 * Created by astimac on 02.02.18..
 */
@Module internal object AppModule {

    @Singleton
    @Provides
    @JvmStatic
    fun provideContext(application: Application): Context = application

    @Singleton @Provides @JvmStatic
    fun provideSchedulerProvider(): SchedulerProvider = AppSchedulerProvider()
}