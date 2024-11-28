package com.example.melautapp.ui.komunitas

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.melautapp.databinding.FragmentKomunitasBinding

class KomunitasFragment : Fragment() {

    private var _binding: FragmentKomunitasBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val komunitasViewModel =
            ViewModelProvider(this).get(KomunitasViewModel::class.java)

        _binding = FragmentKomunitasBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textKomunitas
        komunitasViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}