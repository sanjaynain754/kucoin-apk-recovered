package kotlinx.coroutines.flow;

import androidx.exifinterface.media.ExifInterface;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: compiled from: Delay.kt */
/* JADX INFO: loaded from: classes61.dex */
@Metadata(m90083d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m90084d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/m0;", "Lkotlinx/coroutines/flow/f;", "downStream", "", "<anonymous>", "(Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/f;)V"}, m90085k = 3, m90086mv = {2, 1, 0})
@DebugMetadata(m90121c = "kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1", m90122f = "Delay.kt", m90123i = {0, 0}, m90124l = {413}, m90125m = "invokeSuspend", m90126n = {"downStream", "values"}, m90127s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nDelay.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n+ 2 WhileSelect.kt\nkotlinx/coroutines/selects/WhileSelectKt\n+ 3 Select.kt\nkotlinx/coroutines/selects/SelectKt\n*L\n1#1,407:1\n27#2:408\n28#2:414\n54#3,5:409\n*S KotlinDebug\n*F\n+ 1 Delay.kt\nkotlinx/coroutines/flow/FlowKt__DelayKt$timeoutInternal$1\n*L\n392#1:408\n392#1:414\n392#1:409,5\n*E\n"})
public final class FlowKt__DelayKt$timeoutInternal$1<T> extends SuspendLambda implements Function3<InterfaceC41709m0, InterfaceC41635f<? super T>, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC41634e<T> $this_timeoutInternal;
    final /* synthetic */ long $timeout;
    long J$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FlowKt__DelayKt$timeoutInternal$1(long j11, InterfaceC41634e<? extends T> interfaceC41634e, Continuation<? super FlowKt__DelayKt$timeoutInternal$1> continuation) {
        super(3, continuation);
        this.$timeout = j11;
        this.$this_timeoutInternal = interfaceC41634e;
    }

    @Override // p852kotlin.jvm.functions.Function3
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, InterfaceC41635f<? super T> interfaceC41635f, Continuation<? super Unit> continuation) {
        FlowKt__DelayKt$timeoutInternal$1 flowKt__DelayKt$timeoutInternal$1 = new FlowKt__DelayKt$timeoutInternal$1(this.$timeout, this.$this_timeoutInternal, continuation);
        flowKt__DelayKt$timeoutInternal$1.L$0 = interfaceC41709m0;
        flowKt__DelayKt$timeoutInternal$1.L$1 = interfaceC41635f;
        return flowKt__DelayKt$timeoutInternal$1.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0076 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x007f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0074 -> B:14:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r9.label
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L22
            if (r1 != r2) goto L1a
            long r4 = r9.J$0
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.channels.o r1 = (kotlinx.coroutines.channels.InterfaceC41576o) r1
            java.lang.Object r6 = r9.L$0
            kotlinx.coroutines.flow.f r6 = (kotlinx.coroutines.flow.InterfaceC41635f) r6
            p852kotlin.ResultKt.throwOnFailure(r10)
            goto L77
        L1a:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L22:
            p852kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.L$0
            kotlinx.coroutines.m0 r10 = (kotlinx.coroutines.InterfaceC41709m0) r10
            java.lang.Object r1 = r9.L$1
            kotlinx.coroutines.flow.f r1 = (kotlinx.coroutines.flow.InterfaceC41635f) r1
            long r4 = r9.$timeout
            kotlin.time.Duration$Companion r6 = p852kotlin.time.Duration.INSTANCE
            long r6 = r6.m105278getZEROUwyO8pc()
            int r4 = p852kotlin.time.Duration.m105186compareToLRDsOJo(r4, r6)
            if (r4 <= 0) goto L82
            kotlinx.coroutines.flow.e<T> r4 = r9.$this_timeoutInternal
            r5 = 0
            r6 = 2
            kotlinx.coroutines.flow.e r4 = kotlinx.coroutines.flow.C41636g.m90911e(r4, r5, r3, r6, r3)
            kotlinx.coroutines.channels.o r10 = kotlinx.coroutines.flow.C41636g.m90899W(r4, r10)
            long r4 = r9.$timeout
            r6 = r1
            r1 = r10
        L4b:
            kotlinx.coroutines.selects.SelectImplementation r10 = new kotlinx.coroutines.selects.SelectImplementation
            kotlin.coroutines.CoroutineContext r7 = r9.get$context()
            r10.<init>(r7)
            kotlinx.coroutines.selects.f r7 = r1.mo90596f()
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1 r8 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$1
            r8.<init>(r6, r3)
            r10.mo91279g(r7, r8)
            kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2 r7 = new kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1$1$2
            r7.<init>(r4, r3)
            kotlinx.coroutines.selects.C41747b.m91298b(r10, r4, r7)
            r9.L$0 = r6
            r9.L$1 = r1
            r9.J$0 = r4
            r9.label = r2
            java.lang.Object r10 = r10.m91283o(r9)
            if (r10 != r0) goto L77
            return r0
        L77:
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L4b
            kotlin.Unit r10 = p852kotlin.Unit.INSTANCE
            return r10
        L82:
            kotlinx.coroutines.TimeoutCancellationException r10 = new kotlinx.coroutines.TimeoutCancellationException
            java.lang.String r0 = "Timed out immediately"
            r10.<init>(r0)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__DelayKt$timeoutInternal$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
