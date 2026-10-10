package kotlinx.coroutines.sync;

import p852kotlin.Metadata;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.FunctionReferenceImpl;
import rg0.C44091j;
import rg0.C44092k;

/* JADX INFO: compiled from: Semaphore.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
public /* synthetic */ class SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 extends FunctionReferenceImpl implements Function2<Long, C44092k, C44092k> {
    public static final SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1 INSTANCE = new SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1();

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ C44092k invoke(Long l11, C44092k c44092k) {
        return invoke(l11.longValue(), c44092k);
    }

    public SemaphoreAndMutexImpl$addAcquireToQueue$createNewSegment$1() {
        super(2, C44091j.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
    }

    public final C44092k invoke(long j11, C44092k c44092k) {
        return C44091j.m97156j(j11, c44092k);
    }
}
