package com.kubi.core.utils;

/* JADX INFO: compiled from: FlowExt.kt */
/* JADX INFO: loaded from: classes9.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.core.utils.FlowExtKt$collectLatestData$2", m90122f = "FlowExt.kt", m90123i = {}, m90124l = {38}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FlowExtKt$collectLatestData$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.InterfaceC41709m0, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $action;
    final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41634e<T> $flow;
    int label;

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.kubi.core.utils.FlowExtKt$collectLatestData$2$1 */
    /* JADX INFO: compiled from: FlowExt.kt */
    @kotlin.Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u0002H\u0002H\n"}, m90084d2 = {"<anonymous>", "", "T", "it"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.core.utils.FlowExtKt$collectLatestData$2$1", m90122f = "FlowExt.kt", m90123i = {0}, m90124l = {39}, m90125m = "invokeSuspend", m90126n = {"it"}, m90127s = {"L$0"})
    public static final class C124611<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
        final /* synthetic */ kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> $action;
        /* synthetic */ java.lang.Object L$0;
        int label;

        public C124611(kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r1, kotlin.coroutines.Continuation<? super com.kubi.core.utils.FlowExtKt$collectLatestData$2.C124611> r2) {
                r0 = this;
                r0.$action = r1
                r1 = 2
                r0.<init>(r1, r2)
                return
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
                r2 = this;
                com.kubi.core.utils.FlowExtKt$collectLatestData$2$1 r0 = new com.kubi.core.utils.FlowExtKt$collectLatestData$2$1
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r1 = r2.$action
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

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final java.lang.Object invoke2(T r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
                r0 = this;
                kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
                com.kubi.core.utils.FlowExtKt$collectLatestData$2$1 r1 = (com.kubi.core.utils.FlowExtKt$collectLatestData$2.C124611) r1
                kotlin.Unit r2 = kotlin.Unit.INSTANCE
                java.lang.Object r1 = r1.invokeSuspend(r2)
                return r1
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                r4 = this;
                java.lang.Object r0 = r4.L$0
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r4.label
                r3 = 1
                if (r2 == 0) goto L19
                if (r2 != r3) goto L11
                kotlin.ResultKt.throwOnFailure(r5)
                goto L2d
            L11:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L19:
                kotlin.ResultKt.throwOnFailure(r5)
                kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r5 = r4.$action
                java.lang.Object r2 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r0)
                r4.L$0 = r2
                r4.label = r3
                java.lang.Object r5 = r5.invoke(r0, r4)
                if (r5 != r1) goto L2d
                return r1
            L2d:
                kotlin.Unit r5 = kotlin.Unit.INSTANCE
                return r5
        }
    }

    public FlowExtKt$collectLatestData$2(kotlinx.coroutines.flow.InterfaceC41634e<? extends T> r1, kotlin.jvm.functions.Function2<? super T, ? super kotlin.coroutines.Continuation<? super kotlin.Unit>, ? extends java.lang.Object> r2, kotlin.coroutines.Continuation<? super com.kubi.core.utils.FlowExtKt$collectLatestData$2> r3) {
            r0 = this;
            r0.$flow = r1
            r0.$action = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            com.kubi.core.utils.FlowExtKt$collectLatestData$2 r3 = new com.kubi.core.utils.FlowExtKt$collectLatestData$2
            kotlinx.coroutines.flow.e<T> r0 = r2.$flow
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

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.InterfaceC41709m0 r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            com.kubi.core.utils.FlowExtKt$collectLatestData$2 r1 = (com.kubi.core.utils.FlowExtKt$collectLatestData$2) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            r5 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r5.label
            r2 = 1
            if (r1 == 0) goto L17
            if (r1 != r2) goto Lf
            kotlin.ResultKt.throwOnFailure(r6)
            goto L2d
        Lf:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L17:
            kotlin.ResultKt.throwOnFailure(r6)
            kotlinx.coroutines.flow.e<T> r6 = r5.$flow
            com.kubi.core.utils.FlowExtKt$collectLatestData$2$1 r1 = new com.kubi.core.utils.FlowExtKt$collectLatestData$2$1
            kotlin.jvm.functions.Function2<T, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> r3 = r5.$action
            r4 = 0
            r1.<init>(r3, r4)
            r5.label = r2
            java.lang.Object r6 = kotlinx.coroutines.flow.C41636g.m90925l(r6, r1, r5)
            if (r6 != r0) goto L2d
            return r0
        L2d:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            return r6
    }
}
