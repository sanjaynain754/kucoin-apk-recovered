package com.kubi.mvi.common;

/* JADX INFO: compiled from: MviEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"T", "Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.mvi.common.MviExKt$collectWhenStart$1", m90122f = "MviEx.kt", m90123i = {}, m90124l = {38}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class MviExKt$collectWhenStart$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $action;
    final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41634e<T> $this_collectWhenStart;
    int label;

    /* JADX INFO: renamed from: com.kubi.mvi.common.MviExKt$collectWhenStart$1$a */
    /* JADX INFO: compiled from: MviEx.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, m90084d2 = {"<anonymous>", "", "T", "it", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"}, m90085k = 3, m90086mv = {1, 9, 0}, m90088xi = 48)
    public static final class C19238a<T> implements kotlinx.coroutines.flow.InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> f35619b;

        public C19238a(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1) {
                r0 = this;
                r0.f35619b = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        @org.jetbrains.annotations.Nullable
        public final java.lang.Object emit(T r2, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r3) {
                r1 = this;
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r0 = r1.f35619b
                java.lang.Object r2 = r0.invoke(r2, r3)
                java.lang.Object r3 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r2 != r3) goto Ld
                return r2
            Ld:
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                return r2
        }
    }

    public MviExKt$collectWhenStart$1(kotlinx.coroutines.flow.InterfaceC41634e<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super com.kubi.mvi.common.MviExKt$collectWhenStart$1> r3) {
            r0 = this;
            r0.$this_collectWhenStart = r1
            r0.$action = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            com.kubi.mvi.common.MviExKt$collectWhenStart$1 r3 = new com.kubi.mvi.common.MviExKt$collectWhenStart$1
            kotlinx.coroutines.flow.e<T> r0 = r2.$this_collectWhenStart
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r2.$action
            r3.<init>(r0, r1, r4)
            return r3
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.InterfaceC41709m0 r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.m0 r1 = (kotlinx.coroutines.InterfaceC41709m0) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    @org.jetbrains.annotations.Nullable
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(@org.jetbrains.annotations.NotNull kotlinx.coroutines.InterfaceC41709m0 r1, @org.jetbrains.annotations.Nullable kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            com.kubi.mvi.common.MviExKt$collectWhenStart$1 r1 = (com.kubi.mvi.common.MviExKt$collectWhenStart$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r5)
            goto L2c
        Lf:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L17:
            kotlin.ResultKt.throwOnFailure(r5)
            kotlinx.coroutines.flow.e<T> r5 = r4.$this_collectWhenStart
            com.kubi.mvi.common.MviExKt$collectWhenStart$1$a r1 = new com.kubi.mvi.common.MviExKt$collectWhenStart$1$a
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r4.$action
            r1.<init>(r3)
            r4.label = r2
            java.lang.Object r5 = r5.collect(r1, r4)
            if (r5 != r0) goto L2c
            return r0
        L2c:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }
}
