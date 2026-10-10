package com.kubi.assets.overview;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AssetOverviewViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.AssetOverviewViewModel", m90122f = "AssetOverviewViewModel.kt", m90123i = {0, 0, 0, 0, 0, 0}, m90124l = {144}, m90125m = "handleGetRecentTransitionData", m90126n = {"intent", "it", "dataList", "originDataList", "$i$a$-let-AssetOverviewViewModel$handleGetRecentTransitionData$2", "isHideSmallAsset"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "I$0", "Z$0"})
public final class AssetOverviewViewModel$handleGetRecentTransitionData$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetOverviewViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetOverviewViewModel$handleGetRecentTransitionData$1(AssetOverviewViewModel assetOverviewViewModel, Continuation<? super AssetOverviewViewModel$handleGetRecentTransitionData$1> continuation) {
        super(continuation);
        this.this$0 = assetOverviewViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m18294z(null, this);
    }
}
