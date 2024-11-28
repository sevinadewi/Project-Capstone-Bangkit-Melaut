package com.example.melautapp.ui.rumah

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.melautapp.databinding.FragmentRumahBinding

class RumahFragment : Fragment() {

    private var _binding: FragmentRumahBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val rumahViewModel =
            ViewModelProvider(this).get(RumahViewModel::class.java)

        _binding = FragmentRumahBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textRumah
        rumahViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}