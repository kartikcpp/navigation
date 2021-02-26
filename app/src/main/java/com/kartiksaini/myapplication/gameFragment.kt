package com.kartiksaini.myapplication

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import com.kartiksaini.myapplication.databinding.FragmentGameBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER


/**
 * A simple [Fragment] subclass.
 * Use the [gameFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class gameFragment : Fragment() {
    // TODO: Rename and change types of parameters


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val binding:FragmentGameBinding=DataBindingUtil.inflate(inflater,R.layout.fragment_game,container,false)
        binding.button.setOnClickListener({
            it.findNavController().navigate(gameFragmentDirections.actionGameFragmentToRamFragment(67))
        })

        return binding.root
    }
    fun rams(view:View){

    }


}