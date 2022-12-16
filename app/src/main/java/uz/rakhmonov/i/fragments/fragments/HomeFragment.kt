package uz.rakhmonov.i.fragments.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.widget.addTextChangedListener
import uz.rakhmonov.i.fragments.R
import uz.rakhmonov.i.fragments.databinding.ActivityMainBinding
import uz.rakhmonov.i.fragments.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {
    lateinit var binding: FragmentHomeBinding


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentHomeBinding.inflate(layoutInflater)
        binding.edtHome.addTextChangedListener {
//            binding.tvFragment.text=binding.edtHome.text.reversed()
            binding.tvFragment.text=it.toString().reversed()

        }

       return binding.root
    }

}