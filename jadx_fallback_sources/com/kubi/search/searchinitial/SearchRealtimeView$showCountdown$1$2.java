package com.kubi.search.searchinitial;

/* JADX INFO: compiled from: SearchRealtimeView.kt */
/* JADX INFO: loaded from: classes44.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "com.kubi.search.searchinitial.SearchRealtimeView$showCountdown$1$2", m90122f = "SearchRealtimeView.kt", m90123i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, m90124l = {169, 170}, m90125m = "invokeSuspend", m90126n = {"$this$flow", "$this$forEach$iv", "element$iv", "$i$f$forEach", "it", "$i$a$-forEach-SearchRealtimeView$showCountdown$1$2$1", "$this$flow", "$this$forEach$iv", "element$iv", "$i$f$forEach", "it", "$i$a$-forEach-SearchRealtimeView$showCountdown$1$2$1"}, m90127s = {"L$0", "L$1", "L$3", "I$0", "I$1", "I$2", "L$0", "L$1", "L$3", "I$0", "I$1", "I$2"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nSearchRealtimeView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchRealtimeView.kt\ncom/kubi/search/searchinitial/SearchRealtimeView$showCountdown$1$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,269:1\n1869#2,2:270\n*S KotlinDebug\n*F\n+ 1 SearchRealtimeView.kt\ncom/kubi/search/searchinitial/SearchRealtimeView$showCountdown$1$2\n*L\n168#1:270,2\n*E\n"})
public final class SearchRealtimeView$showCountdown$1$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.flow.InterfaceC41635f<? super java.lang.Integer>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ int $totalSeconds;
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    java.lang.Object L$2;
    java.lang.Object L$3;
    int label;

    public SearchRealtimeView$showCountdown$1$2(int r1, kotlin.coroutines.Continuation<? super com.kubi.search.searchinitial.SearchRealtimeView$showCountdown$1$2> r2) {
            r0 = this;
            r0.$totalSeconds = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            com.kubi.search.searchinitial.SearchRealtimeView$showCountdown$1$2 r0 = new com.kubi.search.searchinitial.SearchRealtimeView$showCountdown$1$2
            int r1 = r2.$totalSeconds
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.flow.InterfaceC41635f<? super java.lang.Integer> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.invoke2(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final java.lang.Object invoke2(kotlinx.coroutines.flow.InterfaceC41635f<? super java.lang.Integer> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            com.kubi.search.searchinitial.SearchRealtimeView$showCountdown$1$2 r1 = (com.kubi.search.searchinitial.SearchRealtimeView$showCountdown$1$2) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            r11 = this;
            java.lang.Object r0 = r11.L$0
            kotlinx.coroutines.flow.f r0 = (kotlinx.coroutines.flow.InterfaceC41635f) r0
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r11.label
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L45
            if (r2 == r4) goto L2d
            if (r2 != r3) goto L25
            int r2 = r11.I$0
            java.lang.Object r6 = r11.L$2
            java.util.Iterator r6 = (java.util.Iterator) r6
            java.lang.Object r7 = r11.L$1
            java.lang.Iterable r7 = (java.lang.Iterable) r7
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r6
            r6 = r2
            r2 = r12
            r12 = r7
            goto L53
        L25:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L2d:
            int r2 = r11.I$2
            int r6 = r11.I$1
            int r7 = r11.I$0
            java.lang.Object r8 = r11.L$3
            java.lang.Object r9 = r11.L$2
            java.util.Iterator r9 = (java.util.Iterator) r9
            java.lang.Object r10 = r11.L$1
            java.lang.Iterable r10 = (java.lang.Iterable) r10
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r2
            r2 = r7
            r7 = r6
            r6 = r9
            goto L8c
        L45:
            kotlin.ResultKt.throwOnFailure(r12)
            int r12 = r11.$totalSeconds
            kotlin.ranges.IntProgression r12 = kotlin.ranges.RangesKt.downTo(r12, r5)
            java.util.Iterator r2 = r12.iterator()
            r6 = r5
        L53:
            boolean r7 = r2.hasNext()
            if (r7 == 0) goto Lb2
            java.lang.Object r8 = r2.next()
            r7 = r8
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            java.lang.Integer r9 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r7)
            r11.L$0 = r0
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r12)
            r11.L$1 = r10
            r11.L$2 = r2
            java.lang.Object r10 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r11.L$3 = r10
            r11.I$0 = r6
            r11.I$1 = r7
            r11.I$2 = r5
            r11.label = r4
            java.lang.Object r9 = r0.emit(r9, r11)
            if (r9 != r1) goto L87
            goto Lac
        L87:
            r10 = r6
            r6 = r2
            r2 = r10
            r10 = r12
            r12 = r5
        L8c:
            r11.L$0 = r0
            java.lang.Object r9 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r10)
            r11.L$1 = r9
            r11.L$2 = r6
            java.lang.Object r8 = kotlin.coroutines.jvm.internal.SpillingKt.nullOutSpilledVariable(r8)
            r11.L$3 = r8
            r11.I$0 = r2
            r11.I$1 = r7
            r11.I$2 = r12
            r11.label = r3
            r7 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.m90350b(r7, r11)
            if (r12 != r1) goto Lad
        Lac:
            return r1
        Lad:
            r12 = r6
            r6 = r2
            r2 = r12
            r12 = r10
            goto L53
        Lb2:
            kotlin.Unit r12 = kotlin.Unit.INSTANCE
            return r12
    }
}
