package com.kubi.assets;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AssetTabSortViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.AssetTabSortViewModel", m90122f = "AssetTabSortViewModel.kt", m90123i = {0, 0, 0, 0}, m90124l = {140}, m90125m = "uploadSortConfig", m90126n = {"sortType", "orders", "$this$uploadSortConfig_u24lambda_u244", "$i$a$-runCatching-AssetTabSortViewModel$uploadSortConfig$2"}, m90127s = {"L$0", "L$1", "L$2", "I$0"})
public final class AssetTabSortViewModel$uploadSortConfig$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetTabSortViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetTabSortViewModel$uploadSortConfig$1(AssetTabSortViewModel assetTabSortViewModel, Continuation<? super AssetTabSortViewModel$uploadSortConfig$1> continuation) {
        super(continuation);
        this.this$0 = assetTabSortViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m15176H(null, null, this);
    }
}
