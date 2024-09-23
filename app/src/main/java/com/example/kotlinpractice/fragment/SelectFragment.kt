package com.example.kotlinpractice.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.kotlinpractice.R
import com.example.kotlinpractice.databinding.FragmentSelectBinding

class SelectFragment : Fragment() {
    private var _binding: FragmentSelectBinding? = null
    private val binding get() = _binding!!
    private lateinit var selectViewModel: SelectViewModel


    lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 바인딩 객체 생성
        _binding = FragmentSelectBinding.inflate(inflater, container, false)
        selectViewModel = ViewModelProvider(this).get(SelectViewModel::class.java)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binding.btnBack.setOnClickListener{
            navController.popBackStack()
        }
        binding.option1.setOnClickListener{
                val selectedOption = binding.option1.text.toString()
                val arguments = Bundle().apply {
                    putString("option", selectedOption)
                }
                navController.navigate(R.id.action_selectFragment_to_resultFragment, arguments)

        }
        binding.option2.setOnClickListener{
            val selectedOption = binding.option2.text.toString()
            val arguments = Bundle().apply {
                putString("option", selectedOption)
            }
            navController.navigate(R.id.action_selectFragment_to_resultFragment, arguments)
        }
        binding.option3.setOnClickListener{
            val selectedOption = binding.option3.text.toString()
            val arguments = Bundle().apply {
                putString("option", selectedOption)
            }
            navController.navigate(R.id.action_selectFragment_to_resultFragment, arguments)
        }
        binding.option4.setOnClickListener{
            val selectedOption = binding.option4.text.toString()
            val arguments = Bundle().apply {
                putString("option", selectedOption)
            }
            navController.navigate(R.id.action_selectFragment_to_resultFragment, arguments)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
