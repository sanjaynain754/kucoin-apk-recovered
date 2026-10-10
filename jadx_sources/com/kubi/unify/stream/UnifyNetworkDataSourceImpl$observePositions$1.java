package com.kubi.unify.stream;

import com.kubi.unify.entity.UnifyComposeEntity;
import com.kubi.unify.entity.UnifyPositionEntity;
import com.kubi.unify.entity.WsUnifyAccountOverviewEntity;
import com.kubi.unify.entity.WsUnifyPositionEntity;
import com.kubi.utils.extensions.C27041f;
import java.math.BigDecimal;
import java.util.Iterator;
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
import p852kotlin.jvm.internal.TypeIntrinsics;
import p852kotlin.ranges.RangesKt;
import p852kotlin.text.StringsKt;

/* JADX INFO: compiled from: UnifyNetworkDataSourceImpl.kt */
/* JADX INFO: loaded from: classes52.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0001H\n"}, m90084d2 = {"<anonymous>", "", "accumulator", "value"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.unify.stream.UnifyNetworkDataSourceImpl$observePositions$1", m90122f = "UnifyNetworkDataSourceImpl.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nUnifyNetworkDataSourceImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observePositions$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,520:1\n1208#2,2:521\n1236#2,4:523\n1869#2,2:527\n216#3,2:529\n*S KotlinDebug\n*F\n+ 1 UnifyNetworkDataSourceImpl.kt\ncom/kubi/unify/stream/UnifyNetworkDataSourceImpl$observePositions$1\n*L\n123#1:521,2\n123#1:523,4\n125#1:527,2\n138#1:529,2\n*E\n"})
public final class UnifyNetworkDataSourceImpl$observePositions$1 extends SuspendLambda implements Function3<Object, Object, Continuation<? super Object>, Object> {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    public UnifyNetworkDataSourceImpl$observePositions$1(Continuation<? super UnifyNetworkDataSourceImpl$observePositions$1> continuation) {
        super(3, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Continuation<? super Object> continuation) {
        return invoke2(obj, obj2, (Continuation<Object>) continuation);
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(Object obj, Object obj2, Continuation<Object> continuation) {
        UnifyNetworkDataSourceImpl$observePositions$1 unifyNetworkDataSourceImpl$observePositions$1 = new UnifyNetworkDataSourceImpl$observePositions$1(continuation);
        unifyNetworkDataSourceImpl$observePositions$1.L$0 = obj;
        unifyNetworkDataSourceImpl$observePositions$1.L$1 = obj2;
        return unifyNetworkDataSourceImpl$observePositions$1.invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
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
        if (obj2 instanceof UnifyComposeEntity) {
            return CollectionsKt.emptyList();
        }
        Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.collections.List<com.kubi.unify.entity.UnifyPositionEntity>");
        List list = (List) obj2;
        LinkedHashMap linkedHashMap = new LinkedHashMap(RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list, 10)), 16));
        for (Object obj4 : list) {
            linkedHashMap.put(((UnifyPositionEntity) obj4).getPositionId(), obj4);
        }
        Map mapAsMutableMap = TypeIntrinsics.asMutableMap(linkedHashMap);
        if (obj3 instanceof UnifyComposeEntity) {
            UnifyComposeEntity unifyComposeEntity = (UnifyComposeEntity) obj3;
            List<WsUnifyPositionEntity> positions = unifyComposeEntity.getPositions();
            if (positions != null) {
                for (WsUnifyPositionEntity wsUnifyPositionEntity : positions) {
                    String strM66668h = C27041f.m66668h(wsUnifyPositionEntity.getPositionId());
                    UnifyPositionEntity unifyPositionEntity = (UnifyPositionEntity) mapAsMutableMap.get(strM66668h);
                    if (unifyPositionEntity == null) {
                        mapAsMutableMap.remove(strM66668h);
                    } else {
                        mapAsMutableMap.put(C27041f.m66668h(wsUnifyPositionEntity.getPositionId()), unifyPositionEntity.copyFromWs(wsUnifyPositionEntity));
                    }
                }
            }
            WsUnifyAccountOverviewEntity userEquity = unifyComposeEntity.getUserEquity();
            BigDecimal accountRiskRatio = userEquity != null ? userEquity.getAccountRiskRatio() : null;
            if (!C41014a.m89917B(accountRiskRatio)) {
                Iterator it = mapAsMutableMap.entrySet().iterator();
                while (it.hasNext()) {
                    UnifyPositionEntity unifyPositionEntity2 = (UnifyPositionEntity) ((Map.Entry) it.next()).getValue();
                    String marginMode = unifyPositionEntity2.getMarginMode();
                    if (marginMode == null || StringsKt.isBlank(marginMode) || StringsKt.equals(unifyPositionEntity2.getMarginMode(), "CROSS", true)) {
                        unifyPositionEntity2.setRiskRatio(accountRiskRatio);
                    }
                }
            }
        }
        return CollectionsKt.toList(mapAsMutableMap.values());
    }
}
