package com.dianping.logan;

import android.os.StatFs;
import android.text.TextUtils;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: renamed from: com.dianping.logan.f */
/* JADX INFO: compiled from: LoganThread.java */
/* JADX INFO: loaded from: classes.dex */
public class C5463f extends Thread {

    /* JADX INFO: renamed from: e */
    public long f7472e;

    /* JADX INFO: renamed from: f */
    public volatile boolean f7473f;

    /* JADX INFO: renamed from: g */
    public File f7474g;

    /* JADX INFO: renamed from: h */
    public boolean f7475h;

    /* JADX INFO: renamed from: i */
    public long f7476i;

    /* JADX INFO: renamed from: j */
    public C5461d f7477j;

    /* JADX INFO: renamed from: k */
    public ConcurrentLinkedQueue<LoganModel> f7478k;

    /* JADX INFO: renamed from: l */
    public String f7479l;

    /* JADX INFO: renamed from: m */
    public String f7480m;

    /* JADX INFO: renamed from: n */
    public long f7481n;

    /* JADX INFO: renamed from: o */
    public long f7482o;

    /* JADX INFO: renamed from: p */
    public long f7483p;

    /* JADX INFO: renamed from: q */
    public String f7484q;

    /* JADX INFO: renamed from: r */
    public String f7485r;

    /* JADX INFO: renamed from: s */
    public int f7486s;

    /* JADX INFO: renamed from: u */
    public ExecutorService f7488u;

    /* JADX INFO: renamed from: b */
    public final Object f7469b = new Object();

    /* JADX INFO: renamed from: c */
    public final Object f7470c = new Object();

    /* JADX INFO: renamed from: d */
    public volatile boolean f7471d = true;

    /* JADX INFO: renamed from: t */
    public ConcurrentLinkedQueue<LoganModel> f7487t = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: com.dianping.logan.f$a */
    /* JADX INFO: compiled from: LoganThread.java */
    public class a implements InterfaceC5464g {
        public a() {
        }

        @Override // com.dianping.logan.InterfaceC5464g
        /* JADX INFO: renamed from: a */
        public void mo7543a(String str, int i11) {
            C5458a.m7496c(str, i11);
        }
    }

    /* JADX INFO: renamed from: com.dianping.logan.f$b */
    /* JADX INFO: compiled from: LoganThread.java */
    /* JADX INFO: loaded from: classes34.dex */
    public class b implements AbstractRunnableC5466i.a {
        public b() {
        }

