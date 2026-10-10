package com.tencent.bugly.proguard;

import android.os.IBinder;
import java.util.Iterator;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.hi */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33697hi extends AbstractC33594d {
    /* JADX INFO: renamed from: a */
    public AbstractC33988w0 m73291a(IBinder iBinder) {
        AbstractC33988w0 next;
        Iterator<AbstractC33988w0> it = this.f69467a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if ((next instanceof C33676gi) && ((C33676gi) next).f70024l == iBinder) {
                break;
            }
        }
        if (next == null) {
            return null;
        }
        next.f72396c = System.currentTimeMillis();
        for (AbstractC33594d.a aVar : this.f69469c) {
            if (aVar.f69474b == next.f72395b) {
                aVar.f69475c = next.f72396c;
            }
        }
        this.f69467a.remove(next);
        this.f69468b.add(next);
        return next;
    }

    public C33697hi(long j11, long j12, long j13) {
        super(j11, j12, j13);
    }
}
