package com.example.jetpacknavigation

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.NavDirections;
import androidx.navigation.Navigation;
import com.example.jetpacknavigation.databinding.FragmentSecondBinding

class SecondFragment : Fragment() {
    private lateinit var binding: FragmentSecondBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding= FragmentSecondBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val backBtn:Button=view.findViewById(R.id.button_frag2)

        backBtn.setOnClickListener {
            val s:View.OnClickListener=Navigation.createNavigateOnClickListener(R.id.action_secondFragment_to_movieActivity)
            binding.buttonFrag2.setOnClickListener(s)
//            val navController: NavController? =
//                activity?.let { it1 -> Navigation.findNavController(it1,R.id.myHostFragment) }
//            navController?.navigateUp()
        }
    }
}