package kotlinx.coroutines.flow;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes61.dex */
@kotlin.Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, m90084d2 = {"<anonymous>", "", "T", "value", "Lkotlinx/coroutines/channels/ChannelResult;"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@kotlin.coroutines.jvm.internal.DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", m90122f = "Delay.kt", m90123i = {0}, m90124l = {395}, m90125m = "invokeSuspend", m90126n = {"$this$onSuccess_u2dWpGqRn0$iv"}, m90127s = {"L$0"})
@kotlin.jvm.internal.SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n1009#2,2:408\n1047#2:410\n1048#2:412\n1#3:411\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n*L\n394#1:408,2\n396#1:410\n396#1:412\n*E\n"})
public final class FlowKt__DelayKt$timeoutInternal$1$1$1<T> extends kotlin.coroutines.jvm.internal.SuspendLambda implements kotlin.jvm.functions.Function2<kotlinx.coroutines.channels.ChannelResult<? extends T>, kotlin.coroutines.Continuation<? super java.lang.Boolean>, java.lang.Object> {
    final /* synthetic */ kotlinx.coroutines.flow.InterfaceC41635f<T> $downStream;
    /* synthetic */ java.lang.Object L$0;
    int label;

    public FlowKt__DelayKt$timeoutInternal$1$1$1(kotlinx.coroutines.flow.InterfaceC41635f<? super T> r1, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1> r2) {
            r0 = this;
            r0.$downStream = r1
            r1 = 2
            r0.<init>(r1, r2)
            return
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final kotlin.coroutines.Continuation<kotlin.Unit> create(java.lang.Object r3, kotlin.coroutines.Continuation<?> r4) {
            r2 = this;
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 r0 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1
            kotlinx.coroutines.flow.f<T> r1 = r2.$downStream
            r0.<init>(r1, r4)
            r0.L$0 = r3
            return r0
    }

    /* JADX DEBUG: Method arguments types fixed to match base method, original types: [java.lang.Object, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r1, kotlin.coroutines.Continuation<? super java.lang.Boolean> r2) {
            r0 = this;
            kotlinx.coroutines.channels.ChannelResult r1 = (kotlinx.coroutines.channels.ChannelResult) r1
            java.lang.Object r1 = r1.m90679l()
            kotlin.coroutines.Continuation r2 = (kotlin.coroutines.Continuation) r2
            java.lang.Object r1 = r0.m105334invokeWpGqRn0(r1, r2)
            return r1
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final java.lang.Object m105334invokeWpGqRn0(java.lang.Object r1, kotlin.coroutines.Continuation<? super java.lang.Boolean> r2) {
            r0 = this;
            kotlinx.coroutines.channels.ChannelResult r1 = kotlinx.coroutines.channels.ChannelResult.m90669b(r1)
            kotlin.coroutines.Continuation r1 = r0.create(r1, r2)
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 r1 = (kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1) r1
            kotlin.Unit r2 = kotlin.Unit.INSTANCE
            java.lang.Object r1 = r1.invokeSuspend(r2)
            return r1
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            r4 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r0 = r4.L$0
            kotlin.ResultKt.throwOnFailure(r5)
            goto L36
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L19:
            kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.channels.ChannelResult r5 = (kotlinx.coroutines.channels.ChannelResult) r5
            java.lang.Object r5 = r5.m90679l()
            kotlinx.coroutines.flow.f<T> r1 = r4.$downStream
            boolean r3 = r5 instanceof kotlinx.coroutines.channels.ChannelResult.C41560b
            if (r3 != 0) goto L37
            r4.L$0 = r5
            r4.label = r2
            java.lang.Object r1 = r1.emit(r5, r4)
            if (r1 != r0) goto L35
            return r0
        L35:
            r0 = r5
        L36:
            r5 = r0
        L37:
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ChannelResult.C41559a
            if (r0 == 0) goto L49
            java.lang.Throwable r5 = kotlinx.coroutines.channels.ChannelResult.m90672e(r5)
            if (r5 != 0) goto L48
            r5 = 0
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r5
        L48:
            throw r5
        L49:
            java.lang.Boolean r5 = kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            return r5
    }
}
