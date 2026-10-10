package com.tencent.bugly.proguard;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.tencent.rmonitor.base.thread.suspend.ThreadSuspend;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.q7 */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class RunnableC33875q7 implements Runnable {

    /* JADX INFO: renamed from: i */
    public static final int f71537i = 32;

    /* JADX INFO: renamed from: j */
    public static final int f71538j = 0;

    /* JADX INFO: renamed from: k */
    public static final int f71539k = 1;

    /* JADX INFO: renamed from: l */
    public static final int f71540l = 3;

    /* JADX INFO: renamed from: b */
    public final Handler f71541b;

    /* JADX INFO: renamed from: c */
    public final String f71542c;

    /* JADX INFO: renamed from: e */
    public long f71544e;

    /* JADX INFO: renamed from: f */
    public final long f71545f;

    /* JADX INFO: renamed from: h */
    public long f71547h;

    /* JADX INFO: renamed from: d */
    public final List<C33821ng> f71543d = new LinkedList();

    /* JADX INFO: renamed from: g */
    public boolean f71546g = true;

    /* JADX INFO: renamed from: a */
    public int m74665a() {
        if (this.f71546g) {
            return 0;
        }
        return SystemClock.uptimeMillis() - this.f71547h < this.f71544e ? 1 : 3;
    }

    /* JADX INFO: renamed from: b */
    public Looper m74667b() {
        return this.f71541b.getLooper();
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f71546g = true;
        m74675i();
    }

    /* JADX INFO: renamed from: b */
    public void m74668b(long j11) {
        this.f71544e = j11;
    }

    /* JADX INFO: renamed from: c */
    public String m74669c() {
        return this.f71542c;
    }

    /* JADX INFO: renamed from: d */
    public Thread m74670d() {
        return this.f71541b.getLooper().getThread();
    }

    /* JADX INFO: renamed from: f */
    public Handler m74672f() {
        return this.f71541b;
    }

    /* JADX INFO: renamed from: g */
    public boolean m74673g() {
        return !this.f71546g && SystemClock.uptimeMillis() >= this.f71547h + this.f71544e;
    }

    /* JADX INFO: renamed from: h */
    public void m74674h() {
        StringBuilder sb2 = new StringBuilder(1024);
        long jNanoTime = System.nanoTime();
        try {
            long jM77113b = ThreadSuspend.m77109c().m77113b(m74670d());
            StackTraceElement[] stackTrace = m74670d().getStackTrace();
            ThreadSuspend.m77109c().m77111a(jM77113b);
            if (stackTrace.length == 0) {
                sb2.append("Thread does not have stack trace.\n");
            } else {
                for (StackTraceElement stackTraceElement : stackTrace) {
                    sb2.append(stackTraceElement);
                    sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                }
            }
        } catch (SecurityException e11) {
            sb2.append("getStackTrace() encountered:\n");
            sb2.append(e11.getMessage());
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            C34012x4.m75438b(e11);
        }
        long jNanoTime2 = System.nanoTime();
        C33821ng c33821ng = new C33821ng(sb2.toString(), System.currentTimeMillis());
        c33821ng.f71174d = jNanoTime2 - jNanoTime;
        c33821ng.m74320b(m74670d().getName());
        synchronized (this.f71543d) {
            while (this.f71543d.size() >= 32) {
                try {
                    this.f71543d.remove(0);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            this.f71543d.add(c33821ng);
        }
    }

    /* JADX INFO: renamed from: i */
    public void m74675i() {
        this.f71544e = this.f71545f;
    }

    /* JADX INFO: renamed from: j */
    public void m74676j() {
        if (this.f71546g) {
            this.f71546g = false;
            this.f71547h = SystemClock.uptimeMillis();
            this.f71541b.post(this);
        }
    }

    public RunnableC33875q7(Handler handler, String str, long j11) {
        this.f71541b = handler;
        this.f71542c = str;
        this.f71544e = j11;
        this.f71545f = j11;
    }

    /* JADX INFO: renamed from: e */
    public long m74671e() {
        return SystemClock.uptimeMillis() - this.f71547h;
    }

    /* JADX INFO: renamed from: a */
    public List<C33821ng> m74666a(long j11) {
        ArrayList arrayList;
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f71543d) {
            try {
                arrayList = new ArrayList(this.f71543d.size());
                for (int i11 = 0; i11 < this.f71543d.size(); i11++) {
                    C33821ng c33821ng = this.f71543d.get(i11);
                    if (!c33821ng.m74323e() && jCurrentTimeMillis - c33821ng.m74318b() < j11) {
                        arrayList.add(c33821ng);
                        c33821ng.m74317a(true);
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return arrayList;
    }
}
