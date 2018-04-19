package me.chenjr.uiinteraction;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class LinerLayout_activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_liner_layout);
//        TODO:
        final  LinearLayout layout =  this.findViewById(R.id.Linear_layout_uc1);



        Button bt_hor =  findViewById(R.id.btn_ll_hor);
        bt_hor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setOrientation(LinearLayout.HORIZONTAL);
            }
        });
        Button bt_ver =  findViewById(R.id.btn_ll_ver);
        bt_ver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setOrientation(LinearLayout.VERTICAL);
            }
        });
        Button bt_left_center =  findViewById(R.id.btn_ll_left_center);
        bt_left_center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setHorizontalGravity(Gravity.LEFT);
            }
        });
        Button bt_center =  findViewById(R.id.btn_ll_center);
        bt_center.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                layout.setHorizontalGravity(Gravity.CENTER);
            }
        });
        Button bt_return =  findViewById(R.id.btn_ll_return);
        bt_return.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

}
