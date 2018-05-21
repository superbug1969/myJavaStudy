package com.example.avtivitytest;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ThirdActivity extends BaseActivity {
    private static final String TAG = "ThirdActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.third_layout);
        Button button=(Button)findViewById(R.id.button_3);
        Button btn_golist=(Button)findViewById(R.id.button_goListTest);
        TextView textView=(TextView)findViewById(R.id.textview_3) ;
        btn_golist.setOnClickListener(new MyOnClickListener());
        Intent intent=getIntent();
        final String mdata=intent.getStringExtra("sjs");
//        Log.d(TAG,mdata);
//        String mdata="dffddflkfdkllfdklkfdklfdklfdlklfkdlkfdlkdfrkl";
//        Toast.makeText(ThirdActivity.this,mdata,Toast.LENGTH_SHORT).show();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent=new Intent(Intent.ACTION_VIEW);
//                intent.setData(Uri.parse("http://sina.com.cn"));
//                String mdata=intent.getStringExtra("extra_data");
                Toast.makeText(ThirdActivity.this,mdata,Toast.LENGTH_SHORT).show();

            }
        });

    }
    class MyOnClickListener implements View.OnClickListener{
        @Override
        public void onClick(View v){
            if(v.getId()==R.id.button_goListTest){
                Intent intent=new Intent("listviewtest");
                startActivity(intent);}


            }
        }
}
