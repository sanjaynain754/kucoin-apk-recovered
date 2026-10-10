package com.geetest.gtc4;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: com.geetest.gtc4.c6 */
/* JADX INFO: loaded from: classes45.dex */
public final class C6732c6 implements InterfaceC6919x4 {

    /* JADX INFO: renamed from: a */
    public final Context f11332a;

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final boolean mo12620a() {
        return Build.VERSION.SDK_INT >= 29;
    }

    @Override // com.geetest.gtc4.InterfaceC6919x4
    /* JADX INFO: renamed from: a */
    public final void mo12619a(C6783i3 c6783i3) {
        if (this.f11332a != null) {
            if (!mo12620a()) {
                new C6750e6("Only supports Android 10.0 and above for Nubia");
                c6783i3.f11392b.countDown();
                return;
            }
            try {
                ContentProviderClient contentProviderClientAcquireContentProviderClient = this.f11332a.getContentResolver().acquireContentProviderClient(Uri.parse("content://cn.nubia.identity/identity"));
                if (contentProviderClientAcquireContentProviderClient == null) {
                    return;
                }
                Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call("getOAID", null, null);
                contentProviderClientAcquireContentProviderClient.close();
                if (bundleCall == null) {
                    throw new C6750e6("OAID query failed: bundle is null");
                }
                String string = bundleCall.getInt("code", -1) == 0 ? bundleCall.getString("id") : null;
                if (string == null || string.isEmpty()) {
                    throw new C6750e6("OAID query failed: " + bundleCall.getString("message"));
                }
                c6783i3.f11391a.set(string);
                c6783i3.f11392b.countDown();
            } catch (Exception unused) {
                c6783i3.f11392b.countDown();
            }
        }
    }

    public C6732c6(Context context) {
        this.f11332a = context;
    }
}
