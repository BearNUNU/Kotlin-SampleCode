package com.example.kotlinpractice.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.kotlinpractice.R
import com.example.kotlinpractice.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!
    private lateinit var mainViewModel: MainViewModel

    lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 바인딩 객체 생성
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) { // 뷰가 생성되고 이후
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binding.imageView2.setOnClickListener {
            navController.navigate(R.id.action_mainFragment_to_questionFragment)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        // 메모리 누수를 방지하기 위해 _binding을 null로 설정
        _binding = null
    }
}