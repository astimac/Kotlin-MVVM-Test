package com.astimac.kotlin.mvvmexample.util.ext

import android.content.Context
import android.databinding.ViewDataBinding

/**
 * Created by astimac on 02.02.18..
 */
val ViewDataBinding.context: Context
    get() = root.context