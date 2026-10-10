package kotlinx.coroutines.flow;

/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes23.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "value", "Lkotlinx/coroutines/channels/ChannelResult;", ""}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2", m90122f = "Delay.kt", m90123i = {0}, m90124l = {236}, m90125m = "invokeSuspend", m90126n = {"$this$onFailure_u2dWpGqRn0$iv"}, m90127s = {"L$0"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Symbol.kt\nkotlinx/coroutines/internal/Symbol\n*L\n1#1,407:1\n1009#2,2:408\n1026#2:410\n1027#2:413\n1#3:411\n14#4:412\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$debounceInternal$1$3$2\n*L\n232#1:408,2\n233#1:410\n233#1:413\n236#1:412\n*E\n"})
public final class FlowKt__DelayKt$debounceInternal$1$3$2 extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ChannelResult<? extends java.lang.Object>, kotlin.coroutines.Continuation<? super kotlin.Unit>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41635f<T> $downstream;
    final /* synthetic */ kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> $lastValue;
    /* synthetic */ java.lang.Object L$0;
    java.lang.Object L$1;
    int label;

    public FlowKt__DelayKt$debounceInternal$1$3$2(kotlin.jvm.internal.Ref.ObjectRef<java.lang.Object> r1, kotlinx.coroutines.flow.InterfaceC41635f<? super T> r2, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2> r3) {
            r0 = this;
            r0.$lastValue = r1
            r0.$downstream = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r4, kotlin.coroutines.Continuation<?> r5) {
            r3 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r1 = r3.$lastValue
            kotlinx.coroutines.flow.f<T> r2 = r3.$downstream
            r0.<init>(r1, r2, r5)
            r0.L$0 = r4
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(kotlinx.coroutines.channels.ChannelResult<? extends java.lang.Object> r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.channels.ChannelResult r1 = (kotlinx.coroutines.channels.ChannelResult) r1
            java.lang.Object r1 = r1.m90679l()
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.m105332invokeWpGqRn0(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final java.lang.Object m105332invokeWpGqRn0(java.lang.Object r1, kotlin.coroutines.Continuation<? super kotlin.Unit> r2) {
            r0 = this;
            kotlinx.coroutines.channels.ChannelResult r1 = kotlinx.coroutines.channels.ChannelResult.m90669b(r1)
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2 r1 = (kotlinx.coroutines.flow.FlowKt__DelayKt$debounceInternal$1$3$2) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            r6 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r6.label
            r2 = 1
            if (r1 == 0) goto L1b
            if (r1 != r2) goto L13
            java.lang.Object r0 = r6.L$1
            kotlin.jvm.internal.Ref$ObjectRef r0 = (kotlin.jvm.internal.Ref.ObjectRef) r0
            kotlin.ResultKt.throwOnFailure(r7)
            goto L4f
        L13:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1b:
            kotlin.ResultKt.throwOnFailure(r7)
            java.lang.Object r7 = r6.L$0
            kotlinx.coroutines.channels.ChannelResult r7 = (kotlinx.coroutines.channels.ChannelResult) r7
            java.lang.Object r7 = r7.m90679l()
            kotlin.jvm.internal.Ref$ObjectRef<java.lang.Object> r1 = r6.$lastValue
            boolean r3 = r7 instanceof kotlinx.coroutines.channels.ChannelResult.C41560b
            if (r3 != 0) goto L2e
            r1.element = r7
        L2e:
            kotlinx.coroutines.flow.f<T> r4 = r6.$downstream
            if (r3 == 0) goto L56
            java.lang.Throwable r3 = kotlinx.coroutines.channels.ChannelResult.m90672e(r7)
            if (r3 != 0) goto L55
            T r3 = r1.element
            if (r3 == 0) goto L50
            og0.a0 r5 = kotlinx.coroutines.flow.internal.C41658l.f91700a
            if (r3 != r5) goto L41
            r3 = 0
        L41:
            r6.L$0 = r7
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r7 = r4.emit(r3, r6)
            if (r7 != r0) goto L4e
            return r0
        L4e:
            r0 = r1
        L4f:
            r1 = r0
        L50:
            og0.a0 r7 = kotlinx.coroutines.flow.internal.C41658l.f91702c
            r1.element = r7
            goto L56
        L55:
            throw r3
        L56:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
    }
}
