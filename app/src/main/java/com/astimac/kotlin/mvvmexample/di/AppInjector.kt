package com.astimac.kotlin.mvvmexample.di

import android.app.Activity
import android.app.Application
import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentActivity
import android.support.v4.app.FragmentManager
import com.astimac.kotlin.mvvmexample.App
import dagger.android.AndroidInjection
import dagger.android.support.AndroidSupportInjection
import dagger.android.support.HasSupportFragmentInjector

/**
 * Created by astimac on 02.02.18..
 */
class AppInjector {
    companion object {
        fun init(app: App) {
            DaggerAppComponent.builder()
                    .application(app)
                    .networkModule(NetworkModule.instance)
                    .build()
                    .inject(app)
            app.registerActivityLifecycleCallbacks(object : Application.ActivityLifecycleCallbacks {
                override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                    handleActivity(activity)
                }
                override fun onActivityPaused(activity: Activity?) = Unit
                override fun onActivityResumed(activity: Activity?) = Unit
                override fun onActivityStarted(activity: Activity?) = Unit
                override fun onActivityDestroyed(activity: Activity?) = Unit
                override fun onActivitySaveInstanceState(activity: Activity?, outState: Bundle?) = Unit
                override fun onActivityStopped(activity: Activity?) = Unit
            })
        }

        private fun handleActivity(activity: Activity) {
            if (activity is HasSupportFragmentInjector) {
                AndroidInjection.inject(activity)
            }
            val fragmentActivity = activity as? FragmentActivity
            fragmentActivity?.supportFragmentManager?.registerFragmentLifecycleCallbacks(
                    object : FragmentManager.FragmentLifecycleCallbacks() {
                        override fun onFragmentCreated(fm: FragmentManager?, f: Fragment?,
                                                       savedInstanceState: Bundle?) {
                            if (f is Injectable) {
                                AndroidSupportInjection.inject(f)
                            }
                        }
                    }, true)
        }
    }
}