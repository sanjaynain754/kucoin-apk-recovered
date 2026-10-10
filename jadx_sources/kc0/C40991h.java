package kc0;

import hc0.C38168a;

/* JADX INFO: renamed from: kc0.h */
/* JADX INFO: compiled from: LogThread.java */
/* JADX INFO: loaded from: classes2.dex */
public class C40991h extends Thread {

    /* JADX INFO: renamed from: kc0.h$a */
    /* JADX INFO: compiled from: LogThread.java */
    public class a implements Thread.UncaughtExceptionHandler {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ String f91094a;

        public a(String str) {
            this.f91094a = str;
        }

        @Override // java.lang.Thread.UncaughtExceptionHandler
        public void uncaughtException(Thread thread, Throwable th2) {
            C38168a.m86124a("producer", C38168a.m86126c("Uncaught error in thread, name=%s, e=%s", this.f91094a, th2.getMessage()));
        }
    }

    public C40991h(String str, boolean z11) {
        super(str);
        m89788a(str, z11);
    }

    /* JADX INFO: renamed from: a */
    public final void m89788a(String str, boolean z11) {
        setDaemon(z11);
        setUncaughtExceptionHandler(new a(str));
    }
}
