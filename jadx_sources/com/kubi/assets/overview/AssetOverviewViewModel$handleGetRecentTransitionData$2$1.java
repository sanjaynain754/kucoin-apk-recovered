package com.kubi.assets.overview;

import com.kubi.assets.entity.HistoryRecordEntity;
import com.kubi.assets.entity.OverviewItemEntity;
import com.tencent.qcloud.tuicore.TUIConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: AssetOverviewViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", TUIConstants.TIMPush.NOTIFICATION.ENTITY, "", "Lcom/kubi/assets/entity/HistoryRecordEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.AssetOverviewViewModel$handleGetRecentTransitionData$2$1", m90122f = "AssetOverviewViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nAssetOverviewViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOverviewViewModel.kt\ncom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$2$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,400:1\n1869#2,2:401\n774#2:403\n865#2,2:404\n*S KotlinDebug\n*F\n+ 1 AssetOverviewViewModel.kt\ncom/kubi/assets/overview/AssetOverviewViewModel$handleGetRecentTransitionData$2$1\n*L\n168#1:401,2\n218#1:403\n218#1:404,2\n*E\n"})
public final class AssetOverviewViewModel$handleGetRecentTransitionData$2$1 extends SuspendLambda implements Function2<List<? extends HistoryRecordEntity>, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<OverviewItemEntity> $dataList;
    final /* synthetic */ boolean $isHideSmallAsset;
    final /* synthetic */ List<OverviewItemEntity> $originDataList;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ AssetOverviewViewModel this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(List<? extends HistoryRecordEntity> list, Continuation<? super Unit> continuation) {
        return invoke2((List<HistoryRecordEntity>) list, continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetOverviewViewModel$handleGetRecentTransitionData$2$1(List<OverviewItemEntity> list, List<OverviewItemEntity> list2, AssetOverviewViewModel assetOverviewViewModel, boolean z11, Continuation<? super AssetOverviewViewModel$handleGetRecentTransitionData$2$1> continuation) {
        super(2, continuation);
        this.$dataList = list;
        this.$originDataList = list2;
        this.this$0 = assetOverviewViewModel;
        this.$isHideSmallAsset = z11;
    }

    /* JADX INFO: renamed from: f */
    public static final UIState m18304f(List list, List list2, UIState uIState) {
        return uIState.copy((15999 & 1) != 0 ? uIState.data : null, (15999 & 2) != 0 ? uIState.list : list, (15999 & 4) != 0 ? uIState.throwable : null, (15999 & 8) != 0 ? uIState.originDataList : list2, (15999 & 16) != 0 ? uIState.isChecked : false, (15999 & 32) != 0 ? uIState.uiHideNumberFlag : false, (15999 & 64) != 0 ? uIState.isNew : null, (15999 & 128) != 0 ? uIState.isShowRollBackTip : false, (15999 & 256) != 0 ? uIState.rollbackList : null, (15999 & 512) != 0 ? uIState.dynamicsBarList : null, (15999 & 1024) != 0 ? uIState.dynamicsCardList : null, (15999 & 2048) != 0 ? uIState.lineChartPointList : null, (15999 & 4096) != 0 ? uIState.newOverviewEntity : null, (15999 & 8192) != 0 ? uIState.oldOverviewEntity : null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetOverviewViewModel$handleGetRecentTransitionData$2$1 assetOverviewViewModel$handleGetRecentTransitionData$2$1 = new AssetOverviewViewModel$handleGetRecentTransitionData$2$1(this.$dataList, this.$originDataList, this.this$0, this.$isHideSmallAsset, continuation);
        assetOverviewViewModel$handleGetRecentTransitionData$2$1.L$0 = obj;
        return assetOverviewViewModel$handleGetRecentTransitionData$2$1;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(List<HistoryRecordEntity> list, Continuation<? super Unit> continuation) {
        return ((AssetOverviewViewModel$handleGetRecentTransitionData$2$1) create(list, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object next;
        List<HistoryRecordEntity> list = (List) this.L$0;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (!list.isEmpty()) {
            Iterator<T> it = this.$dataList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((OverviewItemEntity) next).getType() != 3);
            if (((OverviewItemEntity) next) == null) {
                this.$dataList.add(new OverviewItemEntity(null, null, 3));
                this.$originDataList.add(new OverviewItemEntity(null, null, 3));
                if (list.size() > 10) {
                    List<HistoryRecordEntity> listTake = CollectionsKt.take(list, 10);
                    List<OverviewItemEntity> list2 = this.$dataList;
                    List<OverviewItemEntity> list3 = this.$originDataList;
                    for (HistoryRecordEntity historyRecordEntity : listTake) {
                        list2.add(new OverviewItemEntity(null, historyRecordEntity, 2));
                        list3.add(new OverviewItemEntity(null, historyRecordEntity, 2));
                    }
                    this.$dataList.add(new OverviewItemEntity(null, null, 5));
                    Boxing.boxBoolean(this.$originDataList.add(new OverviewItemEntity(null, null, 5)));
                } else {
                    for (HistoryRecordEntity historyRecordEntity2 : list) {
                        this.$dataList.add(new OverviewItemEntity(null, historyRecordEntity2, 2));
                        this.$originDataList.add(new OverviewItemEntity(null, historyRecordEntity2, 2));
                    }
                }
            }
        }
        List<OverviewItemEntity> list4 = this.$dataList;
        boolean z11 = this.$isHideSmallAsset;
        final ArrayList arrayList = new ArrayList();
        for (Object obj2 : list4) {
            if (z11 ? C10724j0.m18648a(((OverviewItemEntity) obj2).getAccountInfo()) : true) {
                arrayList.add(obj2);
            }
        }
        AssetOverviewViewModel assetOverviewViewModel = this.this$0;
        final List<OverviewItemEntity> list5 = this.$originDataList;
        assetOverviewViewModel.updateState(new Function1() { // from class: com.kubi.assets.overview.i0
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                return AssetOverviewViewModel$handleGetRecentTransitionData$2$1.m18304f(arrayList, list5, (UIState) obj3);
            }
        });
        return Unit.INSTANCE;
    }
}
