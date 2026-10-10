package com.geetest.gtc4;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: renamed from: com.geetest.gtc4.c7 */
/* JADX INFO: loaded from: classes45.dex */
public abstract class AbstractC6733c7 {
    /* JADX INFO: renamed from: a */
    public static void m12621a(Context context, Intent intent, C6724b7 c6724b7) {
        ServiceConnectionC6751e7 serviceConnectionC6751e7 = new ServiceConnectionC6751e7(context, c6724b7, new C6742d7());
        try {
            Application application = serviceConnectionC6751e7.f11350a;
            if (application != null) {
                if (!application.bindService(intent, serviceConnectionC6751e7, 1)) {
                    throw new IllegalStateException("Service binding failed");
                }
            } else {
                C6724b7 c6724b8 = serviceConnectionC6751e7.f11351b;
                new IllegalStateException("Cannot get activity");
                c6724b8.f11322b.countDown();
            }
        } catch (Exception unused) {
            serviceConnectionC6751e7.f11351b.f11322b.countDown();
        }
    }
}
