package com.kubi.assets.unify;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: UnifiedAssetListExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.unify.UnifiedAssetListExtKt", m90122f = "UnifiedAssetListExt.kt", m90123i = {0}, m90124l = {46}, m90125m = "combineAssetsWithLocal", m90126n = {"assetsList"}, m90127s = {"L$0"})
public final class UnifiedAssetListExtKt$combineAssetsWithLocal$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UnifiedAssetListExtKt.m19720f(null, this);
    }

    public UnifiedAssetListExtKt$combineAssetsWithLocal$1(Continuation<? super UnifiedAssetListExtKt$combineAssetsWithLocal$1> continuation) {
        super(continuation);
    }
}
