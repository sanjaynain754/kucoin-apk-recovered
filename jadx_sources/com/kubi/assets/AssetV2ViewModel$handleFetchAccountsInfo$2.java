package com.kubi.assets;

import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.utils.extensions.C27025c;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AssetV2ViewModel.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/AssetV2OverviewEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.AssetV2ViewModel$handleFetchAccountsInfo$2", m90122f = "AssetV2ViewModel.kt", m90123i = {0}, m90124l = {91}, m90125m = "invokeSuspend", m90126n = {"it"}, m90127s = {"L$0"})
public final class AssetV2ViewModel$handleFetchAccountsInfo$2 extends SuspendLambda implements Function2<AssetV2OverviewEntity, Continuation<? super Unit>, Object> {
    final /* synthetic */ AssetV2Contract$UiIntent.FetchAccountsInfo $intent;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetV2ViewModel this$0;

    /* JADX INFO: renamed from: f */
    public static final UIState m15228f(AssetV2OverviewEntity assetV2OverviewEntity, UIState uIState) {
        return UIState.copy$default(uIState, assetV2OverviewEntity, null, 2, null);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(AssetV2OverviewEntity assetV2OverviewEntity, Continuation<? super Unit> continuation) {
        return ((AssetV2ViewModel$handleFetchAccountsInfo$2) create(assetV2OverviewEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetV2ViewModel$handleFetchAccountsInfo$2(AssetV2ViewModel assetV2ViewModel, AssetV2Contract$UiIntent.FetchAccountsInfo fetchAccountsInfo, Continuation<? super AssetV2ViewModel$handleFetchAccountsInfo$2> continuation) {
        super(2, continuation);
        this.this$0 = assetV2ViewModel;
        this.$intent = fetchAccountsInfo;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetV2ViewModel$handleFetchAccountsInfo$2 assetV2ViewModel$handleFetchAccountsInfo$2 = new AssetV2ViewModel$handleFetchAccountsInfo$2(this.this$0, this.$intent, continuation);
        assetV2ViewModel$handleFetchAccountsInfo$2.L$0 = obj;
        return assetV2ViewModel$handleFetchAccountsInfo$2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        final AssetV2OverviewEntity assetV2OverviewEntity = (AssetV2OverviewEntity) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            AssetV2EventTracker.m17549l(AssetV2EventTracker.f17857a, C27025c.m66566d(assetV2OverviewEntity.getSubOverLimit()), null, 2, null);
            if (C27025c.m66566d(assetV2OverviewEntity.getSubOverLimit())) {
                AssetV2ViewModel assetV2ViewModel = this.this$0;
                AssetV2Contract$UiIntent.FetchAccountsInfo fetchAccountsInfo = this.$intent;
                this.L$0 = SpillingKt.nullOutSpilledVariable(assetV2OverviewEntity);
                this.label = 1;
                if (assetV2ViewModel.m15220G(assetV2OverviewEntity, fetchAccountsInfo, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                this.this$0.updateState(new Function1() { // from class: com.kubi.assets.u0
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AssetV2ViewModel$handleFetchAccountsInfo$2.m15228f(assetV2OverviewEntity, (UIState) obj2);
                    }
                });
                this.this$0.m15223K();
                this.this$0.m15221I();
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
