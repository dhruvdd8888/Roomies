package com.orezebuc.roomies;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatDialogFragment;


public class tncDialog extends AppCompatDialogFragment {
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        AlertDialog.Builder tncbuilder = new AlertDialog.Builder(getActivity());

        String tnct = getResources().getString(R.string.tnctext);
        tncbuilder.setTitle("Terms and Conditions")
                    .setMessage(tnct)
                    .setPositiveButton("Close", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {

                        }
                    });
        return tncbuilder.create();
    }
}
