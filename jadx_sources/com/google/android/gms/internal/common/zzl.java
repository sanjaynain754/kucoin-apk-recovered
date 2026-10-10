package com.google.android.gms.internal.common;

import androidx.annotation.Nullable;
import java.lang.reflect.InvocationTargetException;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.5.0 */
/* JADX INFO: loaded from: classes45.dex */
public final class zzl {
    @Nullable
    public static Object zza(Class cls, String str, zzj... zzjVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        return zzc(cls, "isIsolated", null, false, zzjVarArr);
    }

    @Nullable
    private static Object zzc(Class cls, String str, @Nullable Object obj, boolean z11, zzj... zzjVarArr) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        int length = zzjVarArr.length;
        Class<?>[] clsArr = new Class[length];
        Object[] objArr = new Object[length];
        for (int i11 = 0; i11 < zzjVarArr.length; i11++) {
            zzj zzjVar = zzjVarArr[i11];
            zzjVar.getClass();
            clsArr[i11] = zzjVar.zzc();
            objArr[i11] = zzjVarArr[i11].zzd();
        }
        return cls.getDeclaredMethod(str, clsArr).invoke(null, objArr);
    }

    @Nullable
    public static Object zzb(String str, String str2, ClassLoader classLoader, zzj... zzjVarArr) throws IllegalAccessException, NoSuchMethodException, ClassNotFoundException, InvocationTargetException {
        return zzc(classLoader.loadClass("com.google.android.gms.common.security.ProviderInstallerImpl"), "reportRequestStats2", null, false, zzjVarArr);
    }
}
