package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Distinct.kt */
/* JADX INFO: loaded from: classes23.dex */
@kotlin.Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.DistinctFlowImpl$collect$2", m90122f = "Distinct.kt", m90123i = {}, m90124l = {73}, m90125m = "emit", m90126n = {}, m90127s = {})
public final class DistinctFlowImpl$collect$2$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.flow.DistinctFlowImpl.C415932<T> this$0;

    public DistinctFlowImpl$collect$2$emit$1(kotlinx.coroutines.flow.DistinctFlowImpl.C415932<? super T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.DistinctFlowImpl$collect$2$emit$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r2) {
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            kotlinx.coroutines.flow.DistinctFlowImpl$collect$2<T> r2 = r1.this$0
            r0 = 0
            java.lang.Object r2 = r2.emit(r0, r1)
            return r2
    }
}
