package com.sumsub.sentry;

import android.content.Context;
import com.sumsub.log.logger.Logger;
import com.sumsub.sns.BuildConfig;
import com.sumsub.sns.internal.core.exception.SNSCallbacksLostOnRestoreException;
import com.sumsub.sns.internal.log.C33272c;
import com.sumsub.sns.internal.log.cacher.InterfaceC33275c;
import kotlinx.coroutines.C41696j;

/* JADX INFO: renamed from: com.sumsub.sentry.Y */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC27905Y {

    /* JADX INFO: renamed from: a */
    public static boolean f56993a;

    /* JADX INFO: renamed from: b */
    public static String f56994b;

    /* JADX INFO: renamed from: c */
    public static C27997t0 f56995c;

    /* JADX INFO: renamed from: a */
    public static void m68987a(SNSCallbacksLostOnRestoreException sNSCallbacksLostOnRestoreException) {
        C27997t0 c27997t0 = f56995c;
        if (c27997t0 != null) {
            C41696j.m91104d(c27997t0.f57134c, null, null, new C27993s0(c27997t0, sNSCallbacksLostOnRestoreException, null), 3, null);
            return;
        }
        Logger.DefaultImpls.w$default(C33272c.f67812a, "Sentry", "captureException called before init; dropping " + sNSCallbacksLostOnRestoreException, null, 4, null);
    }

    /* JADX INFO: renamed from: a */
    public static void m68986a(Context context, InterfaceC33275c interfaceC33275c) {
        boolean z11 = f56993a;
        f56993a = true;
        if (z11) {
            return;
        }
        f56994b = BuildConfig.SENTRY_PROGUARD_UUID;
        C33272c c33272c = C33272c.f67812a;
        String str = f56994b;
        if (str == null) {
            str = "<not set>";
        }
        Logger.DefaultImpls.d$default(c33272c, "Sentry", "SDK build UUID: " + str, null, 4, null);
        f56995c = new C27997t0(new C27929c0(context), interfaceC33275c);
    }
}
