package p485o2;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import p628t1.InterfaceC44610b;

/* JADX INFO: renamed from: o2.b */
/* JADX INFO: compiled from: ApplicationVersionSignature.java */
/* JADX INFO: loaded from: classes.dex */
public final class C42948b {

    /* JADX INFO: renamed from: a */
    public static final ConcurrentMap<String, InterfaceC44610b> f95057a = new ConcurrentHashMap();

    @NonNull
    /* JADX INFO: renamed from: b */
    public static String m94280b(@Nullable PackageInfo packageInfo) {
        return packageInfo != null ? String.valueOf(packageInfo.versionCode) : UUID.randomUUID().toString();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static PackageInfo m94279a(@NonNull Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
        } catch (PackageManager.NameNotFoundException e11) {
            Log.e("AppVersionSignature", "Cannot resolve info for" + context.getPackageName(), e11);
            return null;
        }
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public static InterfaceC44610b m94281c(@NonNull Context context) {
        String packageName = context.getPackageName();
        ConcurrentMap<String, InterfaceC44610b> concurrentMap = f95057a;
        InterfaceC44610b interfaceC44610b = concurrentMap.get(packageName);
        if (interfaceC44610b == null) {
            InterfaceC44610b interfaceC44610bM94282d = m94282d(context);
            InterfaceC44610b interfaceC44610bPutIfAbsent = concurrentMap.putIfAbsent(packageName, interfaceC44610bM94282d);
            if (interfaceC44610bPutIfAbsent == null) {
                return interfaceC44610bM94282d;
            }
            return interfaceC44610bPutIfAbsent;
        }
        return interfaceC44610b;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public static InterfaceC44610b m94282d(@NonNull Context context) {
        return new C42950d(m94280b(m94279a(context)));
    }
}
