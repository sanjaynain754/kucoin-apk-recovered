package com.kubi.operation.lib.realtime.gempool;

import com.kubi.home.realtime.IRealTimeWidgetService;
import com.kubi.operation.lib.api.OperationRepo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlinx.coroutines.InterfaceC41709m0;
import p842zs.C46913b;
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

/* JADX INFO: compiled from: GempoolRealtimeDataHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.realtime.gempool.GempoolRealtimeDataHelper$pullDatas$1", m90122f = "GempoolRealtimeDataHelper.kt", m90123i = {}, m90124l = {40}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nGempoolRealtimeDataHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GempoolRealtimeDataHelper.kt\ncom/kubi/operation/lib/realtime/gempool/GempoolRealtimeDataHelper$pullDatas$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n1617#2,9:121\n1869#2:130\n1870#2:132\n1626#2:133\n774#2:134\n865#2,2:135\n1869#2,2:137\n1869#2,2:140\n1#3:131\n1#3:139\n*S KotlinDebug\n*F\n+ 1 GempoolRealtimeDataHelper.kt\ncom/kubi/operation/lib/realtime/gempool/GempoolRealtimeDataHelper$pullDatas$1\n*L\n42#1:121,9\n42#1:130\n42#1:132\n42#1:133\n43#1:134\n43#1:135,2\n43#1:137,2\n48#1:140,2\n42#1:131\n*E\n"})
public final class GempoolRealtimeDataHelper$pullDatas$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;

    public GempoolRealtimeDataHelper$pullDatas$1(Continuation<? super GempoolRealtimeDataHelper$pullDatas$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GempoolRealtimeDataHelper$pullDatas$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((GempoolRealtimeDataHelper$pullDatas$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List listReversed;
        String earnTokenName;
        String earnTokenName2;
        String campaignId;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            ResultKt.throwOnFailure(obj);
            if (!GempoolRealtimeDataHelper.f36778a.m43516g()) {
                return Unit.INSTANCE;
            }
            if (GempoolRealtimeDataHelper.f36784g.compareAndSet(false, true)) {
                OperationRepo operationRepo = GempoolRealtimeDataHelper.f36779b;
                this.label = 1;
                obj = operationRepo.m43275p(this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return Unit.INSTANCE;
        }
        List list = (List) obj;
        if (list != null && (listReversed = CollectionsKt.reversed(list)) != null) {
            ArrayList arrayList = new ArrayList();
            Iterator it = listReversed.iterator();
            while (true) {
                String campaignId2 = null;
                if (!it.hasNext()) {
                    break;
                }
                GempoolItemEntity entity = ((GemPoolRealtimeData) it.next()).getEntity();
                if (entity != null) {
                    campaignId2 = entity.getCampaignId();
                }
                if (campaignId2 != null) {
                    arrayList.add(campaignId2);
                }
            }
            Set set = CollectionsKt.toSet(arrayList);
            List list2 = GempoolRealtimeDataHelper.f36782e;
            Intrinsics.checkNotNullExpressionValue(list2, "access$getCurrentList$p(...)");
            ArrayList<GemPoolRealtimeData> arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                GempoolItemEntity entity2 = ((GemPoolRealtimeData) obj2).getEntity();
                if (entity2 != null) {
                    campaignId = entity2.getCampaignId();
                } else {
                    campaignId = null;
                }
                if (campaignId == null) {
                    campaignId = "";
                }
                if (!set.contains(campaignId)) {
                    arrayList2.add(obj2);
                }
            }
            for (GemPoolRealtimeData gemPoolRealtimeData : arrayList2) {
                C46913b c46913b = C46913b.f104783a;
                IRealTimeWidgetService iRealTimeWidgetServiceM103331b = c46913b.m103331b();
                Intrinsics.checkNotNull(gemPoolRealtimeData);
                iRealTimeWidgetServiceM103331b.mo30035e(gemPoolRealtimeData);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[helper-gempool]pullDatas,remove:");
                GempoolItemEntity entity3 = gemPoolRealtimeData.getEntity();
                if (entity3 != null) {
                    earnTokenName2 = entity3.getEarnTokenName();
                } else {
                    earnTokenName2 = null;
                }
                sb2.append(earnTokenName2);
                c46913b.m103333d(sb2.toString());
            }
            List<GemPoolRealtimeData> list3 = GempoolRealtimeDataHelper.f36782e;
            list3.clear();
            list3.addAll(listReversed);
            Intrinsics.checkNotNullExpressionValue(list3, "also(...)");
            for (GemPoolRealtimeData gemPoolRealtimeData2 : list3) {
                C46913b c46913b2 = C46913b.f104783a;
                IRealTimeWidgetService iRealTimeWidgetServiceM103331b2 = c46913b2.m103331b();
                Intrinsics.checkNotNull(gemPoolRealtimeData2);
                iRealTimeWidgetServiceM103331b2.mo30036f(gemPoolRealtimeData2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("[helper-gempool]pullDatas,add:");
                GempoolItemEntity entity4 = gemPoolRealtimeData2.getEntity();
                if (entity4 != null) {
                    earnTokenName = entity4.getEarnTokenName();
                } else {
                    earnTokenName = null;
                }
                sb3.append(earnTokenName);
                c46913b2.m103333d(sb3.toString());
            }
        }
        GempoolRealtimeDataHelper.f36778a.m43520k();
        GempoolRealtimeDataHelper.f36784g.set(false);
        return Unit.INSTANCE;
    }
}
