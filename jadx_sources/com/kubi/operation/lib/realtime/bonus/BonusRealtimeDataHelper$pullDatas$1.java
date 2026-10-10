package com.kubi.operation.lib.realtime.bonus;

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

/* JADX INFO: compiled from: BonusRealtimeDataHelper.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.realtime.bonus.BonusRealtimeDataHelper$pullDatas$1", m90122f = "BonusRealtimeDataHelper.kt", m90123i = {}, m90124l = {38}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
@SourceDebugExtension({"SMAP\nBonusRealtimeDataHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BonusRealtimeDataHelper.kt\ncom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper$pullDatas$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,97:1\n1617#2,9:98\n1869#2:107\n1870#2:109\n1626#2:110\n774#2:111\n865#2,2:112\n1869#2,2:114\n1869#2,2:117\n1#3:108\n1#3:116\n*S KotlinDebug\n*F\n+ 1 BonusRealtimeDataHelper.kt\ncom/kubi/operation/lib/realtime/bonus/BonusRealtimeDataHelper$pullDatas$1\n*L\n40#1:98,9\n40#1:107\n40#1:109\n40#1:110\n41#1:111\n41#1:112,2\n41#1:114,2\n46#1:117,2\n40#1:108\n*E\n"})
public final class BonusRealtimeDataHelper$pullDatas$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    int label;

    public BonusRealtimeDataHelper$pullDatas$1(Continuation<? super BonusRealtimeDataHelper$pullDatas$1> continuation) {
        super(2, continuation);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new BonusRealtimeDataHelper$pullDatas$1(continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((BonusRealtimeDataHelper$pullDatas$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List listReversed;
        String taskId;
        String taskId2;
        String taskId3;
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
            if (!BonusRealtimeDataHelper.f36764a.m43495f()) {
                return Unit.INSTANCE;
            }
            if (BonusRealtimeDataHelper.f36769f.compareAndSet(false, true)) {
                OperationRepo operationRepo = BonusRealtimeDataHelper.f36765b;
                this.label = 1;
                obj = operationRepo.m43274o(this);
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
                String taskId4 = null;
                if (!it.hasNext()) {
                    break;
                }
                BonusItemEntity entity = ((BonusRealtimeData) it.next()).getEntity();
                if (entity != null) {
                    taskId4 = entity.getTaskId();
                }
                if (taskId4 != null) {
                    arrayList.add(taskId4);
                }
            }
            Set set = CollectionsKt.toSet(arrayList);
            List list2 = BonusRealtimeDataHelper.f36768e;
            Intrinsics.checkNotNullExpressionValue(list2, "access$getCurrentList$p(...)");
            ArrayList<BonusRealtimeData> arrayList2 = new ArrayList();
            for (Object obj2 : list2) {
                BonusItemEntity entity2 = ((BonusRealtimeData) obj2).getEntity();
                if (entity2 != null) {
                    taskId3 = entity2.getTaskId();
                } else {
                    taskId3 = null;
                }
                if (taskId3 == null) {
                    taskId3 = "";
                }
                if (!set.contains(taskId3)) {
                    arrayList2.add(obj2);
                }
            }
            for (BonusRealtimeData bonusRealtimeData : arrayList2) {
                C46913b c46913b = C46913b.f104783a;
                IRealTimeWidgetService iRealTimeWidgetServiceM103331b = c46913b.m103331b();
                Intrinsics.checkNotNull(bonusRealtimeData);
                iRealTimeWidgetServiceM103331b.mo30035e(bonusRealtimeData);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[helper-bonus]pullDatas,remove:");
                BonusItemEntity entity3 = bonusRealtimeData.getEntity();
                if (entity3 != null) {
                    taskId2 = entity3.getTaskId();
                } else {
                    taskId2 = null;
                }
                sb2.append(taskId2);
                c46913b.m103333d(sb2.toString());
            }
            List<BonusRealtimeData> list3 = BonusRealtimeDataHelper.f36768e;
            list3.clear();
            list3.addAll(listReversed);
            Intrinsics.checkNotNullExpressionValue(list3, "also(...)");
            for (BonusRealtimeData bonusRealtimeData2 : list3) {
                C46913b c46913b2 = C46913b.f104783a;
                IRealTimeWidgetService iRealTimeWidgetServiceM103331b2 = c46913b2.m103331b();
                Intrinsics.checkNotNull(bonusRealtimeData2);
                iRealTimeWidgetServiceM103331b2.mo30036f(bonusRealtimeData2);
                StringBuilder sb3 = new StringBuilder();
                sb3.append("[helper-bonus]pullDatas,add:");
                BonusItemEntity entity4 = bonusRealtimeData2.getEntity();
                if (entity4 != null) {
                    taskId = entity4.getTaskId();
                } else {
                    taskId = null;
                }
                sb3.append(taskId);
                c46913b2.m103333d(sb3.toString());
            }
        }
        BonusRealtimeDataHelper.f36764a.m43498i();
        BonusRealtimeDataHelper.f36769f.set(false);
        return Unit.INSTANCE;
    }
}
