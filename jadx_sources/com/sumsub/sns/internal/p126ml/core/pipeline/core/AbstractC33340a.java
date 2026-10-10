package com.sumsub.sns.internal.p126ml.core.pipeline.core;

/* JADX INFO: renamed from: com.sumsub.sns.internal.ml.core.pipeline.core.a */
/* JADX INFO: compiled from: r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208 */
/* JADX INFO: loaded from: classes59.dex */
public abstract class AbstractC33340a {
    /* JADX INFO: renamed from: b */
    public abstract Object mo71642b(Object obj);

    /* JADX INFO: renamed from: a */
    public final Object m71660a(Object obj) {
        try {
            return mo71642b(obj);
        } catch (OutOfMemoryError unused) {
            Runtime.getRuntime().gc();
            try {
                Thread.sleep(100L);
                System.runFinalization();
                return mo71642b(obj);
            } catch (InterruptedException unused2) {
                throw new AssertionError();
            }
        }
    }
}
