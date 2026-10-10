package com.kubi.assets.autoearn;

import androidx.lifecycle.ViewModelKt;
import com.kubi.assets.autoearn.data.AutoEarnOpenRequest;
import com.kubi.assets.autoearn.data.AutoEarnOpenResp;
import com.kubi.assets.autoearn.data.SwitchCurrency;
import com.sensorsdata.abtest.entity.AppConstants;
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
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;
import p852kotlin.text.StringsKt;
import ro.C44128b;

/* JADX INFO: compiled from: AutoEarnViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.autoearn.AutoEarnViewModel$openAutoEarn$2", m90122f = "AutoEarnViewModel.kt", m90123i = {0, 0, 0, 1, 1, 1}, m90124l = {108, 119}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-AutoEarnViewModel$openAutoEarn$2$1", "$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-AutoEarnViewModel$openAutoEarn$2$1"}, m90127s = {"L$0", "L$3", "I$0", "L$0", "L$3", "I$0"})
public final class AutoEarnViewModel$openAutoEarn$2 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currency;
    final /* synthetic */ Function2<Boolean, String, Unit> $onResult;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ AutoEarnViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AutoEarnViewModel$openAutoEarn$2(String str, AutoEarnViewModel autoEarnViewModel, Function2<? super Boolean, ? super String, Unit> function2, Continuation<? super AutoEarnViewModel$openAutoEarn$2> continuation) {
        super(2, continuation);
        this.$currency = str;
        this.this$0 = autoEarnViewModel;
        this.$onResult = function2;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AutoEarnViewModel$openAutoEarn$2 autoEarnViewModel$openAutoEarn$2 = new AutoEarnViewModel$openAutoEarn$2(this.$currency, this.this$0, this.$onResult, continuation);
        autoEarnViewModel$openAutoEarn$2.L$0 = obj;
        return autoEarnViewModel$openAutoEarn$2;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AutoEarnViewModel$openAutoEarn$2) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0086 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0021, B:37:0x00e0, B:39:0x00e4, B:41:0x00ea, B:43:0x00f0, B:45:0x011b, B:44:0x0105, B:14:0x003e, B:25:0x0082, B:27:0x0086, B:29:0x008c, B:31:0x0092, B:32:0x00a8, B:17:0x004b, B:19:0x0050, B:21:0x0057, B:33:0x00bf), top: B:53:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:28:0x008b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0092 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0021, B:37:0x00e0, B:39:0x00e4, B:41:0x00ea, B:43:0x00f0, B:45:0x011b, B:44:0x0105, B:14:0x003e, B:25:0x0082, B:27:0x0086, B:29:0x008c, B:31:0x0092, B:32:0x00a8, B:17:0x004b, B:19:0x0050, B:21:0x0057, B:33:0x00bf), top: B:53:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00a8 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0021, B:37:0x00e0, B:39:0x00e4, B:41:0x00ea, B:43:0x00f0, B:45:0x011b, B:44:0x0105, B:14:0x003e, B:25:0x0082, B:27:0x0086, B:29:0x008c, B:31:0x0092, B:32:0x00a8, B:17:0x004b, B:19:0x0050, B:21:0x0057, B:33:0x00bf), top: B:53:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:39:0x00e4 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0021, B:37:0x00e0, B:39:0x00e4, B:41:0x00ea, B:43:0x00f0, B:45:0x011b, B:44:0x0105, B:14:0x003e, B:25:0x0082, B:27:0x0086, B:29:0x008c, B:31:0x0092, B:32:0x00a8, B:17:0x004b, B:19:0x0050, B:21:0x0057, B:33:0x00bf), top: B:53:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00f0 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0021, B:37:0x00e0, B:39:0x00e4, B:41:0x00ea, B:43:0x00f0, B:45:0x011b, B:44:0x0105, B:14:0x003e, B:25:0x0082, B:27:0x0086, B:29:0x008c, B:31:0x0092, B:32:0x00a8, B:17:0x004b, B:19:0x0050, B:21:0x0057, B:33:0x00bf), top: B:53:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0105 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:7:0x0021, B:37:0x00e0, B:39:0x00e4, B:41:0x00ea, B:43:0x00f0, B:45:0x011b, B:44:0x0105, B:14:0x003e, B:25:0x0082, B:27:0x0086, B:29:0x008c, B:31:0x0092, B:32:0x00a8, B:17:0x004b, B:19:0x0050, B:21:0x0057, B:33:0x00bf), top: B:53:0x000f }] */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        AutoEarnViewModel autoEarnViewModel;
        Function2<Boolean, String, Unit> function2;
        AutoEarnViewModel autoEarnViewModel2;
        Function2<Boolean, String, Unit> function3;
        AutoEarnOpenResp autoEarnOpenResp;
        String status;
        InterfaceC41775x1 interfaceC41775x1M91104d;
        AutoEarnOpenResp autoEarnOpenResp2;
        String status2;
        InterfaceC41709m0 interfaceC41709m0 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i11 = this.label;
        try {
            if (i11 == 0) {
                ResultKt.throwOnFailure(obj);
                String str = this.$currency;
                AutoEarnViewModel autoEarnViewModel3 = this.this$0;
                Function2<Boolean, String, Unit> function4 = this.$onResult;
                Result.Companion companion = Result.INSTANCE;
                if (str == null || true != (!StringsKt.isBlank(str))) {
                    AutoEarnApi autoEarnApi = autoEarnViewModel3.f16573X;
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$1 = autoEarnViewModel3;
                    this.L$2 = function4;
                    this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.I$0 = 0;
                    this.label = 2;
                    obj = AutoEarnApi.m15430b(autoEarnApi, null, this, 1, null);
                    if (obj != coroutine_suspended) {
                        autoEarnViewModel = autoEarnViewModel3;
                        function2 = function4;
                        autoEarnOpenResp2 = (AutoEarnOpenResp) obj;
                        if (autoEarnOpenResp2 != null) {
                            status2 = autoEarnOpenResp2.getStatus();
                        } else {
                            status2 = null;
                        }
                        if (Intrinsics.areEqual(status2, AppConstants.AB_TEST_SUCCESS)) {
                            interfaceC41775x1M91104d = C41696j.m91104d(ViewModelKt.getViewModelScope(autoEarnViewModel), C42911a.m94121c(), null, new AutoEarnViewModel$openAutoEarn$2$1$3(function2, null), 2, null);
                        } else {
                            interfaceC41775x1M91104d = C41696j.m91104d(ViewModelKt.getViewModelScope(autoEarnViewModel), C42911a.m94121c(), null, new AutoEarnViewModel$openAutoEarn$2$1$4(function2, autoEarnOpenResp2, null), 2, null);
                        }
                    }
                } else {
                    AutoEarnApi autoEarnApi2 = autoEarnViewModel3.f16573X;
                    AutoEarnOpenRequest autoEarnOpenRequest = new AutoEarnOpenRequest(new SwitchCurrency(str, 1));
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$1 = autoEarnViewModel3;
                    this.L$2 = function4;
                    this.L$3 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.I$0 = 0;
                    this.label = 1;
                    obj = autoEarnApi2.m15435d(autoEarnOpenRequest, this);
                    if (obj != coroutine_suspended) {
                        autoEarnViewModel2 = autoEarnViewModel3;
                        function3 = function4;
                        autoEarnOpenResp = (AutoEarnOpenResp) obj;
                        if (autoEarnOpenResp != null) {
                            status = autoEarnOpenResp.getStatus();
                        } else {
                            status = null;
                        }
                        if (Intrinsics.areEqual(status, AppConstants.AB_TEST_SUCCESS)) {
                            interfaceC41775x1M91104d = C41696j.m91104d(ViewModelKt.getViewModelScope(autoEarnViewModel2), C42911a.m94121c(), null, new AutoEarnViewModel$openAutoEarn$2$1$1(function3, null), 2, null);
                        } else {
                            interfaceC41775x1M91104d = C41696j.m91104d(ViewModelKt.getViewModelScope(autoEarnViewModel2), C42911a.m94121c(), null, new AutoEarnViewModel$openAutoEarn$2$1$2(function3, autoEarnOpenResp, null), 2, null);
                        }
                    }
                }
                return coroutine_suspended;
            }
            if (i11 == 1) {
                function3 = (Function2) this.L$2;
                autoEarnViewModel2 = (AutoEarnViewModel) this.L$1;
                ResultKt.throwOnFailure(obj);
                autoEarnOpenResp = (AutoEarnOpenResp) obj;
                if (autoEarnOpenResp != null) {
                    status = autoEarnOpenResp.getStatus();
                } else {
                    status = null;
                }
                if (Intrinsics.areEqual(status, AppConstants.AB_TEST_SUCCESS)) {
                    interfaceC41775x1M91104d = C41696j.m91104d(ViewModelKt.getViewModelScope(autoEarnViewModel2), C42911a.m94121c(), null, new AutoEarnViewModel$openAutoEarn$2$1$1(function3, null), 2, null);
                } else {
                    interfaceC41775x1M91104d = C41696j.m91104d(ViewModelKt.getViewModelScope(autoEarnViewModel2), C42911a.m94121c(), null, new AutoEarnViewModel$openAutoEarn$2$1$2(function3, autoEarnOpenResp, null), 2, null);
                }
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                function2 = (Function2) this.L$2;
                autoEarnViewModel = (AutoEarnViewModel) this.L$1;
                ResultKt.throwOnFailure(obj);
                autoEarnOpenResp2 = (AutoEarnOpenResp) obj;
                if (autoEarnOpenResp2 != null) {
                    status2 = autoEarnOpenResp2.getStatus();
                } else {
                    status2 = null;
                }
                if (Intrinsics.areEqual(status2, AppConstants.AB_TEST_SUCCESS)) {
                    interfaceC41775x1M91104d = C41696j.m91104d(ViewModelKt.getViewModelScope(autoEarnViewModel), C42911a.m94121c(), null, new AutoEarnViewModel$openAutoEarn$2$1$3(function2, null), 2, null);
                } else {
                    interfaceC41775x1M91104d = C41696j.m91104d(ViewModelKt.getViewModelScope(autoEarnViewModel), C42911a.m94121c(), null, new AutoEarnViewModel$openAutoEarn$2$1$4(function2, autoEarnOpenResp2, null), 2, null);
                }
            }
            objM103844constructorimpl = Result.m103844constructorimpl(interfaceC41775x1M91104d);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        AutoEarnViewModel autoEarnViewModel4 = this.this$0;
        Function2<Boolean, String, Unit> function5 = this.$onResult;
        Throwable thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
        if (thM103847exceptionOrNullimpl != null) {
            C44128b.m97259c("AutoEarnViewModel", "switchAutoEarn: " + thM103847exceptionOrNullimpl.getMessage());
            C41696j.m91104d(ViewModelKt.getViewModelScope(autoEarnViewModel4), C42911a.m94121c(), null, new AutoEarnViewModel$openAutoEarn$2$2$1(function5, thM103847exceptionOrNullimpl, null), 2, null);
        }
        return Unit.INSTANCE;
    }
}
