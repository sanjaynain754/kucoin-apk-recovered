package com.forter.mobile.fortersdk;

import android.content.Context;
import android.provider.Settings;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: com.forter.mobile.fortersdk.o0 */
/* JADX INFO: compiled from: bm.java */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6581o0 {
    /* JADX INFO: renamed from: c */
    public static int m12443c(@NonNull Context context) {
        return -2;
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public static String m12442b(@NonNull Context context) {
        return "N/A";
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public static String m12441a(@NonNull Context context) {
        try {
            int i11 = Settings.Secure.getInt(context.getContentResolver(), "location_mode");
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            return "LOCATION_MODE_HIGH_ACCURACY";
                        }
                        return "LOCATION_MODE_FAILED";
                    }
                    return "LOCATION_MODE_BATTERY_SAVING";
                }
                return "LOCATION_MODE_SENSORS_ONLY";
            }
            return "LOCATION_MODE_OFF";
        } catch (Settings.SettingNotFoundException unused) {
            return "LOCATION_MODE_FAILED";
        }
    }
}
