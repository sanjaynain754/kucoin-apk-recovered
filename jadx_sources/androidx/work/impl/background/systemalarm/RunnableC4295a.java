package androidx.work.impl.background.systemalarm;

/* JADX INFO: renamed from: androidx.work.impl.background.systemalarm.a */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes34.dex */
public final /* synthetic */ class RunnableC4295a implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ DelayMetCommandHandler f3731b;

    @Override // java.lang.Runnable
    public final void run() {
        this.f3731b.stopWork();
    }

    public /* synthetic */ RunnableC4295a(DelayMetCommandHandler delayMetCommandHandler) {
        this.f3731b = delayMetCommandHandler;
    }
}
