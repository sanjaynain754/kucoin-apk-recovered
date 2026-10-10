package com.kubi.mine.lib.p101ui;

import com.kubi.app.bizcontrol.BizControlService;
import com.kubi.clean.api.entity.IPLimitConfig;
import com.kubi.clean.api.entity.NoticeConfig;
import com.kubi.clean.api.service.IAutoCleanService;
import com.kubi.event.api.C12572a;
import com.kubi.mine.api.entity.KycStatusEntity;
import com.kubi.mine.api.entity.KycStyleType;
import com.kubi.mine.lib.entity.NewcomerConfigEntity;
import com.kubi.network.retrofit.utils.RetrofitFlowExKt;
import java.util.List;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41729r0;
import p319hq.InterfaceC38285b;
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

/* JADX INFO: compiled from: MineViewModel.kt */
/* JADX INFO: loaded from: classes29.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.mine.lib.ui.MineViewModel$fetchNewcomerAndKycGuide$2$1", m90122f = "MineViewModel.kt", m90123i = {0, 0, 1, 1, 1, 1, 1, 1, 1}, m90124l = {150, 163}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "api", "$this$launch", "api", "tasks", "kycStatusEntity", "kycGuideEntity", "newcomerConfigEntity", "beforeType"}, m90127s = {"L$0", "L$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6"})
public final class MineViewModel$fetchNewcomerAndKycGuide$2$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ MineViewModel this$0;

    /* JADX WARN: Code duplicated, block: B:48:0x013c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0142  */
    /* JADX WARN: Code duplicated, block: B:51:0x0147  */
    /* JADX WARN: Code duplicated, block: B:57:0x0164  */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        InterfaceC38285b interfaceC38285b;
        Object objM90345a;
        KycStatusEntity kycStatusEntity;
        IPLimitConfig iPLimitConfig;
        NewcomerConfigEntity newcomerConfigEntity;
        KycStatusEntity kycStatusEntity2;
        NewcomerConfigEntity newcomerConfigEntity2;
        NoticeConfig notice;
        String topMessage;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            interfaceC38285b = (InterfaceC38285b) RetrofitFlowExKt.m42820a(InterfaceC38285b.class);
            List listListOf = CollectionsKt.listOf((Object[]) new InterfaceC41729r0[]{C41696j.m91102b(interfaceC41709m0, null, null, new MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$1(interfaceC38285b, null), 3, null), C41696j.m91102b(interfaceC41709m0, null, null, new MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$2(null), 3, null), C41696j.m91102b(interfaceC41709m0, null, null, new MineViewModel$fetchNewcomerAndKycGuide$2$1$tasks$3(interfaceC38285b, null), 3, null)});
            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
            this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC38285b);
            this.label = 1;
            objM90345a = AwaitKt.m90345a(listListOf, this);
            if (objM90345a != coroutine_suspended) {
            }
            return coroutine_suspended;
        }
        if (i11 == 1) {
            InterfaceC38285b interfaceC38285b2 = (InterfaceC38285b) this.L$1;
            ResultKt.throwOnFailure(obj);
            interfaceC38285b = interfaceC38285b2;
            objM90345a = obj;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            newcomerConfigEntity2 = (NewcomerConfigEntity) this.L$5;
            iPLimitConfig = (IPLimitConfig) this.L$4;
            kycStatusEntity2 = (KycStatusEntity) this.L$3;
            ResultKt.throwOnFailure(obj);
        }
        newcomerConfigEntity = newcomerConfigEntity2;
        kycStatusEntity = kycStatusEntity2;
        this.this$0.m42145B().postValue(kycStatusEntity);
        if (iPLimitConfig == null) {
            this.this$0.m42144A().postValue(null);
            this.this$0.m42146C().postValue(newcomerConfigEntity);
        } else {
            notice = iPLimitConfig.getNotice();
            if (notice != null) {
                topMessage = notice.getTopMessage();
            } else {
                topMessage = null;
            }
            if (topMessage != null || topMessage.length() == 0) {
                this.this$0.m42144A().postValue(null);
                this.this$0.m42146C().postValue(newcomerConfigEntity);
            } else {
                this.this$0.m42146C().postValue(null);
                this.this$0.m42144A().postValue(iPLimitConfig);
            }
        }
        return Unit.INSTANCE;
        List list = (List) objM90345a;
        Object obj2 = list.get(0);
        kycStatusEntity = obj2 instanceof KycStatusEntity ? (KycStatusEntity) obj2 : null;
        Object obj3 = list.get(1);
        iPLimitConfig = obj3 instanceof IPLimitConfig ? (IPLimitConfig) obj3 : null;
        Object obj4 = list.get(2);
        newcomerConfigEntity = obj4 instanceof NewcomerConfigEntity ? (NewcomerConfigEntity) obj4 : null;
        KycStatusEntity value = this.this$0.m42145B().getValue();
        String displayType = value != null ? value.getDisplayType() : null;
        if (displayType != null) {
            if (!Intrinsics.areEqual(displayType, kycStatusEntity != null ? kycStatusEntity.getDisplayType() : null)) {
                C12572a.m23695d("com.kubi.home.event.HomeEvent:updateNaviKycStatus", null, 0L, 6, null);
                IAutoCleanService.f19482a.get().mo20401a();
                if (KycStyleType.SUCCESS.equalString(kycStatusEntity != null ? kycStatusEntity.getDisplayType() : null)) {
                    BizControlService bizControlService = BizControlService.f15438a;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC38285b);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(list);
                    this.L$3 = kycStatusEntity;
                    this.L$4 = iPLimitConfig;
                    this.L$5 = newcomerConfigEntity;
                    this.L$6 = SpillingKt.nullOutSpilledVariable(displayType);
                    this.label = 2;
                    if (bizControlService.m14999h(this) != coroutine_suspended) {
                        kycStatusEntity2 = kycStatusEntity;
                        newcomerConfigEntity2 = newcomerConfigEntity;
                        newcomerConfigEntity = newcomerConfigEntity2;
                        kycStatusEntity = kycStatusEntity2;
                    }
                    return coroutine_suspended;
                }
            }
        }
        this.this$0.m42145B().postValue(kycStatusEntity);
        if (iPLimitConfig == null) {
            this.this$0.m42144A().postValue(null);
            this.this$0.m42146C().postValue(newcomerConfigEntity);
        } else {
            notice = iPLimitConfig.getNotice();
            if (notice != null) {
                topMessage = notice.getTopMessage();
            } else {
                topMessage = null;
            }
            if (topMessage != null) {
                this.this$0.m42144A().postValue(null);
                this.this$0.m42146C().postValue(newcomerConfigEntity);
            } else {
                this.this$0.m42144A().postValue(null);
                this.this$0.m42146C().postValue(newcomerConfigEntity);
            }
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MineViewModel$fetchNewcomerAndKycGuide$2$1(MineViewModel mineViewModel, Continuation<? super MineViewModel$fetchNewcomerAndKycGuide$2$1> continuation) {
        super(2, continuation);
        this.this$0 = mineViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MineViewModel$fetchNewcomerAndKycGuide$2$1 mineViewModel$fetchNewcomerAndKycGuide$2$1 = new MineViewModel$fetchNewcomerAndKycGuide$2$1(this.this$0, continuation);
        mineViewModel$fetchNewcomerAndKycGuide$2$1.L$0 = obj;
        return mineViewModel$fetchNewcomerAndKycGuide$2$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((MineViewModel$fetchNewcomerAndKycGuide$2$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }
}
