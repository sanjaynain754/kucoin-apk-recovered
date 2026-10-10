package androidx.datastore.core;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: DataStoreImpl.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@"}, m90084d2 = {"T", "Lkotlinx/coroutines/m0;", "<anonymous>"}, m90085k = 3, m90086mv = {1, 8, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1", m90122f = "DataStoreImpl.kt", m90123i = {}, m90124l = {331}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class DataStoreImpl$transformAndWrite$2$newData$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super T>, java.lang.Object> {
    final /* synthetic */ androidx.datastore.core.Data<T> $curData;
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> $transform;
    int label;

    public DataStoreImpl$transformAndWrite$2$newData$1(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super T>, ? extends java.lang.Object> r1, androidx.datastore.core.Data<T> r2, kotlin.coroutines.Continuation<? super androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1> r3) {
            r0 = this;
            r0.$transform = r1
            r0.$curData = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1 r3 = new androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r0 = r2.$transform
            androidx.datastore.core.Data<T> r1 = r2.$curData
            r3.<init>(r0, r1, r4)
            return r3
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.InterfaceC41709m0 r1, java.lang.Object r2) {
            r0 = this;
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull kotlinx.coroutines.InterfaceC41709m0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super T> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1 r1 = (androidx.datastore.core.DataStoreImpl$transformAndWrite$2$newData$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r4) {
            r3 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r3.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r4)
            return r4
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            kotlin.ResultKt.throwOnFailure(r4)
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super T>, java.lang.Object> r4 = r3.$transform
            androidx.datastore.core.Data<T> r1 = r3.$curData
            java.lang.Object r1 = r1.getValue()
            r3.label = r2
            java.lang.Object r4 = r4.invoke(r1, r3)
            if (r4 != r0) goto L2b
            return r0
        L2b:
            return r4
    }
}
