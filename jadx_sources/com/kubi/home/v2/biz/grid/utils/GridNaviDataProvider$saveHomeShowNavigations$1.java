package com.kubi.home.v2.biz.grid.utils;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: GridNaviDataProvider.kt */
/* JADX INFO: loaded from: classes15.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.home.v2.biz.grid.utils.GridNaviDataProvider", m90122f = "GridNaviDataProvider.kt", m90123i = {0, 0, 0}, m90124l = {131}, m90125m = "saveHomeShowNavigations", m90126n = {"ids", "userCustomVersion", "reqEntity"}, m90127s = {"L$0", "L$1", "L$2"})
public final class GridNaviDataProvider$saveHomeShowNavigations$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ GridNaviDataProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GridNaviDataProvider$saveHomeShowNavigations$1(GridNaviDataProvider gridNaviDataProvider, Continuation<? super GridNaviDataProvider$saveHomeShowNavigations$1> continuation) {
        super(continuation);
        this.this$0 = gridNaviDataProvider;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m30649k(null, null, this);
    }
}
