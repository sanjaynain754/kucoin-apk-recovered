package com.datavisorobfus;

import android.content.ContentProviderClient;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;

/* JADX INFO: renamed from: com.datavisorobfus.j0 */
/* JADX INFO: loaded from: classes34.dex */
public class C5425j0 implements InterfaceC5406c0 {

    /* JADX INFO: renamed from: a */
    private Context f7291a;

    @Override // com.datavisorobfus.InterfaceC5406c0
    /* JADX INFO: renamed from: a */
    public void mo7110a(InterfaceC5403b0 interfaceC5403b0) {
        ContentProviderClient contentProviderClientAcquireContentProviderClient;
        Throwable th2;
        try {
            try {
                String string = "";
                contentProviderClientAcquireContentProviderClient = this.f7291a.getContentResolver().acquireContentProviderClient(Uri.parse("content://cn.nubia.identity/identity"));
                if (contentProviderClientAcquireContentProviderClient != null) {
                    try {
                        Bundle bundleCall = contentProviderClientAcquireContentProviderClient.call("getOAID", null, null);
                        if (bundleCall != null && bundleCall.getInt("code", -1) == 0) {
                            string = bundleCall.getString("id");
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        try {
                            C5415f0.m7139a(th2);
                            if (interfaceC5403b0 != null) {
                                try {
                                    interfaceC5403b0.mo7113a("empty");
                                } catch (Throwable th4) {
                                    C5415f0.m7139a(th4);
                                }
                            }
                            if (contentProviderClientAcquireContentProviderClient == null) {
                                return;
                            } else {
                                contentProviderClientAcquireContentProviderClient.close();
                            }
                        } catch (Throwable th5) {
                            if (contentProviderClientAcquireContentProviderClient != null) {
                                try {
                                    contentProviderClientAcquireContentProviderClient.close();
                                } catch (Throwable th6) {
                                    C5415f0.m7139a(th6);
                                }
                            }
                            throw th5;
                        }
                    }
                }
                if (C5457z0.m7480a(string)) {
                    string = "empty";
                }
                if (interfaceC5403b0 != null) {
                    try {
                        interfaceC5403b0.mo7113a(string);
                    } catch (Throwable th7) {
                        C5415f0.m7139a(th7);
                    }
                }
                if (contentProviderClientAcquireContentProviderClient != null) {
                    contentProviderClientAcquireContentProviderClient.close();
                }
            } catch (Throwable th8) {
                C5415f0.m7139a(th8);
            }
        } catch (Throwable th9) {
            contentProviderClientAcquireContentProviderClient = null;
            th2 = th9;
        }
    }

    @Override // com.datavisorobfus.InterfaceC5406c0
    /* JADX INFO: renamed from: a */
    public boolean mo7111a() {
        return Build.VERSION.SDK_INT >= 29;
    }

    public C5425j0(Context context) {
        this.f7291a = context;
    }
}
