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
import com.example.jetpacknavigation.databinding.FragmentFirstBinding


class FirstFragment : Fragment() {

    private lateinit var binding:FragmentFirstBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
       binding= FragmentFirstBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if(false) {
            val s: View.OnClickListener =
                Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_secondFragment)
            binding.buttonFrag1.setOnClickListener(s)
//            val button: Button = view.findViewById(R.id.button_frag1)
//            button.setOnClickListener(s)
        }else{
            val s: View.OnClickListener =
                Navigation.createNavigateOnClickListener(R.id.action_firstFragment_to_thirdFragment)
            binding.buttonFrag1.setOnClickListener(s)
//            val button: Button = view.findViewById(R.id.button_frag1)
//            button.setOnClickListener(s)
        }
    }
}