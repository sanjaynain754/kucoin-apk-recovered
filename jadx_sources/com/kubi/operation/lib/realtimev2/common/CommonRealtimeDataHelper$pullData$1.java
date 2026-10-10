package com.kubi.operation.lib.realtimev2.common;

import at.C4387c;
import com.kubi.home.realtime.IRealTimeWidgetService;
import com.kubi.operation.lib.api.OperationRepo;
import com.kubi.operation.lib.realtimev2.DynamicCardEntity;
import com.kubi.operation.lib.realtimev2.DynamicCardItemEntity;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
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
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: CommonRealtimeDataHelper.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.realtimev2.common.CommonRealtimeDataHelper$pullData$1", m90122f = "CommonRealtimeDataHelper.kt", m90123i = {0}, m90124l = {50}, m90125m = "invokeSuspend", m90126n = {"delaySeconds"}, m90127s = {"I$0"})
@SourceDebugExtension({"SMAP\nCommonRealtimeDataHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CommonRealtimeDataHelper.kt\ncom/kubi/operation/lib/realtimev2/common/CommonRealtimeDataHelper$pullData$1\n+ 2 RealtimeHelperV2.kt\ncom/kubi/operation/lib/realtimev2/RealtimeHelperV2\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n53#2,4:132\n53#2,4:144\n53#2,4:150\n53#2,4:155\n1563#3:136\n1634#3,3:137\n774#3:140\n865#3,2:141\n1869#3:143\n1870#3:148\n1869#3:149\n1870#3:154\n*S KotlinDebug\n*F\n+ 1 CommonRealtimeDataHelper.kt\ncom/kubi/operation/lib/realtimev2/common/CommonRealtimeDataHelper$pullData$1\n*L\n47#1:132,4\n57#1:144,4\n65#1:150,4\n74#1:155,4\n53#1:136\n53#1:137,3\n54#1:140\n54#1:141,2\n54#1:143\n54#1:148\n63#1:149\n63#1:154\n*E\n"})
public final class CommonRealtimeDataHelper$pullData$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int I$0;
    int label;

    public CommonRealtimeDataHelper$pullData$1(Continuation<? super CommonRealtimeDataHelper$pullData$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CommonRealtimeDataHelper$pullData$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((CommonRealtimeDataHelper$pullData$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i11;
        Integer refreshRateSeconds;
        List<DynamicCardItemEntity> cardList;
        List listReversed;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        int iIntValue = 10;
        try {
            if (i12 != 0) {
                if (i12 == 1) {
                    i11 = this.I$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                    } catch (Exception unused) {
                        iIntValue = i11;
                        C4387c c4387c = C4387c.f3817a;
                    }
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                ResultKt.throwOnFailure(obj);
                if (!CommonRealtimeDataHelper.f36803a.m43557h()) {
                    return Unit.INSTANCE;
                }
                if (!CommonRealtimeDataHelper.f36807e.compareAndSet(false, true)) {
                    return Unit.INSTANCE;
                }
                C4387c c4387c2 = C4387c.f3817a;
                try {
                    OperationRepo operationRepo = CommonRealtimeDataHelper.f36804b;
                    this.I$0 = 10;
                    this.label = 1;
                    obj = operationRepo.m43268i(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    i11 = 10;
                } catch (Exception unused2) {
                    C4387c c4387c3 = C4387c.f3817a;
                }
            }
            DynamicCardEntity dynamicCardEntity = (DynamicCardEntity) obj;
            if (dynamicCardEntity != null && (cardList = dynamicCardEntity.getCardList()) != null && (listReversed = CollectionsKt.reversed(cardList)) != null) {
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listReversed, 10));
                Iterator it = listReversed.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DynamicCardItemEntity) it.next()).getUniqueId());
                }
                Set set = CollectionsKt.toSet(arrayList);
                List list = CommonRealtimeDataHelper.f36806d;
                Intrinsics.checkNotNullExpressionValue(list, "access$getCurrentList$p(...)");
                ArrayList<DynamicCardItemEntity> arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    if (!set.contains(((DynamicCardItemEntity) obj2).getUniqueId())) {
                        arrayList2.add(obj2);
                    }
                }
                for (DynamicCardItemEntity dynamicCardItemEntity : arrayList2) {
                    CommonRealtimeDataHelper.f36806d.remove(dynamicCardItemEntity);
                    IRealTimeWidgetService iRealTimeWidgetServiceM3990e = C4387c.f3817a.m3990e();
                    Intrinsics.checkNotNull(dynamicCardItemEntity);
                    iRealTimeWidgetServiceM3990e.mo30035e(dynamicCardItemEntity);
                }
                List<DynamicCardItemEntity> list2 = CommonRealtimeDataHelper.f36806d;
                list2.clear();
                list2.addAll(listReversed);
                Intrinsics.checkNotNullExpressionValue(list2, "also(...)");
                for (DynamicCardItemEntity dynamicCardItemEntity2 : list2) {
                    IRealTimeWidgetService iRealTimeWidgetServiceM3990e2 = C4387c.f3817a.m3990e();
                    Intrinsics.checkNotNull(dynamicCardItemEntity2);
                    iRealTimeWidgetServiceM3990e2.mo30036f(dynamicCardItemEntity2);
                }
                CommonRealtimeDataHelper.f36803a.m43562m(false);
            }
            if (dynamicCardEntity != null && (refreshRateSeconds = dynamicCardEntity.getRefreshRateSeconds()) != null) {
                iIntValue = refreshRateSeconds.intValue();
            }
            CommonRealtimeDataHelper.f36807e.set(false);
            CommonRealtimeDataHelper.f36803a.m43556g(iIntValue);
            return Unit.INSTANCE;
        } catch (CancellationException unused3) {
            return Unit.INSTANCE;
        } finally {
            CommonRealtimeDataHelper.f36807e.set(false);
        }
    }
}
