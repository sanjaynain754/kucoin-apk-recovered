package kotlinx.coroutines;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import og0.C43060i;
import og0.C43080w;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.CoroutineContext;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;

/* JADX INFO: renamed from: kotlinx.coroutines.v0 */
/* JADX INFO: compiled from: Builders.common.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0012\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0011\u0010\u0013\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0013\u0010\u0014R\u000b\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¨\u0006\u0017"}, m90084d2 = {"Lkotlinx/coroutines/v0;", ExifInterface.GPS_DIRECTION_TRUE, "Log0/w;", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/Continuation;", "uCont", "<init>", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "", "c1", "()Z", "b1", "", "state", "", "N", "(Ljava/lang/Object;)V", "U0", "Z0", "()Ljava/lang/Object;", "Lkotlinx/atomicfu/AtomicInt;", "_decision", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
public final class C41766v0<T> extends C43080w<T> {

    /* JADX INFO: renamed from: f */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f91871f = AtomicIntegerFieldUpdater.newUpdater(C41766v0.class, "_decision$volatile");
    private volatile /* synthetic */ int _decision$volatile;

    public C41766v0(@NotNull CoroutineContext coroutineContext, @NotNull Continuation<? super T> continuation) {
        super(coroutineContext, continuation);
    }

    /* JADX INFO: renamed from: b1 */
    private final boolean m91365b1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f91871f;
        do {
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f91871f.compareAndSet(this, 0, 2));
        return true;
    }

    /* JADX INFO: renamed from: c1 */
    private final boolean m91366c1() {
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f91871f;
        do {
            int i11 = atomicIntegerFieldUpdater.get(this);
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f91871f.compareAndSet(this, 0, 1));
        return true;
    }

    @Override // og0.C43080w, kotlinx.coroutines.JobSupport
    /* JADX INFO: renamed from: N */
    public void mo90396N(@Nullable Object state) {
        mo90471U0(state);
    }

    @Override // og0.C43080w, kotlinx.coroutines.AbstractC41539a
    /* JADX INFO: renamed from: U0 */
    public void mo90471U0(@Nullable Object state) {
        if (m91365b1()) {
            return;
        }
        C43060i.m94592b(IntrinsicsKt.intercepted(this.uCont), C41554c0.m90498a(state, this.uCont));
    }

    @Nullable
    /* JADX INFO: renamed from: Z0 */
    public final Object m91367Z0() {
        if (m91366c1()) {
            return IntrinsicsKt.getCOROUTINE_SUSPENDED();
        }
        Object objM90495h = C41551b2.m90495h(m90428k0());
        if (!(objM90495h instanceof C41549b0)) {
            return objM90495h;
        }
        throw ((C41549b0) objM90495h).cause;
    }
}
