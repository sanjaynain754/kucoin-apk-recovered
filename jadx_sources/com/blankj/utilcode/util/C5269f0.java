package com.blankj.utilcode.util;

import android.app.ActivityManager;
import androidx.annotation.NonNull;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: com.blankj.utilcode.util.f0 */
/* JADX INFO: compiled from: ServiceUtils.java */
/* JADX INFO: loaded from: classes34.dex */
public final class C5269f0 {
    /* JADX INFO: renamed from: a */
    public static boolean m6185a(@NonNull Class<?> cls) {
        if (cls != null) {
            return m6186b(cls.getName());
        }
        throw new NullPointerException("Argument 'cls' of type Class<?> (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
    }

    /* JADX INFO: renamed from: b */
    public static boolean m6186b(@NonNull String str) {
        if (str == null) {
            throw new NullPointerException("Argument 'className' of type String (#0 out of 1, zero-based) is marked by @androidx.annotation.NonNull but got null for it");
        }
        List<ActivityManager.RunningServiceInfo> runningServices = ((ActivityManager) C5287o0.m6331a().getSystemService("activity")).getRunningServices(Integer.MAX_VALUE);
        if (runningServices != null && runningServices.size() != 0) {
            Iterator<ActivityManager.RunningServiceInfo> it = runningServices.iterator();
            while (it.hasNext()) {
                if (str.equals(it.next().service.getClassName())) {
                    return true;
                }
            }
        }
        return false;
    }
}
