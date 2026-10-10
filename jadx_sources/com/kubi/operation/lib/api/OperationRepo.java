package com.kubi.operation.lib.api;

import com.kubi.network.restful.C19321b;
import com.kubi.operation.api.entity.WelfareSignupEntity;
import com.kubi.operation.lib.entity.LearnVideoEntity;
import com.kubi.operation.lib.entity.NewUserStatusInfoEntity;
import com.kubi.operation.lib.entity.WelfareTaskInfoEntity;
import com.kubi.operation.lib.entity.WidgetNewUserEntity;
import com.kubi.operation.lib.realtime.bonus.BonusItemEntity;
import com.kubi.operation.lib.realtime.bonus.BonusRealtimeData;
import com.kubi.operation.lib.realtime.gempool.GemPoolRealtimeData;
import com.kubi.operation.lib.realtime.gempool.GempoolItemEntity;
import com.kubi.operation.lib.realtime.gempool.GempoolMarkedReadReqEntity;
import com.kubi.operation.lib.realtimev2.DynamicCardDeleteEntity;
import com.kubi.operation.lib.realtimev2.DynamicCardDeleteItem;
import com.kubi.operation.lib.realtimev2.DynamicCardEntity;
import com.kubi.operation.lib.realtimev2.DynamicCardItemEntity;
import com.kubi.operation.lib.utils.OperationStoreId;
import com.kubi.user.config.UserInfo;
import er.C37237b;
import gr.C38000b;
import gr.C38006h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AbstractC41697j0;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.flow.C41636g;
import kotlinx.coroutines.flow.InterfaceC41635f;
import mr.C42597a;
import o00.C42911a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p842zs.C46913b;
import p852kotlin.Lazy;
import p852kotlin.LazyKt;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.collections.CollectionsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.jvm.functions.Function0;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.internal.DefaultConstructorMarker;
import p852kotlin.jvm.internal.SourceDebugExtension;
import ro.C44128b;
import y70.C46392a;

