package com.geetest.gtc4;

import android.content.Context;
import android.text.TextUtils;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes45.dex */
public class OaidHelper {
    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    public static String getOaid(Context context) {
        boolean zMo12620a;
        String strM12655a;
        if (AbstractC6768g6.m12643c() || !TextUtils.isEmpty(AbstractC6768g6.m12640a("ro.build.version.emui", ""))) {
            zMo12620a = false;
            try {
                if (context.getPackageManager().getPackageInfo("com.huawei.hwid", 0) != null) {
                    zMo12620a = true;
                } else {
                    zMo12620a = AbstractC6759f6.m12632a(context).mo12620a();
                }
            } catch (Exception unused) {
            }
        } else {
            zMo12620a = AbstractC6759f6.m12632a(context).mo12620a();
        }
        if (!zMo12620a) {
            return "";
        }
        try {
            if (!AbstractC6768g6.m12643c() && TextUtils.isEmpty(AbstractC6768g6.m12640a("ro.build.version.emui", ""))) {
                AtomicReference atomicReference = new AtomicReference();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                C6783i3 c6783i3 = new C6783i3(atomicReference, countDownLatch);
                InterfaceC6919x4 interfaceC6919x4M12632a = AbstractC6759f6.m12632a(context);
                interfaceC6919x4M12632a.getClass();
                interfaceC6919x4M12632a.mo12619a(c6783i3);
                if (!countDownLatch.await(1L, TimeUnit.SECONDS)) {
                    return "";
                }
                strM12655a = (String) atomicReference.get();
            } else {
                strM12655a = AbstractC6775h4.m12655a(context);
            }
            return strM12655a;
        } catch (Throwable unused2) {
            return "";
        }
    }
}
