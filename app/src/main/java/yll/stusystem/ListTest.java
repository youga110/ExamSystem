package yll.stusystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import android.os.Bundle;
import android.app.Activity;
import android.app.ListActivity;
import android.view.Menu;
import android.widget.SimpleAdapter;

import yll.testsystem.R;

public class ListTest extends ListActivity {


    String[] from={"name","id"};              //这里是ListView显示内容每一列的列名
    int[] to={R.id.course_name,R.id.cousre_id};   //这里是ListView显示每一列对应的list_item中控件的id

    String[] userName={"zhangsan","lisi","wangwu","zhaoliu"}; //这里第一列所要显示的人名
    String[] userId={"1001","1002","1003","1004"};  //这里是人名对应的ID

    ArrayList<HashMap<String,String>> list=null;
    HashMap<String,String> map=null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // TODO Auto-generated method stub
        super.onCreate(savedInstanceState);
        setContentView(R.layout.test);       //为MainActivity设置主布局
        //创建ArrayList对象；
        list=new ArrayList<HashMap<String,String>>();
        //将数据存放进ArrayList对象中，数据安排的结构是，ListView的一行数据对应一个HashMap对象，
        //HashMap对象，以列名作为键，以该列的值作为Value，将各列信息添加进map中，然后再把每一列对应
        //的map对象添加到ArrayList中

        for(int i=0; i<4; i++){
            map=new HashMap<String,String>();       //为避免产生空指针异常，有几列就创建几个map对象
            map.put("id", userId[i]);
            map.put("name", userName[i]);
            list.add(map);
        }

        //创建一个SimpleAdapter对象
        SimpleAdapter adapter=new SimpleAdapter(this,list,R.layout.list_item,from,to);
        //调用ListActivity的setListAdapter方法，为ListView设置适配器
        setListAdapter(adapter);
    }
}