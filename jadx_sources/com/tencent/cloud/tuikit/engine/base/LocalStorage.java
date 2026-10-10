package com.tencent.cloud.tuikit.engine.base;

import android.content.SharedPreferences;
import com.tencent.cloud.tuikit.engine.common.ContextProvider;
import com.tencent.liteav.base.annotations.CalledByNative;
import com.tencent.liteav.base.annotations.JNINamespace;

/* JADX INFO: loaded from: classes59.dex */
@JNINamespace("tuikit::engine::basic")
public class LocalStorage {
    private static final String LOCAL_STORAGE_KEY_PREFIX = "__tuikit_room_engine__";
    private static final String PREFERENCE_FILE_NAME = "tuikit_room_engine_settings";
    private long mNativeLocalStorage;
    private final SharedPreferences mPreferences = ContextProvider.getApplicationContext().getSharedPreferences(PREFERENCE_FILE_NAME, 0);

    @CalledByNative
    public void destroy() {
        this.mNativeLocalStorage = 0L;
    }

    @CalledByNative
    public boolean getBool(String str, boolean z11) {
        if (str == null) {
            return z11;
        }
        return this.mPreferences.getBoolean(LOCAL_STORAGE_KEY_PREFIX + str, z11);
    }

    @CalledByNative
    public String getString(String str, String str2) {
        if (str == null) {
            return str2;
        }
        return this.mPreferences.getString(LOCAL_STORAGE_KEY_PREFIX + str, str2);
    }

    @CalledByNative
    public long getUInt64(String str, long j11) {
        if (str == null) {
            return j11;
        }
        return this.mPreferences.getLong(LOCAL_STORAGE_KEY_PREFIX + str, j11);
    }

    @CalledByNative
    public boolean isKeyExists(String str) {
        if (str == null) {
            return false;
        }
        return this.mPreferences.contains(LOCAL_STORAGE_KEY_PREFIX + str);
    }

    @CalledByNative
    public void removeKey(String str) {
        if (str == null) {
            return;
        }
        this.mPreferences.edit().remove(LOCAL_STORAGE_KEY_PREFIX + str).apply();
    }

    @CalledByNative
    public void setBool(String str, boolean z11) {
        if (str == null) {
            return;
        }
        this.mPreferences.edit().putBoolean(LOCAL_STORAGE_KEY_PREFIX + str, z11).apply();
    }

    @CalledByNative
    public void setString(String str, String str2) {
        if (str == null) {
            return;
        }
        this.mPreferences.edit().putString(LOCAL_STORAGE_KEY_PREFIX + str, str2).apply();
    }

    @CalledByNative
    public void setUInt64(String str, long j11) {
        if (str == null) {
            return;
        }
        this.mPreferences.edit().putLong(LOCAL_STORAGE_KEY_PREFIX + str, j11).apply();
    }

    @CalledByNative
    public LocalStorage(long j11) {
        this.mNativeLocalStorage = j11;
    }
}
