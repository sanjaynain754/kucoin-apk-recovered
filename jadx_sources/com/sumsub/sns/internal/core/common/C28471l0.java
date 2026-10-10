package com.sumsub.sns.internal.core.common;

import android.net.ConnectivityManager;
import android.net.Network;
import com.sumsub.sns.internal.log.AbstractC33293d;
import com.sumsub.sns.internal.log.AbstractC33294e;
import com.sumsub.sns.internal.log.C33272c;
import p852kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: com.sumsub.sns.internal.core.common.l0 */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class C28471l0 extends ConnectivityManager.NetworkCallback {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ C28474m0 f58009a;

    public C28471l0(C28474m0 c28474m0) {
        this.f58009a = c28474m0;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        super.onAvailable(network);
        try {
            C28474m0 c28474m0 = this.f58009a;
            Function1 function1 = c28474m0.f58012c;
            if (function1 != null) {
                function1.invoke(C28474m0.m69373a(c28474m0, c28474m0.f58010a));
            }
        } catch (Throwable th2) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(this), "Ooops", th2);
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        super.onLost(network);
        try {
            C28474m0 c28474m0 = this.f58009a;
            Function1 function1 = c28474m0.f58012c;
            if (function1 != null) {
                function1.invoke(C28474m0.m69373a(c28474m0, c28474m0.f58010a));
            }
        } catch (Throwable th2) {
            C33272c c33272c = C33272c.f67812a;
            AbstractC33293d.m71623a(AbstractC33294e.m71624a(this), "Ooops", th2);
        }
    }
}
