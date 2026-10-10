package com.tencent.cloud.tuikit.engine.common;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.util.Log;
import com.tencent.cloud.tuikit.engine.impl.call.PlatformBroadcastReceiver;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes59.dex */
public class ContextProvider extends ContentProvider {
    private static final String TAG = "ContextProvider";
    private static Context mApplicationContext;
    private PlatformBroadcastReceiver broadcastReceiver;

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        return 0;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        return 0;
    }

    public static Context getApplicationContext() {
        if (mApplicationContext == null) {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                Object objInvoke = method.invoke(null, new Object[0]);
                mApplicationContext = (Context) objInvoke.getClass().getMethod("getApplication", new Class[0]).invoke(objInvoke, new Object[0]);
            } catch (Exception e11) {
                Log.e(TAG, "get context fail, e=" + e11.getMessage());
            }
        }
        return mApplicationContext;
    }

    public static void setContext(Context context) {
        if (context == null || mApplicationContext != null) {
            return;
        }
        mApplicationContext = context.getApplicationContext();
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        return "";
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        mApplicationContext = getContext().getApplicationContext();
        this.broadcastReceiver = new PlatformBroadcastReceiver();
        return false;
    }
}
