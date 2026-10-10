package com.kubi.futures.trade.welfare.airdrop;

import android.view.View;
import com.kubi.broker.BrokerConfig;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.welfare.AirdropBonusEntity;
import com.kubi.kumex.guide.GuideHelper;
import com.kubi.sdk.BaseFragment;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: AirDropDialogManager.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.welfare.airdrop.AirDropDialogManager$checkNeedAirdrop$2$1$1", m90122f = "AirDropDialogManager.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class AirDropDialogManager$checkNeedAirdrop$2$1$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ FuturesWelfareTrialItemEntity $airdropItem;
    final /* synthetic */ BaseFragment $fragment;
    final /* synthetic */ AirdropBonusEntity $popInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AirDropDialogManager$checkNeedAirdrop$2$1$1(BaseFragment baseFragment, AirdropBonusEntity airdropBonusEntity, FuturesWelfareTrialItemEntity futuresWelfareTrialItemEntity, Continuation<? super AirDropDialogManager$checkNeedAirdrop$2$1$1> continuation) {
        super(2, continuation);
        this.$fragment = baseFragment;
        this.$popInfo = airdropBonusEntity;
        this.$airdropItem = futuresWelfareTrialItemEntity;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AirDropDialogManager$checkNeedAirdrop$2$1$1(this.$fragment, this.$popInfo, this.$airdropItem, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AirDropDialogManager$checkNeedAirdrop$2$1$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!AirDropDialogManager.f24559a.m28348j(this.$fragment) || !BrokerConfig.f19211a.m20201d().mo20229O()) {
                AirDropDialogManager.f24561c = this.$popInfo;
                AirDropDialogManager.f24560b = this.$airdropItem;
            } else {
                View view = this.$fragment.getView();
                if (view != null) {
                    GuideHelper.f29155a.m33889u(view, this.$popInfo, this.$airdropItem);
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
