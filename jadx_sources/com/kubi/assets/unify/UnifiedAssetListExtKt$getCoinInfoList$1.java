package com.kubi.assets.unify;

import com.google.android.gms.common.internal.ImagesContract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: UnifiedAssetListExt.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.unify.UnifiedAssetListExtKt", m90122f = "UnifiedAssetListExt.kt", m90123i = {1}, m90124l = {79, 83}, m90125m = "getCoinInfoList", m90126n = {ImagesContract.LOCAL}, m90127s = {"L$0"})
public final class UnifiedAssetListExtKt$getCoinInfoList$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return UnifiedAssetListExtKt.m19722h(this);
    }

    public UnifiedAssetListExtKt$getCoinInfoList$1(Continuation<? super UnifiedAssetListExtKt$getCoinInfoList$1> continuation) {
        super(continuation);
    }
}
