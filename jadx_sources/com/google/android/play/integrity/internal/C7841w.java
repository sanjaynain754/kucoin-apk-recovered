package com.google.android.play.integrity.internal;

import com.google.android.gms.tasks.TaskCompletionSource;

/* JADX INFO: renamed from: com.google.android.play.integrity.internal.w */
/* JADX INFO: compiled from: com.google.android.play:integrity@@1.3.0 */
/* JADX INFO: loaded from: classes45.dex */
final class C7841w extends AbstractRunnableC7838t {

    /* JADX INFO: renamed from: a */
    final /* synthetic */ TaskCompletionSource f12121a;

    /* JADX INFO: renamed from: b */
    final /* synthetic */ AbstractRunnableC7838t f12122b;

    /* JADX INFO: renamed from: c */
    final /* synthetic */ C7810ae f12123c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7841w(C7810ae c7810ae, TaskCompletionSource taskCompletionSource, TaskCompletionSource taskCompletionSource2, AbstractRunnableC7838t abstractRunnableC7838t) {
        super(taskCompletionSource);
        this.f12123c = c7810ae;
        this.f12121a = taskCompletionSource2;
        this.f12122b = abstractRunnableC7838t;
    }

    @Override // com.google.android.play.integrity.internal.AbstractRunnableC7838t
    /* JADX INFO: renamed from: b */
    public final void mo13221b() {
        synchronized (this.f12123c.f12098g) {
            try {
                C7810ae.m13286o(this.f12123c, this.f12121a);
                if (this.f12123c.f12104m.getAndIncrement() > 0) {
                    this.f12123c.f12094c.m13326d("Already connected to the service.", new Object[0]);
                }
                C7810ae.m13288q(this.f12123c, this.f12122b);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
