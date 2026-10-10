package com.tencent.bugly.proguard;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.SystemClock;
import com.tencent.bugly.common.looper.ILooperDispatchListener;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.sc */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33920sc implements ILooperDispatchListener {

    /* JADX INFO: renamed from: q */
    public static final int f71895q = 100;

    /* JADX INFO: renamed from: r */
    public static final int f71896r = 50;

    /* JADX INFO: renamed from: s */
    public static final long f71897s = 30;

    /* JADX INFO: renamed from: t */
    public static final int f71898t = 0;

    /* JADX INFO: renamed from: u */
    public static final int f71899u = 1;

    /* JADX INFO: renamed from: v */
    public static final int f71900v = 2;

    /* JADX INFO: renamed from: w */
    public static final long f71901w = 200;

    /* JADX INFO: renamed from: x */
    public static final long f71902x = 1000;

    /* JADX INFO: renamed from: y */
    public static final int f71903y = 500;

    /* JADX INFO: renamed from: d */
    public Looper f71906d;

    /* JADX INFO: renamed from: f */
    public long f71908f = 0;

    /* JADX INFO: renamed from: g */
    public long f71909g = 0;

    /* JADX INFO: renamed from: h */
    public String f71910h = "";

    /* JADX INFO: renamed from: i */
    public long f71911i = 0;

    /* JADX INFO: renamed from: j */
    public long f71912j = 0;

    /* JADX INFO: renamed from: k */
    public long f71913k = 0;

    /* JADX INFO: renamed from: l */
    public long f71914l = 0;

    /* JADX INFO: renamed from: m */
    public int f71915m = 0;

    /* JADX INFO: renamed from: n */
    public AtomicBoolean f71916n = new AtomicBoolean();

    /* JADX INFO: renamed from: o */
    public ArrayList<a> f71917o = new ArrayList<>();

    /* JADX INFO: renamed from: p */
    public String f71918p = "";

    /* JADX INFO: renamed from: b */
    public a[] f71904b = new a[100];

    /* JADX INFO: renamed from: c */
    public a f71905c = new a();

    /* JADX INFO: renamed from: e */
    public int f71907e = 0;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.sc$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Cloneable {

        /* JADX INFO: renamed from: e */
        public int f71922e;

        /* JADX INFO: renamed from: b */
        public long f71919b = 0;

        /* JADX INFO: renamed from: c */
        public long f71920c = 0;

        /* JADX INFO: renamed from: f */
        public int f71923f = 0;

        /* JADX INFO: renamed from: d */
        public String f71921d = "";

        /* JADX INFO: renamed from: g */
        public long f71924g = 0;

        public a() {
        }

        /* JADX INFO: renamed from: b */
        public boolean m74977b() {
            return this.f71922e == 0;
        }

        public String toString() {
            return "wallTime = " + this.f71919b + ", cpuTime = " + this.f71920c + ", msgDetail = " + this.f71921d + ", type = " + this.f71922e + ", count = " + this.f71923f + ", msgEndTimeInMs = " + this.f71924g;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public a clone() {
            try {
                a aVar = (a) super.clone();
                aVar.f71920c = this.f71920c;
                aVar.f71919b = this.f71919b;
                aVar.f71921d = this.f71921d;
                aVar.f71922e = this.f71922e;
                aVar.f71923f = this.f71923f;
                aVar.f71924g = this.f71924g;
                return aVar;
            } catch (CloneNotSupportedException unused) {
                throw new AssertionError();
            }
        }
    }

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.sc$b */
    /* JADX INFO: compiled from: BUGLY */
    public class b {

        /* JADX INFO: renamed from: a */
        public int f71926a;

        /* JADX INFO: renamed from: b */
        public int f71927b;

        /* JADX INFO: renamed from: c */
        public int f71928c;

        /* JADX INFO: renamed from: d */
        public long f71929d;

        /* JADX INFO: renamed from: e */
        public String f71930e;

        /* JADX INFO: renamed from: f */
        public String f71931f;

        public b() {
        }
    }

    /* JADX INFO: renamed from: a */
    public final b m74970a(Message message, long j11) {
        b bVar = new b();
        bVar.f71926a = message.arg1;
        bVar.f71927b = message.arg2;
        bVar.f71928c = message.what;
        bVar.f71929d = message.getWhen() - j11;
        bVar.f71930e = message.getCallback() == null ? "" : message.getCallback().toString();
        bVar.f71931f = message.getTarget() != null ? message.getTarget().toString() : "";
        return bVar;
    }

    /* JADX INFO: renamed from: c */
    public ArrayList<b> m74974c() {
        try {
            long jUptimeMillis = SystemClock.uptimeMillis();
            ArrayList<b> arrayList = new ArrayList<>();
            Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
            declaredField.setAccessible(true);
            int i11 = 0;
            Method method = Class.forName("android.os.Looper").getMethod("getQueue", new Class[0]);
            method.setAccessible(true);
            Message message = (Message) declaredField.get((MessageQueue) method.invoke(this.f71906d, new Object[0]));
            if (message != null) {
                arrayList.add(m74970a(message, jUptimeMillis));
                i11 = 1;
            }
            Field declaredField2 = Class.forName("android.os.Message").getDeclaredField("next");
            declaredField2.setAccessible(true);
            for (Message message2 = (Message) declaredField2.get(message); message2 != null && i11 < 50; message2 = (Message) declaredField2.get(message2)) {
                arrayList.add(m74970a(message2, jUptimeMillis));
                i11++;
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // com.tencent.bugly.common.looper.ILooperDispatchListener
    public boolean isOpen() {
        return true;
    }

    /* JADX INFO: renamed from: b */
    public List<a> m74973b() {
        this.f71916n.compareAndSet(false, true);
        ArrayList arrayList = new ArrayList();
        for (int i11 = this.f71907e; i11 < 100; i11++) {
            a aVar = this.f71904b[i11];
            if (aVar != null) {
                arrayList.add(aVar.clone());
            }
        }
        for (int i12 = 0; i12 < this.f71907e; i12++) {
            a aVar2 = this.f71904b[i12];
            if (aVar2 != null) {
                arrayList.add(aVar2.clone());
            }
        }
        if (this.f71915m >= 1) {
            a aVar3 = new a();
            aVar3.f71919b = this.f71913k;
            aVar3.f71920c = this.f71914l;
            aVar3.f71921d = this.f71918p;
            aVar3.f71922e = 1;
            aVar3.f71923f = this.f71915m;
            aVar3.f71924g = System.currentTimeMillis();
            arrayList.add(aVar3);
        }
        this.f71916n.compareAndSet(true, false);
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public final int m74975d() {
        return (this.f71907e + 101) % 100;
    }

    @Override // com.tencent.bugly.common.looper.ILooperDispatchListener
    public void onDispatchEnd(String str, long j11, long j12) {
        String str2;
        if (this.f71908f <= 0) {
            return;
        }
        this.f71911i = j11;
        long jCurrentThreadTimeMillis = SystemClock.currentThreadTimeMillis();
        this.f71912j = jCurrentThreadTimeMillis;
        long j13 = this.f71911i - this.f71908f;
        long j14 = jCurrentThreadTimeMillis - this.f71909g;
        if (j13 > 200) {
            int i11 = this.f71915m;
            if (i11 >= 1) {
                m74971a(this.f71913k, this.f71914l, this.f71918p, 1, i11);
                this.f71915m = 0;
                this.f71913k = 0L;
                this.f71914l = 0L;
            }
            str2 = str;
            m74971a(j13, j14, str2, 0, 1);
        } else {
            long j15 = this.f71913k + j13;
            this.f71913k = j15;
            long j16 = this.f71914l + j14;
            this.f71914l = j16;
            int i12 = this.f71915m + 1;
            this.f71915m = i12;
            if (j15 > 200) {
                str2 = str;
                m74971a(j15, j16, str2, 1, i12);
                this.f71915m = 0;
                this.f71913k = 0L;
                this.f71914l = 0L;
            } else {
                str2 = str;
            }
        }
        this.f71918p = str2;
    }

    @Override // com.tencent.bugly.common.looper.ILooperDispatchListener
    public void onDispatchStart(String str, long j11) {
        this.f71908f = j11;
        this.f71909g = SystemClock.currentThreadTimeMillis();
        this.f71910h = str;
        long j12 = this.f71911i;
        if (j12 > 0) {
            long j13 = this.f71908f - j12;
            if (j13 > 1000) {
                int i11 = this.f71915m;
                if (i11 >= 1) {
                    m74971a(this.f71913k, this.f71914l, this.f71918p, 1, i11);
                    this.f71915m = 0;
                    this.f71913k = 0L;
                    this.f71914l = 0L;
                }
                m74971a(j13, this.f71909g - this.f71912j, "", 2, 1);
            }
        }
    }

    public C33920sc(Looper looper) {
        this.f71906d = looper;
    }

    /* JADX INFO: renamed from: a */
    public a m74969a() {
        if (this.f71908f != 0 && this.f71909g != 0) {
            this.f71905c.f71919b = SystemClock.uptimeMillis() - this.f71908f;
            this.f71905c.f71920c = SystemClock.currentThreadTimeMillis() - this.f71909g;
        } else {
            a aVar = this.f71905c;
            aVar.f71919b = 0L;
            aVar.f71920c = 0L;
        }
        a aVar2 = this.f71905c;
        aVar2.f71921d = this.f71910h;
        return aVar2;
    }

    /* JADX INFO: renamed from: a */
    public final void m74972a(a aVar, long j11, long j12, String str, int i11, int i12) {
        if (aVar != null) {
            aVar.f71919b = j11;
            aVar.f71920c = j12;
            aVar.f71921d = str;
            aVar.f71922e = i11;
            aVar.f71923f = i12;
            aVar.f71924g = System.currentTimeMillis();
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m74971a(long j11, long j12, String str, int i11, int i12) {
        if (this.f71916n.get()) {
            if (this.f71917o.size() <= 500) {
                a aVar = new a();
                m74972a(aVar, j11, j12, str, i11, i12);
                this.f71917o.add(aVar);
                return;
            }
            return;
        }
        Iterator<a> it = this.f71917o.iterator();
        while (it.hasNext()) {
            this.f71904b[this.f71907e] = it.next();
            this.f71907e = m74975d();
        }
        this.f71917o.clear();
        a[] aVarArr = this.f71904b;
        int i13 = this.f71907e;
        if (aVarArr[i13] == null) {
            aVarArr[i13] = new a();
        }
        a aVar2 = this.f71904b[this.f71907e];
        if (aVar2 != null) {
            m74972a(aVar2, j11, j12, str, i11, i12);
        }
        this.f71907e = m74975d();
    }
}
