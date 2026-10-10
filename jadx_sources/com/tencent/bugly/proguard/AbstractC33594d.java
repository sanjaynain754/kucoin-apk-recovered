package com.tencent.bugly.proguard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.d */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33594d {

    /* JADX INFO: renamed from: a */
    public ConcurrentLinkedQueue<AbstractC33988w0> f69467a = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: b */
    public ConcurrentLinkedQueue<AbstractC33988w0> f69468b = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: c */
    public ConcurrentLinkedQueue<a> f69469c = new ConcurrentLinkedQueue<>();

    /* JADX INFO: renamed from: d */
    public long f69470d;

    /* JADX INFO: renamed from: e */
    public long f69471e;

    /* JADX INFO: renamed from: f */
    public long f69472f;

    /* JADX INFO: renamed from: g */
    public long f69473g;

    /* JADX INFO: renamed from: com.tencent.bugly.proguard.d$a */
    /* JADX INFO: compiled from: BUGLY */
    public class a implements Comparable<a> {

        /* JADX INFO: renamed from: b */
        public long f69474b;

        /* JADX INFO: renamed from: c */
        public long f69475c;

        public a(long j11, long j12) {
            this.f69474b = j11;
            this.f69475c = j12;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return Long.compare(this.f69474b, aVar.f69474b);
        }
    }

    /* JADX INFO: renamed from: a */
    public void m72752a(AbstractC33988w0 abstractC33988w0) {
        if (!this.f69467a.contains(abstractC33988w0)) {
            this.f69467a.add(abstractC33988w0);
        }
        Iterator<a> it = this.f69469c.iterator();
        boolean z11 = false;
        while (it.hasNext()) {
            if (it.next().f69474b == abstractC33988w0.f72395b) {
                z11 = true;
            }
        }
        if (z11) {
            return;
        }
        this.f69469c.add(new a(abstractC33988w0.f72395b, 0L));
    }

    /* JADX INFO: renamed from: b */
    public void m72754b(long j11) {
        ArrayList arrayList = new ArrayList();
        for (AbstractC33988w0 abstractC33988w0 : this.f69468b) {
            if (j11 - abstractC33988w0.f72395b >= 600000) {
                arrayList.add(abstractC33988w0);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.f69468b.remove((AbstractC33988w0) it.next());
        }
    }

    /* JADX INFO: renamed from: c */
    public ArrayList<AbstractC33988w0> m72755c(long j11) {
        ArrayList<AbstractC33988w0> arrayList = new ArrayList<>();
        for (AbstractC33988w0 abstractC33988w0 : this.f69467a) {
            if (!abstractC33988w0.f72400g && j11 - abstractC33988w0.f72395b < 600000) {
                arrayList.add(abstractC33988w0);
            }
        }
        for (AbstractC33988w0 abstractC33988w1 : this.f69468b) {
            if (!abstractC33988w1.f72400g && j11 - abstractC33988w1.f72395b < 600000) {
                arrayList.add(abstractC33988w1);
            }
        }
        if (arrayList.size() <= this.f69471e) {
            return new ArrayList<>();
        }
        Iterator<AbstractC33988w0> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f72400g = true;
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: d */
    public ArrayList<AbstractC33988w0> m72756d(long j11) {
        ArrayList<AbstractC33988w0> arrayList = new ArrayList<>();
        for (AbstractC33988w0 abstractC33988w0 : this.f69467a) {
            if (!abstractC33988w0.f72399f && j11 - abstractC33988w0.f72395b >= this.f69470d) {
                arrayList.add(abstractC33988w0);
                abstractC33988w0.f72399f = true;
            }
        }
        for (AbstractC33988w0 abstractC33988w1 : this.f69468b) {
            if (!abstractC33988w1.f72399f && abstractC33988w1.f72396c - abstractC33988w1.f72395b >= this.f69470d) {
                arrayList.add(abstractC33988w1);
                abstractC33988w1.f72399f = true;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: e */
    public ArrayList<AbstractC33988w0> m72757e(long j11) {
        ArrayList<AbstractC33988w0> arrayList = new ArrayList<>();
        ArrayList<a> arrayList2 = new ArrayList<>();
        for (AbstractC33988w0 abstractC33988w0 : this.f69467a) {
            if (!abstractC33988w0.f72401h && j11 - abstractC33988w0.f72395b < 600000) {
                arrayList.add(abstractC33988w0);
            }
            arrayList2.add(new a(abstractC33988w0.f72395b, j11));
        }
        for (AbstractC33988w0 abstractC33988w1 : this.f69468b) {
            if (!abstractC33988w1.f72401h && j11 - abstractC33988w1.f72395b < 600000) {
                arrayList.add(abstractC33988w1);
            }
            arrayList2.add(new a(abstractC33988w1.f72395b, abstractC33988w1.f72396c));
        }
        long jM72750a = m72750a(arrayList2);
        this.f69473g = jM72750a;
        if (jM72750a <= this.f69472f) {
            return new ArrayList<>();
        }
        Iterator<AbstractC33988w0> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().f72401h = true;
        }
        return arrayList;
    }

    public AbstractC33594d(long j11, long j12, long j13) {
        this.f69470d = j11;
        this.f69471e = j12;
        this.f69472f = j13;
    }

    /* JADX INFO: renamed from: a */
    public long m72749a(long j11) {
        ArrayList<a> arrayList = new ArrayList<>();
        for (a aVar : this.f69469c) {
            long j12 = j11;
            a aVar2 = new a(aVar.f69474b, j12);
            long j13 = aVar.f69475c;
            if (j13 != 0) {
                aVar2.f69475c = j13;
            }
            arrayList.add(aVar2);
            j11 = j12;
        }
        return m72750a(arrayList);
    }

    /* JADX INFO: renamed from: b */
    public final a m72753b(a aVar, ArrayList<a> arrayList) {
        if (arrayList.size() == 0) {
            return aVar;
        }
        aVar.f69474b = Math.min(aVar.f69474b, arrayList.get(0).f69474b);
        aVar.f69475c = Math.max(aVar.f69475c, arrayList.get(arrayList.size() - 1).f69475c);
        return aVar;
    }

    /* JADX INFO: renamed from: a */
    public final ArrayList<a> m72751a(a aVar, ArrayList<a> arrayList) {
        ArrayList<a> arrayList2 = new ArrayList<>();
        for (a aVar2 : arrayList) {
            if (aVar.f69475c > aVar2.f69474b && aVar.f69474b < aVar2.f69475c) {
                arrayList2.add(aVar2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: renamed from: a */
    public long m72750a(ArrayList<a> arrayList) {
        int size = arrayList.size();
        ArrayList<a> arrayList2 = new ArrayList<>();
        for (int i11 = 0; i11 < size; i11++) {
            a aVar = arrayList.get(i11);
            ArrayList<a> arrayListM72751a = m72751a(aVar, arrayList2);
            arrayList2.removeAll(arrayListM72751a);
            arrayList2.add(m72753b(aVar, arrayListM72751a));
            Collections.sort(arrayList2);
        }
        long j11 = 0;
        for (a aVar2 : arrayList2) {
            j11 += aVar2.f69475c - aVar2.f69474b;
        }
        return j11;
    }
}
