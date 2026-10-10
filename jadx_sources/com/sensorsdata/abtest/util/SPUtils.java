package com.sensorsdata.abtest.util;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes23.dex */
public final class SPUtils {
    private static SPUtils sInstance;

    /* JADX INFO: renamed from: sp */
    private SharedPreferences f56490sp;

    private static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i11 = 0; i11 < length; i11++) {
            if (!Character.isWhitespace(str.charAt(i11))) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        clear(false);
    }

    public boolean getBoolean(String str) {
        return getBoolean(str, false);
    }

    public float getFloat(String str) {
        return getFloat(str, -1.0f);
    }

    public int getInt(String str) {
        return getInt(str, -1);
    }

    public long getLong(String str) {
        return getLong(str, -1L);
    }

    public String getString(String str) {
        return getString(str, "");
    }

    public Set<String> getStringSet(String str) {
        return getStringSet(str, Collections.EMPTY_SET);
    }

    public void put(String str, String str2) {
        put(str, str2, false);
    }

    public void remove(String str) {
        remove(str, false);
    }

    public static SPUtils getInstance() {
        if (sInstance == null) {
            synchronized (SPUtils.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new SPUtils();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return sInstance;
    }

    public void clear(boolean z11) {
        if (z11) {
            this.f56490sp.edit().clear().commit();
        } else {
            this.f56490sp.edit().clear().apply();
        }
    }

    public boolean contains(String str) {
        return this.f56490sp.contains(str);
    }

    public Map<String, ?> getAll() {
        return this.f56490sp.getAll();
    }

    public boolean getBoolean(String str, boolean z11) {
        return this.f56490sp.getBoolean(str, z11);
    }

    public float getFloat(String str, float f11) {
        return this.f56490sp.getFloat(str, f11);
    }

    public int getInt(String str, int i11) {
        return this.f56490sp.getInt(str, i11);
    }

    public long getLong(String str, long j11) {
        return this.f56490sp.getLong(str, j11);
    }

    public String getString(String str, String str2) {
        return this.f56490sp.getString(str, str2);
    }

    public Set<String> getStringSet(String str, Set<String> set) {
        return this.f56490sp.getStringSet(str, set);
    }

    public void init(Context context) {
        if (this.f56490sp == null) {
            this.f56490sp = context.getApplicationContext().getSharedPreferences("spUtils", 0);
        }
    }

    public void put(String str, String str2, boolean z11) {
        if (z11) {
            this.f56490sp.edit().putString(str, str2).commit();
        } else {
            this.f56490sp.edit().putString(str, str2).apply();
        }
    }

    public void remove(String str, boolean z11) {
        if (z11) {
            this.f56490sp.edit().remove(str).commit();
        } else {
            this.f56490sp.edit().remove(str).apply();
        }
    }

    public void put(String str, int i11) {
        put(str, i11, false);
    }

    public void put(String str, int i11, boolean z11) {
        if (z11) {
            this.f56490sp.edit().putInt(str, i11).commit();
        } else {
            this.f56490sp.edit().putInt(str, i11).apply();
        }
    }

    public void put(String str, long j11) {
        put(str, j11, false);
    }

    public void put(String str, long j11, boolean z11) {
        if (z11) {
            this.f56490sp.edit().putLong(str, j11).commit();
        } else {
            this.f56490sp.edit().putLong(str, j11).apply();
        }
    }

    public void put(String str, float f11) {
        put(str, f11, false);
    }

    public void put(String str, float f11, boolean z11) {
        if (z11) {
            this.f56490sp.edit().putFloat(str, f11).commit();
        } else {
            this.f56490sp.edit().putFloat(str, f11).apply();
        }
    }

    public void put(String str, boolean z11) {
        put(str, z11, false);
    }

    public void put(String str, boolean z11, boolean z12) {
        if (z12) {
            this.f56490sp.edit().putBoolean(str, z11).commit();
        } else {
            this.f56490sp.edit().putBoolean(str, z11).apply();
        }
    }

    public void put(String str, Set<String> set) {
        put(str, set, false);
    }

    public void put(String str, Set<String> set, boolean z11) {
        if (z11) {
            this.f56490sp.edit().putStringSet(str, set).commit();
        } else {
            this.f56490sp.edit().putStringSet(str, set).apply();
        }
    }
}
