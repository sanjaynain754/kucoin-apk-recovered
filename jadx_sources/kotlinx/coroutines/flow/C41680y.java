package kotlinx.coroutines.flow;

import androidx.camera.view.C1454t;
import androidx.media3.exoplayer.upstream.CmcdData;
import java.util.concurrent.atomic.AtomicReference;
import kotlinx.coroutines.C41716o;
import kotlinx.coroutines.flow.internal.AbstractC41649c;
import kotlinx.coroutines.flow.internal.C41648b;
import og0.C43050d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugProbesKt;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.y */
/* JADX INFO: compiled from: StateFlow.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u0004J\r\u0010\u000f\u001a\u00020\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012R(\u0010\u0018\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00140\u0013j\n\u0012\u0006\u0012\u0004\u0018\u00010\u0014`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, m90084d2 = {"Lkotlinx/coroutines/flow/y;", "Lkotlinx/coroutines/flow/internal/c;", "Lkotlinx/coroutines/flow/StateFlowImpl;", "<init>", "()V", "flow", "", "d", "(Lkotlinx/coroutines/flow/StateFlowImpl;)Z", "", "Lkotlin/coroutines/Continuation;", "", "f", "(Lkotlinx/coroutines/flow/StateFlowImpl;)[Lkotlin/coroutines/Continuation;", "g", CmcdData.Factory.STREAMING_FORMAT_HLS, "()Z", "e", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Lkotlinx/coroutines/internal/WorkaroundAtomicReference;", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "Ljava/util/concurrent/atomic/AtomicReference;", "_state", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nStateFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n+ 2 Concurrent.common.kt\nkotlinx/coroutines/internal/Concurrent_commonKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,433:1\n37#2,2:434\n1#3:436\n426#4,11:437\n*S KotlinDebug\n*F\n+ 1 StateFlow.kt\nkotlinx/coroutines/flow/StateFlowSlot\n*L\n280#1:434,2\n303#1:437,11\n*E\n"})
public final class C41680y extends AbstractC41649c<StateFlowImpl<?>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final AtomicReference<Object> _state = new AtomicReference<>(null);

    @Override // kotlinx.coroutines.flow.internal.AbstractC41649c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean mo90976a(@NotNull StateFlowImpl<?> flow) {
        if (C43050d.m94562a(this._state) != null) {
            return false;
        }
        C43050d.m94563b(this._state, C41679x.f91721a);
        return true;
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final Object m91015e(@NotNull Continuation<? super Unit> continuation) {
        C41716o c41716o = new C41716o(IntrinsicsKt.intercepted(continuation), 1);
        c41716o.m91142E();
        if (!C1454t.m2255a(this._state, C41679x.f91721a, c41716o)) {
            Result.Companion companion = Result.INSTANCE;
            c41716o.resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
        }
        Object objM91171w = c41716o.m91171w();
        if (objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return objM91171w == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM91171w : Unit.INSTANCE;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC41649c
    @NotNull
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public Continuation<Unit>[] mo90977b(@NotNull StateFlowImpl<?> flow) {
        C43050d.m94563b(this._state, null);
        return C41648b.f91694a;
    }

    /* JADX INFO: renamed from: g */
    public final void m91017g() {
        AtomicReference<Object> atomicReference = this._state;
        while (true) {
            Object objM94562a = C43050d.m94562a(atomicReference);
            if (objM94562a == null || objM94562a == C41679x.f91722b) {
                return;
            }
            if (objM94562a == C41679x.f91721a) {
                if (C1454t.m2255a(this._state, objM94562a, C41679x.f91722b)) {
                    return;
                }
            } else if (C1454t.m2255a(this._state, objM94562a, C41679x.f91721a)) {
                Result.Companion companion = Result.INSTANCE;
                ((C41716o) objM94562a).resumeWith(Result.m103844constructorimpl(Unit.INSTANCE));
                return;
            }
        }
    }

    /* JADX INFO: renamed from: h */
    public final boolean m91018h() {
        Object andSet = this._state.getAndSet(C41679x.f91721a);
        Intrinsics.checkNotNull(andSet);
        return andSet == C41679x.f91722b;
    }
}
