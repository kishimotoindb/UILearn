package com.example.bear.uilearn;

import android.app.Dialog;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.PopupWindow;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //dialog的window type是type-application-window，不是sub-window
//        AlertDialog.Builder builder = new AlertDialog.Builder(this);
//        AlertDialog show = builder.setView(R.layout.sub_window_dialog_can_have_text_cursor).show();
//        Log.i("type", "onCreate: " + show.getWindow().getAttributes().type);

        findViewById(R.id.text).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // popupWindow的window type是type-application-panel==type-first-sub-window
                // 所以popupWindow里的EditText是不能够弹键盘和Editor的框的
                PopupWindow pw = new PopupWindow(MainActivity.this);
                pw.setContentView(getLayoutInflater().inflate(R.layout.sub_window_dialog_can_have_text_cursor, null));
                pw.showAsDropDown(findViewById(R.id.text));
            }
        });



    }


}
