package com.example.melautapp.ui.editProfil

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.melautapp.databinding.FragmentEditprofilBinding

class EditProfilFragment : Fragment() {

    private var _binding: FragmentEditprofilBinding? = null

    // This property is only valid between onCreateView and onDestroyView.
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val editProfilViewModel =
            ViewModelProvider(this).get(EditProfilViewModel::class.java)

        _binding = FragmentEditprofilBinding.inflate(inflater, container, false)
        val root: View = binding.root

        val textView: TextView = binding.textEditprofil
        editProfilViewModel.text.observe(viewLifecycleOwner) {
            textView.text = it
        }
        return root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}
