package gdgcloudtoronto.gdgnavcompapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import gdgcloudtoronto.gdgnavcompapp.R
import gdgcloudtoronto.gdgnavcompapp.databinding.FragmentFirstBinding
import gdgcloudtoronto.gdgnavcompapp.databinding.FragmentSecondBinding


class SecondFragment : Fragment() {

    private var _binding: FragmentSecondBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentSecondBinding.inflate(inflater, container, false)

        binding.secondFragText.setOnClickListener { findNavController().navigate(R.id.action_secondFragment_to_thirdFragment)}

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}