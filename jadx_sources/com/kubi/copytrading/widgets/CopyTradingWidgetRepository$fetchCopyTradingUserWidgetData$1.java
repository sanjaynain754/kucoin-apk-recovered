package com.kubi.copytrading.widgets;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: CopyTradingWidgetRepository.kt */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.copytrading.widgets.CopyTradingWidgetRepository", m90122f = "CopyTradingWidgetRepository.kt", m90123i = {}, m90124l = {24}, m90125m = "fetchCopyTradingUserWidgetData", m90126n = {}, m90127s = {})
public final class CopyTradingWidgetRepository$fetchCopyTradingUserWidgetData$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CopyTradingWidgetRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CopyTradingWidgetRepository$fetchCopyTradingUserWidgetData$1(CopyTradingWidgetRepository copyTradingWidgetRepository, Continuation<? super CopyTradingWidgetRepository$fetchCopyTradingUserWidgetData$1> continuation) {
        super(continuation);
        this.this$0 = copyTradingWidgetRepository;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m20980c(this);
    }
}
