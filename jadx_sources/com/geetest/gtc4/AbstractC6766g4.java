package com.geetest.gtc4;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.IBinder;
import android.os.IInterface;
import android.text.TextUtils;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: com.geetest.gtc4.g4 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6766g4 {

    /* JADX INFO: renamed from: b */
    public static String f11369b;

    /* JADX INFO: renamed from: c */
    public static boolean f11370c;

    /* JADX INFO: renamed from: d */
    public static boolean f11371d;

    /* JADX INFO: renamed from: e */
    public static final CountDownLatch f11372e = new CountDownLatch(1);

    /* JADX INFO: renamed from: a */
    public ServiceConnectionC6757f4 f11373a;

    /* JADX INFO: renamed from: b */
    public final boolean m12639b(Context context) {
        if (context != null && !TextUtils.isEmpty("com.huawei.hwid")) {
            if (this.f11373a == null) {
                this.f11373a = new ServiceConnectionC6757f4(f11372e);
            }
            Intent intent = new Intent();
            C6748e4 c6748e4 = null;
            if (TextUtils.isEmpty(null)) {
                intent.setPackage("com.huawei.hwid");
            } else {
                intent.setComponent(new ComponentName("com.huawei.hwid", (String) null));
            }
            if (!TextUtils.isEmpty("com.uodis.opendevice.OPENIDS_SERVICE")) {
                intent.setAction("com.uodis.opendevice.OPENIDS_SERVICE");
            }
            ServiceConnectionC6757f4 serviceConnectionC6757f4 = this.f11373a;
            if (serviceConnectionC6757f4.f11358a != null) {
                return true;
            }
            try {
                boolean zBindService = context.bindService(intent, serviceConnectionC6757f4, 1);
                serviceConnectionC6757f4.f11359b.await(1L, TimeUnit.SECONDS);
                IBinder iBinder = serviceConnectionC6757f4.f11360c;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                    c6748e4 = iInterfaceQueryLocalInterface instanceof C6748e4 ? (C6748e4) iInterfaceQueryLocalInterface : new C6748e4(iBinder);
                }
                serviceConnectionC6757f4.f11358a = c6748e4;
                return zBindService;
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: a */
    public final boolean m12638a(Context context) {
        if (f11371d) {
            return f11370c;
        }
        boolean z11 = false;
        if (context == null || TextUtils.isEmpty("com.huawei.hwid")) {
            f11370c = false;
        } else {
            try {
                if (AbstractC6775h4.f11386d == null) {
                    AbstractC6775h4.f11386d = context.getPackageManager();
                }
                PackageInfo packageInfo = AbstractC6775h4.f11386d.getPackageInfo("com.huawei.hwid", 0);
                if (Build.VERSION.SDK_INT >= 28) {
                    return packageInfo != null && packageInfo.getLongVersionCode() >= 1;
                }
                if (packageInfo != null && packageInfo.versionCode > 0) {
                    z11 = true;
                }
                f11370c = z11;
            } catch (Throwable unused) {
                return false;
            }
        }
        f11371d = true;
        return f11370c;
    }
}
