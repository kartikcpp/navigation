package com.kartiksaini.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.kartiksaini.myapplication.databinding.FragmentRamBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [RamFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class RamFragment : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val binding:FragmentRamBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_ram,container,false)
        var args=RamFragmentArgs.fromBundle(arguments!!)
        Toast.makeText(context,"${args.number}",Toast.LENGTH_LONG).show()

        return binding.root


    }


}