package com.example.fragmentnavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.example.fragmentnavigationexample.databinding.FragmentOneBinding
import com.example.fragmentnavigationexample.databinding.FragmentTwoBinding

class FragmentTwo : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val args = FragmentTwoArgs.fromBundle(requireArguments())
        println("FragmentTwo onCreateView() ${args.number1} ${args.number2} ${args.viesti}")

        val binding = DataBindingUtil.inflate<FragmentTwoBinding>(
            inflater, R.layout.fragment_two, container, false)
        return binding.root
    }

}