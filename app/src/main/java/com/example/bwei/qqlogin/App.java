package com.example.bwei.qqlogin;

import android.app.Application;

import com.umeng.socialize.PlatformConfig;
import com.umeng.socialize.UMShareAPI;

/**
 * Created by YU on 2017/7/7.
 */
public class App extends Application{

    private UMShareAPI umShareAPI;
    {
        PlatformConfig.setQQZone("1106198509","Z9wLCcdD7dvmypub");
    }
    @Override
    public void onCreate() {
        super.onCreate();
        umShareAPI = UMShareAPI.get(this);
    }
    public UMShareAPI getUMShareAPI(){
        return umShareAPI;
    }
}
