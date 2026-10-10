package com.kubi.operation.lib.api;

import com.kubi.advert.api.IAdvertService;
import com.kubi.advert.api.entity.ConfigProperty;
import com.kubi.advert.api.entity.PageConfigEntity;
import com.kubi.home.api.HomeConst;
import com.kubi.operation.lib.entity.WelfareTaskInfoEntity;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
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
import ro.C44128b;

/* JADX INFO: compiled from: OperationRepo.kt */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.operation.lib.api.OperationRepo$getNewUserWidgetInfo$anies$1", m90122f = "OperationRepo.kt", m90123i = {0}, m90124l = {83}, m90125m = "invokeSuspend", m90126n = {"$this$withContext"}, m90127s = {"L$0"})
public final class OperationRepo$getNewUserWidgetInfo$anies$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super List<? extends Object>>, Object> {
    final /* synthetic */ Long $cacheTime;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ OperationRepo this$0;

    /* JADX INFO: renamed from: com.kubi.operation.lib.api.OperationRepo$getNewUserWidgetInfo$anies$1$1 */
    /* JADX INFO: compiled from: OperationRepo.kt */
    @Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "Lcom/kubi/operation/lib/entity/WelfareTaskInfoEntity;", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.operation.lib.api.OperationRepo$getNewUserWidgetInfo$anies$1$1", m90122f = "OperationRepo.kt", m90123i = {}, m90124l = {71}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C194361 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super WelfareTaskInfoEntity>, Object> {
        final /* synthetic */ Long $cacheTime;
        int label;
        final /* synthetic */ OperationRepo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C194361(OperationRepo operationRepo, Long l11, Continuation<? super C194361> continuation) {
            super(2, continuation);
            this.this$0 = operationRepo;
            this.$cacheTime = l11;
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C194361(this.this$0, this.$cacheTime, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super WelfareTaskInfoEntity> continuation) {
            return ((C194361) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i11 = this.label;
            try {
                if (i11 != 0) {
                    if (i11 == 1) {
                        ResultKt.throwOnFailure(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    ResultKt.throwOnFailure(obj);
                    OperationApi operationApiM43271l = this.this$0.m43271l();
                    Long l11 = this.$cacheTime;
                    this.label = 1;
                    obj = operationApiM43271l.m43294k(l11, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return (WelfareTaskInfoEntity) obj;
            } catch (Exception e11) {
                C44128b.m97263g("OperationRepo", e11);
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.kubi.operation.lib.api.OperationRepo$getNewUserWidgetInfo$anies$1$2 */
    /* JADX INFO: compiled from: OperationRepo.kt */
    @Metadata(m90083d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u0003H\n"}, m90084d2 = {"<anonymous>", "", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
    @DebugMetadata(m90121c = "com.kubi.operation.lib.api.OperationRepo$getNewUserWidgetInfo$anies$1$2", m90122f = "OperationRepo.kt", m90123i = {}, m90124l = {77}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
    public static final class C194372 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Map<String, ? extends String>>, Object> {
        int label;

        public C194372(Continuation<? super C194372> continuation) {
            super(2, continuation);
        }

        @Override // p852kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Map<String, ? extends String>> continuation) {
            return invoke2(interfaceC41709m0, (Continuation<? super Map<String, String>>) continuation);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C194372(continuation);
        }

        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Map<String, String>> continuation) {
            return ((C194372) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List<ConfigProperty> properties;
            ConfigProperty configProperty;
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
                IAdvertService iAdvertService = IAdvertService.f15070a.get();
                long jM28962b = HomeConst.f25513a.m28962b();
                this.label = 1;
                obj = IAdvertService.m14756i(iAdvertService, "rewardCenter", "AppRewardCenterVideo", false, jM28962b, this, 4, null);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            PageConfigEntity pageConfigEntity = (PageConfigEntity) obj;
            if (pageConfigEntity != null && (properties = pageConfigEntity.getProperties()) != null && (configProperty = (ConfigProperty) CollectionsKt.firstOrNull((List) properties)) != null) {
                return configProperty.getBackupValues();
            }
            return null;
        }
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return obj;
        }
        ResultKt.throwOnFailure(obj);
        List listListOf = CollectionsKt.listOf((Object[]) new InterfaceC41729r0[]{C41696j.m91102b(interfaceC41709m0, null, null, new C194361(this.this$0, this.$cacheTime, null), 3, null), C41696j.m91102b(interfaceC41709m0, null, null, new C194372(null), 3, null)});
        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
        this.label = 1;
        Object objM90345a = AwaitKt.m90345a(listListOf, this);
        return objM90345a == coroutine_suspended ? coroutine_suspended : objM90345a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationRepo$getNewUserWidgetInfo$anies$1(OperationRepo operationRepo, Long l11, Continuation<? super OperationRepo$getNewUserWidgetInfo$anies$1> continuation) {
        super(2, continuation);
        this.this$0 = operationRepo;
        this.$cacheTime = l11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        OperationRepo$getNewUserWidgetInfo$anies$1 operationRepo$getNewUserWidgetInfo$anies$1 = new OperationRepo$getNewUserWidgetInfo$anies$1(this.this$0, this.$cacheTime, continuation);
        operationRepo$getNewUserWidgetInfo$anies$1.L$0 = obj;
        return operationRepo$getNewUserWidgetInfo$anies$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super List<? extends Object>> continuation) {
        return ((OperationRepo$getNewUserWidgetInfo$anies$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
