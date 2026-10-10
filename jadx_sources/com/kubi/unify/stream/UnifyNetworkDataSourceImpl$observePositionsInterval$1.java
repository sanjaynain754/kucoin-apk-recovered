package com.kubi.unify.stream;

import com.kubi.unify.entity.UnifyAdlRankRequestItem;
import com.kubi.unify.entity.UnifyPositionEntity;
import com.kubi.unify.utils.FlowExKt;
import java.math.BigDecimal;
import java.util.ArrayList;
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
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function3;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import p852kotlin.ranges.RangesKt;

/* JADX INFO: compiled from: UnifyNetworkDataSourceImpl.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "", "accumulator", "value"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observePositionsInterval$1", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {0, 0, 0, 0}, m90124l = {172}, m90125m = "invokeSuspend", m90126n = {"accumulator", "value", "positionList", "adlList"}, m90127s = {"L$0", "L$1", "L$2", "L$3"})
@SourceDebugExtension({"SMAP\nUnifyNetworkDataSourceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observePositionsInterval$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,520:1\n1563#2:521\n1634#2,3:522\n1869#2,2:525\n1208#2,2:527\n1236#2,4:529\n*S KotlinDebug\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observePositionsInterval$1\n*L\n165#1:521\n165#1:522,3\n177#1:525,2\n184#1:527,2\n184#1:529,4\n*E\n"})
public final class UnifyNetworkDataSourceImpl$observePositionsInterval$1 extends SuspendLambda implements Function3<Object, Object, Continuation<? super Object>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ UnifyNetworkDataSourceImpl this$0;

    @Override // p852kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Continuation<? super Object> continuation) {
        return invoke2(obj, obj2, (Continuation<Object>) continuation);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnifyNetworkDataSourceImpl$observePositionsInterval$1(UnifyNetworkDataSourceImpl unifyNetworkDataSourceImpl, Continuation<? super UnifyNetworkDataSourceImpl$observePositionsInterval$1> continuation) {
        super(3, continuation);
        this.this$0 = unifyNetworkDataSourceImpl;
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Object obj, Object obj2, Continuation<Object> continuation) {
        UnifyNetworkDataSourceImpl$observePositionsInterval$1 unifyNetworkDataSourceImpl$observePositionsInterval$1 = new UnifyNetworkDataSourceImpl$observePositionsInterval$1(this.this$0, continuation);
        unifyNetworkDataSourceImpl$observePositionsInterval$1.L$0 = obj;
        unifyNetworkDataSourceImpl$observePositionsInterval$1.L$1 = obj2;
        return unifyNetworkDataSourceImpl$observePositionsInterval$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List<UnifyPositionEntity> listEmptyList;
        Object objM65459c;
        Object obj2 = this.L$0;
        Object obj3 = this.L$1;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            if (!(obj3 instanceof List)) {
                Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.kubi.unify.entity.UnifyPositionEntity>");
                List list = (List) obj2;
                LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
                for (Object obj4 : list) {
                    linkedHashMap.put(((UnifyPositionEntity) obj4).getPositionId(), obj4);
                }
                Map mutableMap = MapsKt.toMutableMap(linkedHashMap);
                if (obj3 instanceof UnifyPositionEntity) {
                    UnifyPositionEntity unifyPositionEntity = (UnifyPositionEntity) obj3;
                    if (C41014a.m89917B(unifyPositionEntity.getCurrentQuantity())) {
                        mutableMap.remove(unifyPositionEntity.getPositionId());
                    } else {
                        UnifyPositionEntity unifyPositionEntity2 = (UnifyPositionEntity) mutableMap.get(unifyPositionEntity.getPositionId());
                        if (unifyPositionEntity2 != null) {
                            mutableMap.put(unifyPositionEntity.getPositionId(), UnifyPositionEntity.copy$default(unifyPositionEntity, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, unifyPositionEntity2.getPosMargin(), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1048577, 255, null));
                        } else {
                            mutableMap.put(unifyPositionEntity.getPositionId(), obj3);
                        }
                    }
                }
                return CollectionsKt.toList(mutableMap.values());
            }
            listEmptyList = obj3 != null ? (List) obj3 : null;
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listEmptyList, 10));
            for (UnifyPositionEntity unifyPositionEntity3 : listEmptyList) {
                arrayList.add(new UnifyAdlRankRequestItem(unifyPositionEntity3.getSymbol(), Boxing.boxBoolean(C41014a.m89922G(unifyPositionEntity3.getCurrentQuantity(), null, 1, null).compareTo(BigDecimal.ZERO) > 0)));
            }
            C26664xe749cf03 c26664xe749cf03 = new C26664xe749cf03(this.this$0, arrayList, null);
            this.L$0 = SpillingKt.nullOutSpilledVariable(obj2);
            this.L$1 = SpillingKt.nullOutSpilledVariable(obj3);
            this.L$2 = listEmptyList;
            this.L$3 = SpillingKt.nullOutSpilledVariable(arrayList);
            this.label = 1;
            objM65459c = FlowExKt.m65459c(c26664xe749cf03, null, this, 2, null);
            if (objM65459c == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            List list2 = (List) this.L$2;
            ResultKt.throwOnFailure(obj);
            listEmptyList = list2;
            objM65459c = obj;
        }
        Map mapEmptyMap = (Map) objM65459c;
        if (mapEmptyMap == null) {
            mapEmptyMap = MapsKt.emptyMap();
        }
        for (UnifyPositionEntity unifyPositionEntity4 : listEmptyList) {
            unifyPositionEntity4.setAdlPercentage((BigDecimal) mapEmptyMap.get(unifyPositionEntity4.getSymbol()));
        }
        return listEmptyList;
    }
}
