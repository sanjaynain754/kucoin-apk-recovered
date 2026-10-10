package com.tencent.bugly.proguard;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import okhttp3.Call;
import okhttp3.EventListener;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.x7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C34015x7 implements EventListener.Factory, InterfaceC33729j8 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC33540a8 f72498a;

    /* JADX INFO: renamed from: b */
    public C33995w7 f72499b = null;

    /* JADX INFO: renamed from: c */
    public final AtomicBoolean f72500c = new AtomicBoolean(false);

    /* JADX INFO: renamed from: a */
    public void m75448a() {
        this.f72500c.compareAndSet(false, true);
        C33995w7 c33995w7 = this.f72499b;
        if (c33995w7 != null) {
            c33995w7.m75356d();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m75449b() {
        this.f72500c.compareAndSet(true, false);
        C33995w7 c33995w7 = this.f72499b;
        if (c33995w7 != null) {
            c33995w7.m75357e();
        }
    }

    @Override // okhttp3.EventListener.Factory
    public EventListener create(Call call) {
        if (!this.f72500c.get()) {
            return null;
        }
        if (this.f72499b == null) {
            synchronized (C34015x7.class) {
                try {
                    if (this.f72499b == null) {
                        this.f72499b = new C33995w7(this.f72498a);
                    }
                    this.f72499b.m75356d();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        return this.f72499b;
    }

    @Override // com.tencent.bugly.proguard.InterfaceC33729j8
    public void onCallEnd(Call call, boolean z11, IOException iOException) {
        C33995w7 c33995w7 = this.f72499b;
        if (c33995w7 != null) {
            if (z11) {
                c33995w7.callFailed(call, iOException);
            } else {
                c33995w7.callEnd(call);
            }
        }
    }

    public C34015x7(InterfaceC33540a8 interfaceC33540a8) {
        this.f72498a = interfaceC33540a8;
    }
}
