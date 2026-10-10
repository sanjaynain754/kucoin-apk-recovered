package io.flutter.plugins.webviewflutter;

/* JADX INFO: renamed from: io.flutter.plugins.webviewflutter.a3 */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class RunnableC38971a3 implements Runnable {

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ InstanceManager f86875b;

    @Override // java.lang.Runnable
    public final void run() {
        this.f86875b.releaseAllFinalizedInstances();
    }

    public /* synthetic */ RunnableC38971a3(InstanceManager instanceManager) {
        this.f86875b = instanceManager;
    }
}
