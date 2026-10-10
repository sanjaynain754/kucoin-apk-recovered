package com.tencent.bugly.network;

import com.tencent.bugly.proguard.C33627eb;
import java.io.IOException;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Response;

/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class BuglyCallbackProxy implements Callback {

    /* JADX INFO: renamed from: a */
    public final Callback f68759a;

    /* JADX INFO: renamed from: a */
    public void m72237a(Call call) {
        BuglyListenerFactory.getInstance().onCallEnd(call, false, null);
    }

    @Override // okhttp3.Callback
    public void onResponse(Call call, Response response) {
        IOException e11;
        boolean z11 = false;
        try {
            Callback callback = this.f68759a;
            if (callback != null) {
                callback.onResponse(call, response);
            }
            e11 = null;
            if (response != null && response.isSuccessful()) {
                z11 = true;
            }
        } catch (IOException e12) {
            e11 = e12;
        } catch (Throwable th2) {
            e11 = new IOException(th2.getMessage() + C33627eb.f69716f + response);
        }
        if (z11) {
            m72237a(call);
            return;
        }
        if (e11 == null) {
            e11 = new IOException("Unexpected code: " + response);
        }
        m72238a(call, e11);
    }

    /* JADX INFO: renamed from: a */
    public void m72238a(Call call, IOException iOException) {
        BuglyListenerFactory.getInstance().onCallEnd(call, true, iOException);
    }

    @Override // okhttp3.Callback
    public void onFailure(Call call, IOException iOException) {
        try {
            Callback callback = this.f68759a;
            if (callback != null) {
                callback.onFailure(call, iOException);
            }
        } catch (Throwable unused) {
        }
        m72238a(call, iOException);
    }

    public BuglyCallbackProxy(Callback callback) {
        this.f68759a = callback;
    }
}
