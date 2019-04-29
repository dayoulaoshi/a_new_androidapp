package com.example.new2;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.baidu.mapapi.SDKInitializer;
import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapView;


public class MainActivity extends Activity {
    private MapView mMapView = null;
    //MapView mapView = new MapView(this);
    private Button Button_getposition;
    private BaiduMap baiduMap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        SDKInitializer.initialize(getApplicationContext());
        setContentView(R.layout.activity_main);
        //获取地图控件引用

        Button_getposition=findViewById(R.id.button1);

        mMapView = (MapView) findViewById(R.id.bmapView);
        baiduMap=mMapView.getMap();
        //setContentView(mapView);


        //按钮添加点击事件
            Button_getposition.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Button1_Getplace button1_getplace=new Button1_Getplace(baiduMap);
                    button1_getplace.initListener();
                }
            });





    }
    @Override
    protected void onResume() {
        super.onResume();
        //在activity执行onResume时执行mMapView. onResume ()，实现地图生命周期管理
        mMapView.onResume();
    }
    @Override
    protected void onPause() {
        super.onPause();
        //在activity执行onPause时执行mMapView. onPause ()，实现地图生命周期管理
        mMapView.onPause();
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        //在activity执行onDestroy时执行mMapView.onDestroy()，实现地图生命周期管理
        mMapView.onDestroy();
    }
}
