package yll.stusystem;

import android.app.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import yll.testsystem.R;

public class StuLogin extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);

        setContentView(R.layout.login);
        //  getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.titlebar);
        Button login=(Button)findViewById(R.id.login_in);
        Button frgt_pwd=(Button)findViewById(R.id.frgt_pwd);
        Button choose_registe=(Button)findViewById(R.id.choose_registe);
        EditText user_id=(EditText)findViewById(R.id.user_id);
        EditText passward=(EditText)findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //判读密码是否正确
                //正确则进入主界面
              Intent intent=new Intent(StuLogin.this,StuMain.class);
                startActivity(intent);


            }
        });
         choose_registe.setOnClickListener(new View.OnClickListener(){
             @Override
             public void onClick(View v) {
                 Intent intent=new Intent(StuLogin.this,StuRegiste.class);
                 startActivity(intent);
             }
         });





    }
}
