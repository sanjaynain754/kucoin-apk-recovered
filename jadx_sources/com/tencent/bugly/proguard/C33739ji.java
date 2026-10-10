package com.tencent.bugly.proguard;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.OperationCanceledException;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.StructStat;
import android.util.Pair;
import com.tencent.bugly.common.utils.AndroidVersion;
import com.tencent.bugly.matrix.backtrace.WeChatBacktraceNative;
import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.CancellationException;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.ji */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33739ji {

    /* JADX INFO: renamed from: h */
    public static final String f70405h = "Matrix.WarmUpDelegate";

    /* JADX INFO: renamed from: i */
    public static final String f70406i = "action.backtrace.warmed-up";

    /* JADX INFO: renamed from: j */
    public static final String f70407j = ".backtrace.warmed_up";

    /* JADX INFO: renamed from: k */
    public static final String f70408k = "warm-up";

    /* JADX INFO: renamed from: l */
    public static final String f70409l = "clean-up";

    /* JADX INFO: renamed from: m */
    public static final String f70410m = "consuming-up";

    /* JADX INFO: renamed from: n */
    public static final String f70411n = "compute-disk-usage";

    /* JADX INFO: renamed from: o */
    public static volatile InterfaceC33781li f70412o;

    /* JADX INFO: renamed from: b */
    public String f70414b;

    /* JADX INFO: renamed from: c */
    public h f70415c;

    /* JADX INFO: renamed from: d */
    public g f70416d;

    /* JADX INFO: renamed from: e */
    public C33802mi f70417e;

    /* JADX INFO: renamed from: f */
    public C33865pi.c f70418f;

    /* JADX INFO: renamed from: a */
    public boolean f70413a = false;

    /* JADX INFO: renamed from: g */
    public final boolean[] f70419g = {false};

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CancellationSignal f70420b;

        /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: BUGLY */
        public class C46993a implements FileFilter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ InterfaceC33760ki f70422a;

            public C46993a(InterfaceC33760ki interfaceC33760ki) {
                this.f70422a = interfaceC33760ki;
            }

            @Override // java.io.FileFilter
            public boolean accept(File file) {
                String absolutePath = file.getAbsolutePath();
                if (file.exists() && !C33739ji.this.m73587a(absolutePath, 0) && (absolutePath.endsWith(".so") || absolutePath.endsWith(".odex") || absolutePath.endsWith(".oat") || absolutePath.endsWith(".dex"))) {
                    C33858pb.m74520c(C33739ji.f70405h, "Warming up so %s", absolutePath);
                    if (!this.f70422a.mo73594a(absolutePath, 0)) {
                        C33739ji.this.m73589b(absolutePath, 0);
                    }
                }
                return false;
            }
        }

        /* JADX WARN: Code duplicated, block: B:33:0x008f  */
        /* JADX WARN: Code duplicated, block: B:34:0x00a9  */
        @Override // java.lang.Runnable
        public void run() {
            boolean z11;
            C33858pb.m74520c(C33739ji.f70405h, "Going to warm up.", new Object[0]);
            InterfaceC33760ki interfaceC33760kiM73580a = null;
            try {
                if (!new File(C33844oi.m74469c(C33739ji.this.f70418f)).isDirectory()) {
                    C33858pb.m74522e(C33739ji.f70405h, "Saving path is not a directory.", new Object[0]);
                    C33739ji.this.f70417e.m74169d(C33802mi.d.WarmUp);
                    return;
                }
                interfaceC33760kiM73580a = C33739ji.this.m73580a();
                if (interfaceC33760kiM73580a == null) {
                    C33858pb.m74522e(C33739ji.f70405h, "Failed to acquire warm-up invoker", new Object[0]);
                    if (interfaceC33760kiM73580a != null) {
                        C33739ji.this.m73583a(interfaceC33760kiM73580a);
                        return;
                    }
                    return;
                }
                Iterator<String> it = C33739ji.this.f70418f.f71482c.iterator();
                while (it.hasNext()) {
                    C33844oi.m74465a(new File(it.next()), this.f70420b, new C46993a(interfaceC33760kiM73580a));
                }
                z11 = false;
                C33739ji.this.m73583a(interfaceC33760kiM73580a);
                if (!z11) {
                    C33858pb.m74520c(C33739ji.f70405h, "Warm-up cancelled.", new Object[0]);
                    return;
                }
                C33739ji.this.f70417e.m74169d(C33802mi.d.WarmUp);
                C33739ji c33739ji = C33739ji.this;
                c33739ji.m73581a(c33739ji.f70418f.f71480a);
                C33858pb.m74520c(C33739ji.f70405h, "Warm-up done.", new Object[0]);
            } catch (OperationCanceledException unused) {
                z11 = true;
                if (0 != 0) {
                }
            } catch (Throwable th2) {
                try {
                    C33858pb.m74518a(C33739ji.f70405h, th2, "", new Object[0]);
                    if (0 == 0) {
                        z11 = false;
                    }
                    if (!z11) {
                        C33858pb.m74520c(C33739ji.f70405h, "Warm-up cancelled.", new Object[0]);
                        return;
                    }
                    C33739ji.this.f70417e.m74169d(C33802mi.d.WarmUp);
                    C33739ji c33739ji2 = C33739ji.this;
                    c33739ji2.m73581a(c33739ji2.f70418f.f71480a);
                    C33858pb.m74520c(C33739ji.f70405h, "Warm-up done.", new Object[0]);
                } catch (Throwable th3) {
                    if (0 != 0) {
                        C33739ji.this.m73583a((InterfaceC33760ki) null);
                    }
                    throw th3;
                }
            }
        }

        public a(CancellationSignal cancellationSignal) {
            this.f70420b = cancellationSignal;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CancellationSignal f70424b;

        /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$b$a */
        /* JADX INFO: compiled from: BUGLY */
        public class a implements FileFilter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ HashMap f70426a;

            public a(HashMap map) {
                this.f70426a = map;
            }

            @Override // java.io.FileFilter
            public boolean accept(File file) {
                try {
                    String name = file.getName();
                    String absolutePath = file.getAbsolutePath();
                    if (!name.contains("_malformed_") && !name.contains("_temp_")) {
                        StructStat structStatLstat = Os.lstat(absolutePath);
                        long jMax = Math.max(structStatLstat.st_atime, structStatLstat.st_mtime) * 1000;
                        C33858pb.m74520c(C33739ji.f70405h, "File(%s) last access time %s", absolutePath, Long.valueOf(jMax));
                        if (System.currentTimeMillis() - jMax > 259200000) {
                            file.delete();
                            C33858pb.m74520c(C33739ji.f70405h, "Delete long time no access file(%s)", absolutePath);
                        } else if (jMax < System.currentTimeMillis()) {
                            int iLastIndexOf = name.lastIndexOf(46);
                            if (iLastIndexOf == -1) {
                                return false;
                            }
                            String strSubstring = name.substring(0, iLastIndexOf);
                            if (name.endsWith(".hash")) {
                                return false;
                            }
                            Pair pair = (Pair) this.f70426a.get(strSubstring);
                            if (pair == null) {
                                this.f70426a.put(strSubstring, new Pair(file, Long.valueOf(jMax)));
                            } else if (jMax > ((Long) pair.second).longValue()) {
                                if (System.currentTimeMillis() - ((Long) pair.second).longValue() >= 172800000) {
                                    ((File) pair.first).delete();
                                    C33858pb.m74520c(C33739ji.f70405h, "Delete file(%s) cause %s is newer(%s vs %s).", ((File) pair.first).getName(), name, pair.second, Long.valueOf(jMax));
                                }
                                this.f70426a.put(strSubstring, new Pair(file, Long.valueOf(jMax)));
                            } else if (System.currentTimeMillis() - jMax >= 172800000) {
                                file.delete();
                                C33858pb.m74520c(C33739ji.f70405h, "Delete file(%s) cause %s is newer(%s vs %s).", name, ((File) pair.first).getName(), Long.valueOf(jMax), pair.second);
                            }
                        } else if (jMax - System.currentTimeMillis() >= 604800000) {
                            file.delete();
                            C33858pb.m74520c(C33739ji.f70405h, "Delete future file(%s)", absolutePath);
                        }
                    } else if (System.currentTimeMillis() - file.lastModified() >= 172800000) {
                        C33858pb.m74520c(C33739ji.f70405h, "Delete malformed and temp file %s", absolutePath);
                        file.delete();
                    }
                } catch (Throwable th2) {
                    C33858pb.m74518a(C33739ji.f70405h, th2, "", new Object[0]);
                }
                return false;
            }
        }

        public b(CancellationSignal cancellationSignal) {
            this.f70424b = cancellationSignal;
        }

        @Override // java.lang.Runnable
        public void run() {
            File file = new File(C33844oi.m74469c(C33739ji.this.f70418f));
            C33858pb.m74520c(C33739ji.f70405h, "Going to clean up saving path(%s)..", file.getAbsoluteFile());
            if (!file.isDirectory()) {
                C33739ji.this.f70417e.m74169d(C33802mi.d.CleanUp);
                return;
            }
            try {
                C33844oi.m74465a(file, this.f70424b, new a(new HashMap()));
            } catch (OperationCanceledException unused) {
                C33858pb.m74520c(C33739ji.f70405h, "Clean up saving path(%s) cancelled.", file.getAbsoluteFile());
                return;
            } catch (Throwable th2) {
                C33858pb.m74518a(C33739ji.f70405h, th2, "", new Object[0]);
            }
            C33844oi.m74471d(C33739ji.this.f70418f.f71480a);
            C33739ji.this.f70417e.m74169d(C33802mi.d.CleanUp);
            C33858pb.m74520c(C33739ji.f70405h, "Clean up saving path(%s) done.", file.getAbsoluteFile());
            InterfaceC33781li interfaceC33781li = C33739ji.f70412o;
            if (interfaceC33781li != null) {
                interfaceC33781li.m73997a(InterfaceC33781li.a.CleanedUp, new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$c */
    /* JADX INFO: compiled from: BUGLY */
    public class c implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CancellationSignal f70428b;

        @Override // java.lang.Runnable
        public void run() {
            String strSubstring;
            int iIntValue;
            boolean zMo73594a;
            C33858pb.m74520c(C33739ji.f70405h, "Going to consume requested QUT.", new Object[0]);
            String[] strArrConsumeRequestedQut = WeChatBacktraceNative.consumeRequestedQut();
            InterfaceC33760ki interfaceC33760kiM73580a = C33739ji.this.m73580a();
            if (interfaceC33760kiM73580a == null) {
                C33739ji.this.f70417e.m74169d(C33802mi.d.RequestConsuming);
                C33858pb.m74522e(C33739ji.f70405h, "Failed to acquire warm-up invoker.", new Object[0]);
                return;
            }
            try {
                for (String str : strArrConsumeRequestedQut) {
                    int iLastIndexOf = str.lastIndexOf(58);
                    if (iLastIndexOf != -1) {
                        try {
                            strSubstring = str.substring(0, iLastIndexOf);
                            try {
                                iIntValue = Integer.valueOf(str.substring(iLastIndexOf + 1)).intValue();
                            } catch (Throwable unused) {
                                iIntValue = 0;
                            }
                        } catch (Throwable unused2) {
                            iIntValue = 0;
                            strSubstring = str;
                        }
                    } else {
                        iIntValue = 0;
                        strSubstring = str;
                    }
                    if (C33739ji.this.m73587a(strSubstring, iIntValue)) {
                        zMo73594a = false;
                    } else {
                        zMo73594a = interfaceC33760kiM73580a.mo73594a(strSubstring, iIntValue);
                        if (!zMo73594a) {
                            C33739ji.this.m73589b(strSubstring, iIntValue);
                        }
                    }
                    C33858pb.m74520c(C33739ji.f70405h, "Consumed requested QUT -> %s, ret = %s.", str, Boolean.valueOf(zMo73594a));
                    CancellationSignal cancellationSignal = this.f70428b;
                    if (cancellationSignal != null && cancellationSignal.isCanceled()) {
                        C33858pb.m74520c(C33739ji.f70405h, "Consume requested QUT canceled.", new Object[0]);
                        break;
                    }
                }
                C33858pb.m74520c(C33739ji.f70405h, "Consume requested QUT done.", new Object[0]);
            } finally {
                C33739ji.this.m73583a(interfaceC33760kiM73580a);
                C33739ji.this.f70417e.m74169d(C33802mi.d.RequestConsuming);
            }
        }

        public c(CancellationSignal cancellationSignal) {
            this.f70428b = cancellationSignal;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$d */
    /* JADX INFO: compiled from: BUGLY */
    public class d implements Runnable {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ CancellationSignal f70430b;

        /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$d$a */
        /* JADX INFO: compiled from: BUGLY */
        public class a implements FileFilter {

            /* JADX INFO: renamed from: a */
            public final /* synthetic */ long[] f70432a;

            @Override // java.io.FileFilter
            public boolean accept(File file) {
                try {
                    StructStat structStatLstat = Os.lstat(file.getAbsolutePath());
                    long[] jArr = this.f70432a;
                    jArr[0] = jArr[0] + 1;
                    jArr[1] = (structStatLstat.st_blocks * structStatLstat.st_blksize) + jArr[1];
                } catch (ErrnoException e11) {
                    C33858pb.m74518a(C33739ji.f70405h, e11, "", new Object[0]);
                }
                return false;
            }

            public a(long[] jArr) {
                this.f70432a = jArr;
            }
        }

        public d(CancellationSignal cancellationSignal) {
            this.f70430b = cancellationSignal;
        }

        @Override // java.lang.Runnable
        public void run() {
            File file = new File(C33739ji.this.f70414b);
            if (!file.isDirectory()) {
                C33739ji.this.f70417e.m74169d(C33802mi.d.DiskUsage);
                return;
            }
            long[] jArr = new long[2];
            try {
                C33844oi.m74465a(file, this.f70430b, new a(jArr));
                C33739ji.this.f70417e.m74169d(C33802mi.d.DiskUsage);
                C33844oi.m74472e(C33739ji.this.f70418f.f71480a);
                C33858pb.m74520c(C33739ji.f70405h, "Compute disk usage, file count(%s), disk usage(%s)", Long.valueOf(jArr[0]), Long.valueOf(jArr[1]));
                InterfaceC33781li interfaceC33781li = C33739ji.f70412o;
                if (interfaceC33781li != null) {
                    interfaceC33781li.m73997a(InterfaceC33781li.a.DiskUsage, Long.valueOf(jArr[0]), Long.valueOf(jArr[1]));
                }
            } catch (OperationCanceledException | CancellationException unused) {
                C33739ji.this.f70417e.m74169d(C33802mi.d.DiskUsage);
                C33844oi.m74472e(C33739ji.this.f70418f.f71480a);
                C33858pb.m74520c(C33739ji.f70405h, "Compute disk usage, file count(%s), disk usage(%s)", Long.valueOf(jArr[0]), Long.valueOf(jArr[1]));
            } catch (Throwable th2) {
                C33739ji.this.f70417e.m74169d(C33802mi.d.DiskUsage);
                C33844oi.m74472e(C33739ji.this.f70418f.f71480a);
                C33858pb.m74520c(C33739ji.f70405h, "Compute disk usage, file count(%s), disk usage(%s)", Long.valueOf(jArr[0]), Long.valueOf(jArr[1]));
                throw th2;
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$e */
    /* JADX INFO: compiled from: BUGLY */
    public static final class e implements InterfaceC33760ki {
        public e() {
        }

        @Override // com.tencent.bugly.proguard.InterfaceC33760ki
        /* JADX INFO: renamed from: a */
        public boolean mo73594a(String str, int i11) {
            return WeChatBacktraceNative.warmUp(str, i11, false);
        }

        public /* synthetic */ e(a aVar) {
            this();
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$f */
    /* JADX INFO: compiled from: BUGLY */
    public static final class f implements InterfaceC33760ki, ServiceC33823ni.c {

        /* JADX INFO: renamed from: a */
        public ServiceC33823ni.e f70434a = new ServiceC33823ni.e();

        /* JADX INFO: renamed from: b */
        public final String f70435b;

        /* JADX INFO: renamed from: c */
        public Context f70436c;

        /* JADX INFO: renamed from: d */
        public Bundle f70437d;

        @Override // com.tencent.bugly.proguard.ServiceC33823ni.c
        /* JADX INFO: renamed from: a */
        public boolean mo73596a() {
            return this.f70434a.mo73596a();
        }

        @Override // com.tencent.bugly.proguard.InterfaceC33760ki
        /* JADX INFO: renamed from: a */
        public boolean mo73594a(String str, int i11) {
            if (!this.f70434a.mo73596a() && !mo73597a(this.f70436c, this.f70437d)) {
                return false;
            }
            Bundle bundle = new Bundle();
            bundle.putString(ServiceC33823ni.f71186h, this.f70435b);
            bundle.putString(ServiceC33823ni.f71187i, str);
            bundle.putInt(ServiceC33823ni.f71188j, i11);
            Bundle bundleMo74344a = this.f70434a.mo74344a(100, bundle);
            int i12 = bundleMo74344a != null ? bundleMo74344a.getInt(ServiceC33823ni.f71189k) : -100;
            boolean z11 = i12 == 0;
            if (z11) {
                WeChatBacktraceNative.notifyWarmedUp(str, i11);
            }
            C33858pb.m74520c(C33739ji.f70405h, "Warm-up %s:%s - retCode %s", str, Integer.valueOf(i11), Integer.valueOf(i12));
            return z11;
        }

        public f(String str) {
            this.f70435b = str;
        }

        @Override // com.tencent.bugly.proguard.ServiceC33823ni.c
        /* JADX INFO: renamed from: a */
        public boolean mo73597a(Context context, Bundle bundle) {
            this.f70436c = context;
            this.f70437d = bundle;
            return this.f70434a.mo73597a(context, bundle);
        }

        @Override // com.tencent.bugly.proguard.ServiceC33823ni.c
        /* JADX INFO: renamed from: a */
        public void mo73595a(Context context) {
            this.f70434a.mo73595a(context);
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$g */
    /* JADX INFO: compiled from: BUGLY */
    public static final class g implements Runnable, Handler.Callback {

        /* JADX INFO: renamed from: i */
        public static final int f70438i = 1;

        /* JADX INFO: renamed from: j */
        public static final long f70439j = 300000;

        /* JADX INFO: renamed from: b */
        public String f70440b;

        /* JADX INFO: renamed from: c */
        public Thread f70441c;

        /* JADX INFO: renamed from: d */
        public HashMap<String, Runnable> f70442d = new HashMap<>();

        /* JADX INFO: renamed from: e */
        public Queue<String> f70443e = new LinkedList();

        /* JADX INFO: renamed from: f */
        public Handler f70444f = new Handler(Looper.getMainLooper(), this);

        /* JADX INFO: renamed from: g */
        public boolean f70445g = false;

        /* JADX INFO: renamed from: h */
        public long[] f70446h = {0};

        /* JADX INFO: renamed from: a */
        public boolean m73599a() {
            return this.f70445g;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f70445g = false;
            synchronized (this.f70446h) {
                this.f70446h[0] = System.currentTimeMillis();
            }
            Runnable runnable = null;
            String strPoll = null;
            while (true) {
                if (runnable != null) {
                    try {
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        C33858pb.m74520c(C33739ji.f70405h, "Before '%s' task execution..", strPoll);
                        runnable.run();
                        C33858pb.m74520c(C33739ji.f70405h, "After '%s' task execution..", strPoll);
                        long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                        InterfaceC33781li interfaceC33781li = C33739ji.f70412o;
                        if (interfaceC33781li != null) {
                            if (C33739ji.f70408k.equalsIgnoreCase(strPoll)) {
                                interfaceC33781li.m73997a(InterfaceC33781li.a.WarmUpDuration, Long.valueOf(jCurrentTimeMillis2));
                            } else if (C33739ji.f70410m.equalsIgnoreCase(strPoll)) {
                                interfaceC33781li.m73997a(InterfaceC33781li.a.ConsumeRequestDuration, Long.valueOf(jCurrentTimeMillis2));
                            }
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f70446h) {
                            this.f70446h[0] = 0;
                            this.f70444f.removeMessages(1);
                            throw th2;
                        }
                    }
                }
                synchronized (this.f70443e) {
                    strPoll = this.f70443e.poll();
                    if (strPoll == null) {
                        synchronized (this.f70446h) {
                            this.f70446h[0] = 0;
                        }
                        this.f70444f.removeMessages(1);
                        return;
                    }
                    Runnable runnableRemove = this.f70442d.remove(strPoll);
                    if (runnableRemove == null) {
                        synchronized (this.f70446h) {
                            this.f70446h[0] = 0;
                        }
                        this.f70444f.removeMessages(1);
                        return;
                    }
                    runnable = runnableRemove;
                }
            }
        }

        /* JADX INFO: renamed from: a */
        public void m73598a(Runnable runnable, String str) {
            synchronized (this.f70443e) {
                try {
                    if (this.f70443e.contains(str)) {
                        return;
                    }
                    this.f70443e.add(str);
                    this.f70442d.put(str, runnable);
                    synchronized (this) {
                        try {
                            Thread thread = this.f70441c;
                            if (thread == null || !thread.isAlive()) {
                                Thread thread2 = new Thread(this, this.f70440b);
                                this.f70441c = thread2;
                                thread2.start();
                                this.f70444f.removeMessages(1);
                                this.f70444f.sendEmptyMessageDelayed(1, 300000L);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            if (message.what == 1) {
                synchronized (this.f70446h) {
                    try {
                        if (this.f70446h[0] == 0) {
                            return false;
                        }
                        this.f70445g = true;
                        InterfaceC33781li interfaceC33781li = C33739ji.f70412o;
                        if (interfaceC33781li != null) {
                            interfaceC33781li.m73997a(InterfaceC33781li.a.WarmUpThreadBlocked, new Object[0]);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
            return false;
        }

        public g(String str) {
            this.f70440b = str;
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.ji$h */
    /* JADX INFO: compiled from: BUGLY */
    public static final class h extends BroadcastReceiver {

        /* JADX INFO: renamed from: a */
        public C33865pi.f f70447a;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C33858pb.m74520c(C33739ji.f70405h, "Warm-up received.", new Object[0]);
            String action = intent.getAction();
            if (action != null && action.equals(C33739ji.f70406i)) {
                WeChatBacktraceNative.setWarmedUp(true);
                C33739ji.m73578b(this.f70447a);
                try {
                    context.unregisterReceiver(this);
                } catch (Throwable th2) {
                    C33858pb.m74518a(C33739ji.f70405h, th2, "Unregister receiver twice.", new Object[0]);
                }
            }
        }

        public h(C33865pi.f fVar) {
            this.f70447a = fVar;
        }
    }

    /* JADX INFO: renamed from: c */
    public void m73591c() {
        if (C33844oi.m74477j(this.f70418f.f71480a).exists()) {
            this.f70417e.m74167b(C33802mi.d.RequestConsuming);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m73593d(CancellationSignal cancellationSignal) {
        this.f70416d.m73598a(new a(cancellationSignal), f70408k);
    }

    /* JADX INFO: renamed from: b */
    public boolean m73590b() {
        g gVar = this.f70416d;
        if (gVar != null) {
            return gVar.f70445g;
        }
        return true;
    }

    /* JADX INFO: renamed from: b */
    public void m73588b(CancellationSignal cancellationSignal) {
        this.f70416d.m73598a(new d(cancellationSignal), f70411n);
    }

    /* JADX INFO: renamed from: c */
    public void m73592c(CancellationSignal cancellationSignal) {
        this.f70416d.m73598a(new c(cancellationSignal), f70410m);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:30:0x0083
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1478)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    /* JADX INFO: renamed from: a */
    public void m73584a(com.tencent.bugly.proguard.C33865pi.c r10) throws java.lang.Throwable {
        /*
            r9 = this;
            boolean[] r1 = r9.f70419g
            monitor-enter(r1)
            boolean[] r0 = r9.f70419g     // Catch: java.lang.Throwable -> L7e
            r2 = 0
            boolean r3 = r0[r2]     // Catch: java.lang.Throwable -> L7e
            if (r3 == 0) goto L10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r0 = move-exception
            r10 = r0
            r4 = r9
            goto L81
        L10:
            r3 = 1
            r0[r2] = r3     // Catch: java.lang.Throwable -> L7e
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L7e
            r9.f70418f = r10
            boolean r0 = r10.f71489j
            r9.f70413a = r0
            com.tencent.bugly.proguard.ji$g r0 = new com.tencent.bugly.proguard.ji$g
            java.lang.String r1 = "WeChatBacktraceTask"
            r0.<init>(r1)
            r9.f70416d = r0
            com.tencent.bugly.proguard.mi r3 = new com.tencent.bugly.proguard.mi
            android.content.Context r5 = r10.f71480a
            com.tencent.bugly.proguard.pi$h r6 = r10.f71490k
            long r7 = r10.f71491l
            r4 = r9
            r3.<init>(r4, r5, r6, r7)
            r4.f70417e = r3
            boolean r0 = r10.f71488i
            if (r0 == 0) goto L7d
            android.content.Context r10 = r10.f71480a
            java.io.File r0 = com.tencent.bugly.proguard.C33844oi.m74477j(r10)
            boolean r0 = r0.exists()
            if (r0 != 0) goto L51
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "Matrix.WarmUpDelegate"
            java.lang.String r3 = "Has not been warmed up"
            com.tencent.bugly.proguard.C33858pb.m74520c(r1, r3, r0)
            com.tencent.bugly.proguard.mi r0 = r4.f70417e
            com.tencent.bugly.proguard.mi$d r1 = com.tencent.bugly.proguard.C33802mi.d.WarmUp
            r0.m74167b(r1)
        L51:
            boolean r0 = com.tencent.bugly.proguard.C33844oi.m74473f(r10)
            if (r0 == 0) goto L67
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "Matrix.WarmUpDelegate"
            java.lang.String r3 = "Need clean up"
            com.tencent.bugly.proguard.C33858pb.m74520c(r1, r3, r0)
            com.tencent.bugly.proguard.mi r0 = r4.f70417e
            com.tencent.bugly.proguard.mi$d r1 = com.tencent.bugly.proguard.C33802mi.d.CleanUp
            r0.m74167b(r1)
        L67:
            boolean r10 = com.tencent.bugly.proguard.C33844oi.m74475h(r10)
            if (r10 == 0) goto L7d
            java.lang.Object[] r10 = new java.lang.Object[r2]
            java.lang.String r0 = "Matrix.WarmUpDelegate"
            java.lang.String r1 = "Should schedule disk usage task."
            com.tencent.bugly.proguard.C33858pb.m74520c(r0, r1, r10)
            com.tencent.bugly.proguard.mi r10 = r4.f70417e
            com.tencent.bugly.proguard.mi$d r0 = com.tencent.bugly.proguard.C33802mi.d.DiskUsage
            r10.m74167b(r0)
        L7d:
            return
        L7e:
            r0 = move-exception
            r4 = r9
        L80:
            r10 = r0
        L81:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L83
            throw r10
        L83:
            r0 = move-exception
            goto L80
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.bugly.proguard.C33739ji.m73584a(com.tencent.bugly.proguard.pi$c):void");
    }

    /* JADX INFO: renamed from: b */
    public final void m73589b(String str, int i11) {
        InterfaceC33781li interfaceC33781li = f70412o;
        if (interfaceC33781li != null) {
            interfaceC33781li.m73997a(InterfaceC33781li.a.WarmUpFailed, str, Integer.valueOf(i11));
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m73578b(C33865pi.f fVar) {
        if (fVar == C33865pi.f.FpUntilQuickenWarmedUp || fVar == C33865pi.f.DwarfUntilQuickenWarmedUp) {
            WeChatBacktraceNative.setBacktraceMode(C33865pi.f.Quicken.f71503b);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73586a(String str) {
        this.f70414b = str;
        WeChatBacktraceNative.setSavingPath(str);
    }

    /* JADX INFO: renamed from: a */
    public static boolean m73575a(String str, int i11, boolean z11) {
        return WeChatBacktraceNative.warmUp(str, i11, z11);
    }

    /* JADX INFO: renamed from: a */
    public final InterfaceC33760ki m73580a() {
        if (this.f70413a) {
            f fVar = new f(this.f70414b);
            Bundle bundle = new Bundle();
            bundle.putBoolean(ServiceC33823ni.f71185g, this.f70418f.f71493n);
            bundle.putString(ServiceC33823ni.f71184f, this.f70418f.f71494o);
            if (fVar.mo73597a(this.f70418f.f71480a, bundle)) {
                return fVar;
            }
            return null;
        }
        return new e();
    }

    /* JADX INFO: renamed from: a */
    public final void m73583a(InterfaceC33760ki interfaceC33760ki) {
        if (this.f70413a) {
            ((f) interfaceC33760ki).f70434a.mo73595a(this.f70418f.f71480a);
        }
    }

    /* JADX INFO: renamed from: a */
    public synchronized void m73585a(C33865pi.c cVar, C33865pi.f fVar) {
        if (C33844oi.m74477j(cVar.f71480a).exists()) {
            return;
        }
        if (this.f70415c == null) {
            this.f70415c = new h(fVar);
            C33858pb.m74520c(f70405h, "Register warm-up receiver.", new Object[0]);
            try {
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction(f70406i);
                if (AndroidVersion.isOver34()) {
                    int i11 = Context.class.getDeclaredField("RECEIVER_NOT_EXPORTED").getInt(null);
                    cVar.f71480a.registerReceiver(this.f70415c, intentFilter, cVar.f71480a.getPackageName() + f70407j, null, i11);
                } else {
                    cVar.f71480a.registerReceiver(this.f70415c, intentFilter, cVar.f71480a.getPackageName() + f70407j, null);
                }
            } catch (Throwable th2) {
                C33858pb.m74520c(f70405h, "failed to register warmed up receiver." + th2.toString(), new Object[0]);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m73581a(Context context) {
        try {
            File fileM74477j = C33844oi.m74477j(context);
            fileM74477j.createNewFile();
            C33844oi.m74466a(fileM74477j, context.getApplicationInfo().nativeLibraryDir);
        } catch (IOException e11) {
            C33858pb.m74518a(f70405h, e11, "", new Object[0]);
        }
        WeChatBacktraceNative.setWarmedUp(true);
        m73578b(this.f70418f.f71483d);
        C33858pb.m74520c(f70405h, "Broadcast warmed up message to other processes.", new Object[0]);
        Intent intent = new Intent(f70406i);
        intent.putExtra(C33556b3.f69038e2, Process.myPid());
        context.sendBroadcast(intent, context.getPackageName() + f70407j);
        InterfaceC33781li interfaceC33781li = f70412o;
        if (interfaceC33781li != null) {
            interfaceC33781li.m73997a(InterfaceC33781li.a.WarmedUp, new Object[0]);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m73582a(CancellationSignal cancellationSignal) {
        this.f70416d.m73598a(new b(cancellationSignal), f70409l);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m73587a(String str, int i11) {
        boolean zM74480a = C33844oi.a.m74480a(this.f70418f.f71480a, str, i11);
        boolean z11 = !zM74480a;
        if (!zM74480a) {
            C33858pb.m74522e(f70405h, "Elf file %s:%s has blocked and will not do warm-up.", str, Integer.valueOf(i11));
        }
        return z11;
    }
}
