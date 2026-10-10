package com.kubi.network.retrofit.utils;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: RetrofitFlowEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u0001H\u0002H\u008a@"}, m90084d2 = {"<anonymous>", "", "T", "it"}, m90085k = 3, m90086mv = {1, 8, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.network.retrofit.utils.RetrofitFlowExKt$onSuccess$3", m90122f = "RetrofitFlowEx.kt", m90123i = {}, m90124l = {118}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nRetrofitFlowEx.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RetrofitFlowEx.kt\ncom/kubi/network/retrofit/utils/RetrofitFlowExKt$onSuccess$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,184:1\n1#2:185\n*E\n"})
public final class RetrofitFlowExKt$onSuccess$3<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $block;
    /* synthetic */ java.lang.Object L$0;
    int label;

    public RetrofitFlowExKt$onSuccess$3(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1, kotlin.coroutines.Continuation<? super com.kubi.network.retrofit.utils.RetrofitFlowExKt$onSuccess$3> r2) {
            r0 = this;
            r0.$block = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            com.kubi.network.retrofit.utils.RetrofitFlowExKt$onSuccess$3 r0 = new com.kubi.network.retrofit.utils.RetrofitFlowExKt$onSuccess$3
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r2.$block
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(@org.jetbrains.annotations.Nullable T r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            com.kubi.network.retrofit.utils.RetrofitFlowExKt$onSuccess$3 r1 = (com.kubi.network.retrofit.utils.RetrofitFlowExKt$onSuccess$3) r1
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
            goto L29
        Lf:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r0)
            throw r4
        L17:
            kotlin.ResultKt.throwOnFailure(r4)
            java.lang.Object r4 = r3.L$0
            if (r4 == 0) goto L29
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r3.$block
            r3.label = r2
            java.lang.Object r4 = r1.invoke(r4, r3)
            if (r4 != r0) goto L29
            return r0
        L29:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
    }
}
