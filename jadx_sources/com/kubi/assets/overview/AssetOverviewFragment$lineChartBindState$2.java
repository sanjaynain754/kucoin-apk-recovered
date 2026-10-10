package com.kubi.assets.overview;

import com.kubi.assets.entity.AssetV2OverviewEntity;
import com.kubi.assets.entity.ChartPoint;
import com.kubi.assets.view.AccountInfoHeaderView;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.List;
import p311hf.C38184b;
import p402kf.C41014a;
import p637ta.C44840p3;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetOverviewFragment.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m90084d2 = {"<anonymous>", "", "it", "", "Lcom/kubi/assets/entity/ChartPoint;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.AssetOverviewFragment$lineChartBindState$2", m90122f = "AssetOverviewFragment.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nAssetOverviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment$lineChartBindState$2\n+ 2 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment\n*L\n1#1,765:1\n130#2:766\n*S KotlinDebug\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment$lineChartBindState$2\n*L\n547#1:766\n*E\n"})
public final class AssetOverviewFragment$lineChartBindState$2 extends SuspendLambda implements Function2<List<? extends ChartPoint>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetOverviewFragment this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends ChartPoint> list, Continuation<? super Unit> continuation) {
        return invoke2((List<ChartPoint>) list, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetOverviewFragment$lineChartBindState$2(AssetOverviewFragment assetOverviewFragment, Continuation<? super AssetOverviewFragment$lineChartBindState$2> continuation) {
        super(2, continuation);
        this.this$0 = assetOverviewFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetOverviewFragment$lineChartBindState$2 assetOverviewFragment$lineChartBindState$2 = new AssetOverviewFragment$lineChartBindState$2(this.this$0, continuation);
        assetOverviewFragment$lineChartBindState$2.L$0 = obj;
        return assetOverviewFragment$lineChartBindState$2;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<ChartPoint> list, Continuation<? super Unit> continuation) {
        return ((AssetOverviewFragment$lineChartBindState$2) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0058  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AssetV2OverviewHeaderView assetV2OverviewHeaderView;
        AccountInfoHeaderView accountInfoHeader;
        BigDecimal bigDecimalM89916A;
        BigDecimal totalAssetValue;
        List<ChartPoint> listPlus = (List) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        AssetOverviewFragment assetOverviewFragment = this.this$0;
        if (!assetOverviewFragment.isAdded() || assetOverviewFragment.isDetached()) {
            return Unit.INSTANCE;
        }
        if (listPlus != null && !listPlus.isEmpty()) {
            Long lBoxLong = Boxing.boxLong(System.currentTimeMillis());
            AssetV2OverviewEntity assetV2OverviewEntityM18269e4 = this.this$0.m18269e4();
            if (assetV2OverviewEntityM18269e4 == null || (totalAssetValue = assetV2OverviewEntityM18269e4.getTotalAssetValue()) == null) {
                bigDecimalM89916A = BigDecimal.ZERO;
            } else {
                AssetV2OverviewEntity assetV2OverviewEntityM18269e5 = this.this$0.m18269e4();
                bigDecimalM89916A = C41014a.m89916A(totalAssetValue, assetV2OverviewEntityM18269e5 != null ? assetV2OverviewEntityM18269e5.getBaseCurrency() : null, C38184b.f85884a.m86146a());
                if (bigDecimalM89916A == null) {
                    bigDecimalM89916A = BigDecimal.ZERO;
                }
            }
            listPlus = CollectionsKt.plus((Collection<? extends ChartPoint>) listPlus, new ChartPoint(lBoxLong, bigDecimalM89916A));
        }
        C44840p3 c44840p3M18267c4 = this.this$0.m18267c4();
        if (c44840p3M18267c4 != null && (assetV2OverviewHeaderView = c44840p3M18267c4.f100615r) != null && (accountInfoHeader = assetV2OverviewHeaderView.getAccountInfoHeader()) != null) {
            accountInfoHeader.m19943D(LineChartHelper.f18547a.m18900g(listPlus));
        }
        return Unit.INSTANCE;
    }
}
