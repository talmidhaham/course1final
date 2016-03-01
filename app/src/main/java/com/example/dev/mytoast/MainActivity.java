package com.example.dev.mytoast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnCbShowToast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addOnClickLister();
    }

    protected void addOnClickLister()
    {
        btnCbShowToast = (Button)findViewById(R.id.btnShowToast);

        btnCbShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // LayoutInflater - convert the custom UI elements to Java code
                LayoutInflater layoutInflaterObj = getLayoutInflater();

                // getting the view object that defined in custom_toast.xml
                View myLayout = layoutInflaterObj.inflate(R.layout.custom_toast,
                        (ViewGroup)findViewById(R.id.mainView));

                // creating Toast object
                Toast toastObj = new Toast(getApplicationContext());
                toastObj.setDuration(Toast.LENGTH_SHORT);
                toastObj.setView(myLayout);
                toastObj.show();
            }
        });
    }
}
