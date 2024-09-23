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
import com.example.kotlinpractice.databinding.FragmentQuestionBinding


class QuestionFragment : Fragment() {
    private var _binding: FragmentQuestionBinding? = null
    private val binding get() = _binding!!
    private lateinit var questionViewModel: QuestionViewModel


    lateinit var navController: NavController


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // 바인딩 객체 생성
        _binding = FragmentQuestionBinding.inflate(inflater, container, false)
        questionViewModel = ViewModelProvider(this).get(QuestionViewModel::class.java)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController = Navigation.findNavController(view)
        binding.imageView2.setOnClickListener {
            navController.navigate(R.id.action_questionFragment_to_selectFragment)
        }
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}


