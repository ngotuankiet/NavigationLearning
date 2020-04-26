package com.learing.navigationlearning

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import androidx.navigation.findNavController

class BlankFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val navController = Navigation.findNavController(view)

        val btnClick = view.findViewById<Button>(R.id.btn_click) as Button
        val alone = "alone"

        btnClick.setOnClickListener {
            val args  = BlankFragment.bundleArgs(alone)
            navController.navigate(R.id.blankFragment2, args)
        }

    }


    companion object {
        fun bundleArgs(keke: String): Bundle{
            return Bundle().apply {
                this.putString("keke",keke)
            }
        }

        fun newInstance(): BlankFragment = BlankFragment()
    }
}
