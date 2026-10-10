package com.kubi.assets;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p852kotlin.Metadata;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.jvm.internal.ContinuationImpl;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;

/* JADX INFO: compiled from: AssetSyncManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.AssetSyncManager", m90122f = "AssetSyncManager.kt", m90123i = {0, 0, 0, 1, 1, 1}, m90124l = {69, 80}, m90125m = "fetchLatestData", m90126n = {"cacheTime", "completableDeferred", "homeAssetInfo", "cacheTime", "completableDeferred", "homeAssetInfo"}, m90127s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2"})
public final class AssetSyncManager$fetchLatestData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AssetSyncManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetSyncManager$fetchLatestData$1(AssetSyncManager assetSyncManager, Continuation<? super AssetSyncManager$fetchLatestData$1> continuation) {
        super(continuation);
        this.this$0 = assetSyncManager;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m15155d(null, this);
    }
}
