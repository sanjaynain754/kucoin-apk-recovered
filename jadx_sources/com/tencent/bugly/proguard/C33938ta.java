package com.tencent.bugly.proguard;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ta */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33938ta {

    /* JADX INFO: renamed from: a */
    public static final String f72060a = "BuglyPro";

    /* JADX INFO: renamed from: b */
    public static final String f72061b = "BuglyOA";

    /* JADX INFO: renamed from: c */
    public static final String f72062c = "BuglyQQ";

    /* JADX INFO: renamed from: d */
    public static final String f72063d = "BuglySLALaunchEvent";

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ta$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ long f72064b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ long f72065c;

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ String f72066d;

        public a(long j11, long j12, String str) {
            this.f72064b = j11;
            this.f72065c = j12;
            this.f72066d = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (C33582c8.m72656a(C33582c8.f69395B)) {
                C33590cg.b.f69449a.m72708b(new C33590cg.d(C33591ch.m72746d(), C33938ta.f72063d, System.currentTimeMillis(), true, this.f72064b - this.f72065c, this.f72066d, null));
            } else {
                C34012x4.m75434a("launch time cost report is disabled.", new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public static void m75049a(long j11, long j12, boolean z11) {
        C33765l2 c33765l2;
        String str;
        if (C33765l2.m73827s() == null) {
            return;
        }
        if (z11) {
            str = f72060a;
        } else {
            synchronized (C33765l2.class) {
                c33765l2 = C33765l2.f70700C0;
            }
            if (c33765l2.f70756k0) {
                str = f72061b;
            } else {
                str = f72062c;
            }
        }
        C33784m0.m74004c().m74006a(new a(j12, j11, str));
    }
}
