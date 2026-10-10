package com.kubi.futures.trade.welfare.vm;

import com.kubi.broker.RepositoryServiceLocator;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialEntity;
import com.kubi.kumex.data.platform.model.FuturesWelfareTrialItemEntity;
import com.kubi.kumex.data.welfare.AirdropBonusEntity;
import com.kubi.network.retrofit.exception.ApiException;
import java.util.List;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.Pair;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: FuturesTrialViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.trade.welfare.vm.FuturesTrialViewModel$activeAirdrop$1", m90122f = "FuturesTrialViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class FuturesTrialViewModel$activeAirdrop$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $forceActivate;
    final /* synthetic */ String $trialCode;
    int label;
    final /* synthetic */ FuturesTrialViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FuturesTrialViewModel$activeAirdrop$1(boolean z11, FuturesTrialViewModel futuresTrialViewModel, String str, Continuation<? super FuturesTrialViewModel$activeAirdrop$1> continuation) {
        super(2, continuation);
        this.$forceActivate = z11;
        this.this$0 = futuresTrialViewModel;
        this.$trialCode = str;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new FuturesTrialViewModel$activeAirdrop$1(this.$forceActivate, this.this$0, this.$trialCode, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((FuturesTrialViewModel$activeAirdrop$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        FuturesWelfareTrialEntity futuresWelfareTrialEntityMo100558f;
        List<FuturesWelfareTrialItemEntity> items;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            if (!this.$forceActivate) {
                futuresWelfareTrialEntityMo100558f = RepositoryServiceLocator.f19236a.m20292k().mo100558f("ACTIVATE_FINISHED", 1, 10, "ALL");
            } else {
                futuresWelfareTrialEntityMo100558f = null;
            }
            if (futuresWelfareTrialEntityMo100558f != null && (items = futuresWelfareTrialEntityMo100558f.getItems()) != null && !items.isEmpty()) {
                this.this$0.m28765r().postValue(new Pair<>(futuresWelfareTrialEntityMo100558f.getItems().get(0), null));
            } else {
                try {
                    AirdropBonusEntity airdropBonusEntityMo100566q = RepositoryServiceLocator.f19236a.m20292k().mo100566q(this.$trialCode);
                    this.this$0.m28770w().postValue(Boxing.boxBoolean(false));
                    this.this$0.m28765r().postValue(new Pair<>(null, airdropBonusEntityMo100566q));
                } catch (ApiException unused) {
                    this.this$0.m28770w().postValue(Boxing.boxBoolean(false));
                }
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
