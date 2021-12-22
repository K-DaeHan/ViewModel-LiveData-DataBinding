package com.hmtalk.viewmodeldemo2.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.hmtalk.viewmodeldemo2.BR.myViewModel
import com.hmtalk.viewmodeldemo2.R
import com.hmtalk.viewmodeldemo2.databinding.MainFragmentBinding

class MainFragment : Fragment() {

    private lateinit var binding: MainFragmentBinding

    companion object {
        fun newInstance() = MainFragment()
    }

    private lateinit var viewModel: MainViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View {
        /*return inflater.inflate(R.layout.main_fragment, container, false)*/
        binding = DataBindingUtil.inflate(inflater, R.layout.main_fragment, container, false)
        binding.lifecycleOwner = this
        return binding.root
    } // onCreateView

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val viewModelProvider: ViewModelProvider = ViewModelProvider(this)
        viewModel = viewModelProvider.get(MainViewModel::class.java)

        binding.setVariable(myViewModel, viewModel)

    } // onActivityCreated
}
