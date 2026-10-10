package com.kubi.assets;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AssetV2ViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.AssetV2ViewModel", m90122f = "AssetV2ViewModel.kt", m90123i = {0, 1, 1, 1, 1, 1, 1, 1, 2, 3, 3, 3, 3, 3, 3, 3}, m90124l = {87, 99, 107, 119}, m90125m = "handleFetchAccountsInfo", m90126n = {"intent", "intent", "$this$onFail$iv", "it$iv", "it", "$i$f$onFail", "$i$a$-let-RetrofitFlowExKt$onFail$1$iv", "$i$a$-onFail-AssetV2ViewModel$handleFetchAccountsInfo$3", "intent", "intent", "$this$onFail$iv", "it$iv", "it", "$i$f$onFail", "$i$a$-let-RetrofitFlowExKt$onFail$1$iv", "$i$a$-onFail-AssetV2ViewModel$handleFetchAccountsInfo$5"}, m90127s = {"L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2", "L$0", "L$0", "L$1", "L$2", "L$3", "I$0", "I$1", "I$2"})
public final class AssetV2ViewModel$handleFetchAccountsInfo$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetV2ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetV2ViewModel$handleFetchAccountsInfo$1(AssetV2ViewModel assetV2ViewModel, Continuation<? super AssetV2ViewModel$handleFetchAccountsInfo$1> continuation) {
        super(continuation);
        this.this$0 = assetV2ViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m15218B(null, this);
    }
}
