package com.kubi.home.v2.biz.kuming;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: KuMiningWidgetVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.biz.kuming.KuMiningWidgetVM", m90122f = "KuMiningWidgetVM.kt", m90123i = {0}, m90124l = {36}, m90125m = "loadData", m90126n = {"isFirstLoad"}, m90127s = {"Z$0"})
public final class KuMiningWidgetVM$loadData$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ KuMiningWidgetVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KuMiningWidgetVM$loadData$1(KuMiningWidgetVM kuMiningWidgetVM, Continuation<? super KuMiningWidgetVM$loadData$1> continuation) {
        super(continuation);
        this.this$0 = kuMiningWidgetVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m30693r(this);
    }
}
