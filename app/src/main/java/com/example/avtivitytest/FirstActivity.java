package com.example.avtivitytest;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_layout);
//        活动恢复/创建时，取得活动销毁时保存的数据
        if (savedInstanceState !=null){
            String mname=savedInstanceState.getString("name");
        }

        Button button1=(Button) (findViewById(R.id.button_1));
        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
//                Toast.makeText(FirstActivity.this,"You clicked button 145545454",Toast.LENGTH_SHORT).show();
//              下面是显式intent 调用
//                Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
//                下面是隐式intent 调用
//                Intent intent=new Intent("com.example.activitytest.ACTION_START"); //可以运行
//                Intent intent=new Intent("LOG_IN");//可以运行
//                初步总结：manifest 中的Action 定义，可以为任意字符串，只是一个标识的作用
                String data="Hellow ThirdActivity 9090909009900990900990";
                Intent intent=new Intent("LOG_IN");
                intent.putExtra("sjs",data);
//                Dialog测试begin
                AlertDialog.Builder dialog=new AlertDialog.Builder(FirstActivity.this);
                dialog.setTitle("FirstActivity Dialog");
                dialog.setMessage("important messages to be notified");
                dialog.setCancelable(false);
                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {}
                });
                dialog.setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
//                dialog.show();
//                Dialog测试end
//                startActivity(intent);
//                另一种启动活动的方式：
//                SecondActivity.actionStart(FirstActivity.this,"data1","data2");
//                FirstActivity 要求往回传递数据的用法：SecondActivity 将返回数据给FirstActivity。备注：SecondActivity 活动销毁时
// 会回调上一个活动的OnActivivityResult()方法。因此FirstActivity必须实现这个方法来获取传回来的数据。
                startActivityForResult(intent,1);
            }
                                   }
        );
    }

    @Override
    public void onActivityResult(int requestCode,int resultCode,Intent data){
        switch (requestCode){
            case 1:
                if (resultCode==RESULT_OK){
                    String returnedData=data.getStringExtra("return_data");
                    Log.d("FirstActivity",returnedData);
                  }
                break;
                default:
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
//        活动销毁之前，保存数据
        super.onSaveInstanceState(outState);
        outState.putString("name","sjs");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
//        return super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.main_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.add_item:
//                Toast.makeText(this, "add_item999", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent("listviewtest");
                startActivity(intent);
                break;
            case R.id.remove_item:
                Toast.makeText(this, "remove_item", Toast.LENGTH_SHORT).show();
                break;
            default:
        }
        return true;
        }

}
