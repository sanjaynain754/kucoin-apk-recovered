package com.kubi.profit.loss.analysis.lib;

import androidx.media3.exoplayer.rtsp.SessionDescription;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AssetsProfitLossAnalysisContentVM.kt */
/* JADX INFO: loaded from: classes35.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.profit.loss.analysis.lib.AssetsProfitLossAnalysisContentVM", m90122f = "AssetsProfitLossAnalysisContentVM.kt", m90123i = {0, 0, 1, 1}, m90124l = {276, 277}, m90125m = "requestGetPointByRange", m90126n = {SessionDescription.ATTR_RANGE, "needLoading", SessionDescription.ATTR_RANGE, "needLoading"}, m90127s = {"L$0", "Z$0", "L$0", "Z$0"})
public final class AssetsProfitLossAnalysisContentVM$requestGetPointByRange$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetsProfitLossAnalysisContentVM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetsProfitLossAnalysisContentVM$requestGetPointByRange$1(AssetsProfitLossAnalysisContentVM assetsProfitLossAnalysisContentVM, Continuation<? super AssetsProfitLossAnalysisContentVM$requestGetPointByRange$1> continuation) {
        super(continuation);
        this.this$0 = assetsProfitLossAnalysisContentVM;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m50024R(false, null, this);
    }
}
