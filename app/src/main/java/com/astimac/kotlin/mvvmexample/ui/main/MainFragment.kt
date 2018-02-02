package com.astimac.kotlin.mvvmexample.ui.main

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.astimac.kotlin.mvvmexample.databinding.FragmentMainBinding
import com.astimac.kotlin.mvvmexample.ui.base.BaseInjectableFragment
import javax.inject.Inject

/**
 * Created by astimac on 02.02.18..
 */
class MainFragment: BaseInjectableFragment() {

    private val mainViewModel: MainViewModel by lazy {
        ViewModelProviders.of(this, viewModelFactory).get(MainViewModel::class.java)
    }
    private lateinit var binding: FragmentMainBinding
    @Inject lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {
        fun newInstance(): MainFragment = MainFragment()
    }
}