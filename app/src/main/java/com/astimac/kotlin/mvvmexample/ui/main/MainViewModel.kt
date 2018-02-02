package com.astimac.kotlin.mvvmexample.ui.main

import android.arch.lifecycle.ViewModel
import com.astimac.kotlin.mvvmexample.util.rx.SchedulerProvider
import io.reactivex.disposables.CompositeDisposable
import javax.inject.Inject

/**
 * Created by astimac on 02.02.18..
 */
class MainViewModel @Inject constructor(private val schedulerProvider: SchedulerProvider) : ViewModel() {

    private val compositeDisposable: CompositeDisposable = CompositeDisposable()

    override fun onCleared() {
        super.onCleared()
        compositeDisposable.clear()
    }
}