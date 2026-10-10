package com.kubi.assets.overview.coin;

import com.kubi.assets.AssetV2Api;
import com.kubi.assets.entity.AssetCoinEntity;
import com.kubi.data.entity.TradeItemBean;
import com.kubi.network.retrofit.utils.C19334f;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.flow.InterfaceC41634e;
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
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46396e;

/* JADX INFO: compiled from: AssetCoinViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m90084d2 = {"<anonymous>", "", "list", "Ljava/util/ArrayList;", "Lcom/kubi/assets/entity/AssetCoinEntity;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.overview.coin.AssetCoinViewModel$handleGetCoinList$2", m90122f = "AssetCoinViewModel.kt", m90123i = {0, 0}, m90124l = {165}, m90125m = "invokeSuspend", m90126n = {"list", "spotSymbols"}, m90127s = {"L$0", "L$1"})
@SourceDebugExtension({"SMAP\nAssetCoinViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetCoinViewModel.kt\ncom/kubi/assets/overview/coin/AssetCoinViewModel$handleGetCoinList$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 MMKVHelper.kt\ncom/kubi/utils/storage/MMKVHelperKt\n*L\n1#1,237:1\n1869#2:238\n1870#2:240\n1#3:239\n241#4,2:241\n211#4,2:243\n*S KotlinDebug\n*F\n+ 1 AssetCoinViewModel.kt\ncom/kubi/assets/overview/coin/AssetCoinViewModel$handleGetCoinList$2\n*L\n167#1:238\n167#1:240\n178#1:241,2\n181#1:243,2\n*E\n"})
public final class AssetCoinViewModel$handleGetCoinList$2 extends SuspendLambda implements Function2<ArrayList<AssetCoinEntity>, Continuation<? super Unit>, Object> {
    final /* synthetic */ List<AssetCoinEntity> $delistedList;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ AssetCoinViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AssetCoinViewModel$handleGetCoinList$2(AssetCoinViewModel assetCoinViewModel, List<AssetCoinEntity> list, Continuation<? super AssetCoinViewModel$handleGetCoinList$2> continuation) {
        super(2, continuation);
        this.this$0 = assetCoinViewModel;
        this.$delistedList = list;
    }

    /* JADX INFO: renamed from: h */
    public static final UIState m18499h(ArrayList arrayList, UIState uIState) {
        return UIState.copy$default(uIState, arrayList, null, false, null, null, 30, null);
    }

    /* JADX INFO: renamed from: j */
    public static final UIState m18501j(ArrayList arrayList, UIState uIState) {
        return UIState.copy$default(uIState, arrayList, null, false, null, null, 30, null);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AssetCoinViewModel$handleGetCoinList$2 assetCoinViewModel$handleGetCoinList$2 = new AssetCoinViewModel$handleGetCoinList$2(this.this$0, this.$delistedList, continuation);
        assetCoinViewModel$handleGetCoinList$2.L$0 = obj;
        return assetCoinViewModel$handleGetCoinList$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(ArrayList<AssetCoinEntity> arrayList, Continuation<? super Unit> continuation) {
        return ((AssetCoinViewModel$handleGetCoinList$2) create(arrayList, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AssetCoinViewModel$handleGetCoinList$2 assetCoinViewModel$handleGetCoinList$2;
        String str;
        Object next;
        final ArrayList<AssetCoinEntity> arrayList = (ArrayList) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (arrayList.isEmpty()) {
                this.this$0.updateState(new Function1() { // from class: com.kubi.assets.overview.coin.o
                    @Override // p852kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AssetCoinViewModel$handleGetCoinList$2.m18499h(arrayList, (UIState) obj2);
                    }
                });
                C46396e.m102344a(this.this$0.f18265Z);
                return Unit.INSTANCE;
            }
            arrayList.addAll(0, this.$delistedList);
            final AssetCoinViewModel assetCoinViewModel = this.this$0;
            String strJoinToString$default = CollectionsKt.joinToString$default(arrayList, ",", null, null, 0, null, new Function1() { // from class: com.kubi.assets.overview.coin.p
                @Override // p852kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AssetCoinViewModel$handleGetCoinList$2.m18500i(assetCoinViewModel, (AssetCoinEntity) obj2);
                }
            }, 30, null);
            InterfaceC41634e interfaceC41634eM17048B1 = AssetV2Api.m17048B1(this.this$0.m18472F(), strJoinToString$default, null, 2, null);
            this.L$0 = arrayList;
            this.L$1 = strJoinToString$default;
            this.label = 1;
            assetCoinViewModel$handleGetCoinList$2 = this;
            Object objM42826g = RetrofitFlowExKt.m42826g(interfaceC41634eM17048B1, false, null, assetCoinViewModel$handleGetCoinList$2, 2, null);
            if (objM42826g == coroutine_suspended) {
                return coroutine_suspended;
            }
            str = strJoinToString$default;
            obj = objM42826g;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) this.L$1;
            ResultKt.throwOnFailure(obj);
            assetCoinViewModel$handleGetCoinList$2 = this;
        }
        ArrayList arrayList2 = (ArrayList) ((C19334f) obj).m42846a();
        if (arrayList2 != null) {
            AssetCoinViewModel assetCoinViewModel2 = assetCoinViewModel$handleGetCoinList$2.this$0;
            for (AssetCoinEntity assetCoinEntity : arrayList) {
                Iterator it = arrayList2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((TradeItemBean) next).getSymbol(), assetCoinViewModel2.m18494K(assetCoinEntity)));
                TradeItemBean tradeItemBean = (TradeItemBean) next;
                assetCoinEntity.setLastTradedPrice(tradeItemBean != null ? Boxing.boxDouble(tradeItemBean.getLastDealPrice()) : null);
                assetCoinEntity.setChangeRate(tradeItemBean != null ? tradeItemBean.getChangeRate() : null);
            }
        }
        assetCoinViewModel$handleGetCoinList$2.this$0.updateState(new Function1() { // from class: com.kubi.assets.overview.coin.q
            @Override // p852kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return AssetCoinViewModel$handleGetCoinList$2.m18501j(arrayList, (UIState) obj2);
            }
        });
        Iterator it2 = arrayList.iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "iterator(...)");
        while (it2.hasNext()) {
            Object next2 = it2.next();
            Intrinsics.checkNotNullExpressionValue(next2, "next(...)");
            AssetCoinEntity assetCoinEntity2 = (AssetCoinEntity) next2;
            C46396e.m102357n(assetCoinViewModel$handleGetCoinList$2.this$0.f18265Z, assetCoinViewModel$handleGetCoinList$2.this$0.m18494K(assetCoinEntity2), assetCoinEntity2);
        }
        C46396e.m102358o(assetCoinViewModel$handleGetCoinList$2.this$0.f18265Z, assetCoinViewModel$handleGetCoinList$2.this$0.f18266a0, str);
        assetCoinViewModel$handleGetCoinList$2.this$0.f18264Y.close();
        assetCoinViewModel$handleGetCoinList$2.this$0.m18495N(str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: i */
    public static final CharSequence m18500i(AssetCoinViewModel assetCoinViewModel, AssetCoinEntity assetCoinEntity) {
        return assetCoinViewModel.m18494K(assetCoinEntity);
    }
}
