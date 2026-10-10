package com.tencent.bugly.proguard;

import android.content.Context;
import android.os.Process;
import com.tencent.rmonitor.common.logger.LogState;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.rh */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33905rh {

    /* JADX INFO: renamed from: A */
    public static final int f71742A = 2;

    /* JADX INFO: renamed from: B */
    public static final String f71743B = "BUGLY_SYNC_UPLOAD";

    /* JADX INFO: renamed from: C */
    public static final String f71744C = "BUGLY_ASYNC_UPLOAD";

    /* JADX INFO: renamed from: l */
    public static final int f71745l = 1;

    /* JADX INFO: renamed from: m */
    public static final int f71746m = 2;

    /* JADX INFO: renamed from: n */
    public static final int f71747n = 0;

    /* JADX INFO: renamed from: o */
    public static final int f71748o = 1;

    /* JADX INFO: renamed from: p */
    public static final int f71749p = 2;

    /* JADX INFO: renamed from: q */
    public static final long f71750q = 30000;

    /* JADX INFO: renamed from: r */
    public static final String f71751r = "security_info";

    /* JADX INFO: renamed from: s */
    public static final long f71752s = 30000;

    /* JADX INFO: renamed from: t */
    public static final int f71753t = 5000;

    /* JADX INFO: renamed from: u */
    public static final int f71754u = 128;

    /* JADX INFO: renamed from: v */
    public static final long f71755v = 259200000;

    /* JADX INFO: renamed from: w */
    public static final int f71756w = 4;

    /* JADX INFO: renamed from: x */
    public static final int f71757x = 555;

    /* JADX INFO: renamed from: y */
    public static final String f71758y = "security_info";

    /* JADX INFO: renamed from: z */
    public static C33905rh f71759z;

    /* JADX INFO: renamed from: b */
    public final Context f71761b;

    /* JADX INFO: renamed from: c */
    public InterfaceC33885qh f71762c;

    /* JADX INFO: renamed from: e */
    public long f71764e;

    /* JADX INFO: renamed from: f */
    public long f71765f;

    /* JADX INFO: renamed from: d */
    public Map<Integer, Long> f71763d = new HashMap();

    /* JADX INFO: renamed from: g */
    public LinkedBlockingQueue<Runnable> f71766g = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: h */
    public LinkedBlockingQueue<Runnable> f71767h = new LinkedBlockingQueue<>();

    /* JADX INFO: renamed from: i */
    public final Object f71768i = new Object();

    /* JADX INFO: renamed from: j */
    public long f71769j = 0;

    /* JADX INFO: renamed from: k */
    public int f71770k = 0;

    /* JADX INFO: renamed from: a */
    public final C33620e4 f71760a = C33620e4.m72891a();

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.rh$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Runnable f71771b;

        public a(Runnable runnable) {
            this.f71771b = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f71771b.run();
            synchronized (C33905rh.this.f71768i) {
                C33905rh.m74875b(C33905rh.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.rh$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ int f71773b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ LinkedBlockingQueue f71774c;

        @Override // java.lang.Runnable
        public void run() {
            Runnable runnable;
            for (int i11 = 0; i11 < this.f71773b && (runnable = (Runnable) this.f71774c.poll()) != null; i11++) {
                runnable.run();
            }
        }

        public b(int i11, LinkedBlockingQueue linkedBlockingQueue) {
            this.f71773b = i11;
            this.f71774c = linkedBlockingQueue;
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m74875b(C33905rh c33905rh) {
        int i11 = c33905rh.f71770k - 1;
        c33905rh.f71770k = i11;
        return i11;
    }

    /* JADX INFO: renamed from: c */
    public synchronized long m74895c(int i11) {
        try {
            if (i11 >= 0) {
                Long l11 = this.f71763d.get(Integer.valueOf(i11));
                if (l11 != null) {
                    return l11.longValue();
                }
            } else {
                C34012x4.m75437b("[UploadManager] Unknown upload ID: %d", Integer.valueOf(i11));
            }
            return 0L;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public static synchronized C33905rh m74872a(Context context) {
        try {
            if (f71759z == null) {
                f71759z = new C33905rh(context);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return f71759z;
    }

    /* JADX INFO: renamed from: d */
    public static synchronized C33905rh m74876d() {
        return f71759z;
    }

    /* JADX INFO: renamed from: b */
    public void m74892b() {
        List<C33543ab> listM72905a = this.f71760a.m72905a(3);
        if (listM72905a == null || listM72905a.size() == 0) {
            return;
        }
        this.f71764e = 0L;
        this.f71760a.m72908a(listM72905a);
        C34012x4.m75434a("[UploadManager] Clear network consume.", new Object[0]);
    }

    public C33905rh(Context context) {
        this.f71761b = context;
    }

    /* JADX INFO: renamed from: c */
    public final boolean m74896c() {
        C34012x4.m75434a("[UploadManager] Drop security info of database (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        try {
            C33620e4 c33620e4M72891a = C33620e4.m72891a();
            if (c33620e4M72891a == null) {
                C34012x4.m75431a(LogState.WARN, "[UploadManager] Failed to get Database", new Object[0]);
                return false;
            }
            return c33620e4M72891a.m72910a(555, "security_info", (InterfaceC33599d4) null, true);
        } catch (Throwable th2) {
            C34012x4.m75432a(LogState.WARN, th2);
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public void m74880a(int i11, int i12, byte[] bArr, String str, String str2, InterfaceC33885qh interfaceC33885qh, long j11, boolean z11) {
        try {
            m74889a(new RunnableC33925sh(this.f71761b, i11, i12, bArr, str, str2, interfaceC33885qh, true, z11), true, true, j11);
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m74893b(int i11) {
        int i12 = 0;
        if (i11 < 0) {
            C34012x4.m75442d("[UploadManager] Number of task to execute should >= 0", new Object[0]);
            return;
        }
        C33784m0 c33784m0M74004c = C33784m0.m74004c();
        LinkedBlockingQueue<Runnable> linkedBlockingQueue = new LinkedBlockingQueue<>();
        LinkedBlockingQueue<Runnable> linkedBlockingQueue2 = new LinkedBlockingQueue<>();
        synchronized (this.f71768i) {
            try {
                C34012x4.m75434a("[UploadManager] Try to poll all upload task need and put them into temp queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
                int size = this.f71766g.size();
                int size2 = this.f71767h.size();
                if (size == 0 && size2 == 0) {
                    C34012x4.m75431a(LogState.DEBUG, "[UploadManager] There is no upload task in queue.", new Object[0]);
                    return;
                }
                if (i11 != 0) {
                    if (i11 < size) {
                        size2 = 0;
                    } else if (i11 < size + size2) {
                        size2 = i11 - size;
                    }
                    if (c33784m0M74004c != null && c33784m0M74004c.m74009d()) {
                        i12 = size2;
                    }
                    m74874a(this.f71766g, linkedBlockingQueue, i11);
                    m74874a(this.f71767h, linkedBlockingQueue2, i12);
                    m74894b(i11, linkedBlockingQueue);
                    m74885a(i12, linkedBlockingQueue2);
                }
                i11 = size;
                if (c33784m0M74004c != null) {
                    i12 = size2;
                }
                m74874a(this.f71766g, linkedBlockingQueue, i11);
                m74874a(this.f71767h, linkedBlockingQueue2, i12);
                m74894b(i11, linkedBlockingQueue);
                m74885a(i12, linkedBlockingQueue2);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m74883a(int i11, C33943tf c33943tf, String str, String str2, InterfaceC33885qh interfaceC33885qh, long j11, boolean z11) {
        m74880a(i11, c33943tf.f72108w, C33962ue.m75186a((Object) c33943tf), str, str2, interfaceC33885qh, j11, z11);
    }

    /* JADX INFO: renamed from: a */
    public void m74879a(int i11, int i12, byte[] bArr, String str, String str2, InterfaceC33885qh interfaceC33885qh, int i13, int i14, boolean z11, Map<String, String> map) {
        try {
            m74889a(new RunnableC33925sh(this.f71761b, i11, i12, bArr, str, str2, interfaceC33885qh, true, i13, i14, false, map), z11, false, 0L);
        } catch (Throwable th2) {
            if (C34012x4.m75438b(th2)) {
                return;
            }
            th2.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: a */
    public void m74881a(int i11, int i12, byte[] bArr, String str, String str2, InterfaceC33885qh interfaceC33885qh, boolean z11, Map<String, String> map) {
        m74879a(i11, i12, bArr, str, str2, interfaceC33885qh, 0, 0, z11, map);
    }

    /* JADX INFO: renamed from: a */
    public void m74886a(int i11, byte[] bArr, String str, String str2, InterfaceC33885qh interfaceC33885qh, boolean z11, boolean z12) {
        HashMap map;
        if (z12) {
            try {
                map = new HashMap();
                map.put("Content-Encoding", "encrypt");
                map.put("X-ENCRYPTION-VERSION", "v3");
            } catch (Throwable th2) {
                if (C34012x4.m75438b(th2)) {
                    return;
                }
                th2.printStackTrace();
                return;
            }
        } else {
            map = null;
        }
        m74889a(new C33550ai(this.f71761b, i11, C33556b3.f69067m, bArr, str, str2, interfaceC33885qh, map, z12), z11, false, 0L);
    }

    /* JADX INFO: renamed from: a */
    public void m74884a(int i11, C33943tf c33943tf, String str, String str2, InterfaceC33885qh interfaceC33885qh, boolean z11) {
        m74879a(i11, c33943tf.f72108w, C33962ue.m75186a((Object) c33943tf), str, str2, interfaceC33885qh, 0, 0, z11, null);
    }

    /* JADX INFO: renamed from: a */
    public long m74877a(boolean z11) {
        long jM72602b;
        long jM72601b = C33571bi.m72601b();
        int i11 = z11 ? 5 : 3;
        List<C33543ab> listM72905a = this.f71760a.m72905a(i11);
        if (listM72905a != null && listM72905a.size() > 0) {
            jM72602b = 0;
            try {
                C33543ab c33543ab = listM72905a.get(0);
                if (c33543ab.f68823e >= jM72601b) {
                    jM72602b = C33571bi.m72602b(c33543ab.f68825g);
                    if (i11 == 3) {
                        this.f71764e = jM72602b;
                    } else {
                        this.f71765f = jM72602b;
                    }
                    listM72905a.remove(c33543ab);
                }
            } catch (Throwable th2) {
                C34012x4.m75438b(th2);
            }
            if (listM72905a.size() > 0) {
                this.f71760a.m72908a(listM72905a);
            }
        } else {
            jM72602b = z11 ? this.f71765f : this.f71764e;
        }
        C34012x4.m75434a("[UploadManager] Local network consume: %d KB", Long.valueOf(jM72602b / 1024));
        return jM72602b;
    }

    /* JADX INFO: renamed from: b */
    public final void m74894b(int i11, LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
        C33784m0 c33784m0M74004c = C33784m0.m74004c();
        if (i11 > 0) {
            C34012x4.m75434a("[UploadManager] Execute urgent upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(i11), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        }
        for (int i12 = 0; i12 < i11; i12++) {
            Runnable runnablePoll = linkedBlockingQueue.poll();
            if (runnablePoll == null) {
                return;
            }
            synchronized (this.f71768i) {
                try {
                    if (this.f71770k >= 2 && c33784m0M74004c != null) {
                        c33784m0M74004c.m74006a(runnablePoll);
                    } else {
                        C34012x4.m75442d("[UploadManager] Create and start a new thread to execute a upload task: %s", f71744C);
                        if (C33571bi.m72584a(new a(runnablePoll), f71744C) != null) {
                            synchronized (this.f71768i) {
                                this.f71770k++;
                            }
                        } else {
                            C34012x4.m75431a(LogState.WARN, "[UploadManager] Failed to start a thread to execute asynchronous upload task,will try again next time.", new Object[0]);
                            m74891a(runnablePoll, true);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public void m74878a() {
        List<C33543ab> listM72905a = this.f71760a.m72905a(5);
        if (listM72905a == null || listM72905a.size() == 0) {
            return;
        }
        this.f71765f = 0L;
        this.f71760a.m72908a(listM72905a);
        C34012x4.m75434a("[UploadManager] Clear network consume of stuck.", new Object[0]);
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m74887a(long j11, boolean z11) {
        int i11 = z11 ? 5 : 3;
        try {
            C33543ab c33543ab = new C33543ab();
            c33543ab.f68820b = i11;
            c33543ab.f68823e = C33571bi.m72601b();
            c33543ab.f68821c = "";
            c33543ab.f68822d = "";
            c33543ab.f68825g = C33571bi.m72610b(j11);
            this.f71760a.m72916c(i11);
            this.f71760a.m72918d(c33543ab);
            if (z11) {
                this.f71765f = j11;
            } else {
                this.f71764e = j11;
            }
            C34012x4.m75434a("[UploadManager] Network total consume: %d KB", Long.valueOf(j11 / 1024));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m74882a(int i11, long j11) {
        try {
            if (i11 >= 0) {
                this.f71763d.put(Integer.valueOf(i11), Long.valueOf(j11));
                C33543ab c33543ab = new C33543ab();
                c33543ab.f68820b = i11;
                c33543ab.f68823e = j11;
                c33543ab.f68821c = "";
                c33543ab.f68822d = "";
                c33543ab.f68825g = new byte[0];
                this.f71760a.m72916c(i11);
                this.f71760a.m72918d(c33543ab);
                C34012x4.m75434a("[UploadManager] Uploading(ID:%d) time: %s", Integer.valueOf(i11), C33571bi.m72573a(j11));
            } else {
                C34012x4.m75437b("[UploadManager] Unknown uploading ID: %d", Integer.valueOf(i11));
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    /* JADX INFO: renamed from: a */
    public boolean m74890a(int i11) {
        if (C33900rc.f71640i) {
            C34012x4.m75434a("Uploading frequency will not be checked if SDK is in debug mode.", new Object[0]);
            return true;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - m74895c(i11);
        C34012x4.m75434a("[UploadManager] Time interval is %d seconds since last uploading(ID: %d).", Long.valueOf(jCurrentTimeMillis / 1000), Integer.valueOf(i11));
        if (jCurrentTimeMillis >= 30000) {
            return true;
        }
        C34012x4.m75431a(LogState.INFO, "[UploadManager] Data only be uploaded once in %d seconds.", 30L);
        return false;
    }

    /* JADX INFO: renamed from: a */
    public static void m74874a(LinkedBlockingQueue<Runnable> linkedBlockingQueue, LinkedBlockingQueue<Runnable> linkedBlockingQueue2, int i11) {
        for (int i12 = 0; i12 < i11; i12++) {
            Runnable runnablePeek = linkedBlockingQueue.peek();
            if (runnablePeek == null) {
                return;
            }
            try {
                linkedBlockingQueue2.put(runnablePeek);
                linkedBlockingQueue.poll();
            } catch (Throwable th2) {
                C34012x4.m75437b("[UploadManager] Failed to add upload task to temp urgent queue: %s", th2.getMessage());
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m74885a(int i11, LinkedBlockingQueue<Runnable> linkedBlockingQueue) {
        if (i11 > 0) {
            C34012x4.m75434a("[UploadManager] Execute upload tasks of queue which has %d tasks (pid=%d | tid=%d)", Integer.valueOf(i11), Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        }
        C33784m0 c33784m0M74004c = C33784m0.m74004c();
        if (c33784m0M74004c != null) {
            c33784m0M74004c.m74006a(new b(i11, linkedBlockingQueue));
        }
    }

    /* JADX INFO: renamed from: a */
    public final boolean m74891a(Runnable runnable, boolean z11) {
        if (runnable == null) {
            C34012x4.m75442d("[UploadManager] Upload task should not be null", new Object[0]);
            return false;
        }
        try {
            C34012x4.m75434a("[UploadManager] Add upload task to queue (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
            synchronized (this.f71768i) {
                try {
                    if (z11) {
                        this.f71766g.put(runnable);
                    } else {
                        this.f71767h.put(runnable);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return true;
        } catch (Throwable th3) {
            C34012x4.m75437b("[UploadManager] Failed to add upload task to queue: %s", th3.getMessage());
            return false;
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m74888a(Runnable runnable, long j11) {
        if (runnable == null) {
            C34012x4.m75444f("[UploadManager] Upload task should not be null", new Object[0]);
            return;
        }
        C34012x4.m75434a("[UploadManager] Execute synchronized upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        Thread threadM72584a = C33571bi.m72584a(runnable, f71743B);
        if (threadM72584a == null) {
            C34012x4.m75431a(LogState.ERROR, "[UploadManager] Failed to start a thread to execute synchronized upload task, add it to queue.", new Object[0]);
            m74891a(runnable, true);
            return;
        }
        try {
            threadM72584a.join(j11);
        } catch (Throwable th2) {
            C34012x4.m75431a(LogState.ERROR, "[UploadManager] Failed to join upload synchronized task with message: %s. Add it to queue.", th2.getMessage());
            m74891a(runnable, true);
            m74893b(0);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m74889a(Runnable runnable, boolean z11, boolean z12, long j11) {
        if (runnable == null) {
            C34012x4.m75444f("[UploadManager] Upload task should not be null", new Object[0]);
        }
        C34012x4.m75434a("[UploadManager] Add upload task (pid=%d | tid=%d)", Integer.valueOf(Process.myPid()), Integer.valueOf(Process.myTid()));
        if (z12) {
            m74888a(runnable, j11);
        } else {
            m74891a(runnable, z11);
            m74893b(0);
        }
    }
}
