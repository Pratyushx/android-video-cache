package com.example.videocache;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import com.example.videocache.HttpProxyCacheServer;

public class videoActivity extends AppCompatActivity {

    private HttpProxyCacheServer proxy;

    public static HttpProxyCacheServer getProxy(Context context) {
        videoActivity app = (videoActivity) context.getApplicationContext();
        return videoActivity.proxy == null ? (videoActivity.proxy = videoActivity.newProxy()) : videoActivity.proxy;
    }

    private HttpProxyCacheServer newProxy() {
        return new HttpProxyCacheServer.Builder(this)
                .cacheDirectory(Utils.getVideoCacheDir(this))
                .build();
    }
}