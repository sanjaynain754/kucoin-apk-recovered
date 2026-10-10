package com.kubi.home.v2.biz.grid;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: GridNavigationVM.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.biz.grid.GridNavigationVM", m90122f = "GridNavigationVM.kt", m90123i = {0}, m90124l = {55}, m90125m = "refreshData", m90126n = {"needClosePage"}, m90127s = {"Z$0"})
public final class GridNavigationVM$refreshData$1 extends ContinuationImpl {
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GridNavigationVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridNavigationVM$refreshData$1(GridNavigationVM gridNavigationVM, Continuation<? super GridNavigationVM$refreshData$1> continuation) {
        super(continuation);
        this.this$0 = gridNavigationVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m30577q(false, this);
    }
}
