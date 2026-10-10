package com.kubi.flutter.widget.kline.interactor;

import com.kubi.flutter.proto.kline.OrderItem;
import com.kubi.flutter.widget.kline.IKLineDataInteractor;
import com.kubi.flutter.widget.kline.KLineType;
import com.kubi.flutter.widget.kline.KlineOrderEntity;
import com.kubi.flutter.widget.kline.utils.KLineRealTimeLog;
import com.kubi.utils.C27099x;
import com.trtc.uikit.livekit.p180kc.data.entity.SharedPositionInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: KLineCommonDataInteractors.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "Lcom/kubi/flutter/proto/kline/OrderItem;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.flutter.widget.kline.interactor.KLineMarketDataInteractor$fetchHistoryOrderList$2", m90122f = "KLineCommonDataInteractors.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nKLineCommonDataInteractors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KLineCommonDataInteractors.kt\ncom/kubi/flutter/widget/kline/interactor/KLineMarketDataInteractor$fetchHistoryOrderList$2\n+ 2 JsonEx.kt\ncom/kubi/utils/extensions/JsonExKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,345:1\n35#2,3:346\n35#2,3:349\n1563#3:352\n1634#3,3:353\n*S KotlinDebug\n*F\n+ 1 KLineCommonDataInteractors.kt\ncom/kubi/flutter/widget/kline/interactor/KLineMarketDataInteractor$fetchHistoryOrderList$2\n*L\n293#1:346,3\n295#1:349,3\n296#1:352\n296#1:353,3\n*E\n"})
public final class KLineMarketDataInteractor$fetchHistoryOrderList$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends OrderItem>>, Object> {
    final /* synthetic */ long $begin;
    final /* synthetic */ IKLineDataInteractor.OrderParam $param;
    int label;
    final /* synthetic */ KLineMarketDataInteractor this$0;

    @Override // p852kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends OrderItem>> continuation) {
        return invoke2(interfaceC41709m0, (Continuation<? super List<OrderItem>>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KLineMarketDataInteractor$fetchHistoryOrderList$2(IKLineDataInteractor.OrderParam orderParam, KLineMarketDataInteractor kLineMarketDataInteractor, long j11, Continuation<? super KLineMarketDataInteractor$fetchHistoryOrderList$2> continuation) {
        super(2, continuation);
        this.$param = orderParam;
        this.this$0 = kLineMarketDataInteractor;
        this.$begin = j11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new KLineMarketDataInteractor$fetchHistoryOrderList$2(this.$param, this.this$0, this.$begin, continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<OrderItem>> continuation) {
        return ((KLineMarketDataInteractor$fetchHistoryOrderList$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List arrayList;
        Object objM103844constructorimpl;
        String str;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (this.$param.getShowHistory() && this.$param.getEnableHistory() && !Intrinsics.areEqual(this.$param.getType(), KLineType.f22375e.getONE_MINUTE())) {
                OrderItem.BizType bizTypeM24277a = this.$param.m24277a();
                if (bizTypeM24277a == OrderItem.BizType.BIZ_ISOLATED_MARGIN) {
                    KLineMarketDataInteractor kLineMarketDataInteractor = this.this$0;
                    IKLineDataInteractor.OrderParam orderParam = this.$param;
                    long j11 = this.$begin;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        IMarketApi iMarketApiM24324G = kLineMarketDataInteractor.m24324G();
                        String symbol = orderParam.getSymbol();
                        String type = orderParam.getType().getType();
                        if (bizTypeM24277a == OrderItem.BizType.BIZ_CROSS_MARGIN) {
                            str = "MARGIN";
                        } else {
                            str = SharedPositionInfo.MARGIN_MODE_ISOLATED;
                        }
                        objM103844constructorimpl = Result.m103844constructorimpl(iMarketApiM24324G.m24347i(symbol, type, str, j11));
                    } catch (Throwable th2) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
                    }
                    if (Result.m103850isFailureimpl(objM103844constructorimpl)) {
                        objM103844constructorimpl = null;
                    }
                    arrayList = (List) objM103844constructorimpl;
                    if (arrayList == null) {
                        arrayList = CollectionsKt.emptyList();
                    }
                } else {
                    arrayList = new ArrayList();
                }
                List mutableList = CollectionsKt.toMutableList((Collection) this.this$0.m24324G().m24345g(this.$param.getSymbol(), this.$param.getType().getType(), this.$param.getTradeType(), this.$begin));
                KLineRealTimeLog kLineRealTimeLog = KLineRealTimeLog.f22494a;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("fetchBS-before,symbol=");
                sb2.append(this.$param.getSymbol());
                sb2.append(",type=");
                sb2.append(this.$param.getType().getType());
                sb2.append(", marginData(");
                sb2.append(arrayList.size());
                sb2.append(")=");
                String strM66919i = C27099x.m66919i(arrayList, false, 2, null);
                String str2 = "";
                if (strM66919i == null) {
                    strM66919i = "";
                }
                sb2.append(strM66919i);
                sb2.append(",normalData(");
                sb2.append(mutableList.size());
                sb2.append(")=");
                String strM66919i2 = C27099x.m66919i(mutableList, false, 2, null);
                if (strM66919i2 == null) {
                    strM66919i2 = "";
                }
                sb2.append(strM66919i2);
                kLineRealTimeLog.m24393a(sb2.toString());
                List listM24328K = this.this$0.m24328K(arrayList, mutableList);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("fetchBS-after,symbol=");
                sb3.append(this.$param.getSymbol());
                sb3.append(",type=");
                sb3.append(this.$param.getType().getType());
                sb3.append(", mergeBsData(");
                sb3.append(listM24328K.size());
                sb3.append(")=");
                String strM66919i3 = C27099x.m66919i(listM24328K, false, 2, null);
                if (strM66919i3 != null) {
                    str2 = strM66919i3;
                }
                sb3.append(str2);
                kLineRealTimeLog.m24393a(sb3.toString());
                KLineMarketDataInteractor kLineMarketDataInteractor2 = this.this$0;
                ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(listM24328K, 10));
                Iterator it = listM24328K.iterator();
                while (it.hasNext()) {
                    arrayList2.add(kLineMarketDataInteractor2.m24329L((KlineOrderEntity) it.next(), bizTypeM24277a));
                }
                return arrayList2;
            }
            KLineRealTimeLog.f22494a.m24393a("fetchBS,emptyList with param=" + this.$param);
            return CollectionsKt.emptyList();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
