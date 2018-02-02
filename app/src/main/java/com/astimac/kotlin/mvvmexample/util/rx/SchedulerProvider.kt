package com.astimac.kotlin.mvvmexample.util.rx

import io.reactivex.Scheduler

/**
 * Created by astimac on 02.02.18..
 */
interface SchedulerProvider {
    fun ui(): Scheduler

    fun computation(): Scheduler

    fun newThread(): Scheduler

    fun io(): Scheduler
}