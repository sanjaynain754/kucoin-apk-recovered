package com.kubi.futures.settings.vm;

import androidx.lifecycle.MutableLiveData;
import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.kumex.data.platform.model.UserMaxLeverageEntity;
import java.math.BigDecimal;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: IsolatedLeverageSettingViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.IsolatedLeverageSettingViewModel$fetchUserRiskLimit$1", m90122f = "IsolatedLeverageSettingViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class IsolatedLeverageSettingViewModel$fetchUserRiskLimit$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ boolean $isTrial;
    final /* synthetic */ BigDecimal $maxLeverage;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ IsolatedLeverageSettingViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IsolatedLeverageSettingViewModel$fetchUserRiskLimit$1(boolean z11, String str, IsolatedLeverageSettingViewModel isolatedLeverageSettingViewModel, BigDecimal bigDecimal, Continuation<? super IsolatedLeverageSettingViewModel$fetchUserRiskLimit$1> continuation) {
        super(2, continuation);
        this.$isTrial = z11;
        this.$symbol = str;
        this.this$0 = isolatedLeverageSettingViewModel;
        this.$maxLeverage = bigDecimal;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new IsolatedLeverageSettingViewModel$fetchUserRiskLimit$1(this.$isTrial, this.$symbol, this.this$0, this.$maxLeverage, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((IsolatedLeverageSettingViewModel$fetchUserRiskLimit$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            UserMaxLeverageEntity userMaxLeverageEntityMo4498L0 = MultiBizFacadeManager.m20260s(MultiBizFacadeManager.f19232a, null, 1, null).mo4498L0(this.$isTrial, this.$symbol);
            MutableLiveData<BigDecimal> mutableLiveDataM26384D = this.this$0.m26384D();
            BigDecimal isolatedMaxLeverage = userMaxLeverageEntityMo4498L0.getIsolatedMaxLeverage();
            if (isolatedMaxLeverage == null) {
                isolatedMaxLeverage = this.$maxLeverage;
            }
            mutableLiveDataM26384D.postValue(isolatedMaxLeverage);
            this.this$0.f23489d0.postValue(userMaxLeverageEntityMo4498L0.getTrialIsolatedMaxLeverageFlag());
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
