package com.kubi.operation.lib.realtime.gempool;

import com.kubi.operation.lib.api.OperationRepo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p842zs.C46913b;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: compiled from: GempoolRealtimeDataHelper.kt */
/* JADX INFO: loaded from: classes32.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.realtime.gempool.GempoolRealtimeDataHelper$markedShow$1", m90122f = "GempoolRealtimeDataHelper.kt", m90123i = {0}, m90124l = {73}, m90125m = "invokeSuspend", m90126n = {"idList"}, m90127s = {"L$0"})
@SourceDebugExtension({"SMAP\nGempoolRealtimeDataHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GempoolRealtimeDataHelper.kt\ncom/kubi/operation/lib/realtime/gempool/GempoolRealtimeDataHelper$markedShow$1\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,120:1\n774#2:121\n865#2,2:122\n1617#2,9:124\n1869#2:133\n1870#2:135\n1626#2:136\n1#3:134\n*S KotlinDebug\n*F\n+ 1 GempoolRealtimeDataHelper.kt\ncom/kubi/operation/lib/realtime/gempool/GempoolRealtimeDataHelper$markedShow$1\n*L\n65#1:121\n65#1:122,2\n66#1:124,9\n66#1:133\n66#1:135\n66#1:136\n66#1:134\n*E\n"})
public final class GempoolRealtimeDataHelper$markedShow$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $all;
    final /* synthetic */ GemPoolRealtimeData $data;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GempoolRealtimeDataHelper$markedShow$1(boolean z11, GemPoolRealtimeData gemPoolRealtimeData, Continuation<? super GempoolRealtimeDataHelper$markedShow$1> continuation) {
        super(2, continuation);
        this.$all = z11;
        this.$data = gemPoolRealtimeData;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new GempoolRealtimeDataHelper$markedShow$1(this.$all, this.$data, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((GempoolRealtimeDataHelper$markedShow$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List listEmptyList;
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
            C46913b c46913b = C46913b.f104783a;
            c46913b.m103333d("[helper-gempool]markedShow,all=" + this.$all + ",entity=" + this.$data.getEntity());
            String campaignId2 = null;
            if (GempoolRealtimeDataHelper.f36783f.compareAndSet(false, true)) {
                if (this.$all) {
                    List list = GempoolRealtimeDataHelper.f36782e;
                    Intrinsics.checkNotNullExpressionValue(list, "access$getCurrentList$p(...)");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        GempoolItemEntity entity = ((GemPoolRealtimeData) obj2).getEntity();
                        if (entity != null && entity.isFinished()) {
                            arrayList.add(obj2);
                        }
                    }
                    listEmptyList = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        GempoolItemEntity entity2 = ((GemPoolRealtimeData) it.next()).getEntity();
                        if (entity2 != null) {
                            campaignId = entity2.getCampaignId();
                        } else {
                            campaignId = null;
                        }
                        if (campaignId != null) {
                            listEmptyList.add(campaignId);
                        }
                    }
                } else {
                    GempoolItemEntity entity3 = this.$data.getEntity();
                    if (entity3 != null && entity3.isFinished()) {
                        String campaignId3 = entity3.getCampaignId();
                        if (campaignId3 == null) {
                            campaignId3 = "";
                        }
                        listEmptyList = CollectionsKt.listOf(campaignId3);
                    } else {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                }
                C46913b.f104783a.m103333d("[helper-gempool]markedShow,idList(" + listEmptyList.size() + ")=" + listEmptyList);
                if (!listEmptyList.isEmpty()) {
                    OperationRepo operationRepo = GempoolRealtimeDataHelper.f36779b;
                    GempoolMarkedReadReqEntity gempoolMarkedReadReqEntity = new GempoolMarkedReadReqEntity(listEmptyList);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(listEmptyList);
                    this.label = 1;
                    if (operationRepo.m43270k(gempoolMarkedReadReqEntity, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[helper-gempool]marked-show-isDoing:");
                GempoolItemEntity entity4 = this.$data.getEntity();
                if (entity4 != null) {
                    campaignId2 = entity4.getCampaignId();
                }
                sb2.append(campaignId2);
                c46913b.m103333d(sb2.toString());
            }
            return Unit.INSTANCE;
        }
        GempoolRealtimeDataHelper.f36783f.set(false);
        return Unit.INSTANCE;
    }
}
