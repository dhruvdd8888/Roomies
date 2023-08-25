package com.orezebuc.roomies;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class childFragment extends Fragment {

    TextView userName, userAge, userLocation;
    ImageView userProfile;


    public childFragment() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.row_content, container, false);

        userName = view.findViewById(R.id.NameOFUser);
        userAge = view.findViewById(R.id.UserAge);
        userLocation = view.findViewById(R.id.UserLocation);
        userProfile = view.findViewById(R.id.ivMain);
        Bundle bundle = getArguments();
        String[] userData = bundle.getStringArray("userdata");
        userName.setText(userData[0]);
        userAge.setText(userData[1]);
        userLocation.setText(userData[2]);
        userProfile.setImageResource((int)Integer.parseInt(userData[3]));

        return view;
    }
}
