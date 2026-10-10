package com.kubi.quotefacade.widgets;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: QuoteWidgetsRepo.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.widgets.QuoteWidgetsRepo", m90122f = "QuoteWidgetsRepo.kt", m90123i = {}, m90124l = {81}, m90125m = "getGemboxWidgetInfo", m90126n = {}, m90127s = {})
public final class QuoteWidgetsRepo$getGemboxWidgetInfo$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ QuoteWidgetsRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public QuoteWidgetsRepo$getGemboxWidgetInfo$1(QuoteWidgetsRepo quoteWidgetsRepo, Continuation<? super QuoteWidgetsRepo$getGemboxWidgetInfo$1> continuation) {
        super(continuation);
        this.this$0 = quoteWidgetsRepo;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m53341j(this);
    }
}
