package com.tencent.bugly.proguard;

import android.app.AlarmManager;
import android.app.PendingIntent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.p */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33846p {

    /* JADX INFO: renamed from: a */
    public ConcurrentLinkedQueue<AbstractC33988w0> f71349a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: b */
    public ConcurrentLinkedQueue<AbstractC33988w0> f71350b = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: c */
    public ConcurrentLinkedQueue<AbstractC33988w0> f71351c = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: d */
    public ConcurrentLinkedQueue<AbstractC33988w0> f71352d = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: e */
    public long f71353e;

    /* JADX INFO: renamed from: f */
    public long f71354f;

    /* JADX INFO: renamed from: a */
    public void m74487a(AbstractC33988w0 abstractC33988w0) {
        int i11 = ((C33804n) abstractC33988w0).f71006j;
        if (i11 == 0 || i11 == 2) {
            if (this.f71351c.contains(abstractC33988w0)) {
                return;
            }
            this.f71351c.add(abstractC33988w0);
        } else {
            if (this.f71349a.contains(abstractC33988w0)) {
                return;
            }
            this.f71349a.add(abstractC33988w0);
        }
    }

    /* JADX INFO: renamed from: b */
    public ArrayList<AbstractC33988w0> m74490b(long j11) {
        ArrayList<AbstractC33988w0> arrayList = new ArrayList<>();
        for (AbstractC33988w0 abstractC33988w0 : this.f71349a) {
            long j12 = j11;
            if (m74489a((C33804n) abstractC33988w0, j12, this.f71349a, this.f71350b)) {
                arrayList.add(abstractC33988w0);
            }
            j11 = j12;
        }
        long j13 = j11;
        for (AbstractC33988w0 abstractC33988w1 : this.f71350b) {
            if (m74489a((C33804n) abstractC33988w1, j13, this.f71349a, this.f71350b)) {
                arrayList.add(abstractC33988w1);
            }
        }
        if (arrayList.size() <= this.f71353e) {
            return new ArrayList<>();
        }
        m74488a(arrayList);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public ArrayList<AbstractC33988w0> m74491c(long j11) {
        ArrayList<AbstractC33988w0> arrayList = new ArrayList<>();
        for (AbstractC33988w0 abstractC33988w0 : this.f71351c) {
            long j12 = j11;
            if (m74489a((C33804n) abstractC33988w0, j12, this.f71351c, this.f71352d)) {
                arrayList.add(abstractC33988w0);
            }
            j11 = j12;
        }
        long j13 = j11;
        for (AbstractC33988w0 abstractC33988w1 : this.f71352d) {
            if (m74489a((C33804n) abstractC33988w1, j13, this.f71351c, this.f71352d)) {
                arrayList.add(abstractC33988w1);
            }
        }
        if (arrayList.size() <= this.f71354f) {
            return new ArrayList<>();
        }
        m74488a(arrayList);
        return arrayList;
    }

    public C33846p(long j11, long j12) {
        this.f71353e = j11;
        this.f71354f = j12;
    }

    /* JADX INFO: renamed from: a */
    public final AbstractC33988w0 m74483a(PendingIntent pendingIntent, AlarmManager.OnAlarmListener onAlarmListener, ConcurrentLinkedQueue<AbstractC33988w0> concurrentLinkedQueue) {
        C33804n c33804n;
        PendingIntent pendingIntent2;
        AlarmManager.OnAlarmListener onAlarmListener2;
        for (AbstractC33988w0 abstractC33988w0 : concurrentLinkedQueue) {
            if ((abstractC33988w0 instanceof C33804n) && (((pendingIntent2 = (c33804n = (C33804n) abstractC33988w0).f71009m) != null && pendingIntent2 == pendingIntent) || ((onAlarmListener2 = c33804n.f71010n) != null && onAlarmListener2 == onAlarmListener))) {
                return abstractC33988w0;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: a */
    public void m74486a(PendingIntent pendingIntent, AlarmManager.OnAlarmListener onAlarmListener) {
        AbstractC33988w0 abstractC33988w0M74483a = m74483a(pendingIntent, onAlarmListener, this.f71349a);
        if (abstractC33988w0M74483a != null) {
            abstractC33988w0M74483a.f72396c = System.currentTimeMillis();
            this.f71349a.remove(abstractC33988w0M74483a);
            this.f71350b.add(abstractC33988w0M74483a);
        } else {
            AbstractC33988w0 abstractC33988w0M74483a2 = m74483a(pendingIntent, onAlarmListener, this.f71351c);
            if (abstractC33988w0M74483a2 != null) {
                abstractC33988w0M74483a2.f72396c = System.currentTimeMillis();
                this.f71351c.remove(abstractC33988w0M74483a2);
                this.f71352d.add(abstractC33988w0M74483a2);
            }
        }
    }

    /* JADX INFO: renamed from: a */
    public final void m74485a(long j11, ConcurrentLinkedQueue<AbstractC33988w0> concurrentLinkedQueue) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC33988w0 abstractC33988w0 : concurrentLinkedQueue) {
            if (j11 - ((C33804n) abstractC33988w0).f71007k >= 600000) {
                arrayList.add(abstractC33988w0);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            concurrentLinkedQueue.remove((AbstractC33988w0) it.next());
        }
    }

    /* JADX INFO: renamed from: a */
    public void m74484a(long j11) {
        m74485a(j11, this.f71349a);
        m74485a(j11, this.f71350b);
        m74485a(j11, this.f71351c);
        m74485a(j11, this.f71352d);
    }

    /* JADX INFO: renamed from: a */
    public final boolean m74489a(C33804n c33804n, long j11, ConcurrentLinkedQueue<AbstractC33988w0> concurrentLinkedQueue, ConcurrentLinkedQueue<AbstractC33988w0> concurrentLinkedQueue2) {
        if (concurrentLinkedQueue2.contains(c33804n)) {
            long j12 = c33804n.f72396c;
            long j13 = c33804n.f71007k;
            if (j12 > j13 && j11 - j13 < 600000 && !c33804n.f72400g) {
                return true;
            }
        }
        if (!concurrentLinkedQueue.contains(c33804n)) {
            return false;
        }
        long j14 = c33804n.f71007k;
        return j14 < j11 && j11 - j14 < 600000 && !c33804n.f72400g;
    }

    /* JADX INFO: renamed from: a */
    public final void m74488a(ArrayList<AbstractC33988w0> arrayList) {
        Iterator<AbstractC33988w0> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f72400g = true;
        }
    }
}
