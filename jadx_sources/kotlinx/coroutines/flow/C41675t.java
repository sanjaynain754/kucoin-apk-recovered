package kotlinx.coroutines.flow;

import androidx.media3.exoplayer.upstream.CmcdData;
import kotlinx.coroutines.flow.internal.AbstractC41649c;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.jvm.JvmField;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: renamed from: kotlinx.coroutines.flow.t */
/* JADX INFO: compiled from: SharedFlow.kt */
/* JADX INFO: loaded from: classes23.dex */
@Metadata(m90083d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0007\b\u0000\u0018\u00002\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\u0007\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n0\t2\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0011\u001a\u00020\u000e8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, m90084d2 = {"Lkotlinx/coroutines/flow/t;", "Lkotlinx/coroutines/flow/internal/c;", "Lkotlinx/coroutines/flow/SharedFlowImpl;", "<init>", "()V", "flow", "", "c", "(Lkotlinx/coroutines/flow/SharedFlowImpl;)Z", "", "Lkotlin/coroutines/Continuation;", "", "d", "(Lkotlinx/coroutines/flow/SharedFlowImpl;)[Lkotlin/coroutines/Continuation;", "", CmcdData.Factory.OBJECT_TYPE_AUDIO_ONLY, "J", "index", "b", "Lkotlin/coroutines/Continuation;", "cont", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {2, 1, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nSharedFlow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SharedFlow.kt\nkotlinx/coroutines/flow/SharedFlowSlot\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,746:1\n1#2:747\n*E\n"})
public final class C41675t extends AbstractC41649c<SharedFlowImpl<?>> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @JvmField
    public long index = -1;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @JvmField
    @Nullable
    public Continuation<? super Unit> cont;

    @Override // kotlinx.coroutines.flow.internal.AbstractC41649c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public boolean mo90976a(@NotNull SharedFlowImpl<?> flow) {
        if (this.index >= 0) {
            return false;
        }
        this.index = flow.m90852X();
        return true;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC41649c
    @NotNull
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Continuation<Unit>[] mo90977b(@NotNull SharedFlowImpl<?> flow) {
        long j11 = this.index;
        this.index = -1L;
        this.cont = null;
        return flow.m90851W(j11);
    }
}
