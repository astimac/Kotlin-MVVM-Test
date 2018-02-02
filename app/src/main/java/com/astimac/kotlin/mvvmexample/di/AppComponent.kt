package com.astimac.kotlin.mvvmexample.di

import android.app.Application
import com.astimac.kotlin.mvvmexample.App
import com.astimac.kotlin.mvvmexample.di.activity.MainActivityBuilder
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import javax.inject.Singleton

/**
 * Created by astimac on 02.02.18..
 */
@Singleton
@Component(modules = [
    AndroidInjectionModule::class,
    AppModule::class,
    NetworkModule::class,
    ViewModelModule::class,
    MainActivityBuilder::class
])
interface AppComponent {
    @Component.Builder
    interface Builder {
        @BindsInstance fun application(application: Application): Builder
        fun networkModule(networkModule: NetworkModule): Builder
        fun build(): AppComponent
    }
    fun inject(app: App)
}