package kc0;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: kc0.c */
/* JADX INFO: compiled from: ExpiredBatches.java */
/* JADX INFO: loaded from: classes2.dex */
public class C40986c {

    /* JADX INFO: renamed from: a */
    public final List<DelayedC40992i> f91077a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public long f91078b;

    /* JADX INFO: renamed from: a */
    public void m89770a(DelayedC40992i delayedC40992i) {
        if (!this.f91077a.add(delayedC40992i)) {
            throw new IllegalStateException("failed to add producer batch to expired batches");
        }
    }

    /* JADX INFO: renamed from: b */
    public List<DelayedC40992i> m89771b() {
        return this.f91077a;
    }

    /* JADX INFO: renamed from: c */
    public long m89772c() {
        return this.f91078b;
    }

    /* JADX INFO: renamed from: d */
    public void m89773d(long j11) {
        this.f91078b = j11;
    }
}
