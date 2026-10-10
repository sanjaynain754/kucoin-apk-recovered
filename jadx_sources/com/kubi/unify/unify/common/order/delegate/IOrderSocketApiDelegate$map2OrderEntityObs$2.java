package com.kubi.unify.unify.common.order.delegate;

import com.kubi.kumex.data.trade.model.OrderEntity;
import com.kubi.kumex.data.trade.model.OrdersPageEntity;
import com.kubi.unify.api.entity.UnifyOrderStatusEnum;
import com.kubi.unify.entity.UnifyOrderEntity;
import com.kubi.unify.entity.UnifyPageEntity;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p402kf.C41014a;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: IOrderSocketApiDelegate.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "", "accumulator", "value"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.unify.common.order.delegate.IOrderSocketApiDelegate$map2OrderEntityObs$2", m90122f = "IOrderSocketApiDelegate.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nIOrderSocketApiDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IOrderSocketApiDelegate.kt\ncom/kubi/unify/unify/common/order/delegate/IOrderSocketApiDelegate$map2OrderEntityObs$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,143:1\n1208#2,2:144\n1236#2,4:146\n*S KotlinDebug\n*F\n+ 1 IOrderSocketApiDelegate.kt\ncom/kubi/unify/unify/common/order/delegate/IOrderSocketApiDelegate$map2OrderEntityObs$2\n*L\n86#1:144,2\n86#1:146,4\n*E\n"})
public final class IOrderSocketApiDelegate$map2OrderEntityObs$2 extends SuspendLambda implements Function3<Object, Object, Continuation<? super Object>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ IOrderSocketApiDelegate this$0;

    @Override // p852kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Continuation<? super Object> continuation) {
        return invoke2(obj, obj2, (Continuation<Object>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IOrderSocketApiDelegate$map2OrderEntityObs$2(IOrderSocketApiDelegate iOrderSocketApiDelegate, Continuation<? super IOrderSocketApiDelegate$map2OrderEntityObs$2> continuation) {
        super(3, continuation);
        this.this$0 = iOrderSocketApiDelegate;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Object obj, Object obj2, Continuation<Object> continuation) {
        IOrderSocketApiDelegate$map2OrderEntityObs$2 iOrderSocketApiDelegate$map2OrderEntityObs$2 = new IOrderSocketApiDelegate$map2OrderEntityObs$2(this.this$0, continuation);
        iOrderSocketApiDelegate$map2OrderEntityObs$2.L$0 = obj;
        iOrderSocketApiDelegate$map2OrderEntityObs$2.L$1 = obj2;
        return iOrderSocketApiDelegate$map2OrderEntityObs$2.invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:52:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:54:0x00ff  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0089, code lost:
    
        if (r10.equals("CANCEL") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00da, code lost:
    
        if (r10.equals("TRIGGER") == false) goto L55;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00dd, code lost:
    
        r2.remove(r1.getOrderId());
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        Object obj3 = this.L$1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (obj3 instanceof UnifyPageEntity) {
            return this.this$0.m65422j((UnifyPageEntity) obj3);
        }
        OrdersPageEntity ordersPageEntity = obj2 instanceof OrdersPageEntity ? (OrdersPageEntity) obj2 : null;
        if (ordersPageEntity == null) {
            ordersPageEntity = new OrdersPageEntity(null, 0L, 3, null);
        }
        if (!(obj3 instanceof UnifyOrderEntity)) {
            return ordersPageEntity;
        }
        UnifyOrderEntity unifyOrderEntity = (UnifyOrderEntity) obj3;
        String eventType = unifyOrderEntity.getEventType();
        List<OrderEntity> items = ordersPageEntity.getItems();
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(items, 10)), 16));
        for (Object obj4 : items) {
            linkedHashMap.put(((OrderEntity) obj4).getId(), obj4);
        }
        Map mutableMap = MapsKt.toMutableMap(linkedHashMap);
        long totalNum = ordersPageEntity.getTotalNum();
        if (eventType != null) {
            switch (eventType.hashCode()) {
                case -1785516855:
                    if (eventType.equals("UPDATE")) {
                        mutableMap.put(unifyOrderEntity.getOrderId(), unifyOrderEntity.toOrderEntity());
                        if (Intrinsics.areEqual(eventType, "OPEN")) {
                            totalNum++;
                        }
                    }
                    break;
                case -341909096:
                    break;
                case 2157955:
                    if (eventType.equals("FILL")) {
                        if (!C41014a.m89927a(unifyOrderEntity.getSize(), unifyOrderEntity.getFilledSize())) {
                            Integer status = unifyOrderEntity.getStatus();
                            int type = UnifyOrderStatusEnum.FILLED.getType();
                            if (status == null || status.intValue() != type) {
                                mutableMap.put(unifyOrderEntity.getOrderId(), unifyOrderEntity.toOrderEntity());
                                break;
                            }
                        }
                        mutableMap.remove(unifyOrderEntity.getOrderId());
                        totalNum--;
                    }
                    break;
                case 2432586:
                    if (eventType.equals("OPEN")) {
                        mutableMap.put(unifyOrderEntity.getOrderId(), unifyOrderEntity.toOrderEntity());
                        if (Intrinsics.areEqual(eventType, "OPEN")) {
                            totalNum++;
                        }
                    }
                    break;
                case 1980572282:
                    break;
            }
        }
        return ordersPageEntity.copy(CollectionsKt.toList(mutableMap.values()), totalNum);
    }
}
