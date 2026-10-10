package com.tencent.bugly.proguard;

import android.app.PendingIntent;
import java.util.Iterator;

/* JADX INFO: renamed from: com.tencent.bugly.proguard.db */
/* JADX INFO: compiled from: BUGLY */
/* JADX INFO: loaded from: classes59.dex */
public class C33606db extends AbstractC33594d {
    /* JADX INFO: renamed from: a */
    public AbstractC33988w0 m72819a(int i11, PendingIntent pendingIntent) {
        AbstractC33988w0 next;
        C33564bb c33564bb;
        int i12;
        PendingIntent pendingIntent2;
        Iterator<AbstractC33988w0> it = this.f69467a.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if ((next instanceof C33564bb) && (((i12 = (c33564bb = (C33564bb) next).f69165k) != 0 && i12 == i11) || ((pendingIntent2 = c33564bb.f69164j) != null && pendingIntent2 == pendingIntent))) {
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

    public C33606db(long j11, long j12, long j13) {
        super(j11, j12, j13);
    }
}
