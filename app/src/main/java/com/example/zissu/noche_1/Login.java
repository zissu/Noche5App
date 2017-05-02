package com.example.zissu.noche_1;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class Login extends Fragment  {
   private Button log_reg;

    public Login() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.fragment_login, container, false);
        log_reg = (Button) rootView.findViewById(R.id.bRegister);
        log_reg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment register = new Register();
                FragmentManager manager = getActivity().getSupportFragmentManager();
                FragmentTransaction transaction = manager.beginTransaction();
                transaction.replace(R.id.content_main_layout, register );
                transaction.addToBackStack(null);
                transaction.commit();




            }
        });

        return inflater.inflate(R.layout.fragment_login, container, false);
    }








}
