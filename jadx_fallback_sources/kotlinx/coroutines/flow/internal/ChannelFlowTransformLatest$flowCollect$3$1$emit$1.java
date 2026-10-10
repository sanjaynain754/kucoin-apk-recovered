package kotlinx.coroutines.flow.internal;

/* JADX INFO: compiled from: Merge.kt */
/* JADX INFO: loaded from: classes23.dex */
@kotlin.Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1", m90122f = "Merge.kt", m90123i = {0, 0}, m90124l = {26}, m90125m = "emit", m90126n = {"this", "value"}, m90127s = {"L$0", "L$1"})
public final class ChannelFlowTransformLatest$flowCollect$3$1$emit$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.C416401<T> this$0;

    public ChannelFlowTransformLatest$flowCollect$3$1$emit$1(kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.C416401<? super T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1> r2) {
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
            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1<T> r2 = r1.this$0
            r0 = 0
            java.lang.Object r2 = r2.emit(r0, r1)
            return r2
    }
}
