package com.kubi.quotefacade.alpha.list;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AlphaListVM.kt */
/* JADX INFO: loaded from: classes37.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.quotefacade.alpha.list.AlphaListVM", m90122f = "AlphaListVM.kt", m90123i = {0, 0, 0, 0}, m90124l = {102}, m90125m = "fetchDataList", m90126n = {"alphaType", "menu", "localParam", "resetRefresh"}, m90127s = {"L$0", "L$1", "L$2", "Z$0"})
public final class AlphaListVM$fetchDataList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AlphaListVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AlphaListVM$fetchDataList$1(AlphaListVM alphaListVM, Continuation<? super AlphaListVM$fetchDataList$1> continuation) {
        super(continuation);
        this.this$0 = alphaListVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m50655k(false, null, null, null, this);
    }
}
