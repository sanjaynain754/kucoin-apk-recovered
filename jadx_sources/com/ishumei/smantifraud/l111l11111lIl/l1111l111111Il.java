package com.ishumei.smantifraud.l111l11111lIl;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes.dex */
public final class l1111l111111Il {
    private static int l1111l111111Il;

    public static int l1111l111111Il(Context context) {
        if (context == null) {
            return 0;
        }
        int i11 = l1111l111111Il;
        if (i11 != 0) {
            return i11;
        }
        try {
            SharedPreferences sharedPreferences = context.getSharedPreferences("auc", 0);
            int i12 = sharedPreferences.getInt("auc", 0) + 1;
            sharedPreferences.edit().putInt("auc", i12).apply();
            l1111l111111Il = i12;
            return i12;
        } catch (Exception unused) {
            return 0;
        }
    }
}
