package uz.rakhmonov.i.fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import uz.rakhmonov.i.fragments.R
import uz.rakhmonov.i.fragments.databinding.FragmentBlankBinding


class BlankFragment : Fragment() {
    lateinit var binding: FragmentBlankBinding
          override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
     binding= FragmentBlankBinding.inflate(layoutInflater)
              binding.btnBlank.setOnClickListener {
                  Toast.makeText(context, "bosildi", Toast.LENGTH_SHORT).show()
              }
              
              return binding.root
    }

}