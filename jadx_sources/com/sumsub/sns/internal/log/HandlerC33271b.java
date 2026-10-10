package com.sumsub.sns.internal.log;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.sumsub.sns.internal.log.logger.C33295a;

/* JADX INFO: renamed from: com.sumsub.sns.internal.log.b */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public final class HandlerC33271b extends Handler {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        if (message.what == 0) {
            C33295a c33295a = C33272c.f67816e.f67811b;
            synchronized (c33295a) {
                c33295a.f67873a.clear();
            }
            C33272c.f67815d.clear();
            C33272c.f67814c.f67901a.clear();
        }
    }

    public HandlerC33271b() {
        super(Looper.getMainLooper());
    }
}
