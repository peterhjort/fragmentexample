package com.example.fragmentnavigationexample

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.fragment.findNavController
import com.example.fragmentnavigationexample.databinding.FragmentOneBinding

class FragmentOne : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        println("FragmentOne onCreateView()")

        val binding = DataBindingUtil.inflate<FragmentOneBinding>(
            inflater, R.layout.fragment_one, container, false)

        binding.button.setOnClickListener {
            /*
            val action =
                FragmentMemberListDirections.actionFragmentMemberListToFragmentMemberDetails(
                    item.hetekaId
                )
            it.findNavController().navigate(action)
            */
            //it.findNavController().navigate(R.id.action_fragmentOne_to_fragmentTwo)
            val action = FragmentOneDirections.actionFragmentOneToFragmentTwo(
                (1..6).random(), 666, "apua", 444
            )
            findNavController().navigate(action)
        }

        return binding.root
    }

}