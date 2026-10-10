package p852kotlin;

/* JADX INFO: renamed from: kotlin.d */
/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes61.dex */
public final /* synthetic */ class C41154d {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ long m90129a(long j11, long j12) {
        if (j12 < 0) {
            return (j11 ^ Long.MIN_VALUE) < (j12 ^ Long.MIN_VALUE) ? 0L : 1L;
        }
        if (j11 >= 0) {
            return j11 / j12;
        }
        long j13 = ((j11 >>> 1) / j12) << 1;
        return j13 + ((long) (((j11 - (j13 * j12)) ^ Long.MIN_VALUE) < (j12 ^ Long.MIN_VALUE) ? 0 : 1));
    }
}
