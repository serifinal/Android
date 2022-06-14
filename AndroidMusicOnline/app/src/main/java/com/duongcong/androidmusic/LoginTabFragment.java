package com.duongcong.androidmusic;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class LoginTabFragment extends Fragment {
    Button btnLogin;
    EditText edtUserName,edtUserPassW;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saveInstanceState){
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.login_tab_fragment,container,false);

        btnLogin =(Button) root.findViewById(R.id.btnLogin);
        edtUserName =(EditText) root.findViewById(R.id.login_username);
        edtUserPassW =(EditText) root.findViewById(R.id.login_password);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(edtUserName.toString().equals("admin") && edtUserPassW.toString().equals("admin")){
                    Toast.makeText(getActivity() , "Login successful", Toast.LENGTH_SHORT).show();

                }
                else{
                    Toast.makeText(getActivity(), "Login Failed", Toast.LENGTH_SHORT).show();
                }
            }
        });

        return root;
    }
}
