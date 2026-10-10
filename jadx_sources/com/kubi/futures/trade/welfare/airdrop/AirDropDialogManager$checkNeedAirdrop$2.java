package com.kubi.futures.trade.welfare.airdrop;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.welfare.AirdropBonusEntity;
import com.kubi.sdk.BaseFragment;
import com.kubi.utils.C27092t0;
import com.kubi.utils.extensions.C27041f;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.AbstractC41586e2;
import kotlinx.coroutines.C41686h;
import kotlinx.coroutines.C41782z0;
import kotlinx.coroutines.InterfaceC41709m0;
import p836zl.C46894j;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.jvm.internal.SourceDebugExtension;
import y70.C46392a;

/* JADX INFO: compiled from: AirDropDialogManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.welfare.airdrop.AirDropDialogManager$checkNeedAirdrop$2", m90122f = "AirDropDialogManager.kt", m90123i = {0, 0, 0, 0, 0, 0, 0}, m90124l = {143}, m90125m = "invokeSuspend", m90126n = {"status", "allTrialEntity", FirebaseAnalytics.Param.ITEMS, "airdropItem", "popInfo", "activeItem", "$i$a$-let-AirDropDialogManager$checkNeedAirdrop$2$1"}, m90127s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "I$0"})
@SourceDebugExtension({"SMAP\nAirDropDialogManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AirDropDialogManager.kt\ncom/kubi/futures/trade/welfare/airdrop/AirDropDialogManager$checkNeedAirdrop$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,176:1\n295#2,2:177\n295#2:179\n296#2:181\n67#3:180\n*S KotlinDebug\n*F\n+ 1 AirDropDialogManager.kt\ncom/kubi/futures/trade/welfare/airdrop/AirDropDialogManager$checkNeedAirdrop$2\n*L\n126#1:177,2\n131#1:179\n131#1:181\n136#1:180\n*E\n"})
public final class AirDropDialogManager$checkNeedAirdrop$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ BaseFragment $fragment;
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AirDropDialogManager$checkNeedAirdrop$2(BaseFragment baseFragment, Continuation<? super AirDropDialogManager$checkNeedAirdrop$2> continuation) {
        super(2, continuation);
        this.$fragment = baseFragment;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AirDropDialogManager$checkNeedAirdrop$2(this.$fragment, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AirDropDialogManager$checkNeedAirdrop$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        List<FuturesWelfareTrialItemEntity> items;
        Object next;
        Object next2;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        if (i11 == 0) {
            ResultKt.throwOnFailure(obj);
            String str = "ACTIVATE_FINISHED,SEND_FINISHED";
            Intrinsics.checkNotNullExpressionValue(str, "toString(...)");
            FuturesWelfareTrialEntity futuresWelfareTrialEntityMo100558f = RepositoryServiceLocator.f19236a.m20292k().mo100558f(str, 1, 100, "ALL");
            if (futuresWelfareTrialEntityMo100558f != null && (items = futuresWelfareTrialEntityMo100558f.getItems()) != null) {
                BaseFragment baseFragment = this.$fragment;
                Iterator<T> it = items.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!Intrinsics.areEqual(((FuturesWelfareTrialItemEntity) next).getStatus(), "ACTIVATE_FINISHED"));
                FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity = (FuturesWelfareTrialItemEntity) next;
                if (futuresWelfareTrialItemEntity != null) {
                    return Unit.INSTANCE;
                }
                Iterator<T> it2 = items.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity2 = (FuturesWelfareTrialItemEntity) next2;
                    boolean zM66897b = C27092t0.m66897b(futuresWelfareTrialItemEntity2.getPrizeType());
                    boolean zAreEqual = Intrinsics.areEqual(futuresWelfareTrialItemEntity2.getStatus(), "SEND_FINISHED");
                    int iM102323e = C46392a.m102323e(C46894j.f104736a.m103265e(C27041f.m66668h(futuresWelfareTrialItemEntity2.getCode())), 0);
                    if (zM66897b && zAreEqual && iM102323e < 2) {
                        break;
                    }
                }
                FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity3 = (FuturesWelfareTrialItemEntity) next2;
                if (futuresWelfareTrialItemEntity3 != null) {
                    AirdropBonusEntity airdropBonusEntityMo100566q = RepositoryServiceLocator.f19236a.m20292k().mo100566q(C27041f.m66668h(futuresWelfareTrialItemEntity3.getCode()));
                    AbstractC41586e2 abstractC41586e2M91393c = C41782z0.m91393c();
                    AirDropDialogManager$checkNeedAirdrop$2$1$1 airDropDialogManager$checkNeedAirdrop$2$1$1 = new AirDropDialogManager$checkNeedAirdrop$2$1$1(baseFragment, airdropBonusEntityMo100566q, futuresWelfareTrialItemEntity3, null);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(str);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(futuresWelfareTrialEntityMo100558f);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(items);
                    this.L$3 = SpillingKt.nullOutSpilledVariable(futuresWelfareTrialItemEntity3);
                    this.L$4 = SpillingKt.nullOutSpilledVariable(airdropBonusEntityMo100566q);
                    this.L$5 = SpillingKt.nullOutSpilledVariable(futuresWelfareTrialItemEntity);
                    this.I$0 = 0;
                    this.label = 1;
                    if (C41686h.m91049g(abstractC41586e2M91393c, airDropDialogManager$checkNeedAirdrop$2$1$1, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
