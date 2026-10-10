package com.kubi.event.common;

/* JADX INFO: compiled from: EventEx.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"T", "Lkotlinx/coroutines/m0;", "", "<anonymous>", "(Lkotlinx/coroutines/m0;)V"}, m90085k = 3, m90086mv = {1, 6, 0})
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.event.common.EventExKt$collectWhenCreated$1", m90122f = "EventEx.kt", m90123i = {}, m90124l = {112}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class EventExKt$collectWhenCreated$1 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $action;
    final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41634e<T> $this_collectWhenCreated;
    int label;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.kubi.event.common.EventExKt$collectWhenCreated$1$a */
    /* JADX INFO: compiled from: Collect.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001b\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0002\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, m90084d2 = {"com/kubi/event/common/EventExKt$collectWhenCreated$1$a", "Lkotlinx/coroutines/flow/f;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m90085k = 1, m90086mv = {1, 6, 0}, m90088xi = 48)
    public static final class C12574a<T> implements kotlinx.coroutines.flow.InterfaceC41635f<T> {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ kotlin.jvm.functions.Function2 f21600b;

        public C12574a(kotlin.jvm.functions.Function2 r1) {
                r0 = this;
                r0.f21600b = r1
                r0.<init>()
                return
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        @org.jetbrains.annotations.Nullable
        public java.lang.Object emit(T r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<? super kotlin.Unit> r4) {
                r2 = this;
                kotlin.jvm.functions.Function2 r0 = r2.f21600b
                r1 = 6
                kotlin.jvm.internal.InlineMarker.mark(r1)
                java.lang.Object r3 = r0.invoke(r3, r4)
                r4 = 7
                kotlin.jvm.internal.InlineMarker.mark(r4)
                java.lang.Object r4 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                if (r3 != r4) goto L15
                return r3
            L15:
                kotlin.Unit r3 = kotlin.Unit.INSTANCE
                return r3
        }
    }

    public EventExKt$collectWhenCreated$1(kotlinx.coroutines.flow.InterfaceC41634e<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super com.kubi.event.common.EventExKt$collectWhenCreated$1> r3) {
            r0 = this;
            r0.$this_collectWhenCreated = r1
            r0.$action = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.NotNull
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(@org.jetbrains.annotations.Nullable java.lang.Object r3, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            com.kubi.event.common.EventExKt$collectWhenCreated$1 r3 = new com.kubi.event.common.EventExKt$collectWhenCreated$1
            kotlinx.coroutines.flow.e<T> r0 = r2.$this_collectWhenCreated
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
            com.kubi.event.common.EventExKt$collectWhenCreated$1 r1 = (com.kubi.event.common.EventExKt$collectWhenCreated$1) r1
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
            kotlinx.coroutines.flow.e<T> r5 = r4.$this_collectWhenCreated
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r4.$action
            com.kubi.event.common.EventExKt$collectWhenCreated$1$a r3 = new com.kubi.event.common.EventExKt$collectWhenCreated$1$a
            r3.<init>(r1)
            r4.label = r2
            java.lang.Object r5 = r5.collect(r3, r4)
            if (r5 != r0) goto L2c
            return r0
        L2c:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
    }
}
