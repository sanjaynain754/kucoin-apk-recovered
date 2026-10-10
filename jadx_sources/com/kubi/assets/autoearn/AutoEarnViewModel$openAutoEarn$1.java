package com.kubi.assets.autoearn;

import com.kubi.assets.autoearn.data.AutoEarnOpenRequest;
import com.kubi.assets.autoearn.data.AutoEarnOpenResp;
import com.kubi.assets.autoearn.data.SwitchCurrency;
import com.kubi.utils.extensions.C27041f;
import com.sensorsdata.abtest.entity.AppConstants;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41668m;
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
@DebugMetadata(m90121c = "com.kubi.assets.autoearn.AutoEarnViewModel$openAutoEarn$1", m90122f = "AutoEarnViewModel.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6}, m90124l = {71, 77, 79, 82, 84, 86, 91}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-AutoEarnViewModel$openAutoEarn$1$1", "$this$launch", "$this$invokeSuspend_u24lambda_u240", "resp", "$i$a$-runCatching-AutoEarnViewModel$openAutoEarn$1$1", "$this$launch", "$this$invokeSuspend_u24lambda_u240", "resp", "$i$a$-runCatching-AutoEarnViewModel$openAutoEarn$1$1", "$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-AutoEarnViewModel$openAutoEarn$1$1", "$this$launch", "$this$invokeSuspend_u24lambda_u240", "resp", "$i$a$-runCatching-AutoEarnViewModel$openAutoEarn$1$1", "$this$launch", "$this$invokeSuspend_u24lambda_u240", "resp", "$i$a$-runCatching-AutoEarnViewModel$openAutoEarn$1$1", "$this$launch", "it", "$i$a$-onFailure-AutoEarnViewModel$openAutoEarn$1$2"}, m90127s = {"L$0", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$2", "I$0"})
public final class AutoEarnViewModel$openAutoEarn$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $currency;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ AutoEarnViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AutoEarnViewModel$openAutoEarn$1(String str, AutoEarnViewModel autoEarnViewModel, Continuation<? super AutoEarnViewModel$openAutoEarn$1> continuation) {
        super(2, continuation);
        this.$currency = str;
        this.this$0 = autoEarnViewModel;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        AutoEarnViewModel$openAutoEarn$1 autoEarnViewModel$openAutoEarn$1 = new AutoEarnViewModel$openAutoEarn$1(this.$currency, this.this$0, continuation);
        autoEarnViewModel$openAutoEarn$1.L$0 = obj;
        return autoEarnViewModel$openAutoEarn$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((AutoEarnViewModel$openAutoEarn$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ab A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:8:0x002a, B:64:0x0193, B:14:0x0045, B:49:0x012e, B:51:0x0132, B:53:0x0138, B:55:0x013e, B:58:0x0166, B:60:0x016e, B:61:0x0172, B:19:0x0066, B:30:0x00a7, B:32:0x00ab, B:34:0x00b1, B:36:0x00b7, B:39:0x00df, B:41:0x00e7, B:42:0x00eb, B:22:0x0071, B:24:0x0076, B:26:0x007d, B:45:0x010d), top: B:74:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b7 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:8:0x002a, B:64:0x0193, B:14:0x0045, B:49:0x012e, B:51:0x0132, B:53:0x0138, B:55:0x013e, B:58:0x0166, B:60:0x016e, B:61:0x0172, B:19:0x0066, B:30:0x00a7, B:32:0x00ab, B:34:0x00b1, B:36:0x00b7, B:39:0x00df, B:41:0x00e7, B:42:0x00eb, B:22:0x0071, B:24:0x0076, B:26:0x007d, B:45:0x010d), top: B:74:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:39:0x00df A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:8:0x002a, B:64:0x0193, B:14:0x0045, B:49:0x012e, B:51:0x0132, B:53:0x0138, B:55:0x013e, B:58:0x0166, B:60:0x016e, B:61:0x0172, B:19:0x0066, B:30:0x00a7, B:32:0x00ab, B:34:0x00b1, B:36:0x00b7, B:39:0x00df, B:41:0x00e7, B:42:0x00eb, B:22:0x0071, B:24:0x0076, B:26:0x007d, B:45:0x010d), top: B:74:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e7 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:8:0x002a, B:64:0x0193, B:14:0x0045, B:49:0x012e, B:51:0x0132, B:53:0x0138, B:55:0x013e, B:58:0x0166, B:60:0x016e, B:61:0x0172, B:19:0x0066, B:30:0x00a7, B:32:0x00ab, B:34:0x00b1, B:36:0x00b7, B:39:0x00df, B:41:0x00e7, B:42:0x00eb, B:22:0x0071, B:24:0x0076, B:26:0x007d, B:45:0x010d), top: B:74:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:44:0x010b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0132 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:8:0x002a, B:64:0x0193, B:14:0x0045, B:49:0x012e, B:51:0x0132, B:53:0x0138, B:55:0x013e, B:58:0x0166, B:60:0x016e, B:61:0x0172, B:19:0x0066, B:30:0x00a7, B:32:0x00ab, B:34:0x00b1, B:36:0x00b7, B:39:0x00df, B:41:0x00e7, B:42:0x00eb, B:22:0x0071, B:24:0x0076, B:26:0x007d, B:45:0x010d), top: B:74:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0137  */
    /* JADX WARN: Code duplicated, block: B:55:0x013e A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:8:0x002a, B:64:0x0193, B:14:0x0045, B:49:0x012e, B:51:0x0132, B:53:0x0138, B:55:0x013e, B:58:0x0166, B:60:0x016e, B:61:0x0172, B:19:0x0066, B:30:0x00a7, B:32:0x00ab, B:34:0x00b1, B:36:0x00b7, B:39:0x00df, B:41:0x00e7, B:42:0x00eb, B:22:0x0071, B:24:0x0076, B:26:0x007d, B:45:0x010d), top: B:74:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:57:0x0164  */
    /* JADX WARN: Code duplicated, block: B:58:0x0166 A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:8:0x002a, B:64:0x0193, B:14:0x0045, B:49:0x012e, B:51:0x0132, B:53:0x0138, B:55:0x013e, B:58:0x0166, B:60:0x016e, B:61:0x0172, B:19:0x0066, B:30:0x00a7, B:32:0x00ab, B:34:0x00b1, B:36:0x00b7, B:39:0x00df, B:41:0x00e7, B:42:0x00eb, B:22:0x0071, B:24:0x0076, B:26:0x007d, B:45:0x010d), top: B:74:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:60:0x016e A[Catch: all -> 0x002f, TryCatch #0 {all -> 0x002f, blocks: (B:8:0x002a, B:64:0x0193, B:14:0x0045, B:49:0x012e, B:51:0x0132, B:53:0x0138, B:55:0x013e, B:58:0x0166, B:60:0x016e, B:61:0x0172, B:19:0x0066, B:30:0x00a7, B:32:0x00ab, B:34:0x00b1, B:36:0x00b7, B:39:0x00df, B:41:0x00e7, B:42:0x00eb, B:22:0x0071, B:24:0x0076, B:26:0x007d, B:45:0x010d), top: B:74:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:63:0x0192  */
    /* JADX WARN: Code duplicated, block: B:64:0x0193 A[Catch: all -> 0x002f, TRY_LEAVE, TryCatch #0 {all -> 0x002f, blocks: (B:8:0x002a, B:64:0x0193, B:14:0x0045, B:49:0x012e, B:51:0x0132, B:53:0x0138, B:55:0x013e, B:58:0x0166, B:60:0x016e, B:61:0x0172, B:19:0x0066, B:30:0x00a7, B:32:0x00ab, B:34:0x00b1, B:36:0x00b7, B:39:0x00df, B:41:0x00e7, B:42:0x00eb, B:22:0x0071, B:24:0x0076, B:26:0x007d, B:45:0x010d), top: B:74:0x000e }] */
    /* JADX WARN: Code duplicated, block: B:69:0x01ac  */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01ee, code lost:
    
        if (r2.emit(r5, r10) == r1) goto L71;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:69:0x01ac, please report this as an issue */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        AutoEarnViewModel autoEarnViewModel;
        Throwable thM103847exceptionOrNullimpl;
        AutoEarnViewModel autoEarnViewModel2;
        InterfaceC41709m0 interfaceC41709m0;
        int i11;
        InterfaceC41709m0 interfaceC41709m1;
        int i12;
        AutoEarnOpenResp autoEarnOpenResp;
        String status;
        InterfaceC41668m interfaceC41668m;
        AbstractC9516f.c cVar;
        InterfaceC41668m interfaceC41668m2;
        AbstractC9516f.d dVar;
        AutoEarnOpenResp autoEarnOpenResp2;
        String status2;
        InterfaceC41668m interfaceC41668m3;
        AbstractC9516f.c cVar2;
        InterfaceC41668m interfaceC41668m4;
        AbstractC9516f.d dVar2;
        InterfaceC41709m0 interfaceC41709m2 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
            switch (this.label) {
                case 0:
                    ResultKt.throwOnFailure(obj);
                    String str = this.$currency;
                    autoEarnViewModel2 = this.this$0;
                    Result.Companion companion = Result.INSTANCE;
                    if (str == null || true != (!StringsKt.isBlank(str))) {
                        AutoEarnApi autoEarnApi = autoEarnViewModel2.f16573X;
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                        this.L$1 = autoEarnViewModel2;
                        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                        this.I$0 = 0;
                        this.label = 4;
                        obj = AutoEarnApi.m15430b(autoEarnApi, null, this, 1, null);
                        if (obj != coroutine_suspended) {
                            interfaceC41709m0 = interfaceC41709m2;
                            i11 = 0;
                            autoEarnOpenResp2 = (AutoEarnOpenResp) obj;
                            if (autoEarnOpenResp2 != null) {
                                status2 = autoEarnOpenResp2.getStatus();
                            } else {
                                status2 = null;
                            }
                            if (Intrinsics.areEqual(status2, AppConstants.AB_TEST_SUCCESS)) {
                                interfaceC41668m4 = autoEarnViewModel2.f16571V;
                                dVar2 = new AbstractC9516f.d();
                                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                                this.L$2 = SpillingKt.nullOutSpilledVariable(autoEarnOpenResp2);
                                this.I$0 = i11;
                                this.label = 5;
                                if (interfaceC41668m4.emit(dVar2, this) == coroutine_suspended) {
                                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                                    autoEarnViewModel = this.this$0;
                                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                                    if (thM103847exceptionOrNullimpl != null) {
                                        C44128b.m97259c("AutoEarnViewModel", "switchAutoEarn: " + thM103847exceptionOrNullimpl.getMessage());
                                        InterfaceC41668m interfaceC41668m5 = autoEarnViewModel.f16571V;
                                        AbstractC9516f.c cVar3 = new AbstractC9516f.c(C27041f.m66668h(thM103847exceptionOrNullimpl.getMessage()));
                                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                                        this.L$1 = objM103844constructorimpl;
                                        this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                                        this.I$0 = 0;
                                        this.label = 7;
                                        break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            } else {
                                interfaceC41668m3 = autoEarnViewModel2.f16571V;
                                cVar2 = new AbstractC9516f.c(autoEarnOpenResp2 != null ? autoEarnOpenResp2.getStatus() : null);
                                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                                this.L$2 = SpillingKt.nullOutSpilledVariable(autoEarnOpenResp2);
                                this.I$0 = i11;
                                this.label = 6;
                                if (interfaceC41668m3.emit(cVar2, this) == coroutine_suspended) {
                                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                                    autoEarnViewModel = this.this$0;
                                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                                    if (thM103847exceptionOrNullimpl != null) {
                                        C44128b.m97259c("AutoEarnViewModel", "switchAutoEarn: " + thM103847exceptionOrNullimpl.getMessage());
                                        InterfaceC41668m interfaceC41668m6 = autoEarnViewModel.f16571V;
                                        AbstractC9516f.c cVar4 = new AbstractC9516f.c(C27041f.m66668h(thM103847exceptionOrNullimpl.getMessage()));
                                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                                        this.L$1 = objM103844constructorimpl;
                                        this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                                        this.I$0 = 0;
                                        this.label = 7;
                                        break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    } else {
                        AutoEarnApi autoEarnApi2 = autoEarnViewModel2.f16573X;
                        AutoEarnOpenRequest autoEarnOpenRequest = new AutoEarnOpenRequest(new SwitchCurrency(str, 1));
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                        this.L$1 = autoEarnViewModel2;
                        this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                        this.I$0 = 0;
                        this.label = 1;
                        obj = autoEarnApi2.m15435d(autoEarnOpenRequest, this);
                        if (obj != coroutine_suspended) {
                            interfaceC41709m1 = interfaceC41709m2;
                            i12 = 0;
                            autoEarnOpenResp = (AutoEarnOpenResp) obj;
                            if (autoEarnOpenResp != null) {
                                status = autoEarnOpenResp.getStatus();
                            } else {
                                status = null;
                            }
                            if (Intrinsics.areEqual(status, AppConstants.AB_TEST_SUCCESS)) {
                                interfaceC41668m2 = autoEarnViewModel2.f16571V;
                                dVar = new AbstractC9516f.d();
                                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                                this.L$2 = SpillingKt.nullOutSpilledVariable(autoEarnOpenResp);
                                this.I$0 = i12;
                                this.label = 2;
                                if (interfaceC41668m2.emit(dVar, this) == coroutine_suspended) {
                                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                                    autoEarnViewModel = this.this$0;
                                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                                    if (thM103847exceptionOrNullimpl != null) {
                                        C44128b.m97259c("AutoEarnViewModel", "switchAutoEarn: " + thM103847exceptionOrNullimpl.getMessage());
                                        InterfaceC41668m interfaceC41668m7 = autoEarnViewModel.f16571V;
                                        AbstractC9516f.c cVar5 = new AbstractC9516f.c(C27041f.m66668h(thM103847exceptionOrNullimpl.getMessage()));
                                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                                        this.L$1 = objM103844constructorimpl;
                                        this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                                        this.I$0 = 0;
                                        this.label = 7;
                                        break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            } else {
                                interfaceC41668m = autoEarnViewModel2.f16571V;
                                cVar = new AbstractC9516f.c(autoEarnOpenResp != null ? autoEarnOpenResp.getStatus() : null);
                                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                                this.L$2 = SpillingKt.nullOutSpilledVariable(autoEarnOpenResp);
                                this.I$0 = i12;
                                this.label = 3;
                                if (interfaceC41668m.emit(cVar, this) == coroutine_suspended) {
                                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                                    autoEarnViewModel = this.this$0;
                                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                                    if (thM103847exceptionOrNullimpl != null) {
                                        C44128b.m97259c("AutoEarnViewModel", "switchAutoEarn: " + thM103847exceptionOrNullimpl.getMessage());
                                        InterfaceC41668m interfaceC41668m8 = autoEarnViewModel.f16571V;
                                        AbstractC9516f.c cVar6 = new AbstractC9516f.c(C27041f.m66668h(thM103847exceptionOrNullimpl.getMessage()));
                                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                                        this.L$1 = objM103844constructorimpl;
                                        this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                                        this.I$0 = 0;
                                        this.label = 7;
                                        break;
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        }
                    }
                    return coroutine_suspended;
                case 1:
                    i12 = this.I$0;
                    interfaceC41709m1 = (InterfaceC41709m0) this.L$2;
                    autoEarnViewModel2 = (AutoEarnViewModel) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    autoEarnOpenResp = (AutoEarnOpenResp) obj;
                    if (autoEarnOpenResp != null) {
                        status = autoEarnOpenResp.getStatus();
                    } else {
                        status = null;
                    }
                    if (Intrinsics.areEqual(status, AppConstants.AB_TEST_SUCCESS)) {
                        interfaceC41668m2 = autoEarnViewModel2.f16571V;
                        dVar = new AbstractC9516f.d();
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(autoEarnOpenResp);
                        this.I$0 = i12;
                        this.label = 2;
                        if (interfaceC41668m2.emit(dVar, this) == coroutine_suspended) {
                            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                            autoEarnViewModel = this.this$0;
                            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                            if (thM103847exceptionOrNullimpl != null) {
                                C44128b.m97259c("AutoEarnViewModel", "switchAutoEarn: " + thM103847exceptionOrNullimpl.getMessage());
                                InterfaceC41668m interfaceC41668m9 = autoEarnViewModel.f16571V;
                                AbstractC9516f.c cVar7 = new AbstractC9516f.c(C27041f.m66668h(thM103847exceptionOrNullimpl.getMessage()));
                                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                                this.L$1 = objM103844constructorimpl;
                                this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                                this.I$0 = 0;
                                this.label = 7;
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        interfaceC41668m = autoEarnViewModel2.f16571V;
                        cVar = new AbstractC9516f.c(autoEarnOpenResp != null ? autoEarnOpenResp.getStatus() : null);
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(autoEarnOpenResp);
                        this.I$0 = i12;
                        this.label = 3;
                        if (interfaceC41668m.emit(cVar, this) == coroutine_suspended) {
                            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                            autoEarnViewModel = this.this$0;
                            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                            if (thM103847exceptionOrNullimpl != null) {
                                C44128b.m97259c("AutoEarnViewModel", "switchAutoEarn: " + thM103847exceptionOrNullimpl.getMessage());
                                InterfaceC41668m interfaceC41668m10 = autoEarnViewModel.f16571V;
                                AbstractC9516f.c cVar8 = new AbstractC9516f.c(C27041f.m66668h(thM103847exceptionOrNullimpl.getMessage()));
                                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                                this.L$1 = objM103844constructorimpl;
                                this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                                this.I$0 = 0;
                                this.label = 7;
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    return coroutine_suspended;
                case 2:
                    ResultKt.throwOnFailure(obj);
                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                    autoEarnViewModel = this.this$0;
                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                    if (thM103847exceptionOrNullimpl != null) {
                        C44128b.m97259c("AutoEarnViewModel", "switchAutoEarn: " + thM103847exceptionOrNullimpl.getMessage());
                        InterfaceC41668m interfaceC41668m11 = autoEarnViewModel.f16571V;
                        AbstractC9516f.c cVar9 = new AbstractC9516f.c(C27041f.m66668h(thM103847exceptionOrNullimpl.getMessage()));
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                        this.L$1 = objM103844constructorimpl;
                        this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                        this.I$0 = 0;
                        this.label = 7;
                        break;
                    }
                    return Unit.INSTANCE;
                case 3:
                    ResultKt.throwOnFailure(obj);
                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                    autoEarnViewModel = this.this$0;
                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                    if (thM103847exceptionOrNullimpl != null) {
                        C44128b.m97259c("AutoEarnViewModel", "switchAutoEarn: " + thM103847exceptionOrNullimpl.getMessage());
                        InterfaceC41668m interfaceC41668m12 = autoEarnViewModel.f16571V;
                        AbstractC9516f.c cVar10 = new AbstractC9516f.c(C27041f.m66668h(thM103847exceptionOrNullimpl.getMessage()));
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                        this.L$1 = objM103844constructorimpl;
                        this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                        this.I$0 = 0;
                        this.label = 7;
                        break;
                    }
                    return Unit.INSTANCE;
                case 4:
                    i11 = this.I$0;
                    interfaceC41709m0 = (InterfaceC41709m0) this.L$2;
                    autoEarnViewModel2 = (AutoEarnViewModel) this.L$1;
                    ResultKt.throwOnFailure(obj);
                    autoEarnOpenResp2 = (AutoEarnOpenResp) obj;
                    if (autoEarnOpenResp2 != null) {
                        status2 = autoEarnOpenResp2.getStatus();
                    } else {
                        status2 = null;
                    }
                    if (Intrinsics.areEqual(status2, AppConstants.AB_TEST_SUCCESS)) {
                        interfaceC41668m4 = autoEarnViewModel2.f16571V;
                        dVar2 = new AbstractC9516f.d();
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(autoEarnOpenResp2);
                        this.I$0 = i11;
                        this.label = 5;
                        if (interfaceC41668m4.emit(dVar2, this) == coroutine_suspended) {
                            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                            autoEarnViewModel = this.this$0;
                            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                            if (thM103847exceptionOrNullimpl != null) {
                                C44128b.m97259c("AutoEarnViewModel", "switchAutoEarn: " + thM103847exceptionOrNullimpl.getMessage());
                                InterfaceC41668m interfaceC41668m13 = autoEarnViewModel.f16571V;
                                AbstractC9516f.c cVar11 = new AbstractC9516f.c(C27041f.m66668h(thM103847exceptionOrNullimpl.getMessage()));
                                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                                this.L$1 = objM103844constructorimpl;
                                this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                                this.I$0 = 0;
                                this.label = 7;
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                    } else {
                        interfaceC41668m3 = autoEarnViewModel2.f16571V;
                        cVar2 = new AbstractC9516f.c(autoEarnOpenResp2 != null ? autoEarnOpenResp2.getStatus() : null);
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                        this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                        this.L$2 = SpillingKt.nullOutSpilledVariable(autoEarnOpenResp2);
                        this.I$0 = i11;
                        this.label = 6;
                        if (interfaceC41668m3.emit(cVar2, this) == coroutine_suspended) {
                            objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                            autoEarnViewModel = this.this$0;
                            thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                            if (thM103847exceptionOrNullimpl != null) {
                                C44128b.m97259c("AutoEarnViewModel", "switchAutoEarn: " + thM103847exceptionOrNullimpl.getMessage());
                                InterfaceC41668m interfaceC41668m14 = autoEarnViewModel.f16571V;
                                AbstractC9516f.c cVar12 = new AbstractC9516f.c(C27041f.m66668h(thM103847exceptionOrNullimpl.getMessage()));
                                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                                this.L$1 = objM103844constructorimpl;
                                this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                                this.I$0 = 0;
                                this.label = 7;
                                break;
                            }
                            return Unit.INSTANCE;
                        }
                    }
                    return coroutine_suspended;
                case 5:
                    ResultKt.throwOnFailure(obj);
                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                    autoEarnViewModel = this.this$0;
                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                    if (thM103847exceptionOrNullimpl != null) {
                        C44128b.m97259c("AutoEarnViewModel", "switchAutoEarn: " + thM103847exceptionOrNullimpl.getMessage());
                        InterfaceC41668m interfaceC41668m15 = autoEarnViewModel.f16571V;
                        AbstractC9516f.c cVar13 = new AbstractC9516f.c(C27041f.m66668h(thM103847exceptionOrNullimpl.getMessage()));
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                        this.L$1 = objM103844constructorimpl;
                        this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                        this.I$0 = 0;
                        this.label = 7;
                        break;
                    }
                    return Unit.INSTANCE;
                case 6:
                    ResultKt.throwOnFailure(obj);
                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                    autoEarnViewModel = this.this$0;
                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                    if (thM103847exceptionOrNullimpl != null) {
                        C44128b.m97259c("AutoEarnViewModel", "switchAutoEarn: " + thM103847exceptionOrNullimpl.getMessage());
                        InterfaceC41668m interfaceC41668m16 = autoEarnViewModel.f16571V;
                        AbstractC9516f.c cVar14 = new AbstractC9516f.c(C27041f.m66668h(thM103847exceptionOrNullimpl.getMessage()));
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m2);
                        this.L$1 = objM103844constructorimpl;
                        this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                        this.I$0 = 0;
                        this.label = 7;
                        break;
                    }
                    return Unit.INSTANCE;
                case 7:
                    ResultKt.throwOnFailure(obj);
                    return Unit.INSTANCE;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
    }
}