/* JADX INFO: compiled from: OperationRepo.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 :2\u00020\u0001:\u0001:B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011J\u001a\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017J\u001a\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0086@¢\u0006\u0002\u0010\u0015J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0086@¢\u0006\u0002\u0010\u001bJ\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0086@¢\u0006\u0002\u0010\u001bJ\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\u0006\u0010 \u001a\u00020!H\u0086@¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\n\u0012\u0004\u0012\u00020%\u0018\u00010$H\u0086@¢\u0006\u0002\u0010\u001bJ\u0018\u0010&\u001a\u0004\u0018\u00010'2\u0006\u0010(\u001a\u00020)H\u0086@¢\u0006\u0002\u0010*J\"\u0010+\u001a\u00020,2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020,0.H\u0086@¢\u0006\u0002\u0010/J\u0016\u00100\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010$H\u0086@¢\u0006\u0002\u0010\u001bJ\"\u00102\u001a\u00020,2\u0012\u0010-\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020,0.H\u0086@¢\u0006\u0002\u0010/J\u0010\u00103\u001a\u0004\u0018\u000104H\u0086@¢\u0006\u0002\u0010\u001bJ(\u00105\u001a\u00020,2\f\u00106\u001a\b\u0012\u0004\u0012\u0002070$2\n\b\u0002\u00108\u001a\u0004\u0018\u00010!H\u0086@¢\u0006\u0002\u00109R#\u0010\u0004\u001a\n \u0006*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\n\u001a\u0004\b\r\u0010\u000e¨\u0006;"}, m90084d2 = {"Lcom/kubi/operation/lib/api/OperationRepo;", "", "<init>", "()V", "api", "Lcom/kubi/operation/lib/api/OperationApi;", "kotlin.jvm.PlatformType", "getApi", "()Lcom/kubi/operation/lib/api/OperationApi;", "api$delegate", "Lkotlin/Lazy;", "wsApi", "Lcom/kubi/operation/lib/api/OperationWsApi;", "getWsApi", "()Lcom/kubi/operation/lib/api/OperationWsApi;", "wsApi$delegate", "cachedNewUserWidgetInfo", "Lcom/kubi/operation/lib/entity/WidgetNewUserEntity;", "getNewUserWidgetInfo", "cacheTime", "", "(Ljava/lang/Long;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cachedLearnWidgetInfo", "Lcom/kubi/operation/lib/entity/LearnVideoEntity;", "getLearnWidgetInfo", "getUserStatusWidgetInfo", "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fetchNewUserStatusWidgetInfo", "Lcom/kubi/operation/lib/entity/NewUserStatusInfoEntity;", "requestWelfareApplyJoinTask", "Lcom/kubi/operation/api/entity/WelfareSignupEntity;", "taskId", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRealtimeGempool", "", "Lcom/kubi/operation/lib/realtime/gempool/GemPoolRealtimeData;", "gempoolViewed", "", "req", "Lcom/kubi/operation/lib/realtime/gempool/GempoolMarkedReadReqEntity;", "(Lcom/kubi/operation/lib/realtime/gempool/GempoolMarkedReadReqEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "subscribeGemPoolPush", "", "onData", "Lkotlin/Function1;", "(Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getRealtimeBonus", "Lcom/kubi/operation/lib/realtime/bonus/BonusRealtimeData;", "subscribeBonusPush", "fetchCommonRealtimeData", "Lcom/kubi/operation/lib/realtimev2/DynamicCardEntity;", "deleteDynamicCard", "dataList", "Lcom/kubi/operation/lib/realtimev2/DynamicCardItemEntity;", "deleteType", "(Ljava/util/List;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
@SourceDebugExtension({"SMAP\nOperationRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperationRepo.kt\ncom/kubi/operation/lib/api/OperationRepo\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 3 KVStore.kt\ncom/kubi/utils/storage/KVStore\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 7 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n*L\n1#1,225:1\n153#2,2:226\n144#2,2:230\n153#2,2:232\n144#2,2:235\n15#2:237\n178#3:228\n178#3:234\n1#4:229\n774#5:238\n865#5,2:239\n1563#5:241\n1634#5,3:242\n774#5:245\n865#5,2:246\n1563#5:248\n1634#5,3:249\n1491#5:252\n1516#5,3:253\n1519#5,3:263\n1563#5:269\n1634#5,3:270\n774#5:273\n865#5,2:274\n382#6,7:256\n126#7:266\n153#7,2:267\n155#7:276\n*S KotlinDebug\n*F\n+ 1 OperationRepo.kt\ncom/kubi/operation/lib/api/OperationRepo\n*L\n61#1:226,2\n92#1:230,2\n99#1:232,2\n110#1:235,2\n113#1:237\n61#1:228\n99#1:234\n154#1:238\n154#1:239,2\n154#1:241\n154#1:242,3\n178#1:245\n178#1:246,2\n180#1:248\n180#1:249,3\n212#1:252\n212#1:253,3\n212#1:263,3\n216#1:269\n216#1:270,3\n216#1:273\n216#1:274,2\n212#1:256,7\n213#1:266\n213#1:267,2\n213#1:276\n*E\n"})
public final class OperationRepo {

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final Companion f36667c = new Companion(null);

    /* JADX INFO: renamed from: a */
    @NotNull
    public final Lazy f36668a = LazyKt.lazy(new Function0() { // from class: com.kubi.operation.lib.api.c
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OperationRepo.m43262d();
        }
    });

    /* JADX INFO: renamed from: b */
    @NotNull
    public final Lazy f36669b = LazyKt.lazy(new Function0() { // from class: com.kubi.operation.lib.api.d
        @Override // p852kotlin.jvm.functions.Function0
        public final Object invoke() {
            return OperationRepo.m43264v();
        }
    });

    /* JADX INFO: compiled from: OperationRepo.kt */
    @Metadata(m90083d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m90084d2 = {"Lcom/kubi/operation/lib/api/OperationRepo$Companion;", "", "<init>", "()V", "TAG", "", "OperationLib_googleRelease"}, m90085k = 1, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.kubi.operation.lib.api.OperationRepo$a */
    /* JADX INFO: compiled from: OperationRepo.kt */
    /* JADX INFO: loaded from: classes32.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    public static final class C19434a<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1<BonusRealtimeData, Unit> f36670b;

        /* JADX WARN: Multi-variable type inference failed */
        public C19434a(Function1<? super BonusRealtimeData, Unit> function1) {
            this.f36670b = function1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(BonusItemEntity bonusItemEntity, Continuation<? super Unit> continuation) {
            if (bonusItemEntity != null) {
                Function1<BonusRealtimeData, Unit> function1 = this.f36670b;
                BonusRealtimeData bonusRealtimeData = new BonusRealtimeData(bonusItemEntity);
                if (!C46913b.f104783a.m103331b().mo30034d(bonusRealtimeData)) {
                    function1.invoke(bonusRealtimeData);
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: com.kubi.operation.lib.api.OperationRepo$b */
    /* JADX INFO: compiled from: OperationRepo.kt */
    /* JADX INFO: loaded from: classes32.dex */
    @Metadata(m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @SourceDebugExtension({"SMAP\nOperationRepo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OperationRepo.kt\ncom/kubi/operation/lib/api/OperationRepo$subscribeGemPoolPush$3\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,225:1\n1#2:226\n*E\n"})
    public static final class C19435b<T> implements InterfaceC41635f {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ Function1<GemPoolRealtimeData, Unit> f36671b;

        /* JADX WARN: Multi-variable type inference failed */
        public C19435b(Function1<? super GemPoolRealtimeData, Unit> function1) {
            this.f36671b = function1;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC41635f
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object emit(GempoolItemEntity gempoolItemEntity, Continuation<? super Unit> continuation) {
            if (gempoolItemEntity != null) {
                this.f36671b.invoke(new GemPoolRealtimeData(gempoolItemEntity));
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m43263h(OperationRepo operationRepo, List list, String str, Continuation continuation, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            str = null;
        }
        return operationRepo.m43267g(list, str, continuation);
    }

    /* JADX INFO: renamed from: v */
    public static final OperationWsApi m43264v() {
        return (OperationWsApi) new C19321b.a().m42777b(new C38000b(C37237b.m83278a())).m42778c(new C38006h()).m42776a().m42772b(OperationWsApi.class);
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final LearnVideoEntity m43265e() {
        LearnVideoEntity learnVideoEntity = (LearnVideoEntity) C46392a.f104043a.m102336j(OperationStoreId.f36892a.m43680a(), LearnVideoEntity.class, null);
        if (learnVideoEntity == null || !learnVideoEntity.isUsefulData()) {
            return null;
        }
        return learnVideoEntity;
    }

    @Nullable
    /* JADX INFO: renamed from: f */
    public final WidgetNewUserEntity m43266f() {
        return (WidgetNewUserEntity) C46392a.f104043a.m102336j(OperationStoreId.f36892a.m43681b(), WidgetNewUserEntity.class, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: g */
    public final Object m43267g(@NotNull List<DynamicCardItemEntity> list, @Nullable String str, @NotNull Continuation<? super Unit> continuation) {
        OperationRepo$deleteDynamicCard$1 operationRepo$deleteDynamicCard$1;
        if (continuation instanceof OperationRepo$deleteDynamicCard$1) {
            operationRepo$deleteDynamicCard$1 = (OperationRepo$deleteDynamicCard$1) continuation;
            int i11 = operationRepo$deleteDynamicCard$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                operationRepo$deleteDynamicCard$1.label = i11 - Integer.MIN_VALUE;
            } else {
                operationRepo$deleteDynamicCard$1 = new OperationRepo$deleteDynamicCard$1(this, continuation);
            }
        } else {
            operationRepo$deleteDynamicCard$1 = new OperationRepo$deleteDynamicCard$1(this, continuation);
        }
        Object obj = operationRepo$deleteDynamicCard$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = operationRepo$deleteDynamicCard$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Object obj2 : list) {
                    String bizType = ((DynamicCardItemEntity) obj2).getBizType();
                    Object arrayList = linkedHashMap.get(bizType);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(bizType, arrayList);
                    }
                    ((List) arrayList).add(obj2);
                }
                ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str2 = (String) entry.getKey();
                    List list2 = (List) entry.getValue();
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
                    Iterator it = list2.iterator();
                    while (it.hasNext()) {
                        String bizId = ((DynamicCardItemEntity) it.next()).getBizId();
                        if (bizId == null) {
                            bizId = "";
                        }
                        arrayList3.add(bizId);
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Object obj3 : arrayList3) {
                        if (((String) obj3).length() > 0) {
                            arrayList4.add(obj3);
                        }
                    }
                    arrayList2.add(new DynamicCardDeleteItem(str2, arrayList4, str));
                }
                OperationApi operationApiM43271l = m43271l();
                DynamicCardDeleteEntity dynamicCardDeleteEntity = new DynamicCardDeleteEntity(arrayList2);
                operationRepo$deleteDynamicCard$1.L$0 = SpillingKt.nullOutSpilledVariable(list);
                operationRepo$deleteDynamicCard$1.L$1 = SpillingKt.nullOutSpilledVariable(str);
                operationRepo$deleteDynamicCard$1.L$2 = SpillingKt.nullOutSpilledVariable(arrayList2);
                operationRepo$deleteDynamicCard$1.label = 1;
                if (operationApiM43271l.m43291h(dynamicCardDeleteEntity, operationRepo$deleteDynamicCard$1) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
        } catch (Exception e11) {
            C44128b.m97263g("OperationRepo", e11);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: i */
    public final Object m43268i(@NotNull Continuation<? super DynamicCardEntity> continuation) {
        OperationRepo$fetchCommonRealtimeData$1 operationRepo$fetchCommonRealtimeData$1;
        if (continuation instanceof OperationRepo$fetchCommonRealtimeData$1) {
            operationRepo$fetchCommonRealtimeData$1 = (OperationRepo$fetchCommonRealtimeData$1) continuation;
            int i11 = operationRepo$fetchCommonRealtimeData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                operationRepo$fetchCommonRealtimeData$1.label = i11 - Integer.MIN_VALUE;
            } else {
                operationRepo$fetchCommonRealtimeData$1 = new OperationRepo$fetchCommonRealtimeData$1(this, continuation);
            }
        } else {
            operationRepo$fetchCommonRealtimeData$1 = new OperationRepo$fetchCommonRealtimeData$1(this, continuation);
        }
        Object objM43295l = operationRepo$fetchCommonRealtimeData$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = operationRepo$fetchCommonRealtimeData$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM43295l);
                OperationApi operationApiM43271l = m43271l();
                operationRepo$fetchCommonRealtimeData$1.label = 1;
                objM43295l = operationApiM43271l.m43295l(operationRepo$fetchCommonRealtimeData$1);
                if (objM43295l == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM43295l);
            }
            return (DynamicCardEntity) objM43295l;
        } catch (Exception e11) {
            C44128b.m97263g("OperationRepo", e11);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: j */
    public final Object m43269j(@NotNull Continuation<? super NewUserStatusInfoEntity> continuation) {
        OperationRepo$fetchNewUserStatusWidgetInfo$1 operationRepo$fetchNewUserStatusWidgetInfo$1;
        if (continuation instanceof OperationRepo$fetchNewUserStatusWidgetInfo$1) {
            operationRepo$fetchNewUserStatusWidgetInfo$1 = (OperationRepo$fetchNewUserStatusWidgetInfo$1) continuation;
            int i11 = operationRepo$fetchNewUserStatusWidgetInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                operationRepo$fetchNewUserStatusWidgetInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                operationRepo$fetchNewUserStatusWidgetInfo$1 = new OperationRepo$fetchNewUserStatusWidgetInfo$1(this, continuation);
            }
        } else {
            operationRepo$fetchNewUserStatusWidgetInfo$1 = new OperationRepo$fetchNewUserStatusWidgetInfo$1(this, continuation);
        }
        Object objM43284a = operationRepo$fetchNewUserStatusWidgetInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = operationRepo$fetchNewUserStatusWidgetInfo$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM43284a);
                OperationApi operationApiM43271l = m43271l();
                operationRepo$fetchNewUserStatusWidgetInfo$1.label = 1;
                objM43284a = operationApiM43271l.m43284a(operationRepo$fetchNewUserStatusWidgetInfo$1);
                if (objM43284a == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM43284a);
            }
            return (NewUserStatusInfoEntity) objM43284a;
        } catch (Exception e11) {
            C44128b.m97263g("OperationRepo", e11);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: k */
    public final Object m43270k(@NotNull GempoolMarkedReadReqEntity gempoolMarkedReadReqEntity, @NotNull Continuation<? super Boolean> continuation) {
        OperationRepo$gempoolViewed$1 operationRepo$gempoolViewed$1;
        if (continuation instanceof OperationRepo$gempoolViewed$1) {
            operationRepo$gempoolViewed$1 = (OperationRepo$gempoolViewed$1) continuation;
            int i11 = operationRepo$gempoolViewed$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                operationRepo$gempoolViewed$1.label = i11 - Integer.MIN_VALUE;
            } else {
                operationRepo$gempoolViewed$1 = new OperationRepo$gempoolViewed$1(this, continuation);
            }
        } else {
            operationRepo$gempoolViewed$1 = new OperationRepo$gempoolViewed$1(this, continuation);
        }
        Object objM43289f = operationRepo$gempoolViewed$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = operationRepo$gempoolViewed$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM43289f);
                OperationApi operationApiM43271l = m43271l();
                operationRepo$gempoolViewed$1.L$0 = SpillingKt.nullOutSpilledVariable(gempoolMarkedReadReqEntity);
                operationRepo$gempoolViewed$1.label = 1;
                objM43289f = operationApiM43271l.m43289f(gempoolMarkedReadReqEntity, operationRepo$gempoolViewed$1);
                if (objM43289f == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM43289f);
            }
            return (Boolean) objM43289f;
        } catch (Exception e11) {
            C44128b.m97263g("OperationRepo", e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public final OperationApi m43271l() {
        return (OperationApi) this.f36668a.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: m */
    public final Object m43272m(@Nullable Long l11, @NotNull Continuation<? super LearnVideoEntity> continuation) {
        OperationRepo$getLearnWidgetInfo$1 operationRepo$getLearnWidgetInfo$1;
        if (continuation instanceof OperationRepo$getLearnWidgetInfo$1) {
            operationRepo$getLearnWidgetInfo$1 = (OperationRepo$getLearnWidgetInfo$1) continuation;
            int i11 = operationRepo$getLearnWidgetInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                operationRepo$getLearnWidgetInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                operationRepo$getLearnWidgetInfo$1 = new OperationRepo$getLearnWidgetInfo$1(this, continuation);
            }
        } else {
            operationRepo$getLearnWidgetInfo$1 = new OperationRepo$getLearnWidgetInfo$1(this, continuation);
        }
        Object objM43293j = operationRepo$getLearnWidgetInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = operationRepo$getLearnWidgetInfo$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM43293j);
                OperationApi operationApiM43271l = m43271l();
                operationRepo$getLearnWidgetInfo$1.L$0 = SpillingKt.nullOutSpilledVariable(l11);
                operationRepo$getLearnWidgetInfo$1.label = 1;
                objM43293j = operationApiM43271l.m43293j(l11, operationRepo$getLearnWidgetInfo$1);
                if (objM43293j == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM43293j);
            }
            LearnVideoEntity learnVideoEntity = (LearnVideoEntity) objM43293j;
            if (learnVideoEntity.isUsefulData()) {
                C46392a.m102331n(OperationStoreId.f36892a.m43680a(), learnVideoEntity);
                return learnVideoEntity;
            }
            C46392a.m102335r(OperationStoreId.f36892a.m43680a());
            return null;
        } catch (Exception e11) {
            C44128b.m97263g("OperationRepo", e11);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: n */
    public final Object m43273n(@Nullable Long l11, @NotNull Continuation<? super WidgetNewUserEntity> continuation) {
        OperationRepo$getNewUserWidgetInfo$1 operationRepo$getNewUserWidgetInfo$1;
        if (continuation instanceof OperationRepo$getNewUserWidgetInfo$1) {
            operationRepo$getNewUserWidgetInfo$1 = (OperationRepo$getNewUserWidgetInfo$1) continuation;
            int i11 = operationRepo$getNewUserWidgetInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                operationRepo$getNewUserWidgetInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                operationRepo$getNewUserWidgetInfo$1 = new OperationRepo$getNewUserWidgetInfo$1(this, continuation);
            }
        } else {
            operationRepo$getNewUserWidgetInfo$1 = new OperationRepo$getNewUserWidgetInfo$1(this, continuation);
        }
        Object objM91049g = operationRepo$getNewUserWidgetInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = operationRepo$getNewUserWidgetInfo$1.label;
        if (i12 == 0) {
            ResultKt.throwOnFailure(objM91049g);
            AbstractC41697j0 abstractC41697j0M94120b = C42911a.m94120b();
            OperationRepo$getNewUserWidgetInfo$anies$1 operationRepo$getNewUserWidgetInfo$anies$1 = new OperationRepo$getNewUserWidgetInfo$anies$1(this, l11, null);
            operationRepo$getNewUserWidgetInfo$1.L$0 = SpillingKt.nullOutSpilledVariable(l11);
            operationRepo$getNewUserWidgetInfo$1.label = 1;
            objM91049g = C41686h.m91049g(abstractC41697j0M94120b, operationRepo$getNewUserWidgetInfo$anies$1, operationRepo$getNewUserWidgetInfo$1);
            if (objM91049g == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(objM91049g);
        }
        List list = (List) objM91049g;
        Object obj = list.get(0);
        WelfareTaskInfoEntity welfareTaskInfoEntity = obj instanceof WelfareTaskInfoEntity ? (WelfareTaskInfoEntity) obj : null;
        Object obj2 = list.get(1);
        Map map = obj2 instanceof Map ? (Map) obj2 : null;
        if (welfareTaskInfoEntity == null) {
            return null;
        }
        WidgetNewUserEntity widgetNewUserEntity = new WidgetNewUserEntity(welfareTaskInfoEntity, map != null ? (String) map.get("dayVideoUrl") : null, map != null ? (String) map.get("darkVideoUrl") : null);
        C46392a.m102331n(OperationStoreId.f36892a.m43681b(), widgetNewUserEntity);
        return widgetNewUserEntity;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: o */
    public final Object m43274o(@NotNull Continuation<? super List<BonusRealtimeData>> continuation) {
        OperationRepo$getRealtimeBonus$1 operationRepo$getRealtimeBonus$1;
        if (continuation instanceof OperationRepo$getRealtimeBonus$1) {
            operationRepo$getRealtimeBonus$1 = (OperationRepo$getRealtimeBonus$1) continuation;
            int i11 = operationRepo$getRealtimeBonus$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                operationRepo$getRealtimeBonus$1.label = i11 - Integer.MIN_VALUE;
            } else {
                operationRepo$getRealtimeBonus$1 = new OperationRepo$getRealtimeBonus$1(this, continuation);
            }
        } else {
            operationRepo$getRealtimeBonus$1 = new OperationRepo$getRealtimeBonus$1(this, continuation);
        }
        Object objM43287d = operationRepo$getRealtimeBonus$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = operationRepo$getRealtimeBonus$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM43287d);
                OperationApi operationApiM43271l = m43271l();
                operationRepo$getRealtimeBonus$1.label = 1;
                objM43287d = operationApiM43271l.m43287d(operationRepo$getRealtimeBonus$1);
                if (objM43287d == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM43287d);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) objM43287d) {
                BonusItemEntity bonusItemEntity = (BonusItemEntity) obj;
                if (bonusItemEntity.isCanShow() && !C46913b.f104783a.m103331b().mo30034d(new BonusRealtimeData(bonusItemEntity))) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new BonusRealtimeData((BonusItemEntity) it.next()));
            }
            return arrayList2;
        } catch (Exception e11) {
            C44128b.m97263g("OperationRepo", e11);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: p */
    public final Object m43275p(@NotNull Continuation<? super List<GemPoolRealtimeData>> continuation) {
        OperationRepo$getRealtimeGempool$1 operationRepo$getRealtimeGempool$1;
        if (continuation instanceof OperationRepo$getRealtimeGempool$1) {
            operationRepo$getRealtimeGempool$1 = (OperationRepo$getRealtimeGempool$1) continuation;
            int i11 = operationRepo$getRealtimeGempool$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                operationRepo$getRealtimeGempool$1.label = i11 - Integer.MIN_VALUE;
            } else {
                operationRepo$getRealtimeGempool$1 = new OperationRepo$getRealtimeGempool$1(this, continuation);
            }
        } else {
            operationRepo$getRealtimeGempool$1 = new OperationRepo$getRealtimeGempool$1(this, continuation);
        }
        Object objM43292i = operationRepo$getRealtimeGempool$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = operationRepo$getRealtimeGempool$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM43292i);
                OperationApi operationApiM43271l = m43271l();
                operationRepo$getRealtimeGempool$1.label = 1;
                objM43292i = operationApiM43271l.m43292i(operationRepo$getRealtimeGempool$1);
                if (objM43292i == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM43292i);
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : (Iterable) objM43292i) {
                if (((GempoolItemEntity) obj).isCanShow()) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new GemPoolRealtimeData((GempoolItemEntity) it.next()));
            }
            return arrayList2;
        } catch (Exception e11) {
            C44128b.m97263g("OperationRepo", e11);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: q */
    public final Object m43276q(@NotNull Continuation<? super WelfareTaskInfoEntity> continuation) {
        OperationRepo$getUserStatusWidgetInfo$1 operationRepo$getUserStatusWidgetInfo$1;
        if (continuation instanceof OperationRepo$getUserStatusWidgetInfo$1) {
            operationRepo$getUserStatusWidgetInfo$1 = (OperationRepo$getUserStatusWidgetInfo$1) continuation;
            int i11 = operationRepo$getUserStatusWidgetInfo$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                operationRepo$getUserStatusWidgetInfo$1.label = i11 - Integer.MIN_VALUE;
            } else {
                operationRepo$getUserStatusWidgetInfo$1 = new OperationRepo$getUserStatusWidgetInfo$1(this, continuation);
            }
        } else {
            operationRepo$getUserStatusWidgetInfo$1 = new OperationRepo$getUserStatusWidgetInfo$1(this, continuation);
        }
        Object objM43296m = operationRepo$getUserStatusWidgetInfo$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = operationRepo$getUserStatusWidgetInfo$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM43296m);
                OperationApi operationApiM43271l = m43271l();
                String strI = UserInfo.a.i();
                if (strI.length() == 0) {
                    strI = null;
                }
                operationRepo$getUserStatusWidgetInfo$1.label = 1;
                objM43296m = operationApiM43271l.m43296m(strI, operationRepo$getUserStatusWidgetInfo$1);
                if (objM43296m == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM43296m);
            }
            return (WelfareTaskInfoEntity) objM43296m;
        } catch (Exception e11) {
            C44128b.m97263g("OperationRepo", e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: r */
    public final OperationWsApi m43277r() {
        return (OperationWsApi) this.f36669b.getValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Nullable
    /* JADX INFO: renamed from: s */
    public final Object m43278s(@NotNull String str, @NotNull Continuation<? super WelfareSignupEntity> continuation) {
        OperationRepo$requestWelfareApplyJoinTask$1 operationRepo$requestWelfareApplyJoinTask$1;
        if (continuation instanceof OperationRepo$requestWelfareApplyJoinTask$1) {
            operationRepo$requestWelfareApplyJoinTask$1 = (OperationRepo$requestWelfareApplyJoinTask$1) continuation;
            int i11 = operationRepo$requestWelfareApplyJoinTask$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                operationRepo$requestWelfareApplyJoinTask$1.label = i11 - Integer.MIN_VALUE;
            } else {
                operationRepo$requestWelfareApplyJoinTask$1 = new OperationRepo$requestWelfareApplyJoinTask$1(this, continuation);
            }
        } else {
            operationRepo$requestWelfareApplyJoinTask$1 = new OperationRepo$requestWelfareApplyJoinTask$1(this, continuation);
        }
        Object objM43288e = operationRepo$requestWelfareApplyJoinTask$1.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = operationRepo$requestWelfareApplyJoinTask$1.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(objM43288e);
                OperationApi operationApiM43271l = m43271l();
                operationRepo$requestWelfareApplyJoinTask$1.L$0 = SpillingKt.nullOutSpilledVariable(str);
                operationRepo$requestWelfareApplyJoinTask$1.label = 1;
                objM43288e = operationApiM43271l.m43288e(str, operationRepo$requestWelfareApplyJoinTask$1);
                if (objM43288e == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objM43288e);
            }
            return (WelfareSignupEntity) objM43288e;
        } catch (Exception e11) {
            C44128b.m97263g("OperationRepo", e11);
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public static final OperationApi m43262d() {
        return (OperationApi) C42597a.m93388d().create(OperationApi.class);
    }

    @Nullable
    /* JADX INFO: renamed from: t */
    public final Object m43279t(@NotNull Function1<? super BonusRealtimeData, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objCollect = C41636g.m90917h(m43277r().m43300b("/welfare/process"), new OperationRepo$subscribeBonusPush$2(null)).collect(new C19434a(function1), continuation);
        if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objCollect;
        }
        return Unit.INSTANCE;
    }

    @Nullable
    /* JADX INFO: renamed from: u */
    public final Object m43280u(@NotNull Function1<? super GemPoolRealtimeData, Unit> function1, @NotNull Continuation<? super Unit> continuation) {
        Object objCollect = C41636g.m90917h(m43277r().m43299a("/gemPool/realTimeCard"), new OperationRepo$subscribeGemPoolPush$2(null)).collect(new C19435b(function1), continuation);
        if (objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            return objCollect;
        }
        return Unit.INSTANCE;
    }
}
