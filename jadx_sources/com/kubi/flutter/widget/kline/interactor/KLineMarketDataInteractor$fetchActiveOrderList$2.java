package com.kubi.flutter.widget.kline.interactor;

import com.kubi.flutter.proto.kline.OrderItem;
import com.kubi.flutter.widget.kline.ActiveOrderEntity;
import com.kubi.flutter.widget.kline.C12804r;
import com.kubi.flutter.widget.kline.IKLineDataInteractor;
import com.kubi.flutter.widget.kline.utils.KLineRealTimeLog;
import com.kubi.utils.C27099x;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KLineCommonDataInteractors.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/flutter/proto/kline/OrderItem;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.interactor.KLineMarketDataInteractor$fetchActiveOrderList$2", m90122f = "KLineCommonDataInteractors.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKLineCommonDataInteractors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineCommonDataInteractors.kt\ncom/kubi/flutter/widget/kline/interactor/KLineMarketDataInteractor$fetchActiveOrderList$2\n+ 2 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,345:1\n35#2,3:346\n1563#3:349\n1634#3,3:350\n*S KotlinDebug\n*F\n+ 1 KLineCommonDataInteractors.kt\ncom/kubi/flutter/widget/kline/interactor/KLineMarketDataInteractor$fetchActiveOrderList$2\n*L\n254#1:346,3\n255#1:349\n255#1:350,3\n*E\n"})
public final class KLineMarketDataInteractor$fetchActiveOrderList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends OrderItem>>, Object> {
    final /* synthetic */ IKLineDataInteractor.OrderParam $param;
    int label;
    final /* synthetic */ KLineMarketDataInteractor this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends OrderItem>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super List<OrderItem>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineMarketDataInteractor$fetchActiveOrderList$2(IKLineDataInteractor.OrderParam orderParam, KLineMarketDataInteractor kLineMarketDataInteractor, Continuation<? super KLineMarketDataInteractor$fetchActiveOrderList$2> continuation) {
        super(2, continuation);
        this.$param = orderParam;
        this.this$0 = kLineMarketDataInteractor;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineMarketDataInteractor$fetchActiveOrderList$2(this.$param, this.this$0, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<OrderItem>> continuation) {
        return ((KLineMarketDataInteractor$fetchActiveOrderList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$param.getShowActive() && this.$param.getEnableActive()) {
                OrderItem.BizType bizTypeM24277a = this.$param.m24277a();
                HashMap map = new HashMap();
                map.put("symbol", this.$param.getSymbol());
                map.put("tradeType", this.$param.getTradeType());
                C12804r.m24373a(map);
                KLineRealTimeLog kLineRealTimeLog = KLineRealTimeLog.f22494a;
                kLineRealTimeLog.m24393a("fetchActiveBS-before,hashMap=" + map);
                List items = IMarketApi.m24343f(this.this$0.m24324G(), map, false, false, 6, null).getItems();
                if (items == null) {
                    items = CollectionsKt.emptyList();
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("fetchActiveBS-after,symbol=");
                sb2.append(this.$param.getSymbol());
                sb2.append(",type=");
                sb2.append(this.$param.getType().getType());
                sb2.append(", mergeBsData(");
                sb2.append(items.size());
                sb2.append(")=");
                String strM66919i = C27099x.m66919i(items, false, 2, null);
                if (strM66919i == null) {
                    strM66919i = "";
                }
                sb2.append(strM66919i);
                kLineRealTimeLog.m24393a(sb2.toString());
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(items, 10));
                Iterator it = items.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ActiveOrderEntity) it.next()).toActiveOrderItem(bizTypeM24277a));
                }
                return arrayList;
            }
            KLineRealTimeLog.f22494a.m24393a("fetchActiveBS,emptyList with param=" + this.$param);
            return CollectionsKt.emptyList();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
