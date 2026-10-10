package com.kubi.mvi.common;

import kotlinx.coroutines.flow.InterfaceC41635f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: MviEx.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, m90084d2 = {"Lkotlinx/coroutines/flow/f;", "", "", "<anonymous>", "(Lkotlinx/coroutines/flow/f;)V"}, m90085k = 3, m90086mv = {1, 9, 0})
@DebugMetadata(m90121c = "com.kubi.mvi.common.MviExKt$repeatCall$1", m90122f = "MviEx.kt", m90123i = {0, 1}, m90124l = {154, 156}, m90125m = "invokeSuspend", m90126n = {"$this$flow", "$this$flow"}, m90127s = {"L$0", "L$0"})
public final class MviExKt$repeatCall$1 extends SuspendLambda implements Function2<InterfaceC41635f<? super Integer>, Continuation<? super Unit>, Object> {
    final /* synthetic */ long $delay;
    final /* synthetic */ Function0<Unit> $finishAction;
    final /* synthetic */ Function0<Unit> $startAction;
    final /* synthetic */ int $times;
    int I$0;
    int I$1;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MviExKt$repeatCall$1(Function0<Unit> function0, int i11, Function0<Unit> function1, long j11, Continuation<? super MviExKt$repeatCall$1> continuation) {
        super(2, continuation);
        this.$startAction = function0;
        this.$times = i11;
        this.$finishAction = function1;
        this.$delay = j11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        MviExKt$repeatCall$1 mviExKt$repeatCall$1 = new MviExKt$repeatCall$1(this.$startAction, this.$times, this.$finishAction, this.$delay, continuation);
        mviExKt$repeatCall$1.L$0 = obj;
        return mviExKt$repeatCall$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull InterfaceC41635f<? super Integer> interfaceC41635f, @Nullable Continuation<? super Unit> continuation) {
        return ((MviExKt$repeatCall$1) create(interfaceC41635f, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0047  */
    /* JADX WARN: Code duplicated, block: B:18:0x005c  */
    /* JADX WARN: Code duplicated, block: B:21:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0064 -> B:24:0x0077). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0074 -> B:24:0x0077). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.Object r0 = p852kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r11.label
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L32
            if (r1 == r3) goto L24
            if (r1 != r2) goto L1c
            int r1 = r11.I$1
            long r4 = r11.J$0
            int r6 = r11.I$0
            java.lang.Object r7 = r11.L$0
            kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.InterfaceC41635f) r7
            p852kotlin.ResultKt.throwOnFailure(r12)
            goto L77
        L1c:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L24:
            int r1 = r11.I$1
            long r4 = r11.J$0
            int r6 = r11.I$0
            java.lang.Object r7 = r11.L$0
            kotlinx.coroutines.flow.f r7 = (kotlinx.coroutines.flow.InterfaceC41635f) r7
            p852kotlin.ResultKt.throwOnFailure(r12)
            goto L60
        L32:
            p852kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.L$0
            kotlinx.coroutines.flow.f r12 = (kotlinx.coroutines.flow.InterfaceC41635f) r12
            kotlin.jvm.functions.Function0<kotlin.Unit> r1 = r11.$startAction
            if (r1 == 0) goto L40
            r1.invoke()
        L40:
            int r1 = r11.$times
            long r4 = r11.$delay
            r6 = 0
        L45:
            if (r6 >= r1) goto L7d
            java.lang.Integer r7 = p852kotlin.coroutines.jvm.internal.Boxing.boxInt(r6)
            r11.L$0 = r12
            r11.I$0 = r1
            r11.J$0 = r4
            r11.I$1 = r6
            r11.label = r3
            java.lang.Object r7 = r12.emit(r7, r11)
            if (r7 != r0) goto L5c
            goto L76
        L5c:
            r7 = r6
            r6 = r1
            r1 = r7
            r7 = r12
        L60:
            r8 = 0
            int r12 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r12 <= 0) goto L77
            r11.L$0 = r7
            r11.I$0 = r6
            r11.J$0 = r4
            r11.I$1 = r1
            r11.label = r2
            java.lang.Object r12 = kotlinx.coroutines.DelayKt.m90350b(r4, r11)
            if (r12 != r0) goto L77
        L76:
            return r0
        L77:
            r12 = r7
            int r1 = r1 + r3
            r10 = r6
            r6 = r1
            r1 = r10
            goto L45
        L7d:
            kotlin.jvm.functions.Function0<kotlin.Unit> r12 = r11.$finishAction
            if (r12 == 0) goto L84
            r12.invoke()
        L84:
            kotlin.Unit r12 = p852kotlin.Unit.INSTANCE
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.kubi.mvi.common.MviExKt$repeatCall$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
