package androidx.lifecycle;

/* JADX INFO: compiled from: CoroutineLiveData.kt */
/* JADX INFO: loaded from: classes34.dex */
@kotlin.Metadata(m90085k = 3, m90086mv = {2, 0, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.lifecycle.CoroutineLiveData", m90122f = "CoroutineLiveData.kt", m90123i = {}, m90124l = {226}, m90125m = "clearSource$lifecycle_livedata_release", m90126n = {}, m90127s = {})
public final class CoroutineLiveData$clearSource$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.lifecycle.CoroutineLiveData<T> this$0;

    public CoroutineLiveData$clearSource$1(androidx.lifecycle.CoroutineLiveData<T> r1, kotlin.coroutines.Continuation<? super androidx.lifecycle.CoroutineLiveData$clearSource$1> r2) {
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
            androidx.lifecycle.CoroutineLiveData<T> r2 = r1.this$0
            java.lang.Object r2 = r2.clearSource$lifecycle_livedata_release(r1)
            return r2
    }
}
