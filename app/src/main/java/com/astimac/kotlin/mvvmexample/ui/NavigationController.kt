package com.astimac.kotlin.mvvmexample.ui

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v7.app.AppCompatActivity
import javax.inject.Inject

/**
 * Created by astimac on 02.02.18..
 */
class NavigationController @Inject constructor(activity: AppCompatActivity) {
    private val fragmentManager: FragmentManager = activity.supportFragmentManager

    fun replaceFragment(contentId: Int, fragment: Fragment) {
        fragmentManager
                .beginTransaction()
                .replace(contentId, fragment)
                .commitAllowingStateLoss()
    }
}