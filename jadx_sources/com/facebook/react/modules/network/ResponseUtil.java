package com.facebook.react.modules.network;

import androidx.annotation.Nullable;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.net.SocketTimeoutException;

/* JADX INFO: loaded from: classes45.dex */
public class ResponseUtil {
    public static void onDataReceived(@Nullable ReactApplicationContext reactApplicationContext, int i11, String str) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i11);
        writableArrayCreateArray.pushString(str);
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkData", writableArrayCreateArray);
        }
    }

    public static void onDataReceivedProgress(@Nullable ReactApplicationContext reactApplicationContext, int i11, long j11, long j12) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i11);
        writableArrayCreateArray.pushInt((int) j11);
        writableArrayCreateArray.pushInt((int) j12);
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkDataProgress", writableArrayCreateArray);
        }
    }

    public static void onDataSend(@Nullable ReactApplicationContext reactApplicationContext, int i11, long j11, long j12) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i11);
        writableArrayCreateArray.pushInt((int) j11);
        writableArrayCreateArray.pushInt((int) j12);
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didSendNetworkData", writableArrayCreateArray);
        }
    }

    public static void onIncrementalDataReceived(@Nullable ReactApplicationContext reactApplicationContext, int i11, String str, long j11, long j12) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i11);
        writableArrayCreateArray.pushString(str);
        writableArrayCreateArray.pushInt((int) j11);
        writableArrayCreateArray.pushInt((int) j12);
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkIncrementalData", writableArrayCreateArray);
        }
    }

    public static void onRequestError(@Nullable ReactApplicationContext reactApplicationContext, int i11, String str, Throwable th2) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i11);
        writableArrayCreateArray.pushString(str);
        if (th2 != null && th2.getClass() == SocketTimeoutException.class) {
            writableArrayCreateArray.pushBoolean(true);
        }
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didCompleteNetworkResponse", writableArrayCreateArray);
        }
    }

    public static void onRequestSuccess(@Nullable ReactApplicationContext reactApplicationContext, int i11) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i11);
        writableArrayCreateArray.pushNull();
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didCompleteNetworkResponse", writableArrayCreateArray);
        }
    }

    public static void onResponseReceived(@Nullable ReactApplicationContext reactApplicationContext, int i11, int i12, WritableMap writableMap, String str) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i11);
        writableArrayCreateArray.pushInt(i12);
        writableArrayCreateArray.pushMap(writableMap);
        writableArrayCreateArray.pushString(str);
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkResponse", writableArrayCreateArray);
        }
    }

    public static void onDataReceived(@Nullable ReactApplicationContext reactApplicationContext, int i11, WritableMap writableMap) {
        WritableArray writableArrayCreateArray = Arguments.createArray();
        writableArrayCreateArray.pushInt(i11);
        writableArrayCreateArray.pushMap(writableMap);
        if (reactApplicationContext != null) {
            reactApplicationContext.emitDeviceEvent("didReceiveNetworkData", writableArrayCreateArray);
        }
    }
}
