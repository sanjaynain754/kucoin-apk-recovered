package com.kubi.assets;

import com.kubi.assets.entity.AssetData;
import com.kubi.assets.entity.HomeAssetInfo;
import com.kubi.utils.extensions.C27039d;
import kotlinx.coroutines.InterfaceC41769w;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AssetSyncManager.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/AssetData;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.AssetSyncManager$fetchLatestData$2", m90122f = "AssetSyncManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AssetSyncManager$fetchLatestData$2 extends SuspendLambda implements Function2<AssetData, Continuation<? super Unit>, Object> {
    final /* synthetic */ InterfaceC41769w<HomeAssetInfo> $completableDeferred;
    final /* synthetic */ HomeAssetInfo $homeAssetInfo;
    /* synthetic */ Object L$0;
    int label;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(AssetData assetData, Continuation<? super Unit> continuation) {
        return ((AssetSyncManager$fetchLatestData$2) create(assetData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetSyncManager$fetchLatestData$2(HomeAssetInfo homeAssetInfo, InterfaceC41769w<HomeAssetInfo> interfaceC41769w, Continuation<? super AssetSyncManager$fetchLatestData$2> continuation) {
        super(2, continuation);
        this.$homeAssetInfo = homeAssetInfo;
        this.$completableDeferred = interfaceC41769w;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetSyncManager$fetchLatestData$2 assetSyncManager$fetchLatestData$2 = new AssetSyncManager$fetchLatestData$2(this.$homeAssetInfo, this.$completableDeferred, continuation);
        assetSyncManager$fetchLatestData$2.L$0 = obj;
        return assetSyncManager$fetchLatestData$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AssetData assetData = (AssetData) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (C27039d.m66652l(assetData != null ? assetData.getTimestamp() : null) > C27039d.m66652l(this.$homeAssetInfo.getTimestamp())) {
            AssetSyncManager.f16327a.m15159h(assetData, this.$homeAssetInfo);
        }
        this.$completableDeferred.mo91370n(this.$homeAssetInfo);
        return Unit.INSTANCE;
    }
}