        @Override // com.dianping.logan.AbstractRunnableC5466i.a
        /* JADX INFO: renamed from: a */
        public void mo7544a(int i11) {
            synchronized (C5463f.this.f7470c) {
                try {
                    C5463f.this.f7486s = i11;
                    if (i11 == 10002) {
                        C5463f.this.f7478k.addAll(C5463f.this.f7487t);
                        C5463f.this.f7487t.clear();
                        C5463f.this.m7541n();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: com.dianping.logan.f$c */
    /* JADX INFO: compiled from: LoganThread.java */
    /* JADX INFO: loaded from: classes34.dex */
    public class c implements ThreadFactory {
        public c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(Thread.currentThread().getThreadGroup(), runnable, "logan-thread-send-log", 0L);
            if (thread.isDaemon()) {
                thread.setDaemon(false);
            }
            if (thread.getPriority() != 5) {
                thread.setPriority(5);
            }
            return thread;
        }
    }

    /* JADX INFO: Removed unreachable split cross block B:84:0x0081 */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r5v10, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v12 */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r5v19 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v20 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.io.FileOutputStream] */
    /* JADX INFO: renamed from: f */
    public final boolean m7533f(String e11, String str) throws Throwable {
        FileInputStream fileInputStream = null;
        try {
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(new File((String) e11));
                    try {
                        e11 = new FileOutputStream(new File(str));
                        try {
                            byte[] bArr = new byte[1024];
                            while (true) {
                                int i11 = fileInputStream2.read(bArr);
                                if (i11 >= 0) {
                                    e11.write(bArr, 0, i11);
                                    e11.flush();
                                } else {
                                    try {
                                        break;
                                    } catch (Exception e12) {
                                        e12.printStackTrace();
                                    }
                                }
                            }
                            fileInputStream2.close();
                            try {
                                e11.close();
                            } catch (Exception e13) {
                                e13.printStackTrace();
                            }
                            return true;
                        } catch (FileNotFoundException e14) {
                            e = e14;
                            fileInputStream = fileInputStream2;
                            e11 = e11;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e15) {
                                    e15.printStackTrace();
                                }
                            }
                            if (e11 != 0) {
                                e11.close();
                            }
                            return false;
                        } catch (IOException e16) {
                            e = e16;
                            fileInputStream = fileInputStream2;
                            e11 = e11;
                            e.printStackTrace();
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e17) {
                                    e17.printStackTrace();
                                }
                            }
                            if (e11 != 0) {
                                e11.close();
                            }
                            return false;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream = fileInputStream2;
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception e18) {
                                    e18.printStackTrace();
                                }
                            }
                            if (e11 == 0) {
                                throw th;
                            }
                            try {
                                e11.close();
                                throw th;
                            } catch (Exception e19) {
                                e19.printStackTrace();
                                throw th;
                            }
                        }
                    } catch (FileNotFoundException e21) {
                        e = e21;
                        e11 = 0;
                    } catch (IOException e22) {
                        e = e22;
                        e11 = 0;
                    } catch (Throwable th3) {
                        th = th3;
                        e11 = 0;
                    }
                } catch (Throwable th4) {
                    th = th4;
                }
            } catch (FileNotFoundException e23) {
                e = e23;
                e11 = 0;
            } catch (IOException e24) {
                e = e24;
                e11 = 0;
            } catch (Throwable th5) {
                th = th5;
                e11 = 0;
            }
        } catch (Exception e25) {
            e11 = e25;
            e11.printStackTrace();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m7532e(LoganModel loganModel) {
        if (loganModel == null || !loganModel.m7492a()) {
            return;
        }
        if (this.f7477j == null) {
            C5461d c5461dM7527g = C5461d.m7527g();
            this.f7477j = c5461dM7527g;
            c5461dM7527g.mo7490f(new a());
            this.f7477j.mo7486b(this.f7479l, this.f7480m, (int) this.f7482o, this.f7484q, this.f7485r);
            this.f7477j.mo7489e(C5458a.f7437c);
        }
        LoganModel.Action action = loganModel.f7431a;
        if (action == LoganModel.Action.WRITE) {
            m7537j(loganModel.f7432b);
            return;
        }
        if (action != LoganModel.Action.SEND) {
            if (action == LoganModel.Action.FLUSH) {
                m7535h();
            }
        } else if (loganModel.f7433c.f7495d != null) {
            synchronized (this.f7470c) {
                try {
                    if (this.f7486s == 10001) {
                        this.f7487t.add(loganModel);
                    } else {
                        m7536i(loganModel.f7433c);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m7534g(long j11) {
        String[] list;
        File file = new File(this.f7480m);
        if (!file.isDirectory() || (list = file.list()) == null) {
            return;
        }
        for (String str : list) {
            try {
                if (!TextUtils.isEmpty(str)) {
                    String[] strArrSplit = str.split("\\.");
                    if (strArrSplit.length > 0 && Long.valueOf(strArrSplit[0]).longValue() <= j11 && strArrSplit.length == 1) {
                        new File(this.f7480m, str).delete();
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m7535h() {
        if (C5458a.f7437c) {
            Log.d("LoganThread", "Logan flush start");
        }
        C5461d c5461d = this.f7477j;
        if (c5461d != null) {
            c5461d.mo7485a();
        }
    }

    /* JADX INFO: renamed from: i */
    public final void m7536i(C5465h c5465h) {
        if (C5458a.f7437c) {
            Log.d("LoganThread", "Logan send start");
        }
        if (TextUtils.isEmpty(this.f7480m) || c5465h == null || !c5465h.m7545a()) {
            return;
        }
        if (!m7542o(c5465h)) {
            if (C5458a.f7437c) {
                Log.d("LoganThread", "Logan prepare log file failed, can't find log file");
            }
        } else {
            c5465h.f7495d.m7548c(c5465h);
            c5465h.f7495d.setCallBackListener(new b());
            this.f7486s = 10001;
            if (this.f7488u == null) {
                this.f7488u = Executors.newSingleThreadExecutor(new c());
            }
            this.f7488u.execute(c5465h.f7495d);
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m7537j(C5468k c5468k) {
        if (C5458a.f7437c) {
            Log.d("LoganThread", "Logan write start");
        }
        if (this.f7474g == null) {
            this.f7474g = new File(this.f7480m);
        }
        if (!m7539l()) {
            long jM7549a = C5467j.m7549a();
            m7534g(jM7549a - this.f7481n);
            this.f7472e = jM7549a;
            this.f7477j.mo7488d(String.valueOf(jM7549a));
        }
        if (System.currentTimeMillis() - this.f7476i > 60000) {
            this.f7475h = m7538k();
        }
        this.f7476i = System.currentTimeMillis();
        if (this.f7475h) {
            this.f7477j.mo7487c(c5468k.f7504f, c5468k.f7499a, c5468k.f7503e, c5468k.f7502d, c5468k.f7501c, c5468k.f7500b);
        }
    }

    /* JADX INFO: renamed from: k */
    public final boolean m7538k() {
        try {
            StatFs statFs = new StatFs(this.f7480m);
            return ((long) statFs.getAvailableBlocks()) * ((long) statFs.getBlockSize()) > this.f7483p;
        } catch (IllegalArgumentException e11) {
            e11.printStackTrace();
            return false;
        }
    }

    /* JADX INFO: renamed from: m */
    public final boolean m7540m(String str) {
        if (TextUtils.isEmpty(this.f7480m)) {
            return false;
        }
        File file = new File(this.f7480m + File.separator + str);
        return file.exists() && file.isFile();
    }

    /* JADX INFO: renamed from: n */
    public void m7541n() {
        if (this.f7473f) {
            return;
        }
        synchronized (this.f7469b) {
            this.f7469b.notify();
        }
    }

    /* JADX INFO: renamed from: o */
    public final boolean m7542o(C5465h c5465h) {
        if (C5458a.f7437c) {
            Log.d("LoganThread", "prepare log file");
        }
        if (!m7540m(c5465h.f7493b)) {
            c5465h.f7494c = "";
            return false;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f7480m);
        String str = File.separator;
        sb2.append(str);
        sb2.append(c5465h.f7493b);
        String string = sb2.toString();
        if (!c5465h.f7493b.equals(String.valueOf(C5467j.m7549a()))) {
            c5465h.f7494c = string;
            return true;
        }
        m7535h();
        String str2 = this.f7480m + str + c5465h.f7493b + ".copy";
        if (!m7533f(string, str2)) {
            return false;
        }
        c5465h.f7494c = str2;
        return true;
    }

    public C5463f(ConcurrentLinkedQueue<LoganModel> concurrentLinkedQueue, String str, String str2, long j11, long j12, long j13, String str3, String str4) {
        this.f7478k = concurrentLinkedQueue;
        this.f7479l = str;
        this.f7480m = str2;
        this.f7481n = j11;
        this.f7482o = j12;
        this.f7483p = j13;
        this.f7484q = str3;
        this.f7485r = str4;
    }

    /* JADX INFO: renamed from: l */
    public final boolean m7539l() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        long j11 = this.f7472e;
        if (j11 < jCurrentTimeMillis && j11 + 86400000 > jCurrentTimeMillis) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        super.run();
        while (this.f7471d) {
            synchronized (this.f7469b) {
                try {
                    this.f7473f = true;
                    try {
                        LoganModel loganModelPoll = this.f7478k.poll();
                        if (loganModelPoll == null) {
                            this.f7473f = false;
                            this.f7469b.wait();
                            this.f7473f = true;
                        } else {
                            m7532e(loganModelPoll);
                        }
                    } catch (InterruptedException e11) {
                        e11.printStackTrace();
                        this.f7473f = false;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }
}
