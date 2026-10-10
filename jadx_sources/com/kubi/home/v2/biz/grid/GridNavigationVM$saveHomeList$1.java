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
@DebugMetadata(m90121c = "com.kubi.home.v2.biz.grid.GridNavigationVM", m90122f = "GridNavigationVM.kt", m90123i = {0, 0, 0, 0, 1, 1, 1, 1, 1}, m90124l = {93, 101}, m90125m = "saveHomeList", m90126n = {"ids", "reqEntity", "needClosePage", "isReset", "ids", "reqEntity", "needClosePage", "isReset", "success"}, m90127s = {"L$0", "L$1", "Z$0", "Z$1", "L$0", "L$1", "Z$0", "Z$1", "Z$2"})
public final class GridNavigationVM$saveHomeList$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    boolean Z$1;
    boolean Z$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GridNavigationVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridNavigationVM$saveHomeList$1(GridNavigationVM gridNavigationVM, Continuation<? super GridNavigationVM$saveHomeList$1> continuation) {
        super(continuation);
        this.this$0 = gridNavigationVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m30578s(false, null, this);
    }
}
