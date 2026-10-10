package com.kubi.assets.overview;

import com.kubi.assets.entity.NewOverviewEntity;
import com.kubi.assets.view.AccountInfoHeaderView;
import p637ta.C44840p3;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetOverviewFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "Lcom/kubi/assets/entity/NewOverviewEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.AssetOverviewFragment$lineChartBindState$4", m90122f = "AssetOverviewFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nAssetOverviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment$lineChartBindState$4\n+ 2 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment\n*L\n1#1,765:1\n130#2:766\n*S KotlinDebug\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment$lineChartBindState$4\n*L\n561#1:766\n*E\n"})
public final class AssetOverviewFragment$lineChartBindState$4 extends SuspendLambda implements Function2<NewOverviewEntity, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetOverviewFragment this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(NewOverviewEntity newOverviewEntity, Continuation<? super Unit> continuation) {
        return ((AssetOverviewFragment$lineChartBindState$4) create(newOverviewEntity, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetOverviewFragment$lineChartBindState$4(AssetOverviewFragment assetOverviewFragment, Continuation<? super AssetOverviewFragment$lineChartBindState$4> continuation) {
        super(2, continuation);
        this.this$0 = assetOverviewFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetOverviewFragment$lineChartBindState$4 assetOverviewFragment$lineChartBindState$4 = new AssetOverviewFragment$lineChartBindState$4(this.this$0, continuation);
        assetOverviewFragment$lineChartBindState$4.L$0 = obj;
        return assetOverviewFragment$lineChartBindState$4;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AssetV2OverviewHeaderView assetV2OverviewHeaderView;
        AccountInfoHeaderView accountInfoHeader;
        NewOverviewEntity newOverviewEntity = (NewOverviewEntity) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AssetOverviewFragment assetOverviewFragment = this.this$0;
        if (!assetOverviewFragment.isAdded() || assetOverviewFragment.isDetached()) {
            return Unit.INSTANCE;
        }
        C44840p3 c44840p3M18267c4 = this.this$0.m18267c4();
        if (c44840p3M18267c4 != null && (assetV2OverviewHeaderView = c44840p3M18267c4.f100615r) != null && (accountInfoHeader = assetV2OverviewHeaderView.getAccountInfoHeader()) != null) {
            accountInfoHeader.m19944G(newOverviewEntity, this.this$0.m18269e4());
        }
        this.this$0.f18192f0 = newOverviewEntity;
        return Unit.INSTANCE;
    }
}
