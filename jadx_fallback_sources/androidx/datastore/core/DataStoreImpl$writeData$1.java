package androidx.datastore.core;

/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl", m90122f = "DataStoreImpl.kt", m90123i = {0}, m90124l = {348}, m90125m = "writeData$datastore_core_release", m90126n = {"newVersion"}, m90127s = {"L$0"})
public final class DataStoreImpl$writeData$1 extends kotlin.coroutines.jvm.internal.ContinuationImpl {
    java.lang.Object L$0;
    int label;
    /* synthetic */ java.lang.Object result;
    final /* synthetic */ androidx.datastore.core.DataStoreImpl<T> this$0;

    public DataStoreImpl$writeData$1(androidx.datastore.core.DataStoreImpl<T> r1, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl$writeData$1> r2) {
            r0 = this;
            r0.this$0 = r1
            r0.<init>(r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r3) {
            r2 = this;
            r2.result = r3
            int r3 = r2.label
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r3 | r0
            r2.label = r3
            androidx.datastore.core.DataStoreImpl<T> r3 = r2.this$0
            r0 = 0
            r1 = 0
            java.lang.Object r3 = r3.writeData$datastore_core_release(r0, r1, r2)
            return r3
    }
}
