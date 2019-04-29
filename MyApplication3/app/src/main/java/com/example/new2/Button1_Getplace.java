package com.example.new2;

import android.view.MotionEvent;

import com.baidu.mapapi.map.BaiduMap;
import com.baidu.mapapi.map.MapPoi;
import com.baidu.mapapi.model.LatLng;

public class Button1_Getplace {
    private LatLng currentPt;
    private BaiduMap mBaiduMap;


    Button1_Getplace(BaiduMap mBaiduMap){
        this.mBaiduMap=mBaiduMap;
    }


    public void initListener() {
        /**
         *setOnMapTouchListener(BaiduMap.OnMapTouchListener listener):
         *                        设置触摸地图事件监听者
         * */
        mBaiduMap.setOnMapTouchListener(new BaiduMap.OnMapTouchListener() {
            //当用户触摸地图时回调函数
            @Override
            public void onTouch(MotionEvent event) {

            }
        });

        mBaiduMap.setOnMapClickListener(new BaiduMap.OnMapClickListener() {
            //地图单击事件回调函数
            public void onMapClick(LatLng point) {
                currentPt = point;
            }
            //地图内 Poi 单击事件回调函数
            //MapPoi:点击地图 Poi 点时，该兴趣点的描述信息
            public boolean onMapPoiClick(MapPoi poi) {
                return false;
            }
        });






    }

}
