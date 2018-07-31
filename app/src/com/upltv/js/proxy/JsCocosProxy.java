package com.upltv.js.proxy;

import android.util.Log;

import org.cocos2dx.lib.Cocos2dxJavascriptJavaBridge;

/**
 * Created by sam on 2018/3/9.
 */

public class JsCocosProxy {

    public static void initSDKByZone(final int zone, final String callback) {
        Log.i("===> js", "initSDKByZone call zone = " + zone + ", callback: " +  callback);
        Cocos2dxJavascriptJavaBridge.evalString(callback + "('true');");
    }
}
