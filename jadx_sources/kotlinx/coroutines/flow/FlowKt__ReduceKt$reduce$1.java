package kotlinx.coroutines.flow;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: Reduce.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__ReduceKt", m90122f = "Reduce.kt", m90123i = {0}, m90124l = {18}, m90125m = "reduce", m90126n = {"accumulator"}, m90127s = {"L$0"})
public final class FlowKt__ReduceKt$reduce$1<S, T extends S> extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return C41636g.m90901Y(null, null, this);
    }

    public FlowKt__ReduceKt$reduce$1(Continuation<? super FlowKt__ReduceKt$reduce$1> continuation) {
        super(continuation);
    }
}
