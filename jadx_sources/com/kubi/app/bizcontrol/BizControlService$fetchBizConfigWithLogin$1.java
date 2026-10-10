package com.kubi.app.bizcontrol;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: BizControlService.kt */
/* JADX INFO: loaded from: classes64.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.app.bizcontrol.BizControlService", m90122f = "BizControlService.kt", m90123i = {}, m90124l = {46}, m90125m = "fetchBizConfigWithLogin", m90126n = {}, m90127s = {})
public final class BizControlService$fetchBizConfigWithLogin$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ BizControlService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BizControlService$fetchBizConfigWithLogin$1(BizControlService bizControlService, Continuation<? super BizControlService$fetchBizConfigWithLogin$1> continuation) {
        super(continuation);
        this.this$0 = bizControlService;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m14996c(this);
    }
}
