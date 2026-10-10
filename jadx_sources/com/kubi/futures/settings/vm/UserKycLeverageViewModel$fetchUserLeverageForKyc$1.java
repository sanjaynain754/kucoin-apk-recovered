package com.kubi.futures.settings.vm;

import com.kubi.broker.MultiBizFacadeManager;
import com.kubi.futures.model.setting.KycLeverageEntity;
import kotlinx.coroutines.InterfaceC41709m0;
import p852kotlin.Metadata;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;

/* JADX INFO: compiled from: UserKycLeverageViewModel.kt */
/* JADX INFO: loaded from: classes13.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.futures.settings.vm.UserKycLeverageViewModel$fetchUserLeverageForKyc$1", m90122f = "UserKycLeverageViewModel.kt", m90123i = {}, m90124l = {}, m90125m = "invokeSuspend", m90126n = {}, m90127s = {})
public final class UserKycLeverageViewModel$fetchUserLeverageForKyc$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $marginMode;
    final /* synthetic */ String $symbol;
    int label;
    final /* synthetic */ UserKycLeverageViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserKycLeverageViewModel$fetchUserLeverageForKyc$1(String str, String str2, UserKycLeverageViewModel userKycLeverageViewModel, Continuation<? super UserKycLeverageViewModel$fetchUserLeverageForKyc$1> continuation) {
        super(2, continuation);
        this.$symbol = str;
        this.$marginMode = str2;
        this.this$0 = userKycLeverageViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new UserKycLeverageViewModel$fetchUserLeverageForKyc$1(this.$symbol, this.$marginMode, this.this$0, continuation);
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((UserKycLeverageViewModel$fetchUserLeverageForKyc$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label == 0) {
            ResultKt.throwOnFailure(obj);
            KycLeverageEntity kycLeverageEntityMo83157a = MultiBizFacadeManager.f19232a.m20276t().mo83157a(this.$symbol, this.$marginMode);
            if (kycLeverageEntityMo83157a != null) {
                this.this$0.f23508V.postValue(kycLeverageEntityMo83157a);
            }
            return Unit.INSTANCE;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
