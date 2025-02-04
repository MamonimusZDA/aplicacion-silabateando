package com.example.myapplication6484

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myapplication6484.databinding.InicioSesionBinding

/**
 * A simple [Fragment] subclass as the default destination in the navigation.
 */
class IniciarSesion : Fragment() {

    private var _binding: InicioSesionBinding? = null



    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        _binding = InicioSesionBinding.inflate(inflater, container, false)
        return binding.root

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
/*
        binding.buttonFirst.setOnClickListener {
            findNavController().navigate(R.id.action_iniciosesion_to_crearcuenta)
        }
        */

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }





}