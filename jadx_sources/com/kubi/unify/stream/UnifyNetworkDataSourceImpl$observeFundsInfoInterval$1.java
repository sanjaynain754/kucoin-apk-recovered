package com.kubi.unify.stream;

import com.kubi.unify.entity.UnifyFundsInfoEntity;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
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

/* JADX INFO: compiled from: UnifyNetworkDataSourceImpl.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "", "accumulator", "value"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observeFundsInfoInterval$1", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nUnifyNetworkDataSourceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeFundsInfoInterval$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,520:1\n1208#2,2:521\n1236#2,4:523\n*S KotlinDebug\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observeFundsInfoInterval$1\n*L\n259#1:521,2\n259#1:523,4\n*E\n"})
public final class UnifyNetworkDataSourceImpl$observeFundsInfoInterval$1 extends SuspendLambda implements Function3<Object, Object, Continuation<? super Object>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public UnifyNetworkDataSourceImpl$observeFundsInfoInterval$1(Continuation<? super UnifyNetworkDataSourceImpl$observeFundsInfoInterval$1> continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Continuation<? super Object> continuation) {
        return invoke2(obj, obj2, (Continuation<Object>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Object obj, Object obj2, Continuation<Object> continuation) {
        UnifyNetworkDataSourceImpl$observeFundsInfoInterval$1 unifyNetworkDataSourceImpl$observeFundsInfoInterval$1 = new UnifyNetworkDataSourceImpl$observeFundsInfoInterval$1(continuation);
        unifyNetworkDataSourceImpl$observeFundsInfoInterval$1.L$0 = obj;
        unifyNetworkDataSourceImpl$observeFundsInfoInterval$1.L$1 = obj2;
        return unifyNetworkDataSourceImpl$observeFundsInfoInterval$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str;
        Integer collateralStatus;
        Object obj2 = this.L$0;
        Object obj3 = this.L$1;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        if (obj3 instanceof List) {
            return obj3;
        }
        if ((obj2 instanceof List ? (List) obj2 : null) == null) {
            return obj2;
        }
        if (!(obj3 instanceof UnifyFundsInfoEntity)) {
            return (List) obj2;
        }
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.kubi.unify.entity.UnifyFundsInfoEntity>");
        List list = (List) obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        Iterator it = list.iterator();
        while (true) {
            str = "";
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            String currency = ((UnifyFundsInfoEntity) next).getCurrency();
            if (currency != null) {
                str = currency;
            }
            linkedHashMap.put(str, next);
        }
        Map mutableMap = MapsKt.toMutableMap(linkedHashMap);
        UnifyFundsInfoEntity unifyFundsInfoEntity = (UnifyFundsInfoEntity) obj3;
        String currency2 = unifyFundsInfoEntity.getCurrency();
        str = currency2 != null ? currency2 : "";
        Integer collateralStatus2 = unifyFundsInfoEntity.getCollateralStatus();
        if (collateralStatus2 == null) {
            UnifyFundsInfoEntity unifyFundsInfoEntity2 = (UnifyFundsInfoEntity) mutableMap.get(str);
            collateralStatus = unifyFundsInfoEntity2 != null ? unifyFundsInfoEntity2.getCollateralStatus() : null;
        } else {
            collateralStatus = collateralStatus2;
        }
        mutableMap.put(str, UnifyFundsInfoEntity.copy$default(unifyFundsInfoEntity, null, null, null, null, null, null, null, null, null, null, null, null, collateralStatus, 4095, null));
        return CollectionsKt.toList(mutableMap.values());
    }
}
