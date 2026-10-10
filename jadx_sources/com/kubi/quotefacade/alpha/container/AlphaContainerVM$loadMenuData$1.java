package com.kubi.quotefacade.alpha.container;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AlphaContainerVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.alpha.container.AlphaContainerVM", m90122f = "AlphaContainerVM.kt", m90123i = {0, 0, 0}, m90124l = {43}, m90125m = "loadMenuData", m90126n = {"alphaType", "includeMarket", "isNewCount"}, m90127s = {"L$0", "L$1", "Z$0"})
public final class AlphaContainerVM$loadMenuData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AlphaContainerVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaContainerVM$loadMenuData$1(AlphaContainerVM alphaContainerVM, Continuation<? super AlphaContainerVM$loadMenuData$1> continuation) {
        super(continuation);
        this.this$0 = alphaContainerVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m50505o(null, false, this);
    }
}
