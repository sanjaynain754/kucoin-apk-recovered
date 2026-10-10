package com.kubi.quotefacade.service;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: QuoteFacadeService.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.service.QuoteFacadeService", m90122f = "QuoteFacadeService.kt", m90123i = {}, m90124l = {246}, m90125m = "getFavAlphaList", m90126n = {}, m90127s = {})
public final class QuoteFacadeService$getFavAlphaList$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ QuoteFacadeService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteFacadeService$getFavAlphaList$1(QuoteFacadeService quoteFacadeService, Continuation<? super QuoteFacadeService$getFavAlphaList$1> continuation) {
        super(continuation);
        this.this$0 = quoteFacadeService;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo50702e(this);
    }
}
