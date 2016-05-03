package yll.testsystem;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;

import yll.stusystem.StuLogin;
import yll.tchrsystem.TchrLogin;

public class Choose_System  extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //  requestWindowFeature(Window.FEATURE_CUSTOM_TITLE);
        setContentView(R.layout.choose_system);
        //   getWindow().setFeatureInt(Window.FEATURE_CUSTOM_TITLE, R.layout.titlebar);
        Button choose_stu=(Button)findViewById(R.id.choose_stu);
        Button choose_tchr=(Button)findViewById(R.id.choose_tchr);

        choose_stu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Choose_System.this,StuLogin.class);
                startActivity(intent);
            }
        });
        choose_tchr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Choose_System.this,TchrLogin.class);
                startActivity(intent);
            }
        });

    }

}