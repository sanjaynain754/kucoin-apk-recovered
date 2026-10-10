package com.kubi.assets.autoearn;

import androidx.lifecycle.ViewModelKt;
import com.kubi.assets.autoearn.data.AutoEarnStateResp;
import kotlinx.coroutines.C41696j;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.InterfaceC41775x1;
import o00.C42911a;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.Unit;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function1;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import ro.C44128b;

/* JADX INFO: compiled from: AutoEarnViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.autoearn.AutoEarnViewModel$getAutoEarnState$1", m90122f = "AutoEarnViewModel.kt", m90123i = {0, 0, 0}, m90124l = {37}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-AutoEarnViewModel$getAutoEarnState$1$1"}, m90127s = {"L$0", "L$6", "I$0"})
public final class AutoEarnViewModel$getAutoEarnState$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currency;
    final /* synthetic */ Function1<String, Unit> $onError;
    final /* synthetic */ Function1<Boolean, Unit> $onResult;
    final /* synthetic */ Function1<String, Unit> $onUnavailable;
    final /* synthetic */ Function1<String, Unit> $partOPen;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ AutoEarnViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AutoEarnViewModel$getAutoEarnState$1(AutoEarnViewModel autoEarnViewModel, String str, Function1<? super Boolean, Unit> function1, Function1<? super String, Unit> function2, Function1<? super String, Unit> function3, Function1<? super String, Unit> function4, Continuation<? super AutoEarnViewModel$getAutoEarnState$1> continuation) {
        super(2, continuation);
        this.this$0 = autoEarnViewModel;
        this.$currency = str;
        this.$onResult = function1;
        this.$partOPen = function2;
        this.$onUnavailable = function3;
        this.$onError = function4;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AutoEarnViewModel$getAutoEarnState$1 autoEarnViewModel$getAutoEarnState$1 = new AutoEarnViewModel$getAutoEarnState$1(this.this$0, this.$currency, this.$onResult, this.$partOPen, this.$onUnavailable, this.$onError, continuation);
        autoEarnViewModel$getAutoEarnState$1.L$0 = obj;
        return autoEarnViewModel$getAutoEarnState$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AutoEarnViewModel$getAutoEarnState$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        AutoEarnViewModel autoEarnViewModel;
        Function1<Boolean, Unit> function1;
        Function1<String, Unit> function2;
        Function1<String, Unit> function3;
        Function1<String, Unit> function4;
        InterfaceC41775x1 interfaceC41775x1M91104d;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                autoEarnViewModel = this.this$0;
                String str = this.$currency;
                Function1<Boolean, Unit> function5 = this.$onResult;
                Function1<String, Unit> function6 = this.$partOPen;
                Function1<String, Unit> function7 = this.$onUnavailable;
                Function1<String, Unit> function8 = this.$onError;
                Result.Companion companion = Result.INSTANCE;
                AutoEarnApi autoEarnApi = autoEarnViewModel.f16573X;
                if (str == null) {
                    str = "";
                }
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$1 = autoEarnViewModel;
                this.L$2 = function5;
                this.L$3 = function6;
                this.L$4 = function7;
                this.L$5 = function8;
                this.L$6 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.I$0 = 0;
                this.label = 1;
                obj = autoEarnApi.m15433a(str, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                function1 = function5;
                function2 = function6;
                function3 = function7;
                function4 = function8;
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function4 = (Function1) this.L$5;
                function3 = (Function1) this.L$4;
                function2 = (Function1) this.L$3;
                function1 = (Function1) this.L$2;
                autoEarnViewModel = (AutoEarnViewModel) this.L$1;
                ResultKt.throwOnFailure(obj);
            }
            AutoEarnStateResp autoEarnStateResp = (AutoEarnStateResp) obj;
            if (Intrinsics.areEqual(autoEarnStateResp != null ? autoEarnStateResp.getStatus() : null, "OPENED")) {
                interfaceC41775x1M91104d = C41696j.m91104d(ViewModelKt.getViewModelScope(autoEarnViewModel), C42911a.m94121c(), null, new AutoEarnViewModel$getAutoEarnState$1$1$1(function1, null), 2, null);
            } else {
                if (Intrinsics.areEqual(autoEarnStateResp != null ? autoEarnStateResp.getStatus() : null, "CLOSED")) {
                    interfaceC41775x1M91104d = C41696j.m91104d(ViewModelKt.getViewModelScope(autoEarnViewModel), C42911a.m94121c(), null, new AutoEarnViewModel$getAutoEarnState$1$1$2(function1, null), 2, null);
                } else {
                    if (Intrinsics.areEqual(autoEarnStateResp != null ? autoEarnStateResp.getStatus() : null, "PARTIALLY_OPENED")) {
                        interfaceC41775x1M91104d = C41696j.m91104d(ViewModelKt.getViewModelScope(autoEarnViewModel), C42911a.m94121c(), null, new AutoEarnViewModel$getAutoEarnState$1$1$3(function2, null), 2, null);
                    } else {
                        interfaceC41775x1M91104d = Intrinsics.areEqual(autoEarnStateResp != null ? autoEarnStateResp.getStatus() : null, "UNAVAILABLE") ? C41696j.m91104d(ViewModelKt.getViewModelScope(autoEarnViewModel), C42911a.m94121c(), null, new AutoEarnViewModel$getAutoEarnState$1$1$4(function3, null), 2, null) : C41696j.m91104d(ViewModelKt.getViewModelScope(autoEarnViewModel), C42911a.m94121c(), null, new AutoEarnViewModel$getAutoEarnState$1$1$5(function4, autoEarnStateResp, null), 2, null);
                    }
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(interfaceC41775x1M91104d);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        AutoEarnViewModel autoEarnViewModel2 = this.this$0;
        Function1<String, Unit> function9 = this.$onError;
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97259c("AutoEarnViewModel", "getAutoEarnState: " + thM103847exceptionOrNullimpl.getMessage());
            C41696j.m91104d(ViewModelKt.getViewModelScope(autoEarnViewModel2), C42911a.m94121c(), null, new AutoEarnViewModel$getAutoEarnState$1$2$1(function9, thM103847exceptionOrNullimpl, null), 2, null);
        }
        return Unit.INSTANCE;
    }
}
