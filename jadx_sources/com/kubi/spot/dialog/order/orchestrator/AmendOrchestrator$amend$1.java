package com.kubi.spot.dialog.order.orchestrator;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AmendOrchestrator.kt */
/* JADX INFO: loaded from: classes47.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.spot.dialog.order.orchestrator.AmendOrchestrator", m90122f = "AmendOrchestrator.kt", m90123i = {0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1}, m90124l = {42, 49}, m90125m = "amend-0E7RQCE", m90126n = {"ctx", "validationToken", "strategy", "plugin", "validators", "chain", "symbolInfoEntity", "ctx", "validationToken", "strategy", "plugin", "validators", "chain", "symbolInfoEntity", "vr"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7"})
public final class AmendOrchestrator$amend$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AmendOrchestrator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AmendOrchestrator$amend$1(AmendOrchestrator amendOrchestrator, Continuation<? super AmendOrchestrator$amend$1> continuation) {
        super(continuation);
        this.this$0 = amendOrchestrator;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        Object objM61739a = this.this$0.m61739a(null, null, this);
        return objM61739a == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objM61739a : Result.m103843boximpl(objM61739a);
    }
}
