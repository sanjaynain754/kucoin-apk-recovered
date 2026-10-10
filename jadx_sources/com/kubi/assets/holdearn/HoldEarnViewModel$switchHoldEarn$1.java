package com.kubi.assets.holdearn;

import com.kubi.assets.R$string;
import com.kubi.assets.bill.AccountBillApi;
import com.kubi.sdk.base.entity.BaseEntity;
import com.kubi.utils.C27017c;
import com.sensorsdata.abtest.entity.AppConstants;
import java.util.HashMap;
import kotlinx.coroutines.InterfaceC41709m0;
import kotlinx.coroutines.flow.InterfaceC41668m;
import p852kotlin.Metadata;
import p852kotlin.Result;
import p852kotlin.ResultKt;
import p852kotlin.TuplesKt;
import p852kotlin.Unit;
import p852kotlin.collections.MapsKt;
import p852kotlin.coroutines.Continuation;
import p852kotlin.coroutines.intrinsics.IntrinsicsKt;
import p852kotlin.coroutines.jvm.internal.Boxing;
import p852kotlin.coroutines.jvm.internal.DebugMetadata;
import p852kotlin.coroutines.jvm.internal.SpillingKt;
import p852kotlin.coroutines.jvm.internal.SuspendLambda;
import p852kotlin.jvm.functions.Function2;
import p852kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: HoldEarnViewModel.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m90083d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m90084d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m90085k = 3, m90086mv = {2, 2, 0}, m90088xi = 48)
@DebugMetadata(m90121c = "com.kubi.assets.holdearn.HoldEarnViewModel$switchHoldEarn$1", m90122f = "HoldEarnViewModel.kt", m90123i = {0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3}, m90124l = {31, 33, 35, 38}, m90125m = "invokeSuspend", m90126n = {"$this$launch", "$this$invokeSuspend_u24lambda_u240", "$i$a$-runCatching-HoldEarnViewModel$switchHoldEarn$1$1", "$this$launch", "$this$invokeSuspend_u24lambda_u240", "resp", "$i$a$-runCatching-HoldEarnViewModel$switchHoldEarn$1$1", "$this$launch", "$this$invokeSuspend_u24lambda_u240", "resp", "$i$a$-runCatching-HoldEarnViewModel$switchHoldEarn$1$1", "$this$launch", "e", "$i$a$-onFailure-HoldEarnViewModel$switchHoldEarn$1$2"}, m90127s = {"L$0", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$2", "I$0"})
public final class HoldEarnViewModel$switchHoldEarn$1 extends SuspendLambda implements Function2<InterfaceC41709m0, Continuation<? super Unit>, Object> {
    final /* synthetic */ int $isOpen;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ HoldEarnViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HoldEarnViewModel$switchHoldEarn$1(HoldEarnViewModel holdEarnViewModel, int i11, Continuation<? super HoldEarnViewModel$switchHoldEarn$1> continuation) {
        super(2, continuation);
        this.this$0 = holdEarnViewModel;
        this.$isOpen = i11;
    }

    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        HoldEarnViewModel$switchHoldEarn$1 holdEarnViewModel$switchHoldEarn$1 = new HoldEarnViewModel$switchHoldEarn$1(this.this$0, this.$isOpen, continuation);
        holdEarnViewModel$switchHoldEarn$1.L$0 = obj;
        return holdEarnViewModel$switchHoldEarn$1;
    }

    @Override // p852kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC41709m0 interfaceC41709m0, Continuation<? super Unit> continuation) {
        return ((HoldEarnViewModel$switchHoldEarn$1) create(interfaceC41709m0, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00d1 A[Catch: all -> 0x0037, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x0032, B:39:0x0100, B:18:0x004d, B:25:0x008c, B:27:0x0094, B:29:0x009c, B:31:0x00a2, B:33:0x00aa, B:36:0x00d1, B:21:0x0058), top: B:52:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:39:0x0100 A[Catch: all -> 0x0037, TRY_LEAVE, TryCatch #0 {all -> 0x0037, blocks: (B:12:0x0032, B:39:0x0100, B:18:0x004d, B:25:0x008c, B:27:0x0094, B:29:0x009c, B:31:0x00a2, B:33:0x00aa, B:36:0x00d1, B:21:0x0058), top: B:52:0x000f }] */
    /* JADX WARN: Code duplicated, block: B:44:0x0119  */
    /* JADX WARN: Code duplicated, block: B:46:0x0125  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0148, code lost:
    
        if (r2.emit(r5, r11) == r1) goto L49;
     */
    @Override // p852kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object objM103844constructorimpl;
        HoldEarnViewModel holdEarnViewModel;
        Throwable thM103847exceptionOrNullimpl;
        String message;
        HoldEarnViewModel holdEarnViewModel2;
        InterfaceC41709m0 interfaceC41709m0;
        int i11;
        InterfaceC41668m interfaceC41668m;
        HoldEarnEffect.a aVar;
        InterfaceC41709m0 interfaceC41709m1 = (InterfaceC41709m0) this.L$0;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.label;
        try {
            if (i12 == 0) {
                ResultKt.throwOnFailure(obj);
                holdEarnViewModel2 = this.this$0;
                int i13 = this.$isOpen;
                Result.Companion companion = Result.INSTANCE;
                AccountBillApi accountBillApi = holdEarnViewModel2.f17745V;
                HashMap<String, Object> mapHashMapOf = MapsKt.hashMapOf(TuplesKt.m90091to("is_open", Boxing.boxInt(i13)));
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                this.L$1 = holdEarnViewModel2;
                this.L$2 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                this.I$0 = 0;
                this.label = 1;
                obj = accountBillApi.m15799a(mapHashMapOf, this);
                if (obj != coroutine_suspended) {
                    interfaceC41709m0 = interfaceC41709m1;
                    i11 = 0;
                }
                return coroutine_suspended;
            }
            if (i12 == 1) {
                i11 = this.I$0;
                interfaceC41709m0 = (InterfaceC41709m0) this.L$2;
                holdEarnViewModel2 = (HoldEarnViewModel) this.L$1;
                ResultKt.throwOnFailure(obj);
            } else if (i12 == 2 || i12 == 3) {
                ResultKt.throwOnFailure(obj);
                objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                holdEarnViewModel = this.this$0;
                thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                if (thM103847exceptionOrNullimpl != null) {
                    InterfaceC41668m interfaceC41668m2 = holdEarnViewModel.f17746W;
                    message = thM103847exceptionOrNullimpl.getMessage();
                    if (message == null) {
                        message = C27017c.f54310a.m66516f(R$string.failed, new Object[0]);
                    }
                    HoldEarnEffect.a aVar2 = new HoldEarnEffect.a(message);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                    this.L$1 = objM103844constructorimpl;
                    this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                    this.I$0 = 0;
                    this.label = 4;
                }
            } else {
                if (i12 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
            BaseEntity baseEntity = (BaseEntity) obj;
            if (baseEntity.getSuccess()) {
                HoldEarnSwitchResp holdEarnSwitchResp = (HoldEarnSwitchResp) baseEntity.getData();
                if (Intrinsics.areEqual(holdEarnSwitchResp != null ? holdEarnSwitchResp.getStatus() : null, AppConstants.AB_TEST_SUCCESS)) {
                    InterfaceC41668m interfaceC41668m3 = holdEarnViewModel2.f17746W;
                    HoldEarnEffect.b bVar = new HoldEarnEffect.b();
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(baseEntity);
                    this.I$0 = i11;
                    this.label = 2;
                    if (interfaceC41668m3.emit(bVar, this) != coroutine_suspended) {
                        objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                        holdEarnViewModel = this.this$0;
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                        if (thM103847exceptionOrNullimpl != null) {
                            InterfaceC41668m interfaceC41668m4 = holdEarnViewModel.f17746W;
                            message = thM103847exceptionOrNullimpl.getMessage();
                            if (message == null) {
                                message = C27017c.f54310a.m66516f(R$string.failed, new Object[0]);
                            }
                            HoldEarnEffect.a aVar3 = new HoldEarnEffect.a(message);
                            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                            this.L$1 = objM103844constructorimpl;
                            this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                            this.I$0 = 0;
                            this.label = 4;
                        }
                        return Unit.INSTANCE;
                    }
                } else {
                    interfaceC41668m = holdEarnViewModel2.f17746W;
                    String msg = baseEntity.getMsg();
                    Intrinsics.checkNotNullExpressionValue(msg, "getMsg(...)");
                    aVar = new HoldEarnEffect.a(msg);
                    this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                    this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                    this.L$2 = SpillingKt.nullOutSpilledVariable(baseEntity);
                    this.I$0 = i11;
                    this.label = 3;
                    if (interfaceC41668m.emit(aVar, this) == coroutine_suspended) {
                        objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                        holdEarnViewModel = this.this$0;
                        thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                        if (thM103847exceptionOrNullimpl != null) {
                            InterfaceC41668m interfaceC41668m5 = holdEarnViewModel.f17746W;
                            message = thM103847exceptionOrNullimpl.getMessage();
                            if (message == null) {
                                message = C27017c.f54310a.m66516f(R$string.failed, new Object[0]);
                            }
                            HoldEarnEffect.a aVar4 = new HoldEarnEffect.a(message);
                            this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                            this.L$1 = objM103844constructorimpl;
                            this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                            this.I$0 = 0;
                            this.label = 4;
                        }
                        return Unit.INSTANCE;
                    }
                }
            } else {
                interfaceC41668m = holdEarnViewModel2.f17746W;
                String msg2 = baseEntity.getMsg();
                Intrinsics.checkNotNullExpressionValue(msg2, "getMsg(...)");
                aVar = new HoldEarnEffect.a(msg2);
                this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                this.L$1 = SpillingKt.nullOutSpilledVariable(interfaceC41709m0);
                this.L$2 = SpillingKt.nullOutSpilledVariable(baseEntity);
                this.I$0 = i11;
                this.label = 3;
                if (interfaceC41668m.emit(aVar, this) == coroutine_suspended) {
                    objM103844constructorimpl = Result.m103844constructorimpl(Unit.INSTANCE);
                    holdEarnViewModel = this.this$0;
                    thM103847exceptionOrNullimpl = Result.m103847exceptionOrNullimpl(objM103844constructorimpl);
                    if (thM103847exceptionOrNullimpl != null) {
                        InterfaceC41668m interfaceC41668m6 = holdEarnViewModel.f17746W;
                        message = thM103847exceptionOrNullimpl.getMessage();
                        if (message == null) {
                            message = C27017c.f54310a.m66516f(R$string.failed, new Object[0]);
                        }
                        HoldEarnEffect.a aVar5 = new HoldEarnEffect.a(message);
                        this.L$0 = SpillingKt.nullOutSpilledVariable(interfaceC41709m1);
                        this.L$1 = objM103844constructorimpl;
                        this.L$2 = SpillingKt.nullOutSpilledVariable(thM103847exceptionOrNullimpl);
                        this.I$0 = 0;
                        this.label = 4;
                    }
                    return Unit.INSTANCE;
                }
            }
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            objM103844constructorimpl = Result.m103844constructorimpl(ResultKt.createFailure(th2));
        }
        return coroutine_suspended;
    }
}
