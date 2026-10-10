package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.channels.ChannelResult;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, m90084d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "value", "Lkotlinx/coroutines/channels/ChannelResult;"}, m90085k = 3, m90086mv = {2, 1, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1", m90122f = "Delay.kt", m90123i = {0}, m90124l = {395}, m90125m = "invokeSuspend", m90126n = {"$this$onSuccess_u2dWpGqRn0$iv"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n+ 2 Channel.kt\nkotlinx/coroutines/channels/ChannelKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,407:1\n1009#2,2:408\n1047#2:410\n1048#2:412\n1#3:411\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1$1$1\n*L\n394#1:408,2\n396#1:410\n396#1:412\n*E\n"})
public final class FlowKt__DelayKt$timeoutInternal$1$1$1<T> extends SuspendLambda implements Function2<ChannelResult<? extends T>, Continuation<? super Boolean>, Object> {
    final /* synthetic */ InterfaceC41635f<T> $downStream;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$timeoutInternal$1$1$1(InterfaceC41635f<? super T> interfaceC41635f, Continuation<? super FlowKt__DelayKt$timeoutInternal$1$1$1> continuation) {
        super(2, continuation);
        this.$downStream = interfaceC41635f;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        FlowKt__DelayKt$timeoutInternal$1$1$1 flowKt__DelayKt$timeoutInternal$1$1$1 = new FlowKt__DelayKt$timeoutInternal$1$1$1(this.$downStream, continuation);
        flowKt__DelayKt$timeoutInternal$1$1$1.L$0 = obj;
        return flowKt__DelayKt$timeoutInternal$1$1$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Continuation<? super Boolean> continuation) {
        return m105334invokeWpGqRn0(((ChannelResult) obj).getHolder(), continuation);
    }

    /* JADX INFO: renamed from: invoke-WpGqRn0, reason: not valid java name */
    public final Object m105334invokeWpGqRn0(Object obj, Continuation<? super Boolean> continuation) {
        return ((FlowKt__DelayKt$timeoutInternal$1$1$1) create(ChannelResult.m90669b(obj), continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type kotlin.coroutines.Continuation to kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1<T> for r4v1 'this'  kotlin.coroutines.Continuation
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r4.label
            r2 = 1
            if (r1 == 0) goto L19
            if (r1 != r2) goto L11
            java.lang.Object r0 = r4.L$0
            p852kotlin.ResultKt.throwOnFailure(r5)
            goto L36
        L11:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L19:
            p852kotlin.ResultKt.throwOnFailure(r5)
            java.lang.Object r5 = r4.L$0
            kotlinx.coroutines.channels.ChannelResult r5 = (kotlinx.coroutines.channels.ChannelResult) r5
            java.lang.Object r5 = r5.getHolder()
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
            boolean r0 = r5 instanceof kotlinx.coroutines.channels.ChannelResult.Closed
            if (r0 == 0) goto L49
            java.lang.Throwable r5 = kotlinx.coroutines.channels.ChannelResult.m90672e(r5)
            if (r5 != 0) goto L48
            r5 = 0
            java.lang.Boolean r5 = p852kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r5)
            return r5
        L48:
            throw r5
        L49:
            java.lang.Boolean r5 = p852kotlin.coroutines.jvm.internal.Boxing.boxBoolean(r2)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
