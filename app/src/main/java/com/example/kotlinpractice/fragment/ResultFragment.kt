package com.example.kotlinpractice.fragment

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.kotlinpractice.R
import com.example.kotlinpractice.databinding.FragmentResultBinding

class ResultFragment : Fragment() {
    private var _binding: FragmentResultBinding? = null
    private val binding get() = _binding!!
    private lateinit var resultViewModel: ResultViewModel


    lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 바인딩 객체 생성
        _binding = FragmentResultBinding.inflate(inflater, container, false)
        resultViewModel = ViewModelProvider(this).get(ResultViewModel::class.java)

        return binding.root
    }


    @SuppressLint("ResourceType")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        val option = arguments?.getString("option") // _binding 사용
        binding.tvSub.text = option ?: "기본 텍스트"
        binding.btnHome.setOnClickListener {
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
