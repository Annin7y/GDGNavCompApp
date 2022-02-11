package gdgcloudtoronto.gdgnavcompapp.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import gdgcloudtoronto.gdgnavcompapp.R
import gdgcloudtoronto.gdgnavcompapp.databinding.FragmentSecondBinding
import gdgcloudtoronto.gdgnavcompapp.databinding.FragmentThirdBinding


class ThirdFragment : Fragment() {

    private var _binding: FragmentThirdBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        _binding = FragmentThirdBinding.inflate(inflater, container, false)

        binding.thirdFragText.setOnClickListener { findNavController().navigate(R.id.action_thirdFragment_to_secondFragment)}

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}