package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Share.kt */
/* JADX INFO: loaded from: classes61.dex */
@kotlin.Metadata(m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.SubscribedFlowCollector", m90122f = "Share.kt", m90123i = {0, 0}, m90124l = {422, 426}, m90125m = "onSubscription", m90126n = {"this", "safeCollector"}, m90127s = {"L$0", "L$1"})
public final class SubscribedFlowCollector$onSubscription$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    java.lang.Object L$1;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ kotlinx.coroutines.flow.SubscribedFlowCollector<T> this$0;

    public SubscribedFlowCollector$onSubscription$1(kotlinx.coroutines.flow.SubscribedFlowCollector<T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.SubscribedFlowCollector$onSubscription$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r2) {
            r1 = this;
            r1.result = r2
            int r2 = r1.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r2 | r0
            r1.label = r2
            kotlinx.coroutines.flow.SubscribedFlowCollector<T> r2 = r1.this$0
            java.lang.Object r2 = r2.m90870a(r1)
            return r2
    }
}
