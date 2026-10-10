package com.geetest.gtc4;

import android.content.Context;
import android.webkit.URLUtil;

/* JADX INFO: renamed from: com.geetest.gtc4.w3 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6909w3 {

    /* JADX INFO: renamed from: a */
    public String f11542a;

    /* JADX INFO: renamed from: b */
    public String f11543b = "https://riskct.geetest.com/g2/api/v1/client_report";

    /* JADX INFO: renamed from: a */
    public final void m12739a(final Context context, String str, String str2, final GeeGuard.CallbackHandler callbackHandler) {
        if (str != null && !str.isEmpty()) {
            this.f11542a = str;
        }
        if (str2 != null && !str2.isEmpty() && URLUtil.isValidUrl(str2)) {
            this.f11543b = str2;
        }
        AbstractC6882t3.m12719a(context.getSharedPreferences("gt_core", 0));
        AbstractC6891u3.m12728a(context);
        if (callbackHandler == null) {
            return;
        }
        if (this.f11543b.equals("https://riskct.geetest.com/g2/api/v1/client_report")) {
            new Thread(new Runnable() { // from class: v7.k
                @Override // java.lang.Runnable
                public final void run() {
                    this.f102474b.m12740b(context, callbackHandler);
                }
            }).start();
        } else {
            new Thread(new Runnable() { // from class: v7.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f102471b.m12737a(context, callbackHandler);
                }
            }).start();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m12740b(Context context, GeeGuard.CallbackHandler callbackHandler) {
        AbstractC6900v3.f11537a.m12741b(context, null, 5000, callbackHandler);
    }

    /* JADX INFO: renamed from: b */
    public final void m12741b(final Context context, final String str, final int i11, final GeeGuard.CallbackHandler callbackHandler) {
        new Thread(new Runnable() { // from class: v7.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f102477b.m12738a(context, str, i11, callbackHandler);
            }
        }).start();
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m12737a(Context context, GeeGuard.CallbackHandler callbackHandler) {
        m12741b(context, null, 5000, callbackHandler);
    }

    /* JADX INFO: renamed from: a */
    public final GeeGuardReceipt m12736a(Context context, String str) {
        String str2 = this.f11542a;
        if (str2 == null || str2.isEmpty()) {
            return null;
        }
        return AbstractC6864r3.m12707a(context, this.f11542a, str);
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ void m12738a(Context context, String str, int i11, GeeGuard.CallbackHandler callbackHandler) {
        AbstractC6864r3.m12708a(context, this.f11542a, str, i11, this.f11543b, callbackHandler);
    }
}
