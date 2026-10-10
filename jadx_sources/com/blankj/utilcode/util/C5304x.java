package com.blankj.utilcode.util;

import android.content.Intent;
import android.provider.Settings;
import androidx.annotation.RequiresApi;

/* JADX INFO: renamed from: com.blankj.utilcode.util.x */
/* JADX INFO: compiled from: PermissionUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5304x {
    @RequiresApi(api = 23)
    /* JADX INFO: renamed from: a */
    public static boolean m6513a() {
        return Settings.canDrawOverlays(C5287o0.m6331a());
    }

    /* JADX INFO: renamed from: b */
    public static void m6514b() {
        Intent intentM6498u = C5299u0.m6498u(C5287o0.m6331a().getPackageName(), true);
        if (!C5299u0.m6467E(intentM6498u)) {
            return;
        }
        C5287o0.m6331a().startActivity(intentM6498u);
    }
}
