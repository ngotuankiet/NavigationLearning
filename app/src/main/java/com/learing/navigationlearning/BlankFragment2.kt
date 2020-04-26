package com.learing.navigationlearning

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

class BlankFragment2 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        return inflater.inflate(R.layout.fragment_blank2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val b : Bundle? = arguments
        var test : String? = "loi roi"
        if(b != null){
            test =  b.getString("keke") as String
            Log.d("check", test)
        }
        Log.d("check", test)
    }

    companion object {
       fun newInstance() = BlankFragment2() as BlankFragment2
    }
}
