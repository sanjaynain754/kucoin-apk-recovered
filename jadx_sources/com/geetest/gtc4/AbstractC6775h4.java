package com.geetest.gtc4;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;

/* JADX INFO: renamed from: com.geetest.gtc4.h4 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6775h4 {

    /* JADX INFO: renamed from: a */
    public static final C6739d4 f11383a;

    /* JADX INFO: renamed from: b */
    public static Context f11384b;

    /* JADX INFO: renamed from: c */
    public static boolean f11385c;

    /* JADX INFO: renamed from: d */
    public static PackageManager f11386d;

    static {
        Build.MANUFACTURER.toUpperCase();
        f11383a = new C6739d4();
    }

    /* JADX INFO: renamed from: a */
    public static String m12655a(Context context) {
        C6739d4 c6739d4;
        ServiceConnectionC6757f4 serviceConnectionC6757f4;
        C6748e4 c6748e4;
        ServiceConnectionC6757f4 serviceConnectionC6757f5;
        C6739d4 c6739d5 = f11383a;
        if (c6739d5 != null && context != null) {
            Context applicationContext = context.getApplicationContext();
            f11384b = applicationContext;
            if (applicationContext != null) {
                try {
                    if (c6739d5.m12638a(applicationContext)) {
                        f11385c = c6739d5.m12639b(f11384b);
                    }
                } catch (Throwable unused) {
                }
            }
        }
        boolean z11 = f11385c;
        if (z11) {
            try {
                Context context2 = f11384b;
                if (context2 != null && (c6739d4 = f11383a) != null && z11) {
                    if (TextUtils.isEmpty(AbstractC6766g4.f11369b) && (serviceConnectionC6757f4 = c6739d4.f11373a) != null && (c6748e4 = serviceConnectionC6757f4.f11358a) != null) {
                        try {
                            String strM12629a = c6748e4.m12629a();
                            AbstractC6766g4.f11369b = strM12629a;
                            if (!TextUtils.isEmpty(strM12629a) && (serviceConnectionC6757f5 = c6739d4.f11373a) != null) {
                                context2.unbindService(serviceConnectionC6757f5);
                            }
                        } catch (Throwable unused2) {
                        }
                    }
                    return AbstractC6766g4.f11369b;
                }
            } catch (Throwable unused3) {
            }
        }
        return null;
    }
}
