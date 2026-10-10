package com.tencent.mmkv;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Process;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes45.dex */
public class MMKVContentProvider extends ContentProvider {
    protected static final String FUNCTION_NAME = "mmkvFromAshmemID";
    protected static final String KEY = "KEY";
    protected static final String KEY_CRYPT = "KEY_CRYPT";
    protected static final String KEY_MODE = "KEY_MODE";
    protected static final String KEY_SIZE = "KEY_SIZE";
    private static Uri gUri;

    @Override // android.content.ContentProvider
    @Nullable
    public String getType(@NonNull Uri uri) {
        return null;
    }

    @Nullable
    public static Uri contentUri(Context context) {
        String strQueryAuthority;
        Uri uri = gUri;
        if (uri != null) {
            return uri;
        }
        if (context == null || (strQueryAuthority = queryAuthority(context)) == null) {
            return null;
        }
        Uri uri2 = Uri.parse("content://" + strQueryAuthority);
        gUri = uri2;
        return uri2;
    }

    @Nullable
    private static String queryAuthority(Context context) {
        ProviderInfo providerInfo;
        try {
            ComponentName componentName = new ComponentName(context, MMKVContentProvider.class.getName());
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (providerInfo = packageManager.getProviderInfo(componentName, 0)) == null) {
                return null;
            }
            return providerInfo.authority;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Bundle call(@NonNull String str, @Nullable String str2, @Nullable Bundle bundle) {
        if (str.equals(FUNCTION_NAME) && bundle != null) {
            try {
                return mmkvFromAshmemID(str2, bundle.getInt(KEY_SIZE), bundle.getInt(KEY_MODE), bundle.getString(KEY_CRYPT));
            } catch (Exception e11) {
                Log.e("MMKV", e11.getMessage());
            }
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int delete(@NonNull Uri uri, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Uri insert(@NonNull Uri uri, @Nullable ContentValues contentValues) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.ContentProvider
    @Nullable
    public Cursor query(@NonNull Uri uri, @Nullable String[] strArr, @Nullable String str, @Nullable String[] strArr2, @Nullable String str2) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    @Override // android.content.ContentProvider
    public int update(@NonNull Uri uri, @Nullable ContentValues contentValues, @Nullable String str, @Nullable String[] strArr) {
        throw new UnsupportedOperationException("Not implement in MMKV");
    }

    public static String getProcessNameByPID(@NonNull Context context, int i11) {
        if (i11 == Process.myPid()) {
            return MMKVProcessUtil.getCurrentProcessName(context);
        }
        ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
        if (activityManager != null) {
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo.pid == i11) {
                    return runningAppProcessInfo.processName;
                }
            }
            return "";
        }
        return "";
    }

    @NonNull
    private Bundle mmkvFromAshmemID(String str, int i11, int i12, String str2) throws RuntimeException {
        MMKV mmkvMmkvWithAshmemID = MMKV.mmkvWithAshmemID(getContext(), str, i11, i12, str2);
        ParcelableMMKV parcelableMMKV = new ParcelableMMKV(mmkvMmkvWithAshmemID);
        Log.i("MMKV", str + " fd = " + mmkvMmkvWithAshmemID.ashmemFD() + ", meta fd = " + mmkvMmkvWithAshmemID.ashmemMetaFD());
        Bundle bundle = new Bundle();
        bundle.putParcelable(KEY, parcelableMMKV);
        return bundle;
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        if (getContext() == null) {
            return false;
        }
        return true;
    }
}
