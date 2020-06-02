package com.example.learnnavdrawerfragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {
//    All Fragment Java Classes require their Accompanying XML

//    This variable listens to the onClick on the Button in the Fragment
    private onFragmentButtonSelected listener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
//        Inflate the correct layout and do not attach to root
        View view = inflater.inflate(R.layout.fragment_main, container, false);
//        Find the Button and set up an onClickListener to run the interface code in MainActivity
        Button clickButton = view.findViewById(R.id.buttonMainFragment);
        clickButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listener.onButtonSelected();
            }
        });
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
//        This loads when the Fragment is attached to the MainActivity
        super.onAttach(context);
        if(context instanceof onFragmentButtonSelected){
            listener = (onFragmentButtonSelected) context;
        } else {
            throw new ClassCastException(context.toString() + "must implement listener.");
        }
    }

    public interface onFragmentButtonSelected{
//        This interface will be used by the MainActivity to access the button
        public void onButtonSelected();
    }
}
